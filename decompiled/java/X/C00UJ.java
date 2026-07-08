package X;

import com.ss.android.ugc.aweme.ml.feature.events.EventWithPortraitsConfig;
import com.ss.android.ugc.aweme.ml.feature.events.EventWithPortraitsOneItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.00UJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00UJ {
    public static boolean LIZ;
    public static HashMap<String, List<String>> LIZIZ;

    public static void LIZIZ() {
        EventWithPortraitsConfig eventWithPortraitsConfig = (EventWithPortraitsConfig) C0C64.LJIILLIIL().LJJII(EventWithPortraitsConfig.class, null, "event_with_portrait_config", false);
        if (eventWithPortraitsConfig != null) {
            List<EventWithPortraitsOneItem> events = eventWithPortraitsConfig.getEvents();
            if (eventWithPortraitsConfig.getEnable() && events != null && (!events.isEmpty())) {
                LIZ = true;
                HashMap<String, List<String>> map = new HashMap<>();
                for (EventWithPortraitsOneItem eventWithPortraitsOneItem : events) {
                    LIZ(eventWithPortraitsOneItem.getName(), map, eventWithPortraitsOneItem.getPortraits());
                    List<String> names = eventWithPortraitsOneItem.getNames();
                    if (names != null) {
                        Iterator<String> it2 = names.iterator();
                        while (it2.hasNext()) {
                            LIZ(it2.next(), map, eventWithPortraitsOneItem.getPortraits());
                        }
                    }
                }
                if (!map.isEmpty()) {
                    LIZIZ = map;
                }
            }
        }
    }

    public static void LIZ(String str, HashMap map, List list) {
        if (str != null && list != null && !list.isEmpty()) {
            List list2 = (List) map.get(str);
            if (list2 != null) {
                for (Object obj : list) {
                    if (!list2.contains(obj)) {
                        list2.add(obj);
                    }
                }
                return;
            }
            map.put(str, new ArrayList(list));
        }
    }
}
