package X;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENU {
    public final PointF LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENU)) {
            return false;
        }
        C0ENU c0enu = (C0ENU) obj;
        return Intrinsics.LJFF(this.LIZ, c0enu.LIZ) && Float.compare(this.LIZIZ, c0enu.LIZIZ) == 0 && Float.compare(this.LIZJ, c0enu.LIZJ) == 0 && this.LIZLLL == c0enu.LIZLLL && Intrinsics.LJFF(this.LJ, c0enu.LJ) && Intrinsics.LJFF(this.LJFF, c0enu.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskBaseData(centerPoint=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rotate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", feather=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", invert=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resourcePath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ENU() {
        this(new PointF(0.0f, 0.0f), 0.0f, 0.0f, false, "", "");
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public static C0ENU LIZ(C0ENU c0enu, PointF pointF, float f, float f2) {
        boolean z = c0enu.LIZLLL;
        String str = c0enu.LJ;
        String str2 = c0enu.LJFF;
        c0enu.getClass();
        return new C0ENU(pointF, f, f2, z, str, str2);
    }

    public C0ENU(PointF pointF, float f, float f2, boolean z, String str, String str2) {
        this.LIZ = pointF;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
    }
}
