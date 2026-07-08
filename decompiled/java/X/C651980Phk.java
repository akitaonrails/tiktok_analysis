package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS98S0110000_10;

/* JADX INFO: renamed from: X.0Phk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651980Phk {
    public static Map LIZJ() {
        Map<String, String> map;
        C651990Phl c651990Phl = C651990Phl.LL;
        C651970Phj c651970Phj = (C651970Phj) C665240Q7m.LIZJ(C651970Phj.class);
        return (c651970Phj == null || (map = c651970Phj.LL) == null) ? new LinkedHashMap() : map;
    }

    public static Map LIZ(String str) {
        boolean zIsEmpty;
        Map linkedHashMap;
        if (str != null && str.length() != 0) {
            if (C123100dR.LIZ(str)) {
                zIsEmpty = ((List) C1237404sm.LIZIZ.getValue()).contains(str);
            } else {
                zIsEmpty = true ^ ((List) C1237404sm.LIZIZ.getValue()).isEmpty();
            }
            if (!zIsEmpty) {
                return new LinkedHashMap();
            }
            C651990Phl c651990Phl = C651990Phl.LL;
            C651970Phj c651970Phj = (C651970Phj) C665240Q7m.LIZJ(C651970Phj.class);
            if (c651970Phj == null || (linkedHashMap = c651970Phj.LLILLJJLI) == null) {
                linkedHashMap = new LinkedHashMap();
            }
            Map map = (Map) linkedHashMap.get(str);
            if (map == null) {
                return new LinkedHashMap();
            }
            return map;
        }
        return new LinkedHashMap();
    }

    public static Map LIZIZ(String str) {
        Map<String, String> map;
        if (str != null && LIZLLL(str)) {
            C651990Phl c651990Phl = C651990Phl.LL;
            C651970Phj c651970Phj = (C651970Phj) C665240Q7m.LIZJ(C651970Phj.class);
            if (c651970Phj == null || (map = c651970Phj.LL) == null) {
                return new LinkedHashMap();
            }
            return map;
        }
        return new LinkedHashMap();
    }

    public static boolean LIZLLL(String str) {
        return C13LP.LJJJJ(str, C651970Phj.LLILZ);
    }

    public static void LJ(Map map) {
        C665240Q7m.LIZLLL(C651990Phl.LL, C651970Phj.class, new AwS589S0100000_10(map, (Map<String, String>) 605));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(Map map, boolean z) {
        C0QFR c0qfr;
        C665240Q7m.LIZLLL(C651990Phl.LL, C651970Phj.class, new AwS98S0110000_10(z, (boolean) map, (Map<String, String>) 1));
        C118300cf c118300cf = new C118300cf();
        C259800zU c259800zU = new C259800zU();
        AwS376S0200000_10 awS376S0200000_10 = new AwS376S0200000_10(c118300cf, (C118300cf) c259800zU, (C259800zU<C0QFQ>) 142);
        for (C0QFL c0qflLJFF = C2211631BhB.LJFF(); c0qflLJFF != null && !((Boolean) awS376S0200000_10.invoke(c0qflLJFF)).booleanValue(); c0qflLJFF = c0qflLJFF.getPrev()) {
        }
        C0QFQ c0qfq = (C0QFQ) c259800zU.element;
        if (c0qfq != null && (c0qfr = c0qfq.LL) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                linkedHashMap.putAll((ConcurrentHashMap) c0qfr.LIZ.getValue());
            }
            linkedHashMap.putAll(map);
            ((ConcurrentHashMap) c0qfr.LIZ.getValue()).clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ((ConcurrentHashMap) c0qfr.LIZ.getValue()).putAll(linkedHashMap2);
        }
    }
}
