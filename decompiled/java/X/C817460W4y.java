package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.n_project.opensdk_tt.bean.AuthResultBean;

/* JADX INFO: renamed from: X.0W4y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C817460W4y {
    public static void LIZ(Intent intent) {
        if (intent != null) {
            try {
                String stringExtra = intent.getStringExtra("result");
                if (stringExtra != null && stringExtra.length() != 0) {
                    try {
                        if (((AuthResultBean) ((Gson) C817450W4x.LIZ.getValue()).LJII(stringExtra, AuthResultBean.class)) != null) {
                            return;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        new AuthResultBean(false, null, 0, null, "opensdk", 20100, "undefined", null);
    }
}
