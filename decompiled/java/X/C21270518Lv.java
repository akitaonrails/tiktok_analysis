package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Lv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270518Lv extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ AnchorProductInfoModel LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ = "video_comment_multi_anchor";
    public final /* synthetic */ AwemePruningModel LLILZIL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270518Lv(int i, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, String str, String str2, String str3, List list, Map map) {
        super(1);
        this.LL = anchorProductInfoModel;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZIL = awemePruningModel;
        this.LLILZLL = list;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        Map<String, ? extends Object> map = this.LL.extraData.promotionLogExtraInfo;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        C21272218Mm.LIZ(Integer.valueOf(this.LLILLJJLI), this.LLILLL, this.LLILZ, this.LL, this.LLILZIL, this.LLILZLL, c957403oi2);
        String str = this.LLIZ;
        if (str != null) {
            c957403oi2.LIZLLL("countdown_type", str);
        }
        String str2 = this.LLIZLLLIL;
        if (str2 != null) {
            c957403oi2.LIZLLL("activity_name", str2);
        }
        c957403oi2.LJ(this.LLJ);
        c957403oi2.LJ(C21272018Mk.LJJIFFI(C21272018Mk.LIZ, null, this.LLILZIL, 1));
        AnchorProductInfo anchorProductInfo = this.LL.extraData;
        c957403oi2.LJ(C21272018Mk.LJIJJ(anchorProductInfo, anchorProductInfo.skus));
        return Unit.LIZ;
    }
}
