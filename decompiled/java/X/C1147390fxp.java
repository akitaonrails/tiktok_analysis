package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147390fxp {
    public final long LIZ;
    public final ImageModel LIZIZ;
    public final ImageModel LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147390fxp)) {
            return false;
        }
        C1147390fxp c1147390fxp = (C1147390fxp) obj;
        return this.LIZ == c1147390fxp.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147390fxp.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147390fxp.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147390fxp.LIZLLL) && Intrinsics.LJFF(this.LJ, c1147390fxp.LJ) && Intrinsics.LJFF(this.LJFF, c1147390fxp.LJFF) && Intrinsics.LJFF(this.LJI, c1147390fxp.LJI);
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        ImageModel imageModel = this.LIZIZ;
        int iHashCode = (iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LIZJ;
        return ((((((((iHashCode + (imageModel2 != null ? imageModel2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftMoodModel(moodId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", disc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", giftListHex=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", secondaryPageHex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147390fxp(long j, ImageModel imageModel, ImageModel imageModel2, String str, String str2, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = imageModel;
        this.LIZJ = imageModel2;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
