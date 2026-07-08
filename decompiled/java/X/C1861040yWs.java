package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveActionItem;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yWs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861040yWs implements InterfaceC0148002o {
    public final C291001Au<List<InterfaceC1858000yRy>> LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final SubConversationConfig LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final C1857530yRD LLIZLLLIL;
    public final TakoActiveActionItem LLJ;
    public final TakoActiveActionItem LLJI;
    public final boolean LLJIJIL;
    public final long LLJILJIL;
    public final boolean LLJILJILJ;
    public final TakoActiveBotItem LLJILLL;
    public final C1854150yLl LLJJ;
    public final C1854150yLl LLJJI;
    public final C1854150yLl LLJJIII;
    public final C291001Au<String> LLJJIJI;
    public final AbstractC1623806Xk<SearchLandingPageResponse> LLJJIJIIJIL;
    public final C291001Au<C1856430yPR> LLJJIJIL;
    public final boolean LLJJJ;
    public final C291001Au<Boolean> LLJJJIL;
    public final boolean LLJJJJ;
    public final C291001Au<Unit> LLJJJJJIL;
    public final long LLJJJJLIIL;
    public final C291001Au<Pair<String, Long>> LLJJL;
    public final C291001Au<Unit> LLJJLIIIJLLLLLLLZ;
    public final C291001Au<Boolean> LLJL;
    public final C291001Au<C1875307Wd> LLJLIL;
    public final C291001Au<C1875407We> LLJLILLLLZIIL;

    public C1861040yWs() {
        this(null, false, false, 1073741823);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861040yWs)) {
            return false;
        }
        C1861040yWs c1861040yWs = (C1861040yWs) obj;
        return Intrinsics.LJFF(this.LL, c1861040yWs.LL) && this.LLILLJJLI == c1861040yWs.LLILLJJLI && this.LLILLL == c1861040yWs.LLILLL && Intrinsics.LJFF(this.LLILZ, c1861040yWs.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1861040yWs.LLILZIL) && this.LLILZLL == c1861040yWs.LLILZLL && this.LLIZ == c1861040yWs.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1861040yWs.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1861040yWs.LLJ) && Intrinsics.LJFF(this.LLJI, c1861040yWs.LLJI) && this.LLJIJIL == c1861040yWs.LLJIJIL && this.LLJILJIL == c1861040yWs.LLJILJIL && this.LLJILJILJ == c1861040yWs.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1861040yWs.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1861040yWs.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1861040yWs.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1861040yWs.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c1861040yWs.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1861040yWs.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1861040yWs.LLJJIJIL) && this.LLJJJ == c1861040yWs.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, c1861040yWs.LLJJJIL) && this.LLJJJJ == c1861040yWs.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, c1861040yWs.LLJJJJJIL) && this.LLJJJJLIIL == c1861040yWs.LLJJJJLIIL && Intrinsics.LJFF(this.LLJJL, c1861040yWs.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, c1861040yWs.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, c1861040yWs.LLJL) && Intrinsics.LJFF(this.LLJLIL, c1861040yWs.LLJLIL) && Intrinsics.LJFF(this.LLJLILLLLZIIL, c1861040yWs.LLJLILLLLZIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31;
        SubConversationConfig subConversationConfig = this.LLILZIL;
        int iHashCode2 = (((((((iHashCode + (subConversationConfig == null ? 0 : subConversationConfig.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        TakoActiveActionItem takoActiveActionItem = this.LLJ;
        int iHashCode3 = (iHashCode2 + (takoActiveActionItem == null ? 0 : takoActiveActionItem.hashCode())) * 31;
        TakoActiveActionItem takoActiveActionItem2 = this.LLJI;
        int iHashCode4 = (((((((iHashCode3 + (takoActiveActionItem2 == null ? 0 : takoActiveActionItem2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Y2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        TakoActiveBotItem takoActiveBotItem = this.LLJILLL;
        int iHashCode5 = (iHashCode4 + (takoActiveBotItem == null ? 0 : takoActiveBotItem.hashCode())) * 31;
        C1854150yLl c1854150yLl = this.LLJJ;
        int iHashCode6 = (iHashCode5 + (c1854150yLl == null ? 0 : c1854150yLl.hashCode())) * 31;
        C1854150yLl c1854150yLl2 = this.LLJJI;
        int iHashCode7 = (iHashCode6 + (c1854150yLl2 == null ? 0 : c1854150yLl2.hashCode())) * 31;
        C1854150yLl c1854150yLl3 = this.LLJJIII;
        int iHashCode8 = (iHashCode7 + (c1854150yLl3 == null ? 0 : c1854150yLl3.hashCode())) * 31;
        C291001Au<String> c291001Au = this.LLJJIJI;
        int iHashCode9 = (((((((((((iHashCode8 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + this.LLJJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        C291001Au<Unit> c291001Au2 = this.LLJJJJJIL;
        int iHashCode10 = (((((iHashCode9 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + C786410Ut5.Y2(this.LLJJJJLIIL)) * 31) + this.LLJJL.hashCode()) * 31;
        C291001Au<Unit> c291001Au3 = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode11 = (iHashCode10 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLJL;
        int iHashCode12 = (iHashCode11 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C1875307Wd> c291001Au5 = this.LLJLIL;
        int iHashCode13 = (iHashCode12 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<C1875407We> c291001Au6 = this.LLJLILLLLZIIL;
        return iHashCode13 + (c291001Au6 != null ? c291001Au6.hashCode() : 0);
    }

    public final String toString() {
        return "MessageRepoState(messages=" + this.LL + ", askStatus=" + this.LLILLJJLI + ", withAnimationToQuestion=" + this.LLILLL + ", conversationId=" + this.LLILZ + ", conversationConfig=" + this.LLILZIL + ", shouldShowDisclaimerMessage=" + this.LLILZLL + ", historyHasMore=" + this.LLIZ + ", postProcessPayload=" + this.LLIZLLLIL + ", activeActionItem=" + this.LLJ + ", exitingActionItem=" + this.LLJI + ", hasUserAskQuestion=" + this.LLJIJIL + ", botFetchTimestamp=" + this.LLJILJIL + ", botFetchFinished=" + this.LLJILJILJ + ", activeBotItem=" + this.LLJILLL + ", takoModeItem=" + this.LLJJ + ", pendingTakoSubModeItem=" + this.LLJJI + ", aiImageMode=" + this.LLJJIII + ", imageComplete=" + this.LLJJIJI + ", searchLandingPageResponse=" + this.LLJJIJIIJIL + ", floatingSugDataEvent=" + this.LLJJIJIL + ", pendingAutoSendCompletion=" + this.LLJJJ + ", ignoreAnimationWhenUpdateMessages=" + this.LLJJJIL + ", messagePausable=" + this.LLJJJJ + ", conversationChangeEvent=" + this.LLJJJJJIL + ", conversationUnreadCount=" + this.LLJJJJLIIL + ", conversationUnreadChangeEvent=" + this.LLJJL + ", regenerateMessageRevertEvent=" + this.LLJJLIIIJLLLLLLLZ + ", switchConvLoadingEvent=" + this.LLJL + ", typewriterFinishedEvent=" + this.LLJLIL + ", answerRenderFinishedEvent=" + this.LLJLILLLLZIIL + ')';
    }

    public C1861040yWs(C291001Au c291001Au, boolean z, boolean z2, int i) {
        boolean z3;
        String str;
        C1857530yRD c1857530yRD;
        C491101vh c491101vh;
        C291001Au c291001Au2;
        boolean z4;
        C291001Au c291001Au3;
        C291001Au c291001Au4;
        boolean z5 = z2;
        boolean z6 = z;
        C291001Au c291001Au5 = (i & 1) != 0 ? new C291001Au(C13BV.INSTANCE) : c291001Au;
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        z6 = (i & 4) != 0 ? false : z6;
        if ((i & 8) != 0) {
            str = "";
        } else {
            str = null;
        }
        z5 = (i & 64) != 0 ? true : z5;
        if ((i & 128) != 0) {
            c1857530yRD = new C1857530yRD(false, false, 255);
        } else {
            c1857530yRD = null;
        }
        if ((262144 & i) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        if ((524288 & i) != 0) {
            c291001Au2 = new C291001Au(null);
        } else {
            c291001Au2 = null;
        }
        if ((1048576 & i) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((2097152 & i) != 0) {
            c291001Au3 = new C291001Au(null);
        } else {
            c291001Au3 = null;
        }
        if ((i & 33554432) != 0) {
            c291001Au4 = new C291001Au(null);
        } else {
            c291001Au4 = null;
        }
        this(c291001Au5, z3, z6, str, null, false, z5, c1857530yRD, null, null, false, 0L, false, null, null, null, null, null, c491101vh, c291001Au2, z4, c291001Au3, false, null, 0L, c291001Au4, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1861040yWs(C291001Au<? extends List<? extends InterfaceC1858000yRy>> c291001Au, boolean z, boolean z2, String str, SubConversationConfig subConversationConfig, boolean z3, boolean z4, C1857530yRD c1857530yRD, TakoActiveActionItem takoActiveActionItem, TakoActiveActionItem takoActiveActionItem2, boolean z5, long j, boolean z6, TakoActiveBotItem takoActiveBotItem, C1854150yLl c1854150yLl, C1854150yLl c1854150yLl2, C1854150yLl c1854150yLl3, C291001Au<String> c291001Au2, AbstractC1623806Xk<SearchLandingPageResponse> abstractC1623806Xk, C291001Au<? extends C1856430yPR> c291001Au3, boolean z7, C291001Au<Boolean> c291001Au4, boolean z8, C291001Au<Unit> c291001Au5, long j2, C291001Au<Pair<String, Long>> c291001Au6, C291001Au<Unit> c291001Au7, C291001Au<Boolean> c291001Au8, C291001Au<C1875307Wd> c291001Au9, C291001Au<C1875407We> c291001Au10) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = str;
        this.LLILZIL = subConversationConfig;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = c1857530yRD;
        this.LLJ = takoActiveActionItem;
        this.LLJI = takoActiveActionItem2;
        this.LLJIJIL = z5;
        this.LLJILJIL = j;
        this.LLJILJILJ = z6;
        this.LLJILLL = takoActiveBotItem;
        this.LLJJ = c1854150yLl;
        this.LLJJI = c1854150yLl2;
        this.LLJJIII = c1854150yLl3;
        this.LLJJIJI = c291001Au2;
        this.LLJJIJIIJIL = abstractC1623806Xk;
        this.LLJJIJIL = c291001Au3;
        this.LLJJJ = z7;
        this.LLJJJIL = c291001Au4;
        this.LLJJJJ = z8;
        this.LLJJJJJIL = c291001Au5;
        this.LLJJJJLIIL = j2;
        this.LLJJL = c291001Au6;
        this.LLJJLIIIJLLLLLLLZ = c291001Au7;
        this.LLJL = c291001Au8;
        this.LLJLIL = c291001Au9;
        this.LLJLILLLLZIIL = c291001Au10;
    }

    public static C1861040yWs LIZ(C1861040yWs c1861040yWs, C291001Au c291001Au, boolean z, boolean z2, String str, SubConversationConfig subConversationConfig, boolean z3, boolean z4, C1857530yRD c1857530yRD, TakoActiveActionItem takoActiveActionItem, boolean z5, long j, boolean z6, TakoActiveBotItem takoActiveBotItem, C1854150yLl c1854150yLl, C1854150yLl c1854150yLl2, C291001Au c291001Au2, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au3, boolean z7, C291001Au c291001Au4, boolean z8, C291001Au c291001Au5, long j2, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, int i) {
        TakoActiveActionItem takoActiveActionItem2;
        C1854150yLl c1854150yLl3;
        C291001Au c291001Au11 = c291001Au10;
        C291001Au c291001Au12 = c291001Au8;
        C291001Au c291001Au13 = c291001Au7;
        C291001Au c291001Au14 = c291001Au6;
        boolean z9 = z5;
        boolean z10 = z8;
        C291001Au c291001Au15 = c291001Au4;
        C1854150yLl c1854150yLl4 = c1854150yLl;
        boolean z11 = z4;
        C291001Au c291001Au16 = c291001Au3;
        TakoActiveBotItem takoActiveBotItem2 = takoActiveBotItem;
        long j3 = j2;
        boolean z12 = z6;
        boolean z13 = z2;
        C1854150yLl c1854150yLl5 = c1854150yLl2;
        TakoActiveActionItem takoActiveActionItem3 = takoActiveActionItem;
        C1857530yRD c1857530yRD2 = c1857530yRD;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        boolean z14 = z3;
        C291001Au c291001Au17 = c291001Au2;
        long j4 = j;
        C291001Au c291001Au18 = c291001Au5;
        SubConversationConfig subConversationConfig2 = subConversationConfig;
        C291001Au c291001Au19 = c291001Au9;
        String str2 = str;
        boolean z15 = z;
        boolean z16 = z7;
        C291001Au c291001Au20 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au20 = c1861040yWs.LL;
        }
        if ((i & 2) != 0) {
            z15 = c1861040yWs.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z13 = c1861040yWs.LLILLL;
        }
        if ((i & 8) != 0) {
            str2 = c1861040yWs.LLILZ;
        }
        if ((i & 16) != 0) {
            subConversationConfig2 = c1861040yWs.LLILZIL;
        }
        if ((i & 32) != 0) {
            z14 = c1861040yWs.LLILZLL;
        }
        if ((i & 64) != 0) {
            z11 = c1861040yWs.LLIZ;
        }
        if ((i & 128) != 0) {
            c1857530yRD2 = c1861040yWs.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            takoActiveActionItem3 = c1861040yWs.LLJ;
        }
        if ((i & 512) != 0) {
            takoActiveActionItem2 = c1861040yWs.LLJI;
        } else {
            takoActiveActionItem2 = null;
        }
        if ((i & 1024) != 0) {
            z9 = c1861040yWs.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = c1861040yWs.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z12 = c1861040yWs.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            takoActiveBotItem2 = c1861040yWs.LLJILLL;
        }
        if ((i & 16384) != 0) {
            c1854150yLl4 = c1861040yWs.LLJJ;
        }
        if ((32768 & i) != 0) {
            c1854150yLl3 = c1861040yWs.LLJJI;
        } else {
            c1854150yLl3 = null;
        }
        if ((65536 & i) != 0) {
            c1854150yLl5 = c1861040yWs.LLJJIII;
        }
        if ((131072 & i) != 0) {
            c291001Au17 = c1861040yWs.LLJJIJI;
        }
        if ((262144 & i) != 0) {
            abstractC1623806Xk2 = c1861040yWs.LLJJIJIIJIL;
        }
        if ((524288 & i) != 0) {
            c291001Au16 = c1861040yWs.LLJJIJIL;
        }
        if ((1048576 & i) != 0) {
            z16 = c1861040yWs.LLJJJ;
        }
        if ((2097152 & i) != 0) {
            c291001Au15 = c1861040yWs.LLJJJIL;
        }
        if ((4194304 & i) != 0) {
            z10 = c1861040yWs.LLJJJJ;
        }
        if ((8388608 & i) != 0) {
            c291001Au18 = c1861040yWs.LLJJJJJIL;
        }
        if ((16777216 & i) != 0) {
            j3 = c1861040yWs.LLJJJJLIIL;
        }
        if ((33554432 & i) != 0) {
            c291001Au14 = c1861040yWs.LLJJL;
        }
        if ((67108864 & i) != 0) {
            c291001Au13 = c1861040yWs.LLJJLIIIJLLLLLLLZ;
        }
        if ((134217728 & i) != 0) {
            c291001Au12 = c1861040yWs.LLJL;
        }
        if ((268435456 & i) != 0) {
            c291001Au19 = c1861040yWs.LLJLIL;
        }
        if ((i & 536870912) != 0) {
            c291001Au11 = c1861040yWs.LLJLILLLLZIIL;
        }
        c1861040yWs.getClass();
        return new C1861040yWs(c291001Au20, z15, z13, str2, subConversationConfig2, z14, z11, c1857530yRD2, takoActiveActionItem3, takoActiveActionItem2, z9, j4, z12, takoActiveBotItem2, c1854150yLl4, c1854150yLl3, c1854150yLl5, c291001Au17, abstractC1623806Xk2, c291001Au16, z16, c291001Au15, z10, c291001Au18, j3, c291001Au14, c291001Au13, c291001Au12, c291001Au19, c291001Au11);
    }
}
