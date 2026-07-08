package X;

import com.bytedance.hybrid.spark.roma.expr.ConditionModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1924607gK {
    public static final C1924607gK LIZ;
    public static final Map<String, InterfaceC2217451BqZ<InterfaceC1921807fs>> LIZIZ;
    public static final C1924307gH LIZJ;

    static {
        C1924607gK c1924607gK = new C1924607gK();
        LIZ = c1924607gK;
        Map<String, InterfaceC2217451BqZ<InterfaceC1921807fs>> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("_std_unixtime_", new C1926307gb(c1924607gK)), new Pair("_std_local_unixtime_", new C1926407gc(c1924607gK)), new Pair("_std_op_region_", new C1925907gX(c1924607gK)));
        LIZIZ = mapLJIIIIZZ;
        LIZJ = new C1924307gH(mapLJIIIIZZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x036b, code lost:
    
        r1 = java.lang.Boolean.FALSE;
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03e5, code lost:
    
        r1 = new X.C098200Yq(new java.lang.Error("Unreachable!"));
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018e, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("Syntax error, except operator, got ");
        r1.append(r12.LIZ());
        r1 = new X.C098200Yq(new java.lang.Error(X.C2188811AlT.LIZIZ(r1)));
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0244, code lost:
    
        r1 = java.lang.Boolean.FALSE;
        X.C189200o6.m2constructorimpl(r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x035f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.hybrid.spark.roma.config.ShortLinkConfig LIZ(com.bytedance.hybrid.spark.roma.config.ShortLinkConfig r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1924607gK.LIZ(com.bytedance.hybrid.spark.roma.config.ShortLinkConfig, java.util.Map):com.bytedance.hybrid.spark.roma.config.ShortLinkConfig");
    }

    public static k LIZJ(String str, k kVar) {
        boolean z;
        k kVarLJJIIJZLJL;
        Integer numLJIIJJI;
        String strLJJLL = a0.LJJLL('/', str, str);
        if (strLJJLL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (kVar instanceof n) {
            kVarLJJIIJZLJL = kVar.LJIILIIL().LJJIIZ(strLJJLL);
        } else if ((kVar instanceof h) && (numLJIIJJI = C2095008Iq.LJIIJJI(strLJJLL)) != null) {
            kVarLJJIIJZLJL = kVar.LJIIL().LJJIIJZLJL(numLJIIJJI.intValue());
        } else {
            kVarLJJIIJZLJL = null;
        }
        if (Intrinsics.LJFF(strLJJLL, str)) {
            return kVarLJJIIJZLJL;
        }
        if (kVarLJJIIJZLJL == null) {
            return null;
        }
        return LIZJ(a0.LJJLIIJ('/', str, str), kVarLJJIIJZLJL);
    }

    public static InterfaceC1921807fs LIZIZ(String str, Map map, Map map2) {
        k kVarLIZJ;
        Object c098200Yq;
        InterfaceC1921807fs interfaceC1921807fs;
        Object c098200Yq2;
        ConditionModel.PreciseExposureInfo preciseExposureInfo = (ConditionModel.PreciseExposureInfo) map2.get(str);
        if (preciseExposureInfo != null) {
            Object obj = null;
            if (a0.LJJIJ(preciseExposureInfo.keyPath, '/')) {
                String str2 = preciseExposureInfo.keyPath;
                k kVar = (k) C1550300qRg.LIZIZ.LJIIIIZZ(k.class, a0.LJJLL('/', str2, str2));
                if (kVar != null) {
                    String str3 = preciseExposureInfo.keyPath;
                    kVarLIZJ = LIZJ(a0.LJJLIIJ('/', str3, str3), kVar);
                }
                return C1922307fx.LIZ;
            }
            kVarLIZJ = (k) C1550300qRg.LIZIZ.LJIIIIZZ(k.class, preciseExposureInfo.keyPath);
            if (kVarLIZJ != null) {
                if (kVarLIZJ instanceof q) {
                    q qVar = (q) kVarLIZJ;
                    Object obj2 = qVar.LL;
                    if (obj2 instanceof Boolean) {
                        return new C12870051w(qVar.LJ());
                    }
                    if (obj2 instanceof String) {
                        return new C1922907g3(qVar.LJIL());
                    }
                    if (obj2 instanceof Number) {
                        String strLJIL = qVar.LJIL();
                        if (!a0.LJJIJ(strLJIL, '.') && !a0.LJJIJ(strLJIL, 'e') && !a0.LJJIJ(strLJIL, 'E')) {
                            try {
                                c098200Yq2 = new C12872051y(((q) kVarLIZJ).LJIIZILJ());
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq2 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                                obj = c098200Yq2;
                            }
                            interfaceC1921807fs = (InterfaceC1921807fs) obj;
                        } else {
                            try {
                                c098200Yq = new C1921607fq(((q) kVarLIZJ).LJIIIZ());
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                c098200Yq = new C098200Yq(th2);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                obj = c098200Yq;
                            }
                            interfaceC1921807fs = (InterfaceC1921807fs) obj;
                        }
                        if (interfaceC1921807fs != null) {
                            return interfaceC1921807fs;
                        }
                        return C1922307fx.LIZ;
                    }
                    return C1922307fx.LIZ;
                }
                return C1922307fx.LIZ;
            }
            return C1922307fx.LIZ;
        }
        String str4 = (String) map.get(str);
        if (str4 != null) {
            return new C1922907g3(str4);
        }
        return C1922307fx.LIZ;
    }
}
