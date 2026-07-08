package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2179408gK {
    public static volatile boolean LIZ;
    public static final ConcurrentHashMap<String, HashMap<String, String>> LIZIZ = new ConcurrentHashMap<>();

    public static final HashMap<String, String> LIZ(String str, String str2, Function1<? super String, ? extends HashMap<String, String>> function1) {
        if (str != null && !a0.LJJJIL(str)) {
            if (!LIZ) {
                HashMap<String, String> mapInvoke = function1.invoke(str);
                if (mapInvoke == null) {
                    return new HashMap<>();
                }
                return mapInvoke;
            }
            LinkedHashSet linkedHashSetLIZLLL = C093Y.LIZLLL(str);
            if (str2 != null && !a0.LJJJIL(str2)) {
                linkedHashSetLIZLLL.add(str2);
            }
            Iterator it2 = linkedHashSetLIZLLL.iterator();
            while (it2.hasNext()) {
                HashMap<String, String> map = LIZIZ.get(it2.next());
                if (map != null) {
                    return map;
                }
            }
            HashMap<String, String> mapInvoke2 = function1.invoke(str);
            if (mapInvoke2 == null) {
                mapInvoke2 = new HashMap<>();
            }
            Iterator it3 = linkedHashSetLIZLLL.iterator();
            while (it3.hasNext()) {
                LIZIZ.put((String) it3.next(), mapInvoke2);
            }
            return mapInvoke2;
        }
        return new HashMap<>();
    }
}
