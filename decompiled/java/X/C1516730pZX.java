package X;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: X.0pZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516730pZX {
    public static boolean LIZ(C1516720pZW c1516720pZW) throws IOException {
        int iLJIIJJI = c1516720pZW.LJIIJJI();
        if (iLJIIJJI == 0) {
            return false;
        }
        if (iLJIIJJI == 1) {
            return true;
        }
        throw new IOException(C786410Ut5.j4("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(iLJIIJJI)}));
    }

    public static byte[] LIZIZ(C1516720pZW c1516720pZW) throws ProtocolException, EOFException {
        long jLIZIZ = c1516720pZW.LIZIZ();
        int i = (int) (c1516720pZW.LIZJ - jLIZIZ);
        int i2 = (int) jLIZIZ;
        if (i >= 0 && i + i2 <= c1516720pZW.LIZIZ) {
            byte[] bArr = new byte[i2];
            System.arraycopy(c1516720pZW.LIZ, i, bArr, 0, i2);
            return bArr;
        }
        throw new EOFException();
    }

    public static double LIZJ(C1516720pZW c1516720pZW) throws IOException {
        int i = c1516720pZW.LJFF;
        if (i != 1 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
            sbLIZ.append(c1516720pZW.LJFF);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        long jLJFF = c1516720pZW.LJFF();
        c1516720pZW.LIZ(1);
        return Double.longBitsToDouble(jLJFF);
    }

    public static float LIZLLL(C1516720pZW c1516720pZW) throws IOException {
        int i = c1516720pZW.LJFF;
        if (i != 5 && i != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
            sbLIZ.append(c1516720pZW.LJFF);
            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
        }
        int iLJ = c1516720pZW.LJ();
        c1516720pZW.LIZ(5);
        return Float.intBitsToFloat(iLJ);
    }

    public static void LJ(C1516720pZW c1516720pZW) throws IOException {
        int i = c1516720pZW.LJIIIIZZ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        int i2 = c1516720pZW.LJFF;
                        if (i2 != 5 && i2 != 2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Expected FIXED32 or LENGTH_DELIMITED but was ");
                            sbLIZ.append(c1516720pZW.LJFF);
                            throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        c1516720pZW.LJIIIZ(4);
                        c1516720pZW.LIZ(5);
                        return;
                    }
                    throw new IllegalStateException("Unexpected field encoding found!");
                }
                c1516720pZW.LIZIZ();
                return;
            }
            int i3 = c1516720pZW.LJFF;
            if (i3 != 1 && i3 != 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Expected FIXED64 or LENGTH_DELIMITED but was ");
                sbLIZ2.append(c1516720pZW.LJFF);
                throw new ProtocolException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            c1516720pZW.LJIIIZ(8);
            c1516720pZW.LIZ(1);
            return;
        }
        c1516720pZW.LJIIL();
    }
}
