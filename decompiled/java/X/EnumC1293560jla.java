package X;

/* JADX INFO: renamed from: X.0jla, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1293560jla {
    Star(1),
    Polygon(2);

    public final int LL;

    public static EnumC1293560jla forValue(int i) {
        for (EnumC1293560jla enumC1293560jla : values()) {
            if (enumC1293560jla.LL == i) {
                return enumC1293560jla;
            }
        }
        return null;
    }

    public static EnumC1293560jla valueOf(String str) {
        return (EnumC1293560jla) C08FF.LIZ(EnumC1293560jla.class, str);
    }

    EnumC1293560jla(int i) {
        this.LL = i;
    }
}
