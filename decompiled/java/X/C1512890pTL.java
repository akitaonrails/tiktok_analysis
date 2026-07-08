package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512890pTL implements InterfaceC1510030pOj {
    public static final C1512890pTL LIZIZ = new C1512890pTL();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1512910pTN());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1512900pTM());
    public static final Map<String, Integer> LJ = C2097608Jq.LJIIIIZZ(new Pair("kCreationFeatureCache_postPageClickPost", 7), new Pair("kCreationFeatureCache_postPageParams", 7));
    public static final Set<String> LJFF = C13LQ.LJLIIL(new String[]{"enter_video_post_page", "performance_publish_click", "leave_post_page", "post_page_back_to_edit"});

    @Override // X.InterfaceC1510030pOj
    public final Set<String> events() {
        return LJFF;
    }

    public static void LIZIZ(boolean z) throws JSONException {
        C1510130pOt c1510130pOt = new C1510130pOt();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_click_post_btn", z ? 1 : 0);
        c1510130pOt.LIZIZ = jSONObject;
        LIZJ("kCreationFeatureCache_postPageClickPost", c1510130pOt, C1514250pVX.LIZIZ);
    }

    public static Map[] LIZ(Integer num, String str) {
        String string = ((Keva) LIZJ.getValue()).getString(str, null);
        if (string == null) {
            return new Map[0];
        }
        try {
            Map[] mapArr = (Map[]) ((Gson) LIZLLL.getValue()).LJIIIIZZ(string, new TypeToken<Map<String, ? extends Double>[]>() { // from class: X.00jn
            }.getType());
            if (mapArr == null) {
                mapArr = new Map[0];
            }
            if (num != null && mapArr.length > num.intValue()) {
                int length = mapArr.length - num.intValue();
                int length2 = mapArr.length;
                C1691430u7J.LIZ(length2, mapArr.length);
                return (Map[]) Arrays.copyOfRange(mapArr, length, length2);
            }
            return mapArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Map[0];
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1510030pOj
    public final void handleAppLogEvent(String str, C1510130pOt c1510130pOt) {
        try {
            switch (str.hashCode()) {
                case -847939770:
                    if (str.equals("leave_post_page")) {
                        Object obj = c1510130pOt.LIZIZ;
                        if (obj instanceof JSONObject) {
                            String strOptString = ((JSONObject) obj).optString("leave_action");
                            if (strOptString == null) {
                                strOptString = "";
                            }
                            if (Intrinsics.LJFF(strOptString, "save_draft")) {
                                LIZIZ(false);
                            }
                        }
                    }
                    break;
                case -795442013:
                    if (str.equals("enter_video_post_page")) {
                        LIZJ("kCreationFeatureCache_postPageParams", c1510130pOt, C1514250pVX.LIZ);
                    }
                    break;
                case 540885959:
                    if (str.equals("post_page_back_to_edit")) {
                        LIZIZ(false);
                    }
                    break;
                case 1126648969:
                    if (str.equals("performance_publish_click")) {
                        LIZIZ(true);
                    }
                    break;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(String str, C1510130pOt c1510130pOt, String[] strArr) {
        HashMap map = new HashMap();
        Object obj = c1510130pOt.LIZIZ;
        if (obj instanceof JSONObject) {
            for (String str2 : strArr) {
                Object objOpt = ((JSONObject) obj).opt(str2);
                double d = 1.0d;
                if (objOpt instanceof Boolean) {
                    if (!((Boolean) objOpt).booleanValue()) {
                        d = 0.0d;
                    }
                    map.put(str2, Double.valueOf(d));
                } else if (objOpt instanceof Integer) {
                    if (Intrinsics.LJFF(objOpt, 0)) {
                        d = 0.0d;
                    }
                    map.put(str2, Double.valueOf(d));
                } else if (!(objOpt instanceof Double) && !(objOpt instanceof Float)) {
                    if (objOpt instanceof String) {
                        if (!Intrinsics.LJFF(((String) objOpt).toLowerCase(Locale.ROOT), "true") && !Intrinsics.LJFF(objOpt, "1")) {
                            d = 0.0d;
                        }
                        map.put(str2, Double.valueOf(d));
                    } else {
                        map.put(str2, Double.valueOf(0.0d));
                    }
                } else {
                    if (Intrinsics.LJFF(objOpt, Double.valueOf(0.0d))) {
                        d = 0.0d;
                    }
                    map.put(str2, Double.valueOf(d));
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        Map[] mapArr = (Map[]) C13DL.LJIIIIZZ(map, LIZ(null, str));
        Integer num = LJ.get(str);
        Object[] objArrCopyOfRange = mapArr;
        if (num != null) {
            int length = mapArr.length;
            objArrCopyOfRange = mapArr;
            if (length > num.intValue()) {
                int length2 = mapArr.length - num.intValue();
                int length3 = mapArr.length;
                C1691430u7J.LIZ(length3, mapArr.length);
                objArrCopyOfRange = Arrays.copyOfRange(mapArr, length2, length3);
            }
        }
        try {
            ((Keva) LIZJ.getValue()).storeString(str, ((Gson) LIZLLL.getValue()).LJIILL(objArrCopyOfRange));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
