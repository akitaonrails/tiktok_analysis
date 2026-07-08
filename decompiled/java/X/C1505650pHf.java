package X;

import android.os.Trace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505650pHf {
    public static final C1505650pHf LIZ = new C1505650pHf();
    public static final ConcurrentHashMap<String, C1507770pL5> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Function1<C1507770pL5, Boolean>> LIZJ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArrayList<Function2<String, C1507770pL5, Boolean>> LIZLLL = new CopyOnWriteArrayList<>();

    public static void LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Object obj : LIZIZ.keySet()) {
            ConcurrentHashMap<String, C1507770pL5> concurrentHashMap = LIZIZ;
            C1507770pL5 c1507770pL5 = concurrentHashMap.get(obj);
            if (c1507770pL5 != null && jCurrentTimeMillis - c1507770pL5.LIZIZ > 60000) {
                concurrentHashMap.remove(obj);
            }
        }
    }

    public static void LIZIZ(String str, C1507770pL5 c1507770pL5) {
        Boolean boolInvoke;
        Function1<C1507770pL5, Boolean> function1 = LIZJ.get(str);
        if (function1 != null) {
            boolInvoke = function1.invoke(c1507770pL5);
        } else {
            boolInvoke = null;
        }
        boolean zLJFF = Intrinsics.LJFF(boolInvoke, Boolean.FALSE);
        boolean zLJFF2 = Intrinsics.LJFF(boolInvoke, Boolean.TRUE);
        Iterator<Function2<String, C1507770pL5, Boolean>> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            if (!it2.next().invoke(str, c1507770pL5).booleanValue() && !zLJFF2) {
                zLJFF2 = false;
            } else {
                zLJFF2 = true;
            }
            zLJFF = true;
        }
        if (zLJFF && !zLJFF2) {
            LIZIZ.remove(str);
        }
    }

    public static void LIZJ(String str, C1507770pL5 c1507770pL5) {
        String str2 = c1507770pL5.LIZ;
        if (str2 != null && str2.length() != 0) {
            Trace.beginSection(str2);
            try {
                LIZ();
                LIZIZ.put(str, c1507770pL5);
                LIZIZ(str, c1507770pL5);
                Trace.endSection();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Trace.endSection();
                throw th;
            }
        }
        LIZ();
        LIZIZ.put(str, c1507770pL5);
        LIZIZ(str, c1507770pL5);
    }
}
