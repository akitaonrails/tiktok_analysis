package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0458, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0458 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ SkuSupply LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;
    public final /* synthetic */ Integer LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ Integer LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ C03W0 LLJJJJ;
    public final /* synthetic */ HeaderBannerDaInfo LLJJJJJIL;
    public final /* synthetic */ UserRight LLJJJJLIIL;
    public final /* synthetic */ Boolean LLJJL;
    public final /* synthetic */ String LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ String LLJL;
    public final /* synthetic */ Map<String, Object> LLJLIL;
    public final /* synthetic */ String LLJLILLLLZIIL;
    public final /* synthetic */ String LLJLL;
    public final /* synthetic */ Integer LLJLLIL;
    public final /* synthetic */ Map<String, Object> LLJLLL;
    public final /* synthetic */ Map<String, Object> LLJZ;
    public final /* synthetic */ String LLJZIJLIL;
    public final /* synthetic */ String LLL;
    public final /* synthetic */ LogisticDTO LLLF;
    public final /* synthetic */ SkuPanelState LLLFF;
    public final /* synthetic */ String LLLFFI;
    public final /* synthetic */ String LLLFZ;
    public final /* synthetic */ String LLLI;
    public final /* synthetic */ Integer LLLII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0458(LogisticDTO logisticDTO, C03W0 c03w0, UserRight userRight, SkuPanelState skuPanelState, SkuSupply skuSupply, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = map3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = skuSupply;
        this.LLJ = num;
        this.LLJI = str5;
        this.LLJIJIL = num2;
        this.LLJILJIL = str6;
        this.LLJILJILJ = num3;
        this.LLJILLL = num4;
        this.LLJJ = str7;
        this.LLJJI = num5;
        this.LLJJIII = str8;
        this.LLJJIJI = str9;
        this.LLJJIJIIJIL = str10;
        this.LLJJIJIL = str11;
        this.LLJJJ = str12;
        this.LLJJJIL = str13;
        this.LLJJJJ = c03w0;
        this.LLJJJJJIL = headerBannerDaInfo;
        this.LLJJJJLIIL = userRight;
        this.LLJJL = bool;
        this.LLJJLIIIJLLLLLLLZ = str14;
        this.LLJL = str15;
        this.LLJLIL = map4;
        this.LLJLILLLLZIIL = str16;
        this.LLJLL = str17;
        this.LLJLLIL = num6;
        this.LLJLLL = map5;
        this.LLJZ = map6;
        this.LLJZIJLIL = str18;
        this.LLL = str19;
        this.LLLF = logisticDTO;
        this.LLLFF = skuPanelState;
        this.LLLFFI = str20;
        this.LLLFZ = str21;
        this.LLLI = str22;
        this.LLLII = num7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        HashMap map;
        IECommerceHostService iECommerceHostService;
        Map<String, String> map2;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        boolean z;
        String name;
        String str;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        if (this.LL == null) {
            C044V.LIZ.getClass();
            map = C044V.LIZIZ;
        } else {
            map = new HashMap(this.LL);
        }
        c957403oi2.LJ(map);
        Map<String, ? extends Object> map3 = this.LLILLJJLI;
        if (map3 != null) {
            c957403oi2.LJ(map3);
        }
        Map<String, ? extends Object> map4 = this.LLILLL;
        if (map4 != null) {
            c957403oi2.LJ(map4);
        } else if (Intrinsics.LJFF(map.get("previous_page"), "product_review")) {
            c957403oi2.LJ(C1073604Hu.LIZ());
        } else if (Intrinsics.LJFF(map.get("previous_page"), "shop_review")) {
            c957403oi2.LJ(C1073604Hu.LIZIZ());
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("actionsheet_name", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            c957403oi2.LIZLLL("cart_item_id", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            c957403oi2.LIZLLL("source_button", str5);
        }
        String str6 = this.LLIZ;
        if (str6 != null) {
            c957403oi2.LIZLLL("sku_id", str6);
        }
        String str7 = this.LLIZ;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("platform_sku_id", str7);
        SkuSupply skuSupply = this.LLIZLLLIL;
        if (skuSupply != null && (str2 = skuSupply.skuId) != null) {
            str8 = str2;
        }
        c957403oi2.LIZLLL("seller_sku_id", str8);
        Integer num = this.LLJ;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str9 = this.LLJI;
        if (str9 != null) {
            c957403oi2.LIZLLL("cart_form", str9);
        }
        Integer num2 = this.LLJIJIL;
        if (num2 != null) {
            num2.intValue();
            c957403oi2.LIZLLL("is_success", num2);
        }
        String str10 = this.LLJILJIL;
        if (str10 != null) {
            c957403oi2.LIZLLL("fail_reason", str10);
        }
        Integer num3 = this.LLJILJILJ;
        if (num3 != null) {
            num3.intValue();
            c957403oi2.LIZLLL("add_sku_num", num3);
        }
        Integer num4 = this.LLJILLL;
        if (num4 != null) {
            num4.intValue();
            c957403oi2.LIZLLL("sku_num_before", num4);
        }
        String str11 = this.LLJJ;
        if (str11 != null) {
            c957403oi2.LIZLLL("flashsale_status", str11);
        }
        Integer num5 = this.LLJJI;
        if (num5 != null) {
            num5.intValue();
            c957403oi2.LIZLLL("sku_num_after", num5);
        }
        String str12 = this.LLJJIII;
        if (str12 != null) {
            c957403oi2.LIZLLL("page_name", str12);
        }
        if (!map.containsKey("previous_page") && (str = this.LLJJIJI) != null) {
            c957403oi2.LIZLLL("previous_page", str);
        }
        if (Intrinsics.LJFF(this.LLJJIII, "shop_review") || Intrinsics.LJFF(this.LLJJIII, "product_review")) {
            c957403oi2.LIZLLL("previous_page", "product_detail");
        }
        String str13 = this.LLJJIJIIJIL;
        if (str13 != null) {
            c957403oi2.LIZLLL("previous_page", str13);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            iECommerceHostService = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        c957403oi2.LIZLLL("traceparent", ((IApmDependencyService) iECommerceHostService).newTrackingTraceparent());
        String str14 = this.LLJJIJIL;
        if (str14 != null) {
            c957403oi2.LIZLLL("coupon_id", str14);
        }
        String str15 = this.LLJJJ;
        if (str15 != null) {
            c957403oi2.LIZLLL("coupon_type_id", str15);
        }
        String str16 = this.LLJJJIL;
        if (str16 != null) {
            c957403oi2.LIZLLL("coupon_type_info", str16);
        }
        C03W0 c03w0 = this.LLJJJJ;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LLJJJJJIL;
        if (headerBannerDaInfo != null) {
            c957403oi2.LIZLLL("campaign_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            c957403oi2.LIZLLL("campaign_content", headerBannerDaInfo.rightsContent);
        }
        c957403oi2.LJ(C041G.LJIIJJI(this.LLJJJJLIIL));
        Boolean bool = this.LLJJL;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C10473047r.LIZIZ(map, false, c957403oi2, false, null);
        C10473047r.LJ(c957403oi2, "is_inner", map);
        C10473047r.LJ(c957403oi2, "inner_search_id", map);
        C10473047r.LJ(c957403oi2, "rank_inner", map);
        C10473047r.LJ(c957403oi2, "is_slide", map);
        C10473047r.LJ(c957403oi2, "slide_rank", map);
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(this.LLJJLIIIJLLLLLLLZ);
        if (mapLJIIJ2 != null) {
            c957403oi2.LJ(mapLJIIJ2);
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(this.LLJL);
        if (mapLJIIJ3 != null && (obj = mapLJIIJ3.get("has_buy_now")) != null) {
            c957403oi2.LIZJ("has_buy_now", obj);
        }
        Map<String, ? extends Object> map5 = this.LLJLIL;
        if (map5 != null) {
            c957403oi2.LJ(map5);
        }
        String str17 = this.LLJLILLLLZIIL;
        if (str17 != null) {
            c957403oi2.LIZLLL("source_previous_page", str17);
        }
        String str18 = this.LLJLL;
        if (str18 != null) {
            c957403oi2.LIZLLL("affiliate_tracking_key", str18);
        }
        Integer num6 = this.LLJLLIL;
        if (num6 != null) {
            c957403oi2.LIZLLL("is_cart_service", Integer.valueOf(num6.intValue()));
        }
        Map<String, Object> map6 = this.LLJLLL;
        if (map6 != null) {
            c957403oi2.LJ(C00H3.LIZ(map6));
        }
        Map<String, ? extends Object> map7 = this.LLJZ;
        if (map7 != null) {
            c957403oi2.LJ(map7);
        }
        String str19 = this.LLJZIJLIL;
        if (str19 != null) {
            c957403oi2.LIZLLL("pdp_unique_id", str19);
        }
        String str20 = this.LLL;
        if (str20 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str20)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        LogisticDTO logisticDTO = this.LLLF;
        if (logisticDTO != null && (map2 = logisticDTO.eventTrackInfo) != null) {
            c957403oi2.LJ(map2);
        }
        SkuPanelState skuPanelState = this.LLLFF;
        if (skuPanelState != null) {
            Integer num7 = skuPanelState.isDefaultPreSelect;
            if (num7 != null) {
                c957403oi2.LIZLLL("is_default_pre_select", Integer.valueOf(num7.intValue()));
            }
            Integer num8 = skuPanelState.isDefaultPreSelect;
            if (num8 != null && num8.intValue() == 1) {
                String str21 = skuPanelState.defaultPreSelectType;
                if (str21 != null) {
                    c957403oi2.LIZLLL("default_pre_select_type", str21);
                }
                for (Map.Entry<String, Object> entry : skuPanelState.LIZJ().entrySet()) {
                    c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
        String str22 = this.LLLFFI;
        if (str22 != null) {
            c957403oi2.LIZLLL("source_page_type", str22);
        }
        String str23 = this.LLLFZ;
        if (str23 != null) {
            c957403oi2.LIZLLL("entrance_form", str23);
        }
        String str24 = this.LLLI;
        if (str24 != null) {
            c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", str24);
        }
        c957403oi2.LIZLLL("if_auto_add_to_cart", String.valueOf(this.LLLII));
        return Unit.LIZ;
    }
}
