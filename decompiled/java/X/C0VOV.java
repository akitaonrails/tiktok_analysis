package X;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttvideoengine.download.DownloadTask$2;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import fyo.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VOV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VOV {
    public String LIZ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public e LJI;
    public String LJII;
    public ArrayList<String> LJIIIIZZ;
    public HashMap<String, List<String>> LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public C0VOT LJIILJJIL;
    public HashMap<String, Long> LJIILL;
    public HashMap<String, Long> LJIILLIIL;
    public Handler LJIIZILJ;
    public String LJIJI;
    public long LIZIZ = -1;
    public String LIZJ = "base_task";
    public C0VOW LJIJ = C0VOW.NONE;

    public JSONObject LIZJ() {
        return new JSONObject(LIZLLL());
    }

    public final Map LIZLLL() {
        HashMap map = new HashMap();
        map.put(FollowStatusChangeMethod.PARAM_UID, Long.valueOf(this.LIZIZ));
        LJ("des", this.LIZ, map);
        map.put("res_size", Long.valueOf(this.LIZLLL));
        map.put("content_size", Long.valueOf(this.LJ));
        map.put("state", Integer.valueOf(this.LJFF));
        e eVar = this.LJI;
        if (eVar != null) {
            LJFF("error", map, eVar.LJI());
        }
        LJ("file_path", this.LJII, map);
        ArrayList<String> arrayList = this.LJIIIIZZ;
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put("media_keys", arrayList);
        }
        LJFF("use_urls", map, this.LJIIIZ);
        map.put("finish", Boolean.valueOf(this.LJIIJ));
        map.put("cancel", Boolean.valueOf(this.LJIIJJI));
        LJ("task_type", this.LIZJ, map);
        LJ("vid", this.LJIIL, map);
        LJ("auth_token", this.LJIILIIL, map);
        LJFF("bytes_rec_map", map, this.LJIILL);
        LJFF("bytes_expect_map", map, this.LJIILLIIL);
        map.put("encrypt_version", Integer.valueOf(this.LJIJ.version));
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LJ("custom_dir", this.LJIJI, map);
        }
        return map;
    }

    public void LJII() {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new DownloadTask$2(this, C795730VJj.LJII(), this);
        }
        this.LJI = null;
        this.LJIIJ = false;
        System.currentTimeMillis();
    }

    public void LJIIIZ() {
        this.LIZIZ = -1L;
        this.LIZJ = "base_task";
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = null;
        this.LJIIJ = false;
        this.LJIIL = null;
        this.LJIILL = new HashMap<>();
        this.LJIILLIIL = new HashMap<>();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(super.toString());
        sbLIZ.append("   id = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(",  videoId ");
        sbLIZ.append(this.LJIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean LIZ(e eVar) {
        int i;
        if (eVar == null || (i = eVar.LIZ) == -9995 || i == -9948 || i == -9949 || i == -9947 || i == -9946) {
            return false;
        }
        return true;
    }

    public void LIZIZ(JSONObject jSONObject) {
        e eVar;
        if (jSONObject == null) {
            return;
        }
        this.LIZIZ = jSONObject.optLong(FollowStatusChangeMethod.PARAM_UID);
        this.LIZ = jSONObject.optString("des");
        this.LIZLLL = jSONObject.optLong("res_size");
        this.LJ = jSONObject.optLong("content_size");
        this.LJFF = jSONObject.optInt("state");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("error");
        if (jSONObjectOptJSONObject != null) {
            try {
                eVar = new e(jSONObjectOptJSONObject.optString("domain"), jSONObjectOptJSONObject.optInt("code"), jSONObjectOptJSONObject.optInt("innerCode"), jSONObjectOptJSONObject.optString("des"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("generate error fail. ");
                sbLIZ.append(th);
                sbLIZ.append(" ");
                sbLIZ.append(jSONObjectOptJSONObject);
                C1471660oOq.LIZIZ("TTVideoEngineTTHelper", C2188811AlT.LIZIZ(sbLIZ));
                eVar = null;
            }
        } else {
            eVar = null;
        }
        this.LJI = eVar;
        this.LJII = jSONObject.optString("file_path");
        this.LJIJI = jSONObject.optString("custom_dir");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("media_keys");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.LJIIIIZZ = new ArrayList<>();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                String strOptString = jSONArrayOptJSONArray.optString(i2);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.LJIIIIZZ.add(strOptString);
                }
            }
        } else {
            this.LJIIIIZZ = new ArrayList<>();
        }
        this.LJIIJ = jSONObject.optBoolean("finish");
        this.LJIIJJI = jSONObject.optBoolean("cancel");
        this.LIZJ = jSONObject.optString("task_type");
        this.LJIIL = jSONObject.optString("vid");
        this.LJIILIIL = jSONObject.optString("auth_token");
        if (jSONObject.optInt("encrypt_version", 0) == 1) {
            this.LJIJ = C0VOW.MDL_VERSION_1;
        } else {
            this.LJIJ = C0VOW.NONE;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("bytes_rec_map");
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                this.LJIILL.put(next, Long.valueOf(jSONObjectOptJSONObject2.optLong(next)));
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("bytes_expect_map");
        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.length() > 0) {
            Iterator<String> itKeys2 = jSONObjectOptJSONObject3.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                this.LJIILLIIL.put(next2, Long.valueOf(jSONObjectOptJSONObject3.optLong(next2)));
            }
        }
    }

    public void LJI(e eVar) {
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = new DownloadTask$2(this, C795730VJj.LJII(), this);
        }
        Handler handler = this.LJIIZILJ;
        if (handler != null) {
            C786410Ut5.LJLJJL(handler, Message.obtain(handler, 112, eVar));
        }
    }

    public final void LJIIIIZZ(int i) {
        String string;
        if (i != this.LJFF) {
            this.LJFF = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[downloader] state did changed. state = ");
            sbLIZ.append(i);
            sbLIZ.append(" key = ");
            ArrayList<String> arrayList = this.LJIIIIZZ;
            if (arrayList != null) {
                string = arrayList.toString();
            } else {
                string = null;
            }
            sbLIZ.append(string);
            TTVideoEngineLog.d("TTVideoEngine.DownloadTask", C2188811AlT.LIZIZ(sbLIZ));
            C0VOT c0vot = this.LJIILJJIL;
            if (c0vot != null) {
                c0vot.getClass();
            }
        }
    }

    public static void LJ(String str, String str2, Map map) {
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) map).put(str, str2);
        }
    }

    public static void LJFF(String str, Map map, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            ((HashMap) map).put(str, map2);
        }
    }
}
