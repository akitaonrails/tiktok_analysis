package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KND, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.payment.v2.implement.pay.QueryOrderRepo", f = "QueryOrderRepo.kt", l = {123, 193}, m = "pollingCheckOrder")
public final class C0KND extends AbstractC23140094w {
    public Object LL;
    public C0KFM LLILLJJLI;
    public Object LLILLL;
    public Function2 LLILZ;
    public C118300cf LLILZIL;
    public Object LLILZLL;
    public C118300cf LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C516180KMe LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KND(C516180KMe c516180KMe, InterfaceC1364105Vn<? super C0KND> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c516180KMe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QueryOrderRepo@a26c.pollingCheckOrder$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLJI.LIZLLL(null, null, false, null, null, this);
        C1C7U.LIZIZ("QueryOrderRepo@a26c.pollingCheckOrder$1");
        return objLIZLLL;
    }
}
