package X;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293910jm9 {
    public InputStream LIZ;

    public final int LIZJ() throws IOException {
        byte[] bArr = new byte[4];
        LIZIZ(bArr);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public final C589090N8p LIZLLL() throws IOException {
        Intrinsics.LJFF(LJ(4), "TPKG");
        LIZJ();
        LIZIZ(new byte[LIZJ()]);
        int iLIZJ = LIZJ();
        C589090N8p c589090N8p = new C589090N8p();
        for (int i = 0; i < iLIZJ; i++) {
            String strLJ = LJ(LIZJ());
            C1293920jmA c1293920jmA = new C1293920jmA(strLJ, LIZJ(), LIZJ());
            c589090N8p.LIZ.put(strLJ, c1293920jmA);
            c589090N8p.LIZIZ.add(c1293920jmA);
        }
        return c589090N8p;
    }

    public final void LIZIZ(byte[] bArr) throws IOException {
        int i;
        int length = bArr.length;
        int length2 = bArr.length;
        int i2 = 0;
        do {
            InputStream inputStream = this.LIZ;
            if (inputStream != null && (i = inputStream.read(bArr, i2, length2)) > 0) {
                i2 += i;
                length2 = length - i2;
            } else {
                if (length2 <= 0) {
                    return;
                }
                throw new IOException("B.txt readFully size:" + bArr.length + " but only read:" + i2);
            }
        } while (length2 > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(int r7) throws java.io.IOException {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicReference<byte[]> r1 = X.C1285510jYb.LIZ
            r0 = 0
            java.lang.Object r5 = r1.getAndSet(r0)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto Le
            int r0 = r5.length
            if (r0 >= r7) goto L10
        Le:
            byte[] r5 = new byte[r7]
        L10:
            r4 = 0
            r1 = r7
            r3 = 0
        L13:
            java.io.InputStream r0 = r6.LIZ
            if (r0 == 0) goto L34
            int r0 = r0.read(r5, r3, r1)
            if (r0 <= 0) goto L34
            int r3 = r3 + r0
            int r1 = r7 - r3
            if (r1 > 0) goto L13
        L22:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5, r4, r7, r0)
            int r1 = r5.length
            r0 = 8192(0x2000, float:1.148E-41)
            if (r1 > r0) goto L33
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = X.C1285510jYb.LIZ
            r0.set(r5)
        L33:
            return r2
        L34:
            if (r1 <= 0) goto L22
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "B.txt readBytes size:"
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " but only read:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1293910jm9.LJ(int):java.lang.String");
    }

    public final void LIZ(C589090N8p c589090N8p, String str) throws IOException {
        int i;
        for (C1293920jmA c1293920jmA : c589090N8p.LIZIZ) {
            int i2 = c1293920jmA.LIZJ;
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i2 - i3;
                InputStream inputStream = this.LIZ;
                if (inputStream != null) {
                    i = inputStream.read(bArr, i3, i4);
                } else {
                    i = -1;
                }
                i3 += i;
            }
            C0VSJ c0vsj = new C0VSJ(str, c1293920jmA.LIZ);
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C0VSV c0vsv = new C0VSV(c0vsj);
            c0vsv.write(bArr);
            c0vsv.flush();
            c0vsv.close();
        }
    }
}
