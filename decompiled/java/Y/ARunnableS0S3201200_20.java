package Y;

import X.C1278740jNg;
import X.C1C7U;
import X.C786410Ut5;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS0S3201200_20 implements Runnable {
    public final int $t;
    public int i5;
    public long j6;
    public long j7;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S3201200_20 aRunnableS0S3201200_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS0S3201200_20.l3;
        long j = aRunnableS0S3201200_20.j6;
        String str = aRunnableS0S3201200_20.s0;
        long j2 = aRunnableS0S3201200_20.j7;
        int i = aRunnableS0S3201200_20.i5;
        String str2 = aRunnableS0S3201200_20.s1;
        Throwable th = (Throwable) aRunnableS0S3201200_20.l4;
        String str3 = aRunnableS0S3201200_20.s2;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.uploadSDKLogEvent$1L");
        JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(null, j);
        if (jSONObjectLIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        jSONObject.put("msg", str);
                    }
                }
                jSONObject.put("clockMs", j2);
                if (i > 0) {
                    jSONObject.put("level", i);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("tag", str2);
                }
                if (th != null) {
                    jSONObject.put("stackTrace", Log.getStackTraceString(th));
                }
                if (str3 == null) {
                    str3 = "live_sdk_log";
                }
                jSONObjectLIZIZ.put("event_key", str3).put("message", C786410Ut5.J3(jSONObject));
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.uploadSDKLogEvent$1L");
    }

    public static final void run$1(ARunnableS0S3201200_20 aRunnableS0S3201200_20) {
        C1278740jNg c1278740jNg = (C1278740jNg) aRunnableS0S3201200_20.l3;
        String str = aRunnableS0S3201200_20.s0;
        long j = aRunnableS0S3201200_20.j6;
        long j2 = aRunnableS0S3201200_20.j7;
        int i = aRunnableS0S3201200_20.i5;
        String str2 = aRunnableS0S3201200_20.s1;
        Throwable th = (Throwable) aRunnableS0S3201200_20.l4;
        String str3 = aRunnableS0S3201200_20.s2;
        c1278740jNg.getClass();
        C1C7U.LIZ("VeLiveLogService@5388.uploadSDKLogEventJson$1L");
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    jSONObject.put("msg", str);
                }
            }
            JSONObject jSONObjectLIZIZ = c1278740jNg.LIZIZ(jSONObject, j);
            if (jSONObjectLIZIZ != null) {
                jSONObjectLIZIZ.put("clockMs", j2);
                if (i > 0) {
                    jSONObjectLIZIZ.put("level", i);
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObjectLIZIZ.put("tag", str2);
                }
                if (th != null) {
                    jSONObjectLIZIZ.put("stackTrace", Log.getStackTraceString(th));
                }
                if (str3 == null) {
                    str3 = "live_sdk_log";
                }
                jSONObjectLIZIZ.put("event_key", str3);
                c1278740jNg.LLJIJIL.LIZIZ(jSONObjectLIZIZ);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("VeLiveLogService@5388.uploadSDKLogEventJson$1L");
    }

    public ARunnableS0S3201200_20(int i, long j, long j2, C1278740jNg c1278740jNg, String str, String str2, String str3, Throwable th, int i2) {
        this.$t = i2;
        if (i2 != 0) {
            this.l3 = c1278740jNg;
            this.s0 = str;
            this.j6 = j;
            this.j7 = j2;
            this.i5 = i;
            this.s1 = str2;
            this.l4 = th;
            this.s2 = str3;
            return;
        }
        this.l3 = c1278740jNg;
        this.j6 = j;
        this.s0 = str;
        this.j7 = j2;
        this.i5 = i;
        this.s1 = str2;
        this.l4 = th;
        this.s2 = str3;
    }
}
