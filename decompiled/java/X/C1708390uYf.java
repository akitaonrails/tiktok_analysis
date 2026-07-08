package X;

import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.common.bind.CashierBindPaymentMethodHelper$Companion$requestAuthPreRisk$1$1", f = "CashierBindPaymentMethodHelper.kt", l = {284, 293, 426}, m = "invokeSuspend")
public final class C1708390uYf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Function1 LL;
    public Object LLILLJJLI;
    public C19EG LLILLL;
    public Function1 LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1707990uY1 LLIZ;
    public final /* synthetic */ PaymentOption LLIZLLLIL;
    public final /* synthetic */ C1709570uaZ LLJ;
    public final /* synthetic */ List<POPayElement> LLJI;
    public final /* synthetic */ Function1<String, Unit> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C19EG LLJILJILJ;
    public final /* synthetic */ Function1<String, Unit> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1708390uYf(C1707990uY1 c1707990uY1, PaymentOption paymentOption, C1709570uaZ c1709570uaZ, List<POPayElement> list, Function1<? super String, Unit> function1, String str, C19EG c19eg, Function1<? super String, Unit> function12, InterfaceC1364105Vn<? super C1708390uYf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c1707990uY1;
        this.LLIZLLLIL = paymentOption;
        this.LLJ = c1709570uaZ;
        this.LLJI = list;
        this.LLJIJIL = function1;
        this.LLJILJIL = str;
        this.LLJILJILJ = c19eg;
        this.LLJILLL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1708390uYf c1708390uYf = new C1708390uYf(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c1708390uYf.LLILZLL = obj;
        return c1708390uYf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1708390uYf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
