package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499780p8C {
    public static C1499790p8D LIZLLL;
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final ConcurrentHashMap<String, C1499830p8H> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static final AtomicInteger LJFF = new AtomicInteger(0);

    public static void LIZ(String str) {
        HashSet<String> hashSet = LIZ;
        synchronized (hashSet) {
            try {
                hashSet.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        ConcurrentHashMap<String, C1499830p8H> concurrentHashMap = LIZIZ;
        C1499830p8H c1499830p8H = concurrentHashMap.get(str);
        if (c1499830p8H != null) {
            ReentrantLock reentrantLock = c1499830p8H.LIZ;
            reentrantLock.lock();
            try {
                c1499830p8H.LIZIZ.signalAll();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                reentrantLock.unlock();
                throw th2;
            }
        }
        concurrentHashMap.remove(str);
    }

    public static void LIZIZ(String str, Map map) {
        C1499800p8E c1499800p8E;
        String str2;
        boolean zLJFF;
        C1499790p8D c1499790p8D = LIZLLL;
        if (c1499790p8D != null && str.length() != 0) {
            Set setKeySet = ((LinkedHashMap) c1499790p8D.LIZ.LJIIIIZZ()).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                String str3 = (String) obj;
                C603820NmG<String, C1499820p8G> c603820NmG = c1499790p8D.LIZ;
                str3.toString();
                C1499820p8G c1499820p8GLIZJ = c603820NmG.LIZJ(str3);
                if (c1499820p8GLIZJ != null && (c1499800p8E = c1499820p8GLIZJ.LIZ) != null && (str2 = c1499800p8E.LJJII) != null && str2.length() != 0) {
                    C0XLO c0xloLIZJ = C0XLO.LIZJ(str2);
                    if (map == null) {
                        zLJFF = Intrinsics.LJFF(C1499790p8D.LIZ(str), C1499790p8D.LIZ(c0xloLIZJ.LJFF.LIZ()));
                    } else {
                        zLJFF = true;
                        for (Map.Entry entry : map.entrySet()) {
                            String strLIZJ = c0xloLIZJ.LJI.LIZJ((String) entry.getKey());
                            if (strLIZJ == null) {
                                strLIZJ = "";
                            }
                            if (!Intrinsics.LJFF(strLIZJ, entry.getValue())) {
                                zLJFF = false;
                            }
                        }
                    }
                    if (zLJFF) {
                        arrayList.add(obj);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c1499790p8D.LIZ.LJ((String) it2.next());
            }
        }
    }
}
