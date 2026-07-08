package X;

import android.net.NetworkCapabilities;

/* JADX INFO: renamed from: X.15nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20625915nN {
    public static final C20625915nN LIZ = new C20625915nN();

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20626115nP LIZIZ(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20625915nN.LIZIZ(android.content.Context):X.15nP");
    }

    public static void LIZ(C20626115nP c20626115nP, NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(4)) {
            c20626115nP.LJIIJJI = true;
            if (networkCapabilities.hasCapability(12)) {
                c20626115nP.LJIIL = true;
            }
        }
        if (networkCapabilities.hasTransport(1)) {
            c20626115nP.LJ = true;
            if (networkCapabilities.hasCapability(12)) {
                c20626115nP.LJFF = true;
                if (networkCapabilities.hasCapability(16)) {
                    c20626115nP.LJI = true;
                }
                if (networkCapabilities.hasCapability(17)) {
                    c20626115nP.LJII = true;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("portal is ");
            sbLIZ.append(networkCapabilities.hasCapability(17));
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (networkCapabilities.hasTransport(0)) {
            c20626115nP.LJIIIIZZ = true;
            if (networkCapabilities.hasCapability(12)) {
                c20626115nP.LJIIIZ = true;
            }
            if (networkCapabilities.hasCapability(16)) {
                c20626115nP.LJIIJ = true;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("internet is ");
        sbLIZ2.append(networkCapabilities.hasCapability(12));
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("validated is ");
        sbLIZ3.append(networkCapabilities.hasCapability(16));
        C2188811AlT.LIZIZ(sbLIZ3);
    }
}
