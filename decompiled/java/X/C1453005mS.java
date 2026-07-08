package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.List;

/* JADX INFO: renamed from: X.05mS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453005mS extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1453005mS(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "int", "int(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        int iIntValue;
        this.receiver.getClass();
        Object obj = ListProtector.get(list, 0);
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else if (obj instanceof String) {
            iIntValue = CastIntegerProtector.parseInt((String) obj);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("int is not supported for ");
            sbLIZ.append(obj);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C2286608xc.LJ(iIntValue);
    }
}
