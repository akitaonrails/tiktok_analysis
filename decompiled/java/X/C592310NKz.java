package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.popup.trigger.Trigger$AddCartTrigger$trigger$2$1$1", f = "Trigger.kt", l = {}, m = "invokeSuspend")
public final class C592310NKz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0NLD LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ C592290NKx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592310NKz(C0NLD c0nld, PdpViewModel pdpViewModel, C592290NKx c592290NKx, InterfaceC1364105Vn<? super C592310NKz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nld;
        this.LLILLL = pdpViewModel;
        this.LLILZ = c592290NKx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C592310NKz c592310NKz = new C592310NKz(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c592310NKz.LL = obj;
        return c592310NKz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Trigger$AddCartTrigger@9951.trigger$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZIZ((InterfaceC497601wk) this.LL, null, null, new C0NL0(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Trigger$AddCartTrigger@9951.trigger$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
