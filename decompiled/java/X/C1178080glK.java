package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0glK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178080glK implements C1BU1 {
    public final String LIZ;
    public final Bitmap LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final C1178490glz LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1178080glK() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        this(null, objArr, 0, objArr2, objArr3, 0 == true ? 1 : 0, objArr4, 511);
    }

    @Override // X.C1BU1
    public final Pair<Integer, Integer> LIZIZ() {
        return new Pair<>(0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1178080glK)) {
            return false;
        }
        C1178080glK c1178080glK = (C1178080glK) obj;
        return Intrinsics.LJFF(this.LIZ, c1178080glK.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1178080glK.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1178080glK.LIZJ) && this.LIZLLL == c1178080glK.LIZLLL && Intrinsics.LJFF(this.LJ, c1178080glK.LJ) && Intrinsics.LJFF(this.LJFF, c1178080glK.LJFF) && this.LJI == c1178080glK.LJI && this.LJII == c1178080glK.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1178080glK.LJIIIIZZ);
    }

    @Override // X.C1BU1
    public final void getSnippet() {
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Bitmap bitmap = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        String str2 = this.LJIIIIZZ;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C1BU1
    public final Float LIZ() {
        return Float.valueOf(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[PoiCampaignMarkerModel] poiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",title=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",imgBitmap=");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1BU1
    public final C1178490glz getPosition() {
        return this.LJ;
    }

    @Override // X.C1BU1
    public final String getTitle() {
        return this.LIZJ;
    }

    public /* synthetic */ C1178080glK(String str, String str2, int i, C1178490glz c1178490glz, String str3, boolean z, String str4, int i2) {
        this((i2 & 1) != 0 ? "" : str, null, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new C1178490glz(0.0d, 0.0d) : c1178490glz, (i2 & 32) != 0 ? null : str3, false, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? null : str4);
    }

    public C1178080glK(String str, Bitmap bitmap, String str2, int i, C1178490glz c1178490glz, String str3, boolean z, boolean z2, String str4) {
        this.LIZ = str;
        this.LIZIZ = bitmap;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = c1178490glz;
        this.LJFF = str3;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = str4;
    }
}
