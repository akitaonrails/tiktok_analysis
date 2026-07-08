package X;

/* JADX INFO: renamed from: X.0jIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1275440jIM {
    kCamera,
    kEffect,
    kRemote;

    public int toValue() {
        int i = C1275420jIK.LIZIZ[ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return i != 3 ? -1 : 4;
            }
        }
        return i2;
    }

    public static EnumC1275440jIM valueOf(String str) {
        return (EnumC1275440jIM) C08FF.LIZ(EnumC1275440jIM.class, str);
    }
}
