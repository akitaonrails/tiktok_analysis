package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Np1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605530Np1 {
    public final ConcurrentHashMap<String, C605540Np2> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(C605530Np1 c605530Np1, String str) {
        C605540Np2 c605540Np2PutIfAbsent;
        Unit unit = Unit.LIZ;
        ConcurrentHashMap<String, C605540Np2> concurrentHashMap = c605530Np1.LIZ;
        C605540Np2 c605540Np2 = concurrentHashMap.get(str);
        if (c605540Np2 == null && (c605540Np2PutIfAbsent = concurrentHashMap.putIfAbsent(str, (c605540Np2 = new C605540Np2()))) != null) {
            c605540Np2 = c605540Np2PutIfAbsent;
        }
        C605540Np2 c605540Np22 = c605540Np2;
        synchronized (c605540Np22) {
            try {
                c605540Np22.LIZJ = unit;
                c605540Np22.LIZIZ = true;
                c605540Np22.LIZ.LIZJ(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [SignalHub] emitted: ");
        sbLIZ.append(str);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }
}
