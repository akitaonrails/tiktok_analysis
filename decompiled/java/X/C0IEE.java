package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;

/* JADX INFO: renamed from: X.0IEE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IEE {
    public long LIZ = 0;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        if (this.LIZ == 0) {
            return;
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.LIZ;
        String str = this.LIZIZ ? "yes" : "no";
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_mini_window_mute_or_pause_live_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJII(Long.valueOf(jCurrentThreadTimeMillis), "duration");
        c474500IjALIZIZ.LJJII(str, "is_auto");
        c474500IjALIZIZ.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipMutePlayTimeLogger uploadEndMuteTime, duration is ");
        sbLIZ.append(jCurrentThreadTimeMillis);
        C20441214yg.LJIIIZ("picture_in_picture", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = 0L;
        this.LIZJ = false;
    }
}
