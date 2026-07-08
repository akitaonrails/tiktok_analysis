package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03O5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03O5 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ExceptionUX LLILZIL;
    public final /* synthetic */ C03O1 LLILZLL;
    public final /* synthetic */ Object LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Summary LLJ;
    public final /* synthetic */ Integer LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Map<String, Object> LLJILJIL;
    public final /* synthetic */ Map<String, String> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03O5(Map<String, ? extends Object> map, String str, String str2, boolean z, ExceptionUX exceptionUX, C03O1 c03o1, Object obj, boolean z2, Summary summary, Integer num, String str3, Map<String, ? extends Object> map2, Map<String, String> map3) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = exceptionUX;
        this.LLILZLL = c03o1;
        this.LLIZ = obj;
        this.LLIZLLLIL = z2;
        this.LLJ = summary;
        this.LLJI = num;
        this.LLJIJIL = str3;
        this.LLJILJIL = map2;
        this.LLJILJILJ = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        Object obj;
        Object obj2;
        String strLJIIIIZZ;
        int i;
        String string;
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
        c957403oi2.LIZJ("page_name", "mini_order_submit");
        long j = this.LLILZLL.LJII;
        if (j != -1) {
            c957403oi2.LIZIZ("api_duration", Long.valueOf(j));
        }
        Object obj3 = this.LLIZ;
        if ((obj3 instanceof Long) && !Intrinsics.LJFF(obj3, -1L)) {
            c957403oi2.LIZLLL("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.LLIZ).longValue()));
        }
        if (this.LLILZLL.LJIIIIZZ > 0) {
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
        Map<String, String> map2 = this.LLJILJILJ;
        C03O0.LIZ.getClass();
        C03O0.LIZJ(map, map2);
        c957403oi2.LJ(map);
        HashMap map3 = new HashMap();
        C03O0.LIZLLL(map3, this.LLJILJILJ);
        c957403oi2.LJ(map3);
        Summary summary2 = this.LLJ;
        if (summary2 != null && (price = summary2.total) != null && (currency = price.getCurrency()) != null) {
            c957403oi2.LIZLLL("currency", currency);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = this.LLILZLL.LIZ;
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
        Integer num = this.LLJI;
        if (num != null) {
            c957403oi2.LIZLLL("change_type", Integer.valueOf(num.intValue()));
        }
        if (C770702zh.LIZ(this.LLJIJIL)) {
            c957403oi2.LIZLLL("price_per_unit", this.LLJIJIL);
        }
        Map<String, Object> map4 = this.LLJILJIL;
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
        return Unit.LIZ;
    }
}
