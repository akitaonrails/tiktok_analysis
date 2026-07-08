package X;

import Y.ARunnableS51S0300000_18;
import Y.AfS187S0100000_18;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailSheetAssem;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeSheetAssem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitSheetAssem;
import com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader;
import kotlin.Pair;
import kotlin.jvm.internal.AwS37S1110000_18;

/* JADX INFO: renamed from: X.0hZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209020hZE implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Integer> c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
        }
    }

    public C1209020hZE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1209020hZE c1209020hZE, C09AJ c09aj) {
        C1C7U.LIZ("PoiMapDetailSheetAssem@6cc3.loadAbility$1$onSheetPeekHeightChanged$1");
        C1177790gkr c1177790gkr = ((PoiMapDetailSheetAssem) c1209020hZE.l0).LLJILJIL;
        int iLIZJ = 0;
        if (c1177790gkr != null && c1177790gkr.LIZJ() > 0) {
            C1177790gkr c1177790gkr2 = ((PoiMapDetailSheetAssem) c1209020hZE.l0).LLJILJIL;
            if (c1177790gkr2 != null) {
                iLIZJ = c1177790gkr2.LIZJ();
            }
            c09aj.onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            c09aj.onComplete();
        } else {
            PoiMapDetailSheetAssem poiMapDetailSheetAssem = (PoiMapDetailSheetAssem) c1209020hZE.l0;
            C16G0 c16g0 = poiMapDetailSheetAssem.LLJIJIL;
            if (c16g0 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g0, new ARunnableS51S0300000_18(c16g0, poiMapDetailSheetAssem, (C19482611Ke) c09aj, 3));
            }
        }
        C1C7U.LIZIZ("PoiMapDetailSheetAssem@6cc3.loadAbility$1$onSheetPeekHeightChanged$1");
    }

    public static final void subscribe$1(C1209020hZE c1209020hZE, C09AJ c09aj) {
        C1C7U.LIZ("PoiMapModeSheetAssem@fac7.loadAbility$1$onSheetPeekHeightChanged$1");
        C1177790gkr c1177790gkr = ((PoiMapModeSheetAssem) c1209020hZE.l0).LLJIJIL;
        int iLIZJ = 0;
        if (c1177790gkr != null && c1177790gkr.LIZJ() > 0) {
            C1177790gkr c1177790gkr2 = ((PoiMapModeSheetAssem) c1209020hZE.l0).LLJIJIL;
            if (c1177790gkr2 != null) {
                iLIZJ = c1177790gkr2.LIZJ();
            }
            c09aj.onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            c09aj.onComplete();
        } else {
            PoiMapModeSheetAssem poiMapModeSheetAssem = (PoiMapModeSheetAssem) c1209020hZE.l0;
            C16G0 c16g0 = poiMapModeSheetAssem.LLJI;
            if (c16g0 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g0, new ARunnableS51S0300000_18(c16g0, poiMapModeSheetAssem, (C19482611Ke) c09aj, 4));
            }
        }
        C1C7U.LIZIZ("PoiMapModeSheetAssem@fac7.loadAbility$1$onSheetPeekHeightChanged$1");
    }

    public static final void subscribe$2(C1209020hZE c1209020hZE, C09AJ c09aj) {
        C1C7U.LIZ("PoiRevisitSheetAssem@58b1.loadAbility$1$onSheetPeekHeightChanged$1");
        C1177790gkr c1177790gkr = ((PoiRevisitSheetAssem) c1209020hZE.l0).LLJIJIL;
        int iLIZJ = 0;
        if (c1177790gkr != null && c1177790gkr.LIZJ() > 0) {
            C1177790gkr c1177790gkr2 = ((PoiRevisitSheetAssem) c1209020hZE.l0).LLJIJIL;
            if (c1177790gkr2 != null) {
                iLIZJ = c1177790gkr2.LIZJ();
            }
            c09aj.onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            c09aj.onComplete();
        } else {
            PoiRevisitSheetAssem poiRevisitSheetAssem = (PoiRevisitSheetAssem) c1209020hZE.l0;
            C16G0 c16g0 = poiRevisitSheetAssem.LLJI;
            if (c16g0 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c16g0, new ARunnableS51S0300000_18(c16g0, poiRevisitSheetAssem, (C19482611Ke) c09aj, 5));
            }
        }
        C1C7U.LIZIZ("PoiRevisitSheetAssem@58b1.loadAbility$1$onSheetPeekHeightChanged$1");
    }

    public static final void subscribe$3(C1209020hZE c1209020hZE, C09AJ c09aj) {
        C1C7U.LIZ("PoiPublishRecommendPreloader@3109.getLocation$1");
        if (((PoiPublishRecommendPreloader) c1209020hZE.l0).locationPermissionManager.LIZJ()) {
            C01GW c01gw = C1198600hIQ.LIZ;
            TokenCert.Companion companion = TokenCert.Companion;
            TokenCert tokenCertWith = companion.with("bpea-publish_recommond_poi_preload_android_location");
            tokenCertWith.auth("mttu");
            TokenCert tokenCertWith2 = companion.with("bpea-publish_recommond_poi_preload_location_android_decrypt");
            tokenCertWith2.auth("mckd");
            Pair pair = new Pair(tokenCertWith, tokenCertWith2);
            AbstractC1202400hOY abstractC1202400hOY = (AbstractC1202400hOY) pair.getFirst();
            AbstractC1202400hOY abstractC1202400hOY2 = (AbstractC1202400hOY) pair.getSecond();
            C1199650hK7 c1199650hK7 = C1199650hK7.LIZ;
            c1199650hK7.getClass();
            c1199650hK7.LIZJ("fetch_gps_request", null);
            final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
            C1207450hWh.LIZ.LJIIL("poi", "add_location", abstractC1202400hOY, abstractC1202400hOY2, new InterfaceC687820QyS() { // from class: X.0hK2
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    C1199650hK7 c1199650hK72 = C1199650hK7.LIZ;
                    c1199650hK72.getClass();
                    c1199650hK72.LIZJ("fetch_gps_result", new AwS37S1110000_18((Integer) null, (String) null, true, 0));
                    c19482611Ke.onNext(locationData);
                    c19482611Ke.onComplete();
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                    C1199650hK7 c1199650hK72 = C1199650hK7.LIZ;
                    Integer numValueOf = Integer.valueOf(i);
                    c1199650hK72.getClass();
                    c1199650hK72.LIZJ("fetch_gps_result", new AwS37S1110000_18(numValueOf, str, false, 0));
                    C09AJ<LocationData> c09aj2 = c19482611Ke;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Location error: ");
                    sbLIZ.append(str);
                    c09aj2.onError(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
                }
            }, -1L);
        } else {
            C1199650hK7 c1199650hK72 = C1199650hK7.LIZ;
            c1199650hK72.getClass();
            c1199650hK72.LIZJ("fetch_gps_result", new AwS37S1110000_18((Integer) (-1), "no permission", false, 0));
            c09aj.onError(new Throwable("Location permission not granted"));
        }
        C1C7U.LIZIZ("PoiPublishRecommendPreloader@3109.getLocation$1");
    }

    public static final void subscribe$4(C1209020hZE c1209020hZE, C09AJ c09aj) {
        C1C7U.LIZ("SlashDataProcessor@f64e.preload$1");
        C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
        ((InterfaceC1164230gOz) c1209020hZE.l0).preload().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS187S0100000_18(c19482611Ke, 41), new AfS187S0100000_18(c19482611Ke, 42), new C1208880hZ0(c19482611Ke, 3));
        C1C7U.LIZIZ("SlashDataProcessor@f64e.preload$1");
    }
}
