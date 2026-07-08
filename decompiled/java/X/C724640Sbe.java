package X;

import Y.ARunnableS111S0100000_11;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724640Sbe {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C691010R8p());

    public static final Handler LIZ() {
        return (Handler) LIZ.getValue();
    }

    public static final void LIZIZ(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C725080ScM.LIZ) {
                C786410Ut5.LJJZZIII(LIZ(), new ARunnableS111S0100000_11(th, 6));
                return;
            }
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null) {
                interfaceC723720SaA.LIZIZ("assem catch exception", new Exception(th));
            }
            throw th;
        }
    }
}
