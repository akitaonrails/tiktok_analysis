package Y;

import X.C098200Yq;
import X.C0P0T;
import X.C1172330gc3;
import X.C1172420gcC;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185430gxB;
import X.C1389890mGx;
import X.C1558360qeg;
import X.C189200o6;
import X.C18JG;
import X.C20145813s8;
import X.C259800zU;
import X.C296260BjM;
import X.EnumC1157530gEB;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorite.NearbyFavoriteMobParams;
import com.ss.android.ugc.aweme.favorite.NearbyFavoritePageParams;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailHeaderAssem;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS0S2400000_18 implements View.OnClickListener {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS0S2400000_18 aCListenerS0S2400000_18, View view) {
        String str = aCListenerS0S2400000_18.s0;
        if (str != null && str.length() != 0) {
            C1389890mGx c1389890mGx = new C1389890mGx((View) aCListenerS0S2400000_18.l2);
            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LJIIIZ(R.string.fws);
            c1389890mGx.LJIIJJI();
            try {
                C20145813s8.LIZ("label", aCListenerS0S2400000_18.s0, view.getContext(), CertProviderManagerKt.findCert("bpea-poi_detail_copy_address", 1476399105));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (Intrinsics.LJFF((Boolean) aCListenerS0S2400000_18.l4, Boolean.TRUE)) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                PoiDetailHeaderAssem poiDetailHeaderAssem = (PoiDetailHeaderAssem) aCListenerS0S2400000_18.l3;
                String str2 = poiDetailHeaderAssem.LLJI;
                String str3 = aCListenerS0S2400000_18.s1;
                PageFinder pageFinderZo = poiDetailHeaderAssem.Zo();
                c1185430gxB.getClass();
                C1185430gxB.LJIILLIIL(pageFinderZo, str2, "long_press_copy", str3);
            } else {
                C1185430gxB c1185430gxB2 = C1185430gxB.LIZ;
                PoiDetailHeaderAssem poiDetailHeaderAssem2 = (PoiDetailHeaderAssem) aCListenerS0S2400000_18.l3;
                String str4 = poiDetailHeaderAssem2.LLJI;
                String str5 = aCListenerS0S2400000_18.s1;
                PageFinder pageFinderZo2 = poiDetailHeaderAssem2.Zo();
                c1185430gxB2.getClass();
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str4 == null) {
                    str4 = "";
                }
                linkedHashMap.put("enter_from", str4);
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("poi_id", str5);
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderZo2);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("ttls_poi_copy_name_click", linkedHashMap, c1185050gwZ);
            }
        }
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS0S2400000_18.l5).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static final void onClick$1(ACListenerS0S2400000_18 aCListenerS0S2400000_18, View view) {
        C1185430gxB c1185430gxB = C1185430gxB.LIZ;
        HashMap map = (HashMap) aCListenerS0S2400000_18.l2;
        InterfaceC665370Q7z interfaceC665370Q7zLJ = (InterfaceC665370Q7z) aCListenerS0S2400000_18.l3;
        if (interfaceC665370Q7zLJ == null) {
            interfaceC665370Q7zLJ = C1558360qeg.LJ((View) aCListenerS0S2400000_18.l4, null);
        }
        PageFinder pageFinder = (PageFinder) aCListenerS0S2400000_18.l5;
        c1185430gxB.getClass();
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJ);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("ttls_poi_favourite_toast_click", linkedHashMap, c1185050gwZ);
        if (((Number) C1172420gcC.LIZ.getValue()).intValue() >= 1) {
            C1172330gc3 c1172330gc3 = C1172330gc3.LIZ;
            View view2 = (View) aCListenerS0S2400000_18.l4;
            String str = aCListenerS0S2400000_18.s1;
            c1172330gc3.getClass();
            if (C296260BjM.LIZ()) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view2.getContext(), "//setting/favorite");
                smartRouteBuildRoute.withParam("from_scene", "1034");
                smartRouteBuildRoute.withParam("target_tab_name", "places");
                smartRouteBuildRoute.withParam("from_poi_id", str);
                smartRouteBuildRoute.open();
                return;
            }
            SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(view2.getContext(), "aweme://user/profile/");
            smartRouteBuildRoute2.withParam("from_scene", "1034");
            smartRouteBuildRoute2.withParam("from_poi_id", str);
            smartRouteBuildRoute2.open();
            return;
        }
        C1172330gc3 c1172330gc32 = C1172330gc3.LIZ;
        View view3 = (View) aCListenerS0S2400000_18.l4;
        String str2 = aCListenerS0S2400000_18.s0;
        c1172330gc32.getClass();
        SmartRoute smartRouteBuildRoute3 = SmartRouter.buildRoute(view3.getContext(), "//nearby/collect/list");
        smartRouteBuildRoute3.withParam("nearby_favorite_params", new NearbyFavoritePageParams(null, EnumC1157530gEB.NORMAL_LIST));
        smartRouteBuildRoute3.withParam("nearby_favorite_mob", new NearbyFavoriteMobParams(str2));
        smartRouteBuildRoute3.withParam("source_btm_token", C18JG.LIZ("c0256.d0", PageFinder.via(view3), null));
        smartRouteBuildRoute3.open();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS0S2400000_18(String str, String str2, View view, PoiDetailHeaderAssem poiDetailHeaderAssem, Boolean bool, String str3, C259800zU<C0P0T> c259800zU) {
        this.$t = c259800zU;
        this.s0 = str;
        this.l2 = str2;
        this.l3 = view;
        this.l4 = poiDetailHeaderAssem;
        this.s1 = bool;
        this.l5 = str3;
    }
}
