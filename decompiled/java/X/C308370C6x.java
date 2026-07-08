package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0C6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308370C6x {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(num);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mapLJJIJIIJIL.entrySet()) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Object[] objArr = C308380C6y.LIZ;
            Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("poi_search_params_filter_key", String[].class, objArr);
            if (objArr2 != null) {
                objArr = objArr2;
            }
            if (C13LQ.LJJIJIIJI(entry.getKey(), objArr) < 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.putAll(linkedHashMap2);
        return linkedHashMap;
    }
}
