package X;

import com.bytedance.android.starship.engine.graph.foundation.Packet;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$run$evalContext$1$5", f = "ExpressionNode.kt", l = {}, m = "invokeSuspend")
public final class C1307260k7g extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Task LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307260k7g(Task task, InterfaceC1364105Vn<? super C1307260k7g> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = task;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("ExpressionNode@8dd8.run$evalContext$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Packet packet = this.LLILLJJLI.LLILZIL.upstream.get(C2286608xc.LJFF(CastLongProtector.parseLong((String) ListProtector.get((List) this.LL, 0))));
        if (packet != null) {
            obj2 = packet.data;
        } else {
            obj2 = null;
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$5");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        C1307260k7g c1307260k7g = new C1307260k7g(this.LLILLJJLI, interfaceC1364105Vn);
        c1307260k7g.LL = list;
        return c1307260k7g.invokeSuspend(Unit.LIZ);
    }
}
