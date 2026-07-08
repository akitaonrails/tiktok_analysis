package X;

import java.io.IOException;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495990p25 {
    public static final ByteString LIZ = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] LIZIZ = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] LIZJ = new String[64];
    public static final String[] LIZLLL = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = LIZLLL;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = c.LJIIJJI("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = LIZJ;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strArr2[1]);
        sbLIZ.append("|PADDED");
        strArr2[9] = C2188811AlT.LIZIZ(sbLIZ);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i3 = 0;
        do {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = LIZJ;
            int i6 = i5 | i4;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strArr3[i5]);
            sbLIZ2.append('|');
            sbLIZ2.append(strArr3[i4]);
            strArr3[i6] = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strArr3[i5]);
            sbLIZ3.append('|');
            sbLIZ3.append(strArr3[i4]);
            sbLIZ3.append("|PADDED");
            strArr3[i6 | 8] = C2188811AlT.LIZIZ(sbLIZ3);
            i3++;
        } while (i3 < 3);
        while (true) {
            String[] strArr4 = LIZJ;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = LIZLLL[i];
            }
            i++;
        }
    }

    public static void LIZIZ(String str, Object... objArr) throws IOException {
        throw new IOException(c.LJIIJJI(str, objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(boolean r10, int r11, int r12, byte r13, byte r14) {
        /*
            java.lang.String[] r1 = X.C1495990p25.LIZIZ
            int r0 = r1.length
            r9 = 0
            r3 = 1
            if (r13 >= r0) goto L7c
            r8 = r1[r13]
        L9:
            r6 = 5
            r5 = 3
            r4 = 2
            r2 = 4
            if (r14 != 0) goto L33
            java.lang.String r7 = ""
        L11:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            if (r10 == 0) goto L30
            java.lang.String r0 = "<<"
        L17:
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1[r4] = r0
            r1[r5] = r8
            r1[r2] = r7
            java.lang.String r0 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r0 = xlp.c.LJIIJJI(r0, r1)
            return r0
        L30:
            java.lang.String r0 = ">>"
            goto L17
        L33:
            if (r13 == r4) goto L77
            if (r13 == r5) goto L77
            if (r13 == r2) goto L6d
            r0 = 6
            if (r13 == r0) goto L6d
            r0 = 7
            if (r13 == r0) goto L77
            r0 = 8
            if (r13 == r0) goto L77
            java.lang.String[] r1 = X.C1495990p25.LIZJ
            int r0 = r1.length
            if (r14 >= r0) goto L59
            r7 = r1[r14]
        L4a:
            if (r13 != r6) goto L5e
            r0 = r14 & 4
            if (r0 == 0) goto L11
            java.lang.String r1 = "HEADERS"
            java.lang.String r0 = "PUSH_PROMISE"
            java.lang.String r7 = r7.replace(r1, r0)
            goto L11
        L59:
            java.lang.String[] r0 = X.C1495990p25.LIZLLL
            r7 = r0[r14]
            goto L4a
        L5e:
            if (r13 != 0) goto L11
            r0 = r14 & 32
            if (r0 == 0) goto L11
            java.lang.String r1 = "PRIORITY"
            java.lang.String r0 = "COMPRESSED"
            java.lang.String r7 = r7.replace(r1, r0)
            goto L11
        L6d:
            if (r14 != r3) goto L72
            java.lang.String r7 = "ACK"
            goto L11
        L72:
            java.lang.String[] r0 = X.C1495990p25.LIZLLL
            r7 = r0[r14]
            goto L11
        L77:
            java.lang.String[] r0 = X.C1495990p25.LIZLLL
            r7 = r0[r14]
            goto L11
        L7c:
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Byte r0 = java.lang.Byte.valueOf(r13)
            r1[r9] = r0
            java.lang.String r0 = "0x%02x"
            java.lang.String r8 = xlp.c.LJIIJJI(r0, r1)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495990p25.LIZ(boolean, int, int, byte, byte):java.lang.String");
    }
}
