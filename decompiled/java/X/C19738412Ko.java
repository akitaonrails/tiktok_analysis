package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738412Ko {
    public final C19738512Kp LIZ;
    public final C20246014Ju LIZIZ;

    public final Rect LIZ() {
        C19738512Kp c19738512Kp = this.LIZ;
        c19738512Kp.getClass();
        return new Rect(c19738512Kp.LIZ, c19738512Kp.LIZIZ, c19738512Kp.LIZJ, c19738512Kp.LIZLLL);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WindowMetrics( bounds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", windowInsetsCompat=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C19738412Ko.class, cls)) {
            return false;
        }
        C19738412Ko c19738412Ko = (C19738412Ko) obj;
        if (Intrinsics.LJFF(this.LIZ, c19738412Ko.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19738412Ko.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C19738412Ko(Rect rect, C20246014Ju c20246014Ju) {
        this(new C19738512Kp(rect), c20246014Ju);
    }

    public C19738412Ko(C19738512Kp c19738512Kp, C20246014Ju c20246014Ju) {
        this.LIZ = c19738512Kp;
        this.LIZIZ = c20246014Ju;
    }
}
