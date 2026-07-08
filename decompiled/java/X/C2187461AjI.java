package X;

import com.bytedance.common.jato.memory.NonMovingSpaceOpt;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1AjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187461AjI {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static InterfaceC2187601AjW LIZJ;

    public final void finalize() {
        InterfaceC2187601AjW interfaceC2187601AjW = LIZJ;
        if (interfaceC2187601AjW != null) {
            interfaceC2187601AjW.getClass();
            Runtime runtime = Runtime.getRuntime();
            if (runtime.totalMemory() - runtime.freeMemory() > runtime.maxMemory() * 0.85d) {
                NonMovingSpaceOpt.LIZ(LIZ, LIZIZ);
                return;
            }
        }
        new WeakReference(new C2187461AjI());
    }

    public C2187461AjI() {
    }

    public C2187461AjI(int i) {
    }
}
