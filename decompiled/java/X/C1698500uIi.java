package X;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1698500uIi {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJII;
    public String LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public JSONObject LJIILIIL;
    public JSONObject LJIILJJIL;
    public JSONObject LJIILL;
    public JSONObject LJIILLIIL;
    public JSONObject LJIIZILJ;
    public JSONObject LJIJ;
    public JSONObject LJIJI;
    public JSONObject LJIJJ;
    public JSONObject LJIJJLI;
    public JSONObject LJIL;
    public JSONObject LJJ;
    public boolean LJJIFFI;
    public final String LJJII;
    public int LJJIIJ;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public String LJJIJIL;
    public final Map<String, List<C0VEU>> LJJJJZ;
    public JSONObject LJJJJZI;
    public String LJJJLIIL;
    public String LJJJLL;
    public Map<String, C1698910uJN> LJJJLZIJ;
    public final JSONObject LJJLIIIIJ;
    public HashMap<String, JSONObject> LJJLIIIJ;
    public HashMap<String, String> LJJLIIIJILLIZJL;
    public long LJFF = -1;
    public int LJI = -1;
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public long LJJI = -1;
    public int LJJIII = -1;
    public String LJJIIJZLJL = "1.0.105.5";
    public String LJJIJIIJI = "h2q";
    public final Map<String, String> LJJIJIIJIL = new HashMap();
    public final int LJJIJL = 1;
    public int LJJIJLIJ = 0;
    public String LJJIL = "";
    public long LJJIZ = -1;
    public final HashSet<String> LJJJ = new HashSet<>();
    public String LJJJI = "";
    public int LJJJIL = -1;
    public String LJJJJ = "";
    public int LJJJJI = 0;
    public int LJJJJIZL = -1;
    public int LJJJJJ = -1;
    public int LJJJJJL = 0;
    public String LJJJJL = "";
    public String LJJJJLI = "";
    public String LJJJJLL = "main";
    public boolean LJJJZ = false;
    public long LJJL = -1;
    public int LJJLI = 0;

    public final void LIZJ() {
        JSONObject jSONObjectOptJSONObject;
        try {
            Iterator<String> itKeys = this.LIZ.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject2 = this.LIZ.optJSONObject(itKeys.next());
                if (jSONObjectOptJSONObject2 != null) {
                    String[] strArr = {"main", "backup"};
                    int i = 0;
                    do {
                        String str = strArr[i];
                        if (jSONObjectOptJSONObject2.has(str) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(str)) != null && jSONObjectOptJSONObject.has("drm_license_urls") && jSONObjectOptJSONObject.has("cmaf")) {
                            String strOptString = jSONObjectOptJSONObject.optString("cmaf");
                            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("drm_license_urls");
                            if (!TextUtils.isEmpty(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("widevine") : null) && !TextUtils.isEmpty(strOptString)) {
                                this.LJJJZ = true;
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next = itKeys2.next();
                                    if (!"drm_license_urls".equals(next) && !"cmaf".equals(next) && !"sdk_params".equals(next)) {
                                        jSONObjectOptJSONObject.put(next, "");
                                    }
                                }
                            }
                        }
                        i++;
                    } while (i < 2);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final JSONObject LJI() {
        JSONObject jSONObject = this.LJIIZILJ;
        if (jSONObject != null) {
            return jSONObject;
        }
        return null;
    }

    public C1698500uIi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.LJJII = "none";
        try {
            this.LIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
            LIZJ();
            if (jSONObject.has("common")) {
                this.LIZIZ = JSONObjectProtectorUtils.getJSONObject(jSONObject, "common");
            }
            if (jSONObject.has("node_infos")) {
                this.LJJJJZ = C0VEU.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "node_infos"));
            }
            JSONObject jSONObject2 = this.LIZIZ;
            if (jSONObject2 != null) {
                if (jSONObject2.has("auto") && (jSONObjectOptJSONObject = this.LIZIZ.optJSONObject("auto")) != null && jSONObjectOptJSONObject.has("default")) {
                    this.LIZLLL = jSONObjectOptJSONObject.optString("default");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mDefaultResolution: ");
                    sbLIZ.append(this.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1698940uJQ.LIZJ();
                }
                if (this.LIZIZ.has("app_id")) {
                    this.LJJII = this.LIZIZ.optString("app_id");
                }
                if (this.LIZIZ.has("common_sdk_params")) {
                    this.LJJLIIIIJ = this.LIZIZ.optJSONObject("common_sdk_params");
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LIZJ = 0;
    }

    public final JSONObject LIZLLL(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject == null || !jSONObject.has("list") || (jSONArrayOptJSONArray = jSONObject.optJSONArray("list")) == null) {
            return jSONObject;
        }
        try {
            List listLJIJJLI = LJIJJLI("main", true);
            if (((ArrayList) listLJIJJLI).isEmpty()) {
                listLJIJJLI = LJIJJLI("backup", true);
            }
            JSONArray jSONArray = null;
            if (!listLJIJJLI.isEmpty()) {
                HashSet hashSet = new HashSet(listLJIJJLI);
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i, null);
                    if (strOptString != null && hashSet.contains(strOptString)) {
                        jSONArray2.put(strOptString);
                    }
                }
                jSONArray = jSONArray2;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("abrList=");
            sbLIZ.append(jSONArrayOptJSONArray);
            sbLIZ.append(", supportedArbList=");
            sbLIZ.append(jSONArray);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject.put("list", jSONArray);
                return jSONObject;
            }
            jSONObject.put("list", JSONObject.NULL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LJFF(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r4 = "auto"
            java.lang.String r1 = "main_backup_auto"
            org.json.JSONObject r0 = r5.LIZIZ
            r3 = 0
            if (r0 != 0) goto La
            return r3
        La:
            boolean r0 = r0.has(r1)     // Catch: org.json.JSONException -> L5e
            if (r0 == 0) goto L33
            org.json.JSONObject r0 = r5.LIZIZ     // Catch: org.json.JSONException -> L5e
            org.json.JSONObject r1 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: org.json.JSONException -> L5e
            boolean r0 = r1.has(r6)     // Catch: org.json.JSONException -> L5e
            if (r0 == 0) goto L33
            org.json.JSONObject r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r1, r6)     // Catch: org.json.JSONException -> L5e
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "abr info - using common->main_backup_auto->"
            r1.append(r0)     // Catch: org.json.JSONException -> L5e
            r1.append(r6)     // Catch: org.json.JSONException -> L5e
            X.C2188811AlT.LIZIZ(r1)     // Catch: org.json.JSONException -> L5e
            X.C1698940uJQ.LIZJ()     // Catch: org.json.JSONException -> L5e
            goto L34
        L33:
            r2 = r3
        L34:
            if (r2 != 0) goto L5d
            org.json.JSONObject r0 = r5.LIZIZ     // Catch: org.json.JSONException -> L5e
            boolean r0 = r0.has(r4)     // Catch: org.json.JSONException -> L5e
            if (r0 != 0) goto L3f
            return r3
        L3f:
            org.json.JSONObject r0 = r5.LIZIZ     // Catch: org.json.JSONException -> L5e
            org.json.JSONObject r2 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r4)     // Catch: org.json.JSONException -> L5e
            X.C1698940uJQ.LIZJ()     // Catch: org.json.JSONException -> L5e
            boolean r0 = r5.LJJJZ     // Catch: org.json.JSONException -> L5e
            if (r0 == 0) goto L5c
            X.C1699230uJt.LIZ()     // Catch: org.json.JSONException -> L5e
            java.lang.String r1 = X.C1699230uJt.LIZIZ     // Catch: org.json.JSONException -> L5e
            java.lang.String r0 = "L3"
            boolean r0 = r0.equals(r1)     // Catch: org.json.JSONException -> L5e
            if (r0 == 0) goto L5c
            r5.LIZLLL(r2)     // Catch: org.json.JSONException -> L5e
        L5c:
            return r2
        L5d:
            return r2
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698500uIi.LJFF(java.lang.String):org.json.JSONObject");
    }

    public final ArrayList<String> LJIIJJI(String str) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPlayURLs - invoked - ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (TextUtils.isEmpty(str) || (jSONObject = this.LIZ) == null || jSONObject.length() <= 0) {
            return null;
        }
        String strLJIIL = LJIIL(str);
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> itKeys = this.LIZ.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = this.LIZ.optJSONObject(next)) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(str)) != null) {
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!TextUtils.isEmpty(next2)) {
                        String strOptString = jSONObjectOptJSONObject2.optString(next2);
                        if (URLUtil.isValidUrl(strOptString)) {
                            if (strLJIIL != null && !strLJIIL.equals("")) {
                                int iIndexOf = strOptString.indexOf("?");
                                if (iIndexOf == -1) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("?");
                                    sbLIZ2.append(strLJIIL.substring(1));
                                    strLJIIL = C2188811AlT.LIZIZ(sbLIZ2);
                                } else if (iIndexOf == strOptString.length() - 1) {
                                    strLJIIL = strLJIIL.substring(1);
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(strOptString);
                                sbLIZ3.append(strLJIIL);
                                strOptString = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            arrayList.add(strOptString);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIL(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698500uIi.LJIIL(java.lang.String):java.lang.String");
    }

    public final boolean LJJ(String str) {
        if (!TextUtils.isEmpty(str) && str.equals("auto") && !TextUtils.isEmpty(this.LIZLLL)) {
            return true;
        }
        return false;
    }

    public final boolean LJJI(String str) {
        if (this.LIZ != null && !TextUtils.isEmpty(str)) {
            if (this.LJJIJL == 1 && !this.LJJJ.isEmpty() && this.LJJJ.contains(str)) {
                return true;
            }
            if (this.LIZ.optJSONObject(str) != null) {
                if (this.LJJIJL == 1) {
                    this.LJJJ.add(str);
                }
                return true;
            }
        }
        return false;
    }

    public final String LJJIFFI(String str) {
        int iIndexOf;
        int iIndexOf2 = str.indexOf(".com");
        int iIndexOf3 = str.indexOf(".com:");
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(this.LJIIJ)) {
            if (iIndexOf3 != -1) {
                int i = iIndexOf3 + 5;
                int i2 = i + 1;
                while (i2 < sb.length() && sb.charAt(i2) - '0' >= 0 && sb.charAt(i2) - '0' <= 9) {
                    i2++;
                }
                sb.replace(i, i2, this.LJIIJ);
            } else if (iIndexOf2 != -1 && ((iIndexOf = str.indexOf("vhost")) == -1 || iIndexOf > iIndexOf2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(":");
                sbLIZ.append(this.LJIIJ);
                sb.insert(iIndexOf2 + 4, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        int iIndexOf4 = sb2.indexOf("://");
        if (!TextUtils.isEmpty(this.LJIIIZ)) {
            if (this.LJIIIZ.equals("quic")) {
                if (iIndexOf4 != -1) {
                    sb2.replace(0, iIndexOf4, "httpq");
                }
            } else if (this.LJIIIZ.equals("tls")) {
                if (iIndexOf4 != -1) {
                    sb2.replace(0, iIndexOf4, "https");
                }
            } else if (this.LJIIIZ.equals("tcp")) {
                if (iIndexOf4 != -1) {
                    sb2.replace(0, iIndexOf4, "http");
                }
            } else if ((this.LJIIIZ.equals("h2") || this.LJIIIZ.equals("h2q")) && iIndexOf4 != -1) {
                sb2.replace(0, iIndexOf4, "httpx");
            }
        }
        return sb2.toString();
    }

    public static String LJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("###");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ(String str, String str2) {
        String strLJIIL;
        C1698940uJQ.LIZJ();
        if (!TextUtils.isEmpty(str) && (strLJIIL = LJIIL(str2)) != null && !strLJIIL.equals("")) {
            int iIndexOf = str.indexOf("?");
            if (iIndexOf == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("?");
                sbLIZ.append(strLJIIL.substring(1));
                strLJIIL = C2188811AlT.LIZIZ(sbLIZ);
            } else if (iIndexOf == str.length() - 1) {
                strLJIIL = strLJIIL.substring(1);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(strLJIIL);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public final void LIZIZ(String str, String str2) {
        try {
            if (this.LJJIJL != 1) {
                return;
            }
            if (this.LJJJLZIJ == null) {
                this.LJJJLZIJ = new HashMap();
            }
            if (this.LJJJLZIJ.containsKey(str)) {
                return;
            }
            C1698910uJN c1698910uJN = new C1698910uJN();
            JSONObject jSONObjectLJIILJJIL = LJIILJJIL(str, str2);
            c1698910uJN.LIZ = jSONObjectLJIILJJIL.optLong("vbitrate");
            c1698910uJN.LIZIZ = jSONObjectLJIILJJIL.optLong("v_rtbitrate");
            c1698910uJN.LIZJ = jSONObjectLJIILJJIL.optLong("v_rtbitrate_timestamp");
            c1698910uJN.LIZLLL = jSONObjectLJIILJJIL.optLong("v_rtbitrate_std", -1L);
            c1698910uJN.LJ = jSONObjectLJIILJJIL.optLong("v_rtbitrate_pct", -1L);
            c1698910uJN.LJI = jSONObjectLJIILJJIL.optLong("gop");
            c1698910uJN.LJFF = jSONObjectLJIILJJIL.optLong("fastOpenDuration");
            c1698910uJN.LJIIIZ = jSONObjectLJIILJJIL.optString("vCodec");
            c1698910uJN.LJIIIIZZ = jSONObjectLJIILJJIL.optString("SuggestFormat");
            c1698910uJN.LJII = jSONObjectLJIILJJIL.optString("resolution");
            this.LJJJLZIJ.put(str, c1698910uJN);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final long LJII(String str, String str2) {
        C1698800uJC c1698800uJCLJIIIIZZ = LJIIIIZZ(str, str2);
        if (c1698800uJCLJIIIIZZ != null) {
            return c1698800uJCLJIIIIZZ.LIZ;
        }
        return 0L;
    }

    public final C1698800uJC LJIIIIZZ(String str, String str2) {
        C1698910uJN c1698910uJN;
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        if (!LJJI(str)) {
            return null;
        }
        C1698800uJC c1698800uJC = new C1698800uJC();
        if (str.equals("origin")) {
            long j = this.LJFF;
            if (j > 0) {
                c1698800uJC.LIZ = j;
                return c1698800uJC;
            }
        }
        Map<String, C1698910uJN> map = this.LJJJLZIJ;
        if (map != null && ((HashMap) map).containsKey(str) && (c1698910uJN = (C1698910uJN) ((HashMap) this.LJJJLZIJ).get(str)) != null) {
            long j2 = c1698910uJN.LIZ;
            if (j2 > 0) {
                c1698800uJC.LIZ = j2;
                c1698800uJC.LIZIZ = c1698910uJN.LIZIZ;
                long j3 = c1698910uJN.LIZJ;
                c1698800uJC.LIZJ = j3;
                c1698800uJC.LIZLLL = c1698910uJN.LIZLLL;
                c1698800uJC.LJ = c1698910uJN.LJ;
                c1698800uJC.LJFF = j3;
                return c1698800uJC;
            }
        }
        try {
            JSONObject jSONObjectLJIILIIL = LJIILIIL(str, str2);
            if (jSONObjectLJIILIIL == null) {
                return null;
            }
            c1698800uJC.LIZ = jSONObjectLJIILIIL.optLong("vbitrate");
            c1698800uJC.LIZIZ = jSONObjectLJIILIIL.optLong("v_rtbitrate");
            c1698800uJC.LIZJ = jSONObjectLJIILIIL.optLong("v_rtbitrate_timestamp");
            c1698800uJC.LIZLLL = jSONObjectLJIILIIL.optLong("v_rtbitrate_std", -1L);
            c1698800uJC.LJ = jSONObjectLJIILIIL.optLong("v_rtbitrate_pct", -1L);
            c1698800uJC.LJFF = jSONObjectLJIILIIL.optLong("v_rtbitrate_vpaas_timestamp");
            LIZIZ(str, str2);
            return c1698800uJC;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return c1698800uJC;
        }
    }

    public final long LJIIIZ(String str, String str2) {
        Map<String, C1698910uJN> map;
        C1698910uJN c1698910uJN;
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        long jOptLong = -1;
        if (!LJJI(str)) {
            return -1L;
        }
        int i = this.LJJIII;
        if (i != -1) {
            return i;
        }
        if (this.LJJIJL == 1 && (map = this.LJJJLZIJ) != null && ((HashMap) map).containsKey(str) && (c1698910uJN = (C1698910uJN) ((HashMap) this.LJJJLZIJ).get(str)) != null) {
            long j = c1698910uJN.LJFF;
            if (j != -1) {
                return j;
            }
        }
        try {
            jOptLong = LJIILIIL(str, str2).optLong("FastOpenDuration");
            return jOptLong;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jOptLong;
        }
    }

    public final long LJIIJ(String str, String str2) {
        C1698910uJN c1698910uJN;
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        long jOptLong = 0;
        if (!LJJI(str)) {
            return 0L;
        }
        Map<String, C1698910uJN> map = this.LJJJLZIJ;
        if (map != null && ((HashMap) map).containsKey(str) && (c1698910uJN = (C1698910uJN) ((HashMap) this.LJJJLZIJ).get(str)) != null) {
            long j = c1698910uJN.LJI;
            if (j != -1) {
                return j;
            }
        }
        try {
            jOptLong = LJIILIIL(str, str2).optLong("gop");
            return jOptLong;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jOptLong;
        }
    }

    public final JSONObject LJIILIIL(String str, String str2) {
        JSONObject jSONObject = null;
        if (!LJJI(str)) {
            return null;
        }
        if (this.LJJLIIIIJ == null) {
            return new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params"));
        }
        if (this.LJJLIIIJ == null) {
            this.LJJLIIIJ = new HashMap<>();
        }
        JSONObject jSONObject2 = this.LJJLIIIJ.get(LJ(str, str2));
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params"));
        if (this.LJJLIIIIJ != null) {
            try {
                if (TextUtils.equals("main", str2) && this.LJJLIIIIJ.has("main")) {
                    jSONObject = new JSONObject(this.LJJLIIIIJ.optString("main"));
                } else if (TextUtils.equals("backup", str2) && this.LJJLIIIIJ.has("backup")) {
                    jSONObject = new JSONObject(this.LJJLIIIIJ.optString("backup"));
                }
                if (jSONObject != null && jSONObject.length() > 0) {
                    this.LJJLI = 1;
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject3.opt(next));
                    }
                    jSONObject3 = jSONObject;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("merge error: ");
                sbLIZ.append(th.toString());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
        }
        this.LJJLIIIJ.put(LJ(str, str2), jSONObject3);
        return jSONObject3;
    }

    public final JSONObject LJIILJJIL(String str, String str2) {
        JSONObject jSONObject = null;
        if (!LJJI(str)) {
            return null;
        }
        if (this.LJJLIIIJ == null) {
            this.LJJLIIIJ = new HashMap<>();
        }
        String strLJ = LJ(str, str2);
        JSONObject jSONObject2 = this.LJJLIIIJ.get(strLJ);
        if (jSONObject2 != null) {
            return jSONObject2;
        }
        JSONObject jSONObject3 = new JSONObject(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params"));
        if (this.LJJLIIIIJ != null) {
            try {
                if (TextUtils.equals("main", str2) && this.LJJLIIIIJ.has("main")) {
                    jSONObject = new JSONObject(this.LJJLIIIIJ.optString("main"));
                } else if (TextUtils.equals("backup", str2) && this.LJJLIIIIJ.has("backup")) {
                    jSONObject = new JSONObject(this.LJJLIIIIJ.optString("backup"));
                }
                if (jSONObject != null && jSONObject.length() > 0) {
                    this.LJJLI = 1;
                    Iterator<String> itKeys = jSONObject3.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject3.opt(next));
                    }
                    jSONObject3 = jSONObject;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("merge error: ");
                sbLIZ.append(th.toString());
                C2188811AlT.LIZIZ(sbLIZ);
                C1698940uJQ.LIZJ();
            }
        }
        this.LJJLIIIJ.put(strLJ, jSONObject3);
        return jSONObject3;
    }

    public final JSONObject LJIILL(String str, String str2) {
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        JSONObject jSONObjectLJIILJJIL = null;
        if (LJJI(str)) {
            LIZIZ(str, str2);
            try {
                jSONObjectLJIILJJIL = LJIILJJIL(str, str2);
                return jSONObjectLJIILJJIL;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObjectLJIILJJIL;
    }

    public final String LJIILLIIL(String str, String str2) {
        if (!LJJI(str)) {
            return null;
        }
        if (this.LJJLIIIIJ == null) {
            return JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(this.LIZ, str), str2).optString("sdk_params");
        }
        if (this.LJJLIIIJILLIZJL == null) {
            this.LJJLIIIJILLIZJL = new HashMap<>();
        }
        String strLJ = LJ(str, str2);
        String str3 = this.LJJLIIIJILLIZJL.get(strLJ);
        if (str3 != null) {
            return str3;
        }
        JSONObject jSONObjectLJIILJJIL = LJIILJJIL(str, str2);
        if (jSONObjectLJIILJJIL == null) {
            return null;
        }
        String strJ3 = C786410Ut5.J3(jSONObjectLJIILJJIL);
        this.LJJLIIIJILLIZJL.put(strLJ, strJ3);
        return strJ3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIZILJ(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 0
            r2[r0] = r5
            r1 = 1
            java.lang.String r3 = "cmaf"
            r2[r1] = r3
            r0 = 2
            r2[r0] = r6
            java.lang.String r0 = "getStreamUrlForInputFormat - invoked - %s %s %s"
            X.C786410Ut5.j4(r0, r2)
            X.C1698940uJQ.LIZJ()
            boolean r0 = r4.LJJI(r5)
            r2 = 0
            if (r0 != 0) goto L1e
            return r2
        L1e:
            int r0 = r4.LJJIJL     // Catch: org.json.JSONException -> L48
            if (r0 != r1) goto L2d
            org.json.JSONObject r0 = r4.LIZ     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r5)     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r6)     // Catch: org.json.JSONException -> L48
            goto L4d
        L2d:
            org.json.JSONObject r0 = r4.LIZ     // Catch: org.json.JSONException -> L48
            java.lang.String r0 = r0.optString(r5)     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L48
            r1.<init>(r0)     // Catch: org.json.JSONException -> L48
            boolean r0 = r1.has(r6)     // Catch: org.json.JSONException -> L48
            if (r0 == 0) goto L4c
            java.lang.String r1 = r1.optString(r6)     // Catch: org.json.JSONException -> L48
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L48
            r0.<init>(r1)     // Catch: org.json.JSONException -> L48
            goto L4d
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            r0 = r2
        L4d:
            if (r0 == 0) goto L53
            java.lang.String r2 = r0.optString(r3)
        L53:
            java.lang.String r0 = r4.LIZ(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698500uIi.LJIIZILJ(java.lang.String, java.lang.String):java.lang.String");
    }

    public final String LJIJI(String str, String str2) {
        Map<String, C1698910uJN> map;
        C1698910uJN c1698910uJN;
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        String strOptString = null;
        if (!LJJI(str)) {
            return null;
        }
        if (this.LJJIJL == 1 && (map = this.LJJJLZIJ) != null && ((HashMap) map).containsKey(str) && (c1698910uJN = (C1698910uJN) ((HashMap) this.LJJJLZIJ).get(str)) != null && !TextUtils.isEmpty(c1698910uJN.LJIIIZ)) {
            return c1698910uJN.LJIIIZ;
        }
        try {
            strOptString = LJIILIIL(str, str2).optString("VCodec");
            return strOptString;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return strOptString;
        }
    }

    public final C1698840uJG LJIJJ(String str, String str2) {
        String strOptString;
        C1698840uJG c1698840uJG = new C1698840uJG();
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        if (!LJJI(str)) {
            return c1698840uJG;
        }
        try {
            JSONObject jSONObjectLJIILIIL = LJIILIIL(str, str2);
            if (jSONObjectLJIILIIL != null) {
                strOptString = jSONObjectLJIILIIL.optString("resolution");
            } else {
                strOptString = "";
            }
            String[] strArrSplit = strOptString.split("x");
            if (strArrSplit.length == 2) {
                int i = 0;
                try {
                    int i2 = CastIntegerProtector.parseInt(strArrSplit[0]);
                    int i3 = CastIntegerProtector.parseInt(strArrSplit[1]);
                    c1698840uJG.LIZ = i2;
                    c1698840uJG.LIZIZ = i3;
                    i = i2 * i3;
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c1698840uJG.LIZJ = C1486300omS.LJFF(i);
                return c1698840uJG;
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return c1698840uJG;
    }

    public final List LJIJJLI(String str, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.LIZ;
        if (jSONObject != null && jSONObject.length() > 0 && !TextUtils.isEmpty(str)) {
            Iterator<String> itKeys = this.LIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject3 = this.LIZ.optJSONObject(next);
                if (jSONObjectOptJSONObject3 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject(str)) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("drm_license_urls")) != null) {
                    String strOptString = jSONObjectOptJSONObject2.optString("minimum_security_level");
                    if (!TextUtils.isEmpty(strOptString)) {
                        if (z) {
                            if ("lenient".equals(strOptString)) {
                                arrayList.add(next);
                            }
                        } else {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean LJIL(String str, String str2, boolean z) {
        if (LJJ(str)) {
            str = this.LIZLLL;
        }
        if (!LJJI(str)) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(this.LJJIJIL)) {
                JSONObject jSONObjectLJFF = LJFF(str2);
                if (jSONObjectLJFF == null || !jSONObjectLJFF.has("list")) {
                    return false;
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectLJFF.optJSONArray("list");
                if (jSONArrayOptJSONArray != null) {
                    this.LJJIJIL = jSONArrayOptJSONArray.toString();
                }
            }
            if (!TextUtils.isEmpty(this.LJJIJIL)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\"");
                sbLIZ.append(str);
                sbLIZ.append("\"");
                if (this.LJJIJIL.contains(C2188811AlT.LIZIZ(sbLIZ))) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!z || !TextUtils.equals(str, this.LJJJJ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02b7 A[Catch: JSONException -> 0x03a6, TryCatch #2 {JSONException -> 0x03a6, blocks: (B:39:0x00bc, B:41:0x00c5, B:42:0x00cc, B:44:0x00d1, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:52:0x00fe, B:56:0x011c, B:60:0x013f, B:64:0x0159, B:67:0x0162, B:68:0x0167, B:71:0x0173, B:73:0x017a, B:74:0x018f, B:76:0x0197, B:79:0x01b5, B:81:0x01bd, B:85:0x01c9, B:87:0x01d0, B:89:0x01e5, B:91:0x01ed, B:88:0x01e0, B:94:0x0202, B:99:0x0215, B:101:0x0221, B:102:0x022c, B:104:0x0235, B:107:0x023f, B:108:0x0245, B:110:0x0249, B:112:0x0258, B:114:0x0264, B:116:0x028b, B:118:0x0291, B:119:0x0294, B:121:0x029c, B:123:0x02a3, B:125:0x02c3, B:127:0x02ca, B:129:0x02e1, B:131:0x02eb, B:134:0x02f6, B:136:0x02fd, B:142:0x031c, B:144:0x0323, B:137:0x030d, B:139:0x0313, B:148:0x033f, B:150:0x034b, B:151:0x0356, B:147:0x0337, B:124:0x02b7, B:98:0x020d, B:57:0x012d, B:59:0x0133, B:153:0x0362, B:155:0x0367, B:157:0x0374, B:158:0x037b), top: B:263:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c A[Catch: JSONException -> 0x03a6, TRY_ENTER, TryCatch #2 {JSONException -> 0x03a6, blocks: (B:39:0x00bc, B:41:0x00c5, B:42:0x00cc, B:44:0x00d1, B:46:0x00dd, B:48:0x00e3, B:50:0x00f6, B:52:0x00fe, B:56:0x011c, B:60:0x013f, B:64:0x0159, B:67:0x0162, B:68:0x0167, B:71:0x0173, B:73:0x017a, B:74:0x018f, B:76:0x0197, B:79:0x01b5, B:81:0x01bd, B:85:0x01c9, B:87:0x01d0, B:89:0x01e5, B:91:0x01ed, B:88:0x01e0, B:94:0x0202, B:99:0x0215, B:101:0x0221, B:102:0x022c, B:104:0x0235, B:107:0x023f, B:108:0x0245, B:110:0x0249, B:112:0x0258, B:114:0x0264, B:116:0x028b, B:118:0x0291, B:119:0x0294, B:121:0x029c, B:123:0x02a3, B:125:0x02c3, B:127:0x02ca, B:129:0x02e1, B:131:0x02eb, B:134:0x02f6, B:136:0x02fd, B:142:0x031c, B:144:0x0323, B:137:0x030d, B:139:0x0313, B:148:0x033f, B:150:0x034b, B:151:0x0356, B:147:0x0337, B:124:0x02b7, B:98:0x020d, B:57:0x012d, B:59:0x0133, B:153:0x0362, B:155:0x0367, B:157:0x0374, B:158:0x037b), top: B:263:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJ(java.lang.String r42, java.lang.String r43, java.lang.String r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698500uIi.LJIJ(java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
