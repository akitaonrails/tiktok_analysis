package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: X.0Wky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class RunnableC832340Wky implements Runnable {
    public static final C0W4N LLILLL = new C0W4N("RevokeAccessOperation", new String[0]);
    public final String LL;
    public final C832630WlR LLILLJJLI;

    public final void LIZ() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.LL), new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz9a0JDwFVcOPHkJnRLuRy+92M1tOuHW/snlVnd", new String[]{"016a9"}));
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (httpURLConnection.getResponseCode() == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                LLILLL.getClass();
            }
        } catch (IOException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LLILLL.getClass();
        } catch (IOException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            C0W4N c0w4n = LLILLL;
            "IOException when revoking access: ".concat(String.valueOf(e.toString()));
            c0w4n.getClass();
        } catch (Exception e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            C0W4N c0w4n2 = LLILLL;
            "Exception when revoking access: ".concat(String.valueOf(e.toString()));
            c0w4n2.getClass();
        }
        this.LLILLJJLI.LIZ(status);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zbb@af0f.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zbb@af0f.run");
    }

    public RunnableC832340Wky(String str) {
        C0W3J.LJI(str);
        this.LL = str;
        this.LLILLJJLI = new C832630WlR((AbstractC831960WkM) null);
    }
}
