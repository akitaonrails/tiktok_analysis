package X;

/* JADX INFO: renamed from: X.0WGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820400WGg extends AbstractRunnableC820240WFq {
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Object LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C820210WFn LLJ;

    @Override // X.AbstractRunnableC820240WFq
    public final void LIZ() {
        InterfaceC820490WGp interfaceC820490WGp = this.LLJ.LJI;
        C0W3J.LJIIIIZZ(interfaceC820490WGp);
        interfaceC820490WGp.setUserProperty(this.LLILZIL, this.LLILZLL, new C0WH6(this.LLIZ), this.LLIZLLLIL, this.LL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820400WGg(C820210WFn c820210WFn, String str, String str2, Object obj, boolean z) {
        super(c820210WFn, true);
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = obj;
        this.LLIZLLLIL = z;
        this.LLJ = c820210WFn;
    }
}
