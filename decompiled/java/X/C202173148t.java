package X;

import Y.ARunnableS23S1300000_30;
import Y.ARunnableS2S2300000_30;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C202173148t implements InterfaceC20220814Ac {
    public void LIZJ(C14AL c14al) {
        throw null;
    }

    public void LIZLLL(int i, String str, String str2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    @Override // X.InterfaceC20220814Ac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.C14AL r12) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202173148t.LIZ(X.14AL):void");
    }

    public final void LIZIZ(C14AL c14al) {
        String strReplaceAll;
        String string;
        try {
            JSONObject jSONObject = new JSONObject(c14al.LIZIZ);
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "url");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "method");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("query");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                StringBuilder sb = new StringBuilder(string2);
                sb.append("?");
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObjectOptJSONObject.get(next) != null) {
                        string = jSONObjectOptJSONObject.get(next).toString();
                    } else {
                        string = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("&");
                    sbLIZ.append(next);
                    sbLIZ.append("=");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                    sb.append(string);
                }
                string2 = sb.toString();
            }
            if (jSONObjectOptJSONObject2 != null) {
                strReplaceAll = C786410Ut5.J3(jSONObjectOptJSONObject2).replaceAll("\\\\/", "/");
            } else {
                strReplaceAll = "";
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/json; charset=utf-8");
            if (string3.equals("post")) {
                C145R.LIZ.LIZ(new ARunnableS2S2300000_30(this, string2, map, strReplaceAll, c14al, 0));
            } else {
                C145R.LIZ.LIZ(new ARunnableS23S1300000_30(this, string2, map, c14al, 0));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(C14AL c14al, String str) {
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        c14al.LIZLLL(i, jSONObject);
    }
}
