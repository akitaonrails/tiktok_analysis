package X;

import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309170kAl {
    public static int LIZ = -1;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static int LJI;
    public static int LJII;
    public static String LJIIIIZZ;

    public static String LIZ() {
        HashMap map = new HashMap();
        map.put("app_id", Integer.valueOf(LIZ));
        map.put("app_name", LIZIZ);
        map.put("screen_width", Integer.valueOf(LJI));
        map.put("screen_height", Integer.valueOf(LJII));
        String str = LJ;
        if (str != null && !str.isEmpty()) {
            map.put("did", LJ);
        }
        String str2 = LIZLLL;
        if (str2 != null && !str2.isEmpty()) {
            map.put("app_version", LIZLLL);
        }
        return C786410Ut5.J3(new JSONObject(map));
    }
}
