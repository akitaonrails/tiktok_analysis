package X;

import android.text.Editable;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506360JtS implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Editable> LLILLJJLI;
    public final C291001Au<SpacePost> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<C0K3J> LLILZIL;
    public final C291001Au<C0K3J> LLILZLL;
    public final C291001Au<C0K34> LLIZ;
    public final C291001Au<Integer> LLIZLLLIL;
    public final C291001Au<SpaceCommentItem> LLJ;
    public final C291001Au<Boolean> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;

    public C506360JtS() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C506360JtS)) {
            return false;
        }
        C506360JtS c506360JtS = (C506360JtS) obj;
        return Intrinsics.LJFF(this.LL, c506360JtS.LL) && Intrinsics.LJFF(this.LLILLJJLI, c506360JtS.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c506360JtS.LLILLL) && Intrinsics.LJFF(this.LLILZ, c506360JtS.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c506360JtS.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c506360JtS.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c506360JtS.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c506360JtS.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c506360JtS.LLJ) && Intrinsics.LJFF(this.LLJI, c506360JtS.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c506360JtS.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c506360JtS.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Editable> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<SpacePost> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C0K3J> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<C0K3J> c291001Au5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<C0K34> c291001Au6 = this.LLIZ;
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
        return iHashCode11 + (c291001Au11 != null ? c291001Au11.hashCode() : 0);
    }

    public final String toString() {
        return "DetailVMState(enterFrom=" + this.LL + ", input=" + this.LLILLJJLI + ", onNewPost=" + this.LLILLL + ", closeDetailPage=" + this.LLILZ + ", eventShowEditor=" + this.LLILZIL + ", longClickComment=" + this.LLILZLL + ", eventShowPollList=" + this.LLIZ + ", eventHeaderHeight=" + this.LLIZLLLIL + ", eventNewComment=" + this.LLJ + ", eventDetailFetched=" + this.LLJI + ", eventDeleteComment=" + this.LLJIJIL + ", eventNoDataFail=" + this.LLJILJIL + ')';
    }

    public /* synthetic */ C506360JtS(int i) {
        this("", null, null, null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C506360JtS(String str, C291001Au<? extends Editable> c291001Au, C291001Au<SpacePost> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<C0K3J> c291001Au4, C291001Au<C0K3J> c291001Au5, C291001Au<C0K34> c291001Au6, C291001Au<Integer> c291001Au7, C291001Au<SpaceCommentItem> c291001Au8, C291001Au<Boolean> c291001Au9, C291001Au<Boolean> c291001Au10, C291001Au<Boolean> c291001Au11) {
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
    }

    public static C506360JtS LIZ(C506360JtS c506360JtS, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, int i) {
        String str;
        C291001Au c291001Au11 = c291001Au7;
        C291001Au c291001Au12 = c291001Au6;
        C291001Au c291001Au13 = c291001Au5;
        C291001Au c291001Au14 = c291001Au4;
        C291001Au c291001Au15 = c291001Au10;
        C291001Au c291001Au16 = c291001Au3;
        C291001Au c291001Au17 = c291001Au9;
        C291001Au c291001Au18 = c291001Au2;
        C291001Au c291001Au19 = c291001Au8;
        C291001Au c291001Au20 = c291001Au;
        C291001Au<Integer> c291001Au21 = null;
        if ((i & 1) != 0) {
            str = c506360JtS.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au20 = c506360JtS.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au18 = c506360JtS.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au16 = c506360JtS.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au14 = c506360JtS.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au13 = c506360JtS.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au12 = c506360JtS.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au21 = c506360JtS.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au11 = c506360JtS.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au19 = c506360JtS.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au17 = c506360JtS.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au15 = c506360JtS.LLJILJIL;
        }
        c506360JtS.getClass();
        return new C506360JtS(str, c291001Au20, c291001Au18, c291001Au16, c291001Au14, c291001Au13, c291001Au12, c291001Au21, c291001Au11, c291001Au19, c291001Au17, c291001Au15);
    }
}
