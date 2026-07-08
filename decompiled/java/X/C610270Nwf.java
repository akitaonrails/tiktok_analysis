package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.ies.im.core.client.MessageRequestModelImpl$refreshMessageRequestData$1", f = "MessageRequestModelImpl.kt", l = {}, m = "invokeSuspend")
public final class C610270Nwf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C872760YLq LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610270Nwf(C872760YLq c872760YLq, InterfaceC1364105Vn<? super C610270Nwf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c872760YLq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610270Nwf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestModelImpl@bb78.refreshMessageRequestData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ(0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestModelImpl@bb78.refreshMessageRequestData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
