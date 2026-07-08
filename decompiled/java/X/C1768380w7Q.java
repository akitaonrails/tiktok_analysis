package X;

import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0w7Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768380w7Q {
    public static final Map<String, Object> LIZ(BcmStandardTrackData bcmStandardTrackData) {
        LinkedHashMap linkedHashMap;
        Map<String, Object> map;
        if (bcmStandardTrackData != null && (map = bcmStandardTrackData.chainParam) != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (!(linkedHashMap instanceof Map)) {
            return null;
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> LIZIZ(BcmStandardTrackData bcmStandardTrackData) {
        LinkedHashMap linkedHashMap;
        Map<String, Object> map;
        if (bcmStandardTrackData != null && (map = bcmStandardTrackData.trackParam) != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (!(linkedHashMap instanceof Map)) {
            return null;
        }
        return linkedHashMap;
    }
}
