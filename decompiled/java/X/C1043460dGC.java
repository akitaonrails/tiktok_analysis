package X;

import android.webkit.WebResourceResponse;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dGC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043460dGC {
    public static final C1043460dGC LIZ = new C1043460dGC();

    public static List LIZIZ(SSPResponse.PreConnect[] preConnectArr) {
        int iLJIIJJI;
        k kVarLJJIIZ;
        int i = C992820bwW.LIZ().preconnectImportance;
        if (preConnectArr != null) {
            ArrayList arrayList = new ArrayList();
            for (SSPResponse.PreConnect preConnect : preConnectArr) {
                n nVar = preConnect.custom;
                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("importance")) != null) {
                    iLJIIJJI = kVarLJJIIZ.LJIIJJI();
                } else {
                    iLJIIJJI = 0;
                }
                if (iLJIIJJI >= i) {
                    arrayList.add(preConnect);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final String LIZJ(String str) {
        int iLJJIZ;
        if (!a0.LJJJIL(str) && (iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6)) != -1) {
            return str.substring(0, iLJJIZ);
        }
        return str;
    }

    public static String LJ(List list) {
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<!DOCTYPE html>\n<html lang=\"en-US\">\n    <head>\n        <title></title>");
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            LIZ.getClass();
            if (str != null && !a0.LJJJIL(str) && !Intrinsics.LJFF(str, "null")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\n            <link rel=\"preconnect\" href=\"");
                sbLIZ.append(str);
                sbLIZ.append("\"/>\n        ");
                sb.append(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
                i++;
            }
        }
        sb.append("    </head>\n</html>");
        if (i <= 0) {
            return null;
        }
        return sb.toString();
    }

    public static final <T extends InterfaceC1037760d70> T LJI(Class<T> cls) {
        return (T) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(cls);
    }

    public static String LJII(String str) {
        if (u.LJIIZILJ(str, ".js", false)) {
            return "application/x-javascript";
        }
        if (u.LJIIZILJ(str, ".css", false)) {
            return "text/css";
        }
        if (u.LJIIZILJ(str, ".html", false)) {
            return "text/html";
        }
        if (u.LJIIZILJ(str, ".ico", false)) {
            return "image/x-icon";
        }
        if (!u.LJIIZILJ(str, ".jpeg", false) && !u.LJIIZILJ(str, ".jpg", false)) {
            if (u.LJIIZILJ(str, ".png", false)) {
                return "image/png";
            }
            if (u.LJIIZILJ(str, ".gif", false)) {
                return "image/gif";
            }
            if (u.LJIIZILJ(str, ".woff", false)) {
                return "font/woff";
            }
            if (u.LJIIZILJ(str, ".svg", false)) {
                return "image/svg+xml";
            }
            if (u.LJIIZILJ(str, ".ttf", false)) {
                return "font/ttf";
            }
            if (u.LJIIZILJ(str, ".webp", false)) {
                return "font/webp";
            }
            if (u.LJIIZILJ(str, ".woff2", false)) {
                return "font/woff2";
            }
            if (u.LJIIZILJ(str, ".otf", false)) {
                return "font/otf";
            }
            if (u.LJIIZILJ(str, ".sfnt", false)) {
                return "font/sfnt";
            }
            if (u.LJIIZILJ(str, ".mp3", false)) {
                return "audio/mp3";
            }
            if (u.LJIIZILJ(str, ".mp4", false)) {
                return "video/mpeg4";
            }
            return "";
        }
        return "image/jpeg";
    }

    public static final Pair<String, String> LJIIIIZZ(String str) {
        String strLJJIFFI;
        List<String> listLJJLIIIJILLIZJL;
        String str2 = "";
        if (str != null && (strLJJIFFI = u.LJJIFFI(str, " ", "", false)) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJJIFFI, new String[]{";"}, 0, 6)) != null && !listLJJLIIIJILLIZJL.isEmpty()) {
            String strSubstring = "";
            for (String str3 : listLJJLIIIJILLIZJL) {
                if (str3 != null && !a0.LJJJIL(str3)) {
                    int iLJJJ = a0.LJJJ(str3, "=", 0, false, 6);
                    if (iLJJJ == -1) {
                        str2 = str3;
                    } else if (a0.LJJJ(str3, "charset", 0, false, 6) != -1) {
                        strSubstring = str3.substring(iLJJJ + 1);
                    }
                }
            }
            return new Pair<>(str2, strSubstring);
        }
        return new Pair<>("", "");
    }

    public static List LJIIIZ(boolean z) {
        if (!z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("x-ttnet-bypass-sandbox", "1"));
        arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
        arrayList.add(new C080U("x-tt-bypass-dp", "1"));
        arrayList.add(new C080U("x-metasec-bypass-mssdk", "1"));
        return arrayList;
    }

    public static void LIZ(WebResourceResponse webResourceResponse, C1043350dG1 c1043350dG1) {
        JSONObject jSONObject;
        if (webResourceResponse != null && (jSONObject = c1043350dG1.LIZIZ) != null && ((Boolean) C256980A5g.LIZ.getValue()).booleanValue()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (webResourceResponse.getResponseHeaders() != null) {
                linkedHashMap.putAll(webResourceResponse.getResponseHeaders());
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = linkedHashMap.keySet().iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(((String) it2.next()).toLowerCase(Locale.ROOT));
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!linkedHashSet.contains(next.toLowerCase(Locale.ROOT))) {
                    linkedHashMap.put(next, jSONObject.optString(next));
                }
            }
            linkedHashMap.remove("content-type");
            webResourceResponse.setResponseHeaders(linkedHashMap);
        }
    }

    public static Pair LIZLLL(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) == null || (strOptString = jSONObjectOptJSONObject.optString("md5")) == null || a0.LJJJIL(strOptString)) {
            return null;
        }
        return new Pair(strOptString, Integer.valueOf(jSONObjectOptJSONObject.optInt("resourceType")));
    }

    public static Pair LJFF(String str, String str2) {
        boolean z;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C1490740otc.LIZIZ(C1490740otc.LIZ, "channelPath is null", null, "CommerceLandPageSSPContext_", 2);
            return null;
        }
        String strLIZJ = LIZJ(str);
        JSONObject jSONObjectE0 = AdLandPagePreloadServiceImpl.LJI.E0(str2);
        if (jSONObjectE0 == null) {
            return null;
        }
        LIZ.getClass();
        Pair pairLIZLLL = LIZLLL(str, jSONObjectE0);
        if (pairLIZLLL == null) {
            return LIZLLL(strLIZJ, jSONObjectE0);
        }
        return pairLIZLLL;
    }
}
