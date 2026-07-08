package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nK5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430270nK5 {
    public static final VideoCreation LIZ(C1431630nMH c1431630nMH) {
        int i;
        JSONObject jSONObject;
        int i2 = 0;
        try {
            String str = c1431630nMH.LJII;
            if (str == null) {
                str = "";
            }
            jSONObject = new JSONObject(str);
            i = JSONObjectProtectorUtils.getInt(jSONObject, "width");
        } catch (JSONException e) {
            e = e;
            i = 0;
        }
        try {
            i2 = JSONObjectProtectorUtils.getInt(jSONObject, "height");
        } catch (JSONException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        }
        VideoCreation videoCreation = new VideoCreation();
        videoCreation.setMaterialId(c1431630nMH.LIZ);
        videoCreation.setCoverUri(c1431630nMH.LIZIZ);
        videoCreation.setVideoWidth(i);
        videoCreation.setVideoHeight(i2);
        return videoCreation;
    }
}
