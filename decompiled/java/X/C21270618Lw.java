package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270618Lw extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ AwemePruningModel LL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL = "video_comment_multi_anchor";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270618Lw(AwemePruningModel awemePruningModel, List list, Long l, Integer num, String str) {
        super(1);
        this.LL = awemePruningModel;
        this.LLILLJJLI = list;
        this.LLILLL = l;
        this.LLILZ = num;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        int size;
        AnchorProductInfoModel anchorProductInfoModel;
        AwemeRawAd awemeRawAd;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("list_name", "video_shopping_list");
        c957403oi2.LIZLLL("enter_list_form", "video_multi_anchor");
        AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
        AwemePruningModel awemePruningModel = this.LL;
        anchorBizUtils.getClass();
        if (AnchorBizUtils.LJJJJZI(awemePruningModel) && (awemeRawAd = this.LL.awemeRawAd) != null) {
            c957403oi2.LIZLLL("ad_id", awemeRawAd.getAdId());
            c957403oi2.LIZLLL("creative_id", awemeRawAd.getCreativeId());
        }
        List<AnchorProductInfoModel> list = this.LLILLJJLI;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        c957403oi2.LIZLLL("product_cnt", Integer.valueOf(size));
        Long l = this.LLILLL;
        if (l != null) {
            c957403oi2.LIZLLL("stay_time", Integer.valueOf((int) l.longValue()));
        }
        Integer num = this.LLILZ;
        if (num != null) {
            c957403oi2.LIZLLL("is_load_data", Integer.valueOf(num.intValue()));
        }
        String str = this.LLILZIL;
        if (str != null) {
            c957403oi2.LIZLLL("quit_type", str);
        }
        List<AnchorProductInfoModel> list2 = this.LLILLJJLI;
        if (list2 != null && (anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(list2)) != null) {
            C21272218Mm.LIZ(null, null, this.LLILZLL, anchorProductInfoModel, this.LL, this.LLILLJJLI, c957403oi2);
        }
        List<AnchorProductInfoModel> list3 = this.LLILLJJLI;
        if (list3 != null) {
            c957403oi2.LIZLLL("product_id", AnchorBizUtils.LJIL(list3));
            C21272018Mk.LIZ.getClass();
            c957403oi2.LIZLLL("biz_type", C21272018Mk.LIZLLL(list3));
        }
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        c957403oi2.LJ(C21272018Mk.LJJIFFI(c21272018Mk, null, this.LL, 1));
        c957403oi2.LJ(C21272018Mk.LJJIFFI(c21272018Mk, null, this.LL, 1));
        return Unit.LIZ;
    }
}
