package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024150cl3 {
    public static C1024100cky LIZ;

    public static C1024100cky LIZ() {
        C1024100cky c1024100cky;
        synchronized (C1024150cl3.class) {
            try {
                c1024100cky = LIZ;
                if (c1024100cky != null) {
                    LIZ = null;
                } else {
                    c1024100cky = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1024100cky == null) {
            return new C1024100cky();
        }
        c1024100cky.LIZ = null;
        c1024100cky.LIZIZ = null;
        c1024100cky.LIZJ = null;
        c1024100cky.LIZLLL = null;
        c1024100cky.LJ.LIZ = null;
        return c1024100cky;
    }

    public static C1024100cky LIZIZ(long j, String str, String str2) {
        C1024100cky c1024100ckyLIZ = LIZ();
        c1024100ckyLIZ.LJ.LIZ("ad_event_priority", "10");
        c1024100ckyLIZ.LJ.LIZ("ad_event_type", "monitor");
        c1024100ckyLIZ.LJ.LIZ("track_url_list", str);
        c1024100ckyLIZ.LJ.LIZ("track_status", str2);
        C1024160cl4 c1024160cl4 = c1024100ckyLIZ.LJ;
        c1024160cl4.getClass();
        try {
            if (c1024160cl4.LIZ == null) {
                c1024160cl4.LIZ = new JSONObject();
            }
            c1024160cl4.LIZ.put("ts", j);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        String strLIZ = C1489110oqz.LIZ("other");
        if (!TextUtils.isEmpty(strLIZ)) {
            c1024100ckyLIZ.LJ.LIZ("user_agent", strLIZ);
        }
        return c1024100ckyLIZ;
    }
}
