package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEA {
    public final Context LIZ;
    public final String LIZIZ;
    public SharedPreferences LIZJ;
    public SharedPreferences.Editor LIZLLL;

    public final SharedPreferences.Editor LIZIZ() {
        SharedPreferences sharedPreferencesLIZJ;
        if (this.LIZLLL == null) {
            synchronized (this) {
                try {
                    if (this.LIZLLL == null && (sharedPreferencesLIZJ = LIZJ()) != null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        this.LIZLLL = sharedPreferencesLIZJ.edit();
                        C1BEC c1becLIZIZ = C1BEC.LIZIZ();
                        String str = this.LIZIZ;
                        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                        c1becLIZIZ.getClass();
                        try {
                            new JSONObject().put("sp", str);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        try {
                            new JSONObject().put("cost", jUptimeMillis2);
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        C1BEE.LIZ();
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
        return this.LIZLLL;
    }

    public final SharedPreferences LIZJ() {
        if (this.LIZJ == null) {
            synchronized (this) {
                try {
                    if (this.LIZJ == null) {
                        try {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            this.LIZJ = C810670Vr7.LIZJ(this.LIZ, 0, this.LIZIZ);
                            C1BEC c1becLIZIZ = C1BEC.LIZIZ();
                            String str = this.LIZIZ;
                            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                            c1becLIZIZ.getClass();
                            try {
                                new JSONObject().put("sp", str);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                            try {
                                new JSONObject().put("cost", jUptimeMillis2);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                            C1BEE.LIZ();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    throw th3;
                }
            }
        }
        return this.LIZJ;
    }

    public final void LIZ() {
        SharedPreferences.Editor editorLIZIZ = LIZIZ();
        if (editorLIZIZ == null) {
            return;
        }
        editorLIZIZ.apply();
    }

    public C1BEA(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }
}
