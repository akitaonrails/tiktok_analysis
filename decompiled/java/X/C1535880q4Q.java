package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0q4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535880q4Q {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;

    public static void LIZIZ(n nVar, AFwS212S0000000_23 aFwS212S0000000_23) {
        if (nVar.size() == 0) {
            return;
        }
        LIZ = LIZ(nVar, "multi_view_manager_leak", LIZ);
        LIZIZ = LIZ(nVar, "lynx_view_provider_leak", LIZIZ);
        LIZJ = LIZ(nVar, "pia_build_task_leak", LIZJ);
        LIZLLL = LIZ(nVar, "clear_lynx_client_when_destroy", LIZLLL);
        LJ = LIZ(nVar, "remove_dependency_when_release", LJ);
        LJFF = LIZ(nVar, "deduplicate_spark_prepare", LJFF);
        LJI = LIZ(nVar, "destroy_last_spark_context_list", LJI);
        LJII = LIZ(nVar, "destroy_last_kit_view_list", LJII);
        aFwS212S0000000_23.invoke();
    }

    public static boolean LIZ(n nVar, String str, boolean z) {
        Object c098200Yq;
        Object obj = null;
        try {
            k kVarLJJIIZ = nVar.LJJIIZ(str);
            if (kVarLJJIIZ != null) {
                c098200Yq = Boolean.valueOf(kVarLJJIIZ.LJ());
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }
}
