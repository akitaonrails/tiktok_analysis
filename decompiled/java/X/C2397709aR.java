package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09aR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2397709aR {
    public static final C2397709aR LIZ = new C2397709aR();
    public static ExecutorService LIZIZ;

    public static ExecutorService LIZ() {
        if (LIZIZ == null) {
            synchronized (C2397709aR.class) {
                try {
                    if (LIZIZ == null) {
                        C2123408To c2123408To = new C2123408To(C0WQX.SERIAL);
                        c2123408To.LIZIZ = "EventUpload";
                        LIZIZ = C823050WQl.LIZ(new C2123508Tp(c2123408To));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ(String str, Bundle bundle) {
        try {
            AppLogNewUtils.LJ(str, bundle);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        try {
            AppLogNewUtils.onEventV3(str, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
