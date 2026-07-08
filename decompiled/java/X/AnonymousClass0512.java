package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0512, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0512 {
    public static final ConcurrentHashMap<String, Keva> LIZ = new ConcurrentHashMap<>();

    public static Keva LIZJ() {
        Keva repo;
        ConcurrentHashMap<String, Keva> concurrentHashMap = LIZ;
        Keva keva = concurrentHashMap.get("tt_live_sdk");
        if (keva != null) {
            return keva;
        }
        synchronized (concurrentHashMap) {
            try {
                repo = concurrentHashMap.get("tt_live_sdk");
                if (repo == null) {
                    repo = KevaImpl.getRepo("tt_live_sdk", 0);
                    concurrentHashMap.put("tt_live_sdk", repo);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return repo;
    }

    public static final Object LIZ(String str) {
        Keva kevaLIZJ = LIZJ();
        if ("" instanceof Boolean) {
            return Boolean.valueOf(kevaLIZJ.getBoolean(str, ((Boolean) "").booleanValue()));
        }
        if ("" instanceof Integer) {
            return Integer.valueOf(kevaLIZJ.getInt(str, ((Number) "").intValue()));
        }
        if ("" instanceof Long) {
            return Long.valueOf(kevaLIZJ.getLong(str, ((Number) "").longValue()));
        }
        if ("" instanceof Float) {
            return Float.valueOf(kevaLIZJ.getFloat(str, ((Number) "").floatValue()));
        }
        if ("" instanceof Double) {
            return Double.valueOf(kevaLIZJ.getDouble(str, ((Number) "").doubleValue()));
        }
        String string = kevaLIZJ.getString(str, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    public static final void LIZIZ(Object obj, String str) {
        Keva kevaLIZJ = LIZJ();
        if (obj instanceof Boolean) {
            kevaLIZJ.storeBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            kevaLIZJ.storeInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            kevaLIZJ.storeLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            kevaLIZJ.storeFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            kevaLIZJ.storeDouble(str, ((Number) obj).doubleValue());
        } else {
            if (obj instanceof String) {
                kevaLIZJ.storeString(str, (String) obj);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported preference type: ");
            sbLIZ.append(obj.getClass().getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
