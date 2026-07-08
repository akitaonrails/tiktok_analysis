package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0wmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794030wmn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C1794480wnW c1794480wnW, String str) {
        Object obj;
        HashMap<String, ?> map;
        if (str == null || str.length() <= 0) {
            str = c1794480wnW.LIZ.LJIIIZ;
            if (str.length() <= 0) {
                C1792170wjn c1792170wjn = c1794480wnW.LIZ;
                if (c1792170wjn != null && (map = c1792170wjn.LJI) != null) {
                    obj = map.get("productId");
                } else {
                    obj = null;
                }
                if (!(obj instanceof String)) {
                    return null;
                }
                return (String) obj;
            }
        }
        return str;
    }
}
