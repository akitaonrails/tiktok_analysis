package X;

import com.bytedance.apm.block.evil.EvilMethodSwitcher;

/* JADX INFO: renamed from: X.0V2D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2D {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static C0V2E LIZJ;

    public static synchronized void LIZ() {
        if (LIZJ != null && EvilMethodSwitcher.isOpenLaunchEvilMethod()) {
            LIZJ.LJIJ();
        }
    }

    public static synchronized void LIZIZ() {
        if (LIZ) {
            LIZ = false;
            C0V2E c0v2e = LIZJ;
            EvilMethodSwitcher.isLimitEvilMethodDepth();
            c0v2e.getClass();
            C0V2E.LJIJI(EvilMethodSwitcher.getEvilThresholdMs());
            C314640CVa.LIZLLL("app_launch_evil_method_scene_apm_2");
        }
    }
}
