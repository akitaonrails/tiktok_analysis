package X;

/* JADX INFO: renamed from: X.0WSD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WSD {
    public static final boolean LIZ(C0WSC c0wsc, String str) {
        if (c0wsc == null) {
            return false;
        }
        C0WS7 c0ws7 = new C0WS7(str, c0wsc.getLevel() + 1, c0wsc.LIZLLL());
        boolean zLIZIZ = LIZIZ(c0wsc, c0ws7);
        if (zLIZIZ) {
            c0wsc.LIZ(c0ws7);
        }
        return zLIZIZ;
    }

    public static final boolean LIZIZ(C0WSC c0wsc, C0WSC c0wsc2) {
        C0WSF c0wsfLJII;
        if (c0wsc == null || (c0wsfLJII = c0wsc.LJII()) == null) {
            return false;
        }
        int i = C0WSE.LIZ[c0wsfLJII.ordinal()];
        String name = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return false;
                }
                throw new C1954807lC();
            }
            if (c0wsc2 != null) {
                c0wsc2.LJ(C0WSF.EXCEEDED);
            }
            c0wsc.LJ(C0WSF.EXCEEDED);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c0wsc2 != null) {
                name = c0wsc2.getName();
            }
            sbLIZ.append(name);
            sbLIZ.append(" is over threshold but not dropped");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (c0wsc2 != null) {
            c0wsc2.LJ(C0WSF.DROPPED);
        }
        c0wsc.LJ(C0WSF.DROPPED);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (c0wsc2 != null) {
            name = c0wsc2.getName();
        }
        sbLIZ2.append(name);
        sbLIZ2.append(" is over threshold and will be dropped");
        C2188811AlT.LIZIZ(sbLIZ2);
        return true;
    }
}
