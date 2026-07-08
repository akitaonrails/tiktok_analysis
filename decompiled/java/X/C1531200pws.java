package X;

import com.bytedance.keva.Keva;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531200pws {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("no-store", "no-cache", "max-age=0", "max-age=0", "must-revalidate", "proxy-revalidate");
    public static final Keva LIZIZ = C1534880q2o.LIZ;

    public static void LIZ(String str) {
        LIZIZ.erase(str);
    }

    public static void LIZIZ(String str) {
        LIZ(str);
        C1531820pxs.LJIIL.getClass();
        LIZ(C1531840pxu.LJFF(str));
        LIZ(C1531840pxu.LJ(str));
        LIZ(C1531840pxu.LJI(str));
    }

    public static Pair LIZJ(Map map) {
        String str;
        C0X0P c0x0pLIZJ;
        String string;
        if (map == null || (str = (String) map.get("content-type")) == null || (c0x0pLIZJ = C0X0P.LIZJ(str)) == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0x0pLIZJ.LIZIZ);
        sbLIZ.append('/');
        sbLIZ.append(c0x0pLIZJ.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Charset charsetLIZ = c0x0pLIZJ.LIZ(null);
        if (charsetLIZ == null || (string = charsetLIZ.toString()) == null) {
            string = "utf-8";
        }
        return new Pair(strLIZIZ, string);
    }
}
