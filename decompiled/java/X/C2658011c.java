package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.011c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2658011c {
    public static final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Set<String>> LIZIZ = new ConcurrentHashMap<>();

    public static Object LIZ(String str, String str2) {
        if (str != null && !a0.LJJJIL(str)) {
            if (!a0.LJJJIL(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('@');
                sbLIZ.append(str2);
                str2 = C2188811AlT.LIZIZ(sbLIZ);
            }
            Object obj = LIZ.get(str2);
            if (obj == null) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{e3.g}, 0, 6);
                String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                if (str3 != null && !a0.LJJJIL(str3) && !LIZIZ.containsKey(str3)) {
                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                    if (objLJJJLZIJ == null) {
                        objLJJJLZIJ = "";
                    }
                    C1018703yb.LJ("rd_tiktokec_pdp_cache_clear_monitor", C2097908Jt.LIZJ(new Pair("cache_key", objLJJJLZIJ)));
                }
            }
            if (obj instanceof WeakReference) {
                obj = ((Reference) obj).get();
            }
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    public static String LIZIZ(Object obj, String str, String str2, boolean z) {
        if (!a0.LJJJIL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('@');
            sbLIZ.append(str2);
            str2 = C2188811AlT.LIZIZ(sbLIZ);
        }
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = LIZIZ;
        Set<String> set = concurrentHashMap.get(str);
        if (set != null) {
            set.add(str2);
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add(str2);
            concurrentHashMap.put(str, hashSet);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap2 = LIZ;
        if (z) {
            obj = new WeakReference(obj);
        }
        concurrentHashMap2.put(str2, obj);
        return str2;
    }
}
