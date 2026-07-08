package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.138L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C138L {
    public static final InterfaceC1456340o08<C138K> LIZ;

    static {
        InterfaceC1456340o08<C138K> interfaceC1456340o08;
        try {
            new C133N();
            interfaceC1456340o08 = new InterfaceC1456340o08<C138K>() { // from class: X.138M
                @Override // X.InterfaceC1456340o08
                public final C138K get() {
                    return new C133N();
                }
            };
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC1456340o08 = new InterfaceC1456340o08<C138K>() { // from class: X.138N
                @Override // X.InterfaceC1456340o08
                public final C138K get() {
                    return new C138O(0);
                }
            };
        }
        LIZ = interfaceC1456340o08;
    }

    public static C138K LIZ() {
        return LIZ.get();
    }
}
