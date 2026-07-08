package X;

import com.ss.android.ugc.aweme.series.feed.api.SeriesCenterListResponse;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterBannerConfig;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573270r2j implements InterfaceC636340Oxc<Object, C1573150r2X> {
    public final boolean LL;
    public C1567820qtw<EnumC1573280r2k> LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final SeriesCenterCenterScene LLILZLL;
    public final List<SeriesCenterCenterScene> LLIZ;
    public final SeriesCenterListResponse LLIZLLLIL;
    public final SeriesCenterBannerConfig LLJ;
    public final C627660Ojc<C1573150r2X> LLJI;

    public C1573270r2j() {
        this(null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1573270r2j)) {
            return false;
        }
        C1573270r2j c1573270r2j = (C1573270r2j) obj;
        return this.LL == c1573270r2j.LL && Intrinsics.LJFF(this.LLILLJJLI, c1573270r2j.LLILLJJLI) && this.LLILLL == c1573270r2j.LLILLL && this.LLILZ == c1573270r2j.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1573270r2j.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1573270r2j.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1573270r2j.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1573270r2j.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1573270r2j.LLJ) && Intrinsics.LJFF(this.LLJI, c1573270r2j.LLJI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C1567820qtw<EnumC1573280r2k> c1567820qtw = this.LLILLJJLI;
        int iHashCode = (((((((iZ2 + (c1567820qtw == null ? 0 : c1567820qtw.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31;
        SeriesCenterCenterScene seriesCenterCenterScene = this.LLILZLL;
        int iHashCode2 = (((iHashCode + (seriesCenterCenterScene == null ? 0 : seriesCenterCenterScene.hashCode())) * 31) + this.LLIZ.hashCode()) * 31;
        SeriesCenterListResponse seriesCenterListResponse = this.LLIZLLLIL;
        int iHashCode3 = (iHashCode2 + (seriesCenterListResponse == null ? 0 : seriesCenterListResponse.hashCode())) * 31;
        SeriesCenterBannerConfig seriesCenterBannerConfig = this.LLJ;
        return ((iHashCode3 + (seriesCenterBannerConfig != null ? seriesCenterBannerConfig.hashCode() : 0)) * 31) + this.LLJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterMainPageState(isLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mainPageStatusState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pendingAllTabManualRefresh=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", selectedCategory=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", currentScene=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", scenes=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", bannerConfig=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", listState=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public final List<C1573150r2X> getListItemState() {
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
    public final C627660Ojc<C1573150r2X> getListState() {
        return this.LLJI;
    }

    public C1573270r2j(String str, SeriesCenterCenterScene seriesCenterCenterScene, int i) {
        int i2;
        C13BV c13bv;
        C627660Ojc c627660Ojc;
        SeriesCenterCenterScene seriesCenterCenterScene2 = seriesCenterCenterScene;
        String str2 = str;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        str2 = (i & 16) != 0 ? "" : str2;
        seriesCenterCenterScene2 = (i & 32) != 0 ? null : seriesCenterCenterScene2;
        if ((i & 64) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 512) != 0) {
            c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        } else {
            c627660Ojc = null;
        }
        this(false, null, false, i2, str2, seriesCenterCenterScene2, c13bv, null, null, c627660Ojc);
    }

    public C1573270r2j(boolean z, C1567820qtw<EnumC1573280r2k> c1567820qtw, boolean z2, int i, String str, SeriesCenterCenterScene seriesCenterCenterScene, List<SeriesCenterCenterScene> list, SeriesCenterListResponse seriesCenterListResponse, SeriesCenterBannerConfig seriesCenterBannerConfig, C627660Ojc<C1573150r2X> c627660Ojc) {
        this.LL = z;
        this.LLILLJJLI = c1567820qtw;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = str;
        this.LLILZLL = seriesCenterCenterScene;
        this.LLIZ = list;
        this.LLIZLLLIL = seriesCenterListResponse;
        this.LLJ = seriesCenterBannerConfig;
        this.LLJI = c627660Ojc;
    }

    public static C1573270r2j LIZ(C1573270r2j c1573270r2j, C1567820qtw c1567820qtw, boolean z, int i, String str, SeriesCenterCenterScene seriesCenterCenterScene, List list, SeriesCenterListResponse seriesCenterListResponse, SeriesCenterBannerConfig seriesCenterBannerConfig, C627660Ojc c627660Ojc, int i2) {
        boolean z2;
        C627660Ojc c627660Ojc2 = c627660Ojc;
        SeriesCenterBannerConfig seriesCenterBannerConfig2 = seriesCenterBannerConfig;
        SeriesCenterListResponse seriesCenterListResponse2 = seriesCenterListResponse;
        List list2 = list;
        SeriesCenterCenterScene seriesCenterCenterScene2 = seriesCenterCenterScene;
        String str2 = str;
        int i3 = i;
        boolean z3 = z;
        C1567820qtw c1567820qtw2 = c1567820qtw;
        if ((i2 & 1) != 0) {
            z2 = c1573270r2j.LL;
        } else {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            c1567820qtw2 = c1573270r2j.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z3 = c1573270r2j.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c1573270r2j.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str2 = c1573270r2j.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            seriesCenterCenterScene2 = c1573270r2j.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            list2 = c1573270r2j.LLIZ;
        }
        if ((i2 & 128) != 0) {
            seriesCenterListResponse2 = c1573270r2j.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            seriesCenterBannerConfig2 = c1573270r2j.LLJ;
        }
        if ((i2 & 512) != 0) {
            c627660Ojc2 = c1573270r2j.LLJI;
        }
        c1573270r2j.getClass();
        return new C1573270r2j(z2, c1567820qtw2, z3, i3, str2, seriesCenterCenterScene2, list2, seriesCenterListResponse2, seriesCenterBannerConfig2, c627660Ojc2);
    }
}
