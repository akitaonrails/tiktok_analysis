package X;

/* JADX INFO: renamed from: X.0jM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1277730jM3 {
    Rotation0(0),
    Rotation90(90),
    Rotation180(180),
    Rotation270(270);

    public static final C1279130jOJ Companion = new Object() { // from class: X.0jOJ
    };
    public final int LL;

    public static EnumC1277730jM3 valueOf(String str) {
        return (EnumC1277730jM3) C08FF.LIZ(EnumC1277730jM3.class, str);
    }

    public final int getDegree() {
        return this.LL;
    }

    public static final EnumC1277730jM3 fromInt(int i) {
        Companion.getClass();
        for (EnumC1277730jM3 enumC1277730jM3 : values()) {
            if (enumC1277730jM3.getDegree() == i) {
                return enumC1277730jM3;
            }
        }
        return Rotation0;
    }

    EnumC1277730jM3(int i) {
        this.LL = i;
    }
}
