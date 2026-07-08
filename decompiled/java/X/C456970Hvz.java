package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456970Hvz implements InterfaceC111300bX {
    public final InterfaceC456990Hw1 LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final EnumC456980Hw0 LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final String LLIZLLLIL;
    public final EnumC2172611A1b LLJ;
    public final EnumC913000Zrm LLJI;
    public final C0ZH1 LLJIJIL;
    public final C0S2U LLJILJIL;
    public final EnumC913010Zrn LLJILJILJ;
    public final C0S2R LLJILLL;
    public final String LLJJ;
    public final int LLJJI;
    public final Integer LLJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C456970Hvz)) {
            return false;
        }
        C456970Hvz c456970Hvz = (C456970Hvz) obj;
        return Intrinsics.LJFF(this.LL, c456970Hvz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c456970Hvz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c456970Hvz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c456970Hvz.LLILZ) && this.LLILZIL == c456970Hvz.LLILZIL && this.LLILZLL == c456970Hvz.LLILZLL && this.LLIZ == c456970Hvz.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c456970Hvz.LLIZLLLIL) && this.LLJ == c456970Hvz.LLJ && this.LLJI == c456970Hvz.LLJI && this.LLJIJIL == c456970Hvz.LLJIJIL && this.LLJILJIL == c456970Hvz.LLJILJIL && this.LLJILJILJ == c456970Hvz.LLJILJILJ && this.LLJILLL == c456970Hvz.LLJILLL && Intrinsics.LJFF(this.LLJJ, c456970Hvz.LLJJ) && this.LLJJI == c456970Hvz.LLJJI && Intrinsics.LJFF(this.LLJJIII, c456970Hvz.LLJJIII);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        String str2 = this.LLILZ;
        int iHashCode3 = (((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode4 = (((((((((((((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI) * 31;
        Integer num = this.LLJJIII;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "QuickMessageInputProps(hint=" + this.LL + ", conversationId=" + this.LLILLJJLI + ", chatType=" + this.LLILLL + ", draft=" + this.LLILZ + ", forceDisableCamera=" + this.LLILZIL + ", isAnimateReaction=" + this.LLILZLL + ", isShow6EmojisInsteadOf8=" + this.LLIZ + ", aid=" + this.LLIZLLLIL + ", quickMessageEnterFrom=" + this.LLJ + ", quickMessageEnterMethod=" + this.LLJI + ", quickMessageItemType=" + this.LLJIJIL + ", quickReplyTriggerReason=" + this.LLJILJIL + ", quickReplyBoxEnterMethod=" + this.LLJILJILJ + ", quickReplyChatType=" + this.LLJILLL + ", groupId=" + this.LLJJ + ", rank=" + this.LLJJI + ", immersiveFragmentHashCode=" + this.LLJJIII + ')';
    }

    public C456970Hvz(C457000Hw2 c457000Hw2, String str, String str2, String str3, EnumC456980Hw0 enumC456980Hw0, boolean z, String str4, EnumC2172611A1b enumC2172611A1b, EnumC913000Zrm enumC913000Zrm, C0ZH1 c0zh1, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, C0S2R c0s2r, String str5, Integer num, int i) {
        int i2;
        EnumC456980Hw0 enumC456980Hw02 = enumC456980Hw0;
        boolean z2 = z;
        String str6 = str4;
        C0S2U c0s2u2 = c0s2u;
        String str7 = str5;
        C0S2R c0s2r2 = c0s2r;
        EnumC913010Zrn enumC913010Zrn2 = enumC913010Zrn;
        String str8 = (i & 8) != 0 ? null : str3;
        enumC456980Hw02 = (i & 16) != 0 ? EnumC456980Hw0.FOLLOW_EXP : enumC456980Hw02;
        z2 = (i & 32) != 0 ? false : z2;
        str6 = (i & 128) != 0 ? null : str6;
        c0s2u2 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C0S2U.UNKNOWN : c0s2u2;
        enumC913010Zrn2 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? EnumC913010Zrn.UNKNOWN : enumC913010Zrn2;
        c0s2r2 = (i & 8192) != 0 ? C0S2R.UNKNOWN : c0s2r2;
        str7 = (i & 16384) != 0 ? "" : str7;
        if ((32768 & i) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        Integer num2 = (i & 65536) == 0 ? num : null;
        this.LL = c457000Hw2;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str8;
        this.LLILZIL = enumC456980Hw02;
        this.LLILZLL = z2;
        this.LLIZ = false;
        this.LLIZLLLIL = str6;
        this.LLJ = enumC2172611A1b;
        this.LLJI = enumC913000Zrm;
        this.LLJIJIL = c0zh1;
        this.LLJILJIL = c0s2u2;
        this.LLJILJILJ = enumC913010Zrn2;
        this.LLJILLL = c0s2r2;
        this.LLJJ = str7;
        this.LLJJI = i2;
        this.LLJJIII = num2;
    }
}
