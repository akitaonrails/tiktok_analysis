package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KNC, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.payment.v2.implement.pay.QueryOrderRepo", f = "QueryOrderRepo.kt", l = {122, 177}, m = "pollingCheckOrder")
public final class C0KNC extends AbstractC23140094w {
    public Object LL;
    public C0KJK LLILLJJLI;
    public Object LLILLL;
    public Function2 LLILZ;
    public C118300cf LLILZIL;
    public Object LLILZLL;
    public C118300cf LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C516190KMf LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KNC(C516190KMf c516190KMf, InterfaceC1364105Vn<? super C0KNC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c516190KMf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryOrderRepo@6ab2.pollingCheckOrder$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJI.LIZLLL(null, null, false, null, null, this);
        C1C7U.LIZIZ("QueryOrderRepo@6ab2.pollingCheckOrder$1");
        return objLIZLLL;
    }
}
