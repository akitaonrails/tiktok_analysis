package X;

/* JADX INFO: renamed from: X.0jpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1295970jpT {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public static EnumC1295970jpT valueOf(String str) {
        return (EnumC1295970jpT) C08FF.LIZ(EnumC1295970jpT.class, str);
    }

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = C1296000jpW.LIZ[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if ((!z || i >= 28) && i2 <= 4 && i > 25) {
            return false;
        }
        return true;
    }
}
