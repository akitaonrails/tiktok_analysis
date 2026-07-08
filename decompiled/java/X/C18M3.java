package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18M3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M3 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ Map<String, Object> LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ AnchorProductInfo LLILLL;
    public final /* synthetic */ String LLILZ = "skip_pdp";
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ AnchorProductInfoModel LLIZ;
    public final /* synthetic */ List<SkuItem> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18M3(Map map, Aweme aweme, AnchorProductInfo anchorProductInfo, String str, Integer num, AnchorProductInfoModel anchorProductInfoModel, List list) {
        super(1);
        this.LL = map;
        this.LLILLJJLI = aweme;
        this.LLILLL = anchorProductInfo;
        this.LLILZIL = str;
        this.LLILZLL = num;
        this.LLIZ = anchorProductInfoModel;
        this.LLIZLLLIL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        String string;
        HashMap<String, Object> mapLJIIJ;
        AnchorProductInfo anchorProductInfo;
        AnchorProductInfo anchorProductInfo2;
        AnchorProductInfo anchorProductInfo3;
        AnchorProductInfo anchorProductInfo4;
        Aweme aweme;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("EVENT_ORIGIN_FEATURE", "TEMAI");
        Object obj = this.LL.get("page_name");
        if (obj == null) {
            obj = "cart";
        }
        c957403oi2.LIZJ("page_name", obj);
        Object obj2 = this.LL.get("author_id");
        Object obj3 = "";
        if (obj2 == null) {
            obj2 = "";
        }
        c957403oi2.LIZJ("author_id", obj2);
        Object obj4 = this.LL.get("entrance_form");
        if (obj4 == null) {
            obj4 = "video_multi_anchor";
        }
        c957403oi2.LIZJ("entrance_form", obj4);
        c957403oi2.LIZJ("source_page_type", "video");
        c957403oi2.LIZJ("previous_page", "video");
        Object groupId = this.LL.get("group_id");
        Integer num = null;
        if (groupId == null && ((aweme = this.LLILLJJLI) == null || (groupId = aweme.getGroupId()) == null)) {
            groupId = "";
        }
        c957403oi2.LIZJ("source_content_id", groupId);
        Object obj5 = this.LL.get("product_id");
        if (obj5 == null && ((anchorProductInfo4 = this.LLILLL) == null || (obj5 = anchorProductInfo4.productId) == null)) {
            obj5 = "";
        }
        c957403oi2.LIZJ("product_id", obj5);
        Object obj6 = this.LL.get("product_source");
        if (obj6 == null && ((anchorProductInfo3 = this.LLILLL) == null || (obj6 = anchorProductInfo3.platform) == null)) {
            obj6 = "";
        }
        c957403oi2.LIZJ("product_source", obj6);
        Object obj7 = this.LL.get("source_from");
        if (obj7 == null && ((anchorProductInfo2 = this.LLILLL) == null || (obj7 = anchorProductInfo2.sourceFrom) == null)) {
            obj7 = "";
        }
        c957403oi2.LIZJ("source_from", obj7);
        Object obj8 = this.LL.get("source");
        if (obj8 == null && ((anchorProductInfo = this.LLILLL) == null || (obj8 = anchorProductInfo.source) == null)) {
            obj8 = "";
        }
        c957403oi2.LIZJ("source", obj8);
        c957403oi2.LIZJ("purchase_path", this.LLILZ);
        C18M2 c18m2 = C18M2.LIZ;
        Map<String, Object> map = this.LL;
        c18m2.getClass();
        c957403oi2.LIZJ("entrance_info", C1741890vQh.LJIIIIZZ(C18M2.LIZIZ(C18M2.LIZIZ, map)));
        Object obj9 = this.LL.get("track_id");
        if (obj9 == null) {
            obj9 = "";
        }
        c957403oi2.LIZJ("track_id", obj9);
        Object obj10 = this.LL.get("saleable_sku_num");
        if (obj10 == null) {
            obj10 = "";
        }
        c957403oi2.LIZJ("saleable_sku_num", obj10);
        String str2 = this.LLILZIL;
        if (str2 != null) {
            c957403oi2.LIZJ("sku_id", str2);
        }
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            c957403oi2.LIZJ("quantity", Integer.valueOf(num2.intValue()));
        }
        Object obj11 = this.LL.get("btm_param_map_key");
        if (obj11 != null && (string = obj11.toString()) != null && (mapLJIIJ = C1741890vQh.LJIIJ(string)) != null) {
            c957403oi2.LJ(mapLJIIJ);
        }
        Object obj12 = this.LL.get("video_shopping_list_style");
        if (obj12 == null) {
            obj12 = "";
        }
        c957403oi2.LIZJ("video_shopping_list_style", obj12);
        Object obj13 = this.LL.get("sale_price");
        if (obj13 == null) {
            obj13 = "";
        }
        c957403oi2.LIZJ("sale_price", obj13);
        Object obj14 = this.LL.get("original_price");
        if (obj14 == null) {
            obj14 = "";
        }
        c957403oi2.LIZJ("original_price", obj14);
        Object obj15 = this.LL.get("enter_from_info");
        if (obj15 == null) {
            obj15 = "";
        }
        c957403oi2.LIZJ("enter_from_info", obj15);
        Object obj16 = this.LL.get("original_price_value");
        if (obj16 != null) {
            obj3 = obj16;
        }
        c957403oi2.LIZJ("original_price_value", obj3);
        AnchorProductInfo anchorProductInfo5 = this.LLILLL;
        if (anchorProductInfo5 != null) {
            num = anchorProductInfo5.productStatus;
        }
        int value = EnumC19366010pe.PRODUCT_STATUS_ON_SALES.getValue();
        if (num != null && num.intValue() == value) {
            str = "1";
        } else {
            int value2 = EnumC19366010pe.PRODUCT_STATUS_STOCK.getValue();
            if (num != null && num.intValue() == value2) {
                str = "2";
            } else {
                str = "3";
            }
        }
        c957403oi2.LIZJ("product_type", str);
        Object obj17 = this.LL.get("rights_cnt");
        if (obj17 != null) {
            c957403oi2.LIZJ("rights_cnt", obj17);
        }
        Object obj18 = this.LL.get("rights_content");
        if (obj18 != null) {
            c957403oi2.LIZJ("rights_content", obj18);
        }
        AnchorProductInfoModel anchorProductInfoModel = this.LLIZ;
        if (anchorProductInfoModel != null) {
            C21272018Mk c21272018Mk = C21272018Mk.LIZ;
            List<SkuItem> list = this.LLIZLLLIL;
            c21272018Mk.getClass();
            c957403oi2.LJ(C21272018Mk.LJIJI(anchorProductInfoModel, list));
        }
        return Unit.LIZ;
    }
}
