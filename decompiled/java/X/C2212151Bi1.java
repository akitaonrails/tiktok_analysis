package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212151Bi1 {
    public List<String> LIZ;
    public List<String> LIZIZ;
    public List<String> LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;
    public long LJII;

    public final boolean LIZJ() {
        return (C2211541Bh2.LIZ(this.LIZLLL) || this.LJ <= 0 || C2212081Bhu.LIZ(this.LIZJ) || C2211541Bh2.LIZ((String) ListProtector.get(this.LIZJ, 0))) ? false : true;
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append("_encrypt");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        int i;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
            this.LIZ = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                try {
                    this.LIZ.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i2));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
            this.LIZIZ = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                try {
                    this.LIZIZ.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray2, i3));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() != 0) {
            this.LIZJ = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                try {
                    this.LIZJ.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray3, i4));
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        this.LIZLLL = jSONObject.optString("video_id");
        jSONObject.optLong("video_group_id");
        jSONObject.optBoolean("voice_switch");
        this.LJII = jSONObject.optLong("video_duration_ms");
        String strOptString = jSONObject.optString("video_density");
        this.LJI = jSONObject.optString("secret_key");
        int iIndexOf = strOptString.indexOf("x");
        if (iIndexOf >= 0 && (i = iIndexOf + 1) < strOptString.length()) {
            this.LJFF = CastIntegerProtector.parseInt(strOptString.substring(0, iIndexOf));
            this.LJ = CastIntegerProtector.parseInt(strOptString.substring(i));
        }
    }
}
