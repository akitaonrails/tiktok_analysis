package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0X2N, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X2N {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static final List<String> LIZJ = C1697810uHb.LJ(fe.e, "sid_tt", "sid_guard", "uid_tt");

    public static final boolean LJ() {
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL, "lark_inhouse")) {
            return true;
        }
        c844470XAv.getClass();
        return TextUtils.equals(C844470XAv.LJIILL, "local_test");
    }

    public static String LIZJ(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (true) {
            if (-1 >= length) {
                break;
            }
            if (str.charAt(length) == '.') {
                if (z) {
                    if (length > 0) {
                        i = length;
                    }
                } else {
                    z = true;
                }
            }
            length--;
        }
        return str.substring(i);
    }

    public static final String LIZLLL(String str) {
        String strLIZIZ = "";
        if (str != null) {
            try {
                URI uriCreate = URI.create(str);
                if (uriCreate == null) {
                    return "";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(uriCreate.getHost());
                sbLIZ.append(uriCreate.getPath());
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                return strLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return strLIZIZ;
    }

    public static final void LIZIZ(URI uri, Map<String, ? extends List<String>> map) {
        List<String> listLJ;
        try {
            if (LIZIZ && uri != null) {
                try {
                    C844470XAv.LIZ.getClass();
                    listLJ = C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJ(NetworkUtils.getShareCookieHost());
                    if (listLJ != null) {
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) listLJ;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            String strLIZJ = LIZJ(uri.getHost());
                            if (strLIZJ != null && copyOnWriteArrayList.contains(strLIZJ)) {
                                String string = "";
                                HashMap map2 = (HashMap) map;
                                if (!map2.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    Iterator it2 = map2.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        sb.append((Map.Entry) it2.next());
                                        sb.append(";");
                                    }
                                    string = sb.toString();
                                }
                                LIZ(uri, listLJ, string);
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    listLJ = null;
                }
                LJ();
                LJFF(LIZLLL(uri.toString()), null, listLJ);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static void LIZ(URI uri, List list, String str) {
        if (uri != null && str != null) {
            if (TextUtils.isEmpty(str)) {
                if (LJ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lostCookie ");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(uri.getHost());
                    sbLIZ2.append(uri.getPath());
                    sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                    C2188811AlT.LIZIZ(sbLIZ);
                    LJ();
                }
                LJFF(LIZLLL(uri.toString()), str, list);
                return;
            }
            Iterator<String> it2 = LIZJ.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    i++;
                }
            }
            if (i >= LIZJ.size()) {
                return;
            }
            if (LJ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("lessCookie ");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(uri.getHost());
                sbLIZ4.append(uri.getPath());
                sbLIZ3.append(C2188811AlT.LIZIZ(sbLIZ4));
                C2188811AlT.LIZIZ(sbLIZ3);
                LJ();
            }
            LJFF(LIZLLL(uri.toString()), str, list);
        }
    }

    public static void LJFF(String str, String str2, List list) {
        if (LIZ) {
            return;
        }
        LIZ = true;
        String strLIZIZ = "";
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str3 : (CopyOnWriteArrayList) list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(str3);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                arrayList.add(Unit.LIZ);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(strLIZIZ)) {
                jSONObject.put("host", strLIZIZ);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("error_desc", str2);
            }
            jSONObject.put("uri", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C793770VBv.LJ("cookie_error", jSONObject);
    }
}
