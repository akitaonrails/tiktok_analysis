package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0hYL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208470hYL {
    public final SharedPreferences LIZ;
    public final HashMap<String, Integer> LIZIZ;

    public C1208470hYL(Context context) {
        Object c098200Yq;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "pns_location_control_cache");
        this.LIZ = sharedPreferencesLIZJ;
        this.LIZIZ = new HashMap<>();
        synchronized (this) {
            try {
                for (Map.Entry<String, ?> entry : sharedPreferencesLIZJ.getAll().entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (u.LJJIIJZLJL(key, "consent_status_", false)) {
                        try {
                            this.LIZIZ.put(key.substring(15), (Integer) value);
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
                            C1798620wuC.LIZJ("LocationControllerCache", "init: parse cache headers failed", thM5exceptionOrNullimpl);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final int LIZ(String str) {
        int iIntValue;
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getConsentStatus: ");
        sbLIZ.append(this.LIZIZ);
        C1798620wuC.LIZIZ("LocationControllerCache", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this) {
            try {
                Integer num = this.LIZIZ.get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iIntValue;
    }

    public final void LIZIZ(String str, boolean z) {
        int i;
        C1798620wuC.LIZIZ("LocationControllerCache", "setConsented: ");
        int iLIZ = LIZ(str);
        if (z) {
            i = iLIZ + 1;
        } else {
            i = 0;
        }
        synchronized (this) {
            try {
                this.LIZIZ.put(str, Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consent_status_");
        sbLIZ.append(str);
        editorEdit.putInt(C2188811AlT.LIZIZ(sbLIZ), i).apply();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit2 = this.LIZ.edit();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("consent_time_");
        sbLIZ2.append(str);
        editorEdit2.putLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis).apply();
    }
}
