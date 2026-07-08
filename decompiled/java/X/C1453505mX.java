package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.05mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453505mX extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Object>, Object>, InterfaceC842703Qz {
    public C1453505mX(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "jsonDecode", "jsonDecode(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        this.receiver.getClass();
        String string = a0.LJLIIIL((String) ListProtector.get(list, 0)).toString();
        if (u.LJJIIJZLJL(string, e3.e, false)) {
            return GsonProtectorUtils.fromJson(C1453405mW.LIZIZ, string, List.class);
        }
        return GsonProtectorUtils.fromJson(C1453405mW.LIZIZ, string, Map.class);
    }
}
