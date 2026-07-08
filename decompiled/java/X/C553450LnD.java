package X;

/* JADX INFO: renamed from: X.0LnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.graph.nodes.minimal.MinimalAPIWrapper", f = "MinimalAPIWrapper.kt", l = {111, 112}, m = "observeMinimalWorkflow")
public final class C553450LnD extends AbstractC23140094w {
    public Object LL;
    public InterfaceC553480LnG LLILLJJLI;
    public InterfaceC553290Lmx LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C553420LnA LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C553450LnD(C553420LnA c553420LnA, InterfaceC1364105Vn<? super C553450LnD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c553420LnA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinimalAPIWrapper@9e78.observeMinimalWorkflow$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("MinimalAPIWrapper@9e78.observeMinimalWorkflow$1");
        return objLIZ;
    }
}
