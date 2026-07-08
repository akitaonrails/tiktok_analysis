package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1435640nSk {
    public InterfaceC1452170ntP LIZ = null;
    public final boolean LIZIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_publisher_cancelled_editor_crash", true, false);

    public final <T> T LIZ(Function1<? super InterfaceC1452170ntP, ? extends T> function1) {
        T tInvoke = null;
        if (this.LIZIZ) {
            synchronized (this) {
                try {
                    InterfaceC1452170ntP interfaceC1452170ntP = this.LIZ;
                    if (interfaceC1452170ntP != null) {
                        tInvoke = function1.invoke(interfaceC1452170ntP);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return tInvoke;
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZ;
        if (interfaceC1452170ntP2 == null) {
            return null;
        }
        return function1.invoke(interfaceC1452170ntP2);
    }
}
