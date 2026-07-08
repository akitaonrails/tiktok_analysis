package X;

import android.os.SystemClock;
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
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.045A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045A extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ SkuSupply LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ C03W0 LLJILJIL;
    public final /* synthetic */ HeaderBannerDaInfo LLJILJILJ;
    public final /* synthetic */ UserRight LLJILLL;
    public final /* synthetic */ Boolean LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ Integer LLJJIJIIJIL;
    public final /* synthetic */ Map<String, Object> LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ SkuPanelState LLJJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045A(C03W0 c03w0, UserRight userRight, SkuPanelState skuPanelState, SkuSupply skuSupply, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, Map map2, Map map3) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = skuSupply;
        this.LLIZ = num;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = c03w0;
        this.LLJILJILJ = headerBannerDaInfo;
        this.LLJILLL = userRight;
        this.LLJJ = bool;
        this.LLJJI = str8;
        this.LLJJIII = str9;
        this.LLJJIJI = str10;
        this.LLJJIJIIJIL = num2;
        this.LLJJIJIL = map3;
        this.LLJJJ = str11;
        this.LLJJJIL = str12;
        this.LLJJJJ = skuPanelState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        IECommerceHostService iECommerceHostService;
        HashMap<String, Object> mapLJIIJ;
        HashMap<String, Object> mapLJIIJ2;
        boolean z;
        String name;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LJ(this.LL);
        Map<String, ? extends Object> map = this.LLILLJJLI;
        if (map != null) {
            c957403oi2.LJ(map);
        } else if (Intrinsics.LJFF(this.LL.get("previous_page"), "product_review")) {
            c957403oi2.LJ(C1073604Hu.LIZ());
        } else if (Intrinsics.LJFF(this.LL.get("previous_page"), "shop_review")) {
            c957403oi2.LJ(C1073604Hu.LIZIZ());
        }
        String str3 = this.LLILLL;
        if (str3 != null) {
            c957403oi2.LIZLLL("actionsheet_name", str3);
        }
        String str4 = this.LLILZ;
        if (str4 != null) {
            c957403oi2.LIZLLL("source_button", str4);
        }
        String str5 = this.LLILZIL;
        if (str5 != null) {
            c957403oi2.LIZLLL("sku_id", str5);
        }
        SkuSupply skuSupply = this.LLILZLL;
        String str6 = "";
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("seller_sku_id", str);
        String str7 = this.LLILZIL;
        if (str7 == null) {
            str7 = "";
        }
        c957403oi2.LIZLLL("platform_sku_id", str7);
        Integer num = this.LLIZ;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str8 = this.LLIZLLLIL;
        if (str8 != null) {
            c957403oi2.LIZLLL("cart_form", str8);
        }
        String str9 = this.LLJ;
        if (str9 != null) {
            c957403oi2.LIZLLL("page_name", str9);
        }
        String str10 = this.LLJI;
        if (str10 != null) {
            c957403oi2.LIZLLL("sub_page_name", str10);
        }
        if (!this.LL.containsKey("previous_page") && (str2 = this.LLJIJIL) != null) {
            c957403oi2.LIZLLL("previous_page", str2);
        }
        if (Intrinsics.LJFF(this.LLJ, "shop_review") || Intrinsics.LJFF(this.LLJ, "product_review")) {
            c957403oi2.LIZLLL("previous_page", "product_detail");
        }
        int i = 1;
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
        C03W0 c03w0 = this.LLJILJIL;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LLJILJILJ;
        if (headerBannerDaInfo != null) {
            c957403oi2.LIZLLL("campaign_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            c957403oi2.LIZLLL("campaign_content", headerBannerDaInfo.rightsContent);
        }
        c957403oi2.LJ(C041G.LJIIJJI(this.LLJILLL));
        Boolean bool = this.LLJJ;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str11 = this.LLJJI;
        if (str11 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str11)) != null) {
            c957403oi2.LJ(mapLJIIJ2);
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(this.LLJJIII);
        if (mapLJIIJ3 != null) {
            Object obj = mapLJIIJ3.get("logo_type");
            if (obj != null) {
                c957403oi2.LIZJ("logo_type", obj);
            }
            Object obj2 = mapLJIIJ3.get("has_buy_now");
            if (obj2 != null) {
                c957403oi2.LIZJ("has_buy_now", obj2);
            }
        }
        String str12 = this.LLJJIJI;
        if (str12 != null) {
            c957403oi2.LIZLLL("source_previous_page", str12);
        }
        Integer num2 = this.LLJJIJIIJIL;
        if (num2 != null) {
            c957403oi2.LIZLLL("is_cart_service", Integer.valueOf(num2.intValue()));
        }
        c957403oi2.LJ(C00H3.LIZ(this.LLJJIJIL));
        String str13 = this.LLJJJ;
        if (str13 != null) {
            c957403oi2.LIZLLL("pdp_unique_id", str13);
        }
        String str14 = this.LLJJJIL;
        if (str14 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str14)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        SkuPanelState skuPanelState = this.LLJJJJ;
        if (skuPanelState != null) {
            Integer num3 = skuPanelState.isDefaultPreSelect;
            if (num3 != null) {
                c957403oi2.LIZLLL("is_default_pre_select", Integer.valueOf(num3.intValue()));
            }
            Integer num4 = skuPanelState.isDefaultPreSelect;
            if (num4 != null && num4.intValue() == 1) {
                String str15 = skuPanelState.defaultPreSelectType;
                if (str15 != null) {
                    c957403oi2.LIZLLL("default_pre_select_type", str15);
                }
                for (Map.Entry<String, Object> entry : skuPanelState.LIZJ().entrySet()) {
                    c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
            if (skuPanelState.selectedInsuranceInfo == null) {
                i = 0;
            }
            c957403oi2.LIZLLL("is_with_protection", Integer.valueOf(i));
            InsuranceInfo insuranceInfo = skuPanelState.selectedInsuranceInfo;
            if (insuranceInfo != null) {
                Object obj3 = insuranceInfo.insuranceProductId;
                if (obj3 == null) {
                    obj3 = "";
                }
                c957403oi2.LIZLLL("protection_id", obj3);
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
                        str6 = strLJJJJZ;
                    }
                }
                c957403oi2.LIZLLL("protection_price", str6);
            }
        }
        C045G c045g = C045G.LIZ;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(c957403oi2, 1709);
        c045g.getClass();
        C045G.LIZ("tiktokec_confirm_cart", awS545S0100000_1);
        return Unit.LIZ;
    }
}
