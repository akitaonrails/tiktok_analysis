package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Ls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270218Ls extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AnchorProductInfoModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ AwemePruningModel LLILZ;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270218Ls(int i, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, List list, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = anchorProductInfoModel;
        this.LLILLL = i;
        this.LLILZ = awemePruningModel;
        this.LLILZIL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("button_name", "add_to_cart");
        if (this.LL) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        c957403oi2.LIZLLL("button_type", str);
        Map<String, ? extends Object> map = this.LLILLJJLI.extraData.promotionLogExtraInfo;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        C21272218Mm.LIZ(Integer.valueOf(this.LLILLL), null, null, this.LLILLJJLI, this.LLILZ, this.LLILZIL, c957403oi2);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        AnchorProductInfo anchorProductInfo = this.LLILLJJLI.extraData;
        List<SkuItem> list = anchorProductInfo.skus;
        c21272018Mk.getClass();
        c957403oi2.LJ(C21272018Mk.LJIJJ(anchorProductInfo, list));
        return Unit.LIZ;
    }
}
