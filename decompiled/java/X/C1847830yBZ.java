package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0yBZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847830yBZ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1848090yBz c1848090yBz, Map map, C1847770yBT c1847770yBT) {
        C1847770yBT c1847770yBT2;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                Map<? extends String, ? extends Object> map2 = (Map) value;
                if (map2 != null) {
                    c1848090yBz.LIZIZ.putAll(map2);
                }
            } else if (value instanceof C0Q2L) {
                if (c1847770yBT != null && (c1847770yBT2 = c1847770yBT.LJFF) != null) {
                    while (true) {
                        Object obj = c1847770yBT2.LIZ.LJ.LIZIZ.get(str);
                        if (!(obj instanceof C0Q2L)) {
                            if (obj != null) {
                                if (obj instanceof Map) {
                                    Map<? extends String, ? extends Object> map3 = (Map) obj;
                                    if (map3 != null) {
                                        c1848090yBz.LIZIZ.putAll(map3);
                                    }
                                } else {
                                    c1848090yBz.LIZ(str, obj);
                                }
                            }
                        } else {
                            c1847770yBT2 = c1847770yBT2.LJFF;
                            if (c1847770yBT2 != null) {
                            }
                        }
                    }
                }
            } else {
                c1848090yBz.LIZ(str, value);
            }
        }
    }
}
