package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NL4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.Trigger$AddressSelectTrigger$trigger$2$1$1", f = "Trigger.kt", l = {}, m = "invokeSuspend")
public final class C0NL4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0NLD LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ C592280NKw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NL4(C0NLD c0nld, PdpViewModel pdpViewModel, C592280NKw c592280NKw, InterfaceC1364105Vn<? super C0NL4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nld;
        this.LLILLL = pdpViewModel;
        this.LLILZ = c592280NKw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NL4 c0nl4 = new C0NL4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0nl4.LL = obj;
        return c0nl4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Trigger$AddressSelectTrigger@fcf7.trigger$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C0NL5(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Trigger$AddressSelectTrigger@fcf7.trigger$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
