package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Qi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo$doWorkPrivate$5$4$onNext$3$6$5", f = "BaseMixRefreshRepo.kt", l = {702}, m = "invokeSuspend")
public final class C677670Qi5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677670Qi5(MixPageViewModel mixPageViewModel, InterfaceC1364105Vn<? super C677670Qi5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677670Qi5(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6$5");
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
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6$5");
                    return objLJFF;
                }
            }
            C677830QiL c677830QiL = this.LLILLJJLI.getState().LL;
            C678010Qid c678010Qid = C678010Qid.LIZ;
            if (!Intrinsics.LJFF(c677830QiL, c678010Qid)) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(517);
                c2341109Fh.getClass();
                C2341109Fh.LIZIZ(aFwS196S0000000_10);
                this.LLILLJJLI.xQ2(c678010Qid);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            AFwS196S0000000_10 aFwS196S0000000_102 = AFwS196S0000000_10.get$arr$(518);
            c2341109Fh2.getClass();
            C2341109Fh.LIZIZ(aFwS196S0000000_102);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.doWorkPrivate$5$4$onNext$3$6$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
