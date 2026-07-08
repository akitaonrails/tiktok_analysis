package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue$DefaultInterruptibleDelay$delayForDurationInMs$2$1", f = "DefaultSendMessageQueue.kt", l = {}, m = "invokeSuspend")
public final class C326901Op extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public C326901Op(InterfaceC1364105Vn<? super C326901Op> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326901Op(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C326901Op(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$2$1");
        return unit;
    }
}
