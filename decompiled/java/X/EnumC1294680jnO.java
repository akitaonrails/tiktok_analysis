package X;

/* JADX INFO: renamed from: X.0jnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1294680jnO {
    STAR(1),
    POLYGON(2);

    public final int LL;

    public static EnumC1294680jnO forValue(int i) {
        for (EnumC1294680jnO enumC1294680jnO : values()) {
            if (enumC1294680jnO.LL == i) {
                return enumC1294680jnO;
            }
        }
        return null;
    }

    public static EnumC1294680jnO valueOf(String str) {
        return (EnumC1294680jnO) C08FF.LIZ(EnumC1294680jnO.class, str);
    }

    EnumC1294680jnO(int i) {
        this.LL = i;
    }
}
