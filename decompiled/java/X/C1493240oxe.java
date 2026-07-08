package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.HttpURLConnection;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493240oxe {
    public static volatile C1493240oxe LJIILIIL;
    public boolean LJII;
    public Context LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC1492920ox8 LJIIL;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public final List<String> LJIIIIZZ = new ArrayList();
    public final List<String> LJIIIZ = new ArrayList();

    public static C1493240oxe LJI() {
        if (LJIILIIL == null) {
            synchronized (C1493240oxe.class) {
                try {
                    if (LJIILIIL == null) {
                        LJIILIIL = new C1493240oxe();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILIIL;
    }

    public final JSONObject LJFF() {
        if (!this.LJIIJJI) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("region", this.LIZ);
            jSONObject.put("source", this.LIZIZ);
            jSONObject.put("local_region", this.LJ);
            jSONObject.put("update_region", this.LJFF);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final void LJII() {
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LJIIJ, 0, "ttnet_store_region");
        this.LIZ = sharedPreferencesLIZJ.getString("store_region", "");
        this.LIZIZ = sharedPreferencesLIZJ.getString("store_region_src", "");
        this.LIZJ = sharedPreferencesLIZJ.getString("region_legacy_user", "");
        this.LIZLLL = sharedPreferencesLIZJ.getString("store_sec_uid", "");
        this.LJFF = sharedPreferencesLIZJ.getString("update_region_info", "");
        this.LJII = sharedPreferencesLIZJ.getBoolean("received_region_config", false);
        if (TextUtils.isEmpty(this.LIZ) && !TextUtils.isEmpty(this.LJ)) {
            this.LIZ = this.LJ;
            this.LIZIZ = "local";
        }
        InterfaceC1492920ox8 interfaceC1492920ox8 = this.LJIIL;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        String str4 = this.LIZLLL;
        interfaceC1492920ox8.getClass();
        C0X2A.LIZIZ().LIZJ("", str, str2, str3, str4, "");
        Logger.debug();
    }

    public final void LJIIIIZZ() {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LJIIJ, 0, "ttnet_store_region").edit();
        editorEdit.putBoolean("received_region_config", true);
        editorEdit.apply();
    }

    public static C1493250oxf LIZJ(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it2 = list.iterator();
        String str = "";
        String str2 = "";
        String str3 = "";
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            if (str4.toLowerCase().startsWith("store-country-code=")) {
                str = str4;
            } else if (str4.toLowerCase().startsWith("store-country-code-src=")) {
                str2 = str4;
            } else if (str4.toLowerCase().startsWith("region_legacy_user=")) {
                str3 = str4;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strLIZLLL = LIZLLL(str);
        if (strLIZLLL.isEmpty()) {
            return null;
        }
        return new C1493250oxf(strLIZLLL, LIZLLL(str2), LIZLLL(str3));
    }

    public static String LIZLLL(String str) {
        String[] strArrSplit;
        String[] strArrSplit2;
        if (TextUtils.isEmpty(str) || (strArrSplit = str.split(";")) == null || strArrSplit.length <= 0 || (strArrSplit2 = strArrSplit[0].trim().split("=")) == null || strArrSplit2.length != 2) {
            return "";
        }
        return strArrSplit2[1];
    }

    public final Request LIZ(Request request) {
        boolean z;
        String str;
        if (!this.LJIIJJI || TextUtils.isEmpty(request.getHost()) || request.isPureRequest()) {
            return null;
        }
        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C2088908Gh.LIZIZ(request.getHost(), (String) it2.next())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (!this.LJII && !TextUtils.isEmpty(this.LJI)) {
            arrayList.add(new C080U("x-tt-app-init-region", this.LJI));
        } else if (!z) {
            return null;
        }
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        if (!TextUtils.isEmpty(request.getPath())) {
            if (!"/get_domains/v5/".equals(request.getPath())) {
                Iterator it3 = ((ArrayList) this.LJIIIIZZ).iterator();
                while (it3.hasNext()) {
                    if (C2088908Gh.LIZIZ(request.getPath(), (String) it3.next())) {
                        C2089008Gi c2089008Gi = new C2089008Gi(request.getUrl());
                        c2089008Gi.LIZLLL("okhttp_version", "4.2.243.57-tiktok");
                        c2089008Gi.LIZLLL("use_store_region_cookie", "1");
                        c0xmbNewBuilder.LIZJ(c2089008Gi.LJ());
                    }
                }
            }
            c0xmbNewBuilder.LIZJ = arrayList;
            return c0xmbNewBuilder.LIZ();
        }
        if (!this.LIZ.isEmpty()) {
            str = this.LIZ;
        } else if (!this.LJ.isEmpty()) {
            str = this.LJ;
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new C080U("x-tt-store-region", str));
        }
        if (!TextUtils.isEmpty(this.LIZIZ)) {
            arrayList.add(new C080U("x-tt-store-region-src", this.LIZIZ));
        }
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }

    public final boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
        while (it2.hasNext()) {
            if (C2088908Gh.LIZIZ(str, (String) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LJ(String str, Map map) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : map.keySet()) {
                if (str.equalsIgnoreCase(str2)) {
                    List list = (List) map.get(str2);
                    if (list != null && list.size() > 0) {
                        return (String) ListProtector.get(list, list.size() - 1);
                    }
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final void LJIIIZ(HttpURLConnection httpURLConnection, byte[] bArr, C2115308Ql c2115308Ql) {
        String strLIZIZ;
        if (httpURLConnection == null || !this.LJIIJJI || !LIZIZ(httpURLConnection.getURL().getPath())) {
            return;
        }
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        List<String> list = headerFields.get("Set-Cookie");
        if (list == null || list.isEmpty()) {
            list = headerFields.get("Set-Cookie".toLowerCase());
        }
        C1493250oxf c1493250oxfLIZJ = LIZJ(list);
        String strLJ = LJ("x-tt-with-tnc", headerFields);
        String path = "";
        if (TextUtils.isEmpty(strLJ) || !strLJ.equals("1")) {
            strLIZIZ = "";
        } else {
            try {
                String string = JSONObjectProtectorUtils.getString(new JSONObject(new String(bArr)), "tnc_data");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("{\"data\": ");
                sbLIZ.append(string);
                sbLIZ.append("}");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                strLIZIZ = "";
            }
        }
        if (c1493250oxfLIZJ == null) {
            if (TextUtils.isEmpty(strLIZIZ)) {
                return;
            } else {
                c1493250oxfLIZJ = new C1493250oxf("", "", "");
            }
        }
        String strLJ2 = LJ("x-tt-store-sec-uid", headerFields);
        String strLJ3 = LJ("x-tt-logid", headerFields);
        String strLJ4 = LJ("x-tt-tnc-attr", headerFields);
        String strLJ5 = LJ("x-ss-etag", headerFields);
        String strLJ6 = LJ("x-tt-tnc-config", headerFields);
        JSONObject jSONObject = new JSONObject();
        try {
            path = httpURLConnection.getURL().getPath();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(httpURLConnection.getURL().getHost());
            sbLIZ2.append(path);
            jSONObject.put("url", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1493250oxfLIZJ.LIZ);
            sbLIZ3.append(",");
            sbLIZ3.append(c1493250oxfLIZJ.LIZIZ);
            jSONObject.put("store_region", C2188811AlT.LIZIZ(sbLIZ3));
            jSONObject.put("region_legacy_user", c1493250oxfLIZJ.LIZJ);
            jSONObject.put("logId", strLJ3);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        String str = c1493250oxfLIZJ.LIZ;
        String str2 = c1493250oxfLIZJ.LIZIZ;
        String str3 = c1493250oxfLIZJ.LIZJ;
        String strJ3 = C786410Ut5.J3(jSONObject);
        try {
            C1493630oyH.LIZIZ();
            C1493630oyH.LIZJ.notifyStoreRegionUpdated(path, str, str2, str3, strLJ4, strLJ5, strLJ6, strLIZIZ, strJ3, strLJ2, strLJ3);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public final void LJIIJ(C0XLY c0xly, String str, byte[] bArr) {
        JSONObject jSONObject;
        boolean z;
        if (!this.LJIIJJI) {
            return;
        }
        try {
            URI uriLJ = C2088908Gh.LJ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uriLJ.getHost());
            sbLIZ.append(uriLJ.getPath());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (TextUtils.isEmpty(uriLJ.getPath()) || !LIZIZ(uriLJ.getPath())) {
                return;
            }
            C1493250oxf c1493250oxfLIZJ = LIZJ(c0xly.LLILZLL.LJIIJJI("Set-Cookie"));
            String strLIZ = c0xly.LIZ("x-ss-etag", null);
            String strLIZ2 = c0xly.LIZ("x-tt-tnc-attr", null);
            String strLIZ3 = c0xly.LIZ("x-tt-with-tnc", null);
            if (!TextUtils.isEmpty(strLIZ3) && strLIZ3.equals("1")) {
                try {
                    jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(new String(bArr)), "tnc_data");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            if (c1493250oxfLIZJ == null) {
                if (jSONObject != null) {
                    C1492910ox7.LIZ(strLIZ, jSONObject, strLIZ2, false);
                    return;
                }
                return;
            }
            Logger.debug();
            boolean z2 = true;
            boolean z3 = !this.LIZ.equals(c1493250oxfLIZJ.LIZ);
            String strLIZ4 = c0xly.LIZ("x-tt-store-sec-uid", null);
            if (strLIZ4 == null) {
                strLIZ4 = "";
            }
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LJIIJ, 0, "ttnet_store_region").edit();
            if (this.LIZ.equals(c1493250oxfLIZJ.LIZ) && this.LIZIZ.equals(c1493250oxfLIZJ.LIZIZ) && strLIZ4.equals(this.LIZLLL)) {
                z = false;
            } else {
                String str2 = c1493250oxfLIZJ.LIZ;
                this.LIZ = str2;
                this.LIZIZ = c1493250oxfLIZJ.LIZIZ;
                this.LIZLLL = strLIZ4;
                editorEdit.putString("store_region", str2);
                editorEdit.putString("store_region_src", this.LIZIZ);
                editorEdit.putString("store_sec_uid", this.LIZLLL);
                z = true;
            }
            if (!this.LIZJ.equals(c1493250oxfLIZJ.LIZJ)) {
                String str3 = c1493250oxfLIZJ.LIZJ;
                this.LIZJ = str3;
                editorEdit.putString("region_legacy_user", str3);
            } else {
                z2 = z;
            }
            Logger.debug();
            boolean zLIZ = C1492910ox7.LIZ(strLIZ, jSONObject, strLIZ2, z3);
            if (z2) {
                String strLIZ5 = c0xly.LIZ("x-tt-logid", null);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(uriLJ.getPath());
                sbLIZ2.append(",");
                sbLIZ2.append(strLIZ5);
                sbLIZ2.append(",");
                sbLIZ2.append(c1493250oxfLIZJ.LIZ);
                sbLIZ2.append(",");
                sbLIZ2.append(c1493250oxfLIZJ.LIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                this.LJFF = strLIZIZ2;
                editorEdit.putString("update_region_info", strLIZIZ2);
                editorEdit.apply();
                InterfaceC1492920ox8 interfaceC1492920ox8 = this.LJIIL;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("url", strLIZIZ);
                    jSONObject3.put("logId", strLIZ5);
                    jSONObject2.put("tnc", zLIZ);
                    jSONObject2.put("base", jSONObject3);
                    jSONObject2.put("report_time", System.currentTimeMillis());
                    jSONObject2.put("store_region", this.LIZ);
                    jSONObject2.put("source", this.LIZIZ);
                    jSONObject2.put("region_legacy_user", this.LIZJ);
                    jSONObject2.put("local", this.LJ);
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                ((C1492910ox7) interfaceC1492920ox8).LIZ.sendAppMonitorEvent(C786410Ut5.J3(jSONObject2), "store_idc");
                InterfaceC1492920ox8 interfaceC1492920ox82 = this.LJIIL;
                String str4 = this.LIZ;
                String str5 = this.LIZIZ;
                String str6 = this.LIZJ;
                String str7 = this.LIZLLL;
                interfaceC1492920ox82.getClass();
                C0X2A.LIZIZ().LIZJ("", str4, str5, str6, str7, strLIZ5);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
