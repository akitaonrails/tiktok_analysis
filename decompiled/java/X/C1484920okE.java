package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0okE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1484920okE {
    public static final ConcurrentHashMap<String, C0IS1<C0IR0>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, CopyOnWriteArrayList<InterfaceC1479620obg>> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ() {
        ConcurrentHashMap<String, C0IS1<C0IR0>> concurrentHashMap = LIZ;
        if (concurrentHashMap.get("trending_page_list") == null) {
            C0IS3 c0is3 = new C0IS3();
            c0is3.LIZ = "trending_page_list";
            c0is3.LIZJ = "ONLY_LIST_PRELOAD";
            concurrentHashMap.putIfAbsent("trending_page_list", C582130MsN.LIZ().LIZ().LIZIZ(c0is3));
        }
    }
}
