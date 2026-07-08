package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0456, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0456 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ C1054104Ah LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Boolean LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ int LLJJIJIIJIL;
    public final /* synthetic */ Integer LLJJIJIL;
    public final /* synthetic */ C03W0 LLJJJ;
    public final /* synthetic */ C03W1 LLJJJIL;
    public final /* synthetic */ Map<String, Object> LLJJJJ;
    public final /* synthetic */ SkuPanelState LLJJJJJIL;
    public final /* synthetic */ String LLJJJJLIIL;
    public final /* synthetic */ String LLJJL;
    public final /* synthetic */ String LLJJLIIIJLLLLLLLZ;
    public final /* synthetic */ InstallmentPlan LLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0456(C1054104Ah c1054104Ah, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, String str, String str2, Integer num, boolean z, long j, long j2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Integer num2, C03W0 c03w0, C03W1 c03w1, Map<String, ? extends Object> map3, SkuPanelState skuPanelState, String str11, String str12, String str13, InstallmentPlan installmentPlan) {
        super(1);
        this.LL = c1054104Ah;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = num;
        this.LLIZ = z;
        this.LLIZLLLIL = j;
        this.LLJ = j2;
        this.LLJI = str3;
        this.LLJIJIL = bool;
        this.LLJILJIL = str4;
        this.LLJILJILJ = str5;
        this.LLJILLL = str6;
        this.LLJJ = str7;
        this.LLJJI = str8;
        this.LLJJIII = str9;
        this.LLJJIJI = str10;
        this.LLJJIJIIJIL = i;
        this.LLJJIJIL = num2;
        this.LLJJJ = c03w0;
        this.LLJJJIL = c03w1;
        this.LLJJJJ = map3;
        this.LLJJJJJIL = skuPanelState;
        this.LLJJJJLIIL = str11;
        this.LLJJL = str12;
        this.LLJJLIIIJLLLLLLLZ = str13;
        this.LLJL = installmentPlan;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) throws JSONException {
        int iIntValue;
        Object obj;
        Object obj2;
        WarehouseTag warehouseTag;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        PdpPaymentModule pdpPaymentModule;
        BnplInfo bnplInfo;
        List<InstallmentPlan> list;
        String amount;
        PromotionEntrance promotionEntrance;
        HashMap<String, Object> mapLJIIJ;
        Object obj10;
        WarehouseTag warehouseTag2;
        List<SaleProp> list2;
        Integer num;
        C957403oi c957403oi2 = c957403oi;
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LL.LIZIZ;
        c957403oi2.getClass();
        ((HashMap) c957403oi2.LIZ).putAll(concurrentHashMap);
        Map<String, ? extends Object> map = this.LLILLJJLI;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        Map<String, Object> map2 = this.LLILLL;
        if (map2 != null && !map2.isEmpty()) {
            c957403oi2.LJ(this.LLILLL);
        }
        this.LL.LIZLLL(c957403oi2);
        String str = this.LLILZ;
        if (str != null) {
            C1054104Ah c1054104Ah = this.LL;
            c957403oi2.LIZJ("sku_id", str);
            c957403oi2.LJ(c1054104Ah.LJIIJ(str));
        }
        Object obj11 = this.LLILZIL;
        if (obj11 != null) {
            c957403oi2.LIZJ("pdp_degradation", obj11);
        }
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            c957403oi2.LIZJ("quantity", Integer.valueOf(num2.intValue()));
        }
        ProductPackStruct productPackStruct = this.LL.LJIIL;
        if (productPackStruct != null && (num = productPackStruct.status) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        c957403oi2.LIZJ("product_type", String.valueOf(iIntValue));
        if (this.LLIZ) {
            obj = "full_screen";
        } else {
            obj = "half_screen";
        }
        c957403oi2.LIZJ("page_show_type", obj);
        c957403oi2.LIZJ("start_click_to_now", Long.valueOf(this.LLIZLLLIL - this.LLJ));
        ProductPackStruct productPackStruct2 = this.LL.LJIIL;
        if (productPackStruct2 != null && (list2 = productPackStruct2.saleProps) != null && list2.size() > 6) {
            obj2 = "greater_than_6";
        } else {
            obj2 = "no_greater_than_6";
        }
        c957403oi2.LIZJ("sku_show_type", obj2);
        c957403oi2.LIZLLL("traceparent", this.LLJI);
        Boolean bool = this.LLJIJIL;
        if (bool != null) {
            c957403oi2.LIZJ("is_buy_with_coupon", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        c957403oi2.LIZJ("pdp_image_cache", Integer.valueOf(this.LL.LJJI));
        Object obj12 = this.LLJILJIL;
        if (obj12 != null) {
            c957403oi2.LIZJ("jump_button_name", obj12);
            c957403oi2.LIZJ("button_name", obj12);
        }
        Object obj13 = this.LLJILJILJ;
        if (obj13 != null) {
            c957403oi2.LIZJ("coupon_id", obj13);
        }
        Object obj14 = this.LLJILLL;
        if (obj14 != null) {
            c957403oi2.LIZJ("coupon_type_id", obj14);
        }
        Object obj15 = this.LLJJ;
        if (obj15 != null) {
            c957403oi2.LIZJ("instance_key", obj15);
        }
        Object obj16 = this.LLJJI;
        if (obj16 != null) {
            c957403oi2.LIZJ("coupon_type_info", obj16);
        }
        Object obj17 = this.LLJJIII;
        if (obj17 != null) {
            c957403oi2.LIZJ("coupon_zone", obj17);
        }
        Object obj18 = this.LLJJIJI;
        if (obj18 != null) {
            c957403oi2.LIZJ("benefit_type", obj18);
        }
        c957403oi2.LIZJ("is_coupon_tips_shown", Integer.valueOf(this.LLJJIJIIJIL));
        ProductPackStruct productPackStruct3 = this.LL.LJIIL;
        if (productPackStruct3 != null) {
            warehouseTag = productPackStruct3.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            if (productPackStruct3 == null || (warehouseTag2 = productPackStruct3.warehouseTag) == null || (obj10 = warehouseTag2.fulfilledBy) == null) {
                obj10 = "";
            }
            c957403oi2.LIZJ("fulfilled_by", obj10);
        } else {
            c957403oi2.LIZJ("fulfilled_by", "no_label");
        }
        Integer num3 = this.LLJJIJIL;
        if (num3 != null) {
            c957403oi2.LIZJ("preorder_shipdays", Integer.valueOf(num3.intValue()));
        }
        C03W0 c03w0 = this.LLJJJ;
        if (c03w0 != null) {
            C855703Vz.LJ(c03w0, c957403oi2);
        }
        C03W1 c03w1 = this.LLJJJIL;
        if (c03w1 != null) {
            C855703Vz.LIZLLL(c03w1, c957403oi2);
        }
        this.LL.LJFF(c957403oi2);
        HeaderBannerDaInfo headerBannerDaInfoLIZ = C049I.LIZ(this.LL.LJIIL);
        c957403oi2.LIZJ("campaign_cnt", Integer.valueOf(headerBannerDaInfoLIZ.rightsCnt));
        c957403oi2.LIZJ("campaign_content", headerBannerDaInfoLIZ.rightsContent);
        this.LL.LJI(c957403oi2);
        C1054104Ah c1054104Ah2 = this.LL;
        ProductPackStruct productPackStruct4 = c1054104Ah2.LJIIL;
        if (productPackStruct4 != null && (promotionEntrance = productPackStruct4.promotionEntrance) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("module_name", "promotion");
            linkedHashMap.putAll(c1054104Ah2.LIZIZ);
            String str2 = promotionEntrance.daInfo;
            if (str2 != null && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                Object obj19 = mapLJIIJ.get("campaign_id");
                if (obj19 != null) {
                    linkedHashMap.put("campaign_id", obj19);
                }
                Object obj20 = mapLJIIJ.get("campaign_type");
                if (obj20 != null) {
                    linkedHashMap.put("campaign_type", obj20);
                }
                Object obj21 = mapLJIIJ.get("campaign_user_tag");
                if (obj21 != null) {
                    linkedHashMap.put("campaign_user_tag", obj21);
                }
                Object obj22 = mapLJIIJ.get("campaign_channel");
                if (obj22 != null) {
                    linkedHashMap.put("campaign_channel", obj22);
                }
                Object obj23 = mapLJIIJ.get("campaign_cost_role");
                if (obj23 != null) {
                    linkedHashMap.put("campaign_cost_role", obj23);
                }
            }
            ((HashMap) c957403oi2.LIZ).putAll(linkedHashMap);
        }
        C10473047r.LIZIZ(this.LL.LIZIZ, false, c957403oi2, false, null);
        if (C041G.LJIILLIIL(this.LL.LJIIL)) {
            HashMap mapLJ = C1741890vQh.LJ("entrance_info", c957403oi2.LIZ);
            if (mapLJ == null) {
                mapLJ = new HashMap();
            }
            mapLJ.putAll(this.LL.LJIIIZ());
            mapLJ.putAll(this.LL.LJIIJ(this.LLILZ));
            c957403oi2.LIZLLL("entrance_info", C1741890vQh.LJIIIIZZ(mapLJ));
        }
        ProductPackStruct productPackStruct5 = this.LL.LJIIL;
        if (productPackStruct5 != null && (pdpPaymentModule = productPackStruct5.pdpPaymentModule) != null && (bnplInfo = pdpPaymentModule.bnplInfo) != null && (list = bnplInfo.installmentPlans) != null) {
            InstallmentPlan installmentPlan = this.LLJL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("installment_cnt", list.size());
            if (installmentPlan != null) {
                Amount amount2 = installmentPlan.totalRepayment;
                if (amount2 != null) {
                    amount = amount2.getAmount();
                } else {
                    amount = null;
                }
                jSONObject.put("total_payment", amount);
                jSONObject.put("service_fee", installmentPlan.totalFeeText);
            }
            c957403oi2.LIZJ("tiktok_paylater_info", jSONObject);
        }
        Map<String, Object> map3 = this.LL.LIZ.trackParams;
        if (map3 == null || (obj3 = map3.get("is_inner")) == null) {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        c957403oi2.LIZJ("is_inner", obj3);
        Map<String, Object> map4 = this.LL.LIZ.trackParams;
        if (map4 != null && (obj9 = map4.get("inner_search_id")) != null) {
            c957403oi2.LIZJ("inner_search_id", obj9);
        }
        Map<String, Object> map5 = this.LL.LIZ.trackParams;
        if (map5 != null && (obj8 = map5.get("rank_inner")) != null) {
            c957403oi2.LIZJ("rank_inner", obj8);
        }
        Map<String, Object> map6 = this.LL.LIZ.trackParams;
        if (map6 != null && (obj7 = map6.get("search_id")) != null) {
            c957403oi2.LIZJ("search_id", obj7);
        }
        Map<String, Object> map7 = this.LL.LIZ.trackParams;
        if (map7 != null && (obj6 = map7.get("search_result_id")) != null) {
            c957403oi2.LIZJ("search_result_id", obj6);
        }
        Map<String, Object> map8 = this.LL.LIZ.trackParams;
        if (map8 != null && (obj5 = map8.get("list_item_id")) != null) {
            c957403oi2.LIZJ("list_item_id", obj5);
        }
        Map<String, Object> map9 = this.LL.LIZ.trackParams;
        if (map9 != null && (obj4 = map9.get("search_entrance")) != null) {
            c957403oi2.LIZJ("search_entrance", obj4);
        }
        c957403oi2.LJ(C00H3.LIZ(this.LLJJJJ));
        this.LL.getClass();
        C1054104Ah.LIZJ(c957403oi2, null);
        SkuPanelState skuPanelState = this.LLJJJJJIL;
        if (skuPanelState != null) {
            Integer num4 = skuPanelState.isDefaultPreSelect;
            if (num4 != null) {
                c957403oi2.LIZLLL("is_default_pre_select", Integer.valueOf(num4.intValue()));
            }
            Integer num5 = skuPanelState.isDefaultPreSelect;
            if (num5 != null && num5.intValue() == 1) {
                Object obj24 = skuPanelState.defaultPreSelectType;
                if (obj24 != null) {
                    c957403oi2.LIZLLL("default_pre_select_type", obj24);
                }
                for (Map.Entry<String, Object> entry : skuPanelState.LIZJ().entrySet()) {
                    c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
        Object obj25 = this.LLJJJJLIIL;
        if (obj25 != null) {
            c957403oi2.LIZJ("page_name", obj25);
        }
        Object obj26 = this.LLJJL;
        if (obj26 != null) {
            c957403oi2.LIZJ("previous_page", obj26);
        }
        Object obj27 = this.LLJJLIIIJLLLLLLLZ;
        if (obj27 != null) {
            c957403oi2.LIZJ("checkout_type", obj27);
        }
        return Unit.LIZ;
    }
}
