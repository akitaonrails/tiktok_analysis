package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0w3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766220w3w extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ = "skip_pdp";
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766220w3w(Map map, Object obj, Object obj2, String str, Integer num, Map map2) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZIL = str;
        this.LLILZLL = num;
        this.LLIZ = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj = this.LL.get("page_name");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        c957403oi2.LIZJ("page_name", obj);
        Object obj3 = this.LL.get("author_id");
        if (obj3 == null) {
            obj3 = "";
        }
        c957403oi2.LIZJ("author_id", obj3);
        Object obj4 = this.LL.get("entrance_form");
        if (obj4 == null) {
            obj4 = "";
        }
        c957403oi2.LIZJ("entrance_form", obj4);
        c957403oi2.LIZJ("source_page_type", "live");
        c957403oi2.LIZJ("previous_page", "live");
        Object obj5 = this.LL.get("room_id");
        if (obj5 == null) {
            obj5 = "";
        }
        c957403oi2.LIZJ("source_content_id", obj5);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("_temai_");
        sbLIZ.append(this.LLILLL);
        c957403oi2.LIZJ("enter_from_info", C2188811AlT.LIZIZ(sbLIZ));
        Object obj6 = this.LL.get("product_id");
        if (obj6 == null) {
            obj6 = "";
        }
        c957403oi2.LIZJ("product_id", obj6);
        Object obj7 = this.LL.get("product_source");
        if (obj7 == null) {
            obj7 = "";
        }
        c957403oi2.LIZJ("product_source", obj7);
        c957403oi2.LIZJ("product_type", 1);
        Object obj8 = this.LL.get("source_from");
        if (obj8 == null) {
            obj8 = "";
        }
        c957403oi2.LIZJ("source_from", obj8);
        Object obj9 = this.LL.get("source");
        if (obj9 == null) {
            obj9 = "";
        }
        c957403oi2.LIZJ("source", obj9);
        c957403oi2.LIZJ("purchase_path", this.LLILZ);
        c957403oi2.LIZJ("entrance_info", C1741890vQh.LJIIIIZZ(C1766240w3y.LJFF(C1766240w3y.LIZ, this.LL)));
        Object obj10 = this.LL.get("source_module");
        if (obj10 != null) {
            c957403oi2.LIZJ("source_module", obj10);
        }
        Object obj11 = this.LL.get("is_ad");
        if (obj11 == null) {
            obj11 = "";
        }
        c957403oi2.LIZJ("is_ad", obj11);
        Object obj12 = this.LL.get("ad_id");
        if (obj12 == null) {
            obj12 = "";
        }
        c957403oi2.LIZJ("ad_id", obj12);
        Object obj13 = this.LL.get("creative_id");
        if (obj13 == null) {
            obj13 = "";
        }
        c957403oi2.LIZJ("creative_id", obj13);
        Object obj14 = this.LL.get("track_id");
        if (obj14 != null) {
            c957403oi2.LIZJ("track_id", obj14);
        }
        Object obj15 = this.LL.get("saleable_sku_num");
        if (obj15 != null) {
            obj2 = obj15;
        }
        c957403oi2.LIZJ("saleable_sku_num", obj2);
        String str = this.LLILZIL;
        if (str != null) {
            c957403oi2.LIZJ("sku_id", str);
        }
        Integer num = this.LLILZLL;
        if (num != null) {
            c957403oi2.LIZJ("quantity", Integer.valueOf(num.intValue()));
        }
        Object obj16 = this.LL.get("rights_cnt");
        if (obj16 != null) {
            c957403oi2.LIZJ("rights_cnt", obj16);
        }
        Object obj17 = this.LL.get("rights_content");
        if (obj17 != null) {
            c957403oi2.LIZJ("rights_content", obj17);
        }
        c957403oi2.LIZJ("request_id", this.LL.get("request_id"));
        Object obj18 = this.LL.get("ecom_live_rcmd_info");
        if (obj18 != null) {
            c957403oi2.LIZJ("ecom_live_rcmd_info", obj18);
        }
        Map<String, String> map = this.LLIZ;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        return Unit.LIZ;
    }
}
