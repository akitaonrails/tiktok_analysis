package X;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698510uIj {
    public C1698830uJF[] LIZ;
    public C1698500uIi LIZIZ;
    public String[] LIZJ;
    public int LIZLLL;
    public int LJ;

    public final ArrayList<String> LIZLLL() {
        int i = this.LIZLLL;
        ArrayList<String> arrayList = null;
        if (i == 2) {
            if (LJJII()) {
                return this.LIZIZ.LJIIJJI("backup");
            }
            return null;
        }
        if (i == 1) {
            C1698830uJF[] c1698830uJFArr = this.LIZ;
            if (c1698830uJFArr != null && c1698830uJFArr.length != 0) {
                arrayList = new ArrayList<>();
                for (C1698830uJF c1698830uJF : this.LIZ) {
                    if (URLUtil.isValidUrl(c1698830uJF.LIZIZ)) {
                        arrayList.add(c1698830uJF.LIZIZ);
                    }
                }
            }
        }
        return arrayList;
    }

    public final C1698830uJF LJIIJ() {
        C1698830uJF[] c1698830uJFArr = this.LIZ;
        if (c1698830uJFArr != null && c1698830uJFArr.length != 0) {
            for (C1698830uJF c1698830uJF : c1698830uJFArr) {
                if (c1698830uJF.LIZ != null) {
                    return c1698830uJF;
                }
            }
        }
        return null;
    }

    public final boolean LJJII() {
        return this.LIZLLL == 2 && this.LIZIZ != null;
    }

    public final JSONObject LIZJ() {
        if (!LJJII()) {
            return null;
        }
        JSONObject jSONObject = this.LIZIZ.LJIL;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String LJI() {
        if (LJJII()) {
            return this.LIZIZ.LIZLLL;
        }
        return null;
    }

    public final int LJII() {
        Map<String, C1698910uJN> map;
        C1698910uJN c1698910uJN;
        int i;
        int i2;
        if (!LJJII()) {
            return -1;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        int i3 = c1698500uIi.LJJJIL;
        if (i3 >= 0) {
            return i3;
        }
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(c1698500uIi.LIZ, "origin"), "main");
            String str = (c1698500uIi.LJJIJL != 1 || (map = c1698500uIi.LJJJLZIJ) == null || !((HashMap) map).containsKey("origin") || (c1698910uJN = (C1698910uJN) ((HashMap) c1698500uIi.LJJJLZIJ).get("origin")) == null || TextUtils.isEmpty(c1698910uJN.LJII)) ? "" : c1698910uJN.LJII;
            if (TextUtils.isEmpty(str)) {
                JSONObject jSONObjectLJIILIIL = c1698500uIi.LJIILIIL("origin", "main");
                String strOptString = jSONObjectLJIILIIL != null ? jSONObjectLJIILIIL.optString("resolution") : "";
                if (c1698500uIi.LJJJLZIJ != null) {
                    C1698910uJN c1698910uJN2 = new C1698910uJN();
                    c1698910uJN2.LJII = strOptString;
                    ((HashMap) c1698500uIi.LJJJLZIJ).put("origin", c1698910uJN2);
                }
                str = strOptString;
            }
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("x");
                if (strArrSplit.length == 2) {
                    try {
                        i = CastIntegerProtector.parseInt(strArrSplit[0]);
                    } catch (NumberFormatException e) {
                        e = e;
                        i = 0;
                    }
                    try {
                        i2 = CastIntegerProtector.parseInt(strArrSplit[1]);
                    } catch (NumberFormatException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        i2 = 0;
                    }
                    if (i2 > 0 && i >= i2) {
                        c1698500uIi.LJJJIL = 1;
                    } else if (i > 0 && i2 > i) {
                        c1698500uIi.LJJJIL = 0;
                    }
                    c1698500uIi.LJJJJJL = C1486300omS.LJFF(i * i2);
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "flv");
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            String file = new URL(string).getFile();
                            int iIndexOf = file.indexOf("/");
                            int i4 = iIndexOf + 1;
                            int iIndexOf2 = file.indexOf(47, i4);
                            if (iIndexOf < iIndexOf2) {
                                c1698500uIi.LJJJJL = file.substring(i4, iIndexOf2);
                            }
                        } catch (MalformedURLException e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        }
                    }
                }
            }
        } catch (JSONException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        return c1698500uIi.LJJJIL;
    }

    public final String LJIIIZ() {
        if (!LJJII()) {
            return "";
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (TextUtils.isEmpty(c1698500uIi.LJJJJL)) {
            String strLJIJ = c1698500uIi.LJIJ("origin", "flv", "main", false);
            if (!TextUtils.isEmpty(strLJIJ)) {
                String[] strArrSplit = strLJIJ.split("stream-");
                if (strArrSplit.length > 0) {
                    String[] strArrSplit2 = strArrSplit[0].split("/");
                    if (strArrSplit2.length > 0) {
                        c1698500uIi.LJJJJL = strArrSplit2[strArrSplit2.length - 1];
                    }
                }
            }
        }
        return c1698500uIi.LJJJJL;
    }

    public final String LJIILIIL() {
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        if (LJJII() && (jSONObject = (c1698500uIi = this.LIZIZ).LIZIZ) != null && jSONObject.has("room_id")) {
            return c1698500uIi.LIZIZ.optString("room_id");
        }
        return null;
    }

    public final String LJIILL() {
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        if (LJJII() && (jSONObject = (c1698500uIi = this.LIZIZ).LIZIZ) != null && jSONObject.has("session_id")) {
            return c1698500uIi.LIZIZ.optString("session_id");
        }
        return null;
    }

    public final String LJIJ() {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (TextUtils.isEmpty(c1698500uIi.LJJJJLI) && (jSONObject = c1698500uIi.LIZ) != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject2 = c1698500uIi.LIZ.optJSONObject(itKeys.next());
                if (jSONObjectOptJSONObject2 != null) {
                    String[] strArr = {"main", "backup"};
                    int i = 0;
                    do {
                        String str = strArr[i];
                        if (jSONObjectOptJSONObject2.has(str) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(str)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("flv");
                            if (TextUtils.isEmpty(strOptString)) {
                                strOptString = jSONObjectOptJSONObject.optString("cmaf");
                                if (TextUtils.isEmpty(strOptString)) {
                                    strOptString = jSONObjectOptJSONObject.optString("hls");
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = jSONObjectOptJSONObject.optString("lls");
                                    }
                                }
                            }
                            String strLIZIZ = C1486300omS.LIZIZ(strOptString);
                            if (!TextUtils.isEmpty(strLIZIZ)) {
                                c1698500uIi.LJJJJLI = strLIZIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("streamName:");
                                sbLIZ.append(c1698500uIi.LJJJJLI);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C1698940uJQ.LIZJ();
                                return c1698500uIi.LJJJJLI;
                            }
                        }
                        i++;
                    } while (i < 2);
                }
            }
        }
        return c1698500uIi.LJJJJLI;
    }

    public final int LJIL() {
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        int iOptInt;
        if (LJJII() && (jSONObject = (c1698500uIi = this.LIZIZ).LIZIZ) != null && jSONObject.has("user_count") && (iOptInt = c1698500uIi.LIZIZ.optInt("user_count", -1)) >= 0) {
            return iOptInt;
        }
        return -1;
    }

    public final boolean LJJIII() {
        if (LJJII()) {
            return this.LIZIZ.LJJJZ;
        }
        return false;
    }

    public final String LIZ(String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        if (LJJII() && str != null) {
            this.LIZIZ.getClass();
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    if (jSONObject2.has("adaptationSet") && (jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "adaptationSet")) != null && jSONObject.has("representation") && (jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "representation")) != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                            if (jSONObject3.has("defaultSelect") && jSONObject3.has("url") && jSONObject3.optInt("defaultSelect") == 1) {
                                return JSONObjectProtectorUtils.getString(jSONObject3, "url");
                            }
                        }
                        return null;
                    }
                    return null;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public final JSONObject LJIIL(String str) {
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        c1698500uIi.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = c1698500uIi.LIZ;
        if (jSONObject2 != null && jSONObject2.length() > 0) {
            Iterator<String> itKeys = c1698500uIi.LIZ.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!next.isEmpty() && !"auto".equals(next)) {
                        String strLJIIZILJ = c1698500uIi.LJIIZILJ(next, str);
                        if (!strLJIIZILJ.isEmpty()) {
                            jSONObject.put(next, strLJIIZILJ);
                        }
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return jSONObject;
    }

    public final JSONObject LJIJI(String str) {
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        if (!LJJII() || (jSONObject = (c1698500uIi = this.LIZIZ).LIZ) == null || jSONObject.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = c1698500uIi.LJJ;
        if (jSONObject2 == null) {
            Iterator<String> itKeys = c1698500uIi.LIZ.keys();
            c1698500uIi.LJJ = new JSONObject();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    JSONObject jSONObjectLJIILIIL = c1698500uIi.LJIILIIL(next, str);
                    if (jSONObjectLJIILIIL != null && jSONObjectLJIILIIL.has("stream_suffix")) {
                        c1698500uIi.LJJ.put(jSONObjectLJIILIIL.optString("stream_suffix"), next);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            return c1698500uIi.LJJ;
        }
        return jSONObject2;
    }

    public final boolean LJJIFFI(String str) {
        if (!LJJII()) {
            return false;
        }
        return this.LIZIZ.LJJI(str);
    }

    public final void LJJIIJ(String str) {
        if (!LJJII()) {
            return;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        if (c1698500uIi.LJJI(str)) {
            c1698500uIi.LIZLLL = str;
        }
    }

    public final void LJJIIJZLJL(int i) {
        if (!LJJII()) {
            return;
        }
        this.LIZIZ.LJJIII = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFastOpenDuration: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
    }

    public final long LJ(String str, String str2) {
        if (!LJJII()) {
            return 0L;
        }
        return this.LIZIZ.LJII(str, str2);
    }

    public final String LJFF(String str, String str2) {
        String strOptString = null;
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        if (c1698500uIi.LJJI(str)) {
            try {
                strOptString = c1698500uIi.LJIILIIL(str, str2).optString("drType");
                return strOptString;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strOptString;
    }

    public final String LJIIIIZZ(long j, String str) {
        C1698500uIi c1698500uIi;
        JSONObject jSONObject;
        if (LJJII() && (jSONObject = (c1698500uIi = this.LIZIZ).LIZ) != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = c1698500uIi.LIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (c1698500uIi.LJIL(next, str, false) && j == c1698500uIi.LJII(next, str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public final JSONObject LJIILJJIL(String str, String str2) {
        if (!LJJII()) {
            return null;
        }
        return this.LIZIZ.LJIILL(str, str2);
    }

    public final long LJIILLIIL(String str, String str2) {
        long jOptLong = 0;
        if (!LJJII()) {
            return 0L;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJI(str)) {
            try {
                jOptLong = c1698500uIi.LJIILIIL(str, str2).optLong("v_rtbitrate");
                return jOptLong;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jOptLong;
    }

    public final long LJIIZILJ(String str, String str2) {
        long jOptLong = 0;
        if (!LJJII()) {
            return 0L;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJI(str)) {
            try {
                jOptLong = c1698500uIi.LJIILIIL(str, str2).optLong("v_rtpsnr");
                return jOptLong;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jOptLong;
    }

    public final String LJIJJ(String str, String str2) {
        Map<String, C1698910uJN> map;
        C1698910uJN c1698910uJN;
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        if (!c1698500uIi.LJJI(str)) {
            return null;
        }
        String str3 = "cmaf";
        if (c1698500uIi.LJJIJL == 1 && (map = c1698500uIi.LJJJLZIJ) != null && ((HashMap) map).containsKey(str) && (c1698910uJN = (C1698910uJN) ((HashMap) c1698500uIi.LJJJLZIJ).get(str)) != null && !TextUtils.isEmpty(c1698910uJN.LJIIIIZZ)) {
            if (!c1698500uIi.LJJJZ) {
                return c1698910uJN.LJIIIIZZ;
            }
        } else {
            try {
                String strOptString = c1698500uIi.LJIILIIL(str, str2).optString("SuggestFormat");
                if (!c1698500uIi.LJJJZ) {
                    str3 = strOptString;
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                str3 = null;
            }
            if (str3 == null || str3.isEmpty()) {
                return null;
            }
        }
        return str3;
    }

    public final String LJIJJLI(String str, String str2) {
        String strOptString;
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        if (c1698500uIi.LJJI(str)) {
            try {
                JSONObject jSONObjectLJIILIIL = c1698500uIi.LJIILIIL(str, str2);
                strOptString = jSONObjectLJIILIIL.optString("SuggestProtocol");
                c1698500uIi.LJJIIJ = jSONObjectLJIILIIL.optInt("QuicDisableOnFreeFlow", 0);
                c1698500uIi.LJJIIJZLJL = jSONObjectLJIILIIL.optString("QuicPluginMinVersion", "1.0.105.5");
                jSONObjectLJIILIIL.optInt("EnableQuicPluginVersionCheck", 0);
                c1698500uIi.LJJIIZ = jSONObjectLJIILIIL.optInt("EnableQuicDegradeInNonPreivew", 0);
                c1698500uIi.LJJIIZI = jSONObjectLJIILIIL.optInt("EnableQuicByUserSetQosConstraint", 0);
                c1698500uIi.LJJIJIIJI = jSONObjectLJIILIIL.optString("FastFirstFrameProtocol", "h2q");
                c1698500uIi.LJJIJ = jSONObjectLJIILIIL.optInt("EnableQuicDegradeInFaultFormat", 0);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                strOptString = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("protocol:");
            sbLIZ.append(strOptString);
            sbLIZ.append(", mDisableQuicOnFreeFlow: ");
            sbLIZ.append(c1698500uIi.LJJIIJ);
            sbLIZ.append(", mQuicPluginMinVersion:");
            sbLIZ.append(c1698500uIi.LJJIIJZLJL);
            sbLIZ.append(", mEnableQuicDegradeInNonPreivew: ");
            sbLIZ.append(c1698500uIi.LJJIIZ);
            sbLIZ.append(", mEnableQuicByUserSetQosConstraint: ");
            sbLIZ.append(c1698500uIi.LJJIIZI);
            sbLIZ.append(", mEnableQuicDegradeInFaultFormat: ");
            sbLIZ.append(c1698500uIi.LJJIJ);
            sbLIZ.append(", mFastFirstFrameProtocol: ");
            sbLIZ.append(c1698500uIi.LJJIJIIJI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            if (strOptString != null && !strOptString.isEmpty()) {
                return strOptString;
            }
        }
        return null;
    }

    public final int LJJ(String str, String str2) {
        int length;
        int i;
        String[] strArrSplit;
        if (!LJJII()) {
            return -1;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        if (!c1698500uIi.LJJI(str)) {
            return -1;
        }
        try {
            strArrSplit = c1698500uIi.LJIILIIL(str, str2).optString("resolution").split("x");
            length = strArrSplit.length;
        } catch (JSONException e) {
            e = e;
            length = -1;
        }
        if (length < 2) {
            return -1;
        }
        try {
            try {
                length = CastIntegerProtector.parseInt(strArrSplit[0]);
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                i = -1;
            }
        } catch (NumberFormatException e3) {
            e = e3;
        }
        try {
            i = CastIntegerProtector.parseInt(strArrSplit[1]);
            if (length == -1 && i != -1) {
                return length | (i << 16);
            }
        } catch (NumberFormatException e4) {
            e = e4;
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
        TryCatchGuardChecker.doCheck(e);
        i = -1;
        return length == -1 ? -1 : -1;
    }

    public final String LJJI(String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        c1698500uIi.getClass();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (c1698500uIi.LJJ(str)) {
            str = c1698500uIi.LIZLLL;
        }
        JSONObject jSONObjectOptJSONObject3 = c1698500uIi.LIZ.optJSONObject(str);
        if (jSONObjectOptJSONObject3 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str2)) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("drm_license_urls")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject2.optString("pssh");
    }

    public final JSONObject LIZIZ(int i, String str, boolean z) {
        if (!LJJII()) {
            return null;
        }
        C1698500uIi c1698500uIi = this.LIZIZ;
        if (c1698500uIi.LJIILLIIL != null && c1698500uIi.LJJJJIZL == c1698500uIi.LJJJJI && c1698500uIi.LJJJJJ == i && c1698500uIi.LJJJJLL.equals(str)) {
            return c1698500uIi.LJIILLIIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wjd test getAbrBitrateMap level:");
        sbLIZ.append(str);
        sbLIZ.append(", strategyName:");
        sbLIZ.append(i);
        sbLIZ.append(", isAbr:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LJ();
        c1698500uIi.LJJJJIZL = c1698500uIi.LJJJJI;
        c1698500uIi.LJJJJLL = str;
        c1698500uIi.LJJJJJ = i;
        JSONObject jSONObject = c1698500uIi.LIZ;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        Iterator<String> itKeys = c1698500uIi.LIZ.keys();
        c1698500uIi.LJIILLIIL = new JSONObject();
        c1698500uIi.LJIIZILJ = new JSONObject();
        c1698500uIi.LJIJ = new JSONObject();
        c1698500uIi.LJIJI = new JSONObject();
        c1698500uIi.LJIJJ = new JSONObject();
        c1698500uIi.LJIJJLI = new JSONObject();
        c1698500uIi.LJIL = new JSONObject();
        c1698500uIi.LJJI = -1L;
        JSONObject jSONObject2 = new JSONObject();
        new ArrayList();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (i == 21 && !TextUtils.isEmpty(c1698500uIi.LJJJI)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("\"");
                    sbLIZ2.append(next);
                    sbLIZ2.append("\"");
                    if (!c1698500uIi.LJJJI.contains(C2188811AlT.LIZIZ(sbLIZ2))) {
                    }
                }
                if (!z || c1698500uIi.LJIL(next, str, false)) {
                    C1698840uJG c1698840uJGLJIJJ = c1698500uIi.LJIJJ(next, str);
                    JSONArray jSONArray = new JSONArray();
                    int i2 = c1698840uJGLJIJJ.LIZ;
                    int i3 = c1698840uJGLJIJJ.LIZIZ;
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    jSONArray.put(i2);
                    int i4 = c1698840uJGLJIJJ.LIZ;
                    int i5 = c1698840uJGLJIJJ.LIZIZ;
                    if (i4 <= i5) {
                        i4 = i5;
                    }
                    jSONArray.put(i4);
                    c1698500uIi.LJIJJLI.put(next, jSONArray);
                    c1698500uIi.LJIL.put(next, c1698840uJGLJIJJ.LIZJ);
                    C1698800uJC c1698800uJCLJIIIIZZ = c1698500uIi.LJIIIIZZ(next, str);
                    if (c1698800uJCLJIIIIZZ != null) {
                        c1698500uIi.LJIILLIIL.put(next, c1698800uJCLJIIIIZZ.LIZ);
                        long j = c1698800uJCLJIIIIZZ.LIZIZ;
                        if (j > 0) {
                            c1698500uIi.LJIIZILJ.put(next, j);
                        }
                        long j2 = c1698800uJCLJIIIIZZ.LIZJ;
                        if (j2 > 0) {
                            c1698500uIi.LJIJ.put(next, j2);
                        }
                        long j3 = c1698800uJCLJIIIIZZ.LIZLLL;
                        if (j3 > 0) {
                            c1698500uIi.LJIJI.put(next, j3);
                        }
                        long j4 = c1698800uJCLJIIIIZZ.LJ;
                        if (j4 > 0) {
                            c1698500uIi.LJIJJ.put(next, j4);
                        }
                        long j5 = c1698800uJCLJIIIIZZ.LJFF;
                        if (j5 > 0) {
                            c1698500uIi.LJJL = j5;
                        }
                        long j6 = c1698800uJCLJIIIIZZ.LIZ;
                        if (j6 > c1698500uIi.LJJI) {
                            c1698500uIi.LJJI = j6;
                        }
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getAbrBitrateMap level:");
        sbLIZ3.append(str);
        sbLIZ3.append(",strategyName:");
        sbLIZ3.append(i);
        sbLIZ3.append(",isAbr:");
        sbLIZ3.append(z);
        sbLIZ3.append(",mAbrBitrateInfoMap:");
        sbLIZ3.append(C786410Ut5.J3(c1698500uIi.LJIILLIIL));
        sbLIZ3.append(",gearMinEdgeMap:");
        sbLIZ3.append(C786410Ut5.J3(jSONObject2));
        C2188811AlT.LIZIZ(sbLIZ3);
        C1698940uJQ.LIZ();
        return c1698500uIi.LJIILLIIL;
    }

    public final String LJIIJJI(String str, String str2, String str3, boolean z) {
        if (!LJJII()) {
            return null;
        }
        return this.LIZIZ.LJIJ(str, str2, str3, z);
    }
}
