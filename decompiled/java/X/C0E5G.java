package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0E5G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E5G {
    public static final C357870E1h LIZ;
    public static final C0E5H LIZIZ;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZ = new C357870E1h(concurrentHashMap);
        LIZIZ = new C0E5H(concurrentHashMap);
    }

    public static Object LIZ(EnumC357850E1f enumC357850E1f) {
        C0E5H c0e5h = LIZIZ;
        if (c0e5h.LIZ.containsKey(enumC357850E1f.name())) {
            try {
                return c0e5h.LIZ.get(enumC357850E1f.name());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get::key=");
                sbLIZ.append(enumC357850E1f);
                sbLIZ.append(", error cause = ");
                sbLIZ.append(e.getMessage());
                C355090Dw3.LIZLLL("KVReaderImpl", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        return null;
    }

    public static Object LIZIZ(EnumC357850E1f enumC357850E1f, Object obj) {
        C0E5H c0e5h = LIZIZ;
        if (c0e5h.LIZ.containsKey(enumC357850E1f.name())) {
            try {
                obj = c0e5h.LIZ.get(enumC357850E1f.name());
                return obj;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("get::key=");
                sbLIZ.append(enumC357850E1f);
                sbLIZ.append(", error cause = ");
                sbLIZ.append(e.getMessage());
                C355090Dw3.LIZLLL("KVReaderImpl", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return obj;
    }

    public static void LIZJ(EnumC357850E1f enumC357850E1f, Object obj) {
        LIZ.LIZ(enumC357850E1f, obj);
    }

    public static void LIZLLL(EnumC357850E1f enumC357850E1f, boolean z) {
        LIZ.LIZ(enumC357850E1f, Boolean.valueOf(z));
    }
}
