package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ecp.handlers.EcReadyHandler$EcReadyOnSubscribe$subscribe$1$1", f = "EcReadyHandler.kt", l = {}, m = "invokeSuspend")
public final class C335800DEk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C335810DEl LL;
    public final /* synthetic */ AbstractC335880DEs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335800DEk(C335810DEl c335810DEl, AbstractC335880DEs abstractC335880DEs, InterfaceC1364105Vn<? super C335800DEk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c335810DEl;
        this.LLILLJJLI = abstractC335880DEs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335800DEk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At;
        C1C7U.LIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At2 = this.LL.LLILZ;
        if ((interfaceC2329309At2 == null || !interfaceC2329309At2.isDisposed()) && (interfaceC2329309At = this.LL.LLILZ) != null) {
            interfaceC2329309At.onSuccess(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcReadyHandler$EcReadyOnSubscribe@c425.subscribe$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
