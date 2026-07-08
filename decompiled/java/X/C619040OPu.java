package X;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0OPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619040OPu {
    public static final ConcurrentHashMap<String, TypeToken<?>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final Gson LIZJ = new Gson();
    public static final C619050OPv LIZLLL = new TypeToken<Map<String, ? extends Object>>() { // from class: X.0OPv
    };

    public static final String LIZ(String str) {
        String str2 = LIZIZ.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public static final void LIZIZ(String str, TypeToken typeToken) {
        LIZ.put(str, typeToken);
    }
}
