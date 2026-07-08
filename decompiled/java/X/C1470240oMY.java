package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470240oMY implements InterfaceC1467050oHP {
    public List<C0VP0> LIZ;
    public C1470250oMZ LIZIZ;
    public C1473400oRe LIZJ;
    public int LIZLLL = 1;
    public HashMap<String, EnumC2281151EQn> LJ;
    public JSONObject LJFF;
    public boolean LJI;
    public String LJII;

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LIZ() {
        String strLJJII = LJJII(261);
        String strLJJII2 = LJJII(262);
        List<C1474520oTS> listLJIILL = LJIILL();
        try {
            HashMap map = new HashMap();
            if (strLJJII != null && !TextUtils.isEmpty(strLJJII)) {
                map.put("did_profile_labels", strLJJII);
            }
            if (strLJJII2 != null && !TextUtils.isEmpty(strLJJII2)) {
                map.put("vid_profile_labels", strLJJII2);
            }
            if (listLJIILL != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C1474520oTS> it2 = listLJIILL.iterator();
                while (it2.hasNext()) {
                    Map<String, Object> mapLJI = it2.next().LJI();
                    if (mapLJI != null) {
                        arrayList.add(mapLJI);
                    }
                }
                if (arrayList.size() > 0) {
                    map.put("infos", arrayList);
                }
            }
            return new JSONObject(map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            return null;
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final String LIZIZ() {
        C1473400oRe c1473400oRe = this.LIZJ;
        return c1473400oRe != null ? c1473400oRe.LJIIIIZZ(215) : "";
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LIZJ() {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJ;
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LJII() {
        C1471650oOp c1471650oOp;
        String strLJJII = LJJII(211);
        String strLJJII2 = LJJII(2);
        int iLJIIZILJ = LJIIZILJ(3);
        List<C1474520oTS> listLJIILL = LJIILL();
        if (listLJIILL == null) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            Iterator<C1474520oTS> it2 = listLJIILL.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LJIILJJIL());
            }
            C1473400oRe c1473400oRe = this.LIZJ;
            if (c1473400oRe != null && (c1471650oOp = c1473400oRe.LJJIJL) != null) {
                arrayList.add(c1471650oOp.LIZJ());
            }
            map.put("format", strLJJII);
            map.put("vid", strLJJII2);
            map.put("bid", LJJII(246));
            map.put("category", Integer.valueOf(LJIIZILJ(232)));
            map.put("duration", Integer.valueOf(iLJIIZILJ));
            map.put("infos", arrayList);
            map.put("enable_adaptive", Integer.valueOf(LJJIFFI(222) ? 1 : 0));
            C1473400oRe c1473400oRe2 = this.LIZJ;
            if (c1473400oRe2 != null) {
                map.put("pallas_vid_labels", c1473400oRe2.LJIIIIZZ(237));
                map.put("did_profile_labels", this.LIZJ.LJIIIIZZ(261));
                map.put("vid_profile_labels", this.LIZJ.LJIIIIZZ(262));
                map.put("trans_params", this.LIZJ.LJIIIIZZ(265));
                map.put("loudness", Float.valueOf(this.LIZJ.LJFF(224)));
                map.put("peak", Float.valueOf(this.LIZJ.LJFF(225)));
            }
            return new JSONObject(map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d(th);
            return null;
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LJIIIIZZ() {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe == null) {
            return new String[0];
        }
        if (c1473400oRe.LJFF == null) {
            List<C1474520oTS> listLJIIJ = c1473400oRe.LJIIJ();
            ArrayList arrayList = new ArrayList();
            if (listLJIIJ != null && listLJIIJ.size() > 0) {
                for (C1474520oTS c1474520oTS : listLJIIJ) {
                    if (c1474520oTS != null) {
                        String strLIZ = c1474520oTS.LIZ(8);
                        if (!TextUtils.isEmpty(strLIZ) && !arrayList.contains(strLIZ)) {
                            arrayList.add(strLIZ);
                        }
                    }
                }
            }
            String[] strArr = new String[arrayList.size()];
            c1473400oRe.LJFF = strArr;
            arrayList.toArray(strArr);
        }
        return c1473400oRe.LJFF;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIJJI() {
        if (TextUtils.isEmpty(LJJII(8))) {
            return false;
        }
        if (LJIIJ(EnumC1469940oM4.DASH)) {
            String strLIZIZ = LIZIZ();
            if (!TextUtils.isEmpty(strLIZIZ) && strLIZIZ.equals("segment_base")) {
                return true;
            }
        } else if (LJIIJ(EnumC1469940oM4.MP4) && LJJIFFI(222) && TextUtils.isEmpty(LJJ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIL() {
        return (this.LIZJ == null && this.LIZIZ == null) ? false : true;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJIILIIL() {
        C1473400oRe c1473400oRe = this.LIZJ;
        return c1473400oRe != null ? c1473400oRe.LJIIIIZZ(211) : "mp4";
    }

    @Override // X.InterfaceC1467050oHP
    public final List<C1474520oTS> LJIILL() {
        C1473400oRe c1473400oRe = this.LIZJ;
        return c1473400oRe == null ? Collections.emptyList() : c1473400oRe.LJIIJ();
    }

    @Override // X.InterfaceC1467050oHP
    public final C1468490oJj LJIJJ() {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJJLIIIJJIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final JSONObject LJIL() {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJJJJLI;
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJJ() {
        List<C1474520oTS> listLJIIJ;
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe == null || (listLJIIJ = c1473400oRe.LJIIJ()) == null || listLJIIJ.size() == 0) {
            return null;
        }
        Iterator<C1474520oTS> it2 = listLJIIJ.iterator();
        while (it2.hasNext()) {
            String strLIZ = it2.next().LIZ(5);
            if (!TextUtils.isEmpty(strLIZ)) {
                return strLIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJJIII() {
        return !TextUtils.isEmpty(LJJII(8)) && LJIIJ(EnumC1469940oM4.HLS) && LJJIFFI(222);
    }

    @Override // X.InterfaceC1467050oHP
    public final List<C1469130oKl> LJJIIJZLJL() {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJJIL;
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final EnumC2281151EQn[] LJJIIZ() {
        C1473400oRe c1473400oRe = this.LIZJ;
        return c1473400oRe != null ? c1473400oRe.LIZIZ : new EnumC2281151EQn[0];
    }

    public final boolean LJJIJL() {
        C1473400oRe c1473400oRe = this.LIZJ;
        return c1473400oRe != null && c1473400oRe.LJ(205).booleanValue();
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJIJ() {
        JSONObject jSONObjectLJII = LJII();
        if (jSONObjectLJII != null) {
            return C786410Ut5.J3(jSONObjectLJII);
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LIZLLL(EnumC2281151EQn enumC2281151EQn) {
        HashMap<String, EnumC2281151EQn> map;
        String key;
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            int iLJI = c1473400oRe.LJI(7);
            if (iLJI == 1) {
                map = c1473400oRe.LJJJJJL;
            } else {
                map = c1473400oRe.LJJJJJ;
            }
            Iterator<Map.Entry<String, EnumC2281151EQn>> it2 = map.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry<String, EnumC2281151EQn> next = it2.next();
                    if (next.getValue().getIndex() == enumC2281151EQn.getIndex()) {
                        key = next.getKey();
                        break;
                    }
                } else {
                    key = null;
                    break;
                }
            }
            if (TextUtils.isEmpty(key)) {
                return enumC2281151EQn.toString(iLJI);
            }
            return key;
        }
        return enumC2281151EQn.toString(0);
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJ(List<C1474520oTS> list) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe == null) {
            return "";
        }
        return c1473400oRe.LIZLLL(list);
    }

    @Override // X.InterfaceC1467050oHP
    public final float LJFF(int i) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJFF(i);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJIIJ(EnumC1469940oM4 enumC1469940oM4) {
        if (this.LIZJ == null) {
            return false;
        }
        int i = C1469950oM5.LIZ[enumC1469940oM4.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return this.LIZJ.LJ(205).booleanValue();
            }
            return this.LIZJ.LJ(206).booleanValue();
        }
        return this.LIZJ.LJ(208).booleanValue();
    }

    @Override // X.InterfaceC1467050oHP
    public final long LJIILJJIL(int i) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            C1470260oMa c1470260oMa = c1473400oRe.LJLLLLLL;
            if (i != 216) {
                if (i != 220) {
                    if (i != 243) {
                        c1470260oMa.getClass();
                    } else {
                        return c1470260oMa.LIZ.LJLJJLL;
                    }
                } else {
                    return c1470260oMa.LIZ.LJLJI;
                }
            } else {
                return c1470260oMa.LIZ.LJJJJLL;
            }
        }
        return 0L;
    }

    @Override // X.InterfaceC1467050oHP
    public final int LJIIZILJ(int i) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJI(i);
        }
        return -1;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIJI(int i) {
        C1473400oRe c1473400oRe;
        List<C1474520oTS> listLJIIJ;
        if (i >= 0 && (c1473400oRe = this.LIZJ) != null && (listLJIIJ = c1473400oRe.LJIIJ()) != null && listLJIIJ.size() != 0) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS.LJJJJJ == i) {
                    return c1474520oTS;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final void LJJI(HashMap<String, EnumC2281151EQn> map) {
        String strLIZ;
        this.LJ = map;
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            int iLJI = c1473400oRe.LJI(7);
            if (map != null && map.size() > 0) {
                if (iLJI == 1) {
                    c1473400oRe.LJJJJJL = map;
                } else {
                    c1473400oRe.LJJJJJ = map;
                }
            } else if (iLJI == 1) {
                map = c1473400oRe.LJJJJJL;
            } else {
                map = c1473400oRe.LJJJJJ;
            }
            List<C1474520oTS> listLJIIJ = c1473400oRe.LJIIJ();
            if (listLJIIJ != null) {
                for (int i = 0; i < listLJIIJ.size(); i++) {
                    C1474520oTS c1474520oTS = (C1474520oTS) ListProtector.get(listLJIIJ, i);
                    if (c1474520oTS != null && c1474520oTS.LJFF() == iLJI) {
                        if (map != null && map.size() > 0) {
                            int i2 = c1474520oTS.LJJIJIL;
                            if (i2 == 1) {
                                strLIZ = c1474520oTS.LIZ(18);
                                if (TextUtils.isEmpty(strLIZ)) {
                                    strLIZ = EnumC2281151EQn.Standard.toString(c1474520oTS.LJJIJIL);
                                }
                            } else if (i2 == 0) {
                                strLIZ = c1474520oTS.LIZ(7);
                                if (TextUtils.isEmpty(strLIZ)) {
                                    strLIZ = EnumC2281151EQn.Standard.toString(c1474520oTS.LJJIJIL);
                                }
                            } else {
                                strLIZ = null;
                            }
                            EnumC2281151EQn enumC2281151EQn = map.get(strLIZ);
                            c1474520oTS.LIZIZ = enumC2281151EQn;
                            if (enumC2281151EQn == null) {
                                c1474520oTS.LIZIZ = EnumC2281151EQn.Standard;
                            }
                        }
                        EnumC2281151EQn resolution = c1474520oTS.getResolution();
                        String strLIZ2 = c1474520oTS.LIZ(32);
                        if (!c1473400oRe.LIZLLL.contains(strLIZ2)) {
                            c1473400oRe.LIZLLL.add(strLIZ2);
                        }
                        if (!c1473400oRe.LIZJ.contains(resolution)) {
                            c1473400oRe.LIZJ.add(resolution);
                        }
                    }
                }
            }
            EnumC2281151EQn[] enumC2281151EQnArr = new EnumC2281151EQn[c1473400oRe.LIZJ.size()];
            c1473400oRe.LIZIZ = enumC2281151EQnArr;
            c1473400oRe.LIZJ.toArray(enumC2281151EQnArr);
            String[] strArr = new String[c1473400oRe.LIZLLL.size()];
            c1473400oRe.LJ = strArr;
            c1473400oRe.LIZLLL.toArray(strArr);
        }
    }

    @Override // X.InterfaceC1467050oHP
    public final boolean LJJIFFI(int i) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJ(i).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC1467050oHP
    public final String LJJII(int i) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJIIIIZZ(i);
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.0VP0, java.lang.Object] */
    public final void LJJIIZI(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video_info");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
            this.LIZLLL = 1;
            C1473400oRe c1473400oRe = new C1473400oRe();
            c1473400oRe.LIZ = this.LIZLLL;
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("data");
            c1473400oRe.LJLLLLLL.LIZ.LJJJJIZL = this.LJI;
            c1473400oRe.LJIIJJI(218, this.LJII);
            c1473400oRe.LIZJ(jSONObjectOptJSONObject2);
            this.LIZJ = c1473400oRe;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("video_ad_list");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            this.LIZ = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    ?? r1 = new Object() { // from class: X.0VP0
                        public List<String> LIZ;
                        public List<String> LIZIZ;
                        public List<String> LIZJ;

                        public final void LIZ(JSONObject jSONObject2) {
                            jSONObject2.optLong(FollowStatusChangeMethod.PARAM_UID);
                            jSONObject2.optString("log_extra");
                            jSONObject2.optInt("skip_time");
                            jSONObject2.optInt("patch_position");
                            jSONObject2.optInt("duration");
                            jSONObject2.optString("external_url");
                            try {
                                JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "play_track_url_list");
                                if (jSONArray != null) {
                                    this.LIZ = LIZIZ(new String[1], jSONArray);
                                }
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            try {
                                JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "playover_track_url_list");
                                if (jSONArray2 != null) {
                                    this.LIZIZ = LIZIZ(new String[1], jSONArray2);
                                }
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            try {
                                JSONArray jSONArray3 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "action_track_url_list");
                                if (jSONArray3 != null) {
                                    this.LIZJ = LIZIZ(new String[1], jSONArray3);
                                }
                            } catch (JSONException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }

                        public static List LIZIZ(String[] strArr, Object obj) {
                            if (strArr.length > 0) {
                                strArr[0] = null;
                            }
                            try {
                                if (obj instanceof String) {
                                    ArrayList arrayList = new ArrayList();
                                    String str = (String) obj;
                                    arrayList.add(str);
                                    if (strArr.length > 0) {
                                        strArr[0] = str;
                                    }
                                    return arrayList;
                                }
                                JSONArray jSONArray = (JSONArray) obj;
                                int length = jSONArray.length();
                                if (length == 0) {
                                    return null;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < length; i2++) {
                                    String string = JSONArrayProtectorUtils.getString(jSONArray, i2);
                                    if (!TextUtils.isEmpty(string)) {
                                        arrayList2.add(string);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    return null;
                                }
                                if (strArr.length > 0) {
                                    strArr[0] = jSONArray.toString();
                                }
                                return arrayList2;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return null;
                            }
                        }
                    };
                    r1.LIZ(JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i));
                    this.LIZ.add((C0VP0) r1);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("live_info");
        if (jSONObjectOptJSONObject3 != null) {
            this.LIZIZ = new C1470250oMZ();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("data");
            C1470250oMZ c1470250oMZ = this.LIZIZ;
            c1470250oMZ.getClass();
            if (jSONObjectOptJSONObject4 != null) {
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("live_info");
                try {
                    if (jSONObjectOptJSONObject5.has("live_0")) {
                        C1903207cs c1903207cs = new C1903207cs();
                        c1470250oMZ.LIZ = c1903207cs;
                        c1903207cs.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject5, "live_0"));
                    }
                    if (jSONObjectOptJSONObject5.has("live_1")) {
                        C1903207cs c1903207cs2 = new C1903207cs();
                        c1470250oMZ.LIZIZ = c1903207cs2;
                        c1903207cs2.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObjectOptJSONObject5, "live_1"));
                    }
                    jSONObjectOptJSONObject5.optInt("backup_status");
                    jSONObjectOptJSONObject5.optInt("live_status");
                    jSONObjectOptJSONObject5.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                    jSONObjectOptJSONObject5.optLong("start_time");
                    jSONObjectOptJSONObject5.optLong("end_time");
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    int i2 = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e2);
                }
                jSONObjectOptJSONObject4.optString("user_id");
                jSONObjectOptJSONObject4.optString("live_id");
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
        if ((jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
            if (jSONObject.optInt("Version") == 4) {
                this.LIZLLL = 4;
            } else {
                this.LIZLLL = 2;
            }
            C1473400oRe c1473400oRe2 = new C1473400oRe();
            this.LIZJ = c1473400oRe2;
            c1473400oRe2.LIZ = this.LIZLLL;
            c1473400oRe2.LIZJ(jSONObject);
        }
        LJJI(this.LJ);
    }

    public final void LJJIJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LJFF = new JSONObject(C786410Ut5.J3(jSONObject));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1471660oOq.LIZIZ("VideoModel", "generate mJsonInfo error");
        }
        LJJIIZI(jSONObject);
    }

    public final C1474520oTS LJJIJIIJI(Map<Integer, String> map) {
        List<C1474520oTS> listLJIIJ;
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null && (listLJIIJ = c1473400oRe.LJIIJ()) != null && listLJIIJ.size() != 0) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS != null) {
                    HashMap map2 = (HashMap) map;
                    if (map2.size() != 0) {
                        for (Map.Entry entry : map2.entrySet()) {
                            int iIntValue = ((Integer) entry.getKey()).intValue();
                            String str = (String) entry.getValue();
                            if (TextUtils.isEmpty(str) || str.equals(c1474520oTS.LIZ(iIntValue))) {
                            }
                        }
                        return c1474520oTS;
                    }
                    return c1474520oTS;
                }
            }
        }
        return null;
    }

    public final void LJJIJIIJIL(JSONObject jSONObject) throws JSONException {
        jSONObject.put("mb_refactor", true);
        LJJIJ(new JSONObject().put("video_info", new JSONObject().put("data", jSONObject)));
    }

    public final void LJJIJIL(Map<String, Object> map) throws JSONException {
        if (map != null && !map.isEmpty()) {
            map.put("mb_refactor", Boolean.TRUE);
            JSONObject jSONObjectPut = new JSONObject().put("video_info", new JSONObject().put("data", new JSONObject(map)));
            this.LJFF = jSONObjectPut;
            LJJIIZI(jSONObjectPut);
        }
    }

    public final void LJJIJLIJ(C1473400oRe c1473400oRe) {
        this.LIZJ = c1473400oRe;
        LJJI(this.LJ);
    }

    @Override // X.InterfaceC1467050oHP
    public final String[] LJI(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        C1903207cs c1903207cs;
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            String[] strArr = c1473400oRe.LJJIJIIJI;
            if (strArr != null && strArr.length > 0) {
                return strArr;
            }
            C1474520oTS c1474520oTSLJIIIZ = c1473400oRe.LJIIIZ(enumC2281151EQn, c1473400oRe.LJI(7), map);
            if (c1474520oTSLJIIIZ == null) {
                return new String[0];
            }
            return c1474520oTSLJIIIZ.LJIIJ();
        }
        C1470250oMZ c1470250oMZ = this.LIZIZ;
        if (c1470250oMZ != null && ((c1903207cs = c1470250oMZ.LIZ) != null || (c1903207cs = c1470250oMZ.LIZIZ) != null)) {
            return c1903207cs.LIZJ;
        }
        return new String[0];
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIILLIIL(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJIIIZ(enumC2281151EQn, c1473400oRe.LJI(7), map);
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIIIZ(EnumC2281151EQn enumC2281151EQn, Map<Integer, String> map, boolean z) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return LJIJJLI(enumC2281151EQn, c1473400oRe.LJI(7), map, z);
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJJIIJ(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map) {
        C1473400oRe c1473400oRe = this.LIZJ;
        if (c1473400oRe != null) {
            return c1473400oRe.LJIIIZ(enumC2281151EQn, i, map);
        }
        return null;
    }

    @Override // X.InterfaceC1467050oHP
    public final C1474520oTS LJIJJLI(EnumC2281151EQn enumC2281151EQn, int i, Map<Integer, String> map, boolean z) {
        C1474520oTS c1474520oTSLJJIIJ = LJJIIJ(enumC2281151EQn, i, map);
        if (!z) {
            return c1474520oTSLJJIIJ;
        }
        EnumC2281151EQn[] allResolutions = EnumC2281151EQn.getAllResolutions();
        if (allResolutions.length <= 0) {
            return c1474520oTSLJJIIJ;
        }
        int length = allResolutions.length - 1;
        if (enumC2281151EQn != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                }
                if (allResolutions[i2].getIndex() == enumC2281151EQn.getIndex()) {
                    length = i2;
                    break;
                }
                i2++;
            }
        }
        int length2 = length;
        if (c1474520oTSLJJIIJ == null) {
            do {
                c1474520oTSLJJIIJ = LJJIIJ(allResolutions[length2], i, null);
                if (c1474520oTSLJJIIJ != null) {
                    break;
                }
                length2 = ((length2 + allResolutions.length) - 1) % allResolutions.length;
            } while (length2 != length);
        }
        return c1474520oTSLJJIIJ;
    }
}
