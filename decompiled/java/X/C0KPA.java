package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KPA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.impl.pay.FanQueryOrderRepo", f = "FanQueryOrderRepo.kt", l = {105, 162}, m = "pollingCheckOrder")
public final class C0KPA extends AbstractC23140094w {
    public Object LL;
    public C0KP3 LLILLJJLI;
    public Object LLILLL;
    public Function2 LLILZ;
    public C118300cf LLILZIL;
    public Object LLILZLL;
    public C118300cf LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C0KP7 LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KPA(C0KP7 c0kp7, InterfaceC1364105Vn<? super C0KPA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c0kp7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJI.LIZIZ(null, null, false, null, null, this);
        C1C7U.LIZIZ("FanQueryOrderRepo@67ce.pollingCheckOrder$1");
        return objLIZIZ;
    }
}
