package X;

/* JADX INFO: renamed from: X.0mU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public enum EnumC1397990mU1 {
    DESIGNER_CHOOSE(1),
    AUTO_BIND(2),
    TOP_LIKED(3);

    public final int featureVideoSource;

    public static EnumC1397990mU1 getCurrentFeatureVideoSource(int i) {
        if (i != 1) {
            if (i != 3) {
                return AUTO_BIND;
            }
            return TOP_LIKED;
        }
        return DESIGNER_CHOOSE;
    }

    public static EnumC1397990mU1 valueOf(String str) {
        return (EnumC1397990mU1) C08FF.LIZ(EnumC1397990mU1.class, str);
    }

    EnumC1397990mU1(int i) {
        this.featureVideoSource = i;
    }
}
