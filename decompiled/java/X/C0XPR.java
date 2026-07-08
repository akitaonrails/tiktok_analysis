package X;

import Y.ARunnableS8S1000000_13;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataResponse;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XPR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XPR {
    public static ArrayList<C0XPT> LIZIZ;
    public static volatile JSONObject LIZJ;
    public static boolean LIZLLL;
    public static final C0XPR LIZ = new C0XPR();
    public static final boolean LJ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("clear_red_point_cost", false);

    public static void LIZJ() {
        try {
            LIZLLL = true;
            ArrayList<C0XPT> arrayList = LIZIZ;
            if (arrayList != null) {
                Iterator<C0XPT> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed(new Exception("no data to show"));
                }
            }
            LIZIZ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZ() {
        String string = Keva.getRepo("TTSettingData").getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            LJFF(1, null);
            LIZJ();
        } else {
            LJFF(2, string);
            C823050WQl.LIZIZ().submit(new ARunnableS8S1000000_13(string, 7));
        }
    }

    public static void LIZLLL() {
        JSONObject jSONObjectOptJSONObject;
        try {
            ArrayList<C0XPT> arrayList = LIZIZ;
            if (arrayList != null) {
                for (C0XPT c0xpt : arrayList) {
                    C0XPR c0xpr = LIZ;
                    JSONObject jSONObject = LIZJ;
                    c0xpr.getClass();
                    c0xpt.LIZIZ((jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) == null) ? null : jSONObjectOptJSONObject.optJSONObject("app"));
                }
            }
            LIZIZ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJ(C0XPT c0xpt) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = LIZJ;
        if (jSONObject != null) {
            LIZ.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("app");
            } else {
                jSONObjectOptJSONObject = null;
            }
            c0xpt.LIZIZ(jSONObjectOptJSONObject);
            return;
        }
        if (LIZLLL) {
            c0xpt.onFailed(new Exception("no data to show"));
            return;
        }
        ArrayList<C0XPT> arrayList = LIZIZ;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        LIZIZ = arrayList;
        arrayList.add(c0xpt);
    }

    public static void LIZIZ(TTSettingDataResponse tTSettingDataResponse, String str) {
        tTSettingDataResponse.getTtSettingData();
        LIZJ = tTSettingDataResponse.getTtSettingDataJSONObject();
        Keva repo = Keva.getRepo("TTSettingData");
        if (!TextUtils.isEmpty(str)) {
            LJFF(0, str);
            repo.storeString("settingData", str);
            repo.storeLong("last_get_setting_time", System.currentTimeMillis());
            LIZLLL();
            return;
        }
        String string = repo.getString("settingData", "");
        if (TextUtils.isEmpty(string)) {
            LJFF(1, null);
            LIZJ();
        } else {
            LJFF(2, string);
            C823050WQl.LIZIZ().submit(new ARunnableS8S1000000_13(string, 7));
        }
    }

    public static void LJFF(int i, String str) {
        int length;
        try {
            if (((Boolean) C0A3Q.LIZ.getValue()).booleanValue() && str != null && str.length() != 0 && (length = str.length()) > 102400) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("length", length);
                C793770VBv.LJII("memory_ttsettingdata", jSONObject, jSONObject2, null);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
