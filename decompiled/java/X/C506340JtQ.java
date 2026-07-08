package X;

import android.text.Editable;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506340JtQ implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Editable> LLILLJJLI;
    public final C291001Au<SpacePost> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<C504910Jr7> LLILZIL;
    public final C291001Au<C504910Jr7> LLILZLL;
    public final C291001Au<C503080JoA> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;
    public final C291001Au<SpaceCommentItem> LLJ;
    public final C291001Au<Boolean> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<Boolean> LLJILJILJ;

    public C506340JtQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C506340JtQ)) {
            return false;
        }
        C506340JtQ c506340JtQ = (C506340JtQ) obj;
        return Intrinsics.LJFF(this.LL, c506340JtQ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c506340JtQ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c506340JtQ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c506340JtQ.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c506340JtQ.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c506340JtQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c506340JtQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c506340JtQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c506340JtQ.LLJ) && Intrinsics.LJFF(this.LLJI, c506340JtQ.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c506340JtQ.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c506340JtQ.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c506340JtQ.LLJILJILJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Editable> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<SpacePost> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C504910Jr7> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C504910Jr7> c291001Au5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<C503080JoA> c291001Au6 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Integer> c291001Au7 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<SpaceCommentItem> c291001Au8 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        C291001Au<Boolean> c291001Au9 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (c291001Au9 == null ? 0 : c291001Au9.hashCode())) * 31;
        C291001Au<Boolean> c291001Au10 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (c291001Au10 == null ? 0 : c291001Au10.hashCode())) * 31;
        C291001Au<Boolean> c291001Au11 = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (c291001Au11 == null ? 0 : c291001Au11.hashCode())) * 31;
        C291001Au<Boolean> c291001Au12 = this.LLJILJILJ;
        return iHashCode12 + (c291001Au12 != null ? c291001Au12.hashCode() : 0);
    }

    public final String toString() {
        return "DetailVMState(enterFrom=" + this.LL + ", input=" + this.LLILLJJLI + ", onNewPost=" + this.LLILLL + ", closeDetailPage=" + this.LLILZ + ", eventShowEditor=" + this.LLILZIL + ", longClickComment=" + this.LLILZLL + ", eventShowPollList=" + this.LLIZ + ", eventHeaderHeight=" + this.LLIZLLLIL + ", eventNewComment=" + this.LLJ + ", eventDetailFetched=" + this.LLJI + ", eventDeleteComment=" + this.LLJIJIL + ", eventNoDataFail=" + this.LLJILJIL + ", eventSourceSuperFan=" + this.LLJILJILJ + ')';
    }

    public /* synthetic */ C506340JtQ(int i) {
        this("", null, null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C506340JtQ(String str, C291001Au<? extends Editable> c291001Au, C291001Au<SpacePost> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<C504910Jr7> c291001Au4, C291001Au<C504910Jr7> c291001Au5, C291001Au<C503080JoA> c291001Au6, C291001Au<Integer> c291001Au7, C291001Au<SpaceCommentItem> c291001Au8, C291001Au<Boolean> c291001Au9, C291001Au<Boolean> c291001Au10, C291001Au<Boolean> c291001Au11, C291001Au<Boolean> c291001Au12) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
        this.LLIZLLLIL = c291001Au7;
        this.LLJ = c291001Au8;
        this.LLJI = c291001Au9;
        this.LLJIJIL = c291001Au10;
        this.LLJILJIL = c291001Au11;
        this.LLJILJILJ = c291001Au12;
    }

    public static C506340JtQ LIZ(C506340JtQ c506340JtQ, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, C291001Au c291001Au11, int i) {
        String str;
        C291001Au c291001Au12 = c291001Au7;
        C291001Au c291001Au13 = c291001Au6;
        C291001Au c291001Au14 = c291001Au5;
        C291001Au c291001Au15 = c291001Au11;
        C291001Au c291001Au16 = c291001Au4;
        C291001Au c291001Au17 = c291001Au10;
        C291001Au c291001Au18 = c291001Au3;
        C291001Au c291001Au19 = c291001Au9;
        C291001Au c291001Au20 = c291001Au2;
        C291001Au c291001Au21 = c291001Au8;
        C291001Au c291001Au22 = c291001Au;
        C291001Au<Integer> c291001Au23 = null;
        if ((i & 1) != 0) {
            str = c506340JtQ.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au22 = c506340JtQ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au20 = c506340JtQ.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au18 = c506340JtQ.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au16 = c506340JtQ.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au14 = c506340JtQ.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au13 = c506340JtQ.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au23 = c506340JtQ.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au12 = c506340JtQ.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au21 = c506340JtQ.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au19 = c506340JtQ.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au17 = c506340JtQ.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au15 = c506340JtQ.LLJILJILJ;
        }
        c506340JtQ.getClass();
        return new C506340JtQ(str, c291001Au22, c291001Au20, c291001Au18, c291001Au16, c291001Au14, c291001Au13, c291001Au23, c291001Au12, c291001Au21, c291001Au19, c291001Au17, c291001Au15);
    }
}
