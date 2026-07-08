package X;

/* JADX INFO: renamed from: X.0Wsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837180Wsm {
    public static Boolean LIZIZ(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static byte LIZ(Boolean bool) {
        if (bool != null) {
            if (!bool.booleanValue()) {
                return (byte) 0;
            }
            return (byte) 1;
        }
        return (byte) -1;
    }
}
