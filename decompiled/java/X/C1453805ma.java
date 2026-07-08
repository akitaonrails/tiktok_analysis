package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.05ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453805ma extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1453805ma(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "append", "append(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        List<? extends Object> list2 = list;
        this.receiver.getClass();
        if (list2.size() >= 2) {
            List listLIZIZ = C19719512Dh.LIZIZ(ListProtector.get(list2, 0));
            listLIZIZ.addAll(list2.subList(1, list2.size()));
            return listLIZIZ;
        }
        throw new IllegalArgumentException("append requires at least 2 arguments");
    }
}
