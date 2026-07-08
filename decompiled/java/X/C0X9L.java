package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0X9L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X9L {
    public static final Map<String, C0X9M> LIZ = new LinkedHashMap();

    public static C0X9M LIZ(String str) {
        C0X9M c0x9m;
        Map<String, C0X9M> map = LIZ;
        synchronized (map) {
            try {
                c0x9m = (C0X9M) ((LinkedHashMap) map).get(str);
                if (c0x9m == null) {
                    c0x9m = new C0X9M();
                    map.put(str, c0x9m);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0x9m;
    }

    public static boolean LIZIZ(String str) throws InterruptedException {
        boolean z;
        C0X9M c0x9mLIZ = LIZ(str);
        int i = 0;
        while (true) {
            if (i < 50) {
                c0x9mLIZ.LIZJ.lock();
                if (c0x9mLIZ.LIZIZ) {
                    c0x9mLIZ.LIZJ.unlock();
                    i += 10;
                    Thread.sleep(10L);
                } else {
                    c0x9mLIZ.LIZ++;
                    c0x9mLIZ.LIZJ.unlock();
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("read lock,timeout:");
        sbLIZ.append(z);
        sbLIZ.append(",channel:");
        sbLIZ.append(str);
        sbLIZ.append(",thread:");
        sbLIZ.append(C786410Ut5.u3());
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }

    public static boolean LIZJ(String str) {
        boolean z;
        C0X9M c0x9mLIZ = LIZ(str);
        try {
            c0x9mLIZ.LIZJ.lock();
            if (c0x9mLIZ.LIZIZ) {
                c0x9mLIZ.LIZJ.unlock();
                z = false;
            } else {
                c0x9mLIZ.LIZ++;
                c0x9mLIZ.LIZJ.unlock();
                z = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("read try lock,result:");
            sbLIZ.append(z);
            sbLIZ.append(",channel:");
            sbLIZ.append(str);
            sbLIZ.append(",thread:");
            sbLIZ.append(C786410Ut5.u3());
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x9mLIZ.LIZJ.unlock();
            throw th;
        }
    }

    public static void LIZLLL(String str) {
        C0X9M c0x9mLIZ = LIZ(str);
        try {
            c0x9mLIZ.LIZJ.lock();
            if (c0x9mLIZ.LIZ != 0) {
                c0x9mLIZ.LIZ--;
            }
            c0x9mLIZ.LIZJ.unlock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("read unlock,channel:");
            sbLIZ.append(str);
            sbLIZ.append(",thread:");
            sbLIZ.append(C786410Ut5.u3());
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x9mLIZ.LIZJ.unlock();
            throw th;
        }
    }

    public static boolean LJ(String str) {
        boolean z;
        C0X9M c0x9mLIZ = LIZ(str);
        try {
            c0x9mLIZ.LIZJ.lock();
            if (c0x9mLIZ.LIZ <= 0 && !c0x9mLIZ.LIZIZ) {
                c0x9mLIZ.LIZIZ = true;
                c0x9mLIZ.LIZJ.unlock();
                z = true;
            } else {
                c0x9mLIZ.LIZJ.unlock();
                z = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("write try lock,result:");
            sbLIZ.append(z);
            sbLIZ.append(",channel:");
            sbLIZ.append(str);
            sbLIZ.append(",thread:");
            sbLIZ.append(C786410Ut5.u3());
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x9mLIZ.LIZJ.unlock();
            throw th;
        }
    }

    public static void LJFF(String str) {
        C0X9M c0x9mLIZ = LIZ(str);
        try {
            c0x9mLIZ.LIZJ.lock();
            c0x9mLIZ.LIZIZ = false;
            c0x9mLIZ.LIZJ.unlock();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("write unlock,channel:");
            sbLIZ.append(str);
            sbLIZ.append(",thread:");
            sbLIZ.append(C786410Ut5.u3());
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0x9mLIZ.LIZJ.unlock();
            throw th;
        }
    }
}
