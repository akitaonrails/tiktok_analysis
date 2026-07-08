package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.033g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7810033g extends C09AY implements Function1<Map<String, Object>, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL = "shipping_type";
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Float LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<String, String> LLJI;
    public final /* synthetic */ Map<String, Object> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7810033g(Map map, String str, int i, String str2, Float f, String str3, String str4, String str5, Map map2, Map map3) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILZ = i;
        this.LLILZIL = str2;
        this.LLILZLL = f;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = map2;
        this.LLJIJIL = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, Object> map) {
        Object string;
        Map<String, Object> map2 = map;
        map2.putAll(this.LL);
        Object obj = this.LLILLJJLI;
        if (obj == null) {
            obj = "";
        }
        map2.put("option_name", obj);
        map2.put("option_type", this.LLILLL);
        map2.put("rank", Integer.valueOf(this.LLILZ));
        Object obj2 = this.LLILZIL;
        if (obj2 != null) {
            map2.put("sub_page_name", obj2);
        }
        Float f = this.LLILZLL;
        if (f != null) {
            f.floatValue();
            map2.put("shipping_price", f);
        }
        Object obj3 = this.LLIZ;
        if (obj3 != null) {
            map2.put("shipping_currency", obj3);
        }
        Object obj4 = this.LLIZLLLIL;
        if (obj4 != null) {
            map2.put("free_shipping_condition", obj4);
        }
        Object obj5 = this.LLJ;
        if (obj5 != null) {
            map2.put("is_next_day_delivery", obj5);
        }
        Map<? extends String, ? extends Object> map3 = this.LLJI;
        if (map3 != null) {
            map2.putAll(map3);
        }
        Map<String, Object> map4 = this.LLJIJIL;
        if (map4 != null) {
            for (Map.Entry<String, Object> entry : map4.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null || (string = value.toString()) == null) {
                    string = "";
                }
                map2.put(key, string);
            }
        }
        return Unit.LIZ;
    }
}
