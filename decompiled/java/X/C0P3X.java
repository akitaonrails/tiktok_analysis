package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.vibefeed.model.SummaryStats;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P3X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P3X implements InterfaceC0148002o {
    public final String LL;
    public final boolean LLILLJJLI;
    public final C638560P2w LLILLL;
    public final boolean LLILZ;
    public final SummaryStats LLILZIL;
    public final List<UrlModel> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final EnumC1575470r6H LLIZLLLIL;
    public final Boolean LLJ;
    public final List<VibeFeedUser> LLJI;
    public final List<VibeFeedUser> LLJIJIL;
    public final List<String> LLJILJIL;

    public C0P3X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0P3X)) {
            return false;
        }
        C0P3X c0p3x = (C0P3X) obj;
        return Intrinsics.LJFF(this.LL, c0p3x.LL) && this.LLILLJJLI == c0p3x.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0p3x.LLILLL) && this.LLILZ == c0p3x.LLILZ && Intrinsics.LJFF(this.LLILZIL, c0p3x.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c0p3x.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0p3x.LLIZ) && this.LLIZLLLIL == c0p3x.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0p3x.LLJ) && Intrinsics.LJFF(this.LLJI, c0p3x.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0p3x.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c0p3x.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        SummaryStats summaryStats = this.LLILZIL;
        int iHashCode2 = (iHashCode + (summaryStats == null ? 0 : summaryStats.hashCode())) * 31;
        List<UrlModel> list = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        EnumC1575470r6H enumC1575470r6H = this.LLIZLLLIL;
        int iHashCode5 = (iHashCode4 + (enumC1575470r6H == null ? 0 : enumC1575470r6H.hashCode())) * 31;
        Boolean bool = this.LLJ;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<VibeFeedUser> list2 = this.LLJI;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VibeFeedUser> list3 = this.LLJIJIL;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.LLJILJIL;
        return iHashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return "VibeFeedConsumeState(playingAwemeId=" + this.LL + ", awemeExpired=" + this.LLILLJJLI + ", consumeStats=" + this.LLILLL + ", enterSummary=" + this.LLILZ + ", summaryStats=" + this.LLILZIL + ", summaryCorvers=" + this.LLILZLL + ", reloadCoLike=" + this.LLIZ + ", visitFinishType=" + this.LLIZLLLIL + ", firstTimeFinish=" + this.LLJ + ", visitFinishedList=" + this.LLJI + ", joinedFeedUserList=" + this.LLJIJIL + ", joinedFeedUids=" + this.LLJILJIL + ')';
    }

    public /* synthetic */ C0P3X(int i) {
        this("", false, new C638560P2w(0, 0), false, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0P3X(String str, boolean z, C638560P2w c638560P2w, boolean z2, SummaryStats summaryStats, List<? extends UrlModel> list, C291001Au<Boolean> c291001Au, EnumC1575470r6H enumC1575470r6H, Boolean bool, List<VibeFeedUser> list2, List<VibeFeedUser> list3, List<String> list4) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c638560P2w;
        this.LLILZ = z2;
        this.LLILZIL = summaryStats;
        this.LLILZLL = list;
        this.LLIZ = c291001Au;
        this.LLIZLLLIL = enumC1575470r6H;
        this.LLJ = bool;
        this.LLJI = list2;
        this.LLJIJIL = list3;
        this.LLJILJIL = list4;
    }

    public static C0P3X LIZ(C0P3X c0p3x, String str, boolean z, C638560P2w c638560P2w, boolean z2, SummaryStats summaryStats, List list, C291001Au c291001Au, EnumC1575470r6H enumC1575470r6H, Boolean bool, List list2, List list3, List list4, int i) {
        List list5 = list4;
        List list6 = list3;
        List list7 = list2;
        Boolean bool2 = bool;
        EnumC1575470r6H enumC1575470r6H2 = enumC1575470r6H;
        C291001Au c291001Au2 = c291001Au;
        List list8 = list;
        SummaryStats summaryStats2 = summaryStats;
        boolean z3 = z2;
        C638560P2w c638560P2w2 = c638560P2w;
        boolean z4 = z;
        String str2 = str;
        if ((i & 1) != 0) {
            str2 = c0p3x.LL;
        }
        if ((i & 2) != 0) {
            z4 = c0p3x.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c638560P2w2 = c0p3x.LLILLL;
        }
        if ((i & 8) != 0) {
            z3 = c0p3x.LLILZ;
        }
        if ((i & 16) != 0) {
            summaryStats2 = c0p3x.LLILZIL;
        }
        if ((i & 32) != 0) {
            list8 = c0p3x.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au2 = c0p3x.LLIZ;
        }
        if ((i & 128) != 0) {
            enumC1575470r6H2 = c0p3x.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            bool2 = c0p3x.LLJ;
        }
        if ((i & 512) != 0) {
            list7 = c0p3x.LLJI;
        }
        if ((i & 1024) != 0) {
            list6 = c0p3x.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            list5 = c0p3x.LLJILJIL;
        }
        c0p3x.getClass();
        return new C0P3X(str2, z4, c638560P2w2, z3, summaryStats2, list8, c291001Au2, enumC1575470r6H2, bool2, list7, list6, list5);
    }
}
