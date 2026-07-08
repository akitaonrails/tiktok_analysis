package X;

/* JADX INFO: renamed from: X.0xod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833610xod {
    public static boolean LIZ;

    public static boolean LIZ() {
        Boolean boolLIZ = InterfaceC1833600xoc.ua.LIZ();
        if (boolLIZ != null) {
            return boolLIZ.booleanValue();
        }
        return false;
    }

    public static int LIZIZ() {
        Integer numLIZ = InterfaceC1833600xoc.ta.LIZ();
        if (numLIZ != null) {
            return numLIZ.intValue();
        }
        return 0;
    }

    public static boolean LIZJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lLIZ = InterfaceC1833600xoc.va.LIZ();
        return jCurrentTimeMillis - (lLIZ != null ? lLIZ.longValue() : 0L) < 604800000;
    }

    public static boolean LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long lLIZ = InterfaceC1833600xoc.oa.LIZ();
        if (jCurrentTimeMillis - (lLIZ != null ? lLIZ.longValue() : 0L) < 604800000) {
            return true;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Long lLIZ2 = InterfaceC1833600xoc.qa.LIZ();
        return jCurrentTimeMillis2 - (lLIZ2 != null ? lLIZ2.longValue() : 0L) < 604800000;
    }
}
