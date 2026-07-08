package X;

import com.bytedance.android.starship.engine.graph.foundation.Packet;
import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.EventNode", f = "EventNode.kt", l = {179, 195}, m = "run")
public final class C1307870k8f extends AbstractC23140094w {
    public InterfaceC1307790k8X LL;
    public Task LLILLJJLI;
    public Object LLILLL;
    public Packet LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1307840k8c LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307870k8f(C1307840k8c c1307840k8c, InterfaceC1364105Vn<? super C1307870k8f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1307840k8c;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventNode@4846.run$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(null, null, this);
        C1C7U.LIZIZ("EventNode@4846.run$1");
        return objLIZJ;
    }
}
