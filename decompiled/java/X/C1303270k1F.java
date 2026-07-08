package X;

import com.ss.android.ugc.aweme.bean.MixRankSkylightRequest;
import com.ss.android.ugc.aweme.bean.MixRankSkylightResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.service.FeedSkylightCommonServiceImpl$fetchMixRankSkylightDataObservable$1", f = "FeedSkylightCommonServiceImpl.kt", l = {368, 369}, m = "invokeSuspend")
public final class C1303270k1F extends C09AX implements Function2<C094D<? super MixRankSkylightResponse>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixRankSkylightRequest LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303270k1F(MixRankSkylightRequest mixRankSkylightRequest, InterfaceC1364105Vn<? super C1303270k1F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixRankSkylightRequest;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1303270k1F c1303270k1F = new C1303270k1F(this.LLILLL, interfaceC1364105Vn);
        c1303270k1F.LLILLJJLI = obj;
        return c1303270k1F;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0955 anonymousClass0955;
        C1C7U.LIZ("FeedSkylightCommonServiceImpl@9b1f.fetchMixRankSkylightDataObservable$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchMixRankSkylightDataObservable$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            anonymousClass0955 = (AnonymousClass0955) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            anonymousClass0955 = (AnonymousClass0955) this.LLILLJJLI;
            C1596430re5 c1596430re5 = C1596430re5.LIZ;
            MixRankSkylightRequest mixRankSkylightRequest = this.LLILLL;
            this.LLILLJJLI = anonymousClass0955;
            this.LL = 1;
            obj = c1596430re5.LJ(mixRankSkylightRequest, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchMixRankSkylightDataObservable$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (anonymousClass0955.LJIJI(obj, this) == objLJFF) {
            C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchMixRankSkylightDataObservable$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedSkylightCommonServiceImpl@9b1f.fetchMixRankSkylightDataObservable$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super MixRankSkylightResponse> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
