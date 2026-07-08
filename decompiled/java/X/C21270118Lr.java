package X;

import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.18Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.logger.AnchorLogger$logCommentAnchorView$1", f = "AnchorLogger.kt", l = {}, m = "invokeSuspend")
public final class C21270118Lr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnchorProductInfoModel LLILZ;
    public final /* synthetic */ List<AnchorProductInfoModel> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ List<SkuItem> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21270118Lr(Aweme aweme, String str, boolean z, AnchorProductInfoModel anchorProductInfoModel, List<AnchorProductInfoModel> list, boolean z2, String str2, Map<String, Object> map, List<SkuItem> list2, InterfaceC1364105Vn<? super C21270118Lr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = anchorProductInfoModel;
        this.LLILZIL = list;
        this.LLILZLL = z2;
        this.LLIZ = str2;
        this.LLIZLLLIL = map;
        this.LLJ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21270118Lr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("AnchorLogger@8da.logCommentAnchorView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AwemePruningModel awemePruningModelLJJIJIL = C21272218Mm.LJJIJIL(this.LL, this.LLILLJJLI);
        if (this.LLILLL) {
            str = "tiktok_video_anchor_view";
        } else {
            str = "tiktok_video_anchor_click";
        }
        C1018703yb.LIZLLL(str, new C18M5(this.LL, awemePruningModelLJJIJIL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnchorLogger@8da.logCommentAnchorView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
