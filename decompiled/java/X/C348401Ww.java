package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.node.ExpressionNode$run$evalContext$1$7", f = "ExpressionNode.kt", l = {115}, m = "invokeSuspend")
public final class C348401Ww extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C348401Ww(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C348401Ww> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpressionNode@8dd8.run$evalContext$1$7");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List list = (List) this.LLILLJJLI;
            String str = (String) ListProtector.get(list, 0);
            C1309240kAs.LIZJ(str);
            long jLongValue = ((Number) ListProtector.get(list, 2)).longValue();
            Object obj2 = ListProtector.get(list, 1);
            if (obj2 != null) {
                C099G c099gLIZIZ = C23250099c.LIZIZ(this.LLILLL, null, null, new C348301Wv(str, obj2, jLongValue, null), 3);
                this.LL = 1;
                obj = c099gLIZIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$7");
                    return objLJFF;
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" input==null");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        }
        C1C7U.LIZIZ("ExpressionNode@8dd8.run$evalContext$1$7");
        return obj;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        C348401Ww c348401Ww = new C348401Ww(this.LLILLL, interfaceC1364105Vn);
        c348401Ww.LLILLJJLI = list;
        return c348401Ww.invokeSuspend(Unit.LIZ);
    }
}
