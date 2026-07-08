package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0R1F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R1F {
    public static Keva LIZ;
    public static boolean LIZIZ;

    public static Keva LIZ() {
        Keva keva = LIZ;
        if (keva != null || LIZIZ) {
            return keva;
        }
        synchronized ("repo_client_ai_kv") {
            try {
                if (LIZ == null) {
                    LIZ = KevaImpl.getRepoSync("repo_client_ai_kv", 0);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZIZ = true;
        return LIZ;
    }

    public static String LIZIZ(String str) {
        String string;
        Keva kevaLIZ = LIZ();
        if (kevaLIZ == null || (string = kevaLIZ.getString(str, "")) == null) {
            return "";
        }
        return string;
    }

    public static void LIZJ(String str) {
        Keva kevaLIZ = LIZ();
        if (kevaLIZ != null) {
            kevaLIZ.erase(str);
        }
    }

    public static void LIZLLL(String str, String str2) {
        Keva kevaLIZ = LIZ();
        if (kevaLIZ != null) {
            kevaLIZ.storeString(str, str2);
        }
    }
}
