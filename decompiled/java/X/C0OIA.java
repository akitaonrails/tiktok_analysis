package X;

import Y.AgS200S0200000_9;

/* JADX INFO: renamed from: X.0OIA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.DCStateBinder$bind$$inlined$map$1$2", f = "DCStateBinder.kt", l = {223}, m = "emit")
public final class C0OIA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS200S0200000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIA(AgS200S0200000_9 agS200S0200000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS200S0200000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DCStateBinder@9534.bind$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("DCStateBinder@9534.bind$$inlined$map$1$2$1");
        return objEmit;
    }
}
