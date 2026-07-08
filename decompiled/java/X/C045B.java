package X;

import android.os.SystemClock;
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

/* JADX INFO: renamed from: X.045B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045B extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ SkuSupply LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C03W0 LLJILJILJ;
    public final /* synthetic */ HeaderBannerDaInfo LLJILLL;
    public final /* synthetic */ UserRight LLJJ;
    public final /* synthetic */ Boolean LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ Integer LLJJIJIL;
    public final /* synthetic */ Map<String, Object> LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ String LLJJJJ;
    public final /* synthetic */ SkuPanelState LLJJJJJIL;
    public final /* synthetic */ Integer LLJJJJLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045B(C03W0 c03w0, UserRight userRight, SkuPanelState skuPanelState, SkuSupply skuSupply, HeaderBannerDaInfo headerBannerDaInfo, Boolean bool, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, Map map2, Map map3, Map map4) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = map3;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = skuSupply;
        this.LLIZLLLIL = num;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = c03w0;
        this.LLJILLL = headerBannerDaInfo;
        this.LLJJ = userRight;
        this.LLJJI = bool;
        this.LLJJIII = str8;
        this.LLJJIJI = str9;
        this.LLJJIJIIJIL = str10;
        this.LLJJIJIL = num2;
        this.LLJJJ = map4;
        this.LLJJJIL = str11;
        this.LLJJJJ = str12;
        this.LLJJJJJIL = skuPanelState;
        this.LLJJJJLIIL = num3;
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
        }
        Map<String, ? extends Object> map2 = this.LLILLL;
        if (map2 != null) {
            c957403oi2.LJ(map2);
        } else if (Intrinsics.LJFF(this.LL.get("previous_page"), "product_review")) {
            c957403oi2.LJ(C1073604Hu.LIZ());
        } else if (Intrinsics.LJFF(this.LL.get("previous_page"), "shop_review")) {
            c957403oi2.LJ(C1073604Hu.LIZIZ());
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("actionsheet_name", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            c957403oi2.LIZLLL("source_button", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            c957403oi2.LIZLLL("sku_id", str5);
        }
        SkuSupply skuSupply = this.LLIZ;
        String str6 = "";
        if (skuSupply == null || (str = skuSupply.skuId) == null) {
            str = "";
        }
        c957403oi2.LIZLLL("seller_sku_id", str);
        String str7 = this.LLILZLL;
        if (str7 != null) {
            str6 = str7;
        }
        c957403oi2.LIZLLL("platform_sku_id", str6);
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            num.intValue();
            c957403oi2.LIZLLL("is_single_sku", num);
        }
        String str8 = this.LLJ;
        if (str8 != null) {
            c957403oi2.LIZLLL("cart_form", str8);
        }
        String str9 = this.LLJI;
        if (str9 != null) {
            c957403oi2.LIZLLL("page_name", str9);
        }
        if (!this.LL.containsKey("previous_page") && (str2 = this.LLJIJIL) != null) {
            c957403oi2.LIZLLL("previous_page", str2);
        }
        if (Intrinsics.LJFF(this.LLJI, "shop_review") || Intrinsics.LJFF(this.LLJI, "product_review")) {
            c957403oi2.LIZLLL("previous_page", "product_detail");
        }
        String str10 = this.LLJILJIL;
        if (str10 != null) {
            c957403oi2.LIZLLL("previous_page", str10);
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
        C03W0 c03w0 = this.LLJILJILJ;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LLJILLL;
        if (headerBannerDaInfo != null) {
            c957403oi2.LIZLLL("campaign_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            c957403oi2.LIZLLL("campaign_content", headerBannerDaInfo.rightsContent);
        }
        c957403oi2.LJ(C041G.LJIIJJI(this.LLJJ));
        Boolean bool = this.LLJJI;
        if (bool != null) {
            bool.booleanValue();
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        String str11 = this.LLJJIII;
        if (str11 != null && (mapLJIIJ2 = C1741890vQh.LJIIJ(str11)) != null) {
            c957403oi2.LJ(mapLJIIJ2);
        }
        HashMap<String, Object> mapLJIIJ3 = C1741890vQh.LJIIJ(this.LLJJIJI);
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
        String str12 = this.LLJJIJIIJIL;
        if (str12 != null) {
            c957403oi2.LIZLLL("source_previous_page", str12);
        }
        Integer num2 = this.LLJJIJIL;
        if (num2 != null) {
            c957403oi2.LIZLLL("is_cart_service", Integer.valueOf(num2.intValue()));
        }
        Map<String, Object> map3 = this.LLJJJ;
        if (map3 != null) {
            c957403oi2.LJ(C00H3.LIZ(map3));
        }
        String str13 = this.LLJJJIL;
        if (str13 != null) {
            c957403oi2.LIZLLL("pdp_unique_id", str13);
        }
        String str14 = this.LLJJJJ;
        if (str14 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str14)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        SkuPanelState skuPanelState = this.LLJJJJJIL;
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
        }
        c957403oi2.LIZLLL("if_auto_add_to_cart", String.valueOf(this.LLJJJJLIIL));
        return Unit.LIZ;
    }
}
