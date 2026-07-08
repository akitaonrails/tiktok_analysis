package X;

/* JADX INFO: renamed from: X.0j8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1269590j8v {
    UpdateVideoParameters(0),
    EffectEnableSwitch(1),
    SimulcastUpdateLayoutConfig(2);

    public final int LL;

    public int value() {
        return this.LL;
    }

    public static EnumC1269590j8v fromId(int i) {
        for (EnumC1269590j8v enumC1269590j8v : values()) {
            if (enumC1269590j8v.value() == i) {
                return enumC1269590j8v;
            }
        }
        return null;
    }

    public static EnumC1269590j8v valueOf(String str) {
        return (EnumC1269590j8v) C08FF.LIZ(EnumC1269590j8v.class, str);
    }

    EnumC1269590j8v(int i) {
        this.LL = i;
    }
}
