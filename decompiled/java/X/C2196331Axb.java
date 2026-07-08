package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Axb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196331Axb {
    public static final Keva LIZIZ;
    public static final C2196331Axb LIZ = new C2196331Axb();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    static {
        AccountUserService accountUserServiceLJIIJ;
        String curUserId = null;
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        Keva repoWithPath = null;
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getUserId, curUserId:");
        sbLIZ.append(curUserId);
        C2188811AlT.LIZIZ(sbLIZ);
        if (curUserId != null && curUserId.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("minis/page_timeline/data/");
            sbLIZ2.append(curUserId);
            sbLIZ2.append('/');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("getRelatiPath, relatiPath:");
            sbLIZ3.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                repoWithPath = KevaImpl.getRepoWithPath("minis_local_storage_repo", strLIZIZ, 1, true);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getKevaRepo, keva:");
                sbLIZ4.append(repoWithPath);
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        }
        LIZIZ = repoWithPath;
    }

    public static void LIZ(boolean z) throws JSONException {
        Keva keva;
        String string;
        String string2;
        String str;
        String str2;
        if ((!z || LIZJ.compareAndSet(false, true)) && (keva = LIZIZ) != null && (string = keva.getString("tm_page_timeline", "")) != null && string.length() != 0) {
            if (keva == null || (string2 = keva.getString("tm_page_timeline_common_data", "")) == null) {
                string2 = "";
            }
            if (C123100dR.LIZ(string2)) {
                JSONObject jSONObject = new JSONObject(string2);
                JSONArray jSONArray = new JSONArray(string);
                if (z) {
                    JSONArray jSONArray2 = C2196361Axe.LIZ;
                    C1543800qHC.LIZ.getClass();
                    Map mapLIZIZ = C1543800qHC.LIZIZ(jSONObject);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapLIZIZ.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    map2.put("result", 0);
                    C09ZS.LIZ.getClass();
                    C09ZW c09zwLIZJ = C09ZS.LIZJ();
                    if (c09zwLIZJ == null || (str = c09zwLIZJ.LIZIZ) == null) {
                        str = "";
                    }
                    map2.put("jssdk_version", str);
                    map2.put("error_code", 2);
                    map.putAll(map2);
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        map2.put(entry2.getKey(), entry2.getValue());
                    }
                    C08S3.LIZLLL("tm_load_result", map2, null, null);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onMinisLoadResult, categoryMap:");
                    C1227904rF.LIZ.getClass();
                    sbLIZ.append(C1227904rF.LJI(map2));
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (C297070Bkf.LIZ() && (str2 = (String) linkedHashMap.get("minis_id")) != null && str2.length() > 0) {
                        String str3 = (String) linkedHashMap.get("enter_from");
                        if (str3 == null) {
                            str3 = "";
                        }
                        C2196381Axg.LIZIZ(str2, str3, null, null, null, 2, C2197221Az2.LIZ(str2));
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event_name", "tm_load_result");
                    JSONObject jSONObject3 = new JSONObject();
                    for (Map.Entry entry3 : map.entrySet()) {
                        jSONObject3.put((String) entry3.getKey(), entry3.getValue());
                    }
                    jSONObject2.put("param", jSONObject3);
                    jSONObject2.put("tm_timestamp", System.currentTimeMillis());
                    jSONArray.put(jSONObject2);
                }
                int length = jSONArray.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Object objOpt = jSONArray.opt(i2);
                    if (objOpt != null && (objOpt instanceof JSONObject) && Intrinsics.LJFF(((JSONObject) objOpt).optString("event_name"), "tm_ttoclid_generation")) {
                        JSONArray jSONArray3 = C2196361Axe.LIZ;
                        C1543800qHC.LIZ.getClass();
                        Map mapLIZIZ2 = C1543800qHC.LIZIZ(jSONObject);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry4 : mapLIZIZ2.entrySet()) {
                            if (entry4.getValue() != null) {
                                linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                            }
                        }
                        String string3 = jSONArray.toString();
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry5 : linkedHashMap2.entrySet()) {
                            map3.put(entry5.getKey(), entry5.getValue());
                        }
                        map3.put("points", string3);
                        C08S3.LIZLLL("tm_page_timeline", map3, null, null);
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onMinisPageTimeline, categoryMap:");
                        C1227904rF.LIZ.getClass();
                        sbLIZ2.append(C1227904rF.LJI(map3));
                        C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        i2++;
                    }
                }
            }
            Keva keva2 = LIZIZ;
            if (keva2 != null) {
                keva2.storeString("tm_page_timeline", "");
                keva2.storeString("tm_page_timeline_common_data", "");
            }
        }
    }

    public static void LIZIZ(Map map) {
        Keva keva = LIZIZ;
        if (keva != null) {
            C1543800qHC.LIZ.getClass();
            keva.storeString("tm_page_timeline_common_data", C786410Ut5.J3(C1543800qHC.LIZJ(map)));
        }
    }

    public static void LIZJ(String str, HashMap map, HashMap map2, Long l) {
        String string;
        long jCurrentTimeMillis;
        Keva keva = LIZIZ;
        if (keva != null) {
            string = keva.getString("tm_page_timeline", "");
        } else {
            string = null;
        }
        JSONArray jSONArray = new JSONArray();
        if (C123100dR.LIZ(string)) {
            jSONArray = new JSONArray(string);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", str);
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        jSONObject.put("param", jSONObject2);
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        jSONObject.put("tm_timestamp", jCurrentTimeMillis);
        jSONArray.put(jSONObject);
        Keva keva2 = LIZIZ;
        if (keva2 != null) {
            keva2.storeString("tm_page_timeline", jSONArray.toString());
        }
    }
}
