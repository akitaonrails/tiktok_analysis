package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08Zg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2138208Zg {
    public static C2138208Zg LIZIZ;
    public final JSONObject LIZ;

    public C2138208Zg(Context context) throws Throwable {
        String strLJI = C2137908Zd.LIZJ.LJI(context, "assets-map/aweme.json");
        if (!TextUtils.isEmpty(strLJI)) {
            try {
                this.LIZ = new JSONObject(strLJI);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static C2138208Zg LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C2138208Zg.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C2138208Zg(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
