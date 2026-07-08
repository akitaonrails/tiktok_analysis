package X;

/* JADX INFO: renamed from: X.0i5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.manager.PublicGroupStateManager", f = "PublicGroupStateManager.kt", l = {359}, m = "fetchEntranceCheckInner")
public final class C1229080i5a extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1229040i5W LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229080i5a(C1229040i5W c1229040i5W, InterfaceC1364105Vn<? super C1229080i5a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1229040i5W;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupStateManager@ce.fetchEntranceCheckInner$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(null, this);
        C1C7U.LIZIZ("PublicGroupStateManager@ce.fetchEntranceCheckInner$1");
        return objLJFF;
    }
}
