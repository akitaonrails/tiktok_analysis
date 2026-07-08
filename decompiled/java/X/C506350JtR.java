package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.HomePageResponse;
import webcast.api.sub.SpaceTip;

/* JADX INFO: renamed from: X.0JtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506350JtR implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<SpacePost> LLILLJJLI;
    public final C291001Au<SpacePost> LLILLL;
    public final C291001Au<C0K34> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C291001Au<SpaceTip> LLIZLLLIL;
    public final C291001Au<Integer> LLJ;
    public final C291001Au<Integer> LLJI;
    public final C291001Au<Boolean> LLJIJIL;
    public final C291001Au<Boolean> LLJILJIL;
    public final C291001Au<HomePageResponse.ResponseData> LLJILJILJ;

    public C506350JtR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C506350JtR)) {
            return false;
        }
        C506350JtR c506350JtR = (C506350JtR) obj;
        return Intrinsics.LJFF(this.LL, c506350JtR.LL) && Intrinsics.LJFF(this.LLILLJJLI, c506350JtR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c506350JtR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c506350JtR.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c506350JtR.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c506350JtR.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c506350JtR.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c506350JtR.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c506350JtR.LLJ) && Intrinsics.LJFF(this.LLJI, c506350JtR.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c506350JtR.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c506350JtR.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c506350JtR.LLJILJILJ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<SpacePost> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<SpacePost> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C0K34> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Boolean> c291001Au5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Boolean> c291001Au6 = this.LLIZ;
        int iHashCode7 = (iHashCode6 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<SpaceTip> c291001Au7 = this.LLIZLLLIL;
        int iHashCode8 = (iHashCode7 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C291001Au<Integer> c291001Au8 = this.LLJ;
        int iHashCode9 = (iHashCode8 + (c291001Au8 == null ? 0 : c291001Au8.hashCode())) * 31;
        C291001Au<Integer> c291001Au9 = this.LLJI;
        int iHashCode10 = (iHashCode9 + (c291001Au9 == null ? 0 : c291001Au9.hashCode())) * 31;
        C291001Au<Boolean> c291001Au10 = this.LLJIJIL;
        int iHashCode11 = (iHashCode10 + (c291001Au10 == null ? 0 : c291001Au10.hashCode())) * 31;
        C291001Au<Boolean> c291001Au11 = this.LLJILJIL;
        int iHashCode12 = (iHashCode11 + (c291001Au11 == null ? 0 : c291001Au11.hashCode())) * 31;
        C291001Au<HomePageResponse.ResponseData> c291001Au12 = this.LLJILJILJ;
        return iHashCode12 + (c291001Au12 != null ? c291001Au12.hashCode() : 0);
    }

    public final String toString() {
        return "FeedVMState(enterFrom=" + this.LL + ", newPost=" + this.LLILLJJLI + ", eventShowEditor=" + this.LLILLL + ", eventShowPollList=" + this.LLILZ + ", eventExitSpace=" + this.LLILZIL + ", eventFetchHomeSuc=" + this.LLILZLL + ", eventJoinSpace=" + this.LLIZ + ", eventPostFromTip=" + this.LLIZLLLIL + ", eventFeedPostChange=" + this.LLJ + ", eventHeaderHeight=" + this.LLJI + ", eventDeletePost=" + this.LLJIJIL + ", eventNoDataFail=" + this.LLJILJIL + ", homePageDataFetched=" + this.LLJILJILJ + ')';
    }

    public /* synthetic */ C506350JtR(int i) {
        this("", null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public C506350JtR(String str, C291001Au<SpacePost> c291001Au, C291001Au<SpacePost> c291001Au2, C291001Au<C0K34> c291001Au3, C291001Au<Boolean> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<Boolean> c291001Au6, C291001Au<SpaceTip> c291001Au7, C291001Au<Integer> c291001Au8, C291001Au<Integer> c291001Au9, C291001Au<Boolean> c291001Au10, C291001Au<Boolean> c291001Au11, C291001Au<HomePageResponse.ResponseData> c291001Au12) {
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

    public static C506350JtR LIZ(C506350JtR c506350JtR, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C291001Au c291001Au8, C291001Au c291001Au9, C291001Au c291001Au10, C291001Au c291001Au11, C291001Au c291001Au12, int i) {
        String str;
        C291001Au c291001Au13 = c291001Au12;
        C291001Au c291001Au14 = c291001Au11;
        C291001Au c291001Au15 = c291001Au10;
        C291001Au c291001Au16 = c291001Au9;
        C291001Au c291001Au17 = c291001Au8;
        C291001Au c291001Au18 = c291001Au7;
        C291001Au c291001Au19 = c291001Au6;
        C291001Au c291001Au20 = c291001Au5;
        C291001Au c291001Au21 = c291001Au4;
        C291001Au c291001Au22 = c291001Au3;
        C291001Au c291001Au23 = c291001Au2;
        C291001Au c291001Au24 = c291001Au;
        if ((i & 1) != 0) {
            str = c506350JtR.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            c291001Au24 = c506350JtR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au23 = c506350JtR.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au22 = c506350JtR.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au21 = c506350JtR.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au20 = c506350JtR.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au19 = c506350JtR.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au18 = c506350JtR.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au17 = c506350JtR.LLJ;
        }
        if ((i & 512) != 0) {
            c291001Au16 = c506350JtR.LLJI;
        }
        if ((i & 1024) != 0) {
            c291001Au15 = c506350JtR.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au14 = c506350JtR.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c291001Au13 = c506350JtR.LLJILJILJ;
        }
        c506350JtR.getClass();
        return new C506350JtR(str, c291001Au24, c291001Au23, c291001Au22, c291001Au21, c291001Au20, c291001Au19, c291001Au18, c291001Au17, c291001Au16, c291001Au15, c291001Au14, c291001Au13);
    }
}
