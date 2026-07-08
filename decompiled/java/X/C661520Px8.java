package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Px8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661520Px8 {
    public static final Map<Integer, String> LIZ = new LinkedHashMap();
    public static String LIZIZ = "";
    public static final Set<C0N0Y> LIZJ = new LinkedHashSet();

    public static void LIZIZ() {
        try {
            for (C0N0Y c0n0y : LIZJ) {
                c0n0y.release();
                C650700Pfg.LIZ(c0n0y);
            }
            Set<C0N0Y> set = LIZJ;
            set.clear();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clear done, current players： ");
            sbLIZ.append(set);
            C189200o6.m2constructorimpl(Integer.valueOf(Log.d("SearchSinglePlayerManager", C2188811AlT.LIZIZ(sbLIZ))));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZ(C0N0Y c0n0y) {
        if (c0n0y != null) {
            Set<C0N0Y> set = LIZJ;
            set.add(c0n0y);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("added player ");
            sbLIZ.append(c0n0y);
            sbLIZ.append(" done, current generated players：");
            sbLIZ.append(set);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void LIZJ(C0N0Y c0n0y) {
        try {
            Set<C0N0Y> set = LIZJ;
            if (set.size() > 1) {
                Iterator<C0N0Y> it2 = set.iterator();
                while (it2.hasNext()) {
                    C0N0Y next = it2.next();
                    if (!Intrinsics.LJFF(next, c0n0y)) {
                        next.release();
                        C650700Pfg.LIZ(next);
                        it2.remove();
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("released player done, current generated players：");
                sbLIZ.append(LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZLLL(C0N0Y c0n0y) {
        if (c0n0y != null) {
            Set<C0N0Y> set = LIZJ;
            set.remove(c0n0y);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove player ");
            sbLIZ.append(c0n0y);
            sbLIZ.append(" done, current generated players：");
            sbLIZ.append(set);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
