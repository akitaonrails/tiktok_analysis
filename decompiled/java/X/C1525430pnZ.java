package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1525430pnZ {
    public final LinkedList<C1525440pna> LIZ = new LinkedList<>();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String strLIZIZ;
        String strLIZIZ2;
        int i = this.LIZLLL;
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(",0");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (i == 1) {
            strLIZIZ = Integer.toString(this.LIZIZ + 1);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LIZIZ + 1);
            sbLIZ2.append(",");
            sbLIZ2.append(this.LIZLLL);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        int i2 = this.LJ;
        if (i2 == 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(",0");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        } else if (i2 == 1) {
            strLIZIZ2 = Integer.toString(this.LIZJ + 1);
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LIZJ + 1);
            sbLIZ4.append(",");
            sbLIZ4.append(this.LJ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        StringBuilder sb = new StringBuilder("@@ -");
        sb.append(strLIZIZ);
        sb.append(" +");
        sb.append(strLIZIZ2);
        sb.append(" @@\n");
        for (C1525440pna c1525440pna : this.LIZ) {
            int i3 = C1525470pnd.LIZ[c1525440pna.LIZ.ordinal()];
            if (i3 == 1) {
                sb.append('+');
            } else if (i3 == 2) {
                sb.append('-');
            } else if (i3 == 3) {
                sb.append(' ');
            }
            try {
            } catch (UnsupportedEncodingException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                throw new Error("This system does not support UTF-8.", e);
            }
            try {
                try {
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    throw new Error("This system does not support UTF-8.", e);
                }
                try {
                    sb.append(URLEncoder.encode(c1525440pna.LIZIZ, "UTF-8").replace('+', ' '));
                    try {
                        sb.append("\n");
                    } catch (UnsupportedEncodingException e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                        throw new Error("This system does not support UTF-8.", e);
                    }
                } catch (UnsupportedEncodingException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    throw new Error("This system does not support UTF-8.", e);
                }
            } catch (UnsupportedEncodingException e5) {
                e = e5;
                TryCatchGuardChecker.doCheck(e);
                throw new Error("This system does not support UTF-8.", e);
            }
        }
        return sb.toString().replace("%21", "!").replace("%7E", "~").replace("%27", "'").replace("%28", e3.h).replace("%29", ")").replace("%3B", ";").replace("%2F", "/").replace("%3F", "?").replace("%3A", ":").replace("%40", e3.g).replace("%26", "&").replace("%3D", "=").replace("%2B", "+").replace("%24", e3.c).replace("%2C", ",").replace("%23", "#");
    }
}
