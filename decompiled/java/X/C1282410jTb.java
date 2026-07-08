package X;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.utils.AVLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282410jTb {
    public int LIZ;
    public Throwable LIZIZ;
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final /* synthetic */ C1282400jTa LJIILIIL;
    public final JSONObject LIZJ = new JSONObject();
    public final JSONArray LIZLLL = new JSONArray();
    public boolean LJIIL = false;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("device_name", Build.MODEL).put("os_version", Build.VERSION.RELEASE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ(jSONObject);
            LIZIZ(jSONObject);
            LIZ(jSONObject);
            jSONObject.put("codecType", this.LJIILIIL.LLILLJJLI);
            if (this.LIZLLL.length() > 0) {
                jSONObject.put("failedCodecs", this.LIZLLL);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (this.LIZ != 200) {
            return C786410Ut5.J3(jSONObject);
        }
        jSONObject.put("firstConfigDelay", this.LJFF - this.LJ);
        jSONObject.put("firstKeyFrameDelay", this.LJII - this.LJ);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
        jSONObject.put("duration", jCurrentTimeMillis);
        if (jCurrentTimeMillis >= 10000) {
            float f = jCurrentTimeMillis;
            jSONObject.put("inputFps", (this.LJIIIZ * 1000.0f) / f);
            jSONObject.put("outputFps", (this.LJIIJ * 1000.0f) / f);
        } else {
            jSONObject.put("inputFrames", this.LJIIIZ);
            jSONObject.put("outputFrames", this.LJIIJ);
        }
        jSONObject.put("encodeStatus", this.LJIIJJI);
        if (this.LJIILIIL.LLLFFI) {
            jSONObject.put("csdStripped", this.LJIIL);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public C1282410jTb(C1282400jTa c1282400jTa) {
        this.LJIILIIL = c1282400jTa;
    }

    public final void LIZ(JSONObject jSONObject) {
        try {
            MediaCodecInfo mediaCodecInfo = this.LJIILIIL.LLJJIJIL;
            if (mediaCodecInfo == null) {
                return;
            }
            JSONObject jSONObjectLJ = C1282590jTt.LJ(mediaCodecInfo);
            jSONObjectLJ.put("useSurfaceMode", this.LJIILIIL.LLJJL);
            C1282400jTa c1282400jTa = this.LJIILIIL;
            if (c1282400jTa.LLJJL) {
                jSONObjectLJ.put("surfaceColorFormat", c1282400jTa.LLILZ);
            } else {
                jSONObjectLJ.put("yuvColorFormat", c1282400jTa.LLILZIL);
                jSONObjectLJ.put("yuvFormat", this.LJIILIIL.LLILZLL);
            }
            jSONObject.put("codecInfos", jSONObjectLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        int i;
        try {
            if (this.LIZJ.length() <= 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(this.LIZJ));
            jSONObject2.put("width", this.LJIILIIL.LLJJJJJIL);
            jSONObject2.put("height", this.LJIILIIL.LLJJJJLIIL);
            jSONObject2.put("fps", this.LJIILIIL.LLJLIL);
            C1282400jTa c1282400jTa = this.LJIILIIL;
            if (c1282400jTa.LLJJIJI) {
                i = -1;
            } else {
                i = c1282400jTa.LLIZ;
            }
            jSONObject2.put("gopSec", i);
            jSONObject2.put("bitrateRatio", this.LJIILIIL.LLJILLL);
            jSONObject2.put("enableBFrame", this.LJIILIIL.LLJJ);
            this.LJIILIIL.getClass();
            jSONObject2.put("realHasBFrame", false);
            jSONObject2.put("bFrameBitrateRatio", this.LJIILIIL.LLJJI);
            jSONObject2.put("bitrateMode", this.LJIILIIL.LLJLILLLLZIIL);
            jSONObject.put("initParams", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("initStatus", this.LIZ);
        Throwable th = this.LIZIZ;
        if (th != null) {
            jSONObject.put("initException", th.getMessage());
        }
    }

    public final void LJ(int i) {
        this.LIZ = Math.abs(i);
    }

    public final void LJFF(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("device_name", Build.MODEL).put("os_version", Build.VERSION.RELEASE);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            LIZJ(jSONObject);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        AVLog.logKibana(5, str, C786410Ut5.J3(jSONObject), null);
    }

    public final void LIZLLL(int i, Throwable th) {
        this.LIZ = -Math.abs(i);
        this.LIZIZ = th;
    }
}
