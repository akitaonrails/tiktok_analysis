package X;

import android.graphics.PointF;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Elg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374140Elg {
    public final Size LIZ;
    public final Size LIZIZ;
    public final EnumC374420Em8 LIZJ;
    public final boolean LIZLLL;
    public final Float LJ;
    public final long LJFF;
    public final PointF LJI;
    public final boolean LJII;

    public C374140Elg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374140Elg)) {
            return false;
        }
        C374140Elg c374140Elg = (C374140Elg) obj;
        return Intrinsics.LJFF(this.LIZ, c374140Elg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c374140Elg.LIZIZ) && this.LIZJ == c374140Elg.LIZJ && this.LIZLLL == c374140Elg.LIZLLL && Intrinsics.LJFF(this.LJ, c374140Elg.LJ) && this.LJFF == c374140Elg.LJFF && Intrinsics.LJFF(this.LJI, c374140Elg.LJI) && this.LJII == c374140Elg.LJII;
    }

    public final int hashCode() {
        Size size = this.LIZ;
        int iHashCode = (size == null ? 0 : size.hashCode()) * 31;
        Size size2 = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (size2 == null ? 0 : size2.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Float f = this.LJ;
        int iHashCode3 = (((iHashCode2 + (f == null ? 0 : f.hashCode())) * 31) + C786410Ut5.Y2(this.LJFF)) * 31;
        PointF pointF = this.LJI;
        return ((iHashCode3 + (pointF != null ? pointF.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutPreviewState(surfaceSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", contrastBtnState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showMagnifySurfaceView=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showProgress=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pickerColor=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pickerPosition=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showColorPicker=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C374140Elg(int i) {
        this(null, null, EnumC374420Em8.GONE, false, null, 0L, null, false);
    }

    public C374140Elg(Size size, Size size2, EnumC374420Em8 enumC374420Em8, boolean z, Float f, long j, PointF pointF, boolean z2) {
        this.LIZ = size;
        this.LIZIZ = size2;
        this.LIZJ = enumC374420Em8;
        this.LIZLLL = z;
        this.LJ = f;
        this.LJFF = j;
        this.LJI = pointF;
        this.LJII = z2;
    }

    public static C374140Elg LIZ(C374140Elg c374140Elg, Size size, Size size2, EnumC374420Em8 enumC374420Em8, boolean z, Float f, long j, PointF pointF, boolean z2, int i) {
        boolean z3 = z2;
        PointF pointF2 = pointF;
        long j2 = j;
        Float f2 = f;
        boolean z4 = z;
        EnumC374420Em8 enumC374420Em82 = enumC374420Em8;
        Size size3 = size2;
        Size size4 = size;
        if ((i & 1) != 0) {
            size4 = c374140Elg.LIZ;
        }
        if ((i & 2) != 0) {
            size3 = c374140Elg.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC374420Em82 = c374140Elg.LIZJ;
        }
        if ((i & 8) != 0) {
            z4 = c374140Elg.LIZLLL;
        }
        if ((i & 16) != 0) {
            f2 = c374140Elg.LJ;
        }
        if ((i & 32) != 0) {
            j2 = c374140Elg.LJFF;
        }
        if ((i & 64) != 0) {
            pointF2 = c374140Elg.LJI;
        }
        if ((i & 128) != 0) {
            z3 = c374140Elg.LJII;
        }
        c374140Elg.getClass();
        return new C374140Elg(size4, size3, enumC374420Em82, z4, f2, j2, pointF2, z3);
    }
}
