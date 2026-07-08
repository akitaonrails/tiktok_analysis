package X;

/* JADX INFO: renamed from: X.0jkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1292820jkO {
    Merge,
    Add,
    Subtract,
    Intersect,
    ExcludeIntersections;

    public static EnumC1292820jkO forId(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return Merge;
                        }
                        return ExcludeIntersections;
                    }
                    return Intersect;
                }
                return Subtract;
            }
            return Add;
        }
        return Merge;
    }

    public static EnumC1292820jkO valueOf(String str) {
        return (EnumC1292820jkO) C08FF.LIZ(EnumC1292820jkO.class, str);
    }
}
