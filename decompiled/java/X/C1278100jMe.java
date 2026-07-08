package X;

/* JADX INFO: renamed from: X.0jMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278100jMe {
    public static String LIZ(EnumC1278030jMX enumC1278030jMX, boolean z) {
        if (enumC1278030jMX != null) {
            int i = C1278090jMd.LIZ[enumC1278030jMX.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (z) {
                        return "hardH264";
                    }
                    return "bytevc0";
                }
            } else {
                if (z) {
                    return "hardBytevc1";
                }
                return "bytevc1";
            }
        }
        if (z) {
            return "hardH264";
        }
        return "bytevc0";
    }
}
