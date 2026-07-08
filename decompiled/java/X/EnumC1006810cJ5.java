package X;

/* JADX INFO: renamed from: X.0cJ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1006810cJ5 {
    Critical,
    High,
    Medium,
    Low,
    Unknown;

    public static EnumC1006810cJ5 valueOf(String str) {
        return (EnumC1006810cJ5) C08FF.LIZ(EnumC1006810cJ5.class, str);
    }

    public final int getScore() {
        int i = C1006800cJ4.LIZ[ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3 || i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new C1954807lC();
    }
}
