package X;

/* JADX INFO: renamed from: X.0o5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1459870o5p {
    public static final C0E12 LIZ = C354720DvS.LIZ("auto_enhance_keva");

    public static Boolean LIZ() {
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_hdr_strategy", true) == 1) {
            C0E12 c0e12 = LIZ;
            c0e12.getClass();
            if (c0e12.LIZ.contains("key_enhance_status")) {
                return Boolean.valueOf(c0e12.LIZ("key_enhance_status", false));
            }
            c0e12.LIZIZ("key_enhance_status", true);
            return null;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "tool_hdr_strategy", true) != 2) {
            return Boolean.FALSE;
        }
        C0E12 c0e122 = LIZ;
        c0e122.getClass();
        if (c0e122.LIZ.contains("key_enhance_status")) {
            return Boolean.FALSE;
        }
        c0e122.LIZIZ("key_enhance_status", false);
        return null;
    }
}
