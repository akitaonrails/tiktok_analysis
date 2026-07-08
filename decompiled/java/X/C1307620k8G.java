package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k8G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$injectDataCenterFunction$1", f = "ExpressionNode.kt", l = {}, m = "invokeSuspend")
public final class C1307620k8G extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1307790k8X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307620k8G(InterfaceC1307790k8X interfaceC1307790k8X, InterfaceC1364105Vn<? super C1307620k8G> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1307790k8X;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object data;
        C1C7U.LIZ("ExpressionNode@8dd8.injectDataCenterFunction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        C1307730k8R c1307730k8RLJJIIZI = this.LLILLJJLI.LJJIIZI();
        String strValueOf = String.valueOf(ListProtector.get(list, 0));
        String strValueOf2 = String.valueOf(ListProtector.get(list, 1));
        c1307730k8RLJJIIZI.LIZ.getClass();
        InterfaceC1307050k7L interfaceC1307050k7L = (InterfaceC1307050k7L) ((ConcurrentHashMap) C589410N9v.LIZ.getValue()).get(strValueOf);
        if (interfaceC1307050k7L != null) {
            data = interfaceC1307050k7L.getData(strValueOf2);
        } else {
            data = null;
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.injectDataCenterFunction$1");
        return data;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        C1307620k8G c1307620k8G = new C1307620k8G(this.LLILLJJLI, interfaceC1364105Vn);
        c1307620k8G.LL = list;
        return c1307620k8G.invokeSuspend(Unit.LIZ);
    }
}
