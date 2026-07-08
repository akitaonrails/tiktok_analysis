package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510130pOt {
    public static final /* synthetic */ int LIZJ = 0;
    public HashMap<String, Object> LIZ;
    public Object LIZIZ;

    static {
        new Object() { // from class: X.0pOu
        };
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size:");
        HashMap<String, Object> map = this.LIZ;
        sbLIZ.append(map != null ? map.size() : 0);
        sbLIZ.append(" params:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" extObj:");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Object LIZ(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        HashMap<String, Object> map = this.LIZ;
        if (map != null && (obj3 = map.get(str)) != null) {
            return obj3;
        }
        Object obj4 = this.LIZIZ;
        if (obj4 instanceof JSONObject) {
            Object objOpt = ((JSONObject) obj4).opt(str);
            if (objOpt != null) {
                return objOpt;
            }
        } else if (obj4 instanceof Bundle) {
            try {
                obj2 = ((BaseBundle) obj4).get(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                obj2 = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                obj2 = null;
            }
            if (obj2 != null) {
                return obj2;
            }
        } else if ((obj4 instanceof Map) && (obj = ((Map) obj4).get(str)) != null) {
            return obj;
        }
        return null;
    }

    public final int LIZIZ(String str) {
        Number numberLIZJ = LIZJ(str);
        if (numberLIZJ != null) {
            return numberLIZJ.intValue();
        }
        return 0;
    }

    public final Number LIZJ(String str) {
        return C1923007g4.LIZIZ(LIZ(str));
    }

    public final String LIZLLL(String str) {
        Object objLIZ = LIZ(str);
        if (objLIZ != null) {
            return objLIZ.toString();
        }
        return null;
    }

    public final void LJ(Object obj, String str) {
        HashMap<String, Object> map = this.LIZ;
        if (map == null) {
            map = new HashMap<>();
            this.LIZ = map;
        }
        map.put(str, obj);
    }
}
