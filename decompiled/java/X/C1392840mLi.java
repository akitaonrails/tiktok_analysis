package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.ad.AdAnchorJumpUtils$reportAnchorShow$1", f = "AdAnchorJumpUtils.kt", l = {}, m = "invokeSuspend")
public final class C1392840mLi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnoleComponentModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392840mLi(AnoleComponentModel anoleComponentModel, String str, Aweme aweme, InterfaceC1364105Vn<? super C1392840mLi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anoleComponentModel;
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392840mLi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdAnchorJumpUtils@d21.reportAnchorShow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1392660mLQ c1392660mLQ = C1392660mLQ.LIZ;
        AnoleComponentModel anoleComponentModel = this.LL;
        c1392660mLQ.getClass();
        AnchorCommonStruct anchorCommonStructLIZIZ = C1392660mLQ.LIZIZ(anoleComponentModel);
        if (anchorCommonStructLIZIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdAnchorJumpUtils@d21.reportAnchorShow$1");
            return unit;
        }
        AnchorBizUtils.LIZ.getClass();
        JSONObject jSONObjectLIZJ = C1392660mLQ.LIZJ(C1392660mLQ.LIZ(this.LLILLJJLI, this.LLILLL, AnchorBizUtils.LJJZZIII(anchorCommonStructLIZIZ, true)).LIZ);
        C1507790pL7.LIZ.getClass();
        C1507790pL7.LJI("multi_anchor_entrance_show", jSONObjectLIZJ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdAnchorJumpUtils@d21.reportAnchorShow$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
