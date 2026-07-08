package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0k2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304180k2i {
    public static final C1304180k2i LIZ = new C1304180k2i();
    public static final Map<String, LinkedHashSet<C1304170k2h>> LIZIZ = new LinkedHashMap();
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();

    public final synchronized void LIZ(C1304170k2h c1304170k2h, String str) {
        if (str != null) {
            if (!a0.LJJJIL(str)) {
                Map<String, LinkedHashSet<C1304170k2h>> map = LIZIZ;
                LinkedHashSet linkedHashSet = (LinkedHashSet) ((LinkedHashMap) map).get(str);
                if (linkedHashSet == null) {
                    return;
                }
                linkedHashSet.remove(c1304170k2h);
                if (linkedHashSet.isEmpty()) {
                    map.remove(str);
                    LIZJ.remove(str);
                } else {
                    LIZJ.put(str, Integer.valueOf(linkedHashSet.size()));
                }
            }
        }
    }
}
