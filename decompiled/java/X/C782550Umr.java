package X;

import Y.ARunnableS133S0100000_33;
import android.os.SystemClock;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Umr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782550Umr {
    public static final CopyOnWriteArrayList<Function0<Unit>> LIZLLL = new CopyOnWriteArrayList<>();
    public static C782580Umu LJ;
    public final DataChannel LIZ;
    public volatile long LIZIZ;
    public final ARunnableS133S0100000_33 LIZJ = new ARunnableS133S0100000_33(this, 126);

    public final void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LIZIZ < MemoryTriggerSetting.INSTANCE.getNormalIntervalMs()) {
            C20441214yg.LIZIZ("BroadcastMemoryCleaners", "notifyMemRelief skipped: within cooldown window");
        } else {
            this.LIZIZ = jElapsedRealtime;
            C1618340sDQ.LIZ();
        }
    }

    public C782550Umr(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
