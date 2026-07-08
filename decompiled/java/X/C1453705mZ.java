package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.05mZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C1453705mZ extends C2217421BqW implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Long>, Object>, InterfaceC842703Qz {
    public C1453705mZ(C1453405mW c1453405mW) {
        super(3, c1453405mW, C1453405mW.class, "currentTimeMillis", "currentTimeMillis(Lcom/bytedance/android/starship/engine/quark/EvalContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        this.receiver.getClass();
        try {
            return C2286608xc.LJFF(System.currentTimeMillis());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("currentTimeMillis>>> error", e);
        }
    }
}
