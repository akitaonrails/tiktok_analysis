package X;

/* JADX INFO: renamed from: X.0uJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698940uJQ {
    public static final EnumC1699220uJs LIZ = EnumC1699220uJs.VeLivePlayerLogLevelInfo;

    public static void LIZ() {
        EnumC1699220uJs.VeLivePlayerLogLevelDebug.compareTo(LIZ);
    }

    public static void LIZIZ() {
        EnumC1699220uJs.VeLivePlayerLogLevelError.compareTo(LIZ);
    }

    public static void LIZJ() {
        EnumC1699220uJs.VeLivePlayerLogLevelInfo.compareTo(LIZ);
    }

    public static void LJ() {
        EnumC1699220uJs.VeLivePlayerLogLevelWarn.compareTo(LIZ);
    }

    public static void LIZLLL(String str, String str2) {
        int i;
        int i2;
        if (EnumC1699220uJs.VeLivePlayerLogLevelInfo.compareTo(LIZ) >= 0 && str.length() != 0 && str2 != null && str2.length() != 0) {
            int length = str2.length();
            if (length <= 3072) {
                LIZJ();
                return;
            }
            int i3 = 0;
            do {
                i = i3 + 3072;
                if (i <= length) {
                    i2 = i;
                } else {
                    i2 = length;
                }
                str2.substring(i3, i2);
                LIZJ();
                i3 = i;
            } while (i < length);
        }
    }
}
