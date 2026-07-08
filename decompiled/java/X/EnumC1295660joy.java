package X;

/* JADX INFO: renamed from: X.0joy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1295660joy {
    MERGE,
    ADD,
    SUBTRACT,
    INTERSECT,
    EXCLUDE_INTERSECTIONS;

    public static EnumC1295660joy forId(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return MERGE;
                        }
                        return EXCLUDE_INTERSECTIONS;
                    }
                    return INTERSECT;
                }
                return SUBTRACT;
            }
            return ADD;
        }
        return MERGE;
    }

    public static EnumC1295660joy valueOf(String str) {
        return (EnumC1295660joy) C08FF.LIZ(EnumC1295660joy.class, str);
    }
}
