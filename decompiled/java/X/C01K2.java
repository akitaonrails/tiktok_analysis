package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01K2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentRetentionHelper$showAfterPaymentBindRetainDialog$container$2$1", f = "PaymentRetentionHelper.kt", l = {840}, m = "invokeSuspend")
public final class C01K2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01K2(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01K2 c01k2 = new C01K2(interfaceC1364105Vn, this.LLILLL, this.LLILZ);
        c01k2.LLILLJJLI = obj;
        return c01k2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$2$1");
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
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILZ;
                this.LL = 1;
                if (function1.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$2$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
