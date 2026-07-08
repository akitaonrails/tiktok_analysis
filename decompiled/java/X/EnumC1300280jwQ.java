package X;

/* JADX INFO: renamed from: X.0jwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1300280jwQ {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);

    public final int LL;

    public int intValue() {
        return this.LL;
    }

    public static EnumC1300280jwQ fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return AT_MOST;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown enum value: ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }

    public static EnumC1300280jwQ valueOf(String str) {
        return (EnumC1300280jwQ) C08FF.LIZ(EnumC1300280jwQ.class, str);
    }

    EnumC1300280jwQ(int i) {
        this.LL = i;
    }
}
