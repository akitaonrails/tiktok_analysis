package X;

import com.tiktok.ssc.event.EventFilter;
import com.tiktok.ssc.event.SSCEvent;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05EO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05EO {
    public static final ConcurrentHashMap<String, C05EN> LIZ = new ConcurrentHashMap<>();
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ);
    public static final PriorityQueue<C05EQ> LIZJ = new PriorityQueue<>();

    public static void LIZ(SSCEvent sSCEvent) {
        for (Map.Entry<String, C05EN> entry : LIZ.entrySet()) {
            String key = entry.getKey();
            C05EN value = entry.getValue();
            EventFilter eventFilter = value.LLILLJJLI;
            if (eventFilter != null) {
                List<String> list = eventFilter.eventNames;
                List<EnumC993910byH> list2 = eventFilter.eventTypes;
                if (list == null || list.isEmpty() || list.contains(sSCEvent.eventName) || list2 == null || list2.isEmpty() || list2.contains(sSCEvent.type)) {
                }
            }
            C23250099c.LIZLLL(LIZIZ, null, null, new C05EK(value, sSCEvent, key, null), 3);
        }
    }
}
