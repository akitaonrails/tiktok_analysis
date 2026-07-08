package X;

/* JADX INFO: renamed from: X.0k8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.EventNode", f = "EventNode.kt", l = {117}, m = "onLoad")
public final class C1307880k8g extends AbstractC23140094w {
    public InterfaceC860440XpC LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1307840k8c LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307880k8g(C1307840k8c c1307840k8c, InterfaceC1364105Vn<? super C1307880k8g> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1307840k8c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventNode@4846.onLoad$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("EventNode@4846.onLoad$1");
        return objLIZ;
    }
}
