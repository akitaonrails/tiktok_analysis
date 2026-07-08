package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0sg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636070sg1 {
    public static int LIZIZ;
    public static int LIZ = 15;
    public static final ConcurrentHashMap<String, Pair<Boolean, Long>> LIZJ = new ConcurrentHashMap<>();
    public static final C563400M7u LIZLLL = new C563400M7u(0);

    public static float LIZ(long j) {
        if (LIZIZ == 0) {
            return 0.0f;
        }
        ConcurrentHashMap<String, Pair<Boolean, Long>> concurrentHashMap = LIZJ;
        if (concurrentHashMap != null && !concurrentHashMap.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Pair<Boolean, Long>> entry : concurrentHashMap.entrySet()) {
                if (entry.getValue().getFirst().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            long jLongValue = 0;
            while (it2.hasNext()) {
                jLongValue += ((Number) ((Pair) ((Map.Entry) it2.next()).getValue()).getSecond()).longValue();
            }
            return jLongValue / ((long) LIZJ.size());
        }
        return (System.currentTimeMillis() - j) / LIZIZ;
    }

    public static void LIZIZ(List list, InterfaceC1624480sNK interfaceC1624480sNK) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String id = ((Effect) obj).getId();
            if (id != null && a0.LJJIIZI(id, "title", false)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        int size3 = list.size() - size2;
        int i = LIZIZ;
        if (size3 < i) {
            size = list.size();
        } else {
            if (i == 0) {
                int size4 = list.size() - size2;
                i = LIZ;
                if (size4 < i) {
                    size = list.size();
                }
            }
            interfaceC1624480sNK.LJJLIIIJJI(i);
            LIZIZ = interfaceC1624480sNK.LJIILJJIL();
        }
        i = size - size2;
        interfaceC1624480sNK.LJJLIIIJJI(i);
        LIZIZ = interfaceC1624480sNK.LJIILJJIL();
    }
}
