package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$injectDataCenterFunction$5", f = "ExpressionNode.kt", l = {}, m = "invokeSuspend")
public final class C1307630k8H extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1307790k8X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307630k8H(InterfaceC1307790k8X interfaceC1307790k8X, InterfaceC1364105Vn<? super C1307630k8H> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1307790k8X;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpressionNode@8dd8.injectDataCenterFunction$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        C1307730k8R c1307730k8RLJJIIZI = this.LLILLJJLI.LJJIIZI();
        String strValueOf = String.valueOf(ListProtector.get(list, 0));
        Object obj2 = ListProtector.get(list, 1);
        C1307770k8V c1307770k8V = c1307730k8RLJJIIZI.LIZ;
        if (obj2 == null) {
            ((ConcurrentHashMap) c1307770k8V.LIZ.getValue()).remove(strValueOf);
        } else {
            ((ConcurrentHashMap) c1307770k8V.LIZ.getValue()).put(strValueOf, obj2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExpressionNode@8dd8.injectDataCenterFunction$5");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1307630k8H c1307630k8H = new C1307630k8H(this.LLILLJJLI, interfaceC1364105Vn);
        c1307630k8H.LL = list;
        return c1307630k8H.invokeSuspend(Unit.LIZ);
    }
}
