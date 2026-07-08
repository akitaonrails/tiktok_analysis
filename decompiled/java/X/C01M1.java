package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01M1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$payResultProcess$handleFailed$callbackInvoked$1$1", f = "PaymentResultProcess.kt", l = {}, m = "invokeSuspend")
public final class C01M1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01M1(InterfaceC1364105Vn interfaceC1364105Vn, Function0 function0, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01M1(interfaceC1364105Vn, this.LL, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$callbackInvoked$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke();
        Function1<Boolean, Unit> function1 = this.LLILLJJLI;
        if (function1 != null) {
            function1.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$handleFailed$callbackInvoked$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
