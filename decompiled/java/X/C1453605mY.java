package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.05mY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453605mY extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1453605mY(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "splice", "splice(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        int size;
        List<? extends Object> list2 = list;
        this.receiver.getClass();
        if (list2.size() >= 2) {
            List listLIZIZ = C19719512Dh.LIZIZ(ListProtector.get(list2, 0));
            int iIntValue = ((Number) ListProtector.get(list2, 1)).intValue();
            if (list2.size() > 2) {
                size = ((Number) ListProtector.get(list2, 2)).intValue();
            } else {
                size = listLIZIZ.size() - iIntValue;
            }
            for (int i = 0; i < size; i++) {
                ListProtector.remove(listLIZIZ, iIntValue);
            }
            if (list2.size() > 3) {
                listLIZIZ.addAll(iIntValue, list2.subList(3, list2.size()));
            }
            return listLIZIZ;
        }
        throw new IllegalArgumentException("splice requires at least 2 arguments");
    }
}
