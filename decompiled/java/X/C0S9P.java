package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S9P, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9P implements InterfaceC0148002o {
    public final int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<Unit> LLJI;
    public final SlidesImageLoadParams LLJIJIL;
    public final boolean LLJILJIL;
    public final int LLJILJILJ;
    public final C291001Au<Unit> LLJILLL;
    public final C291001Au<Unit> LLJJ;
    public final C291001Au<Unit> LLJJI;
    public final boolean LLJJIII;
    public final C291001Au<Pair<Aweme, Pair<Float, Float>>> LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final C291001Au<Pair<Integer, C443120HZe<Integer, Integer, Integer>>> LLJJJ;
    public final C291001Au<String> LLJJJIL;
    public final String LLJJJJ;
    public final long LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;

    public C0S9P() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S9P)) {
            return false;
        }
        C0S9P c0s9p = (C0S9P) obj;
        return this.LL == c0s9p.LL && this.LLILLJJLI == c0s9p.LLILLJJLI && this.LLILLL == c0s9p.LLILLL && this.LLILZ == c0s9p.LLILZ && this.LLILZIL == c0s9p.LLILZIL && this.LLILZLL == c0s9p.LLILZLL && Intrinsics.LJFF(this.LLIZ, c0s9p.LLIZ) && this.LLIZLLLIL == c0s9p.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c0s9p.LLJ) && Intrinsics.LJFF(this.LLJI, c0s9p.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c0s9p.LLJIJIL) && this.LLJILJIL == c0s9p.LLJILJIL && this.LLJILJILJ == c0s9p.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c0s9p.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c0s9p.LLJJ) && Intrinsics.LJFF(this.LLJJI, c0s9p.LLJJI) && this.LLJJIII == c0s9p.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c0s9p.LLJJIJI) && this.LLJJIJIIJIL == c0s9p.LLJJIJIIJIL && this.LLJJIJIL == c0s9p.LLJJIJIL && Intrinsics.LJFF(this.LLJJJ, c0s9p.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c0s9p.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c0s9p.LLJJJJ) && this.LLJJJJJIL == c0s9p.LLJJJJJIL && this.LLJJJJLIIL == c0s9p.LLJJJJLIIL;
    }

    public final int hashCode() {
        int iZ2 = ((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        Boolean bool = this.LLIZ;
        int iHashCode = (((iZ2 + (bool == null ? 0 : bool.hashCode())) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        C291001Au<Unit> c291001Au = this.LLJ;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLJI;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        SlidesImageLoadParams slidesImageLoadParams = this.LLJIJIL;
        int iHashCode4 = (((((iHashCode3 + (slidesImageLoadParams == null ? 0 : slidesImageLoadParams.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31;
        C291001Au<Unit> c291001Au3 = this.LLJILLL;
        int iHashCode5 = (iHashCode4 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLJJ;
        int iHashCode6 = (iHashCode5 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLJJI;
        int iHashCode7 = (((iHashCode6 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31;
        C291001Au<Pair<Aweme, Pair<Float, Float>>> c291001Au6 = this.LLJJIJI;
        int iHashCode8 = (((((iHashCode7 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + C786410Ut5.Z2(this.LLJJIJIL)) * 31;
        C291001Au<Pair<Integer, C443120HZe<Integer, Integer, Integer>>> c291001Au7 = this.LLJJJ;
        int iHashCode9 = (iHashCode8 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<String> c291001Au8 = this.LLJJJIL;
        int iHashCode10 = (iHashCode9 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        String str = this.LLJJJJ;
        return ((((iHashCode10 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLJJJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJLIIL);
    }

    public final String toString() {
        return "PhotoStateV2(currentPhotoIndex=" + this.LL + ", scrollLastPhotoCount=" + this.LLILLJJLI + ", isAutoScrollEnabled=" + this.LLILLL + ", isPinching=" + this.LLILZ + ", isDragging=" + this.LLILZIL + ", isVisible=" + this.LLILZLL + ", isMusicPaused=" + this.LLIZ + ", hasAtLeastOneImageLoaded=" + this.LLIZLLLIL + ", onHolderSelectedEvent=" + this.LLJ + ", onHolderUnSelectedEvent=" + this.LLJI + ", slidesImageLoadParams=" + this.LLJIJIL + ", isAutoScrollResumable=" + this.LLJILJIL + ", photoLoopCompletionCount=" + this.LLJILJILJ + ", photosPlayFinished=" + this.LLJILLL + ", photosPlayCompleted=" + this.LLJJ + ", videoPlayFinishedFirstTime=" + this.LLJJI + ", isSwipeHintEnabled=" + this.LLJJIII + ", onPhotoDoubleClicked=" + this.LLJJIJI + ", hasSeenNotOnlyFirstImage=" + this.LLJJIJIIJIL + ", isSlidingPageControl=" + this.LLJJIJIL + ", photoBottom=" + this.LLJJJ + ", dynamicStickerRefreshEvent=" + this.LLJJJIL + ", dynamicStickerDataAwemeId=" + this.LLJJJJ + ", dynamicStickerDataVersion=" + this.LLJJJJJIL + ", isLastImageSwipeHintToastShowing=" + this.LLJJJJLIIL + ')';
    }

    public /* synthetic */ C0S9P(int i) {
        this(0, 0, true, false, false, false, null, false, null, null, null, true, 0, null, null, null, false, null, false, false, null, null, null, 0L, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0S9P(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, SlidesImageLoadParams slidesImageLoadParams, boolean z6, int i3, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Unit> c291001Au5, boolean z7, C291001Au<? extends Pair<? extends Aweme, Pair<Float, Float>>> c291001Au6, boolean z8, boolean z9, C291001Au<Pair<Integer, C443120HZe<Integer, Integer, Integer>>> c291001Au7, C291001Au<String> c291001Au8, String str, long j, boolean z10) {
        boolean z11;
        boolean z12;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = bool;
        this.LLIZLLLIL = z5;
        this.LLJ = c291001Au;
        this.LLJI = c291001Au2;
        this.LLJIJIL = slidesImageLoadParams;
        this.LLJILJIL = z6;
        this.LLJILJILJ = i3;
        this.LLJILLL = c291001Au3;
        this.LLJJ = c291001Au4;
        this.LLJJI = c291001Au5;
        this.LLJJIII = z7;
        this.LLJJIJI = c291001Au6;
        this.LLJJIJIIJIL = z8;
        this.LLJJIJIL = z9;
        this.LLJJJ = c291001Au7;
        this.LLJJJIL = c291001Au8;
        this.LLJJJJ = str;
        this.LLJJJJJIL = j;
        this.LLJJJJLIIL = z10;
        if (z && z6) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.LLJJL = z11;
        if (z11 && z4 && !z2 && !z3 && !Intrinsics.LJFF(bool, Boolean.TRUE) && z5) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.LLJJLIIIJLLLLLLLZ = z12;
        this.LLJL = z4 && z5 && z7;
    }

    public static C0S9P LIZ(C0S9P c0s9p, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, boolean z5, C291001Au c291001Au, C291001Au c291001Au2, SlidesImageLoadParams slidesImageLoadParams, boolean z6, int i3, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, boolean z7, boolean z8, boolean z9, C291001Au c291001Au6, String str, long j, boolean z10, int i4) {
        C291001Au<Pair<Aweme, Pair<Float, Float>>> c291001Au7;
        boolean z11 = z10;
        C291001Au c291001Au8 = c291001Au;
        C291001Au c291001Au9 = c291001Au6;
        boolean z12 = z9;
        C291001Au c291001Au10 = c291001Au4;
        C291001Au c291001Au11 = c291001Au3;
        boolean z13 = z3;
        boolean z14 = z8;
        int i5 = i3;
        long j2 = j;
        boolean z15 = z6;
        SlidesImageLoadParams slidesImageLoadParams2 = slidesImageLoadParams;
        int i6 = i2;
        boolean z16 = z7;
        C291001Au c291001Au12 = c291001Au2;
        boolean z17 = z5;
        Boolean bool2 = bool;
        boolean z18 = z4;
        boolean z19 = z2;
        String str2 = str;
        boolean z20 = z;
        C291001Au c291001Au13 = c291001Au5;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c0s9p.LL;
        }
        if ((i4 & 2) != 0) {
            i6 = c0s9p.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            z20 = c0s9p.LLILLL;
        }
        if ((i4 & 8) != 0) {
            z19 = c0s9p.LLILZ;
        }
        if ((i4 & 16) != 0) {
            z13 = c0s9p.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            z18 = c0s9p.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            bool2 = c0s9p.LLIZ;
        }
        if ((i4 & 128) != 0) {
            z17 = c0s9p.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            c291001Au8 = c0s9p.LLJ;
        }
        if ((i4 & 512) != 0) {
            c291001Au12 = c0s9p.LLJI;
        }
        if ((i4 & 1024) != 0) {
            slidesImageLoadParams2 = c0s9p.LLJIJIL;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z15 = c0s9p.LLJILJIL;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i5 = c0s9p.LLJILJILJ;
        }
        if ((i4 & 8192) != 0) {
            c291001Au11 = c0s9p.LLJILLL;
        }
        if ((i4 & 16384) != 0) {
            c291001Au10 = c0s9p.LLJJ;
        }
        if ((32768 & i4) != 0) {
            c291001Au13 = c0s9p.LLJJI;
        }
        if ((65536 & i4) != 0) {
            z16 = c0s9p.LLJJIII;
        }
        C291001Au<Pair<Integer, C443120HZe<Integer, Integer, Integer>>> c291001Au14 = null;
        if ((131072 & i4) != 0) {
            c291001Au7 = c0s9p.LLJJIJI;
        } else {
            c291001Au7 = null;
        }
        if ((262144 & i4) != 0) {
            z14 = c0s9p.LLJJIJIIJIL;
        }
        if ((524288 & i4) != 0) {
            z12 = c0s9p.LLJJIJIL;
        }
        if ((1048576 & i4) != 0) {
            c291001Au14 = c0s9p.LLJJJ;
        }
        if ((2097152 & i4) != 0) {
            c291001Au9 = c0s9p.LLJJJIL;
        }
        if ((4194304 & i4) != 0) {
            str2 = c0s9p.LLJJJJ;
        }
        if ((8388608 & i4) != 0) {
            j2 = c0s9p.LLJJJJJIL;
        }
        if ((i4 & 16777216) != 0) {
            z11 = c0s9p.LLJJJJLIIL;
        }
        c0s9p.getClass();
        return new C0S9P(i7, i6, z20, z19, z13, z18, bool2, z17, c291001Au8, c291001Au12, slidesImageLoadParams2, z15, i5, c291001Au11, c291001Au10, c291001Au13, z16, c291001Au7, z14, z12, c291001Au14, c291001Au9, str2, j2, z11);
    }
}
