package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D02, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository$enrichRecommendationItem$2", f = "RecommendRepository.kt", l = {251}, m = "invokeSuspend")
public final class C0D02 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D0E LLILLL;
    public final /* synthetic */ UcpRecommendationItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D02(C0D0E c0d0e, UcpRecommendationItem ucpRecommendationItem, InterfaceC1364105Vn<? super C0D02> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0d0e;
        this.LLILZ = ucpRecommendationItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0D02 c0d02 = new C0D02(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0d02.LLILLJJLI = obj;
        return c0d02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("RecommendRepository@cb16.enrichRecommendationItem$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C0D0E c0d0e = this.LLILLL;
                UcpRecommendationItem ucpRecommendationItem = this.LLILZ;
                this.LL = 1;
                c0d0e.getClass();
                if (ucpRecommendationItem.getProtocolType() == 1) {
                    obj = c0d0e.LIZJ(ucpRecommendationItem, this);
                } else if (C0D1H.LIZ(C2286608xc.LJ(ucpRecommendationItem.getProtocolType()))) {
                    obj = c0d0e.LJ(ucpRecommendationItem, this);
                } else {
                    obj = c0d0e.LJFF(ucpRecommendationItem, this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("RecommendRepository@cb16.enrichRecommendationItem$2");
                    return objLJFF;
                }
            }
            c098200Yq = (UcpRecommendationItem) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("RecommendRepository@cb16.enrichRecommendationItem$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends UcpRecommendationItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
