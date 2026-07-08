package X;

import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199800hKM implements InterfaceC0148002o {
    public final AbstractC1623806Xk<PoiSearchApi.PoiSearchResultWrapper> LL;
    public final PoiData LLILLJJLI;
    public final Boolean LLILLL;
    public final EnumC1200290hL9 LLILZ;
    public final C1193740hAa LLILZIL;
    public final C291001Au<Boolean> LLILZLL;
    public final Boolean LLIZ;
    public final C291001Au<Unit> LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final PoiVideoUnderstandResponse LLJI;
    public final String LLJIJIL;

    public C1199800hKM() {
        this(null, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199800hKM)) {
            return false;
        }
        C1199800hKM c1199800hKM = (C1199800hKM) obj;
        return Intrinsics.LJFF(this.LL, c1199800hKM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1199800hKM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1199800hKM.LLILLL) && this.LLILZ == c1199800hKM.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1199800hKM.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1199800hKM.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1199800hKM.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1199800hKM.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1199800hKM.LLJ) && Intrinsics.LJFF(this.LLJI, c1199800hKM.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1199800hKM.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        PoiData poiData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (poiData == null ? 0 : poiData.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        EnumC1200290hL9 enumC1200290hL9 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (enumC1200290hL9 == null ? 0 : enumC1200290hL9.hashCode())) * 31;
        C1193740hAa c1193740hAa = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (c1193740hAa == null ? 0 : c1193740hAa.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        Boolean bool2 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C291001Au<Unit> c291001Au = this.LLIZLLLIL;
        int iHashCode7 = (((iHashCode6 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        PoiVideoUnderstandResponse poiVideoUnderstandResponse = this.LLJI;
        int iHashCode8 = (iHashCode7 + (poiVideoUnderstandResponse == null ? 0 : poiVideoUnderstandResponse.hashCode())) * 31;
        String str = this.LLJIJIL;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PoiPublishExtensionState(searchResult=" + this.LL + ", poiItemSelected=" + this.LLILLJJLI + ", locateSuccessful=" + this.LLILLL + ", permissionStatus=" + this.LLILZ + ", prfNetworkData=" + this.LLILZIL + ", stayInPostWhenBackFromEducation=" + this.LLILZLL + ", showCreatorIntroSheet=" + this.LLIZ + ", defaultClicked=" + this.LLIZLLLIL + ", refreshRcmdList=" + this.LLJ + ", videoUnderstandResponse=" + this.LLJI + ", trackID=" + this.LLJIJIL + ')';
    }

    public /* synthetic */ C1199800hKM(EnumC1200290hL9 enumC1200290hL9, int i) {
        C491101vh c491101vh;
        C291001Au c291001Au;
        EnumC1200290hL9 enumC1200290hL92 = enumC1200290hL9;
        if ((i & 1) != 0) {
            c491101vh = C491101vh.LIZ;
        } else {
            c491101vh = null;
        }
        enumC1200290hL92 = (i & 8) != 0 ? null : enumC1200290hL92;
        if ((i & 32) != 0) {
            c291001Au = new C291001Au(Boolean.FALSE);
        } else {
            c291001Au = null;
        }
        this(c491101vh, null, null, enumC1200290hL92, null, c291001Au, null, null, (i & 256) != 0 ? new C291001Au(Boolean.FALSE) : null, null, null);
    }

    public C1199800hKM(AbstractC1623806Xk<PoiSearchApi.PoiSearchResultWrapper> abstractC1623806Xk, PoiData poiData, Boolean bool, EnumC1200290hL9 enumC1200290hL9, C1193740hAa c1193740hAa, C291001Au<Boolean> c291001Au, Boolean bool2, C291001Au<Unit> c291001Au2, C291001Au<Boolean> c291001Au3, PoiVideoUnderstandResponse poiVideoUnderstandResponse, String str) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = poiData;
        this.LLILLL = bool;
        this.LLILZ = enumC1200290hL9;
        this.LLILZIL = c1193740hAa;
        this.LLILZLL = c291001Au;
        this.LLIZ = bool2;
        this.LLIZLLLIL = c291001Au2;
        this.LLJ = c291001Au3;
        this.LLJI = poiVideoUnderstandResponse;
        this.LLJIJIL = str;
    }

    public static C1199800hKM LIZ(C1199800hKM c1199800hKM, AbstractC1623806Xk abstractC1623806Xk, PoiData poiData, Boolean bool, EnumC1200290hL9 enumC1200290hL9, C1193740hAa c1193740hAa, C291001Au c291001Au, Boolean bool2, C291001Au c291001Au2, C291001Au c291001Au3, String str, int i) {
        PoiVideoUnderstandResponse poiVideoUnderstandResponse;
        String str2 = str;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        Boolean bool3 = bool2;
        C291001Au c291001Au6 = c291001Au;
        C1193740hAa c1193740hAa2 = c1193740hAa;
        EnumC1200290hL9 enumC1200290hL92 = enumC1200290hL9;
        Boolean bool4 = bool;
        PoiData poiData2 = poiData;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk2 = c1199800hKM.LL;
        }
        if ((i & 2) != 0) {
            poiData2 = c1199800hKM.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool4 = c1199800hKM.LLILLL;
        }
        if ((i & 8) != 0) {
            enumC1200290hL92 = c1199800hKM.LLILZ;
        }
        if ((i & 16) != 0) {
            c1193740hAa2 = c1199800hKM.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au6 = c1199800hKM.LLILZLL;
        }
        if ((i & 64) != 0) {
            bool3 = c1199800hKM.LLIZ;
        }
        if ((i & 128) != 0) {
            c291001Au5 = c1199800hKM.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            c291001Au4 = c1199800hKM.LLJ;
        }
        if ((i & 512) != 0) {
            poiVideoUnderstandResponse = c1199800hKM.LLJI;
        } else {
            poiVideoUnderstandResponse = null;
        }
        if ((i & 1024) != 0) {
            str2 = c1199800hKM.LLJIJIL;
        }
        c1199800hKM.getClass();
        return new C1199800hKM(abstractC1623806Xk2, poiData2, bool4, enumC1200290hL92, c1193740hAa2, c291001Au6, bool3, c291001Au5, c291001Au4, poiVideoUnderstandResponse, str2);
    }
}
