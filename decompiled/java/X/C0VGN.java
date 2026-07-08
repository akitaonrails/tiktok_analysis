package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VGN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGN {
    public float[] LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final int LIZ(float f) {
        float[] fArr = this.LIZ;
        if (fArr.length > 50) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bitrateFitterParams num: ");
            sbLIZ.append(fArr.length);
            C1471660oOq.LIZIZ("FitterInfo", C2188811AlT.LIZIZ(sbLIZ));
            return 0;
        }
        double d = 0.0d;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            double d2 = 1.0d;
            for (int i3 = 0; i3 < (fArr.length - i2) - 1; i3++) {
                d2 *= (double) f;
            }
            d += d2 * ((double) fArr[i2]);
        }
        return (int) (((d * ((double) f)) * 1024.0d) / 8.0d);
    }

    public final int LIZIZ(float f) {
        float[] fArr = this.LIZ;
        if (fArr == null) {
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("FitterInfo", "fitter params empty");
            return 0;
        }
        if (f <= this.LIZJ && f > 0.0f) {
            int i2 = this.LIZLLL;
            if (i2 == 0) {
                return LIZ(f);
            }
            if (i2 == 1) {
                if (fArr.length != 3) {
                    return 0;
                }
                double d = f;
                return (int) (((((((double) fArr[0]) / Math.pow(d, fArr[2])) + ((double) fArr[1])) * d) * 1024.0d) / 8.0d);
            }
            return LIZ(f);
        }
        int i3 = C2187451AjH.LIZ;
        C1471660oOq.LIZIZ("FitterInfo", C786410Ut5.j4("preload second:%f, fitter duration:%d", new Object[]{Float.valueOf(f), Integer.valueOf(this.LIZJ)}));
        return 0;
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("func_params")) {
                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "func_params");
                if (jSONArray.length() <= 0) {
                    return;
                }
                this.LIZ = new float[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.LIZ[i] = (float) jSONArray.optDouble(i);
                }
            }
            this.LIZIZ = jSONObject.optInt("header_size");
            this.LIZJ = jSONObject.optInt("duration");
            this.LIZLLL = jSONObject.optInt("func_method");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
    }
}
