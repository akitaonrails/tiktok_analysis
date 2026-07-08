package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.08Ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2074008Ao {
    public static volatile boolean LIZ;

    public static boolean LIZ() {
        if (LIZ) {
            return true;
        }
        synchronized (C2074008Ao.class) {
            try {
                if (LIZ) {
                    return true;
                }
                try {
                    LoadSoLancet.LIZJ("EffectEditorABTestJni");
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF("EffectEditorABTestJni");
                    LoadSoLancet.LJ(jUptimeMillis, "EffectEditorABTestJni");
                    LoadSoLancet.LIZLLL(jUptimeMillis, "EffectEditorABTestJni");
                    LoadSoLancet.LIZIZ("EffectEditorABTestJni");
                    LIZ = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Native code library failed to load.\n");
                    sbLIZ.append(th);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    LIZ = false;
                }
                return LIZ;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
