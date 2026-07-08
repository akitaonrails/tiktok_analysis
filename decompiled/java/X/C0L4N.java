package X;

/* JADX INFO: renamed from: X.0L4N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl", f = "AutoCutAnchorMediaProcessImpl.kt", l = {630}, m = "waitMockTaskFinished")
public final class C0L4N extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0L4P LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4N(C0L4P c0l4p, InterfaceC1364105Vn<? super C0L4N> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0l4p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, null, null, this);
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$1");
        return objLJI;
    }
}
