package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730090SkR implements InterfaceC636340Oxc<C730090SkR, InterfaceC360001aY> {
    public final C627660Ojc<InterfaceC360001aY> LL;
    public final C728910SiX LLILLJJLI;
    public final C291001Au<C0SED> LLILLL;
    public final boolean LLILZ;
    public final C291001Au<C730100SkS> LLILZIL;
    public final Pair<Boolean, String> LLILZLL;
    public final Integer LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final long LLJI;
    public final long LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final C291001Au<Pair<C730120SkU, StoryInteractionUser>> LLJILLL;
    public final C730050SkN LLJJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730090SkR)) {
            return false;
        }
        C730090SkR c730090SkR = (C730090SkR) obj;
        return Intrinsics.LJFF(this.LL, c730090SkR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c730090SkR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c730090SkR.LLILLL) && this.LLILZ == c730090SkR.LLILZ && Intrinsics.LJFF(this.LLILZIL, c730090SkR.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c730090SkR.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c730090SkR.LLIZ) && this.LLIZLLLIL == c730090SkR.LLIZLLLIL && this.LLJ == c730090SkR.LLJ && this.LLJI == c730090SkR.LLJI && this.LLJIJIL == c730090SkR.LLJIJIL && this.LLJILJIL == c730090SkR.LLJILJIL && this.LLJILJILJ == c730090SkR.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c730090SkR.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c730090SkR.LLJJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C728910SiX c728910SiX = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c728910SiX == null ? 0 : c728910SiX.hashCode())) * 31;
        C291001Au<C0SED> c291001Au = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        C291001Au<C730100SkS> c291001Au2 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        Pair<Boolean, String> pair = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num = this.LLIZ;
        int iHashCode6 = (((((((((((((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + C786410Ut5.Y2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31;
        C291001Au<Pair<C730120SkU, StoryInteractionUser>> c291001Au3 = this.LLJILLL;
        int iHashCode7 = (iHashCode6 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C730050SkN c730050SkN = this.LLJJ;
        return iHashCode7 + (c730050SkN != null ? c730050SkN.hashCode() : 0);
    }

    public final String toString() {
        return "StoryViewerListState(listState=" + this.LL + ", selectedStoryInfo=" + this.LLILLJJLI + ", totalViewerNumEvent=" + this.LLILLL + ", shouldQueryViewerList=" + this.LLILZ + ", storyAnalyticsItem=" + this.LLILZIL + ", isFullViewer=" + this.LLILZLL + ", expireTimeDay=" + this.LLIZ + ", hasScroll=" + this.LLIZLLLIL + ", viewersShowCount=" + this.LLJ + ", queryCursor=" + this.LLJI + ", queryOffset=" + this.LLJIJIL + ", hasMore=" + this.LLJILJIL + ", hasInnerRequest=" + this.LLJILJILJ + ", diggSyncEvent=" + this.LLJILLL + ", secretRepliesInfo=" + this.LLJJ + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<InterfaceC360001aY> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<InterfaceC360001aY> getListState() {
        return this.LL;
    }

    public C730090SkR(C627660Ojc<InterfaceC360001aY> c627660Ojc, C728910SiX c728910SiX, C291001Au<C0SED> c291001Au, boolean z, C291001Au<C730100SkS> c291001Au2, Pair<Boolean, String> pair, Integer num, int i, int i2, long j, long j2, boolean z2, boolean z3, C291001Au<Pair<C730120SkU, StoryInteractionUser>> c291001Au3, C730050SkN c730050SkN) {
        this.LL = c627660Ojc;
        this.LLILLJJLI = c728910SiX;
        this.LLILLL = c291001Au;
        this.LLILZ = z;
        this.LLILZIL = c291001Au2;
        this.LLILZLL = pair;
        this.LLIZ = num;
        this.LLIZLLLIL = i;
        this.LLJ = i2;
        this.LLJI = j;
        this.LLJIJIL = j2;
        this.LLJILJIL = z2;
        this.LLJILJILJ = z3;
        this.LLJILLL = c291001Au3;
        this.LLJJ = c730050SkN;
    }

    public static C730090SkR LIZ(C730090SkR c730090SkR, C627660Ojc c627660Ojc, C728910SiX c728910SiX, C291001Au c291001Au, boolean z, C291001Au c291001Au2, Pair pair, Integer num, int i, int i2, long j, long j2, boolean z2, boolean z3, C291001Au c291001Au3, C730050SkN c730050SkN, int i3) {
        C730050SkN c730050SkN2 = c730050SkN;
        C291001Au c291001Au4 = c291001Au3;
        boolean z4 = z2;
        long j3 = j;
        int i4 = i2;
        int i5 = i;
        Integer num2 = num;
        Pair pair2 = pair;
        C291001Au c291001Au5 = c291001Au2;
        boolean z5 = z;
        C291001Au c291001Au6 = c291001Au;
        C728910SiX c728910SiX2 = c728910SiX;
        long j4 = j2;
        boolean z6 = z3;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        if ((i3 & 1) != 0) {
            c627660Ojc2 = c730090SkR.LL;
        }
        if ((i3 & 2) != 0) {
            c728910SiX2 = c730090SkR.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            c291001Au6 = c730090SkR.LLILLL;
        }
        if ((i3 & 8) != 0) {
            z5 = c730090SkR.LLILZ;
        }
        if ((i3 & 16) != 0) {
            c291001Au5 = c730090SkR.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            pair2 = c730090SkR.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            num2 = c730090SkR.LLIZ;
        }
        if ((i3 & 128) != 0) {
            i5 = c730090SkR.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            i4 = c730090SkR.LLJ;
        }
        if ((i3 & 512) != 0) {
            j3 = c730090SkR.LLJI;
        }
        if ((i3 & 1024) != 0) {
            j4 = c730090SkR.LLJIJIL;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = c730090SkR.LLJILJIL;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z6 = c730090SkR.LLJILJILJ;
        }
        if ((i3 & 8192) != 0) {
            c291001Au4 = c730090SkR.LLJILLL;
        }
        if ((i3 & 16384) != 0) {
            c730050SkN2 = c730090SkR.LLJJ;
        }
        c730090SkR.getClass();
        boolean z7 = z5;
        return new C730090SkR(c627660Ojc2, c728910SiX2, c291001Au6, z7, c291001Au5, pair2, num2, i5, i4, j3, j4, z4, z6, c291001Au4, c730050SkN2);
    }
}
