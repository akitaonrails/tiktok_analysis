package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ecp.handlers.EcPaymentCredentialRequestHandler$BuildCredentialOnSubscribe$invoke$1$1", f = "EcPaymentCredentialRequestHandler.kt", l = {}, m = "invokeSuspend")
public final class C335730DEd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C335720DEc LL;
    public final /* synthetic */ AbstractC335880DEs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C335730DEd(C335720DEc c335720DEc, AbstractC335880DEs abstractC335880DEs, InterfaceC1364105Vn<? super C335730DEd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c335720DEc;
        this.LLILLJJLI = abstractC335880DEs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C335730DEd(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPaymentCredentialRequestHandler$BuildCredentialOnSubscribe@4c4f.invoke$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC2329309At<AbstractC335880DEs> interfaceC2329309At = this.LL.LLILZIL;
        if (interfaceC2329309At == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcPaymentCredentialRequestHandler$BuildCredentialOnSubscribe@4c4f.invoke$1$1");
            return unit;
        }
        if (interfaceC2329309At.isDisposed()) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EcPaymentCredentialRequestHandler$BuildCredentialOnSubscribe@4c4f.invoke$1$1");
            return unit2;
        }
        interfaceC2329309At.onSuccess(this.LLILLJJLI);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EcPaymentCredentialRequestHandler$BuildCredentialOnSubscribe@4c4f.invoke$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
