package X;

/* JADX INFO: renamed from: X.0WGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820410WGh extends AbstractRunnableC820240WFq {
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C820210WFn LLIZ;

    @Override // X.AbstractRunnableC820240WFq
    public final void LIZ() {
        InterfaceC820490WGp interfaceC820490WGp = this.LLIZ.LJI;
        C0W3J.LJIIIIZZ(interfaceC820490WGp);
        interfaceC820490WGp.logHealthData(5, this.LLILZIL, new C0WH6(this.LLILZLL), new C0WH6(null), new C0WH6(null));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820410WGh(C820210WFn c820210WFn, String str, Object obj) {
        super(c820210WFn, false);
        this.LLILZIL = str;
        this.LLILZLL = obj;
        this.LLIZ = c820210WFn;
    }
}
