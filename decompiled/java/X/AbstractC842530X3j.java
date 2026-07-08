package X;

import java.nio.charset.Charset;
import xlp.c;

/* JADX INFO: renamed from: X.0X3j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC842530X3j {
    public long LIZ() {
        return -1L;
    }

    public abstract C0X0P LIZIZ();

    public abstract void LJ(InterfaceC1496780p3M interfaceC1496780p3M);

    public static C842540X3k LIZJ(C0X0P c0x0p, String str) {
        Charset charset = c.LJIIIIZZ;
        if (c0x0p != null) {
            Charset charsetLIZ = c0x0p.LIZ(null);
            if (charsetLIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0x0p);
                sbLIZ.append("; charset=utf-8");
                c0x0p = C0X0P.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                charset = charsetLIZ;
            }
        }
        return LIZLLL(c0x0p, str.getBytes(charset));
    }

    public static C842540X3k LIZLLL(C0X0P c0x0p, byte[] bArr) {
        int length = bArr.length;
        long length2 = bArr.length;
        long j = 0;
        long j2 = length;
        byte[] bArr2 = c.LIZ;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new C842540X3k(length, c0x0p, bArr);
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
