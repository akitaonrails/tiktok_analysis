package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0OPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619030OPt {
    public static final Gson LIZ = new Gson();

    public static final String LIZIZ(Object obj) {
        return GsonProtectorUtils.toJson(C619040OPu.LIZJ, obj);
    }

    public static final <T> T LIZ(String str, String str2) {
        boolean z;
        ConcurrentHashMap<String, TypeToken<?>> concurrentHashMap = C619040OPu.LIZ;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                Gson gson = C619040OPu.LIZJ;
                TypeToken<?> typeToken = C619040OPu.LIZ.get(C619040OPu.LIZ(str));
                if (typeToken == null) {
                    typeToken = C619040OPu.LIZLLL;
                }
                return (T) GsonProtectorUtils.fromJson(gson, str2, typeToken.getType());
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
