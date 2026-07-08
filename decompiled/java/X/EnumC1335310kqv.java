package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1335310kqv {
    COMMON(0),
    EXTREME_LOW(1),
    ULTRA_LOW(2),
    LOW(3),
    SLIGHT_LOW(4),
    HIGH(5);

    public static final C1335320kqw Companion = new Object() { // from class: X.0kqw
    };
    public static final Map<Integer, EnumC1335310kqv> MAP;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0kqw] */
    static {
        EnumC1335310kqv[] enumC1335310kqvArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(enumC1335310kqvArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (EnumC1335310kqv enumC1335310kqv : enumC1335310kqvArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC1335310kqv.LL), enumC1335310kqv);
        }
        MAP = linkedHashMap;
    }

    public static EnumC1335310kqv valueOf(String str) {
        return (EnumC1335310kqv) C08FF.LIZ(EnumC1335310kqv.class, str);
    }

    public final int getValue() {
        return this.LL;
    }

    EnumC1335310kqv(int i) {
        this.LL = i;
    }
}
