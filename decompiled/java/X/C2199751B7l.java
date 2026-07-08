package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.service.IDownloadProcessDispatcherService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199751B7l {
    public static final C1498850p6h<Integer, C2199751B7l> LJ = new C1498850p6h<>(16, 16);
    public static final C2199751B7l LJFF = new C2199751B7l(null);
    public static JSONObject LJI;
    public static JSONObject LJII;
    public static Boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static C2199751B7l LJIIJ;
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final Boolean LIZJ;
    public int LIZLLL;

    static {
        LIZJ();
    }

    public static JSONObject LIZIZ() {
        return ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getDownloadSetting();
    }

    public static void LIZJ() {
        Boolean boolValueOf;
        JSONObject downloadSetting = ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getDownloadSetting();
        LJIIIZ = downloadSetting.optInt("disable_task_setting", 0) == 1;
        LJI = downloadSetting.optJSONObject("disabled_task_keys");
        JSONObject jSONObjectOptJSONObject = downloadSetting.optJSONObject("bugfix");
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("default")) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optInt("default", 0) == 1);
        }
        LJII = jSONObjectOptJSONObject;
        LJIIIIZZ = boolValueOf;
        if (C1490830otl.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SettingUpdate:");
            sbLIZ.append(C786410Ut5.J3(downloadSetting));
            C1490830otl.LIZIZ("DownloadSetting", "init", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final String LJIIJJI() {
        JSONObject jSONObject = this.LIZ;
        return (jSONObject == null || !jSONObject.has("setting_tag") || LIZLLL("setting_tag")) ? LIZIZ().optString("setting_tag", "") : this.LIZ.optString("setting_tag", "");
    }

    public C2199751B7l(JSONObject jSONObject) {
        Boolean bool;
        this.LIZ = jSONObject;
        JSONObject jSONObject2 = null;
        boolValueOf = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        if (jSONObject != null && !LIZLLL("bugfix")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("bugfix");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("default") && !LIZLLL("default")) {
                boolValueOf = Boolean.valueOf(jSONObjectOptJSONObject.optInt("default", 0) == 1);
            }
            bool = boolValueOf;
            jSONObject2 = jSONObjectOptJSONObject;
        } else {
            bool = null;
        }
        this.LIZIZ = jSONObject2;
        this.LIZJ = bool;
    }

    public static C2199751B7l LIZ(DownloadInfo downloadInfo) {
        if (LJIIIZ) {
            return LJFF;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new C2199751B7l(new JSONObject(downloadSettingString));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return LJFF;
    }

    public static boolean LIZLLL(String str) {
        JSONObject jSONObject = LJI;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    public static C2199751B7l LJ(int i) {
        return LJFF(i, null);
    }

    public static void LJIIL(int i) {
        C2199751B7l c2199751B7l = LJIIJ;
        if (c2199751B7l != null && c2199751B7l.LIZLLL == i) {
            LJIIJ = null;
        }
        C1498850p6h<Integer, C2199751B7l> c1498850p6h = LJ;
        synchronized (c1498850p6h) {
            try {
                c1498850p6h.remove(Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final JSONObject LJIIIZ(String str) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optJSONObject(str);
        }
        return LIZIZ().optJSONObject(str);
    }

    public static C2199751B7l LJFF(int i, DownloadInfo downloadInfo) {
        C2199751B7l c2199751B7lLIZ;
        DownloadInfo downloadInfo2;
        C2199751B7l c2199751B7l = LJIIJ;
        if (c2199751B7l != null && c2199751B7l.LIZLLL == i) {
            return c2199751B7l;
        }
        C1498850p6h<Integer, C2199751B7l> c1498850p6h = LJ;
        synchronized (c1498850p6h) {
            try {
                c2199751B7lLIZ = c1498850p6h.get(Integer.valueOf(i));
            } finally {
            }
        }
        if (c2199751B7lLIZ == null) {
            if (downloadInfo == null) {
                if (!LJIIIZ && ((IDownloadComponentManagerService) C1B82.LIZ(IDownloadComponentManagerService.class)).getAppContext() != null && (downloadInfo2 = ((IDownloadProcessDispatcherService) C1B82.LIZ(IDownloadProcessDispatcherService.class)).getDownloadInfo(i)) != null) {
                    c2199751B7lLIZ = LIZ(downloadInfo2);
                } else {
                    c2199751B7lLIZ = LJFF;
                }
            } else {
                c2199751B7lLIZ = LIZ(downloadInfo);
            }
            synchronized (c1498850p6h) {
                try {
                    c1498850p6h.put(Integer.valueOf(i), c2199751B7lLIZ);
                } finally {
                }
            }
        }
        c2199751B7lLIZ.LIZLLL = i;
        LJIIJ = c2199751B7lLIZ;
        return c2199751B7lLIZ;
    }

    public final boolean LJI(String str, boolean z) {
        if (this.LIZIZ != null && !LIZLLL(str)) {
            if (this.LIZIZ.has(str)) {
                if (this.LIZIZ.optInt(str, z ? 1 : 0) != 1) {
                    return false;
                }
                return true;
            }
            Boolean bool = this.LIZJ;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = LJII;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                if (LJII.optInt(str, z ? 1 : 0) != 1) {
                    return false;
                }
                return true;
            }
            Boolean bool2 = LJIIIIZZ;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z;
    }

    public final double LJII(String str, double d) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optDouble(str, d);
        }
        return LIZIZ().optDouble(str, d);
    }

    public final int LJIIIIZZ(String str, int i) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optInt(str, i);
        }
        return LIZIZ().optInt(str, i);
    }

    public final long LJIIJ(String str, long j) {
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.has(str) && !LIZLLL(str)) {
            return this.LIZ.optLong(str, j);
        }
        return LIZIZ().optLong(str, j);
    }
}
