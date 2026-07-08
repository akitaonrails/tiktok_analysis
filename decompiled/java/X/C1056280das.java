package X;

/* JADX INFO: renamed from: X.0das, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.perf.FFPLoadBehavior", f = "FFPLoadBehavior.kt", l = {105}, m = "measureCost")
public final class C1056280das<T> extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1056250dap LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056280das(C1056250dap c1056250dap, InterfaceC1364105Vn<? super C1056280das> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1056250dap;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FFPLoadBehavior@faad.measureCost$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this, null);
        C1C7U.LIZIZ("FFPLoadBehavior@faad.measureCost$1");
        return objLIZLLL;
    }
}
