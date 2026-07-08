package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Jga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498380Jga {
    public static final C498380Jga LIZ = new C498380Jga();
    public static final C19348710mr LIZIZ = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
    public static final LinkedHashMap<Long, String> LIZJ = new LinkedHashMap<>(32, 0.75f, true);

    public final synchronized String LIZ(long j) {
        String strValueOf;
        LinkedHashMap<Long, String> linkedHashMap = LIZJ;
        String str = linkedHashMap.get(Long.valueOf(j));
        if (str != null) {
            return str;
        }
        if (linkedHashMap.size() >= 128) {
            int size = linkedHashMap.size() / 2;
            Iterator<Map.Entry<Long, String>> it2 = linkedHashMap.entrySet().iterator();
            for (int i = 0; i < size; i++) {
                if (it2.hasNext()) {
                    it2.next();
                    it2.remove();
                }
            }
        }
        CharSequence charSequenceLIZ = C19374310qz.LIZ(Long.valueOf(j), LIZIZ, null, 0, 28);
        if (charSequenceLIZ == null || (strValueOf = charSequenceLIZ.toString()) == null) {
            strValueOf = String.valueOf(j);
        }
        LIZJ.put(Long.valueOf(j), strValueOf);
        return strValueOf;
    }
}
