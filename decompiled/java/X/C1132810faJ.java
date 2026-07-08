package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0faJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132810faJ {
    public final long LIZ;
    public final String LIZIZ;
    public final ImageModel LIZJ;
    public final String LIZLLL;
    public final MusicGiftMood LJ;
    public final C1136870fgr LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132810faJ)) {
            return false;
        }
        C1132810faJ c1132810faJ = (C1132810faJ) obj;
        return this.LIZ == c1132810faJ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1132810faJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1132810faJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1132810faJ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1132810faJ.LJ) && Intrinsics.LJFF(this.LJFF, c1132810faJ.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        ImageModel imageModel = this.LIZJ;
        int iHashCode = (iY2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MusicGiftMood musicGiftMood = this.LJ;
        int iHashCode3 = (iHashCode2 + (musicGiftMood == null ? 0 : musicGiftMood.hashCode())) * 31;
        C1136870fgr c1136870fgr = this.LJFF;
        return iHashCode3 + (c1136870fgr != null ? c1136870fgr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicGiftTopBannerData(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lyricsUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", moodColorHex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mood=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", previewSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1132810faJ(long j, String str, ImageModel imageModel, String str2, MusicGiftMood musicGiftMood, C1136870fgr c1136870fgr) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = imageModel;
        this.LIZLLL = str2;
        this.LJ = musicGiftMood;
        this.LJFF = c1136870fgr;
    }
}
