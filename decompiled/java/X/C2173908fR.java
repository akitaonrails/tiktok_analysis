package X;

import com.bytedance.keva.Keva;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS117S1100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08fR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2173908fR {
    public static volatile boolean LIZIZ;
    public static final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public static final Keva LIZJ = Keva.getRepo("ecc_dsl_cache");

    public static Map LIZ() {
        HashMap<String, Object> mapLJIIJ;
        ConcurrentHashMap<String, Object> concurrentHashMap = LIZ;
        if (concurrentHashMap.isEmpty() && !LIZIZ) {
            LIZIZ = true;
            concurrentHashMap.clear();
            String string = LIZJ.getString("ecc_dsl_content_map", "{}");
            if (string.length() > 0 && (mapLJIIJ = C1741890vQh.LJIIJ(string)) != null) {
                concurrentHashMap.putAll(mapLJIIJ);
            }
        }
        return concurrentHashMap;
    }

    public static void LIZIZ(String str, String str2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(LIZ());
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(C13LQ.LJJLL(LIZJ.getStringArray("ecc_dsl_using_list", new String[0])));
        C07WE c07we = new C07WE(str);
        if (!c07we.LIZ) {
            return;
        }
        C2174008fS c2174008fS = new C2174008fS(concurrentHashMap.keys());
        while (c2174008fS.hasNext()) {
            String str3 = (String) c2174008fS.next();
            C07WE c07we2 = new C07WE(str3);
            if (c07we2.LIZ && Intrinsics.LJFF(c07we.LIZ(), c07we2.LIZ()) && !Intrinsics.LJFF(str3, str)) {
                concurrentHashMap.remove(str3);
            }
        }
        if (str2 != null && str2.length() > 0) {
            concurrentHashMap.put(str, str2);
        }
        C19719612Di.LJJIIJ(copyOnWriteArrayList, new AwS117S1100000_3(c07we, str, 8), true);
        if (!copyOnWriteArrayList.contains(str)) {
            copyOnWriteArrayList.add(str);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap2 = LIZ;
        concurrentHashMap2.clear();
        concurrentHashMap2.putAll(concurrentHashMap);
        Keva keva = LIZJ;
        keva.storeString("ecc_dsl_content_map", C1741890vQh.LJIIIIZZ(concurrentHashMap));
        keva.storeStringArray("ecc_dsl_using_list", (String[]) copyOnWriteArrayList.toArray(new String[0]));
    }
}
