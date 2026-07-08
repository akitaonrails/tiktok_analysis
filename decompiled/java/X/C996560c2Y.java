package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C996560c2Y implements InterfaceC0148002o {
    public final C291001Au<C988710bpt> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<Integer> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;
    public final C291001Au<Unit> LLJ;
    public final C291001Au<Unit> LLJI;
    public final C291001Au<C0T4N> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<Boolean> LLJILJILJ;
    public final C291001Au<Boolean> LLJILLL;
    public final C291001Au<Unit> LLJJ;
    public final C291001Au<Boolean> LLJJI;

    public C996560c2Y() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C996560c2Y)) {
            return false;
        }
        C996560c2Y c996560c2Y = (C996560c2Y) obj;
        return Intrinsics.LJFF(this.LL, c996560c2Y.LL) && Intrinsics.LJFF(this.LLILLJJLI, c996560c2Y.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c996560c2Y.LLILLL) && Intrinsics.LJFF(this.LLILZ, c996560c2Y.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c996560c2Y.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c996560c2Y.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c996560c2Y.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c996560c2Y.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c996560c2Y.LLJ) && Intrinsics.LJFF(this.LLJI, c996560c2Y.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c996560c2Y.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c996560c2Y.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c996560c2Y.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c996560c2Y.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c996560c2Y.LLJJ) && Intrinsics.LJFF(this.LLJJI, c996560c2Y.LLJJI);
    }

    public final int hashCode() {
        C291001Au<C988710bpt> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Integer> c291001Au7 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<Integer> c291001Au8 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        C291001Au<Unit> c291001Au9 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (c291001Au9 == null ? 0 : c291001Au9.hashCode())) * 31;
        C291001Au<Unit> c291001Au10 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (c291001Au10 == null ? 0 : c291001Au10.hashCode())) * 31;
        C291001Au<C0T4N> c291001Au11 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (c291001Au11 == null ? 0 : c291001Au11.hashCode())) * 31;
        C291001Au<Boolean> c291001Au12 = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (c291001Au12 == null ? 0 : c291001Au12.hashCode())) * 31;
        C291001Au<Boolean> c291001Au13 = this.LLJILJILJ;
        int iHashCode13 = (iHashCode12 + (c291001Au13 == null ? 0 : c291001Au13.hashCode())) * 31;
        C291001Au<Boolean> c291001Au14 = this.LLJILLL;
        int iHashCode14 = (iHashCode13 + (c291001Au14 == null ? 0 : c291001Au14.hashCode())) * 31;
        C291001Au<Unit> c291001Au15 = this.LLJJ;
        int iHashCode15 = (iHashCode14 + (c291001Au15 == null ? 0 : c291001Au15.hashCode())) * 31;
        C291001Au<Boolean> c291001Au16 = this.LLJJI;
        return iHashCode15 + (c291001Au16 != null ? c291001Au16.hashCode() : 0);
    }

    public final String toString() {
        return "FeedAdState(onBindTextureSizeEvent=" + this.LL + ", onPopUpWebPageShowEvent=" + this.LLILLJJLI + ", onDelegateResumeEvent=" + this.LLILLL + ", onDelegatePauseEvent=" + this.LLILZ + ", onPagerResumeEvent=" + this.LLILZIL + ", onPagerPauseEvent=" + this.LLILZLL + ", onDelegateHolderPauseEvent=" + this.LLIZ + ", onDelegateHolderResumeEvent=" + this.LLIZLLLIL + ", onAdVideoResumeEvent=" + this.LLJ + ", onAdVideoPauseEvent=" + this.LLJI + ", onReceiveJsBridgeEvent=" + this.LLJIJIL + ", onLightWebPageShowEvent=" + this.LLJILJIL + ", onCommentPageShowEvent=" + this.LLJILJILJ + ", onSharePageShowEvent=" + this.LLJILLL + ", onEnterClearModeEvent=" + this.LLJJ + ", onTabChangeEvent=" + this.LLJJI + ')';
    }

    public /* synthetic */ C996560c2Y(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C996560c2Y(C291001Au<C988710bpt> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Unit> c291001Au5, C291001Au<Unit> c291001Au6, C291001Au<Integer> c291001Au7, C291001Au<Integer> c291001Au8, C291001Au<Unit> c291001Au9, C291001Au<Unit> c291001Au10, C291001Au<C0T4N> c291001Au11, C291001Au<Boolean> c291001Au12, C291001Au<Boolean> c291001Au13, C291001Au<Boolean> c291001Au14, C291001Au<Unit> c291001Au15, C291001Au<Boolean> c291001Au16) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
        this.LLIZ = c291001Au7;
        this.LLIZLLLIL = c291001Au8;
        this.LLJ = c291001Au9;
        this.LLJI = c291001Au10;
        this.LLJIJIL = c291001Au11;
        this.LLJILJIL = c291001Au12;
        this.LLJILJILJ = c291001Au13;
        this.LLJILLL = c291001Au14;
        this.LLJJ = c291001Au15;
        this.LLJJI = c291001Au16;
    }

    public static C996560c2Y LIZ(C996560c2Y c996560c2Y, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, C291001Au c291001Au11, C291001Au c291001Au12, C291001Au c291001Au13, C291001Au c291001Au14, int i) {
        C291001Au<Boolean> c291001Au15;
        C291001Au c291001Au16 = c291001Au13;
        C291001Au c291001Au17 = c291001Au12;
        C291001Au c291001Au18 = c291001Au11;
        C291001Au c291001Au19 = c291001Au10;
        C291001Au c291001Au20 = c291001Au14;
        C291001Au c291001Au21 = c291001Au9;
        C291001Au c291001Au22 = c291001Au8;
        C291001Au c291001Au23 = c291001Au7;
        C291001Au c291001Au24 = c291001Au6;
        C291001Au c291001Au25 = c291001Au5;
        C291001Au c291001Au26 = c291001Au4;
        C291001Au c291001Au27 = c291001Au3;
        C291001Au c291001Au28 = c291001Au2;
        C291001Au c291001Au29 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au29 = c996560c2Y.LL;
        }
        if ((i & 2) != 0) {
            c291001Au28 = c996560c2Y.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au27 = c996560c2Y.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au26 = c996560c2Y.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au25 = c996560c2Y.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au24 = c996560c2Y.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au23 = c996560c2Y.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au22 = c996560c2Y.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au21 = c996560c2Y.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au19 = c996560c2Y.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au18 = c996560c2Y.LLJIJIL;
        }
        C291001Au<Unit> c291001Au30 = null;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au15 = c996560c2Y.LLJILJIL;
        } else {
            c291001Au15 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au17 = c996560c2Y.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            c291001Au16 = c996560c2Y.LLJILLL;
        }
        if ((i & 16384) != 0) {
            c291001Au30 = c996560c2Y.LLJJ;
        }
        if ((i & 32768) != 0) {
            c291001Au20 = c996560c2Y.LLJJI;
        }
        c996560c2Y.getClass();
        return new C996560c2Y(c291001Au29, c291001Au28, c291001Au27, c291001Au26, c291001Au25, c291001Au24, c291001Au23, c291001Au22, c291001Au21, c291001Au19, c291001Au18, c291001Au15, c291001Au17, c291001Au16, c291001Au30, c291001Au20);
    }
}
