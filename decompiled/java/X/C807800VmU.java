package X;

/* JADX INFO: renamed from: X.0VmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.componentmanager.outreach.repository.adapter.RuleHitDbAdapter", f = "RuleHitDbAdapter.kt", l = {27}, m = "queryInitial")
public final class C807800VmU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C807790VmT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C807800VmU(C807790VmT c807790VmT, InterfaceC1364105Vn<? super C807800VmU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c807790VmT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RuleHitDbAdapter@13a9.queryInitial$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("RuleHitDbAdapter@13a9.queryInitial$1");
        return objLIZLLL;
    }
}
