package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dto.InsuranceInfo;
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
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0457, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0457 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SkuSupply LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Integer LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ int LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ Boolean LLJJJJ;
    public final /* synthetic */ C03W0 LLJJJJJIL;
    public final /* synthetic */ HeaderBannerDaInfo LLJJJJLIIL;
    public final /* synthetic */ UserRight LLJJL;
    public final /* synthetic */ InsuranceInfo LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ Boolean LLJL;
    public final /* synthetic */ String LLJLIL;
    public final /* synthetic */ String LLJLILLLLZIIL;
    public final /* synthetic */ Map<String, Object> LLJLL;
    public final /* synthetic */ String LLJLLIL;
    public final /* synthetic */ String LLJLLL;
    public final /* synthetic */ Integer LLJZ;
    public final /* synthetic */ Map<String, Object> LLJZIJLIL;
    public final /* synthetic */ Map<String, Object> LLL;
    public final /* synthetic */ String LLLF;
    public final /* synthetic */ String LLLFF;
    public final /* synthetic */ LogisticDTO LLLFFI;
    public final /* synthetic */ SkuPanelState LLLFZ;
    public final /* synthetic */ String LLLI;
    public final /* synthetic */ String LLLII;
    public final /* synthetic */ String LLLIIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0457(int i, int i2, LogisticDTO logisticDTO, InsuranceInfo insuranceInfo, C03W0 c03w0, UserRight userRight, SkuPanelState skuPanelState, SkuSupply skuSupply, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Map map, Map map2, Map map3, Map map4, Map map5) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = skuSupply;
        this.LLIZLLLIL = num;
        this.LLJ = str5;
        this.LLJI = num2;
        this.LLJIJIL = str6;
        this.LLJILJIL = num3;
        this.LLJILJILJ = num4;
        this.LLJILLL = str7;
        this.LLJJ = num5;
        this.LLJJI = str8;
        this.LLJJIII = str9;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = i2;
        this.LLJJIJIL = str10;
        this.LLJJJ = str11;
        this.LLJJJIL = str12;
        this.LLJJJJ = bool;
        this.LLJJJJJIL = c03w0;
        this.LLJJJJLIIL = headerBannerDaInfo;
        this.LLJJL = userRight;
        this.LLJJLIIIJLLLLLLLZ = insuranceInfo;
        this.LLJL = bool2;
        this.LLJLIL = str13;
        this.LLJLILLLLZIIL = str14;
        this.LLJLL = map3;
        this.LLJLLIL = str15;
        this.LLJLLL = str16;
        this.LLJZ = num6;
        this.LLJZIJLIL = map4;
        this.LLL = map5;
        this.LLLF = str17;
        this.LLLFF = str18;
        this.LLLFFI = logisticDTO;
        this.LLLFZ = skuPanelState;
        this.LLLI = str19;
        this.LLLII = str20;
        this.LLLIIII = str21;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        HashMap map;
        String str;
        IECommerceHostService iECommerceHostService;
        int i;
        Map<String, String> map2;
        HashMap<String, Object> mapLJIIJ;
        Object obj;
        boolean z;
        String name;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        if (this.LL == null) {
            C10296040w.LIZ.getClass();
            map = C10296040w.LIZIZ;
        } else {
            map = new HashMap(this.LL);
        }
        c957403oi2.LJ(map);
        Map<String, ? extends Object> map3 = this.LLILLJJLI;
        if (map3 != null) {
            c957403oi2.LJ(map3);
        } else if (Intrinsics.LJFF(map.get("previous_page"), "product_review")) {
            c957403oi2.LJ(C1073604Hu.LIZ());
        } else if (Intrinsics.LJFF(map.get("previous_page"), "shop_review")) {
            c957403oi2.LJ(C1073604Hu.LIZIZ());
        }
        String str3 = this.LLILLL;
        if (str3 != null) {
            c957403oi2.LIZLLL("actionsheet_name", str3);
        }
        String str4 = this.LLILZ;
        if (str4 != null) {
            c957403oi2.LIZLLL("cart_item_id", str4);
        }
        String str5 = this.LLILZIL;
        if (str5 != null) {
            c957403oi2.LIZLLL("source_button", str5);
        }
        String str6 = this.LLILZLL;
        if (str6 != null) {
            c957403oi2.LIZLLL("sku_id", str6);
        }
        String str7 = this.LLILZLL;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("platform_sku_id", str7);
        SkuSupply skuSupply = this.LLIZ;
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("seller_sku_id", str);
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str9 = this.LLJ;
        if (str9 != null) {
            c957403oi2.LIZLLL("cart_form", str9);
        }
        Integer num2 = this.LLJI;
        if (num2 != null) {
            num2.intValue();
            c957403oi2.LIZLLL("is_success", num2);
        }
        String str10 = this.LLJIJIL;
        if (str10 != null) {
            c957403oi2.LIZLLL("fail_reason", str10);
        }
        Integer num3 = this.LLJILJIL;
        if (num3 != null) {
            num3.intValue();
            c957403oi2.LIZLLL("add_sku_num", num3);
        }
        Integer num4 = this.LLJILJILJ;
        if (num4 != null) {
            num4.intValue();
            c957403oi2.LIZLLL("sku_num_before", num4);
        }
        String str11 = this.LLJILLL;
        if (str11 != null) {
            c957403oi2.LIZLLL("flashsale_status", str11);
        }
        Integer num5 = this.LLJJ;
        if (num5 != null) {
            num5.intValue();
            c957403oi2.LIZLLL("sku_num_after", num5);
        }
        String str12 = this.LLJJI;
        if (str12 != null) {
            c957403oi2.LIZLLL("page_name", str12);
        }
        if (!map.containsKey("previous_page") && (str2 = this.LLJJIII) != null) {
            c957403oi2.LIZLLL("previous_page", str2);
        }
        if (Intrinsics.LJFF(this.LLJJI, "shop_review") || Intrinsics.LJFF(this.LLJJI, "product_review")) {
            c957403oi2.LIZLLL("previous_page", "product_detail");
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
        c957403oi2.LIZLLL("is_coupon_tips_shown", Integer.valueOf(this.LLJJIJI));
        c957403oi2.LIZLLL("is_shipping_coupon_tips_shown", Integer.valueOf(this.LLJJIJIIJIL));
        String str13 = this.LLJJIJIL;
        if (str13 != null) {
            c957403oi2.LIZLLL("coupon_id", str13);
        }
        String str14 = this.LLJJJ;
        if (str14 != null) {
            c957403oi2.LIZLLL("coupon_type_id", str14);
        }
        String str15 = this.LLJJJIL;
        if (str15 != null) {
            c957403oi2.LIZLLL("coupon_type_info", str15);
        }
        Boolean bool = this.LLJJJJ;
        if (bool != null) {
            c957403oi2.LIZLLL("is_coupon_reminder_shown", Boolean.valueOf(bool.booleanValue()));
        }
        C03W0 c03w0 = this.LLJJJJJIL;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LLJJJJLIIL;
        if (headerBannerDaInfo != null) {
            c957403oi2.LIZLLL("campaign_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            c957403oi2.LIZLLL("campaign_content", headerBannerDaInfo.rightsContent);
        }
        c957403oi2.LJ(C041G.LJIIJJI(this.LLJJL));
        if (this.LLJJLIIIJLLLLLLLZ != null) {
            i = 1;
        } else {
            i = 0;
        }
        c957403oi2.LIZLLL("is_with_protection", Integer.valueOf(i));
        InsuranceInfo insuranceInfo = this.LLJJLIIIJLLLLLLLZ;
        if (insuranceInfo != null) {
            Object obj2 = insuranceInfo.insuranceProductId;
            if (obj2 == null) {
                obj2 = "";
            }
            c957403oi2.LIZLLL("protection_id", obj2);
            String str16 = insuranceInfo.insuranceProductNameLocale;
            if (str16 == null) {
                str16 = "";
            }
            c957403oi2.LIZLLL("protection_period", str16);
            String str17 = insuranceInfo.insurancePrice;
            if (str17 != null) {
                String str18 = insuranceInfo.currencySymbol;
                if (str18 == null) {
                    str18 = "";
                }
                String strLJJJJZ = a0.LJJJJZ(str18, str17);
                if (strLJJJJZ != null) {
                    str8 = strLJJJJZ;
                }
            }
            c957403oi2.LIZLLL("protection_price", str8);
        }
        Boolean bool2 = this.LLJL;
        if (bool2 != null) {
            bool2.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        C10472047q.LIZ(map, false, c957403oi2, false, null);
        C10472047q.LIZJ(c957403oi2, "is_inner", map);
        C10472047q.LIZJ(c957403oi2, "inner_search_id", map);
        C10472047q.LIZJ(c957403oi2, "rank_inner", map);
        C10472047q.LIZJ(c957403oi2, "is_slide", map);
        C10472047q.LIZJ(c957403oi2, "slide_rank", map);
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(this.LLJLIL);
        if (mapLJIIJ2 != null) {
            c957403oi2.LJ(mapLJIIJ2);
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(this.LLJLILLLLZIIL);
        if (mapLJIIJ3 != null && (obj = mapLJIIJ3.get("has_buy_now")) != null) {
            c957403oi2.LIZJ("has_buy_now", obj);
        }
        Map<String, ? extends Object> map4 = this.LLJLL;
        if (map4 != null) {
            c957403oi2.LJ(map4);
        }
        String str19 = this.LLJLLIL;
        if (str19 != null) {
            c957403oi2.LIZLLL("source_previous_page", str19);
        }
        String str20 = this.LLJLLL;
        if (str20 != null) {
            c957403oi2.LIZLLL("affiliate_tracking_key", str20);
        }
        Integer num6 = this.LLJZ;
        if (num6 != null) {
            c957403oi2.LIZLLL("is_cart_service", Integer.valueOf(num6.intValue()));
        }
        c957403oi2.LJ(C00H3.LIZ(this.LLJZIJLIL));
        Map<String, ? extends Object> map5 = this.LLL;
        if (map5 != null) {
            c957403oi2.LJ(map5);
        }
        String str21 = this.LLLF;
        if (str21 != null) {
            c957403oi2.LIZLLL("pdp_unique_id", str21);
        }
        String str22 = this.LLLFF;
        if (str22 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str22)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        LogisticDTO logisticDTO = this.LLLFFI;
        if (logisticDTO != null && (map2 = logisticDTO.eventTrackInfo) != null) {
            c957403oi2.LJ(map2);
        }
        SkuPanelState skuPanelState = this.LLLFZ;
        if (skuPanelState != null) {
            Integer num7 = skuPanelState.isDefaultPreSelect;
            if (num7 != null) {
                c957403oi2.LIZLLL("is_default_pre_select", Integer.valueOf(num7.intValue()));
            }
            Integer num8 = skuPanelState.isDefaultPreSelect;
            if (num8 != null && num8.intValue() == 1) {
                String str23 = skuPanelState.defaultPreSelectType;
                if (str23 != null) {
                    c957403oi2.LIZLLL("default_pre_select_type", str23);
                }
                for (Map.Entry<String, Object> entry : skuPanelState.LIZJ().entrySet()) {
                    c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
        String str24 = this.LLLI;
        if (str24 != null) {
            c957403oi2.LIZLLL("source_page_type", str24);
        }
        String str25 = this.LLLII;
        if (str25 != null) {
            c957403oi2.LIZLLL("entrance_form", str25);
        }
        String str26 = this.LLLIIII;
        if (str26 != null) {
            c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", str26);
        }
        return Unit.LIZ;
    }
}
