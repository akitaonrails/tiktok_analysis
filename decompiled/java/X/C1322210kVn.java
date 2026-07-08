package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: renamed from: X.0kVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322210kVn {
    public static final Class<?> LIZ = C1322210kVn.class;
    public static InterfaceC1322220kVo LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZ(Context context) {
        if (LIZIZ != null) {
            LIZJ = true;
            return;
        }
        try {
            C2167708eR.LJ(context, 0, C2167708eR.LJIIJ);
            LIZJ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1328570kg3.LJIJ(LIZ, th, "Could not initialize SoLoader", new Object[0]);
        }
    }

    public static void LIZIZ(String str) {
        if (LIZJ) {
            try {
                InterfaceC1322220kVo interfaceC1322220kVo = LIZIZ;
                if (interfaceC1322220kVo != null) {
                    interfaceC1322220kVo.loadLibrary(str);
                    return;
                } else {
                    C2167708eR.LJIIIIZZ(str);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1328570kg3.LJIJ(LIZ, th, "loadLibrary fail", new Object[0]);
            }
        }
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }
}
