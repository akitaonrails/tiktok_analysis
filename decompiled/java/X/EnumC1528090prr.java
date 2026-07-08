package X;

/* JADX INFO: renamed from: X.0prr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1528090prr {
    Half(0),
    Full(1);

    public final int LL;

    public static EnumC1528090prr fromStep(int i) {
        for (EnumC1528090prr enumC1528090prr : values()) {
            if (enumC1528090prr.LL == i) {
                return enumC1528090prr;
            }
        }
        throw new IllegalArgumentException();
    }

    public static EnumC1528090prr valueOf(String str) {
        return (EnumC1528090prr) C08FF.LIZ(EnumC1528090prr.class, str);
    }

    EnumC1528090prr(int i) {
        this.LL = i;
    }
}
