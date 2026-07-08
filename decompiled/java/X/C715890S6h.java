package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715890S6h implements InterfaceC0148002o {
    public final C291001Au<SpannableStringBuilder> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final C291001Au<Pair<Aweme, PostModeEntranceMechanism>> LLIZ;
    public final C291001Au<Boolean> LLIZLLLIL;
    public final C0S64 LLJ;
    public final C0S7K LLJI;

    public C715890S6h() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C715890S6h)) {
            return false;
        }
        C715890S6h c715890S6h = (C715890S6h) obj;
        return Intrinsics.LJFF(this.LL, c715890S6h.LL) && this.LLILLJJLI == c715890S6h.LLILLJJLI && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LLILLL, c715890S6h.LLILLL) && Intrinsics.LJFF(this.LLILZ, c715890S6h.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c715890S6h.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c715890S6h.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c715890S6h.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c715890S6h.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c715890S6h.LLJ) && Intrinsics.LJFF(this.LLJI, c715890S6h.LLJI);
    }

    public final int hashCode() {
        C291001Au<SpannableStringBuilder> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31 * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Integer> c291001Au5 = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Pair<Aweme, PostModeEntranceMechanism>> c291001Au6 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (c291001Au6 == null ? 0 : c291001Au6.hashCode())) * 31;
        C291001Au<Boolean> c291001Au7 = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (c291001Au7 == null ? 0 : c291001Au7.hashCode())) * 31;
        C0S64 c0s64 = this.LLJ;
        int iHashCode8 = (iHashCode7 + (c0s64 == null ? 0 : c0s64.hashCode())) * 31;
        C0S7K c0s7k = this.LLJI;
        return iHashCode8 + (c0s7k != null ? c0s7k.hashCode() : 0);
    }

    public final String toString() {
        return "VideoDescState(sync2StateEvent=" + this.LL + ", isShowSplitVideoPartDescForFeed=" + this.LLILLJJLI + ", toggleAnimationState=null, needOperateDesc=" + this.LLILLL + ", showNoNetWorkToast=" + this.LLILZ + ", foldTagClicked=" + this.LLILZIL + ", forwardPageSelectedEvent=" + this.LLILZLL + ", requestNavigationToPhotoModeDetailPageEvent=" + this.LLIZ + ", descExpandSwitch=" + this.LLIZLLLIL + ", translData=" + this.LLJ + ", descTransResult=" + this.LLJI + ')';
    }

    public /* synthetic */ C715890S6h(int i) {
        this(null, false, null, null, null, null, null, null, null, null);
    }

    public C715890S6h(C291001Au c291001Au, boolean z, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C0S64 c0s64, C0S7K c0s7k) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
        this.LLIZLLLIL = c291001Au7;
        this.LLJ = c0s64;
        this.LLJI = c0s7k;
    }

    public static C715890S6h LIZ(C715890S6h c715890S6h, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, C291001Au c291001Au7, C0S64 c0s64, C0S7K c0s7k, int i) {
        boolean z;
        C0S7K c0s7k2 = c0s7k;
        C0S64 c0s642 = c0s64;
        C291001Au c291001Au8 = c291001Au7;
        C291001Au c291001Au9 = c291001Au6;
        C291001Au c291001Au10 = c291001Au5;
        C291001Au c291001Au11 = c291001Au4;
        C291001Au c291001Au12 = c291001Au3;
        C291001Au c291001Au13 = c291001Au2;
        C291001Au c291001Au14 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au14 = c715890S6h.LL;
        }
        if ((i & 2) != 0) {
            z = c715890S6h.LLILLJJLI;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            c715890S6h.getClass();
        }
        if ((i & 8) != 0) {
            c291001Au13 = c715890S6h.LLILLL;
        }
        if ((i & 16) != 0) {
            c291001Au12 = c715890S6h.LLILZ;
        }
        if ((i & 32) != 0) {
            c291001Au11 = c715890S6h.LLILZIL;
        }
        if ((i & 64) != 0) {
            c291001Au10 = c715890S6h.LLILZLL;
        }
        if ((i & 128) != 0) {
            c291001Au9 = c715890S6h.LLIZ;
        }
        if ((i & 256) != 0) {
            c291001Au8 = c715890S6h.LLIZLLLIL;
        }
        if ((i & 512) != 0) {
            c0s642 = c715890S6h.LLJ;
        }
        if ((i & 1024) != 0) {
            c0s7k2 = c715890S6h.LLJI;
        }
        c715890S6h.getClass();
        return new C715890S6h(c291001Au14, z, c291001Au13, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c0s642, c0s7k2);
    }
}
