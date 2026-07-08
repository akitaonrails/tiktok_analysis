package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13Mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19998713Mr {
    public static final ConcurrentHashMap<String, Pair<C563400M7u, Object>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, String str2) {
        ConcurrentHashMap<String, Pair<C563400M7u, Object>> concurrentHashMap = LIZ;
        Pair<C563400M7u, Object> pair = concurrentHashMap.get(str);
        if (pair != null) {
            synchronized (pair.getSecond()) {
                try {
                    try {
                        pair.getSecond().notifyAll();
                        int iLIZIZ = pair.getFirst().LIZIZ();
                        if (pair.getFirst().LIZJ() == 0) {
                            C13SS c13ss = C13SS.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[End][");
                            sbLIZ.append(str2);
                            sbLIZ.append("][");
                            sbLIZ.append(str);
                            sbLIZ.append("][Clear]");
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c13ss.getClass();
                            C13SS.LIZ("LLL", strLIZIZ);
                            concurrentHashMap.remove(str);
                        } else {
                            C13SS c13ss2 = C13SS.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[End][");
                            sbLIZ2.append(str2);
                            sbLIZ2.append("][");
                            sbLIZ2.append(str);
                            sbLIZ2.append("][");
                            sbLIZ2.append(iLIZIZ);
                            sbLIZ2.append(']');
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                            c13ss2.getClass();
                            C13SS.LIZIZ("LLL", strLIZIZ2, null);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static void LIZIZ(String str, String str2) {
        synchronized (C19998713Mr.class) {
            try {
                ConcurrentHashMap<String, Pair<C563400M7u, Object>> concurrentHashMap = LIZ;
                if (concurrentHashMap.get(str) == null) {
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[Start][");
                    sbLIZ.append(str2);
                    sbLIZ.append("][");
                    sbLIZ.append(str);
                    sbLIZ.append("][Empty]");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c13ss.getClass();
                    C13SS.LIZ("LLL", strLIZIZ);
                    concurrentHashMap.put(str, new Pair<>(new C563400M7u(1), new Object()));
                    return;
                }
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("[Start][");
                sbLIZ2.append(str2);
                sbLIZ2.append("][");
                sbLIZ2.append(str);
                sbLIZ2.append("][Wait]");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LJ("LLL", strLIZIZ2);
                Pair<C563400M7u, Object> pair = concurrentHashMap.get(str);
                if (pair != null && pair.getSecond() != null) {
                    synchronized (pair.getSecond()) {
                        try {
                            try {
                                pair.getFirst().LIZLLL();
                                pair.getSecond().wait();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
