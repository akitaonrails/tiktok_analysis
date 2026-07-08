package X;

import Y.AgS200S0200000_9;

/* JADX INFO: renamed from: X.0OIF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.ConditionFlow$asFilteredFlow$$inlined$mapNotNull$1$2", f = "DataGate.kt", l = {225}, m = "emit")
public final class C0OIF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS200S0200000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OIF(AgS200S0200000_9 agS200S0200000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS200S0200000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConditionFlow@e41.asFilteredFlow$$inlined$mapNotNull$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("ConditionFlow@e41.asFilteredFlow$$inlined$mapNotNull$1$2$1");
        return objEmit;
    }
}
