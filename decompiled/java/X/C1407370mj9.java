package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1407370mj9 {
    public final boolean LIZ;
    public String LIZIZ;
    public long LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public long LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public float LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public float LJJ;
    public float LJJI;
    public float LJJIFFI;
    public float LJJII;
    public long LJJIII;
    public JSONObject LJJIIJ;
    public final Object LJJIIJZLJL = new Object();

    public final JSONObject LIZIZ() {
        synchronized (this.LJJIIJZLJL) {
            try {
                if (this.LIZIZ == null) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    if (this.LIZJ > 0) {
                        jSONObject.put(LIZ("detect_count"), this.LIZJ);
                        jSONObject.put(LIZ("loudness"), this.LIZLLL);
                        jSONObject.put(LIZ("left_right_rms_diff"), this.LJ);
                        jSONObject.put(LIZ("clipping_rate"), this.LJFF);
                        jSONObject.put(LIZ("left_dynamicrange"), this.LJI);
                        jSONObject.put(LIZ("right_dynamicrange"), this.LJII);
                        jSONObject.put(LIZ("left_snr"), this.LJIIIIZZ);
                        jSONObject.put(LIZ("right_snr"), this.LJIIIZ);
                        jSONObject.put(LIZ("left_backnoise"), this.LJIIJ);
                        jSONObject.put(LIZ("right_backnoise"), this.LJIIJJI);
                    }
                    if (this.LJIIL > 0) {
                        jSONObject.put(LIZ("score_count"), this.LJIIL);
                        jSONObject.put(LIZ("score_clipping"), this.LJIILIIL);
                        jSONObject.put(LIZ("score_cutoff_frequency"), this.LJIILJJIL);
                        jSONObject.put(LIZ("score_dynamic_range"), this.LJIILL);
                        jSONObject.put(LIZ("score_loudness"), this.LJIILLIIL);
                        jSONObject.put(LIZ("score_peak"), this.LJIIZILJ);
                        jSONObject.put(LIZ("score_silence"), this.LJIJ);
                        jSONObject.put(LIZ("score_snr"), this.LJIJI);
                        jSONObject.put(LIZ("worst_score"), this.LJIJJ);
                        jSONObject.put(LIZ("score_fake_stereo"), this.LJIJJLI);
                        jSONObject.put(LIZ("score_inverse_phase"), this.LJIL);
                        jSONObject.put(LIZ("score_square_wav"), this.LJJ);
                        jSONObject.put(LIZ("score_sudden_impulse"), this.LJJI);
                        jSONObject.put(LIZ("score_messy"), this.LJJIFFI);
                        jSONObject.put(LIZ("score_dc_offset"), this.LJJII);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                return jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final JSONObject LIZJ() {
        JSONObject jSONObject;
        synchronized (this.LJJIIJZLJL) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(LIZ("detect_bad_rate_count"), this.LJJIII);
                    if (this.LJJIIJ != null) {
                        jSONObject.put(LIZ("bad_rate"), this.LJJIIJ);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }

    public final String LIZLLL() {
        String str;
        synchronized (this.LJJIIJZLJL) {
            try {
                str = this.LIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    public C1407370mj9(boolean z) {
        this.LIZ = z;
    }

    public final String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (this.LIZ) {
            sb.append("_af");
        } else {
            sb.append("_bf");
        }
        return sb.toString();
    }

    public final void LJI(String str) {
        JSONObject jSONObjectOptJSONObject;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.LJJIIJZLJL) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    this.LIZIZ = str;
                    this.LIZJ++;
                    this.LIZLLL += (LJ("loudness", "integrated_loudness", jSONObject) - this.LIZLLL) / this.LIZJ;
                    this.LJ += (LJ("rms_stats", "left_right_diff", jSONObject) - this.LJ) / this.LIZJ;
                    this.LJFF += (LJ("clipping", "rate", jSONObject) - this.LJFF) / this.LIZJ;
                    this.LJI += (LJ("rms_stats", "dynamic_range_left", jSONObject) - this.LJI) / this.LIZJ;
                    this.LJII += (LJ("rms_stats", "dynamic_range_right", jSONObject) - this.LJII) / this.LIZJ;
                    this.LJIIIIZZ += (LJ("rms_stats", "estimated_snr_left", jSONObject) - this.LJIIIIZZ) / this.LIZJ;
                    this.LJIIIZ += (LJ("rms_stats", "estimated_snr_right", jSONObject) - this.LJIIIZ) / this.LIZJ;
                    this.LJIIJ += (LJ("rms_stats", "background_noise_left", jSONObject) - this.LJIIJ) / this.LIZJ;
                    this.LJIIJJI += (LJ("rms_stats", "background_noise_right", jSONObject) - this.LJIIJJI) / this.LIZJ;
                    jSONObjectOptJSONObject = jSONObject.optJSONObject("anomaly_info");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("score");
                if (jSONObjectOptJSONObject2 != null) {
                    this.LJIIL++;
                    this.LJIILIIL += (LJFF("score_clipping", jSONObjectOptJSONObject2) - this.LJIILIIL) / this.LJIIL;
                    this.LJIILJJIL += (LJFF("score_cutoff_frequency", jSONObjectOptJSONObject2) - this.LJIILJJIL) / this.LJIIL;
                    this.LJIILL += (LJFF("score_dynamic_range", jSONObjectOptJSONObject2) - this.LJIILL) / this.LJIIL;
                    this.LJIILLIIL += (LJFF("score_loudness", jSONObjectOptJSONObject2) - this.LJIILLIIL) / this.LJIIL;
                    this.LJIIZILJ += (LJFF("score_peak", jSONObjectOptJSONObject2) - this.LJIIZILJ) / this.LJIIL;
                    this.LJIJ += (LJFF("score_silence", jSONObjectOptJSONObject2) - this.LJIJ) / this.LJIIL;
                    this.LJIJI += (LJFF("score_snr", jSONObjectOptJSONObject2) - this.LJIJI) / this.LJIIL;
                    this.LJIJJ += (LJFF("worst_score", jSONObjectOptJSONObject2) - this.LJIJJ) / this.LJIIL;
                    this.LJIJJLI += (LJFF("score_fake_stereo", jSONObjectOptJSONObject2) - this.LJIJJLI) / this.LJIIL;
                    this.LJIL += (LJFF("score_inverse_phase", jSONObjectOptJSONObject2) - this.LJIL) / this.LJIIL;
                    this.LJJ += (LJFF("score_square_wav", jSONObjectOptJSONObject2) - this.LJJ) / this.LJIIL;
                    this.LJJI += (LJFF("score_sudden_impulse", jSONObjectOptJSONObject2) - this.LJJI) / this.LJIIL;
                    this.LJJIFFI += (LJFF("score_messy", jSONObjectOptJSONObject2) - this.LJJIFFI) / this.LJIIL;
                    this.LJJII += (LJFF("score_dc_offset", jSONObjectOptJSONObject2) - this.LJJII) / this.LJIIL;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("bad_rate");
                if (jSONObjectOptJSONObject3 != null) {
                    this.LJJIII++;
                    this.LJJIIJ = jSONObjectOptJSONObject3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static float LJFF(String str, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(str)) {
            return CastFloatProtector.parseFloat(jSONObject.optString(str));
        }
        return 0.0f;
    }

    public static float LJ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return LJFF(str2, jSONObject.optJSONObject(str));
        }
        return 0.0f;
    }
}
