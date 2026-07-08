package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$injectDataCenterFunction$4", f = "ExpressionNode.kt", l = {}, m = "invokeSuspend")
public final class C1307600k8E extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1307790k8X LLILLJJLI;
    public final /* synthetic */ C1307570k8B LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307600k8E(InterfaceC1307790k8X interfaceC1307790k8X, C1307570k8B c1307570k8B, InterfaceC1364105Vn<? super C1307600k8E> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1307790k8X;
        this.LLILLL = c1307570k8B;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("ExpressionNode@8dd8.injectDataCenterFunction$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        C1307730k8R c1307730k8RLJJIIZI = this.LLILLJJLI.LJJIIZI();
        long j = this.LLILLL.LIZ;
        String strValueOf = String.valueOf(ListProtector.get(list, 0));
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) c1307730k8RLJJIIZI.LIZJ.LIZ.getValue()).get(Long.valueOf(j));
        if (concurrentHashMap != null) {
            obj2 = concurrentHashMap.get(strValueOf);
        } else {
            obj2 = null;
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.injectDataCenterFunction$4");
        return obj2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        C1307600k8E c1307600k8E = new C1307600k8E(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1307600k8E.LL = list;
        return c1307600k8E.invokeSuspend(Unit.LIZ);
    }
}
