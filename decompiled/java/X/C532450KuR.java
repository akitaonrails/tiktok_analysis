package X;

/* JADX INFO: renamed from: X.0KuR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.framework.GraphNode", f = "FlowGraph.kt", l = {56, 57, 59}, m = "produce")
public final class C532450KuR extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC532530KuZ LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C532440KuQ<Object, Object, Object> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532450KuR(C532440KuQ<Object, Object, Object> c532440KuQ, InterfaceC1364105Vn<? super C532450KuR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c532440KuQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GraphNode@7b1c.produce$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("GraphNode@7b1c.produce$1");
        return objLIZJ;
    }
}
