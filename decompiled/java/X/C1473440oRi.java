package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473440oRi {
    public String LIZ;
    public ArrayList<String> LIZIZ;
    public ArrayList<String> LIZJ;
    public int LIZLLL = 1;

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("img_num")) {
            if (this.LIZLLL != 3) {
                this.LIZLLL = 1;
            }
        } else if (jSONObject.has("ImgUrl")) {
            this.LIZLLL = 2;
        }
        int i = this.LIZLLL;
        int i2 = 0;
        if (i != 1 && i != 3) {
            if (i == 2) {
                try {
                    JSONObjectProtectorUtils.getInt(jSONObject, "ImgNum");
                    jSONObject.optString("Uri");
                    jSONObject.optString("ImgUrl");
                    jSONObject.optInt("ImgXSize");
                    jSONObject.optInt("ImgYSize");
                    jSONObject.optInt("ImgXLen");
                    jSONObject.optInt("ImgYLen");
                    jSONObject.optDouble("Duration");
                    jSONObject.optDouble("Interval");
                    jSONObject.optString("Fext");
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e);
                    return;
                }
            }
            if (i == 4) {
                jSONObject.optInt("CaptureNum");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("StoreUrls");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    this.LIZJ = new ArrayList<>();
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        this.LIZJ.add(jSONArrayOptJSONArray.optString(i2));
                        i2++;
                    }
                }
                jSONObject.optInt("CellWidth");
                jSONObject.optInt("CellHeight");
                jSONObject.optInt("ImgXLen");
                jSONObject.optInt("ImgYLen");
                jSONObject.optDouble("Interval");
                jSONObject.optString("Format");
                return;
            }
            return;
        }
        try {
            JSONObjectProtectorUtils.getInt(jSONObject, "img_num");
            if (TextUtils.isEmpty(jSONObject.optString("uri"))) {
                jSONObject.optString("img_uri");
            }
            this.LIZ = jSONObject.optString("img_url");
            jSONObject.optInt("img_x_size");
            jSONObject.optInt("img_y_size");
            jSONObject.optInt("img_x_len");
            jSONObject.optInt("img_y_len");
            jSONObject.optDouble("duration");
            jSONObject.optDouble("interval");
            jSONObject.optString("fext");
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("img_urls");
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                this.LIZIZ = new ArrayList<>();
                while (i2 < jSONArrayOptJSONArray2.length()) {
                    this.LIZIZ.add(jSONArrayOptJSONArray2.optString(i2));
                    i2++;
                }
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i4 = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e2);
        }
    }
}
