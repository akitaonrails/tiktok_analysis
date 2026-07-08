package X;

import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0VQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797690VQx {
    public static boolean LIZLLL;
    public static final C797690VQx LIZ = new C797690VQx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C797660VQu());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C797680VQw());
    public static long LJ = System.currentTimeMillis();

    public final synchronized void LIZIZ() {
        if (LIZLLL) {
            return;
        }
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2211108lR(null), 3);
            return;
        }
        LIZLLL = true;
        System.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C0VNS> listLJIIIZ = C1593830rZt.LIZIZ.LJIIIZ(Long.valueOf(C278280AvS.LIZ()));
        if (!listLJIIIZ.isEmpty()) {
            for (C0VNS c0vns : listLJIIIZ) {
                LIZ().put(c0vns.LIZ, c0vns);
                linkedHashSet.add(Integer.valueOf(c0vns.LIZJ));
            }
            C797710VQz c797710VQz = new C797710VQz(true, true, linkedHashSet);
            Iterator it2 = ((ConcurrentLinkedQueue) LIZJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(c797710VQz);
            }
        }
    }

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZIZ.getValue();
    }

    public static void LIZJ(List list) {
        C0VNS c0vns;
        if (list.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            C0VNS c0vns2 = (C0VNS) it2.next();
            String str = c0vns2.LIZ;
            if (LIZ().get(str) == null || (c0vns = (C0VNS) LIZ().get(str)) == null || c0vns.LIZJ != c0vns2.LIZJ) {
                z = true;
            }
            linkedHashSet.add(Integer.valueOf(c0vns2.LIZJ));
            LIZ().put(str, c0vns2);
        }
        if (z) {
            C797710VQz c797710VQz = new C797710VQz(true, false, linkedHashSet);
            Iterator it3 = ((ConcurrentLinkedQueue) LIZJ.getValue()).iterator();
            while (it3.hasNext()) {
                ((Function1) it3.next()).invoke(c797710VQz);
            }
        }
        long jLIZ = C278280AvS.LIZ();
        if (LJ <= jLIZ) {
            Iterator it4 = LIZ().entrySet().iterator();
            while (it4.hasNext()) {
                if (((C0VNS) ((Map.Entry) it4.next()).getValue()).LIZIZ <= jLIZ) {
                    it4.remove();
                }
            }
            LJ = System.currentTimeMillis();
        }
    }
}
