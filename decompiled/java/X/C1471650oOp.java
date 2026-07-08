package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471650oOp {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public long LJ;
    public int LJFF;
    public int LJI;

    public final Map<String, Object> LIZJ() {
        HashMap map = new HashMap();
        map.put("file_id", LJFF(2));
        map.put("media_type", "mask");
        map.put("file_size", Long.valueOf(this.LJ));
        map.put("bitrate", Integer.valueOf(LIZLLL(6)));
        String strLJFF = LJFF(1);
        if (!TextUtils.isEmpty(strLJFF)) {
            map.put("urls", new String[]{strLJFF});
        }
        map.put("file_hash", LJFF(3));
        return map;
    }

    public final long LJ() {
        return this.LJ;
    }

    public final void LIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optString("version");
            this.LIZIZ = jSONObject.optString("barrage_mask_url");
            this.LIZJ = jSONObject.optString("file_id");
            this.LIZLLL = jSONObject.optString("file_hash");
            this.LJ = jSONObject.optLong("file_size");
            jSONObject.optLong("updated_at");
            this.LJFF = jSONObject.optInt("bitrate");
            this.LJI = jSONObject.optInt("head_len");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
    }

    public final void LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LIZ = jSONObject.optString("Version");
            this.LIZIZ = jSONObject.optString("BarrageMaskUrl");
            this.LIZJ = jSONObject.optString("FileId");
            this.LIZLLL = jSONObject.optString("FileHash");
            this.LJ = jSONObject.optLong("FileSize");
            jSONObject.optLong("UpdatedAt");
            this.LJFF = jSONObject.optInt("Bitrate");
            this.LJI = jSONObject.optInt("HeadLen");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(e);
        }
    }

    public final int LIZLLL(int i) {
        if (i != 6) {
            if (i != 7) {
                return -1;
            }
            return this.LJI;
        }
        return this.LJFF;
    }

    public final String LJFF(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return "";
                    }
                    return this.LIZLLL;
                }
                return this.LIZJ;
            }
            return this.LIZIZ;
        }
        return this.LIZ;
    }
}
