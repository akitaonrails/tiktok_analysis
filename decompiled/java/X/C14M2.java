package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityWindowInfo;

/* JADX INFO: renamed from: X.14M2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14M2 {
    public final Object LIZ;

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        C14M3.LIZ((AccessibilityWindowInfo) this.LIZ, rect);
        sb.append(C14M3.LIZLLL((AccessibilityWindowInfo) this.LIZ));
        sb.append(", type=");
        int iLJII = C14M3.LJII((AccessibilityWindowInfo) this.LIZ);
        sb.append(iLJII != 1 ? iLJII != 2 ? iLJII != 3 ? iLJII != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION");
        sb.append(", layer=");
        sb.append(C14M3.LJ((AccessibilityWindowInfo) this.LIZ));
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(C14M3.LJIIJ((AccessibilityWindowInfo) this.LIZ));
        sb.append(", active=");
        sb.append(C14M3.LJIIIZ((AccessibilityWindowInfo) this.LIZ));
        sb.append(", hasParent=");
        AccessibilityWindowInfo accessibilityWindowInfoLJFF = C14M3.LJFF((AccessibilityWindowInfo) this.LIZ);
        if (accessibilityWindowInfoLJFF != null) {
            new C14M2(accessibilityWindowInfoLJFF);
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(", hasChildren=");
        sb.append(C14M3.LIZJ((AccessibilityWindowInfo) this.LIZ) > 0);
        sb.append(", transitionTime=");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 34 ? C14M4.LIZIZ((AccessibilityWindowInfo) this.LIZ) : 0L);
        sb.append(", locales=");
        sb.append(i >= 34 ? C838510Wuv.LJ(C14M4.LIZ((AccessibilityWindowInfo) this.LIZ)) : C838510Wuv.LIZIZ);
        sb.append(']');
        return sb.toString();
    }

    public C14M2() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.LIZ = C20098013kQ.LIZ();
        } else {
            this.LIZ = null;
        }
    }

    public C14M2(Object obj) {
        this.LIZ = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C14M2)) {
            return false;
        }
        C14M2 c14m2 = (C14M2) obj;
        Object obj2 = this.LIZ;
        if (obj2 == null) {
            if (c14m2.LIZ == null) {
                return true;
            }
            return false;
        }
        return obj2.equals(c14m2.LIZ);
    }
}
