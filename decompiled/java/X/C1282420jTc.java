package X;

import android.media.MediaCodecInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282420jTc {
    public int LIZ;
    public Throwable LIZIZ;
    public final JSONObject LIZJ = new JSONObject();
    public final JSONArray LIZLLL = new JSONArray();
    public long LJ;
    public long LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final /* synthetic */ C1282390jTZ LJIIL;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            LIZIZ(jSONObject);
            LIZLLL(jSONObject);
            LIZJ(jSONObject);
            LIZ(jSONObject);
            jSONObject.put("codecType", this.LJIIL.LLILLJJLI);
            if (this.LIZLLL.length() > 0) {
                jSONObject.put("failedCodecs", this.LIZLLL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
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
        return C786410Ut5.J3(jSONObject);
    }

    public C1282420jTc(C1282390jTZ c1282390jTZ) {
        this.LJIIL = c1282390jTZ;
    }

    public static void LIZIZ(JSONObject jSONObject) {
        try {
            jSONObject.put("device_name", Build.MODEL).put("gpu_render", GLThreadManager.getGPURender()).put("gpu_vendor", GLThreadManager.getGPUVendor()).put("os_version", Build.VERSION.RELEASE);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(JSONObject jSONObject) {
        try {
            MediaCodecInfo mediaCodecInfo = this.LJIIL.LLJJJ;
            if (mediaCodecInfo == null) {
                return;
            }
            JSONObject jSONObjectLJ = C1282600jTu.LJ(mediaCodecInfo);
            jSONObjectLJ.put("useSurfaceMode", this.LJIIL.LLJJLIIIJLLLLLLLZ);
            C1282390jTZ c1282390jTZ = this.LJIIL;
            if (c1282390jTZ.LLJJLIIIJLLLLLLLZ) {
                jSONObjectLJ.put("surfaceColorFormat", c1282390jTZ.LLILZ);
            } else {
                jSONObjectLJ.put("yuvColorFormat", c1282390jTZ.LLILZIL);
                jSONObjectLJ.put("yuvFormat", this.LJIIL.LLILZLL);
            }
            jSONObject.put("codecInfos", jSONObjectLJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        int i;
        int i2;
        try {
            if (this.LIZJ.length() <= 0) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(this.LIZJ));
            jSONObject2.put("width", this.LJIIL.LLJJJJLIIL);
            jSONObject2.put("height", this.LJIIL.LLJJL);
            jSONObject2.put("fps", this.LJIIL.LLJLILLLLZIIL);
            C1282390jTZ c1282390jTZ = this.LJIIL;
            if (c1282390jTZ.LLJJIJI) {
                i = -1;
            } else {
                i = c1282390jTZ.LLIZ;
            }
            jSONObject2.put("gopSec", i);
            jSONObject2.put("bitrateRatio", this.LJIIL.LLJILLL);
            jSONObject2.put("enableBFrame", this.LJIIL.LLJJ);
            this.LJIIL.getClass();
            jSONObject2.put("realHasBFrame", false);
            jSONObject2.put("bFrameBitrateRatio", this.LJIIL.LLJJI);
            if (this.LJIIL.LLJLL) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            jSONObject2.put("bitrateMode", i2);
            jSONObject.put("initParams", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        jSONObject.put("initStatus", this.LIZ);
        Throwable th = this.LIZIZ;
        if (th != null) {
            jSONObject.put("initException", th.getMessage());
        }
    }

    public final void LJFF(int i) {
        this.LIZ = Math.abs(i);
    }

    public final void LJI(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            LIZIZ(jSONObject);
            LIZLLL(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        AVLog.logKibana(5, str, C786410Ut5.J3(jSONObject), null);
    }

    public final void LJ(int i, Throwable th) {
        this.LIZ = -Math.abs(i);
        this.LIZIZ = th;
    }
}
