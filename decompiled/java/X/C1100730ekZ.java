package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ekZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1100730ekZ {
    public final List<C923800a9C> LIZ = new ArrayList();
    public final int LIZIZ = LiveHostPerfAutoAdaptiveSetting.getValue().continuousCollectMetricsCount * LiveHostPerfAutoAdaptiveSetting.getValue().upgradeThreshold;
    public int LIZJ = -1;
    public int LIZLLL = 100;

    public final synchronized void LIZ() {
        C923800a9C c923800a9C = (C923800a9C) C13LP.LJJLIIIJL(this.LIZ);
        ((ArrayList) this.LIZ).clear();
        if (c923800a9C != null) {
            ((ArrayList) this.LIZ).add(c923800a9C);
        }
    }

    public final synchronized C923800a9C LIZIZ() {
        return (C923800a9C) C13LP.LJJLIIIJL(this.LIZ);
    }
}
