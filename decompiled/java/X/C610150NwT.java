package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$requestFeedReachCfg$1$feedReachSsResponse$1", f = "EcVideoGuideVM.kt", l = {248}, m = "invokeSuspend")
public final class C610150NwT extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>>, Object> {
    public int LL;
    public final /* synthetic */ EcVideoGuideVM LLILLJJLI;
    public final /* synthetic */ FeedReachGetParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610150NwT(EcVideoGuideVM ecVideoGuideVM, FeedReachGetParams feedReachGetParams, InterfaceC1364105Vn<? super C610150NwT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = ecVideoGuideVM;
        this.LLILLL = feedReachGetParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610150NwT(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<FeedReachResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcVideoGuideVM@7136.requestFeedReachCfg$1$feedReachSsResponse$1");
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
            InterfaceC610110NwP interfaceC610110NwP = (InterfaceC610110NwP) this.LLILLJJLI.LLILLL.getValue().getOperator();
            FeedReachGetParams feedReachGetParams = this.LLILLL;
            this.LL = 1;
            obj = interfaceC610110NwP.W(feedReachGetParams, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideVM@7136.requestFeedReachCfg$1$feedReachSsResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcVideoGuideVM@7136.requestFeedReachCfg$1$feedReachSsResponse$1");
        return obj;
    }
}
