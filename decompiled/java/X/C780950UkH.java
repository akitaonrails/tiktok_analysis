package X;

import com.bytedance.android.livesdk.livesetting.broadcast.RestartLiveSetting;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0UkH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780950UkH {
    public final TreeMap<Long, Float> LIZ = new TreeMap<>();

    public final int LIZIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        RestartLiveSetting restartLiveSetting = RestartLiveSetting.INSTANCE;
        return this.LIZ.tailMap(Long.valueOf(jCurrentTimeMillis - ((long) (restartLiveSetting.getConfig().getGetPerformanceInterval() * (restartLiveSetting.getConfig().getPoorTimes() + 1.0f))))).size();
    }

    public final void LIZ(float f, long j) {
        this.LIZ.put(Long.valueOf(j), Float.valueOf(f));
        if (this.LIZ.size() > 6) {
            TreeMap<Long, Float> treeMap = this.LIZ;
            treeMap.remove(treeMap.firstKey());
        }
    }
}
