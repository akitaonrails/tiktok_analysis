package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S2400100_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763780w00 {
    public static final C1763780w00 LIZ = new C1763780w00();

    public static C1765530w2p LIZ(final Context context, List list, final IPdpStarter.PdpEnterParam pdpEnterParam, final String str, boolean z, final Function1 function1) {
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        String strValueOf;
        Object obj;
        Map<String, Object> map;
        String productId;
        Map<String, Object> map2;
        boolean z2;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcomSearchDependencyService.class);
        }
        final IEcomSearchDependencyService iEcomSearchDependencyService = (IEcomSearchDependencyService) anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        final View similarPhotoSearchView = iEcomSearchDependencyService.getSimilarPhotoSearchView(context);
        if (similarPhotoSearchView == null) {
            return null;
        }
        boolean zBooleanValue = ((Boolean) C285840BIg.LIZ.getValue()).booleanValue();
        int iLIZ = C293640Bf8.LIZ();
        if (!zBooleanValue && iLIZ == 0) {
            return null;
        }
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            Object obj2 = map2.get("search_entrance");
            if (obj2 == null || (strValueOf = obj2.toString()) == null || strValueOf.length() <= 0) {
                strValueOf = String.valueOf(map2.get("enter_from_info"));
            }
        } else {
            strValueOf = null;
        }
        String str2 = "";
        if (strValueOf == null) {
            strValueOf = "";
        }
        if (pdpEnterParam != null && (productId = pdpEnterParam.getProductId()) != null) {
            str2 = productId;
        }
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            obj = map.get("track_id");
        } else {
            obj = null;
        }
        final PhotoSearchPdpEnterParams photoSearchPdpEnterParams = new PhotoSearchPdpEnterParams(strValueOf, "product_detail", "pdp_main_pic", str2, String.valueOf(obj), null, null);
        InterfaceC1765560w2s interfaceC1765560w2s = new InterfaceC1765560w2s() { // from class: X.0vzz
            @Override // X.InterfaceC1765560w2s
            public final void onShow(int i) throws JSONException {
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                PhotoSearchPdpEnterParams photoSearchPdpEnterParams2 = photoSearchPdpEnterParams;
                jSONObject.put("search_entrance", photoSearchPdpEnterParams2.searchEntrance);
                jSONObject.put("page_name", photoSearchPdpEnterParams2.pageName);
                jSONObject.put("raw_photo_source", photoSearchPdpEnterParams2.rawPhotoSource);
                jSONObject.put("enter_product_id", photoSearchPdpEnterParams2.enterProductId);
                jSONObject.put("track_id", photoSearchPdpEnterParams2.trackId);
                jSONObject.put("rank", i + 1);
                jSONObject.put("enter_from", "product_detail");
                jSONObject.put("enter_from_second", "product_detail");
                jSONObject.put("photo_search_module", "main_image_find_similar");
                jSONObject.put("photo_search_previous_page", "product_detail");
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("find_similar_tab_show", jSONObject);
            }

            @Override // X.InterfaceC1765560w2s
            public final void LIZ(View view, AbstractC1763110vyv abstractC1763110vyv, int i) throws JSONException {
                String str3;
                View view2;
                if (!C0XF1.LIZLLL(context)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(similarPhotoSearchView);
                    c1389890mGx.LJIIIZ(2131835933);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                if (abstractC1763110vyv.LIZIZ() == EnumC1761790vwn.PHOTO || abstractC1763110vyv.LIZIZ() == EnumC1761790vwn.PHOTO_INFO) {
                    if (!(abstractC1763110vyv instanceof C1762980vyi)) {
                        if (abstractC1763110vyv instanceof C1762960vyg) {
                            if (abstractC1763110vyv instanceof C1762960vyg) {
                                str3 = ((C1762960vyg) abstractC1763110vyv).LJ;
                            } else {
                                str3 = "";
                            }
                        } else {
                            return;
                        }
                    } else {
                        str3 = ((C1762980vyi) abstractC1763110vyv).LJ;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    PhotoSearchPdpEnterParams photoSearchPdpEnterParams2 = photoSearchPdpEnterParams;
                    jSONObject.put("search_entrance", photoSearchPdpEnterParams2.searchEntrance);
                    jSONObject.put("page_name", photoSearchPdpEnterParams2.pageName);
                    jSONObject.put("raw_photo_source", photoSearchPdpEnterParams2.rawPhotoSource);
                    jSONObject.put("enter_product_id", photoSearchPdpEnterParams2.enterProductId);
                    jSONObject.put("track_id", photoSearchPdpEnterParams2.trackId);
                    jSONObject.put("rank", i + 1);
                    jSONObject.put("enter_from", "product_detail");
                    jSONObject.put("enter_from_second", "product_detail");
                    jSONObject.put("photo_search_module", "main_image_find_similar");
                    jSONObject.put("photo_search_previous_page", "product_detail");
                    c1507790pL7.getClass();
                    C1507790pL7.LIZLLL("find_similar_tab_click", jSONObject);
                    Object parent = view.getParent();
                    if ((parent instanceof FrameLayout) && (view2 = (View) parent) != null) {
                        photoSearchPdpEnterParams.setScreenHeight(Integer.valueOf(view2.getHeight()));
                    }
                    AwS1S2400100_26 awS1S2400100_26 = new AwS1S2400100_26(iEcomSearchDependencyService, context, pdpEnterParam, photoSearchPdpEnterParams, str3, jCurrentTimeMillis, str, 0);
                    if (function1 != null && C0BT6.LIZIZ()) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C05E1(i, null, awS1S2400100_26, function1), 3);
                    } else {
                        awS1S2400100_26.invoke(null);
                    }
                }
            }
        };
        if (!zBooleanValue && iLIZ != 1) {
            if (iLIZ != 2) {
                return null;
            }
            C1765540w2q c1765540w2q = new C1765540w2q(similarPhotoSearchView, list, interfaceC1765560w2s, zBooleanValue, 2, (Boolean) null, 96);
            c1765540w2q.LLJIJIL = z;
            return c1765540w2q;
        }
        C1765530w2p c1765530w2p = new C1765530w2p(similarPhotoSearchView, list, interfaceC1765560w2s, zBooleanValue, iLIZ);
        c1765530w2p.LLJIJIL = z;
        return c1765530w2p;
    }
}
