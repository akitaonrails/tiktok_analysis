package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478830oaP {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;
    public final double LJII;
    public final double LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpeedCalculateConfig{mMinRangeRobustFactor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mMaxRangeRobustFactor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mDefaultRangeRobustFactor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mRoughRTTms=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mAdjRangeSizeByte=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mMinTaskSizeByte=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mMaxTaskSizeByte=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mMinTaskDownloadMs=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mMaxTaskDownloadMs=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1478830oaP(String str) {
        this.LIZ = 1.0f;
        this.LIZIZ = 1.0f;
        this.LIZJ = 1.0f;
        this.LJ = 81920000;
        this.LJI = 52428800L;
        this.LJII = 1.0E-4d;
        this.LJIIIIZZ = 1200000.0d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LIZ = (float) jSONObject.optDouble("min_range_robust_factor", 1.0d);
            this.LIZIZ = (float) jSONObject.optDouble("max_range_robust_factor", 1.0d);
            this.LIZJ = (float) jSONObject.optDouble("default_range_robust_factor", 1.0d);
            this.LIZLLL = jSONObject.optInt("rough_rtt_ms", 0);
            this.LJ = jSONObject.optInt("adj_range_size_byte", 81920000);
            this.LJFF = jSONObject.optInt("min_task_size_byte", 0);
            this.LJI = jSONObject.optLong("max_task_size_byte", 52428800L);
            this.LJII = jSONObject.optDouble("min_task_download_ms", 1.0E-4d);
            this.LJIIIIZZ = jSONObject.optDouble("max_task_download_ms", 1200000.0d);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
