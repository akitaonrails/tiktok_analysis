package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147640fyE {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final ImageModel LJII;
    public final ImageModel LJIIIIZZ;
    public final ImageModel LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147640fyE)) {
            return false;
        }
        C1147640fyE c1147640fyE = (C1147640fyE) obj;
        return this.LIZ == c1147640fyE.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147640fyE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147640fyE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147640fyE.LIZLLL) && Intrinsics.LJFF(this.LJ, c1147640fyE.LJ) && this.LJFF == c1147640fyE.LJFF && this.LJI == c1147640fyE.LJI && Intrinsics.LJFF(this.LJII, c1147640fyE.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1147640fyE.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1147640fyE.LJIIIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        ImageModel imageModel = this.LJII;
        int iHashCode = (iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LJIIIIZZ;
        int iHashCode2 = (iHashCode + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        ImageModel imageModel3 = this.LJIIIZ;
        return iHashCode2 + (imageModel3 != null ? imageModel3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftDetailItemUiModel(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", artistName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lyricPreview=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", priceText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isPinned=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showArtistLabel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", artistAvatar=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", albumCover=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", topLeftLabelIcon=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147640fyE(long j, String str, String str2, String str3, String str4, boolean z, boolean z2, ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = imageModel;
        this.LJIIIIZZ = imageModel2;
        this.LJIIIZ = imageModel3;
    }
}
