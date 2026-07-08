package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472900oQq implements Serializable {
    public static final C1472900oQq LLJJI = new C1472900oQq();
    public static final C603840NmI LLJJIII = new C603840NmI(((Number) C1474810oTv.W5.getValue()).intValue());
    public final C07P5 LL;
    public final C1294210jmd[] LLILLJJLI;
    public final transient JSONObject LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final C1472890oQp LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final String LLJJ;

    public boolean isVR() {
        return this.LL != null;
    }

    public C1472900oQq() {
    }

    public int getAudioBitrate() {
        return this.LLILZIL;
    }

    public String getAudioEnhanceMetrics() {
        return this.LLJILJILJ;
    }

    public String getAudioScore() {
        return this.LLJILLL;
    }

    public String getBitRateVolumeInfoJson() {
        return this.LLJI;
    }

    public String getFormat() {
        return this.LLILZLL;
    }

    public C1294210jmd[] getFrameOffsets() {
        return this.LLILLJJLI;
    }

    public String getGearVQM() {
        return this.LLIZLLLIL;
    }

    public JSONObject getJson() {
        return this.LLILLL;
    }

    public C1472890oQp getLoudNormInfo() {
        return this.LLJIJIL;
    }

    public String getPsInfo() {
        return this.LLJJ;
    }

    public int getRealBitrate() {
        return this.LLILZ;
    }

    public String getTranscodeFeatureId() {
        return this.LLJILJIL;
    }

    public String getUfq() {
        return this.LLJ;
    }

    public C07P5 getVideoStyle() {
        return this.LL;
    }

    public String getVmaf() {
        return this.LLIZ;
    }

    public C1472900oQq(JSONObject jSONObject) {
        this.LLILLL = jSONObject;
        this.LL = C07P5.fromJSON(jSONObject.optJSONObject("VideoStyle"));
        this.LLILZ = jSONObject.optInt("real_bitrate");
        this.LLILZIL = jSONObject.optInt("audio_bit_rate");
        this.LLILZLL = jSONObject.optString("format");
        this.LLJILJIL = jSONObject.optString("transcode_feature_id");
        C1294210jmd[] c1294210jmdArrFromJSON = C1294210jmd.fromJSON(jSONObject.optString("PktOffsetMap"));
        this.LLILLJJLI = c1294210jmdArrFromJSON;
        if (c1294210jmdArrFromJSON != null && c1294210jmdArrFromJSON.length > 0) {
            for (int i = 0; i < this.LLILLJJLI.length; i++) {
            }
        }
        this.LLIZ = jSONObject.optString("mvmaf");
        this.LLIZLLLIL = jSONObject.optString("gearvqm");
        this.LLJ = jSONObject.optString("ufq");
        String strOptString = jSONObject.optString("volume_info_json");
        this.LLJI = strOptString;
        this.LLJILJILJ = jSONObject.optString("audio_enhance_metrics");
        this.LLJILLL = jSONObject.optString("audio_score");
        this.LLJIJIL = C1472890oQp.fromJson(strOptString);
        this.LLJJ = jSONObject.optString("ps_info");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized C1472900oQq from(String str) {
        C1472900oQq c1472900oQq;
        if (!((Boolean) C1474810oTv.LJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
            try {
                c1472900oQq = new C1472900oQq(new JSONObject(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1472900oQq = new C1472900oQq();
            }
            return c1472900oQq;
        }
        if (TextUtils.isEmpty(str)) {
            return LLJJI;
        }
        C603840NmI c603840NmI = LLJJIII;
        C1472900oQq c1472900oQq2 = (C1472900oQq) c603840NmI.get(str);
        if (c1472900oQq2 == null) {
            try {
                c1472900oQq2 = new C1472900oQq(new JSONObject(str));
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c1472900oQq2 = new C1472900oQq();
            }
            c603840NmI.put(str, c1472900oQq2);
        }
        return c1472900oQq2;
    }
}
