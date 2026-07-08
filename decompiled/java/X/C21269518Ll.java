package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21269518Ll extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ ProductListModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, List<PromotionLabel>> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21269518Ll(ProductListModel productListModel, String str, Map<String, List<PromotionLabel>> map, String str2) {
        super(1);
        this.LL = productListModel;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("page_name", "video");
        String str = this.LL.requestId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("request_id", str);
        String str3 = this.LL.eventType;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("enter_from", str3);
        c957403oi2.LIZLLL("entrance_form", "video_single_anchor");
        String str4 = this.LL.aid;
        if (str4 != null) {
            str2 = str4;
        }
        c957403oi2.LIZLLL("group_id", str2);
        c957403oi2.LIZLLL("product_id", this.LLILLJJLI);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        Map<String, List<PromotionLabel>> map = this.LLILLL;
        String str5 = this.LLILLJJLI;
        c21272018Mk.getClass();
        c957403oi2.LIZLLL("product_promotion_tag", C21272018Mk.LJIJJLI(str5, map));
        c957403oi2.LIZLLL("source_page_type", "video");
        c957403oi2.LIZLLL("track_id", this.LLILZ);
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        ProductListModel productListModel = this.LL;
        anchorBizUtils.getClass();
        c957403oi2.LIZLLL("pure_ecommerce", Integer.valueOf(AnchorBizUtils.LJJJZ(productListModel) ? 1 : 0));
        return Unit.LIZ;
    }
}
