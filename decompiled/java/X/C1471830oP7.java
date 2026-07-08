package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oP7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471830oP7 {
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public int LJFF = -1;
    public int LJI;
    public float LJII;
    public float LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;

    public final JSONObject LIZIZ() {
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("main_url", this.LIZIZ);
            String str = this.LIZJ;
            if (str == null) {
                str = "";
            }
            jSONObject.put("backup_url_1", str);
            jSONObject.put("check_info", (Object) null);
            jSONObject.put("info_id", this.LJFF);
            jSONObject.put("bitrate", this.LJI);
            jSONObject.put("file_hash", this.LJIIIZ);
            jSONObject.put("loudness", this.LJII);
            jSONObject.put("peak", this.LJIIIIZZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final String[] LIZ() {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            arrayList.add(this.LIZIZ);
        }
        if (!TextUtils.isEmpty(this.LIZJ)) {
            arrayList.add(this.LIZJ);
        } else if (!TextUtils.isEmpty(this.LIZLLL)) {
            arrayList.add(this.LIZLLL);
        } else if (!TextUtils.isEmpty(this.LJ)) {
            arrayList.add(this.LJ);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    public final JSONObject LIZJ() {
        try {
            if (TextUtils.isEmpty(this.LIZIZ)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(this.LIZIZ);
            String str = this.LIZJ;
            if (str != null) {
                jSONArray.put(str);
            }
            String str2 = this.LIZLLL;
            if (str2 != null) {
                jSONArray.put(str2);
            }
            String str3 = this.LJ;
            if (str3 != null) {
                jSONArray.put(str3);
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("info_id", this.LJFF);
            jSONObject.put("bitrate", this.LJI);
            jSONObject.put("file_hash", this.LJIIIZ);
            jSONObject.put("media_type", this.LIZ == 0 ? "video" : "audio");
            jSONObject.put("is_dubbed", 1);
            jSONObject.put("language_code", this.LJIIJ);
            jSONObject.put("file_size", 0);
            jSONObject.put("file_id", "");
            jSONObject.put("audio_file_id", "");
            jSONObject.put("definition", "");
            jSONObject.put("loudness", this.LJII);
            jSONObject.put("peak", this.LJIIIIZZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
