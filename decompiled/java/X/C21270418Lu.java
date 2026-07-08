package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfo;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Lu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21270418Lu extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AnchorProductInfoModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL = "video_comment_multi_anchor";
    public final /* synthetic */ AwemePruningModel LLILZLL;
    public final /* synthetic */ List<AnchorProductInfoModel> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Map<String, String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270418Lu(int i, AnchorProductInfoModel anchorProductInfoModel, AwemePruningModel awemePruningModel, String str, String str2, String str3, String str4, List list, Map map) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = anchorProductInfoModel;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZLL = awemePruningModel;
        this.LLIZ = list;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("click_area", this.LL);
        Map<String, ? extends Object> map = this.LLILLJJLI.extraData.promotionLogExtraInfo;
        if (map != null) {
            c957403oi2.LJ(map);
        }
        C21272218Mm.LIZ(Integer.valueOf(this.LLILLL), this.LLILZ, this.LLILZIL, this.LLILLJJLI, this.LLILZLL, this.LLIZ, c957403oi2);
        String str = this.LLIZLLLIL;
        if (str != null) {
            c957403oi2.LIZLLL("countdown_type", str);
        }
        String str2 = this.LLJ;
        if (str2 != null) {
            c957403oi2.LIZLLL("activity_name", str2);
        }
        c957403oi2.LJ(C21272018Mk.LJJIFFI(C21272018Mk.LIZ, null, this.LLILZLL, 1));
        c957403oi2.LJ(this.LLJI);
        AnchorProductInfo anchorProductInfo = this.LLILLJJLI.extraData;
        c957403oi2.LJ(C21272018Mk.LJIJJ(anchorProductInfo, anchorProductInfo.skus));
        return Unit.LIZ;
    }
}
