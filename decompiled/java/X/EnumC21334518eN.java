package X;

/* JADX INFO: renamed from: X.18eN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC21334518eN {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static EnumC21334518eN fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return AUTO;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unknown enum value: ");
                    sbLIZ.append(i);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                return PERCENT;
            }
            return POINT;
        }
        return UNDEFINED;
    }

    EnumC21334518eN(int i) {
        this.LL = i;
    }
}
