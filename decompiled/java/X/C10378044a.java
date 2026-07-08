package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.044a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10378044a extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C042Y LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Map<String, Integer> LLILZIL;
    public final /* synthetic */ ProductPackStruct LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10378044a(C042Y c042y, int i, int i2, int i3, Map<String, Integer> map, ProductPackStruct productPackStruct, String str, String str2, String str3) {
        super(1);
        this.LL = c042y;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = map;
        this.LLILZLL = productPackStruct;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        int i;
        String strLIZ;
        List<SaleProp> list;
        LaneParams laneParams2 = laneParams;
        String str2 = this.LL.LLJJI;
        if (str2 != null) {
            C1010603xI.LIZJ(laneParams2, str2);
        }
        laneParams2.plusAssign("module_name", "sku");
        laneParams2.plusAssign("button_name", "sku_select");
        laneParams2.plusAssign("button_type", "select_attr");
        laneParams2.plusAssign("is_single_sku", Integer.valueOf(this.LLILLJJLI));
        if (this.LL.LLJI) {
            str = "select";
        } else {
            str = "cancel";
        }
        laneParams2.plusAssign("select_type", str);
        laneParams2.plusAssign("pdp_sku_attr_rank", Integer.valueOf(this.LLILLL + 1));
        laneParams2.plusAssign("pdp_sku_value_rank", Integer.valueOf(this.LLILZ + 1));
        laneParams2.plusAssign("sale_prop_status", Integer.valueOf(this.LL.LLIZLLLIL ? 1 : 0));
        C044V.LIZ.getClass();
        laneParams2.plusAssign("is_low_stock", C044V.LIZIZ.get("is_low_stock"));
        if (this.LL.LLILLL != null) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams2.plusAssign("is_price_value_shown", Integer.valueOf(i));
        Map<String, Integer> map = this.LLILZIL;
        if (map != null && map.size() == 0) {
            strLIZ = "{}";
        } else {
            strLIZ = C044V.LIZ(this.LLILZIL);
        }
        laneParams2.plusAssign("sku_tag_cnt", strLIZ);
        ProductPackStruct productPackStruct = this.LLILZLL;
        if (productPackStruct != null && (list = productPackStruct.saleProps) != null) {
            list.size();
            laneParams2.plusAssign("sku_attr_cnt", Integer.valueOf(this.LLILZLL.saleProps.size()));
        }
        String str3 = this.LLIZ;
        if (str3 != null && !a0.LJJJIL(str3)) {
            laneParams2.plusAssign("positive_review_tag_percentage", this.LLIZ);
        }
        laneParams2.plusAssign("is_image_sku", Integer.valueOf(this.LL.LIZIZ() ? 1 : 0));
        SalePropTag salePropTag = this.LL.LLILZLL;
        if (salePropTag != null) {
            String str4 = salePropTag.tagName;
            if (str4 == null) {
                str4 = "hot";
            }
            laneParams2.plusAssign("sku_tag_name", str4);
        }
        laneParams2.plusAssign("first_category_id", this.LLIZLLLIL);
        String str5 = this.LLJ;
        if (str5 != null) {
            laneParams2.plusAssign("page_type", str5);
        }
        laneParams2.plusAssign("prop_value", this.LL.LLILLJJLI);
        laneParams2.plusAssign("prop_value_id", this.LL.LL);
        return Unit.LIZ;
    }
}
