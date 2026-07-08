package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode", f = "ExpressionNode.kt", l = {121}, m = "run")
public final class C1307650k8J extends AbstractC23140094w {
    public Task LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1307570k8B LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307650k8J(C1307570k8B c1307570k8B, InterfaceC1364105Vn<? super C1307650k8J> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1307570k8B;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C1307420k7w {
        C1C7U.LIZ("ExpressionNode@8dd8.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("ExpressionNode@8dd8.run$1");
        return objLIZJ;
    }
}
