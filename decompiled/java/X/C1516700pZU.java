package X;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: X.0pZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516700pZU {
    public static boolean LIZ(C1516680pZS c1516680pZS) throws IOException {
        int iLJIIJ = c1516680pZS.LJIIJ();
        if (iLJIIJ == 0) {
            return false;
        }
        if (iLJIIJ == 1) {
            return true;
        }
        throw new IOException(C786410Ut5.j4("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(iLJIIJ)}));
    }

    public static int LIZIZ(C1516680pZS c1516680pZS) {
        return c1516680pZS.LJIIJ();
    }

    public static long LIZJ(C1516680pZS c1516680pZS) {
        return c1516680pZS.LJIIJJI();
    }

    public static String LIZLLL(C1516680pZS c1516680pZS) throws ProtocolException {
        return c1516680pZS.LIZ.LJJIIJ(c1516680pZS.LIZIZ());
    }

    public static void LJ(C1516680pZS c1516680pZS) throws IOException {
        int i = c1516680pZS.LJII;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        c1516680pZS.LJIIIIZZ();
                        return;
                    }
                    throw new IllegalStateException("Unexpected field encoding found!");
                }
                c1516680pZS.LJII();
                return;
            }
            c1516680pZS.LJIIIZ();
            return;
        }
        c1516680pZS.LJIIJJI();
    }
}
