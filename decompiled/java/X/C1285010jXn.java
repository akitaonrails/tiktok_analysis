package X;

/* JADX INFO: renamed from: X.0jXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285010jXn {
    public static final String[] LIZ = {"csd-0", "csd-1", "csd-2"};

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(int i, int i2, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals("video/3gpp")) {
                    return -1;
                }
                break;
            case -1662735862:
                if (!str.equals("video/av01")) {
                    return -1;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    return Math.max(2097152, ((i * i2) * 3) / 4);
                }
                return -1;
            case 1187890754:
                if (!str.equals("video/mp4v-es")) {
                    return -1;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    String str2 = C1285020jXo.LIZLLL;
                    if (!"BRAVIA 4K 2015".equals(str2)) {
                        if ("Amazon".equals(C1285020jXo.LIZJ)) {
                            if (!"KFSOWI".equals(str2)) {
                                "AFTS".equals(str2);
                            }
                        }
                        return (((((((i + 16) - 1) / 16) * (((i2 + 16) - 1) / 16)) * 16) * 16) * 3) / 4;
                    }
                    return -1;
                }
                return -1;
            case 1599127256:
                if (!str.equals("video/x-vnd.on2.vp8")) {
                    return -1;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    return ((i * i2) * 3) / 8;
                }
                return -1;
            default:
                return -1;
        }
        return ((i * i2) * 3) / 4;
    }
}
