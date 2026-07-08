package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BEI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEI implements InterfaceC2201461BEa {
    public C1BEA LIZ = new C1BEA(C1BE8.LIZIZ().LIZIZ, "ad_tracker_c2s_store_v2_adym3");

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        SharedPreferences sharedPreferencesLIZJ = this.LIZ.LIZJ();
        Map<String, ?> mapEmptyMap = sharedPreferencesLIZJ == null ? Collections.emptyMap() : sharedPreferencesLIZJ.getAll();
        for (String str : mapEmptyMap.keySet()) {
            Object obj = mapEmptyMap.get(str);
            if (obj instanceof String) {
                C1BEK c1bekLJII = LJII((String) obj);
                if (c1bekLJII != null) {
                    arrayList.add(c1bekLJII);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                SharedPreferences.Editor editorLIZIZ = this.LIZ.LIZIZ();
                if (editorLIZIZ != null) {
                    editorLIZIZ.remove(str2);
                }
            }
            this.LIZ.LIZ();
        }
        return arrayList;
    }

    @Override // X.InterfaceC2201461BEa
    public final void LIZJ() {
        C1BEA c1bea = this.LIZ;
        SharedPreferences.Editor editorLIZIZ = c1bea.LIZIZ();
        if (editorLIZIZ != null) {
            editorLIZIZ.clear();
        }
        c1bea.LIZ();
    }

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LJ() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        SharedPreferences sharedPreferencesLIZJ = this.LIZ.LIZJ();
        Map<String, ?> mapEmptyMap = sharedPreferencesLIZJ == null ? Collections.emptyMap() : sharedPreferencesLIZJ.getAll();
        for (String str : mapEmptyMap.keySet()) {
            Object obj = mapEmptyMap.get(str);
            if (obj instanceof String) {
                C1BEK c1bekLJII = LJII((String) obj);
                if (c1bekLJII == null) {
                    arrayList2.add(str);
                } else if (c1bekLJII.LJIIIZ > 0) {
                    arrayList.add(c1bekLJII);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str2 : arrayList2) {
                SharedPreferences.Editor editorLIZIZ = this.LIZ.LIZIZ();
                if (editorLIZIZ != null) {
                    editorLIZIZ.remove(str2);
                }
            }
            this.LIZ.LIZ();
        }
        return arrayList;
    }

    @Override // X.InterfaceC2201461BEa
    public final void release() {
        this.LIZ.LIZ();
        this.LIZ = null;
    }

    public C1BEI() {
        C1BEA c1bea = C1BE8.LIZIZ().LJFF;
        if (c1bea != null) {
            SharedPreferences sharedPreferencesLIZJ = c1bea.LIZJ();
            if ((sharedPreferencesLIZJ != null ? sharedPreferencesLIZJ.getInt("sp_c2s_store_version", 0) : 0) < 2) {
                SharedPreferences.Editor editorLIZIZ = c1bea.LIZIZ();
                if (editorLIZIZ != null) {
                    editorLIZIZ.putInt("sp_c2s_store_version", 2);
                }
                c1bea.LIZ();
            }
        }
    }

    public static C1BEK LJII(String str) {
        HashMap map;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("uuid");
            String strOptString2 = jSONObject.optString("tracker_key");
            long jOptLong = jSONObject.optLong("ad_id");
            boolean zOptBoolean = jSONObject.optBoolean("is_standard");
            long jOptLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("urls");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, i));
                }
            }
            String strOptString3 = jSONObject.optString("log_extra");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad_extra_data");
            long jOptLong3 = jSONObject.optLong("create_timestamp");
            String strOptString4 = jSONObject.optString("track_label");
            if (TextUtils.isEmpty(strOptString4) && jSONObject.has("track_type")) {
                switch (jSONObject.optInt("track_type")) {
                    case 0:
                        strOptString4 = "show";
                        break;
                    case 1:
                        strOptString4 = "play";
                        break;
                    case 2:
                        strOptString4 = "click";
                        break;
                    case 3:
                    default:
                        strOptString4 = "";
                        break;
                    case 4:
                        strOptString4 = "play_valid";
                        break;
                    case 5:
                        strOptString4 = "play_over";
                        break;
                    case 6:
                        strOptString4 = "play_25";
                        break;
                    case 7:
                        strOptString4 = "play_50";
                        break;
                    case 8:
                        strOptString4 = "play_75";
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        strOptString4 = "cpv_6s";
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        strOptString4 = "cpv_15s";
                        break;
                }
            }
            int iOptInt = jSONObject.optInt("tried_count", 0);
            boolean zOptBoolean2 = jSONObject.optBoolean("retry_when_network_available");
            long jOptLong4 = jSONObject.optLong("expire_seconds", -1L);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("context_macro_map");
            if (jSONObjectOptJSONObject2 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                map = null;
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString5 = jSONObjectOptJSONObject2.optString(next);
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(next, strOptString5);
                }
            } else {
                map = null;
            }
            C1BEK c1bek = new C1BEK(strOptString, strOptString2, jOptLong, arrayList, strOptString4, zOptBoolean, jOptLong2, strOptString3, jSONObjectOptJSONObject, iOptInt, map);
            c1bek.LJIIIIZZ = jOptLong3;
            c1bek.LJIIL = zOptBoolean2;
            c1bek.LJIILIIL = jOptLong4;
            return c1bek;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // X.InterfaceC2201461BEa
    public final boolean LIZIZ(C1BEK c1bek) {
        String strJ3;
        if (c1bek == null || TextUtils.isEmpty(c1bek.LIZ)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", c1bek.LIZ).put("tracker_key", c1bek.LIZIZ).put("ad_id", c1bek.LIZJ).put("is_standard", c1bek.LIZLLL).put("non_std_ad_id", c1bek.LJ);
            JSONArray jSONArray = new JSONArray();
            List<String> list = c1bek.LJFF;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", c1bek.LJI).put("ad_extra_data", c1bek.LJII).put("create_timestamp", c1bek.LJIIIIZZ).put("track_label", c1bek.LJIIJ).put("tried_count", c1bek.LJIIIZ).put("retry_when_network_available", c1bek.LJIIL).put("expire_seconds", c1bek.LJIILIIL);
            Map<String, String> map = c1bek.LJIIJJI;
            if (map != null && map.size() != 0) {
                jSONObject.putOpt("context_macro_map", new JSONObject(map));
            }
            strJ3 = C786410Ut5.J3(jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            strJ3 = "";
        }
        if (TextUtils.isEmpty(strJ3)) {
            return false;
        }
        C1BEA c1bea = this.LIZ;
        String str = c1bek.LIZ;
        SharedPreferences.Editor editorLIZIZ = c1bea.LIZIZ();
        if (editorLIZIZ != null) {
            editorLIZIZ.putString(str, strJ3);
        }
        c1bea.LIZ();
        return true;
    }

    @Override // X.InterfaceC2201461BEa
    public final void LIZLLL(C1BEK c1bek) {
        LIZIZ(c1bek);
    }

    @Override // X.InterfaceC2201461BEa
    public final void LJFF(C1BEK c1bek) {
        if (c1bek != null && !TextUtils.isEmpty(c1bek.LIZ)) {
            String str = c1bek.LIZ;
            if (!TextUtils.isEmpty(str)) {
                C1BEA c1bea = this.LIZ;
                SharedPreferences.Editor editorLIZIZ = c1bea.LIZIZ();
                if (editorLIZIZ != null) {
                    editorLIZIZ.remove(str);
                }
                c1bea.LIZ();
            }
        }
    }

    @Override // X.InterfaceC2201461BEa
    public final List<C1BEK> LJI(List<C1BEK> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C1BEK c1bek : list) {
            if (!LIZIZ(c1bek)) {
                arrayList.add(c1bek);
            }
        }
        return arrayList;
    }
}
