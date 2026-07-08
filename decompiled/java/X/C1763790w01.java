package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecsearch.IEcomSearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.search.saas.EcomSearchDependencyService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S2400100_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763790w01 {
    public static final C1763790w01 LIZ = new C1763790w01();

    public static C1765530w2p LIZ(final Context context, List list, final IPdpStarter.PdpEnterParam pdpEnterParam, final String str, final Function1 function1) {
        AnonymousClass0317 anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin;
        String strValueOf;
        Object obj;
        Object obj2;
        Object obj3;
        Map<String, Object> map;
        Map<String, Object> map2;
        String productId;
        Map<String, Object> map3;
        Map<String, Object> map4;
        boolean z;
        String name;
        boolean z2 = true;
        boolean z3 = false;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin = EcomSearchDependencyService.createIEcomSearchDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IEcomSearchDependencyService.class.getName();
            if (anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIEcomSearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            z2 = true;
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
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
        if (pdpEnterParam != null && (map4 = pdpEnterParam.trackParams) != null) {
            Object obj4 = map4.get("search_entrance");
            if (obj4 == null || (strValueOf = obj4.toString()) == null || strValueOf.length() <= 0) {
                strValueOf = String.valueOf(map4.get("enter_from_info"));
            }
        } else {
            strValueOf = null;
        }
        String str2 = "";
        if (strValueOf == null) {
            strValueOf = "";
        }
        if (pdpEnterParam == null || (map3 = pdpEnterParam.trackParams) == null || (obj = map3.get("page_name")) == null) {
            obj = "picture_detail";
        }
        String string = obj.toString();
        if (pdpEnterParam != null && (productId = pdpEnterParam.getProductId()) != null) {
            str2 = productId;
        }
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            obj2 = map2.get("track_id");
        } else {
            obj2 = null;
        }
        String strValueOf2 = String.valueOf(obj2);
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null) {
            obj3 = map.get("previous_page");
        } else {
            obj3 = null;
        }
        final PhotoSearchPdpEnterParams photoSearchPdpEnterParams = new PhotoSearchPdpEnterParams(strValueOf, string, "pdp_main_pic", str2, strValueOf2, null, String.valueOf(obj3));
        InterfaceC1765560w2s interfaceC1765560w2s = new InterfaceC1765560w2s() { // from class: X.0vzy
            @Override // X.InterfaceC1765560w2s
            public final void onShow(int i) throws JSONException {
                Map<String, Object> map5;
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                JSONObject jSONObject = new JSONObject();
                IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpEnterParam;
                PhotoSearchPdpEnterParams photoSearchPdpEnterParams2 = photoSearchPdpEnterParams;
                if (pdpEnterParam2 != null && (map5 = pdpEnterParam2.trackParams) != null) {
                    for (Map.Entry<String, Object> entry : map5.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("search_entrance", photoSearchPdpEnterParams2.searchEntrance);
                jSONObject.put("page_name", photoSearchPdpEnterParams2.pageName);
                jSONObject.put("previous_page", photoSearchPdpEnterParams2.previousPage);
                jSONObject.put("raw_photo_source", photoSearchPdpEnterParams2.rawPhotoSource);
                jSONObject.put("enter_product_id", photoSearchPdpEnterParams2.enterProductId);
                jSONObject.put("track_id", photoSearchPdpEnterParams2.trackId);
                jSONObject.put("rank", i + 1);
                jSONObject.put("enter_from", "product_detail");
                jSONObject.put("enter_from_second", "product_detail");
                jSONObject.put("photo_search_module", "main_image_find_similar");
                jSONObject.put("photo_search_previous_page", photoSearchPdpEnterParams2.previousPage);
                jSONObject.put("page_show_type", "full_screen");
                jSONObject.put("button_name", "find_similar");
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL("find_similar_tab_show", jSONObject);
            }

            @Override // X.InterfaceC1765560w2s
            public final void LIZ(View view, AbstractC1763110vyv abstractC1763110vyv, int i) throws JSONException {
                String str3;
                View view2;
                Map<String, Object> map5;
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
                    IPdpStarter.PdpEnterParam pdpEnterParam2 = pdpEnterParam;
                    PhotoSearchPdpEnterParams photoSearchPdpEnterParams2 = photoSearchPdpEnterParams;
                    if (pdpEnterParam2 != null && (map5 = pdpEnterParam2.trackParams) != null) {
                        for (Map.Entry<String, Object> entry : map5.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("search_entrance", photoSearchPdpEnterParams2.searchEntrance);
                    jSONObject.put("page_name", photoSearchPdpEnterParams2.pageName);
                    jSONObject.put("previous_page", photoSearchPdpEnterParams2.previousPage);
                    jSONObject.put("raw_photo_source", photoSearchPdpEnterParams2.rawPhotoSource);
                    jSONObject.put("enter_product_id", photoSearchPdpEnterParams2.enterProductId);
                    jSONObject.put("track_id", photoSearchPdpEnterParams2.trackId);
                    jSONObject.put("rank", i + 1);
                    jSONObject.put("enter_from", "product_detail");
                    jSONObject.put("enter_from_second", "product_detail");
                    jSONObject.put("photo_search_module", "main_image_find_similar");
                    jSONObject.put("photo_search_previous_page", photoSearchPdpEnterParams2.previousPage);
                    jSONObject.put("page_show_type", "full_screen");
                    jSONObject.put("button_name", "find_similar");
                    c1507790pL7.getClass();
                    C1507790pL7.LIZLLL("find_similar_tab_click", jSONObject);
                    Object parent = view.getParent();
                    if ((parent instanceof FrameLayout) && (view2 = (View) parent) != null) {
                        photoSearchPdpEnterParams.setScreenHeight(Integer.valueOf(view2.getHeight()));
                    }
                    AwS1S2400100_26 awS1S2400100_26 = new AwS1S2400100_26(iEcomSearchDependencyService, context, pdpEnterParam, photoSearchPdpEnterParams, str3, jCurrentTimeMillis, str, 1);
                    if (function1 != null && C0BT6.LIZIZ()) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C05E2(i, null, awS1S2400100_26, function1), 3);
                    } else {
                        awS1S2400100_26.invoke(null);
                    }
                }
            }
        };
        if (!zBooleanValue && iLIZ != z2) {
            if (iLIZ != 2) {
                return null;
            }
            if (C289740BXg.LIZ()) {
                View viewSd = C786410Ut5.Sd(R.layout.arq, C786410Ut5.ne(context), null);
                if (viewSd != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.zl);
                    Drawable drawableLIZ = c384050F3z.LIZ(context);
                    C19659111vp c19659111vp = new C19659111vp();
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(2);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(12);
                    c19659111vp.LJ = Integer.valueOf(R.attr.p0);
                    c19659111vp.LIZ = C418440Gaw.LIZIZ(20);
                    c19659111vp.LJI = new Rect(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                    viewSd.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
                    C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                }
                C1765540w2q c1765540w2q = new C1765540w2q(viewSd, (List<? extends AbstractC1763110vyv>) list, interfaceC1765560w2s, zBooleanValue, 2, Boolean.TRUE, Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_pdp_enable_pinned_find_similar_button", z2, false)));
                c1765540w2q.LLJIJIL = false;
                return c1765540w2q;
            }
            C1765540w2q c1765540w2q2 = new C1765540w2q(similarPhotoSearchView, list, interfaceC1765560w2s, z3, 2, Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ec_pdp_enable_pinned_find_similar_button", z2, false)), 32);
            c1765540w2q2.LLJIJIL = false;
            return c1765540w2q2;
        }
        C1765530w2p c1765530w2p = new C1765530w2p(similarPhotoSearchView, list, interfaceC1765560w2s, zBooleanValue, iLIZ);
        c1765530w2p.LLJIJIL = false;
        return c1765530w2p;
    }
}
