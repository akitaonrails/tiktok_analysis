package X;

import Y.ACallableS436S0100000_34;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BRg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204901BRg implements C1BRS {
    public final C1058910df7 LIZ;
    public final BPEAHandler LIZIZ;
    public final IESJsBridge LIZJ;
    public final InterfaceC2204871BRd LIZLLL;
    public final InterfaceC2204861BRc LJ;
    public C2204921BRi LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public JSONObject LJIIIZ;
    public JSONObject LJIIJ;
    public List<C080U> LJIIL;
    public String LJIILIIL;
    public final CommonApi LJIIJJI = (CommonApi) C09S2.LIZJ(CommonApi.class, Api.LIZ);
    public Exception LJIILJJIL = null;
    public final ACallableS436S0100000_34 LJIILL = new ACallableS436S0100000_34(this, 6);
    public final ACallableS436S0100000_34 LJIILLIIL = new ACallableS436S0100000_34(this, 7);
    public final ACallableS436S0100000_34 LJIIZILJ = new ACallableS436S0100000_34(this, 8);
    public final ACallableS436S0100000_34 LJIJ = new ACallableS436S0100000_34(this, 9);

    @Override // X.C1BRS
    public final void execute() {
        C1058910df7 c1058910df7 = this.LIZ;
        this.LJI = c1058910df7.LIZIZ;
        JSONObject jSONObject = c1058910df7.LIZLLL;
        this.LJII = jSONObject.optString("url", "");
        this.LJIIIIZZ = jSONObject.optString("method", "get");
        this.LJIIIZ = jSONObject.optJSONObject("params");
        this.LJIIJ = jSONObject.optJSONObject("data");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            this.LJIIL = new ArrayList();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObjectOptJSONObject.optString(next);
                if (!TextUtils.isEmpty(strOptString)) {
                    ((ArrayList) this.LJIIL).add(new C080U(next, strOptString));
                    if ("content-type".equalsIgnoreCase(next)) {
                        this.LJIILIIL = strOptString;
                    }
                }
            }
        }
        this.LJFF = new C2204921BRi();
        if ("get".equalsIgnoreCase(this.LJIIIIZZ)) {
            C1BVK.LIZIZ().LIZ(this.LIZIZ, this.LJIILL, 25);
            return;
        }
        if ("post".equalsIgnoreCase(this.LJIIIIZZ)) {
            C1BVK.LIZIZ().LIZ(this.LIZIZ, this.LJIILLIIL, 32);
        } else if ("put".equalsIgnoreCase(this.LJIIIIZZ)) {
            C1BVK.LIZIZ().LIZ(this.LIZIZ, this.LJIIZILJ, 33);
        } else if ("delete".equalsIgnoreCase(this.LJIIIIZZ)) {
            C1BVK.LIZIZ().LIZ(this.LIZIZ, this.LJIJ, 34);
        }
    }

    public static final String LIZJ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C080U c080u = (C080U) it2.next();
            if ("x-tt-logid".equals(c080u.LIZ.toLowerCase())) {
                return c080u.LIZIZ;
            }
        }
        return "";
    }

    public final String LIZIZ(String str) {
        boolean zLIZIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            ArrayList arrayList = new ArrayList();
            if (!C1256140inE.LIZ(this.LJIIL)) {
                for (C080U c080u : (ArrayList) this.LJIIL) {
                    arrayList.add(new C080U(c080u.LIZ, c080u.LIZIZ));
                }
            }
            return (String) Api.LJI(this.LJIIJJI.doDelete(str, 0, arrayList).execute().LIZIZ, C0XIK.LIZ, null, str);
        }
        throw new IOException();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            X.0XI4 r4 = new X.0XI4
            r4.<init>(r6)
            if (r7 == 0) goto L21
            java.util.Iterator r2 = r7.keys()
        Lb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = ""
            java.lang.String r0 = r7.optString(r1, r0)
            r4.LJ(r1, r0)
            goto Lb
        L21:
            X.1BRi r0 = r5.LJFF
            if (r0 == 0) goto L60
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L60
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L38:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L38
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L38
            r4.LJ(r2, r1)
            goto L38
        L60:
            java.util.List<X.1DcV> r1 = r4.LIZ
            java.lang.String r2 = "request_tag_from"
            if (r1 == 0) goto L8b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8b
            java.util.Iterator r1 = r1.iterator()
        L72:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()
            X.1DcV r0 = (X.C2259691DcV) r0
            java.lang.String r0 = r0.LL
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L72
        L86:
            java.lang.String r0 = r4.LJFF()
            return r0
        L8b:
            java.lang.String r0 = "h5"
            r4.LJ(r2, r0)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2204901BRg.LIZ(java.lang.String, org.json.JSONObject):java.lang.String");
    }

    public static final void LIZLLL(JSONObject jSONObject, int i, String str, String str2) {
        try {
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("errCode", i);
                jSONObject2.put("message", str);
                jSONObject2.put("prompts", str2);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            jSONObject.put("response", jSONObject2);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public C2204901BRg(final C1058910df7 c1058910df7, JSONObject jSONObject, IESJsBridge iESJsBridge, InterfaceC2204871BRd interfaceC2204871BRd, InterfaceC2204861BRc interfaceC2204861BRc) {
        this.LIZ = c1058910df7;
        this.LIZJ = iESJsBridge;
        this.LIZLLL = interfaceC2204871BRd;
        this.LJ = interfaceC2204861BRc;
        this.LIZIZ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.1BRe
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                JSONObject jSONObjectOptJSONObject;
                int i = message.what;
                if (i == 25 || i == 32 || i == 33 || i == 34) {
                    if (HandlerHook.getMessageObj(message.obj) == null) {
                        return true;
                    }
                    try {
                        JSONObject jSONObject2 = (JSONObject) HandlerHook.getMessageObj(message.obj);
                        C2204901BRg c2204901BRg = this.LLILLJJLI;
                        if (c2204901BRg.LJ != null) {
                            C2204851BRb c2204851BRb = new C2204851BRb(c2204901BRg.LJIIIIZZ, c2204901BRg.LIZ(c2204901BRg.LJII, c2204901BRg.LJIIIZ), this.LLILLJJLI.LJIIJ);
                            if (jSONObject2 != null && jSONObject2.has("response")) {
                                jSONObjectOptJSONObject = jSONObject2.optJSONObject("response");
                            } else {
                                jSONObjectOptJSONObject = null;
                            }
                            C2204901BRg c2204901BRg2 = this.LLILLJJLI;
                            c2204901BRg2.LJ.LIZ(c2204851BRb, new C2204841BRa(jSONObjectOptJSONObject, c2204901BRg2.LJIILJJIL));
                        }
                        C2204901BRg c2204901BRg3 = this.LLILLJJLI;
                        if (c2204901BRg3.LIZJ != null && !TextUtils.isEmpty(c2204901BRg3.LJI) && !c1058910df7.LJII.booleanValue()) {
                            C2204901BRg c2204901BRg4 = this.LLILLJJLI;
                            c2204901BRg4.LIZJ.LIZ(c2204901BRg4.LJI, jSONObject2);
                            return false;
                        }
                        InterfaceC2204871BRd interfaceC2204871BRd2 = this.LLILLJJLI.LIZLLL;
                        if (interfaceC2204871BRd2 != null) {
                            interfaceC2204871BRd2.LIZ(jSONObject2);
                            return false;
                        }
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        return false;
                    }
                }
                return false;
            }
        });
    }
}
