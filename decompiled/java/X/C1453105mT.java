package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.05mT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453105mT extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1453105mT(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "contains", "contains(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        boolean zContains;
        List<? extends Object> list2 = list;
        this.receiver.getClass();
        if (list2.size() >= 2) {
            Object obj = ListProtector.get(list2, 1);
            Object obj2 = ListProtector.get(list2, 0);
            if (obj2 instanceof Map) {
                zContains = ((Map) obj2).containsKey(obj);
            } else if (obj2 instanceof Collection) {
                zContains = ((Collection) obj2).contains(obj);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("contains is not supported for ");
                sbLIZ.append(obj2);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return Boolean.valueOf(zContains);
        }
        throw new IllegalArgumentException("contains requires at least 2 arguments");
    }
}
