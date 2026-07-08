package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178200glW implements C1BU1 {
    public final String LIZ;
    public final Bitmap LIZIZ;
    public final boolean LIZJ;
    public boolean LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final C1178490glz LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1178200glW() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this((String) null, false, (boolean) (0 == true ? 1 : 0), (String) objArr, (boolean) (0 == true ? 1 : 0), (boolean) (0 == true ? 1 : 0), (int) (0 == true ? 1 : 0), (C1178490glz) objArr2, (String) objArr3, (String) objArr4, 2047);
    }

    @Override // X.C1BU1
    public final Pair<Integer, Integer> LIZIZ() {
        return new Pair<>(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178200glW)) {
            return false;
        }
        C1178200glW c1178200glW = (C1178200glW) obj;
        return Intrinsics.LJFF(this.LIZ, c1178200glW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1178200glW.LIZIZ) && this.LIZJ == c1178200glW.LIZJ && this.LIZLLL == c1178200glW.LIZLLL && Intrinsics.LJFF(this.LJ, c1178200glW.LJ) && this.LJFF == c1178200glW.LJFF && this.LJI == c1178200glW.LJI && this.LJII == c1178200glW.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1178200glW.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1178200glW.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1178200glW.LJIIJ);
    }

    @Override // X.C1BU1
    public final void getSnippet() {
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        int iHashCode2 = (((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        String str = this.LJIIIZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIJ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C1BU1
    public final Float LIZ() {
        return Float.valueOf(this.LJFF ? Float.MAX_VALUE : this.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PoiMapModeMarker] poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(",isHighLight=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", imgBitmap=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1BU1
    public final C1178490glz getPosition() {
        return this.LJIIIIZZ;
    }

    @Override // X.C1BU1
    public final String getTitle() {
        return this.LJ;
    }

    public static C1178200glW LIZJ(C1178200glW c1178200glW, Bitmap bitmap, boolean z, boolean z2, boolean z3, int i) {
        String str;
        String str2;
        boolean z4;
        int i2;
        C1178490glz c1178490glz;
        String str3;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        Bitmap bitmap2 = bitmap;
        String str4 = null;
        if ((i & 1) != 0) {
            str = c1178200glW.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            bitmap2 = c1178200glW.LIZIZ;
        }
        if ((i & 4) != 0) {
            z7 = c1178200glW.LIZJ;
        }
        if ((i & 8) != 0) {
            z6 = c1178200glW.LIZLLL;
        }
        if ((i & 16) != 0) {
            str2 = c1178200glW.LJ;
        } else {
            str2 = null;
        }
        if ((i & 32) != 0) {
            z5 = c1178200glW.LJFF;
        }
        if ((i & 64) != 0) {
            z4 = c1178200glW.LJI;
        } else {
            z4 = false;
        }
        if ((i & 128) != 0) {
            i2 = c1178200glW.LJII;
        } else {
            i2 = 0;
        }
        if ((i & 256) != 0) {
            c1178490glz = c1178200glW.LJIIIIZZ;
        } else {
            c1178490glz = null;
        }
        if ((i & 512) != 0) {
            str3 = c1178200glW.LJIIIZ;
        } else {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            str4 = c1178200glW.LJIIJ;
        }
        c1178200glW.getClass();
        return new C1178200glW(str, bitmap2, z7, z6, str2, z5, z4, i2, c1178490glz, str3, str4);
    }

    public /* synthetic */ C1178200glW(String str, boolean z, boolean z2, String str2, boolean z3, boolean z4, int i, C1178490glz c1178490glz, String str3, String str4, int i2) {
        this((i2 & 1) != 0 ? "" : str, (Bitmap) null, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? true : z4, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? new C1178490glz(0.0d, 0.0d) : c1178490glz, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : str4);
    }

    public C1178200glW(String str, Bitmap bitmap, boolean z, boolean z2, String str2, boolean z3, boolean z4, int i, C1178490glz c1178490glz, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = bitmap;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = str2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = i;
        this.LJIIIIZZ = c1178490glz;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
    }
}
