package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.external.AVCameraInitTask;
import com.ss.android.ugc.aweme.services.performance.CameraConfigPreloadServiceImpl;

/* JADX INFO: renamed from: X.0Mll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578030Mll {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C578030Mll.LIZ(android.content.Context):void");
    }

    public final void LIZIZ(Context context) {
        synchronized (this) {
            try {
                if (AVCameraInitTask.LLILLJJLI) {
                    return;
                }
                AVCameraInitTask.LLILLJJLI = true;
                C0LGM.LIZ().preLoadVESo();
                C201955140j.LJIIL("camera preLoad so end");
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_ve_preload_camera_prop", true, false)) {
                    C201955140j.LJIIL("VECameraProp preload start");
                    CameraConfigPreloadServiceImpl.createICameraConfigPreloadServicebyMonsterPlugin(false).preloadVECameraConfigIfNecessary(context);
                    C201955140j.LJIIL("VECameraProp preload end");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
