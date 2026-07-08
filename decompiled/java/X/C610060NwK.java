package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$showNoAnchorGuide$4$updateResponse$1", f = "EcVideoGuideAssem.kt", l = {573}, m = "invokeSuspend")
public final class C610060NwK extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<Unit>>>, Object> {
    public int LL;
    public final /* synthetic */ ReachCfg LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610060NwK(ReachCfg reachCfg, int i, InterfaceC1364105Vn<? super C610060NwK> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = reachCfg;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610060NwK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listSingletonList;
        C1C7U.LIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4$updateResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ReachCfg reachCfg = this.LLILLJJLI;
            if (reachCfg != null) {
                listSingletonList = Collections.singletonList(reachCfg);
            } else {
                listSingletonList = null;
            }
            FeedReachUpdateParams feedReachUpdateParams = new FeedReachUpdateParams(1, listSingletonList, this.LLILLL);
            InterfaceC610090NwN interfaceC610090NwN = (InterfaceC610090NwN) C0NSL.LIZ().create(InterfaceC610090NwN.class);
            this.LL = 1;
            obj = interfaceC610090NwN.LJIILLIIL(feedReachUpdateParams, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4$updateResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$4$updateResponse$1");
        return obj;
    }
}
