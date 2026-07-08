package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678560QjW {
    public static final <K, V> JSONObject LIZLLL(Map<K, ? extends V> map) {
        try {
            if (map == null) {
                return new JSONObject();
            }
            return new JSONObject(map);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public static final k LJ(Object obj) {
        try {
            return C7740030o.LIZ().getGson().LJIJJLI(obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final n LIZ(n nVar, String str) {
        try {
            return nVar.LJJIJ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static Long LIZIZ(n nVar, String str) {
        q qVarLJJIJIIJI;
        Long lValueOf;
        try {
            qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            qVarLJJIJIIJI = null;
        }
        if (qVarLJJIJIIJI != null) {
            try {
                lValueOf = Long.valueOf(qVarLJJIJIIJI.LJIIZILJ());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf;
            }
        }
        return null;
    }

    public static String LIZJ(n nVar, String str) {
        q qVarLJJIJIIJI;
        String strLJIL;
        try {
            qVarLJJIJIIJI = nVar.LJJIJIIJI(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            qVarLJJIJIIJI = null;
        }
        if (qVarLJJIJIIJI != null) {
            try {
                strLJIL = qVarLJJIJIIJI.LJIL();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                strLJIL = null;
            }
            if (strLJIL != null) {
                return strLJIL;
            }
        }
        return null;
    }
}
