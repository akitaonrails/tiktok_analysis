package X;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701510RfR {
    public static final C701510RfR LIZ = new C701510RfR();
    public static final Map<String, Function1<WeakReference<C704830Rkn>, InterfaceC702540Rh6>> LIZIZ;

    static {
        Function1 poiTagPolicyProvider;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        LIZIZ = concurrentHashMap;
        C1367960lha.LIZ.getClass();
        if (C1367960lha.LIZ().getPoiTagProvider() == null || (poiTagPolicyProvider = C1367960lha.LIZ().getPoiTagPolicyProvider()) == null) {
            return;
        }
        concurrentHashMap.put("high_tag_poi_check_in", poiTagPolicyProvider);
        concurrentHashMap.put("meta_tag_poi_check_in", poiTagPolicyProvider);
    }
}
