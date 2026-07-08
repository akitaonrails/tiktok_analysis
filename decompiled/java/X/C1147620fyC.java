package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147620fyC {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final ImageModel LIZLLL;
    public final ImageModel LJ;
    public final String LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147620fyC)) {
            return false;
        }
        C1147620fyC c1147620fyC = (C1147620fyC) obj;
        return this.LIZ == c1147620fyC.LIZ && Intrinsics.LJFF(this.LIZIZ, c1147620fyC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1147620fyC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147620fyC.LIZLLL) && Intrinsics.LJFF(this.LJ, c1147620fyC.LJ) && Intrinsics.LJFF(this.LJFF, c1147620fyC.LJFF) && Intrinsics.LJFF(this.LJI, c1147620fyC.LJI);
    }

    public final int hashCode() {
        int iY2 = ((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        ImageModel imageModel = this.LIZLLL;
        int iHashCode = (iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LJ;
        return ((((iHashCode + (imageModel2 != null ? imageModel2.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftDetailMoodUiModel(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", entryTitle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", disc=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", giftListHex=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", secondaryPageHex=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1147620fyC(long j, ImageModel imageModel, ImageModel imageModel2, String str, String str2, String str3, String str4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = imageModel;
        this.LJ = imageModel2;
        this.LJFF = str3;
        this.LJI = str4;
    }
}
