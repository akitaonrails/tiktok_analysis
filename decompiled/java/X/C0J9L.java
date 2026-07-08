package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.notificatoin.AudioLiveService;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0J9L, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J9L {
    public static void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopService begin isRunning=");
        sbLIZ.append(AudioLiveService.isRunning);
        sbLIZ.append(" isStopping=");
        sbLIZ.append(AudioLiveService.isStopping);
        C20441214yg.LIZIZ("AudioLiveService", C2188811AlT.LIZIZ(sbLIZ));
        Context applicationContext = GlobalContext.getApplicationContext();
        if (!AudioLiveService.isRunning || applicationContext == null) {
            C20441214yg.LIZIZ("AudioLiveService", "stopService return");
            return;
        }
        AudioLiveService.isStopping = true;
        try {
            applicationContext.stopService(new Intent(applicationContext, (Class<?>) AudioLiveService.class));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("AudioLiveService", e);
        }
        C20441214yg.LIZIZ("AudioLiveService", "stopService end");
    }
}
