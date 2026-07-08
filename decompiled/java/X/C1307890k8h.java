package X;

/* JADX INFO: renamed from: X.0k8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.EventNode", f = "EventNode.kt", l = {167}, m = "onUnload")
public final class C1307890k8h extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1307840k8c LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307890k8h(C1307840k8c c1307840k8c, InterfaceC1364105Vn<? super C1307890k8h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1307840k8c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventNode@4846.onUnload$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("EventNode@4846.onUnload$1");
        return objLIZIZ;
    }
}
