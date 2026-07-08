package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.text.DecimalFormat;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BjL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212971BjL {
    public static volatile C2212971BjL LJ;
    public C2213001BjO LIZ;
    public PthreadTimer LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public static C2212971BjL LIZ() {
        if (LJ == null) {
            synchronized (C2212971BjL.class) {
                try {
                    if (LJ == null) {
                        LJ = new C2212971BjL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public static void LIZIZ(C2212201Bi6 c2212201Bi6) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
            jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
            C2212051Bhr.LIZJ().LJFF("splash_ad", "mute", jSONObject, c2212201Bi6.LLJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(C2212201Bi6 c2212201Bi6, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format(f));
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
            jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
            C2212051Bhr.LIZJ().LJFF("splash_ad", "unmute", jSONObject, c2212201Bi6.LLJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
