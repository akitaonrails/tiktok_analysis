package X;

import android.os.Looper;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyConfigurationConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZMW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZMW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        return Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread());
    }

    public static void LIZJ(String str, List list, boolean z, long j) {
        boolean zLIZ = LIZ();
        try {
            String strLJ = C051M.LJ(C13LP.LJLLJ(list), false);
            if (strLJ != null) {
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("strategy_performance_handle_data", C2097608Jq.LJIIIIZZ(new Pair("is_main_thread", String.valueOf(zLIZ)), new Pair("process", str), new Pair("scene_list", strLJ), new Pair("has_exception", String.valueOf(z)), new Pair("time_ms", String.valueOf(j))));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str, String str2, String str3, long j, boolean z) {
        boolean zLIZ = LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis() % ((long) 100);
        C0ZMY.LIZ.getClass();
        if (jCurrentTimeMillis < ((StrategyConfigurationConfig) C0ZMY.LIZJ.getValue()).sampleRateOfDecisionProcess) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("strategy_performance_decision_process", C2097608Jq.LJIIIIZZ(new Pair("is_main_thread", String.valueOf(zLIZ)), new Pair(Scene.SCENE_SERVICE, str), new Pair("from_path", str2), new Pair("type", str3), new Pair("time_ms", String.valueOf(j)), new Pair("has_exception", String.valueOf(z))));
        }
    }
}
