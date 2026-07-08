package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: renamed from: X.09Ih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2348909Ih {
    public static final String LIZ(String str) {
        Object obj;
        String str2;
        n nVarLJI;
        k kVarLJJIIZ;
        String strLJIL;
        String strLJIL2;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            return null;
        }
        try {
            boolean z = false;
            Map map = (Map) C19748512Ol.LIZIZ.LJII(C810670Vr7.LIZJ(contextLJII, 0, "xbridge-storage").getString("live_mt_stream_goal_fe_info_storage", "{}"), Map.class);
            if (map != null) {
                obj = map.get("value");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = (String) obj;
            } else {
                str2 = null;
            }
            if (str2 != null && (nVarLJI = C2348809Ig.LJI(str2)) != null && (kVarLJJIIZ = nVarLJI.LJJIIZ(str)) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                k kVarLJJIIZ2 = nVarLJI.LJJIIZ(str);
                if (kVarLJJIIZ2 != null && (strLJIL2 = kVarLJJIIZ2.LJIL()) != null) {
                    if (strLJIL2.length() > 0) {
                        z = true;
                    }
                }
                if (z) {
                    return strLJIL;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
