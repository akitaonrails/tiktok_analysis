package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;

/* JADX INFO: renamed from: X.0pNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509460pNo {
    public static float LIZ(MemoryFeatureInfo memoryFeatureInfo, String str) {
        return LIZLLL(memoryFeatureInfo, str, Float.valueOf(0.0f)).floatValue();
    }

    public static int LIZIZ(MemoryFeatureInfo memoryFeatureInfo, String str) {
        return LIZLLL(memoryFeatureInfo, str, 0).intValue();
    }

    public static long LIZJ(MemoryFeatureInfo memoryFeatureInfo, String str) {
        return LIZLLL(memoryFeatureInfo, str, 0L).longValue();
    }

    public static final String LJ(MemoryFeatureInfo memoryFeatureInfo, String str) {
        Object feature;
        if (memoryFeatureInfo != null && (feature = memoryFeatureInfo.getFeature(str)) != null) {
            return feature.toString();
        }
        return null;
    }

    public static final Number LIZLLL(MemoryFeatureInfo memoryFeatureInfo, String str, Number number) {
        Object feature;
        if (memoryFeatureInfo != null) {
            feature = memoryFeatureInfo.getFeature(str);
        } else {
            feature = null;
        }
        Number numberLIZIZ = C1923007g4.LIZIZ(feature);
        if (numberLIZIZ != null) {
            return numberLIZIZ;
        }
        return number;
    }
}
