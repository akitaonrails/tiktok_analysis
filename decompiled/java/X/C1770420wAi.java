package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.videoguide.vm.EcSearchNoCartFeedVideoGuideVM$updateFrequency$1", f = "EcSearchNoCartFeedVideoGuideVM.kt", l = {158}, m = "invokeSuspend")
public final class C1770420wAi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EcSearchFeedVideoGuideFrequencyParams LLILLJJLI;
    public final /* synthetic */ EcSearchNoCartFeedVideoGuideVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770420wAi(EcSearchFeedVideoGuideFrequencyParams ecSearchFeedVideoGuideFrequencyParams, EcSearchNoCartFeedVideoGuideVM ecSearchNoCartFeedVideoGuideVM, InterfaceC1364105Vn<? super C1770420wAi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = ecSearchFeedVideoGuideFrequencyParams;
        this.LLILLL = ecSearchNoCartFeedVideoGuideVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1770420wAi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchNoCartFeedVideoGuideVM@181e.updateFrequency$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC1770480wAo interfaceC1770480wAo = (InterfaceC1770480wAo) this.LLILLL.LL.getValue().getOperator();
                EcSearchFeedVideoGuideFrequencyParams ecSearchFeedVideoGuideFrequencyParams = this.LLILLJJLI;
                this.LL = 1;
                if (interfaceC1770480wAo.LJLL(ecSearchFeedVideoGuideFrequencyParams, this) == objLJFF) {
                    C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideVM@181e.updateFrequency$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchNoCartFeedVideoGuideVM@181e.updateFrequency$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
