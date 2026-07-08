package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.042h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.eventcenter.PdpEventCenter$publishEvent$1", f = "PdpEventCenter.kt", l = {155}, m = "invokeSuspend")
public final class C10333042h extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C599190Nen LLILLJJLI;
    public final /* synthetic */ InterfaceC599270Nev LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10333042h(C599190Nen c599190Nen, InterfaceC599270Nev interfaceC599270Nev, InterfaceC1364105Vn<? super C10333042h> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c599190Nen;
        this.LLILLL = interfaceC599270Nev;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C10333042h(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpEventCenter@c50e.publishEvent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LJFF;
            InterfaceC599270Nev interfaceC599270Nev = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(interfaceC599270Nev, this) == objLJFF) {
                C1C7U.LIZIZ("PdpEventCenter@c50e.publishEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpEventCenter@c50e.publishEvent$1");
        return unit;
    }
}
