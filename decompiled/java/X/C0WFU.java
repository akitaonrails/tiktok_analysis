package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0WFU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WFU {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final SharedPreferences LIZJ;

    public C0WFU(Context context, boolean z) {
        this.LIZIZ = z;
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = contextN3;
        AuthTokenMultiProcessSharedProvider.LLJ = "token_shared_preference";
        this.LIZJ = C810670Vr7.LIZJ(C786410Ut5.N3(contextN3), 4, AuthTokenMultiProcessSharedProvider.LLJ);
        C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", "MultiProcessShared create");
    }

    public final String LIZ(String str, String str2) {
        String string;
        try {
            if (this.LIZIZ) {
                String string2 = this.LIZJ.getString(str, str2);
                C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", "mSharedPreferences main getString get key = " + str + " value = " + C0XMV.LIZJ(string2) + " " + Log.getStackTraceString(new Exception()));
                return string2;
            }
            Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LIZ.getContentResolver(), AuthTokenMultiProcessSharedProvider.LIZIZ(this.LIZ, str, "string"), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKco0nino4bHADTxvbY1AZTMpKa5gKsrgM4xWFcxC4Ak/yVrvtbHUd310=", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        string = cursorLJJJ.getString(0);
                    } else {
                        string = str2;
                    }
                    try {
                        cursorLJJJ.close();
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        C0XMZ.LIZJ(e);
                    }
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C0XMZ.LIZJ(th);
                        try {
                            cursorLJJJ.close();
                            string = str2;
                        } catch (Exception e2) {
                            e = e2;
                            string = str2;
                            TryCatchGuardChecker.doCheck(e);
                            C0XMZ.LIZJ(e);
                        }
                        C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", " MultiProcessShared getString get key = " + str + " value = " + C0XMV.LIZJ(string) + " " + Log.getStackTraceString(new Exception()));
                        return string;
                    } finally {
                    }
                }
            } else {
                string = str2;
            }
            C847400XMc.LJIIIZ("AuthTokenMultiProcessShared", " MultiProcessShared getString get key = " + str + " value = " + C0XMV.LIZJ(string) + " " + Log.getStackTraceString(new Exception()));
            return string;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0XMZ.LIZJ(th2);
            return str2;
        }
    }
}
