package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.045X, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045X extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ SkuItem LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ int LLJJIJIIJIL;
    public final /* synthetic */ Map<String, Object> LLJJIJIL;
    public final /* synthetic */ Map<String, Object> LLJJJ;
    public final /* synthetic */ String LLJJJIL;
    public final /* synthetic */ C1427600nFm LLJJJJ;
    public final /* synthetic */ SkuPanelState LLJJJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045X(int i, int i2, int i3, long j, C1427600nFm c1427600nFm, SkuPanelState skuPanelState, SkuItem skuItem, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Map map, Map map2, Map map3, Map map4, boolean z) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = map2;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = str2;
        this.LLIZ = z;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = skuItem;
        this.LLJIJIL = str5;
        this.LLJILJIL = str6;
        this.LLJILJILJ = str7;
        this.LLJILLL = str8;
        this.LLJJ = str9;
        this.LLJJI = str10;
        this.LLJJIII = str11;
        this.LLJJIJI = i2;
        this.LLJJIJIIJIL = i3;
        this.LLJJIJIL = map3;
        this.LLJJJ = map4;
        this.LLJJJIL = str12;
        this.LLJJJJ = c1427600nFm;
        this.LLJJJJJIL = skuPanelState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        Object obj;
        Price price;
        String priceVal;
        String str;
        Object obj2;
        C957403oi c957403oi2 = c957403oi;
        C10296040w.LIZ.getClass();
        LinkedHashMap<String, Object> linkedHashMap = C10296040w.LIZIZ;
        c957403oi2.getClass();
        ((HashMap) c957403oi2.LIZ).putAll(linkedHashMap);
        c957403oi2.LJ(linkedHashMap);
        Map<String, ? extends Object> map = this.LL;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        Map<String, Object> map2 = this.LLILLJJLI;
        if (map2 != null && !map2.isEmpty()) {
            c957403oi2.LJ(this.LLILLJJLI);
        }
        c957403oi2.LIZLLL("page_name", this.LLILLL);
        if (this.LLILZ <= 6) {
            obj = "no_greater_than_6";
        } else {
            obj = "greater_than_6";
        }
        c957403oi2.LIZLLL("sku_show_type", obj);
        c957403oi2.LIZLLL("stay_time", Long.valueOf(this.LLILZIL));
        c957403oi2.LIZLLL("quit_type", this.LLILZLL);
        c957403oi2.LIZLLL("is_load_data", Integer.valueOf(this.LLIZ ? 1 : 0));
        Object obj3 = this.LLIZLLLIL;
        if (obj3 != null) {
            c957403oi2.LIZLLL("currency", obj3);
        }
        if (!linkedHashMap.containsKey("previous_page") && (obj2 = this.LLJ) != null) {
            c957403oi2.LIZLLL("previous_page", obj2);
        }
        SkuItem skuItem = this.LLJI;
        if (skuItem != null) {
            String str2 = skuItem.skuId;
            if (str2 != null && !a0.LJJJIL(str2)) {
                c957403oi2.LIZLLL("sku_id", str2);
            }
            c957403oi2.LJ(C10296040w.LIZIZ(skuItem));
            SkuPrice skuPrice = skuItem.price;
            if (skuPrice != null && (str = skuPrice.originalPriceVal) != null && !a0.LJJJIL(str)) {
                c957403oi2.LIZLLL("original_price", str);
            }
            SkuPrice skuPrice2 = skuItem.price;
            if (skuPrice2 != null && (price = skuPrice2.realPrice) != null && (priceVal = price.getPriceVal()) != null && !a0.LJJJIL(priceVal)) {
                c957403oi2.LIZLLL("sale_price", priceVal);
            }
        }
        Object obj4 = this.LLJIJIL;
        if (obj4 != null) {
            c957403oi2.LIZLLL("source_button", obj4);
        }
        Object obj5 = this.LLJILJIL;
        if (obj5 != null) {
            c957403oi2.LIZLLL("coupon_id", obj5);
        }
        Object obj6 = this.LLJILJILJ;
        if (obj6 != null) {
            c957403oi2.LIZLLL("coupon_type_id", obj6);
        }
        Object obj7 = this.LLJILLL;
        if (obj7 != null) {
            c957403oi2.LIZLLL("coupon_type_info", obj7);
        }
        Object obj8 = this.LLJJ;
        if (obj8 != null) {
            c957403oi2.LIZLLL("coupon_zone", obj8);
        }
        Object obj9 = this.LLJJI;
        if (obj9 != null) {
            c957403oi2.LIZLLL("benefit_type", obj9);
        }
        Object obj10 = this.LLJJIII;
        if (obj10 != null) {
            c957403oi2.LIZLLL("sub_page_name", obj10);
        }
        Object obj11 = this.LLJILJIL;
        Object obj12 = "";
        if (obj11 == null) {
            obj11 = "";
        }
        c957403oi2.LIZLLL("coupon_id", obj11);
        Object obj13 = this.LLJILJILJ;
        if (obj13 == null) {
            obj13 = "";
        }
        c957403oi2.LIZLLL("coupon_type_id", obj13);
        Object obj14 = this.LLJILLL;
        if (obj14 != null) {
            obj12 = obj14;
        }
        c957403oi2.LIZLLL("coupon_type_info", obj12);
        c957403oi2.LIZLLL("is_coupon_tips_shown", Integer.valueOf(this.LLJJIJI));
        c957403oi2.LIZLLL("is_shipping_coupon_tips_shown", Integer.valueOf(this.LLJJIJIIJIL));
        if (Intrinsics.LJFF(this.LLJ, "shop_review")) {
            c957403oi2.LIZLLL("review_cnt", Integer.valueOf(C1073704Hv.LIZIZ));
            c957403oi2.LIZLLL("shop_review_cnt", Integer.valueOf(C1073704Hv.LIZJ));
        }
        c957403oi2.LJ(C00H3.LIZ(this.LLJJIJIL));
        Map<String, ? extends Object> map3 = this.LLJJJ;
        if (map3 != null) {
            c957403oi2.LJ(map3);
        }
        Object obj15 = this.LLJJJIL;
        if (obj15 != null) {
            c957403oi2.LIZLLL("pdp_unique_id", obj15);
        }
        C1427600nFm c1427600nFm = this.LLJJJJ;
        if (c1427600nFm != null) {
            c957403oi2.LIZLLL("description_stay_time", Long.valueOf(c1427600nFm.LIZLLL * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
            c957403oi2.LIZLLL("description_length", Integer.valueOf(c1427600nFm.LIZ));
            c957403oi2.LIZLLL("description_percent", Integer.valueOf(c1427600nFm.LIZJ()));
            c957403oi2.LIZLLL("description_elements", c1427600nFm.LIZJ);
        }
        SkuPanelState skuPanelState = this.LLJJJJJIL;
        if (skuPanelState != null) {
            Integer num = skuPanelState.isDefaultPreSelect;
            if (num != null) {
                c957403oi2.LIZLLL("is_default_pre_select", Integer.valueOf(num.intValue()));
            }
            Integer num2 = skuPanelState.isDefaultPreSelect;
            if (num2 != null && num2.intValue() == 1) {
                Object obj16 = skuPanelState.defaultPreSelectType;
                if (obj16 != null) {
                    c957403oi2.LIZLLL("default_pre_select_type", obj16);
                }
                for (Map.Entry<String, Object> entry : skuPanelState.LIZJ().entrySet()) {
                    c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
        return Unit.LIZ;
    }
}
