package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NwR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$feedReachUpdate$1$1$1", f = "EcVideoGuideVM.kt", l = {535}, m = "invokeSuspend")
public final class C610130NwR extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<Response<Unit>>>, Object> {
    public int LL;
    public final /* synthetic */ EcVideoGuideVM LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ List<ReachCfg> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610130NwR(EcVideoGuideVM ecVideoGuideVM, int i, List<ReachCfg> list, int i2, InterfaceC1364105Vn<? super C610130NwR> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = ecVideoGuideVM;
        this.LLILLL = i;
        this.LLILZ = list;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610130NwR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<Response<Unit>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcVideoGuideVM@7136.feedReachUpdate$1$1$1");
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
            FeedReachUpdateParams feedReachUpdateParams = new FeedReachUpdateParams(this.LLILLL, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            obj = interfaceC610110NwP.LJIILLIIL(feedReachUpdateParams, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcVideoGuideVM@7136.feedReachUpdate$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EcVideoGuideVM@7136.feedReachUpdate$1$1$1");
        return obj;
    }
}
