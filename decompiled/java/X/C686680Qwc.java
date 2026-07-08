package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdBrandZone;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.BrandZoneCardStruct;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdHybridModel;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686680Qwc implements InterfaceC686700Qwe, InterfaceC686720Qwg {
    public long LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    @Override // X.InterfaceC686720Qwg
    public final void LJ() {
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC686700Qwe
    public final InterfaceC686720Qwg LJI() {
        return this;
    }

    @Override // X.InterfaceC686720Qwg
    public final void LJII() {
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC686700Qwe
    public final void LJIIIIZZ(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
    }

    @Override // X.InterfaceC686720Qwg
    public final void LIZIZ(Aweme aweme) {
        this.LIZJ = true;
        this.LIZ = System.currentTimeMillis();
        LJIILL(aweme);
        LJIIZILJ(aweme);
    }

    @Override // X.InterfaceC686700Qwe
    public final Integer LIZJ(AbstractC655400PnG abstractC655400PnG) {
        C655420PnI c655420PnI;
        int height;
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdHybridModel searchAdHybridModel;
        if (!(abstractC655400PnG instanceof C655420PnI) || (c655420PnI = (C655420PnI) abstractC655400PnG) == null) {
            return null;
        }
        BrandZoneCardStruct brandZoneCardStruct = c655420PnI.LIZ;
        if (brandZoneCardStruct != null && (awemeRawAd = brandZoneCardStruct.rawAdData) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdHybridModel = searchAdInfo.hybridModel) != null) {
            height = searchAdHybridModel.getHeight();
        } else {
            height = 0;
        }
        return Integer.valueOf(height);
    }

    @Override // X.InterfaceC686720Qwg
    public final void LJFF(Aweme aweme) {
        this.LIZIZ = true;
        if (aweme == null) {
            return;
        }
        LJIIZILJ(aweme);
        LJIILL(aweme);
    }

    @Override // X.InterfaceC686720Qwg
    public final void LJIIIZ(Aweme aweme) {
        LJIILLIIL(aweme);
        this.LIZJ = false;
    }

    @Override // X.InterfaceC686700Qwe
    public final void LJIIJJI(Aweme aweme) {
        LJIILLIIL(aweme);
        this.LIZJ = false;
        this.LIZIZ = false;
    }

    public final void LJIILL(Aweme aweme) {
        if (aweme != null && this.LIZIZ && this.LIZJ) {
            SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme);
            C1009980cOC.LIZ.getClass();
            C989080bqU.LIZ(searchAdEventLogger, C1009980cOC.LJJZZIII, aweme, "show");
            this.LIZLLL = this.LIZ;
            this.LJ = true;
            this.LJFF = true;
        }
    }

    public final void LJIILLIIL(Aweme aweme) {
        long j;
        if (aweme != null && this.LIZIZ && this.LIZJ) {
            C238400w2 c238400w2 = new C238400w2();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = this.LIZ;
            if (j2 > 0) {
                c238400w2.element = jCurrentTimeMillis - j2;
            }
            this.LIZ = 0L;
            SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme);
            C1009980cOC.LIZ.getClass();
            searchAdEventLogger.logAd(C1009980cOC.LJJZZI, new AwS595S0100000_16(c238400w2, 351));
            long j3 = this.LIZLLL;
            if (j3 > 0) {
                j = jCurrentTimeMillis - j3;
            } else {
                j = 0;
            }
            LJIILJJIL(j, aweme, !this.LJFF);
            this.LIZLLL = 0L;
            this.LJ = false;
            this.LJFF = false;
        }
    }

    public final void LJIIZILJ(Aweme aweme) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AdBrandZone brandZone;
        if (aweme != null && this.LIZIZ && this.LIZJ && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && (brandZone = awemeRawAdLJJIJLIJ.getBrandZone()) != null) {
            if (Intrinsics.LJFF(brandZone.isDefaultColor(), Boolean.TRUE)) {
                SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme);
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger.logAd(C1009980cOC.LJLI);
            } else {
                SearchAdEventLogger searchAdEventLogger2 = new SearchAdEventLogger(aweme);
                C1009980cOC.LIZ.getClass();
                searchAdEventLogger2.logAd(C1009980cOC.LJL);
            }
        }
    }

    public static String LJIILIIL(Aweme aweme, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('&');
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(aweme.getRequestId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC686700Qwe
    public final n LIZ(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
        C655420PnI c655420PnI;
        BrandZoneCardStruct brandZoneCardStruct;
        Map<String, ? extends List<?>> map;
        Map<String, Object> map2;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Unit unit = null;
        k kVarLJIJJLI = null;
        unit = null;
        if (!(abstractC655400PnG instanceof C655420PnI) || (c655420PnI = (C655420PnI) abstractC655400PnG) == null || (brandZoneCardStruct = c655420PnI.LIZ) == null || (map = brandZoneCardStruct.dynamicAwemeMaps) == null || map.isEmpty()) {
            return null;
        }
        n nVar = new n();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends List<?>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<?> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                h hVar = new h();
                for (Object obj : value) {
                    if (obj instanceof Aweme) {
                        String strLJIILIIL = LJIILIIL((Aweme) obj, key);
                        arrayList.add(strLJIILIIL);
                        hVar.LJJIII(strLJIILIIL);
                    }
                }
                if (hVar.size() > 0) {
                    nVar.LJJIFFI(key, hVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            String strLIZIZ = C309390CAv.LIZIZ(arrayList);
            if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
                awemeRawAdLJJIJLIJ.appendExtraParamInCommercializeSearch("search_ad_brand_zone_dynamic_cache_list", strLIZIZ);
            }
        }
        n nVar2 = new n();
        nVar2.LJJIFFI("dynamic_ad_cache_keys", nVar);
        if (aweme != null) {
            nVar2.LJJIIJ("brand_zone_default_feedback_key", LJIILIIL(aweme, "brand_zone"));
            try {
                AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ2 != null && (map2 = awemeRawAdLJJIJLIJ2.searchTrackPoint) != null) {
                    if (C309390CAv.LIZ == null) {
                        C309390CAv.LIZ = new Gson();
                    }
                    Gson gson = C309390CAv.LIZ;
                    if (gson != null) {
                        kVarLJIJJLI = gson.LJIJJLI(map2);
                    }
                    nVar2.LJJIFFI("search_track_point", kVarLJIJJLI);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
                return nVar2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return nVar2;
    }

    @Override // X.InterfaceC686700Qwe
    public final Aweme LIZLLL(AbstractC655400PnG abstractC655400PnG, Aweme aweme) {
        C655420PnI c655420PnI;
        Integer num;
        AwemeSearchAdModel searchAdInfo;
        Aweme aweme2 = null;
        if (!(abstractC655400PnG instanceof C655420PnI) || (c655420PnI = (C655420PnI) abstractC655400PnG) == null) {
            return null;
        }
        BrandZoneCardStruct brandZoneCardStruct = c655420PnI.LIZ;
        if (brandZoneCardStruct != null) {
            Map<String, ? extends List<?>> map = brandZoneCardStruct.dynamicAwemeMaps;
            AwemeRawAd awemeRawAd = brandZoneCardStruct.rawAdData;
            if (map != null && !map.isEmpty()) {
                if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
                    searchAdInfo.setFeedType(116);
                }
                for (Map.Entry<String, ? extends List<?>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<?> value = entry.getValue();
                    if (value != null && !value.isEmpty()) {
                        for (Object obj : value) {
                            if (obj instanceof Aweme) {
                                Aweme aweme3 = (Aweme) obj;
                                LJIIL(aweme3, key, LJIILIIL(aweme3, key));
                            }
                        }
                    }
                }
                String str = c655420PnI.LIZIZ;
                String str2 = c655420PnI.LIZJ;
                if (awemeRawAd != null) {
                    aweme2 = new Aweme();
                    aweme2.setAid(str);
                    aweme2.setAd(true);
                    aweme2.setAwemeType(0);
                    aweme2.setAwemeRawAd(awemeRawAd);
                    aweme2.setRequestId(str2);
                    AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
                    if (searchAdInfo2 != null && (num = searchAdInfo2.feedType) != null) {
                        num.intValue();
                    }
                    String strLJIILIIL = LJIILIIL(aweme2, "brand_zone");
                    LJIIL(aweme2, strLJIILIIL, strLJIILIIL);
                }
            }
        }
        return aweme2;
    }

    @Override // X.InterfaceC686720Qwg
    public final void LJIIJ(Aweme aweme, boolean z) {
        if (!this.LJ || aweme == null) {
            return;
        }
        long j = this.LIZ;
        if (j != 0) {
            long j2 = this.LIZLLL;
            if (j2 != 0) {
                if (z && j2 == j) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = jCurrentTimeMillis - this.LIZLLL;
                this.LIZLLL = jCurrentTimeMillis;
                this.LJFF = z;
                LJIILJJIL(j3, aweme, z);
            }
        }
    }

    public static void LJIIL(Aweme aweme, String str, String str2) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        AwemeSearchAdModel searchAdInfo;
        C1010440cOw c1010440cOw = new C1010440cOw();
        SAFHelper.LIZ.getClass();
        c1010440cOw.Jt2(new C1010460cOy(aweme, SAFHelper.LJIIIIZZ(null), null, null, null, null, 60));
        AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
        if (awemeRawAdLJJIJLIJ2 != null && (searchAdInfo = awemeRawAdLJJIJLIJ2.getSearchAdInfo()) != null) {
            searchAdInfo.setFeedType(116);
            searchAdInfo.setSearchAdCacheKey(str2);
        }
        if (aweme != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            awemeRawAdLJJIJLIJ.appendExtraParamInCommercializeSearch("bsh_card_area", str);
        }
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL != null) {
            interfaceC657510PqfLIZLLL.LJIIIIZZ(str2, c1010440cOw);
        }
    }

    public static void LJIILJJIL(long j, Aweme aweme, boolean z) {
        if (z) {
            new SearchAdEventLogger(aweme).logAd(C1012010cRT.LIZ, new AwS31S0000100_16(j, 21));
        } else {
            new SearchAdEventLogger(aweme).logAd(C1011990cRR.LIZ, new AwS31S0000100_16(j, 22));
        }
    }
}
