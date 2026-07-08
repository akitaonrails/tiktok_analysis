package X;

/* JADX INFO: renamed from: X.1D7V, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legacy.source.MAFSource", f = "MAFSource.kt", l = {31}, m = "refresh")
public final class C1D7V extends AbstractC23140094w {
    public C1D7W LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1D7W LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1D7V(C1D7W c1d7w, InterfaceC1364105Vn<? super C1D7V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1d7w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MAFSource@95dd.refresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objMt = this.LLILLL.Mt(this);
        C1C7U.LIZIZ("MAFSource@95dd.refresh$1");
        return objMt;
    }
}
