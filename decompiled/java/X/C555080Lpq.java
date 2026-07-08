package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555080Lpq {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final Function1<MentionDataItem, String> LJIILL;

    /* JADX WARN: Multi-variable type inference failed */
    public C555080Lpq() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65535);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C555080Lpq)) {
            return false;
        }
        C555080Lpq c555080Lpq = (C555080Lpq) obj;
        return Intrinsics.LJFF(this.LIZ, c555080Lpq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c555080Lpq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c555080Lpq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c555080Lpq.LIZLLL) && Intrinsics.LJFF(this.LJ, c555080Lpq.LJ) && Intrinsics.LJFF(this.LJFF, c555080Lpq.LJFF) && Intrinsics.LJFF(this.LJI, c555080Lpq.LJI) && Intrinsics.LJFF(this.LJII, c555080Lpq.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c555080Lpq.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c555080Lpq.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c555080Lpq.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c555080Lpq.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c555080Lpq.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c555080Lpq.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c555080Lpq.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c555080Lpq.LJIILL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.LJI;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.LJII;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.LJIIIIZZ;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.LJIIIZ;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.LJIIJ;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.LJIIJJI;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.LJIIL;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.LJIILIIL;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.LJIILJJIL;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Function1<MentionDataItem, String> function1 = this.LJIILL;
        return iHashCode15 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "MentionEditUITextConfig(reachLimitToastText=" + this.LIZ + ", mentionPanelMaxHintText=" + this.LIZIZ + ", mentionPanelNoNetworkText=" + this.LIZJ + ", ctaText=" + this.LIZLLL + ", changeUserHintText=" + this.LJ + ", stageBackgroundHintText=" + this.LJFF + ", inputBoxRandomHintTextList=" + this.LJI + ", inputBoxFollowText=" + this.LJII + ", aiSelfCreateButtonText=" + this.LJIIIIZZ + ", inputPanelAiSelfNotAvailableText=" + this.LJIIIZ + ", inputCharLimitReachText=" + this.LJIIJ + ", inputPanelInviteText=" + this.LJIIJJI + ", inputPanelInvitedText=" + this.LJIIL + ", inputPanelCreateText=" + this.LJIILIIL + ", inputPanelGeneratingText=" + this.LJIILJJIL + ", exceptionTooltipProvider=" + this.LJIILL + ')';
    }

    public /* synthetic */ C555080Lpq(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this(null, (i & 2) != 0 ? null : str, null, null, null, null, (i & 64) != 0 ? null : list, null, null, (i & 512) != 0 ? null : str2, (i & 1024) != 0 ? null : str3, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & 16384) != 0 ? null : str7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C555080Lpq(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Function1<? super MentionDataItem, String> function1) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = list;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = str11;
        this.LJIIL = str12;
        this.LJIILIIL = str13;
        this.LJIILJJIL = str14;
        this.LJIILL = function1;
    }
}
