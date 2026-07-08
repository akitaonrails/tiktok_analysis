package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0UBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768270UBt {
    public static final C768270UBt LIZ = new C768270UBt();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public static void LIZ(int i, String str) {
        try {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_storage_clean_report");
            c474500IjALIZ.LJJII(1, "experiment_group");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "actual_clean_size");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "available_clean_size");
            c474500IjALIZ.LJJII(str, "clean_dir");
            c474500IjALIZ.LIZ();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
