package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.10ZP, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZP {
    public static final Map<String, Keva> LIZ = new LinkedHashMap();

    public static Keva LIZIZ(String str) {
        Map<String, Keva> map = LIZ;
        Keva keva = (Keva) ((LinkedHashMap) map).get(str);
        if (keva == null) {
            Keva repo = Keva.getRepo(str);
            map.put(str, repo);
            return repo;
        }
        return keva;
    }

    public static String LIZ(String str, String str2) {
        String string;
        Keva kevaLIZIZ = LIZIZ(str);
        if (kevaLIZIZ == null || (string = kevaLIZIZ.getString(str2, "")) == null) {
            return "";
        }
        return string;
    }

    public static void LIZJ(String str, String str2, String str3) {
        Keva kevaLIZIZ = LIZIZ(str);
        if (kevaLIZIZ != null) {
            kevaLIZIZ.storeString(str2, str3);
        }
    }
}
