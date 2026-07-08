package X;

import com.ss.android.ugc.aweme.minis.exp.MinisPreloadPerformanceData;
import java.util.Map;

/* JADX INFO: renamed from: X.0pt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528860pt6 {
    public static final MinisPreloadPerformanceData LIZ(EnumC2196771AyJ enumC2196771AyJ) {
        Map<String, MinisPreloadPerformanceData> map = C1528840pt4.LIZ().performanceCheckerConfig.requiredPerformanceConfigByScene;
        if (map != null) {
            return map.get(enumC2196771AyJ.getScene());
        }
        return null;
    }
}
