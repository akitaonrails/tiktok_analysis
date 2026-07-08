package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809040VoU {
    public static C809040VoU LIZIZ;
    public final C809320Vow LIZ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ);

    public static synchronized C809040VoU LIZ() {
        if (LIZIZ == null) {
            synchronized (C809040VoU.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C809040VoU();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public final void LIZIZ(Map<String, String> map) {
        Logger.debug();
        try {
            String strLJ = this.LIZ.LJ("ssids");
            if (!C2093608Ic.LJ(strLJ) && !C2093608Ic.LJ(strLJ)) {
                try {
                    JSONObject jSONObject = new JSONObject(strLJ);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = JSONObjectProtectorUtils.getString(jSONObject, next);
                        if (!C2093608Ic.LJ(next) && !C2093608Ic.LJ(string)) {
                            ((HashMap) map).put(next, string);
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
