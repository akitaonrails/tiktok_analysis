package X;

/* JADX INFO: renamed from: X.0jI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1275250jI3 {
    UNKNOWN(0),
    AGORA(1),
    ZEGO(2),
    BYTE(4);

    public final int LL;

    public String getName() {
        int i = C1275240jI2.LIZ[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "byte" : "zego" : "agora";
    }

    public int getValue() {
        return this.LL;
    }

    public static EnumC1275250jI3 fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return UNKNOWN;
                }
                return BYTE;
            }
            return ZEGO;
        }
        return AGORA;
    }

    public static EnumC1275250jI3 valueOf(String str) {
        return (EnumC1275250jI3) C08FF.LIZ(EnumC1275250jI3.class, str);
    }

    EnumC1275250jI3(int i) {
        this.LL = i;
    }
}
