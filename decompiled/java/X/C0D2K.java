package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0D2K, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue$DefaultInterruptibleDelay", f = "DefaultSendMessageQueue.kt", l = {354, 237}, m = "delayForDurationInMs")
public final class C0D2K extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D2L<Object> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2K(C0D2L<Object> c0d2l, InterfaceC1364105Vn<? super C0D2K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d2l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, null, this);
        C1C7U.LIZIZ("DefaultSendMessageQueue$DefaultInterruptibleDelay@f3ea.delayForDurationInMs$1");
        return objLIZ;
    }
}
