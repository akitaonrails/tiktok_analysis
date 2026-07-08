package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0jfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289580jfA extends AbstractC816260W0i {
    public static final C1289580jfA LIZ = new C1289580jfA();

    public static void LJFF() {
        LoadSoLancet.LIZJ("lynxservice");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("lynxservice");
        LoadSoLancet.LJ(jUptimeMillis, "lynxservice");
        LoadSoLancet.LIZLLL(jUptimeMillis, "lynxservice");
        LoadSoLancet.LIZIZ("lynxservice");
    }

    @Override // X.AbstractC816260W0i
    public final boolean doInitialize() {
        TraceEvent.LIZLLL("LynxServiceSoLoader.doInitialize");
        try {
            try {
                LJFF();
                TraceEvent.LJII("LynxServiceSoLoader.doInitialize");
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                TraceEvent.LJII("LynxServiceSoLoader.doInitialize");
                return false;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                TraceEvent.LJII("LynxServiceSoLoader.doInitialize");
                return false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            TraceEvent.LJII("LynxServiceSoLoader.doInitialize");
            throw th;
        }
    }
}
