package X;

import Y.ARunnableS36S1200000_34;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2204751BQr {
    public static final Pattern LJIIJ = PatternProtector.compile("^[0-9a-zA-Z.]+$");
    public Context LIZ;
    public Set<C1BRF> LIZIZ;
    public C19919812wm LIZJ;
    public final C1BMV LIZLLL;
    public String LJ;
    public volatile boolean LJFF;
    public C1BMC LJI;
    public C2204741BQq LJII;
    public final Map<String, C2204741BQq> LJIIIIZZ = new HashMap();
    public List<TimeLineEvent> LJIIIZ;

    public abstract Context LJ(C2203421BLo c2203421BLo);

    public abstract String LJFF();

    public abstract void LJII(C2203421BLo c2203421BLo);

    public abstract void LJIIIIZZ(String str);

    public void LJIIJJI(C2204761BQs c2204761BQs) {
    }

    public void LJIIJ() {
        if (this.LJI.LIZ() instanceof WebView) {
            C1543920qHO.LIZ((WebView) this.LJI.LIZ());
        }
        this.LJII.LJFF();
        Iterator it2 = ((HashMap) this.LJIIIIZZ).values().iterator();
        while (it2.hasNext()) {
            ((C2204741BQq) it2.next()).LJFF();
        }
        this.LIZLLL.release();
        this.LJFF = true;
    }

    public AbstractC2204751BQr() {
        C1BMV c1bmv = C2204711BQn.LJFF;
        if (c1bmv != null) {
            this.LIZLLL = c1bmv;
        } else {
            this.LIZLLL = new C1BMV() { // from class: X.1BMU
                public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

                @Override // X.C1BMV
                public final void release() {
                    this.LL.removeCallbacksAndMessages(null);
                }

                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C786410Ut5.LJJZZIII(this.LL, runnable);
                }
            };
        }
    }

    public final C2204761BQs LIZIZ(JSONObject jSONObject) {
        if (this.LJFF) {
            return null;
        }
        String strOptString = jSONObject.optString("__callback_id");
        String strOptString2 = jSONObject.optString("func");
        String strLJFF = LJFF();
        if (strLJFF == null) {
            LIZ(3, null, null, "url_empty", null);
            return null;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "params");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "JSSDK");
            String strOptString3 = jSONObject.optString("namespace");
            String strOptString4 = jSONObject.optString("__iframe_url");
            Boolean boolValueOf = Boolean.valueOf(jSONObject.optBoolean("shouldHook", false));
            String strOptString5 = jSONObject.optString("token");
            C1BR2 c1br2 = new C1BR2();
            c1br2.LIZ = string3;
            c1br2.LIZIZ = string;
            c1br2.LIZJ = strOptString2;
            c1br2.LIZLLL = string2;
            c1br2.LJ = strOptString;
            c1br2.LJFF = strOptString3;
            c1br2.LJI = strOptString4;
            c1br2.LJIIIIZZ = boolValueOf;
            c1br2.LJII = strOptString5;
            return new C2204761BQs(c1br2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZ(3, strLJFF, strOptString2, "params_invalid", null);
            return new C2204761BQs(strOptString);
        }
    }

    public final void LJI(C2204761BQs c2204761BQs) {
        String strLJFF;
        String str;
        C2204741BQq c2204741BQq;
        int i;
        if (this.LJFF) {
            return;
        }
        try {
            strLJFF = LJFF();
            C2204811BQx c2204811BQx = new C2204811BQx();
            if (strLJFF == null) {
                str = "null";
            } else {
                str = strLJFF;
            }
            c2204811BQx.LIZJ(str, "url");
            c2204811BQx.LIZ("label_call_origin_url", c2204761BQs.LJIIL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("call finished with error, ");
            sbLIZ.append(c2204761BQs);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZJ(C1699620uKW.LIZ(e), c2204761BQs);
        }
        if (strLJFF == null) {
            return;
        }
        String str2 = c2204761BQs.LJI;
        if (!TextUtils.equals(str2, this.LJ) && !TextUtils.isEmpty(str2)) {
            c2204741BQq = (C2204741BQq) ((HashMap) this.LJIIIIZZ).get(str2);
        } else {
            c2204741BQq = this.LJII;
        }
        if (c2204741BQq == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Received call with unknown namespace, ");
            sbLIZ2.append(c2204761BQs);
            C2188811AlT.LIZIZ(sbLIZ2);
            C2204811BQx c2204811BQx2 = new C2204811BQx();
            c2204811BQx2.LIZJ("unknown_namespace", "reason");
            c2204811BQx2.LIZ("label_abstract_bridge_reject", c2204761BQs.LJIIL);
            LIZ(2, LJFF(), c2204761BQs.LIZLLL, "unknown_namespace", c2204761BQs.LJIIL);
            Iterator<C1BRF> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(c2204761BQs, 2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Namespace ");
            sbLIZ3.append(c2204761BQs.LJI);
            sbLIZ3.append(" unknown.");
            LIZJ(C1699620uKW.LIZ(new C1BRG(-4, C2188811AlT.LIZIZ(sbLIZ3))), c2204761BQs);
            return;
        }
        C2204771BQt c2204771BQt = new C2204771BQt();
        c2204771BQt.LIZLLL = this.LJI.LIZ();
        String str3 = c2204761BQs.LJFF;
        if (str3 != null && str3.contains("SANDBOX_PREFIX")) {
            c2204771BQt.LIZIZ = c2204761BQs.LJIILIIL;
        } else {
            View view = c2204771BQt.LIZLLL;
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                String str4 = c2204761BQs.LJIIIZ;
                if (str4 != null && str4.length() != 0) {
                    String strLIZJ = C1543920qHO.LIZJ(webView, c2204761BQs.LJIIJJI, c2204761BQs.LJIIIZ);
                    c2204771BQt.LIZIZ = strLIZJ;
                    if (strLIZJ == null) {
                        c2204771BQt.LIZIZ = "about://blank-no-real-url";
                    }
                    i = 0;
                } else if (C1543920qHO.LIZLLL(webView, c2204761BQs.LJIIJJI, strLJFF)) {
                    c2204771BQt.LIZIZ = strLJFF;
                    i = 1;
                } else {
                    c2204771BQt.LIZIZ = "about://blank—no-token";
                    i = 2;
                }
            } else {
                c2204771BQt.LIZIZ = strLJFF;
                i = 3;
            }
            c2204761BQs.LJIIJ = i;
        }
        LJFF();
        c2204771BQt.LIZ = this.LIZ;
        c2204771BQt.LIZJ = c2204741BQq;
        C1BRB c1brbLJ = c2204741BQq.LJ(c2204761BQs, c2204771BQt);
        if (c1brbLJ == null) {
            c2204761BQs.toString();
            C2204811BQx c2204811BQx3 = new C2204811BQx();
            c2204811BQx3.LIZJ("not_registered_1", "reason");
            c2204811BQx3.LIZ("label_abstract_bridge_reject", c2204761BQs.LJIIL);
            LIZ(2, LJFF(), c2204761BQs.LIZLLL, "not_registered_1", c2204761BQs.LJIIL);
            Iterator<C1BRF> it3 = this.LIZIZ.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(c2204761BQs, 2);
            }
            LIZJ(C1699620uKW.LIZ(new C1BRG(-2, "Function " + c2204761BQs.LIZLLL + " is not registered.")), c2204761BQs);
            return;
        }
        if (c1brbLJ.LIZ) {
            JSONObject jSONObject = c1brbLJ.LIZJ;
            if (jSONObject != null) {
                LIZLLL(jSONObject, c2204761BQs);
            } else {
                LIZJ(c1brbLJ.LIZIZ, c2204761BQs);
            }
        }
        String strLJFF2 = LJFF();
        String str5 = c2204761BQs.LIZLLL;
        List<TimeLineEvent> list = c2204761BQs.LJIIL;
        Iterator<C1BRF> it4 = this.LIZIZ.iterator();
        while (it4.hasNext()) {
            it4.next().LIZ(strLJFF2, str5, new C1BM2(C2204711BQn.LJII, this.LJIIIZ, list));
        }
        LJIIJJI(c2204761BQs);
    }

    public void invokeMethod(String str) {
        if (this.LJFF) {
            return;
        }
        C2204811BQx c2204811BQx = new C2204811BQx();
        c2204811BQx.LIZLLL();
        c2204811BQx.LIZ = "label_pre_call_origin_url";
        TimeLineEvent timeLineEventLIZIZ = c2204811BQx.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Received call: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL.execute(new ARunnableS36S1200000_34(this, str, timeLineEventLIZIZ, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r5, X.C2204761BQs r6) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2204751BQr.LIZJ(java.lang.String, X.1BQs):void");
    }

    public final void LIZLLL(JSONObject jSONObject, C2204761BQs c2204761BQs) {
        if (this.LJFF) {
            return;
        }
        if (TextUtils.isEmpty(c2204761BQs.LJFF)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("By passing js callback due to empty callback: ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Boolean bool = c2204761BQs.LJIIIIZZ;
        if (bool != null && bool.booleanValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("hook by BDXBridge: ");
            sbLIZ2.append(c2204761BQs.toString());
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        new C2204811BQx().LIZ("label_pre_callback_origin_url", c2204761BQs.LJIIL);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Invoking js callback: ");
        sbLIZ3.append(c2204761BQs.LJFF);
        C2188811AlT.LIZIZ(sbLIZ3);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", c2204761BQs.LJFF);
            jSONObject2.put("__params", jSONObject);
            LJIIIZ(C786410Ut5.J3(jSONObject2), c2204761BQs);
            new C2204811BQx().LIZ("label_post_callback_origin_url", c2204761BQs.LJIIL);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(C786410Ut5.J3(jSONObject), c2204761BQs);
        }
    }

    public void LJIIIZ(String str, C2204761BQs c2204761BQs) {
        LJIIIIZZ(str);
    }

    public final void LIZ(int i, String str, String str2, String str3, List list) {
        Iterator<C1BRF> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(str, str2, i, str3, new C1BM2(C2204711BQn.LJII, this.LJIIIZ, list));
        }
    }
}
