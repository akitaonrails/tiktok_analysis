package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612160s3S implements InterfaceC636340Oxc<C1612160s3S, C1611880s30> {
    public final C1611580s2W LL;
    public final AbstractC1623806Xk<CollectionDetailModel> LLILLJJLI;
    public final C291001Au<C1611880s30> LLILLL;
    public final C627660Ojc<C1611880s30> LLILZ;
    public final AbstractC1623806Xk<C626160OhC> LLILZIL;
    public final C1611610s2Z LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final AbstractC1623806Xk<PaidContentVideoListResponse> LLJI;
    public final List<PurchaseOption> LLJIJIL;
    public final Integer LLJILJIL;
    public final Integer LLJILJILJ;
    public final boolean LLJILLL;
    public final AbstractC1623806Xk<String> LLJJ;
    public final AbstractC1623806Xk<CollectionDetailModel> LLJJI;
    public final Set<Long> LLJJIII;
    public final boolean LLJJIJI;

    public C1612160s3S() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612160s3S)) {
            return false;
        }
        C1612160s3S c1612160s3S = (C1612160s3S) obj;
        return Intrinsics.LJFF(this.LL, c1612160s3S.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1612160s3S.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1612160s3S.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1612160s3S.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1612160s3S.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1612160s3S.LLILZLL) && this.LLIZ == c1612160s3S.LLIZ && this.LLIZLLLIL == c1612160s3S.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1612160s3S.LLJ) && Intrinsics.LJFF(this.LLJI, c1612160s3S.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1612160s3S.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1612160s3S.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1612160s3S.LLJILJILJ) && this.LLJILLL == c1612160s3S.LLJILLL && Intrinsics.LJFF(this.LLJJ, c1612160s3S.LLJJ) && Intrinsics.LJFF(this.LLJJI, c1612160s3S.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c1612160s3S.LLJJIII) && this.LLJJIJI == c1612160s3S.LLJJIJI;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<C1611880s30> c291001Au = this.LLILLL;
        int iHashCode2 = (((((((((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLJ;
        int iHashCode3 = (((iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31) + this.LLJI.hashCode()) * 31;
        List<PurchaseOption> list = this.LLJIJIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.LLJILJIL;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJILJILJ;
        return ((((((((((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + this.LLJJ.hashCode()) * 31) + this.LLJJI.hashCode()) * 31) + this.LLJJIII.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIJI);
    }

    public final String toString() {
        return "PaidContentDetailVideoListState(statusViewLoadingState=" + this.LL + ", collectionDetailModel=" + this.LLILLJJLI + ", clickVideoToPurchaseEvent=" + this.LLILLL + ", listState=" + this.LLILZ + ", loadMoreState=" + this.LLILZIL + ", footerViewState=" + this.LLILZLL + ", shouldRetryAfterPurchase=" + this.LLIZ + ", isFavorite=" + this.LLIZLLLIL + ", showToastEvent=" + this.LLJ + ", continueWatchInfoResponse=" + this.LLJI + ", purchaseOptions=" + this.LLJIJIL + ", preselectIndex=" + this.LLJILJIL + ", firstUnpurchasedSeqId=" + this.LLJILJILJ + ", enableSingleVideoPurchase=" + this.LLJILLL + ", singlePrice=" + this.LLJJ + ", collectionDetailPollResponse=" + this.LLJJI + ", optimisticallyUnlockedVideos=" + this.LLJJIII + ", refund=" + this.LLJJIJI + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1611880s30> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public final C627660Ojc<C1611880s30> getListState() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC636270OxV
    public final AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return this.LLILZIL;
    }

    public C1612160s3S(int i) {
        C1611580s2W c1611580s2W = new C1611580s2W(false, false, false, 0, false, 31);
        C491101vh c491101vh = C491101vh.LIZ;
        this(c1611580s2W, c491101vh, null, new C627660Ojc(null, null, null, null, 15), c491101vh, new C1611610s2Z(false, false), false, false, null, c491101vh, null, null, null, false, c491101vh, c491101vh, C08CX.INSTANCE, false);
    }

    public C1612160s3S(C1611580s2W c1611580s2W, AbstractC1623806Xk<CollectionDetailModel> abstractC1623806Xk, C291001Au<C1611880s30> c291001Au, C627660Ojc<C1611880s30> c627660Ojc, AbstractC1623806Xk<C626160OhC> abstractC1623806Xk2, C1611610s2Z c1611610s2Z, boolean z, boolean z2, C291001Au<Boolean> c291001Au2, AbstractC1623806Xk<PaidContentVideoListResponse> abstractC1623806Xk3, List<PurchaseOption> list, Integer num, Integer num2, boolean z3, AbstractC1623806Xk<String> abstractC1623806Xk4, AbstractC1623806Xk<CollectionDetailModel> abstractC1623806Xk5, Set<Long> set, boolean z4) {
        this.LL = c1611580s2W;
        this.LLILLJJLI = abstractC1623806Xk;
        this.LLILLL = c291001Au;
        this.LLILZ = c627660Ojc;
        this.LLILZIL = abstractC1623806Xk2;
        this.LLILZLL = c1611610s2Z;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = c291001Au2;
        this.LLJI = abstractC1623806Xk3;
        this.LLJIJIL = list;
        this.LLJILJIL = num;
        this.LLJILJILJ = num2;
        this.LLJILLL = z3;
        this.LLJJ = abstractC1623806Xk4;
        this.LLJJI = abstractC1623806Xk5;
        this.LLJJIII = set;
        this.LLJJIJI = z4;
    }

    public static C1612160s3S LIZ(C1612160s3S c1612160s3S, C1611580s2W c1611580s2W, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, C627660Ojc c627660Ojc, C1611610s2Z c1611610s2Z, boolean z, boolean z2, C291001Au c291001Au2, C1623606Xi c1623606Xi, List list, Integer num, Integer num2, boolean z3, C1623606Xi c1623606Xi2, AbstractC1623806Xk abstractC1623806Xk2, Set set, int i) {
        AbstractC1623806Xk<C626160OhC> abstractC1623806Xk3;
        boolean z4;
        AbstractC1623806Xk<String> abstractC1623806Xk4 = c1623606Xi2;
        boolean z5 = z3;
        Integer num3 = num2;
        List list2 = list;
        Set set2 = set;
        AbstractC1623806Xk<PaidContentVideoListResponse> abstractC1623806Xk5 = c1623606Xi;
        C291001Au c291001Au3 = c291001Au2;
        boolean z6 = z2;
        boolean z7 = z;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au4 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk;
        C1611610s2Z c1611610s2Z2 = c1611610s2Z;
        Integer num4 = num;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk2;
        C1611580s2W c1611580s2W2 = c1611580s2W;
        if ((i & 1) != 0) {
            c1611580s2W2 = c1612160s3S.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk6 = c1612160s3S.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au4 = c1612160s3S.LLILLL;
        }
        if ((i & 8) != 0) {
            c627660Ojc2 = c1612160s3S.LLILZ;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk3 = c1612160s3S.LLILZIL;
        } else {
            abstractC1623806Xk3 = null;
        }
        if ((i & 32) != 0) {
            c1611610s2Z2 = c1612160s3S.LLILZLL;
        }
        if ((i & 64) != 0) {
            z7 = c1612160s3S.LLIZ;
        }
        if ((i & 128) != 0) {
            z6 = c1612160s3S.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au3 = c1612160s3S.LLJ;
        }
        if ((i & 512) != 0) {
            abstractC1623806Xk5 = c1612160s3S.LLJI;
        }
        if ((i & 1024) != 0) {
            list2 = c1612160s3S.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num4 = c1612160s3S.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = c1612160s3S.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            z5 = c1612160s3S.LLJILLL;
        }
        if ((i & 16384) != 0) {
            abstractC1623806Xk4 = c1612160s3S.LLJJ;
        }
        if ((32768 & i) != 0) {
            abstractC1623806Xk7 = c1612160s3S.LLJJI;
        }
        if ((65536 & i) != 0) {
            set2 = c1612160s3S.LLJJIII;
        }
        if ((i & 131072) != 0) {
            z4 = c1612160s3S.LLJJIJI;
        } else {
            z4 = false;
        }
        c1612160s3S.getClass();
        return new C1612160s3S(c1611580s2W2, abstractC1623806Xk6, c291001Au4, c627660Ojc2, abstractC1623806Xk3, c1611610s2Z2, z7, z6, c291001Au3, abstractC1623806Xk5, list2, num4, num3, z5, abstractC1623806Xk4, abstractC1623806Xk7, set2, z4);
    }
}
