package X;

import android.text.TextUtils;
import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.services.apm.api.IApmAgent;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.IConfigManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793470VAr {
    public static final HashMap<C0VBU, C793470VAr> LJIIIZ = new HashMap<>();
    public static volatile int LJIIJ;
    public String LIZ;
    public volatile boolean LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public final List<String> LJ;
    public InterfaceC793490VAt LJFF;
    public InterfaceC793480VAs LJI;
    public final C0VBU LJII;
    public int LJIIIIZZ;

    public final String LJ() {
        List<String> list = this.LJ;
        if (TextUtils.isEmpty(this.LIZ)) {
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                return this.LIZLLL;
            }
            if (this.LIZIZ) {
                this.LIZJ++;
            }
            int size = list.size();
            int i = this.LIZJ;
            if (size > i && i >= 0) {
                return (String) ListProtector.get(list, i);
            }
            this.LIZJ = 0;
            return (String) ListProtector.get(list, 0);
        }
        if (list != null && list.size() > 0) {
            try {
                URL url = new URL((String) ListProtector.get(list, 0));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(url.getPath());
                return C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public C793470VAr(C0VBU c0vbu) {
        this.LJII = c0vbu;
        this.LJ = c0vbu.getUrls();
    }

    public static byte[] LIZ(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject(new String(bArr));
        IConfigManager iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class);
        if (iConfigManager != null) {
            JSONObject jSONObjectRetrieveSettingsParams = iConfigManager.retrieveSettingsParams();
            JSONObject jSONObject2 = new JSONObject();
            String strValueOf = String.valueOf(C792420V6q.LIZIZ());
            if (!TextUtils.isEmpty(strValueOf) && !strValueOf.equals(CardStruct.IStatusCode.DEFAULT)) {
                jSONObject2.put(strValueOf, jSONObjectRetrieveSettingsParams);
                jSONObject.put("settings_params", jSONObject2);
            }
        }
        return C786410Ut5.J3(jSONObject).getBytes();
    }

    public static JSONObject LIZJ(C2403609bO c2403609bO) {
        IApmAgent iApmAgent;
        InterfaceC792070V5h interfaceC792070V5h;
        try {
            JSONObject jSONObject = new JSONObject(new String(c2403609bO.LIZJ));
            try {
                String strOptString = jSONObject.optString("data");
                if (!strOptString.isEmpty()) {
                    jSONObject = new JSONObject(strOptString);
                }
                if (!C792450V6t.LIZJ(jSONObject)) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("configs");
                    if (!C792450V6t.LIZJ(jSONObjectOptJSONObject) && (interfaceC792070V5h = (InterfaceC792070V5h) C792590V7h.LIZ(InterfaceC792070V5h.class)) != null) {
                        interfaceC792070V5h.LIZJ(jSONObjectOptJSONObject);
                    }
                }
                return jSONObject;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "NetworkSender->getData");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", "success");
                if ((th instanceof JSONException) && (iApmAgent = (IApmAgent) C792590V7h.LIZ(IApmAgent.class)) != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("resp", C786410Ut5.J3(jSONObject));
                    iApmAgent.monitorEvent("apm_resp_err", null, null, jSONObject3);
                }
                return jSONObject2;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "NetworkSender->getData 2");
            return null;
        }
    }

    public static C793470VAr LIZLLL(C0VBU c0vbu) {
        HashMap<C0VBU, C793470VAr> map = LJIIIZ;
        if (map.containsKey(c0vbu)) {
            return map.get(c0vbu);
        }
        map.put(c0vbu, new C793470VAr(c0vbu));
        return map.get(c0vbu);
    }

    public final boolean LJFF(String str, C793730VBr c793730VBr) {
        C793730VBr c793730VBr2;
        boolean z;
        IConfigManager iConfigManager;
        JSONObject jSONObjectOptJSONObject;
        Object objLIZIZ;
        if (c793730VBr == null || c793730VBr.LIZ()) {
            return true;
        }
        try {
            String strLJ = LJ();
            boolean z2 = this.LJII instanceof C0VBS;
            if (!z2) {
                if (this.LJI == null) {
                    this.LJI = (InterfaceC793480VAs) C792590V7h.LIZ(InterfaceC793480VAs.class);
                }
                if (this.LJI != null) {
                    try {
                        this.LJI.LIZIZ(new URL(strLJ).getHost());
                    } catch (MalformedURLException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            try {
                c793730VBr2 = new C793730VBr(LIZ(c793730VBr.LIZIZ()));
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1AF0.LJFF(e2, "NetworkSender->sendLog(byte[] bytes)");
                C792910V8n.LIZIZ("APM-Slardar", " appendSettingsParams wrong ");
                c793730VBr2 = c793730VBr;
            }
            C793450VAp c793450VApLIZIZ = LIZIZ(strLJ, c793730VBr2, z2, str);
            if (C0VBJ.LIZ.LJI) {
                if (C792190V5t.LIZ()) {
                    C792910V8n.LIZIZ("APM-Slardar", "is clearing data,drop this data");
                }
                return true;
            }
            if (C792190V5t.LIZ()) {
                DoctorManager doctorManager = DoctorManager.getInstance();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url:");
                sbLIZ.append(c793450VApLIZIZ.LIZ);
                sbLIZ.append(" header:");
                sbLIZ.append(c793450VApLIZIZ.LIZIZ);
                doctorManager.LIZIZ("APM_SEND_DATA", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("sendLog createRequest: origin Bytes=");
                sbLIZ2.append(c793730VBr2.LIZIZ);
                sbLIZ2.append(" compressed Bytes=");
                sbLIZ2.append(c793450VApLIZIZ.LIZJ.length);
                sbLIZ2.append(" url=");
                sbLIZ2.append(c793450VApLIZIZ.LIZ);
                sbLIZ2.append(" headers=");
                sbLIZ2.append(c793450VApLIZIZ.LIZIZ);
                sbLIZ2.append(" body:");
                sbLIZ2.append(new JSONObject(new String(c793730VBr2.LIZ, 0, c793730VBr2.LIZIZ)));
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
            }
            C2403609bO c2403609bODoPost = ((IHttpService) C792590V7h.LIZ(IHttpService.class)).doPost(c793450VApLIZIZ.LIZ, c793450VApLIZIZ.LIZJ, c793450VApLIZIZ.LIZIZ);
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("http result:");
                if (c2403609bODoPost != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(c2403609bODoPost.LIZ);
                    sbLIZ4.append(" header:");
                    sbLIZ4.append(c2403609bODoPost.LIZIZ);
                    objLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                } else {
                    objLIZIZ = -1;
                }
                sbLIZ3.append(objLIZIZ);
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (this.LJII instanceof C0VBS) {
                return true;
            }
            this.LIZ = null;
            this.LIZLLL = null;
            if (c2403609bODoPost != null && c2403609bODoPost.LIZ > 0) {
                z = false;
            } else {
                z = true;
            }
            this.LIZIZ = z;
            if (C793590VBd.LJ(this.LJII.LIZ()).LIZ(c2403609bODoPost)) {
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(this.LJII.LIZ());
                    sbLIZ5.append(" need enter backoff status");
                    C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ5));
                }
                return false;
            }
            JSONObject jSONObjectLIZJ = LIZJ(c2403609bODoPost);
            if (jSONObjectLIZJ == null || c2403609bODoPost.LIZ != 200) {
                return false;
            }
            if (jSONObjectLIZJ.optLong("server_code", 0L) == 10001 && LJIIJ == 2 && this.LJFF != null && this.LJIIIIZZ == 0) {
                LJIIJ = 1;
                C810670Vr7.LIZJ(C792190V5t.LIZIZ, 0, "dict_interval").edit().putLong("dict_interval", 0L).putLong("force_zstd_timestamp", System.currentTimeMillis()).commit();
                this.LJIIIIZZ++;
                boolean zLJFF = LJFF(str, c793730VBr2);
                this.LJIIIIZZ--;
                return zLJFF;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectLIZJ.optJSONObject("settings_info");
            if (jSONObjectOptJSONObject2 != null && (iConfigManager = (IConfigManager) C792600V7i.LIZ(IConfigManager.class)) != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject(String.valueOf(C792420V6q.LIZIZ()))) != null) {
                iConfigManager.updateWithSpecificAidResult(jSONObjectOptJSONObject);
            }
            String strOptString = jSONObjectLIZJ.optString("message");
            String strOptString2 = jSONObjectLIZJ.optString("redirect");
            long jOptLong = jSONObjectLIZJ.optLong("delay");
            this.LIZLLL = strLJ;
            if (C792190V5t.LIZ()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("RESPONSE_DATA_URL", c793450VApLIZIZ.LIZ);
                if (c2403609bODoPost.LIZIZ != null) {
                    jSONObject.put("RESPONSE_DATA_HEADERS", new JSONObject(c2403609bODoPost.LIZIZ));
                }
                jSONObject.put("RESPONSE_DATA_BODY_TEXT", jSONObjectLIZJ);
                C793430VAn.LIZJ(c793730VBr2, jSONObject);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectLIZJ.optJSONObject("downgrade_rule");
            if (jSONObjectOptJSONObject3 != null) {
                C793520VAw.LIZ.LIZIZ(C0VBH.LIZ(jSONObjectOptJSONObject3), true);
            }
            this.LIZ = strOptString2;
            if (jOptLong > 0) {
                C793590VBd c793590VBdLJ = C793590VBd.LJ(this.LJII.LIZ());
                synchronized (c793590VBdLJ) {
                    c793590VBdLJ.LJFF = Math.max(c793590VBdLJ.LJFF, System.currentTimeMillis() + (jOptLong * 1000));
                }
            }
            C0VBU c0vbu = this.LJII;
            if (!(c0vbu instanceof C792930V8p)) {
                boolean zLIZIZ = C793590VBd.LJ(c0vbu.LIZ()).LIZIZ(strOptString);
                if (zLIZIZ) {
                    Map<String, String> map = c2403609bODoPost.LIZIZ;
                    if (map != null) {
                        C793500VAu.LIZ.LIZLLL = map.get("x-tt-logid");
                    }
                    C793500VAu.LIZ.LJ = System.currentTimeMillis();
                }
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(this.LJII.LIZ());
                    sbLIZ6.append(" check enter quota:");
                    sbLIZ6.append(zLIZIZ);
                    C792910V8n.LIZLLL("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "sendLog failed.", th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa A[PHI: r4
      0x00fa: PHI (r4v9 X.0VBr) = (r4v8 X.0VBr), (r4v8 X.0VBr), (r4v11 X.0VBr) binds: [B:60:0x00f5, B:61:0x00f7, B:22:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C793450VAp LIZIZ(java.lang.String r12, X.C793730VBr r13, boolean r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C793470VAr.LIZIZ(java.lang.String, X.0VBr, boolean, java.lang.String):X.0VAp");
    }
}
