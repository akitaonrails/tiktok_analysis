package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS225S0000000_34;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1BKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2203061BKe {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C01GW LIZIZ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(481));
    public static final C01GW LIZJ = C292401Bi.LIZ(AnonymousClass0206.get$arr$(480));
    public static final C01GW LIZLLL = C292401Bi.LIZ(AFwS225S0000000_34.get$arr$(282));
    public static final C01GW LJ = C292401Bi.LIZ(AFwS224S0000000_33.get$arr$(625));
    public static final C01GW LJFF = C292401Bi.LIZ(AFwS224S0000000_33.get$arr$(626));
    public static final ConcurrentHashMap<String, InterfaceC1145110fu9> LJI = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, C2203041BKc>> LJII = new ConcurrentHashMap<>();
    public static Function0<? extends InterfaceC2203131BKl> LJIIIIZZ;
    public static long LJIIIZ;
    public static Function0<Long> LJIIJ;

    public static void LIZ(Map map, String str, String str2, JSONArray jSONArray) {
        long jLongValue;
        C2203041BKc c2203041BKcPutIfAbsent;
        ConcurrentHashMap<String, C2203041BKc> concurrentHashMapPutIfAbsent;
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, C2203041BKc>> concurrentHashMap = LJII;
            String str3 = ((C2203071BKf) entry.getValue()).LIZJ;
            ConcurrentHashMap<String, C2203041BKc> concurrentHashMap2 = concurrentHashMap.get(str3);
            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str3, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
            }
            ConcurrentHashMap<String, C2203041BKc> concurrentHashMap3 = concurrentHashMap2;
            String str4 = ((C2203071BKf) entry.getValue()).LIZIZ;
            C2203041BKc c2203041BKc = concurrentHashMap3.get(str4);
            if (c2203041BKc == null && (c2203041BKcPutIfAbsent = concurrentHashMap3.putIfAbsent(str4, (c2203041BKc = new C2203041BKc()))) != null) {
                c2203041BKc = c2203041BKcPutIfAbsent;
            }
            C2203041BKc c2203041BKc2 = c2203041BKc;
            c2203041BKc2.LIZ = System.currentTimeMillis();
            c2203041BKc2.LIZIZ++;
        }
        for (Map.Entry entry2 : map.entrySet()) {
            InterfaceC1145110fu9 interfaceC1145110fu9 = LJI.get(entry2.getKey());
            if (interfaceC1145110fu9 != null) {
                String str5 = (String) entry2.getKey();
                String str6 = (String) entry2.getKey();
                String str7 = ((C2203071BKf) entry2.getValue()).LIZ;
                Function0<Long> function0 = LJIIJ;
                if (function0 != null) {
                    jLongValue = function0.invoke().longValue();
                } else {
                    jLongValue = 0;
                }
                interfaceC1145110fu9.LIZIZ(str5, new C01JS(str6, str7, jLongValue, str, ((C2203071BKf) entry2.getValue()).LIZJ, ((C2203071BKf) entry2.getValue()).LIZIZ, ((C2203071BKf) entry2.getValue()).LJFF, str2, LJIIIZ, jSONArray));
            }
        }
    }
}
