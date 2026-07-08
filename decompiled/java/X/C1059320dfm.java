package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPitayaOfflineService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059320dfm {
    public static final long LIZ = System.currentTimeMillis();

    public static List<String> LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("openConfig");
        arrayList.add("config");
        arrayList.add("appInfo");
        arrayList.add("close");
        arrayList.add("gallery");
        arrayList.add("toggleGalleryBars");
        arrayList.add("slideShow");
        arrayList.add("relatedShow");
        arrayList.add("toast");
        arrayList.add("slideDownload");
        arrayList.add("requestChangeOrientation");
        arrayList.add("adInfo");
        arrayList.add("sendLog");
        arrayList.add("openSchoolEdit");
        arrayList.add("formDialogClose");
        arrayList.add("openSchoolEdit");
        arrayList.add("orderResult");
        arrayList.add("sendAnalyticsEvent");
        arrayList.add("showAutofillPopup");
        arrayList.add("x.reportAppLog");
        arrayList.add("x.hideLoading");
        IPitayaOfflineService iPitayaOfflineService = (IPitayaOfflineService) ServiceManager.get().getService(IPitayaOfflineService.class);
        if (iPitayaOfflineService != null) {
            iPitayaOfflineService.LIZIZ();
        }
        return arrayList;
    }

    public static List<String> LIZIZ(List<String> list, boolean z) {
        HashSet hashSet;
        long jCurrentTimeMillis;
        String strLIZIZ;
        HashSet hashSet2 = new HashSet();
        List<String> jsbSafeHost = C19273110af.LIZ().getJsbSafeHost();
        if (jsbSafeHost != null) {
            hashSet2.addAll(jsbSafeHost);
        }
        if (!z) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            String[] strArr = new String[1];
            SettingsManager.LIZLLL().getClass();
            boolean zLIZ = SettingsManager.LIZ("use_bridge_engine_v2", true);
            do {
                new InterfaceC2204671BQj() { // from class: X.0dfo
                    public static final String LIZJ() {
                        return KevaImpl.getRepo("jsbridge2-permission", 1).getString("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", "");
                    }

                    @Override // X.InterfaceC2204671BQj
                    public final void LIZ(String str, String str2) {
                        KevaImpl.getRepo("jsbridge2-permission", 1).storeString(str, str2);
                    }

                    @Override // X.InterfaceC2204671BQj
                    public final void LIZIZ(String str, InterfaceC1059350dfp interfaceC1059350dfp) {
                        interfaceC1059350dfp.LIZ(KevaImpl.getRepo("jsbridge2-permission", 1).getString(str, ""));
                    }
                };
                String strLIZ = C1553670qX7.LIZ();
                C1BR7 c1br7 = C2204711BQn.LJ;
                hashSet = null;
                List<TimeLineEvent> list2 = null;
                hashSet = null;
                if (list != null && !list.isEmpty()) {
                    HashSet hashSet3 = new HashSet();
                    C1BR7 c1br72 = C2204711BQn.LJ;
                    if (c1br72.LIZ() != null) {
                        Iterator<String> it2 = list.iterator();
                        while (it2.hasNext()) {
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1br72.LIZ().LIZIZ(it2.next(), list2).LIZ;
                            if (!concurrentHashMap.isEmpty()) {
                                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                    Iterator it3 = ((List) entry.getValue()).iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        if (((C1059330dfn) it3.next()).LIZIZ != EnumC1062390dkj.PUBLIC) {
                                            hashSet3.add(entry.getKey());
                                            list2 = null;
                                            break;
                                        }
                                        list2 = null;
                                    }
                                }
                            }
                        }
                    }
                    if (hashSet3.isEmpty() && !TextUtils.isEmpty(strLIZ)) {
                        try {
                            String strLIZJ = C1059340dfo.LIZJ();
                            if (strLIZJ != null && !strLIZJ.isEmpty()) {
                                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(strLIZJ), "data"), "packages"), strLIZ);
                                for (String str : list) {
                                    for (int i = 0; i < jSONArray.length(); i++) {
                                        JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                                        String string = JSONObjectProtectorUtils.getString(jSONObject, "channel");
                                        if ("host".equals(str)) {
                                            strLIZIZ = "_jsb_auth";
                                        } else {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("_jsb_auth.");
                                            sbLIZ.append(str);
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                        if (string.equals(strLIZIZ)) {
                                            Iterator<String> itKeys = JSONObjectProtectorUtils.getJSONObject(jSONObject, "content").keys();
                                            while (itKeys.hasNext()) {
                                                hashSet3.add(itKeys.next());
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    hashSet = hashSet3;
                }
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (!hashSet.isEmpty() || !zLIZ || System.currentTimeMillis() - LIZ > 3000) {
                    break;
                }
            } while (jCurrentTimeMillis < 2000);
            if (hashSet.isEmpty() && zLIZ) {
                try {
                    int size = hashSet.size();
                    String string2 = hashSet.toString();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("size", size);
                    jSONObject2.put("content", string2);
                    if (!TextUtils.isEmpty(strArr[0])) {
                        jSONObject2.put("response", strArr);
                    }
                    C793770VBv.LJ("jsb_config_log", jSONObject2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            } else {
                hashSet2.addAll(hashSet);
            }
        }
        return new ArrayList(hashSet2);
    }
}
