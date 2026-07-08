package X;

import Y.ARunnableS23S1300000_30;
import Y.ARunnableS2S2300000_30;
import android.text.TextUtils;
import com.bytedance.bdturing.VerifyTaskHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C202164148k implements InterfaceC20221414Ai {
    public void LIZJ(C148Q c148q) {
        throw null;
    }

    public void LIZLLL(int i, int i2) {
        throw null;
    }

    public void LJ(int i, String str, String str2) {
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    @Override // X.InterfaceC20221414Ai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final X.C14AH r11) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202164148k.LIZ(X.14AH):void");
    }

    public final void LIZIZ(C14AH c14ah) {
        String str;
        String string;
        AnonymousClass1490 anonymousClass1490;
        boolean zOptBoolean;
        boolean zOptBoolean2;
        try {
            JSONObject jSONObject = new JSONObject(c14ah.LIZIZ);
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "url");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "method");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("query");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
            boolean z = false;
            String strReplaceAll = null;
            try {
                C202178148y c202178148y = C1498550p6D.LIZ;
                if (c202178148y != null && (anonymousClass1490 = c202178148y.LIZ) != null) {
                    JSONObject jSONObjectLIZ = AnonymousClass1492.LIZ(anonymousClass1490);
                    if (jSONObjectLIZ == null) {
                        zOptBoolean = false;
                    } else {
                        zOptBoolean = jSONObjectLIZ.optBoolean("use_spark", false);
                    }
                    JSONObject jSONObjectLIZ2 = AnonymousClass1492.LIZ(anonymousClass1490);
                    if (jSONObjectLIZ2 != null) {
                        zOptBoolean2 = jSONObjectLIZ2.optBoolean("spark_view", false);
                    } else {
                        zOptBoolean2 = false;
                    }
                    if (zOptBoolean && zOptBoolean2) {
                        z = true;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                th.getMessage();
            }
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
                try {
                    jSONObject.put("query", jSONObjectOptJSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (z) {
                str = "spark";
            } else {
                str = "webview";
            }
            try {
                jSONObjectOptJSONObject.put("mobile_container", str);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
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
            String string4 = sb.toString();
            if (jSONObjectOptJSONObject2 != null) {
                strReplaceAll = C786410Ut5.J3(jSONObjectOptJSONObject2).replaceAll("\\\\/", "/");
            }
            HashMap map = new HashMap();
            map.put("Content-Type", "application/json; charset=utf-8");
            if (string3.equals("post")) {
                VerifyTaskHandler verifyTaskHandler = C145S.LIZ;
                ARunnableS2S2300000_30 aRunnableS2S2300000_30 = new ARunnableS2S2300000_30(this, string4, map, strReplaceAll, c14ah, 1);
                VerifyTaskHandler.MessageHandler messageHandler = verifyTaskHandler.LIZIZ;
                if (messageHandler != null) {
                    messageHandler.post(aRunnableS2S2300000_30);
                    return;
                }
                return;
            }
            VerifyTaskHandler verifyTaskHandler2 = C145S.LIZ;
            ARunnableS23S1300000_30 aRunnableS23S1300000_30 = new ARunnableS23S1300000_30(this, string4, map, c14ah, 1);
            VerifyTaskHandler.MessageHandler messageHandler2 = verifyTaskHandler2.LIZIZ;
            if (messageHandler2 != null) {
                messageHandler2.post(aRunnableS23S1300000_30);
            }
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public static void LJFF(C14AH c14ah, String str, Map map) {
        JSONObject jSONObject;
        int i = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("content", str);
            jSONObject = new JSONObject(str);
            try {
                if (jSONObject.optJSONObject("data") != null) {
                    AnonymousClass1490.LJJIIJ = jSONObject.optJSONObject("data").optString("verify_id");
                }
            } catch (JSONException e) {
                e = e;
                jSONObject2 = jSONObject;
                TryCatchGuardChecker.doCheck(e);
                i = 0;
                jSONObject = jSONObject2;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        c14ah.LIZLLL(i, jSONObject, map);
    }
}
