package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import lth.o;

/* JADX INFO: renamed from: X.0u2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688700u2u {
    public static final boolean LIZ(Activity activity) {
        long jLJIILL;
        if (C344950Dfh.LIZIZ) {
            C344950Dfh.LIZIZ = false;
            return true;
        }
        if (!C2354709Kn.LJIIZILJ()) {
            C201955140j.LJII(C201967140v.LIZIZ, "record check SD not available");
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131847054);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZ(activity, 3073, creativeToastBuilder);
            C344950Dfh.LIZIZ(-1L, -1L, false, false);
            return false;
        }
        long j = 1024;
        long jLJIJ = ((long) C0C64.LJIILLIIL().LJIJ(31744, 20, "record_min_disk_amount_mb", true)) * j * j;
        try {
            jLJIILL = C2354709Kn.LJIILL();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jLJIILL = 0;
        }
        if (jLJIILL < jLJIJ) {
            long j2 = jLJIJ - jLJIILL;
            if (j2 > 0) {
                o.LIZJ.getClass();
                LocalVideoPlayerManager localVideoPlayerManagerLJ = LocalVideoPlayerManager.LJ();
                localVideoPlayerManagerLJ.LIZ();
                if (!localVideoPlayerManagerLJ.LL.LJIIIIZZ(j2, false)) {
                    C201955140j.LJII(C201967140v.LIZIZ, "RecordCheck disk space insufficient sdAvailableSize:" + jLJIILL + " minDiskAmountByte:" + jLJIJ);
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131830703);
                    creativeToastBuilder2.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(activity, 3073, creativeToastBuilder2);
                    C344950Dfh.LIZIZ(jLJIILL, jLJIJ, true, false);
                    return false;
                }
            }
        }
        C344950Dfh.LIZIZ(jLJIILL, jLJIJ, true, true);
        return true;
    }
}
