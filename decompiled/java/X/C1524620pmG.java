package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pmG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524620pmG extends C1525230pnF {
    public static final List<String> LJIIJ = C1697810uHb.LJIIJJI("GET", "OPTIONS", "HEAD", "POST", "PUT", "DELETE", "TRACE", "CONNECT");
    public static final List<String> LJIIJJI = C1697810uHb.LJIIJJI("json", "string");
    public static final List<String> LJIIL = C1697810uHb.LJIIJJI("text", "arraybuffer");
    public static final List<String> LJIILIIL = C1697810uHb.LJIIJJI("url", "header", "method", "data", "dataType", "responseType", "success", "fail", "complete", "timeout");
    public final C1525120pn4 LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final String LIZLLL;
    public final JSONObject LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final byte[] LJIIIIZZ;
    public final long LJIIIZ;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1524620pmG(org.json.JSONObject r19) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1524620pmG.<init>(org.json.JSONObject):void");
    }

    public static List LIZ(JSONObject jSONObject) {
        String string;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next != null && !a0.LJJJIL(next)) {
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof String) {
                    string = (String) objOpt;
                } else if (objOpt instanceof Number) {
                    string = objOpt.toString();
                } else if (objOpt instanceof byte[]) {
                    string = Base64.encodeToString((byte[]) objOpt, 2);
                } else if (objOpt == JSONObject.NULL) {
                    string = "null";
                } else if ((objOpt instanceof JSONObject) || (objOpt instanceof JSONArray)) {
                    try {
                        string = objOpt.toString();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        string = null;
                    }
                } else {
                    try {
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (objOpt instanceof Map) {
                        string = C786410Ut5.J3(new JSONObject((Map) objOpt));
                    } else if (objOpt instanceof List) {
                        string = new JSONArray((Collection) objOpt).toString();
                    } else if (objOpt != null) {
                        string = objOpt.toString();
                    } else {
                        string = null;
                    }
                }
                if (string == null) {
                    string = "";
                }
                arrayList.add(LIZIZ(next) + "=" + LIZIZ(string));
            }
        }
        return arrayList;
    }

    public static String LIZIZ(String str) {
        return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(URLEncoder.encode(str, StandardCharsets.UTF_8.name()), "%7E", "~", false), "%2D", "-", false), "%5F", "_", false), "%2E", e3.d, false), "%21", "!", false), "%28", e3.h, false), "%29", ")", false), "%27", "'", false);
    }
}
