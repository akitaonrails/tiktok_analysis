package X;

import java.util.logging.Logger;

/* JADX INFO: renamed from: X.136O, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C136O {
    public static final Logger LIZIZ = Logger.getLogger(C136O.class.getName());
    public final String LIZ;

    public C136O(C136P c136p) {
        String str = c136p.LIZLLL;
        C19864312np.LJI(str, "root URL cannot be null.");
        if (!str.endsWith("/")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LIZ(c136p.LJ);
        if (C199499133x.LIZ(c136p.LJFF)) {
            LIZIZ.warning("Application name is not set. Call Builder#setApplicationName.");
        }
        this.LIZ = c136p.LJFF;
        if (c136p.LIZIZ == null) {
            c136p.LIZ.getClass();
        } else {
            c136p.LIZ.getClass();
        }
    }

    public static String LIZ(String str) {
        C19864312np.LJI(str, "service path cannot be null");
        if (str.length() == 1) {
            C19864312np.LIZLLL("service path must equal \"/\" if it is of length 1.", "/".equals(str));
            return "";
        }
        if (str.length() <= 0) {
            return str;
        }
        if (!str.endsWith("/")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!str.startsWith("/")) {
            return str;
        }
        return str.substring(1);
    }
}
