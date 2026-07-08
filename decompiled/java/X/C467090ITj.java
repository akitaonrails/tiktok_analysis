package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFeedDynamicFeatureConfigNew;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ITj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467090ITj extends C09AY implements Function0<Map<String, ? extends Map<String, ? extends List<? extends String>>>> {
    public C467090ITj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.String>>>] */
    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Map<String, ? extends List<? extends String>>> invoke() {
        Map<String, Map<String, Map<String, Integer>>> value = LiveFeedDynamicFeatureConfigNew.INSTANCE.getValue();
        if (value == null) {
            ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveFeedDynamicFeatureConfig.class);
            return valueSafely == 0 ? LiveFeedDynamicFeatureConfig.DEFAULT : valueSafely;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(value.size()));
        Iterator<T> it2 = value.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Map map = (Map) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Map.Entry entry2 : map.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), C13LP.LLIIII(((Map) entry2.getValue()).keySet()));
            }
            linkedHashMap.put(key, linkedHashMap2);
        }
        return linkedHashMap;
    }
}
