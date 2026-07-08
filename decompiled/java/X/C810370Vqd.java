package X;

import com.bytedance.keva.Keva;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0Vqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810370Vqd {
    public static void LIZ() {
        if (System.currentTimeMillis() - C810380Vqe.LIZ.LIZ().getLong("clear_timestamp", 0L) < 21600000) {
            return;
        }
        C810380Vqe.LIZIZ.LIZ().edit().putBoolean("trigger_launch_protect_drill_crash", C0C64.LJIILLIIL().LJIIIZ(31744, "trigger_launch_protect_drill_crash", true, false)).apply();
        C805560Vis.LIZJ = C0C64.LJIILLIIL().LJIIIZ(31744, "shared_preferences_exp", true, false);
    }

    public static void LIZIZ() {
        Keva.getRepo("ab_repo_cold_boot_muti").storeInt("zl_jit_block_priority2", C0C64.LJIILLIIL().LJIJ(31744, -1, "zl_jit_block_priority2", true));
    }

    public static void LIZJ() {
        C809340Voy c809340VoyLIZ = PushMultiProcessSharedProvider.LJ(C1BWL.LIZ()).LIZ();
        c809340VoyLIZ.LIZIZ.put("ensure_init_configurations", Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "ensure_init_push_config", true, false)));
        c809340VoyLIZ.LIZ();
    }
}
