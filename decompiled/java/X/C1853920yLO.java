package X;

import android.net.Uri;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853920yLO implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final C291001Au<Integer> LLJ;
    public final C1856430yPR LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<Boolean> LLJILJILJ;
    public final C291001Au<Boolean> LLJILLL;
    public final C291001Au<Boolean> LLJJ;
    public final C291001Au<Boolean> LLJJI;
    public final int LLJJIII;
    public final C291001Au<Integer> LLJJIJI;
    public final C291001Au<Integer> LLJJIJIIJIL;
    public final C291001Au<List<TikTokMediaModel>> LLJJIJIL;
    public final C291001Au<List<Uri>> LLJJJ;
    public final C291001Au<Boolean> LLJJJIL;
    public final C291001Au<Integer> LLJJJJ;
    public final C291001Au<Boolean> LLJJJJJIL;

    public C1853920yLO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1853920yLO)) {
            return false;
        }
        C1853920yLO c1853920yLO = (C1853920yLO) obj;
        return Intrinsics.LJFF(this.LL, c1853920yLO.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1853920yLO.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1853920yLO.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1853920yLO.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1853920yLO.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1853920yLO.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1853920yLO.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1853920yLO.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1853920yLO.LLJ) && Intrinsics.LJFF(this.LLJI, c1853920yLO.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1853920yLO.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1853920yLO.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1853920yLO.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1853920yLO.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1853920yLO.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1853920yLO.LLJJI) && this.LLJJIII == c1853920yLO.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c1853920yLO.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1853920yLO.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c1853920yLO.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c1853920yLO.LLJJJ) && Intrinsics.LJFF(this.LLJJJIL, c1853920yLO.LLJJJIL) && Intrinsics.LJFF(this.LLJJJJ, c1853920yLO.LLJJJJ) && Intrinsics.LJFF(this.LLJJJJJIL, c1853920yLO.LLJJJJJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31;
        C1856430yPR c1856430yPR = this.LLJI;
        return ((((((((((((((((((((((((((((iHashCode + (c1856430yPR == null ? 0 : c1856430yPR.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + this.LLJILLL.hashCode()) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL.hashCode()) * 31) + this.LLJJJ.hashCode()) * 31) + this.LLJJJIL.hashCode()) * 31) + this.LLJJJJ.hashCode()) * 31) + this.LLJJJJJIL.hashCode();
    }

    public final String toString() {
        return "TakoFragmentState(keyboardState=" + this.LL + ", keyboardingState=" + this.LLILLJJLI + ", backPressedEvent=" + this.LLILLL + ", feedbackSheetState=" + this.LLILZ + ", firstTimeShowKeyboardState=" + this.LLILZIL + ", updateWaitingForFirstSugEvent=" + this.LLILZLL + ", stickyHeaderEvent=" + this.LLIZ + ", keyboardPositionEvent=" + this.LLIZLLLIL + ", floatingChangeEvent=" + this.LLJ + ", floatingSugInfo=" + this.LLJI + ", bottomDisclaimerShow=" + this.LLJIJIL + ", luckySendEvent=" + this.LLJILJIL + ", photoPickerPanelShow=" + this.LLJILJILJ + ", menuWindowShow=" + this.LLJILLL + ", referenceSheetShow=" + this.LLJJ + ", onShot=" + this.LLJJI + ", immersionBarColorRes=" + this.LLJJIII + ", onAdditionalIconClick=" + this.LLJJIJI + ", onPicSelectBegin=" + this.LLJJIJIIJIL + ", onPicSelectFinishedCommonMode=" + this.LLJJIJIL + ", onPicSelectFinishedByUri=" + this.LLJJJ + ", onGalleryClose=" + this.LLJJJIL + ", onPicDisplayItemCountChanged=" + this.LLJJJJ + ", drawerOpen=" + this.LLJJJJJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1853920yLO(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(bool), new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(bool), new C291001Au(bool), new C291001Au(1), null, new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(null), new C291001Au(bool), -1, new C291001Au(-1), new C291001Au(-1), new C291001Au(null), new C291001Au(null), new C291001Au(bool), new C291001Au(0), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1853920yLO(C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<Boolean> c291001Au6, C291001Au<Boolean> c291001Au7, C291001Au<Boolean> c291001Au8, C291001Au<Integer> c291001Au9, C1856430yPR c1856430yPR, C291001Au<Boolean> c291001Au10, C291001Au<Boolean> c291001Au11, C291001Au<Boolean> c291001Au12, C291001Au<Boolean> c291001Au13, C291001Au<Boolean> c291001Au14, C291001Au<Boolean> c291001Au15, int i, C291001Au<Integer> c291001Au16, C291001Au<Integer> c291001Au17, C291001Au<? extends List<TikTokMediaModel>> c291001Au18, C291001Au<? extends List<Uri>> c291001Au19, C291001Au<Boolean> c291001Au20, C291001Au<Integer> c291001Au21, C291001Au<Boolean> c291001Au22) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
        this.LLJ = c291001Au9;
        this.LLJI = c1856430yPR;
        this.LLJIJIL = c291001Au10;
        this.LLJILJIL = c291001Au11;
        this.LLJILJILJ = c291001Au12;
        this.LLJILLL = c291001Au13;
        this.LLJJ = c291001Au14;
        this.LLJJI = c291001Au15;
        this.LLJJIII = i;
        this.LLJJIJI = c291001Au16;
        this.LLJJIJIIJIL = c291001Au17;
        this.LLJJIJIL = c291001Au18;
        this.LLJJJ = c291001Au19;
        this.LLJJJIL = c291001Au20;
        this.LLJJJJ = c291001Au21;
        this.LLJJJJJIL = c291001Au22;
    }

    public static C1853920yLO LIZ(C1853920yLO c1853920yLO, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C1856430yPR c1856430yPR, C291001Au c291001Au9, C291001Au c291001Au10, C291001Au c291001Au11, C291001Au c291001Au12, C291001Au c291001Au13, int i, C291001Au c291001Au14, C291001Au c291001Au15, C291001Au c291001Au16, C291001Au c291001Au17, C291001Au c291001Au18, C291001Au c291001Au19, C291001Au c291001Au20, int i2) {
        C291001Au<Boolean> c291001Au21;
        C291001Au c291001Au22 = c291001Au20;
        C291001Au c291001Au23 = c291001Au17;
        C291001Au c291001Au24 = c291001Au5;
        C291001Au c291001Au25 = c291001Au15;
        C291001Au c291001Au26 = c291001Au;
        C291001Au c291001Au27 = c291001Au13;
        C291001Au c291001Au28 = c291001Au12;
        C291001Au c291001Au29 = c291001Au16;
        C291001Au c291001Au30 = c291001Au11;
        C291001Au c291001Au31 = c291001Au7;
        C291001Au c291001Au32 = c291001Au10;
        C291001Au c291001Au33 = c291001Au6;
        C291001Au c291001Au34 = c291001Au9;
        C291001Au c291001Au35 = c291001Au14;
        C291001Au c291001Au36 = c291001Au4;
        int i3 = i;
        C1856430yPR c1856430yPR2 = c1856430yPR;
        C291001Au c291001Au37 = c291001Au19;
        C291001Au c291001Au38 = c291001Au3;
        C291001Au c291001Au39 = c291001Au18;
        C291001Au c291001Au40 = c291001Au8;
        C291001Au c291001Au41 = c291001Au2;
        if ((i2 & 1) != 0) {
            c291001Au26 = c1853920yLO.LL;
        }
        if ((i2 & 2) != 0) {
            c291001Au41 = c1853920yLO.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c291001Au38 = c1853920yLO.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au36 = c1853920yLO.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au24 = c1853920yLO.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au33 = c1853920yLO.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au31 = c1853920yLO.LLIZ;
        }
        C291001Au<Boolean> c291001Au42 = null;
        if ((i2 & 128) != 0) {
            c291001Au21 = c1853920yLO.LLIZLLLIL;
        } else {
            c291001Au21 = null;
        }
        if ((i2 & 256) != 0) {
            c291001Au40 = c1853920yLO.LLJ;
        }
        if ((i2 & 512) != 0) {
            c1856430yPR2 = c1853920yLO.LLJI;
        }
        if ((i2 & 1024) != 0) {
            c291001Au34 = c1853920yLO.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au42 = c1853920yLO.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au32 = c1853920yLO.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            c291001Au30 = c1853920yLO.LLJILLL;
        }
        if ((i2 & 16384) != 0) {
            c291001Au28 = c1853920yLO.LLJJ;
        }
        if ((32768 & i2) != 0) {
            c291001Au27 = c1853920yLO.LLJJI;
        }
        if ((65536 & i2) != 0) {
            i3 = c1853920yLO.LLJJIII;
        }
        if ((131072 & i2) != 0) {
            c291001Au35 = c1853920yLO.LLJJIJI;
        }
        if ((262144 & i2) != 0) {
            c291001Au25 = c1853920yLO.LLJJIJIIJIL;
        }
        if ((524288 & i2) != 0) {
            c291001Au29 = c1853920yLO.LLJJIJIL;
        }
        if ((1048576 & i2) != 0) {
            c291001Au23 = c1853920yLO.LLJJJ;
        }
        if ((2097152 & i2) != 0) {
            c291001Au39 = c1853920yLO.LLJJJIL;
        }
        if ((4194304 & i2) != 0) {
            c291001Au37 = c1853920yLO.LLJJJJ;
        }
        if ((i2 & 8388608) != 0) {
            c291001Au22 = c1853920yLO.LLJJJJJIL;
        }
        c1853920yLO.getClass();
        return new C1853920yLO(c291001Au26, c291001Au41, c291001Au38, c291001Au36, c291001Au24, c291001Au33, c291001Au31, c291001Au21, c291001Au40, c1856430yPR2, c291001Au34, c291001Au42, c291001Au32, c291001Au30, c291001Au28, c291001Au27, i3, c291001Au35, c291001Au25, c291001Au29, c291001Au23, c291001Au39, c291001Au37, c291001Au22);
    }
}
