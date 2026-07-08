package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177210gjv implements C1BU1 {
    public final String LIZ;
    public final Bitmap LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final C1178490glz LJFF;
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1177210gjv() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511);
    }

    @Override // X.C1BU1
    public final Pair<Integer, Integer> LIZIZ() {
        return new Pair<>(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177210gjv)) {
            return false;
        }
        C1177210gjv c1177210gjv = (C1177210gjv) obj;
        return Intrinsics.LJFF(this.LIZ, c1177210gjv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1177210gjv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1177210gjv.LIZJ) && this.LIZLLL == c1177210gjv.LIZLLL && this.LJ == c1177210gjv.LJ && Intrinsics.LJFF(this.LJFF, c1177210gjv.LJFF) && Intrinsics.LJFF(this.LJI, c1177210gjv.LJI) && this.LJII == c1177210gjv.LJII && this.LJIIIIZZ == c1177210gjv.LJIIIIZZ;
    }

    @Override // X.C1BU1
    public final void getSnippet() {
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31;
        String str = this.LJI;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    @Override // X.C1BU1
    public final Float LIZ() {
        return Float.valueOf(this.LIZLLL ? Float.MAX_VALUE : this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PoiMapModeMarker] poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",isHighLight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imgBitmap=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1BU1
    public final C1178490glz getPosition() {
        return this.LJFF;
    }

    @Override // X.C1BU1
    public final String getTitle() {
        return this.LIZJ;
    }

    public static C1177210gjv LIZJ(C1177210gjv c1177210gjv, Bitmap bitmap, boolean z, boolean z2, int i) {
        String str;
        String str2;
        int i2;
        C1178490glz c1178490glz;
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        Bitmap bitmap2 = bitmap;
        String str3 = null;
        if ((i & 1) != 0) {
            str = c1177210gjv.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            bitmap2 = c1177210gjv.LIZIZ;
        }
        if ((i & 4) != 0) {
            str2 = c1177210gjv.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z5 = c1177210gjv.LIZLLL;
        }
        if ((i & 16) != 0) {
            i2 = c1177210gjv.LJ;
        } else {
            i2 = 0;
        }
        if ((i & 32) != 0) {
            c1178490glz = c1177210gjv.LJFF;
        } else {
            c1178490glz = null;
        }
        if ((i & 64) != 0) {
            str3 = c1177210gjv.LJI;
        }
        if ((i & 128) != 0) {
            z3 = c1177210gjv.LJII;
        } else {
            z3 = false;
        }
        if ((i & 256) != 0) {
            z4 = c1177210gjv.LJIIIIZZ;
        }
        c1177210gjv.getClass();
        return new C1177210gjv(str, bitmap2, str2, z5, i2, c1178490glz, str3, z3, z4);
    }

    public /* synthetic */ C1177210gjv(String str, String str2, int i, C1178490glz c1178490glz, String str3, int i2) {
        this((i2 & 1) != 0 ? "" : str, null, (i2 & 4) == 0 ? str2 : "", false, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? new C1178490glz(0.0d, 0.0d) : c1178490glz, (i2 & 64) != 0 ? null : str3, false, false);
    }

    public C1177210gjv(String str, Bitmap bitmap, String str2, boolean z, int i, C1178490glz c1178490glz, String str3, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = bitmap;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = c1178490glz;
        this.LJI = str3;
        this.LJII = z2;
        this.LJIIIIZZ = z3;
    }
}
