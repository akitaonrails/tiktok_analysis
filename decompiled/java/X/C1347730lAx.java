package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.model.Comment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347730lAx {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public boolean LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public Comment LJIIIZ;
    public final String LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;
    public String LJIILIIL;
    public final String LJIILJJIL;
    public Integer LJIILL;

    public C1347730lAx() {
        this(false, null, null, null, 0, null, null, null, null, null, null, null, null, null, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347730lAx)) {
            return false;
        }
        C1347730lAx c1347730lAx = (C1347730lAx) obj;
        return this.LIZ == c1347730lAx.LIZ && Intrinsics.LJFF(this.LIZIZ, c1347730lAx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1347730lAx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1347730lAx.LIZLLL) && this.LJ == c1347730lAx.LJ && Intrinsics.LJFF(this.LJFF, c1347730lAx.LJFF) && this.LJI == c1347730lAx.LJI && Intrinsics.LJFF(this.LJII, c1347730lAx.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1347730lAx.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1347730lAx.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1347730lAx.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1347730lAx.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1347730lAx.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1347730lAx.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1347730lAx.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1347730lAx.LJIILL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31;
        Comment comment = this.LJIIIZ;
        int iHashCode = (((iZ2 + (comment == null ? 0 : comment.hashCode())) * 31) + this.LJIIJ.hashCode()) * 31;
        Integer num = this.LJIIJJI;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIL;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LJIILIIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIILJJIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.LJIILL;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoCommentParams(isVisualPoet=" + this.LIZ + ", subPosition=" + this.LIZIZ + ", photoType=" + this.LIZJ + ", preloadImageStatus=" + this.LIZLLL + ", uploadImageStatus=" + this.LJ + ", imageTaskId=" + this.LJFF + ", isFastPost=" + this.LJI + ", aiGenerateModel=" + this.LJII + ", aiIntentionModel=" + this.LJIIIIZZ + ", replyComment=" + this.LJIIIZ + ", groupId=" + this.LJIIJ + ", isHistoryPhoto=" + this.LJIIJJI + ", isVpResultShow=" + this.LJIIL + ", subPhotoType=" + this.LJIILIIL + ", originalSubPhotoType=" + this.LJIILJJIL + ", isGray=" + this.LJIILL + ')';
    }

    public C1347730lAx(boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, Comment comment, String str7, Integer num, Integer num2, String str8, String str9, int i2) {
        String str10 = str2;
        String str11 = str;
        int i3 = i;
        String str12 = str3;
        String str13 = str5;
        String str14 = str4;
        Comment comment2 = comment;
        String str15 = str6;
        Integer num3 = num2;
        Integer num4 = num;
        String str16 = str9;
        String str17 = str8;
        boolean z2 = (i2 & 1) != 0 ? false : z;
        str11 = (i2 & 2) != 0 ? "" : str11;
        str10 = (i2 & 4) != 0 ? "" : str10;
        str12 = (i2 & 8) != 0 ? "" : str12;
        i3 = (i2 & 16) != 0 ? 0 : i3;
        str14 = (i2 & 32) != 0 ? "" : str14;
        str13 = (i2 & 128) != 0 ? "" : str13;
        str15 = (i2 & 256) != 0 ? "" : str15;
        comment2 = (i2 & 512) != 0 ? null : comment2;
        String str18 = (i2 & 1024) == 0 ? str7 : "";
        num4 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num4;
        num3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num3;
        str17 = (i2 & 8192) != 0 ? null : str17;
        str16 = (i2 & 16384) != 0 ? null : str16;
        this.LIZ = z2;
        this.LIZIZ = str11;
        this.LIZJ = str10;
        this.LIZLLL = str12;
        this.LJ = i3;
        this.LJFF = str14;
        this.LJI = false;
        this.LJII = str13;
        this.LJIIIIZZ = str15;
        this.LJIIIZ = comment2;
        this.LJIIJ = str18;
        this.LJIIJJI = num4;
        this.LJIIL = num3;
        this.LJIILIIL = str17;
        this.LJIILJJIL = str16;
        this.LJIILL = null;
    }
}
