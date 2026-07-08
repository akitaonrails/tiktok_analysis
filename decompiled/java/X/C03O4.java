package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03O4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O4 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ExceptionUX LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Summary LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ AddonOrder LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;
    public final /* synthetic */ Map<String, Object> LLJILLL;
    public final /* synthetic */ List<ShopOrderNew> LLJJ;
    public final /* synthetic */ Map<String, String> LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03O4(Map<String, ? extends Object> map, String str, String str2, boolean z, ExceptionUX exceptionUX, Object obj, Integer num, boolean z2, Summary summary, Integer num2, AddonOrder addonOrder, String str3, Integer num3, Map<String, ? extends Object> map2, List<ShopOrderNew> list, Map<String, String> map3) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = exceptionUX;
        this.LLILZLL = obj;
        this.LLIZ = num;
        this.LLIZLLLIL = z2;
        this.LLJ = summary;
        this.LLJI = num2;
        this.LLJIJIL = addonOrder;
        this.LLJILJIL = str3;
        this.LLJILJILJ = num3;
        this.LLJILLL = map2;
        this.LLJJ = list;
        this.LLJJI = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        Object obj;
        Object obj2;
        String strLJIIIIZZ;
        int iIntValue;
        int i;
        String string;
        boolean z;
        Price price;
        String currency;
        Price price2;
        String priceVal;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        ((HashMap) c957403oi2.LIZ).putAll(this.LL);
        HashMap mapLJ = C1741890vQh.LJ("entrance_info", this.LL);
        String str = null;
        if (mapLJ != null) {
            obj = mapLJ.get("enter_from");
        } else {
            obj = null;
        }
        c957403oi2.LIZJ("enter_from", String.valueOf(obj));
        HashMap mapLJ2 = C1741890vQh.LJ("entrance_info", this.LL);
        if (mapLJ2 != null) {
            obj2 = mapLJ2.get("source_previous_page");
        } else {
            obj2 = null;
        }
        c957403oi2.LIZJ("source_previous_page", String.valueOf(obj2));
        String str2 = this.LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        c957403oi2.LIZJ("is_success", str2);
        String str3 = this.LLILLL;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZJ("fail_reason", str3);
        c957403oi2.LIZJ("is_retry", Integer.valueOf(this.LLILZ ? 1 : 0));
        ExceptionUX exceptionUX = this.LLILZIL;
        if (exceptionUX == null || (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(exceptionUX)) == null) {
            strLJIIIIZZ = "";
        }
        c957403oi2.LIZJ("exception_ux", strLJIIIIZZ);
        c957403oi2.LIZJ("page_name", "order_submit");
        long j = C03O0.LJIIIIZZ;
        if (j != -1) {
            c957403oi2.LIZIZ("api_duration", Long.valueOf(j));
        }
        Object obj3 = this.LLILZLL;
        if ((obj3 instanceof Long) && !Intrinsics.LJFF(obj3, -1L)) {
            c957403oi2.LIZLLL("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.LLILZLL).longValue()));
        }
        Integer num = this.LLIZ;
        int i2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c957403oi2.LIZJ("is_delivery_info_complete", Integer.valueOf(iIntValue));
        if (C03O0.LJIIIZ > 0) {
            i = 2;
        } else if (this.LLIZLLLIL) {
            i = 0;
        } else {
            i = 1;
        }
        c957403oi2.LIZLLL("request_type", String.valueOf(i));
        Summary summary = this.LLJ;
        if (summary != null && (price2 = summary.total) != null && (priceVal = price2.getPriceVal()) != null) {
            c957403oi2.LIZLLL("total_payment", priceVal);
        }
        HashMap map = new HashMap();
        Map<String, String> map2 = this.LLJJI;
        C03O0.LIZ.getClass();
        C03O0.LIZJ(map, map2);
        c957403oi2.LJ(map);
        HashMap map3 = new HashMap();
        C03O0.LIZLLL(map3, this.LLJJI);
        c957403oi2.LJ(map3);
        Summary summary2 = this.LLJ;
        if (summary2 != null && (price = summary2.total) != null && (currency = price.getCurrency()) != null) {
            c957403oi2.LIZLLL("currency", currency);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = C03O0.LIZIZ;
        Summary summary3 = this.LLJ;
        Object obj4 = concurrentHashMap.get("product_id");
        if (obj4 != null) {
            c957403oi2.LIZLLL("product_id", obj4);
        }
        Object obj5 = concurrentHashMap.get("biz_type");
        if (obj5 != null) {
            c957403oi2.LIZLLL("biz_type", obj5);
        }
        Object obj6 = concurrentHashMap.get("is_platform_product");
        if (obj6 != null) {
            c957403oi2.LIZLLL("is_platform_product", obj6);
        }
        Object obj7 = concurrentHashMap.get("seller_product_id");
        if (obj7 != null) {
            c957403oi2.LIZLLL("seller_product_id", obj7);
        }
        Object obj8 = concurrentHashMap.get("platform_product_id");
        if (obj8 != null) {
            c957403oi2.LIZLLL("platform_product_id", obj8);
        }
        Object obj9 = concurrentHashMap.get("product_id_replaced");
        if (obj9 != null) {
            c957403oi2.LIZLLL("product_id_replaced", obj9);
        }
        Object obj10 = concurrentHashMap.get("summary_info");
        if (obj10 != null) {
            c957403oi2.LIZLLL("summary_info", obj10);
        } else {
            if (summary3 != null) {
                str = C720302rZ.LJ(summary3).LIZLLL;
            }
            c957403oi2.LIZLLL("summary_info", String.valueOf(str));
        }
        Integer num2 = this.LLJI;
        if (num2 != null) {
            c957403oi2.LIZLLL("change_type", Integer.valueOf(num2.intValue()));
        }
        AddonOrder addonOrder = this.LLJIJIL;
        if (addonOrder != null) {
            if (addonOrder.isSelected != null && (!r0.isEmpty())) {
                Iterator<Map.Entry<String, Boolean>> it2 = addonOrder.isSelected.entrySet().iterator();
                z = false;
                while (it2.hasNext()) {
                    if (it2.next().getValue().booleanValue()) {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            List<PackedSku> list = addonOrder.packedSkus;
            if (list != null) {
                C13LP.LJJJLL(list);
            }
            if (z) {
                c957403oi2.LIZLLL("add_on_source_page_type", "add_on_order_submit_rec");
                c957403oi2.LIZLLL("add_on_entrance_form", "append_goods_card");
            }
        }
        if (C770702zh.LIZ(this.LLJILJIL)) {
            c957403oi2.LIZLLL("price_per_unit", this.LLJILJIL);
        }
        Integer num3 = this.LLJILJILJ;
        if (num3 != null) {
            c957403oi2.LIZLLL("subscribe_sku_cnt", Integer.valueOf(num3.intValue()));
        }
        Map<String, Object> map4 = this.LLJILLL;
        if (map4 != null) {
            for (Map.Entry<String, Object> entry : map4.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                c957403oi2.LIZLLL(key, string);
            }
        }
        List<ShopOrderNew> list2 = this.LLJJ;
        if (list2 != null) {
            c957403oi2.LJ(C7806033c.LJIILLIIL(list2));
        }
        Integer num4 = this.LLJI;
        int value2 = C03DI.PLUS_VOUCHER_CENTER.getValue();
        if (num4 != null && num4.intValue() == value2) {
            i2 = 1;
        }
        c957403oi2.LIZLLL("is_membership_success", Integer.valueOf(i2));
        return Unit.LIZ;
    }
}
