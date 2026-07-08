package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IY7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IY7 extends C0K04 {
    public long LIZ;
    public long LIZIZ;

    public final void LJIIJJI(String str) {
        long jUptimeMillis;
        if (this.LIZIZ > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LIZIZ;
        } else {
            jUptimeMillis = 0;
        }
        this.LIZIZ = 0L;
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_feed_image_load_all", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("url", str, jSONObject);
            C1CC2.LJIIJ(0, jUptimeMillis, "ttlive_feed_image_load_all", jSONObject);
        }
    }

    public final void LJIILIIL(String str) {
        long jUptimeMillis;
        if (this.LIZ > 0) {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
        } else {
            jUptimeMillis = 0;
        }
        this.LIZ = 0L;
        if (SlardarSampleSetting.INSTANCE.isReport("ttlive_request_feed_api_all", 0.0d)) {
            JSONObject jSONObject = new JSONObject();
            C0K04.LJFF("request_type", str, jSONObject);
            C1CC2.LJIIJ(0, jUptimeMillis, "ttlive_request_feed_api_all", jSONObject);
        }
    }

    public final void LJIIJ(String str, Throwable th) {
        int errorCode;
        String message;
        if (this.LIZIZ > 0) {
            SystemClock.uptimeMillis();
        }
        this.LIZIZ = 0L;
        SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
        if (!slardarSampleSetting.isReport("ttlive_feed_image_load_all", 0.0d) && !slardarSampleSetting.isReport("ttlive_feed_image_load_error", 0.0d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C501520Jle) {
            errorCode = ((C501520Jle) th).getErrorCode();
        } else {
            errorCode = 0;
        }
        if (th != null) {
            message = th.getMessage();
        } else {
            message = "";
        }
        C0K04.LIZLLL(errorCode, "error_code", jSONObject);
        C0K04.LJFF("error_msg", message, jSONObject);
        C0K04.LJFF("url", str, jSONObject);
        if (slardarSampleSetting.isReport("ttlive_feed_image_load_all", 0.0d)) {
            C1CC2.LJIIL(1, "ttlive_feed_image_load_all", jSONObject);
        }
        if (!slardarSampleSetting.isReport("ttlive_feed_image_load_error", 0.0d)) {
            return;
        }
        C1CC2.LJIIIIZZ("ttlive_feed_image_load_error", 1, jSONObject);
    }

    public final void LJIIL(String str, Throwable th) {
        int errorCode;
        String message;
        if (this.LIZ > 0) {
            SystemClock.uptimeMillis();
        }
        this.LIZ = 0L;
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C501520Jle) {
            errorCode = ((C501520Jle) th).getErrorCode();
        } else {
            errorCode = 0;
        }
        if (th != null) {
            message = th.getMessage();
        } else {
            message = "";
        }
        C0K04.LIZLLL(errorCode, "error_code", jSONObject);
        C0K04.LJFF("error_msg", message, jSONObject);
        C0K04.LJFF("request_type", str, jSONObject);
        SlardarSampleSetting slardarSampleSetting = SlardarSampleSetting.INSTANCE;
        if (slardarSampleSetting.isReport("ttlive_request_feed_api_all", 0.0d)) {
            C1CC2.LJIIL(1, "ttlive_request_feed_api_all", jSONObject);
        }
        if (slardarSampleSetting.isReport("ttlive_request_feed_api_error", 0.0d)) {
            C1CC2.LJIIIIZZ("ttlive_request_feed_api_error", 1, jSONObject);
        }
    }
}
