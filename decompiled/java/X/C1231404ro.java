package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.SparkIsolationTrackModel;

/* JADX INFO: renamed from: X.04ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231404ro {
    public static SparkIsolationTrackModel LIZ;
    public static long LIZIZ = System.currentTimeMillis();

    public static final SparkIsolationTrackModel LIZ() {
        if (LIZ == null || System.currentTimeMillis() - LIZIZ > 300000) {
            SparkIsolationTrackModel sparkIsolationTrackModel = (SparkIsolationTrackModel) SettingsManager.LIZLLL().LJIIIIZZ("spark_isolation_track", SparkIsolationTrackModel.class, LIZ);
            if (sparkIsolationTrackModel == null) {
                sparkIsolationTrackModel = new SparkIsolationTrackModel(Boolean.FALSE, Boolean.TRUE, C1697810uHb.LJIIJJI(0, 402685958));
            }
            LIZ = sparkIsolationTrackModel;
            LIZIZ = System.currentTimeMillis();
        }
        return LIZ;
    }
}
