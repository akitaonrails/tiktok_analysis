package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.framwork.core.sdklib.apm6.http.DefaultTTNetImpl;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793790VBx {
    public int LIZ;
    public int LIZIZ;
    public InterfaceC793490VAt LIZJ;
    public InterfaceC793480VAs LIZLLL;
    public String LJ;
    public volatile boolean LJFF;
    public int LJI;
    public String LJII;

    public final String LJ() {
        C0VC9 c0vc9 = C793870VCf.LIZ;
        List<String> list = C08GN.LIZIZ(c0vc9.LIZ) ? C07PP.LIZ : c0vc9.LIZ;
        if (!TextUtils.isEmpty(this.LJ)) {
            if (list != null && list.size() > 0) {
                try {
                    URL url = new URL((String) ListProtector.get(list, 0));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(url.getPath());
                    return C2188811AlT.LIZIZ(sbLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return null;
        }
        if (!TextUtils.isEmpty(this.LJII)) {
            return this.LJII;
        }
        if (this.LJFF) {
            this.LJI++;
        }
        if (list == null) {
            return null;
        }
        int size = list.size();
        int i = this.LJI;
        if (size > i && i >= 0) {
            return (String) ListProtector.get(list, i);
        }
        this.LJI = 0;
        return (String) ListProtector.get(list, 0);
    }

    public static byte[] LIZ(byte[] bArr) {
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, C0VCC> entry : SDKMonitorUtils.sAidToMonitorCommon.entrySet()) {
                String key = entry.getKey();
                JSONObject jSONObjectLJIILJJIL = entry.getValue().LJIILJJIL();
                if (!TextUtils.isEmpty(jSONObjectLJIILJJIL.optString("aid")) && !TextUtils.isEmpty(jSONObjectLJIILJJIL.optString("os"))) {
                    jSONObject2.put(key, jSONObjectLJIILJJIL);
                }
            }
            jSONObject.put("settings_params", jSONObject2);
            return C0VCR.LIZ(C786410Ut5.J3(jSONObject));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "NetworkHelper->appendSettingsParams");
            C0VCY.LIZIZ("NetworkHelper appendSettingsParams failed", e);
            return bArr;
        }
    }

    public static JSONObject LIZLLL(C2403609bO c2403609bO) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(new String(c2403609bO.LIZJ));
            Map<String, String> map = c2403609bO.LIZIZ;
            if (map != null && !map.isEmpty()) {
                str = map.get("ran");
                if (TextUtils.isEmpty(str)) {
                    str = map.get("Ran");
                }
            } else {
                str = null;
            }
            try {
                String strOptString = jSONObject.optString("data");
                boolean zIsEmpty = true;
                if (!strOptString.isEmpty()) {
                    if (!TextUtils.isEmpty(str)) {
                        String strLIZJ = LIZJ(str, strOptString.getBytes());
                        jSONObject = new JSONObject(strLIZJ);
                        zIsEmpty = true ^ TextUtils.isEmpty(strLIZJ);
                    } else {
                        jSONObject = new JSONObject(new String(strOptString.getBytes()));
                    }
                }
                if (!zIsEmpty) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("message", "success");
                    return jSONObject2;
                }
                return jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("message", "success");
                return jSONObject3;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        TryCatchGuardChecker.doCheck(e);
        return null;
    }

    public static String LIZJ(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(Base64.decode(bArr, 0))).replaceAll("\\$+$", "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "NetworkHelper->decodeData method error");
            return "";
        }
    }

    public final boolean LJFF(String str, C793730VBr c793730VBr) {
        boolean z;
        C0VCC sDKMonitorUtils;
        boolean zLJI = MethodIDManager.LJI(137376);
        if (c793730VBr != null && !c793730VBr.LIZ()) {
            try {
                C793730VBr c793730VBr2 = new C793730VBr(LIZ(c793730VBr.LIZIZ()));
                String strLJ = LJ();
                C0VCX c0vcxLIZIZ = LIZIZ(strLJ, c793730VBr2, str);
                if (C793880VCg.LIZ.LJFF) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return true;
                }
                String str2 = c0vcxLIZIZ.LIZ;
                Map<String, String> map = c0vcxLIZIZ.LIZIZ;
                byte[] bArr = c0vcxLIZIZ.LIZJ;
                boolean zLJI2 = MethodIDManager.LJI(137375);
                IHttpService defaultTTNetImpl = C0VCC.LJJIIJ;
                if (defaultTTNetImpl == null) {
                    defaultTTNetImpl = new DefaultTTNetImpl();
                }
                C2403609bO c2403609bODoPost = defaultTTNetImpl.doPost(str2, bArr, map);
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
                this.LJ = null;
                this.LJII = null;
                if (c2403609bODoPost != null && c2403609bODoPost.LIZ > 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.LJFF = z;
                if (C793590VBd.LJ("/monitor/collect/batch/").LIZ(c2403609bODoPost)) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return false;
                }
                JSONObject jSONObjectLIZLLL = LIZLLL(c2403609bODoPost);
                JSONObject jSONObjectOptJSONObject = jSONObjectLIZLLL.optJSONObject("settings_info");
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(next);
                        if (jSONObjectOptJSONObject2 != null && (sDKMonitorUtils = SDKMonitorUtils.getInstance(next)) != null) {
                            sDKMonitorUtils.LJIIZILJ(jSONObjectOptJSONObject2);
                        }
                    }
                }
                if (c2403609bODoPost.LIZ != 200) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return false;
                }
                String strOptString = jSONObjectLIZLLL.optString("message");
                String strOptString2 = jSONObjectLIZLLL.optString("redirect");
                long jOptLong = jSONObjectLIZLLL.optLong("delay");
                if (jSONObjectLIZLLL.optLong("server_code", 0L) == 10001 && this.LIZIZ == 2 && this.LIZJ != null && this.LIZ == 0) {
                    this.LIZIZ = 1;
                    C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "dict_interval").edit().putLong("dict_interval", 0L).putLong("force_zstd_timestamp", System.currentTimeMillis()).commit();
                    this.LIZ++;
                    boolean zLJFF = LJFF(str, c793730VBr2);
                    this.LIZ--;
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return zLJFF;
                }
                this.LJII = strLJ;
                JSONObject jSONObjectOptJSONObject3 = jSONObjectLIZLLL.optJSONObject("downgrade_rule");
                if (jSONObjectOptJSONObject3 != null) {
                    C793930VCl.LIZ.LIZ(C0VCL.LIZ(jSONObjectOptJSONObject3), true);
                }
                this.LJ = strOptString2;
                if (jOptLong > 0) {
                    C793590VBd.LJ("/monitor/collect/batch/").LIZLLL(jOptLong);
                }
                C793590VBd c793590VBdLJ = C793590VBd.LJ("/monitor/collect/batch/");
                synchronized (c793590VBdLJ) {
                    if ("drop data".equals(strOptString)) {
                        c793590VBdLJ.LIZIZ = true;
                        c793590VBdLJ.LJII();
                    } else {
                        c793590VBdLJ.LIZIZ = false;
                        c793590VBdLJ.LIZJ = false;
                        c793590VBdLJ.LIZLLL = 0;
                        c793590VBdLJ.LJ = 0;
                        c793590VBdLJ.LJFF = 0L;
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VCY.LIZIZ("sendLog failed.", th);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return false;
                }
                return false;
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[Catch: Exception -> 0x00c3, TryCatch #0 {Exception -> 0x00c3, blocks: (B:38:0x00b3, B:40:0x00b9, B:42:0x00bf), top: B:62:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9 A[PHI: r4
      0x00c9: PHI (r4v8 X.0VBr) = (r4v6 X.0VBr), (r4v7 X.0VBr), (r4v7 X.0VBr), (r4v10 X.0VBr) binds: [B:45:0x00c7, B:41:0x00bd, B:42:0x00bf, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0VCX LIZIZ(java.lang.String r11, X.C793730VBr r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793790VBx.LIZIZ(java.lang.String, X.0VBr, java.lang.String):X.0VCX");
    }
}
