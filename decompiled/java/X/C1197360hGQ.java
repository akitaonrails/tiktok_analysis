package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197360hGQ implements InterfaceC636340Oxc<C1197360hGQ, C1198620hIS> {
    public final boolean LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final C291001Au<Boolean> LLIZ;
    public final C627660Ojc<C1198620hIS> LLIZLLLIL;
    public final PoiSearchApi.PoiSearchResultWrapper LLJ;
    public final C1197570hGl LLJI;
    public final C1197570hGl LLJIJIL;
    public final C1193740hAa LLJILJIL;
    public final AbstractC1623806Xk<Unit> LLJILJILJ;
    public final String LLJILLL;

    public C1197360hGQ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1197360hGQ)) {
            return false;
        }
        C1197360hGQ c1197360hGQ = (C1197360hGQ) obj;
        return this.LL == c1197360hGQ.LL && Intrinsics.LJFF(this.LLILLJJLI, c1197360hGQ.LLILLJJLI) && this.LLILLL == c1197360hGQ.LLILLL && this.LLILZ == c1197360hGQ.LLILZ && this.LLILZIL == c1197360hGQ.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1197360hGQ.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1197360hGQ.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1197360hGQ.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1197360hGQ.LLJ) && Intrinsics.LJFF(this.LLJI, c1197360hGQ.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1197360hGQ.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1197360hGQ.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1197360hGQ.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1197360hGQ.LLJILLL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper = this.LLJ;
        int iHashCode = (iZ2 + (poiSearchResultWrapper == null ? 0 : poiSearchResultWrapper.hashCode())) * 31;
        C1197570hGl c1197570hGl = this.LLJI;
        int iHashCode2 = (iHashCode + (c1197570hGl == null ? 0 : c1197570hGl.hashCode())) * 31;
        C1197570hGl c1197570hGl2 = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (c1197570hGl2 == null ? 0 : c1197570hGl2.hashCode())) * 31;
        C1193740hAa c1193740hAa = this.LLJILJIL;
        int iHashCode4 = (((iHashCode3 + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31) + this.LLJILJILJ.hashCode()) * 31;
        String str = this.LLJILLL;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PoiCreatorState(showSettleInBanner=" + this.LL + ", showPromoteStoresTab=" + this.LLILLJJLI + ", showPromoteStoresTabBanner=" + this.LLILLL + ", afterSettleInSuccess=" + this.LLILZ + ", promoteStoresNumber=" + this.LLILZIL + ", loading=" + this.LLILZLL + ", error=" + this.LLIZ + ", listState=" + this.LLIZLLLIL + ", promoteStoresResult=" + this.LLJ + ", onboardingBannerInfo=" + this.LLJI + ", entranceBannerInfo=" + this.LLJIJIL + ", prfNetworkData=" + this.LLJILJIL + ", promoteStoresTabState=" + this.LLJILJILJ + ", keyword=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1198620hIS> getListItemState() {
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
    public final C627660Ojc<C1198620hIS> getListState() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1197360hGQ(int i) {
        Boolean bool = Boolean.FALSE;
        this(false, new C291001Au(bool), false, false, 0, new C291001Au(bool), new C291001Au(bool), new C627660Ojc(null, null, null, null, 15), null, null, null, null, C491101vh.LIZ, null);
    }

    public C1197360hGQ(boolean z, C291001Au<Boolean> c291001Au, boolean z2, boolean z3, int i, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C627660Ojc<C1198620hIS> c627660Ojc, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, C1197570hGl c1197570hGl, C1197570hGl c1197570hGl2, C1193740hAa c1193740hAa, AbstractC1623806Xk<Unit> abstractC1623806Xk, String str) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = i;
        this.LLILZLL = c291001Au2;
        this.LLIZ = c291001Au3;
        this.LLIZLLLIL = c627660Ojc;
        this.LLJ = poiSearchResultWrapper;
        this.LLJI = c1197570hGl;
        this.LLJIJIL = c1197570hGl2;
        this.LLJILJIL = c1193740hAa;
        this.LLJILJILJ = abstractC1623806Xk;
        this.LLJILLL = str;
    }

    public static C1197360hGQ LIZ(C1197360hGQ c1197360hGQ, boolean z, C291001Au c291001Au, boolean z2, boolean z3, int i, C291001Au c291001Au2, C291001Au c291001Au3, C627660Ojc c627660Ojc, PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper, C1197570hGl c1197570hGl, C1197570hGl c1197570hGl2, C1193740hAa c1193740hAa, AbstractC1623806Xk abstractC1623806Xk, String str, int i2) {
        String str2 = str;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        C1197570hGl c1197570hGl3 = c1197570hGl2;
        C1197570hGl c1197570hGl4 = c1197570hGl;
        PoiSearchApi.PoiSearchResultWrapper poiSearchResultWrapper2 = poiSearchResultWrapper;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        int i3 = i;
        boolean z4 = z3;
        boolean z5 = z2;
        C291001Au c291001Au6 = c291001Au;
        boolean z6 = z;
        if ((i2 & 1) != 0) {
            z6 = c1197360hGQ.LL;
        }
        if ((i2 & 2) != 0) {
            c291001Au6 = c1197360hGQ.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z5 = c1197360hGQ.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z4 = c1197360hGQ.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1197360hGQ.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au5 = c1197360hGQ.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au4 = c1197360hGQ.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c627660Ojc2 = c1197360hGQ.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            poiSearchResultWrapper2 = c1197360hGQ.LLJ;
        }
        if ((i2 & 512) != 0) {
            c1197570hGl4 = c1197360hGQ.LLJI;
        }
        if ((i2 & 1024) != 0) {
            c1197570hGl3 = c1197360hGQ.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c1193740hAa2 = c1197360hGQ.LLJILJIL;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            abstractC1623806Xk2 = c1197360hGQ.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            str2 = c1197360hGQ.LLJILLL;
        }
        c1197360hGQ.getClass();
        return new C1197360hGQ(z6, c291001Au6, z5, z4, i3, c291001Au5, c291001Au4, c627660Ojc2, poiSearchResultWrapper2, c1197570hGl4, c1197570hGl3, c1193740hAa2, abstractC1623806Xk2, str2);
    }
}
