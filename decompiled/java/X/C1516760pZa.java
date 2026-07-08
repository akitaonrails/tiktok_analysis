package X;

import java.net.ProtocolException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0pZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516760pZa {
    public final InterfaceC1516890pZn LIZ;

    public C1516760pZa(InterfaceC1516890pZn interfaceC1516890pZn) {
        this.LIZ = interfaceC1516890pZn;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap LIZ(X.C1516850pZj r20, X.C1516720pZW r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516760pZa.LIZ(X.0pZj, X.0pZW):java.util.HashMap");
    }

    public final Object LIZIZ(C1516820pZg c1516820pZg, C1516720pZW c1516720pZW) throws ProtocolException {
        int i = c1516820pZg.LIZJ;
        if (i != 20) {
            switch (i) {
                case 0:
                    return Boolean.valueOf(C1516730pZX.LIZ(c1516720pZW));
                case 1:
                    return C1516730pZX.LIZIZ(c1516720pZW);
                case 2:
                    return Double.valueOf(C1516730pZX.LIZJ(c1516720pZW));
                case 3:
                    return Float.valueOf(C1516730pZX.LIZLLL(c1516720pZW));
                case 4:
                case 7:
                    return Integer.valueOf(c1516720pZW.LJIIJJI());
                case 5:
                case 8:
                    return Long.valueOf(c1516720pZW.LJIIL());
                case 6:
                    long jLIZIZ = c1516720pZW.LIZIZ();
                    return new String(c1516720pZW.LIZ, (int) (c1516720pZW.LIZJ - jLIZIZ), (int) jLIZIZ, StandardCharsets.UTF_8);
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unsupported field type [");
                    sbLIZ.append(c1516820pZg.LIZJ);
                    sbLIZ.append("] for field '");
                    sbLIZ.append(c1516820pZg.LIZ);
                    sbLIZ.append('\'');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
            }
        }
        C1516850pZj c1516850pZj = c1516820pZg.LJI;
        if (c1516850pZj == null) {
            String str = c1516820pZg.LJ;
            if (str != null) {
                c1516850pZj = this.LIZ.get(str);
                if (c1516850pZj == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("message with fqName [");
                    sbLIZ2.append(str);
                    sbLIZ2.append("] not found for field [");
                    sbLIZ2.append(c1516820pZg.LIZ);
                    sbLIZ2.append(']');
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
                }
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("field [");
                sbLIZ3.append(c1516820pZg.LIZ);
                sbLIZ3.append("] points to fqName but 'fqName' is null in definition");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                strLIZIZ3.toString();
                throw new IllegalStateException(strLIZIZ3);
            }
        }
        return LIZ(c1516850pZj, c1516720pZW);
    }
}
