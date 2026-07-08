package X;

/* JADX INFO: renamed from: X.0osJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1489930osJ {
    DEFAULT(0),
    NORMAL_DELAY(1),
    RUNTIME_DELAY(2),
    PRIORITY(3),
    NOT_REACHED(4);

    public final int LL;

    public int getValue() {
        return this.LL;
    }

    public static EnumC1489930osJ fromValue(int i) {
        for (EnumC1489930osJ enumC1489930osJ : values()) {
            if (enumC1489930osJ.getValue() == i) {
                return enumC1489930osJ;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid value: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static EnumC1489930osJ valueOf(String str) {
        return (EnumC1489930osJ) C08FF.LIZ(EnumC1489930osJ.class, str);
    }

    EnumC1489930osJ(int i) {
        this.LL = i;
    }
}
