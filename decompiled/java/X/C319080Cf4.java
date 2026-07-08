package X;

import com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.enigma.paywall.PaywallViewModel$purchase$3$1", f = "PaywallViewModel.kt", l = {653}, m = "invokeSuspend")
public final class C319080Cf4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaywallViewModel LLILLJJLI;
    public final /* synthetic */ C338930DQl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319080Cf4(PaywallViewModel paywallViewModel, C338930DQl c338930DQl, InterfaceC1364105Vn<? super C319080Cf4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paywallViewModel;
        this.LLILLL = c338930DQl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319080Cf4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaywallViewModel@d9cd.purchase$3$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLJIJIL;
            C338930DQl c338930DQl = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(c338930DQl, this) == objLJFF) {
                C1C7U.LIZIZ("PaywallViewModel@d9cd.purchase$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallViewModel@d9cd.purchase$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
