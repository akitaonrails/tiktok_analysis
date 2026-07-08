package X;

import com.bytedance.android.starship.engine.graph.foundation.Packet;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$run$evalContext$1$6", f = "ExpressionNode.kt", l = {}, m = "invokeSuspend")
public final class C1307270k7h extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ Task LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307270k7h(Task task, InterfaceC1364105Vn<? super C1307270k7h> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = task;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("ExpressionNode@8dd8.run$evalContext$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Packet packet = this.LL.LLILZIL.manual;
        if (packet != null) {
            obj2 = packet.data;
        } else {
            obj2 = null;
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$6");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return new C1307270k7h(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
