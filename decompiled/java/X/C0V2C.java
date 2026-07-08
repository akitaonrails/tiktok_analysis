package X;

import Y.ARunnableS92S0000000_13;
import com.bytedance.apm.PerfConfig;
import com.bytedance.apm.block.evil.EvilMethodSwitcher;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0V2C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V2C {
    public static C791040V1i LIZ;
    public static boolean LIZIZ;

    public static void LIZ() {
        C791040V1i c791040V1i = new C791040V1i();
        LIZ = c791040V1i;
        c791040V1i.LIZ = System.currentTimeMillis();
        if (C792400V6o.LJIIJ()) {
            boolean zIsOpenLaunchEvilMethod = EvilMethodSwitcher.isOpenLaunchEvilMethod();
            LIZIZ = zIsOpenLaunchEvilMethod;
            if (zIsOpenLaunchEvilMethod) {
                synchronized (C0V2D.class) {
                    if (C0V2D.LIZ) {
                        return;
                    }
                    C0V2D.LIZ = true;
                    if (!C0V2D.LIZIZ) {
                        C0V2D.LIZIZ = true;
                        C0V2E.LJIJI(EvilMethodSwitcher.getLaunchEvilThresholdMs());
                        C0V2E.LLJILJILJ = true;
                        if (EvilMethodSwitcher.isMessageKeyEnable()) {
                            PerfConfig.setReportMessage();
                        }
                        C791390V2r.LJJIII.LJIIJJI();
                        C0V2K.LJI();
                        C0V2E.LLJILJIL = true;
                        EvilMethodSwitcher.isLaunchLimitEvilMethodDepth();
                        C0V2E c0v2e = new C0V2E(true);
                        C0V2D.LIZJ = c0v2e;
                        c0v2e.LJIJJ();
                        C0V30.LIZJ(true, "launch", null);
                        C786410Ut5.LJLIIL(10000L, new BPEAHandler(), new ARunnableS92S0000000_13(53));
                    }
                    C314640CVa.LIZ("app_launch_evil_method_scene_apm_2");
                }
            }
        }
    }
}
