package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue$DefaultInterruptibleDelay$delayForDurationInMs$2$2", f = "DefaultSendMessageQueue.kt", l = {}, m = "invokeSuspend")
public final class C326801Oo extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public C326801Oo(InterfaceC1364105Vn<? super C326801Oo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326801Oo(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C326801Oo(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
