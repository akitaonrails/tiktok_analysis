package X;

import android.net.Uri;
import com.bytedance.forest.experiments.ForestExperiment;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S1410000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534130q1b {
    public static final ConcurrentHashMap<String, WeakReference<C1534320q1u<C1534110q1Z>>> LIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r2 = X.C1534880q2o.LIZ.getStringJustDisk(r13, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r7 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, new java.lang.String[]{","}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r7 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        r6 = r7.size() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if ((-1) >= r6) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        r12 = (java.lang.String) r7.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        X.C1534020q1Q.LIZ(r13, r12, r8).LIZIZ(r5);
        r0 = kotlin.Unit.LIZ;
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r0 = new X.C098200Yq(r1);
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012f, code lost:
    
        r2 = X.C086F.LIZ;
        r1 = new Y.ARunnableS28S1100000_23(r5, r13, 31);
        r2.getClass();
        X.C086F.LIZLLL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
    
        r5.LJ = new X.C1534730q2Z(r5, r13);
        X.C1534250q1n.LIZ.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1534320q1u LIZ(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1534130q1b.LIZ(java.lang.String):X.0q1u");
    }

    public static void LIZIZ(Uri uri, String str, Set set, Function1 function1, boolean z) {
        C1534250q1n.LIZ.LJIIL("ResponseCacheManager", "traverseAndFetchCacheIf");
        if (ForestExperiment.INSTANCE.getOptimizeCacheStructure()) {
            if ((!C1534880q2o.LIZ.contains(str) || !LIZJ(uri, str, set, function1, z)) && a0.LJJIIZI(str, "?", false)) {
                LIZJ(uri, a0.LJJZ(str, "?", str), set, function1, z);
                return;
            }
            return;
        }
        LIZJ(null, str, set, function1, z);
    }

    public static final boolean LIZJ(Uri uri, String str, Set set, Function1 function1, boolean z) {
        C013C c013c = new C013C();
        LIZ(str).LIZJ(new AwS0S1410000_23(uri, (Uri) function1, (Function1<? super C1534110q1Z, Boolean>) c013c, (C013C) z, (boolean) set, (Set<String>) str, (String) 1));
        return c013c.element;
    }
}
