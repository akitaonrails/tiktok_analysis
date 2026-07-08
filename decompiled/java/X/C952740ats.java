package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0ats, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952740ats {
    public static final C01GW<C952740ats> LIZIZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(5));
    public final Map<String, C961030b7F> LIZ = new LinkedHashMap();

    public final C961030b7F LIZIZ(String str) {
        String strLIZ = LIZ("biz_invite_list", str);
        C961030b7F c961030b7F = (C961030b7F) ((LinkedHashMap) this.LIZ).get(strLIZ);
        if (c961030b7F == null) {
            return null;
        }
        if (c961030b7F.LIZJ > 0 && System.currentTimeMillis() - c961030b7F.LIZLLL > c961030b7F.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("peek cache data, biz = ");
            sbLIZ.append("biz_invite_list");
            sbLIZ.append(", section = ");
            sbLIZ.append(str);
            sbLIZ.append(", entry = ");
            sbLIZ.append(c961030b7F);
            sbLIZ.append(", is expired");
            C20441214yg.LJIIIZ("CoHostSectionCacheManager", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.remove(strLIZ);
            return null;
        }
        return c961030b7F;
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('/');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
