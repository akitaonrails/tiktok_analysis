package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Kp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19738512Kp {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C19738512Kp.class.getSimpleName());
        sbLIZ.append(" { [");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(',');
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("] }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19738512Kp(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("top must be less than or equal to bottom, top: ");
            sbLIZ.append(i2);
            sbLIZ.append(", bottom: ");
            sbLIZ.append(i4);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Left must be less than or equal to right, left: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", right: ");
        sbLIZ2.append(i3);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
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
        if (!Intrinsics.LJFF(C19738512Kp.class, cls)) {
            return false;
        }
        C19738512Kp c19738512Kp = (C19738512Kp) obj;
        if (this.LIZ == c19738512Kp.LIZ && this.LIZIZ == c19738512Kp.LIZIZ && this.LIZJ == c19738512Kp.LIZJ && this.LIZLLL == c19738512Kp.LIZLLL) {
            return true;
        }
        return false;
    }
}
