package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539250q9r extends C1317000kNO implements InterfaceC1541990qEH {
    public C1539210q9n LLILLJJLI;
    public C1537480q70 LLILLL;
    public C1317160kNe LLILZ;
    public boolean LLILZIL;
    public final AbstractC1537870q7d LLILZLL;
    public InterfaceC1538820q9A LLIZ;
    public final String LLIZLLLIL;
    public final Uri LLJ;
    public final C1539290q9v LLJI;
    public boolean LLJIJIL;

    @Override // X.InterfaceC1541990qEH
    public final void LJIJJLI() {
    }

    @Override // X.InterfaceC1541990qEH
    public final void V0(String str) {
    }

    @Override // X.InterfaceC1541990qEH
    public final void W0(Context context) {
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean Z0() {
        return true;
    }

    @Override // X.InterfaceC1541990qEH
    public final void a1() {
    }

    @Override // X.InterfaceC1541990qEH
    public final void b1(Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC1541990qEH
    public final void c1(String str, Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC1541990qEH
    public final View e1() {
        return this;
    }

    @Override // X.InterfaceC1541990qEH
    public final void f1(SparkSchemaParam sparkSchemaParam) {
    }

    @Override // X.InterfaceC1541990qEH
    public Object getAndRemoveForestResponse() {
        return null;
    }

    @Override // X.InterfaceC1541990qEH
    public String getSchema() {
        return "";
    }

    @Override // X.InterfaceC1541990qEH
    public final void onHide() {
    }

    @Override // X.InterfaceC1541990qEH
    public final void onShow() {
    }

    @Override // X.InterfaceC1541990qEH
    public final void reload() {
    }

    @Override // X.InterfaceC1541990qEH
    public Map<String, Object> getGlobalProps() {
        return (Map) this.LLILLJJLI.LJ.getValue();
    }

    public final JSONObject getInitData() {
        C1539210q9n c1539210q9n = this.LLILLJJLI;
        JSONObject jSONObject = c1539210q9n.LJIIIIZZ;
        if (jSONObject != null) {
            return jSONObject;
        }
        c1539210q9n.getClass();
        return null;
    }

    @Override // X.InterfaceC1541990qEH
    public final void load() {
        String strLIZJ = LIZJ(this.LLIZLLLIL);
        setGlobalProps(new JSONObject(C2097608Jq.LJIIZILJ((Map) this.LLILLJJLI.LJ.getValue())));
        AbstractC1537870q7d abstractC1537870q7d = this.LLILZLL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIL(this, String.valueOf(this.LLILLJJLI.LIZ));
        }
        super.load(strLIZJ, getInitData());
    }

    @Override // X.InterfaceC1541990qEH
    public final boolean T0() {
        return this.LLJIJIL;
    }

    public final InterfaceC1538820q9A getBridgeService$sdui_release() {
        return this.LLIZ;
    }

    public final C1317160kNe getBuilder() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1541990qEH
    public C1537480q70 getHybridContext() {
        return this.LLILLL;
    }

    public final C1539210q9n getInitParams() {
        return this.LLILLJJLI;
    }

    public final String LIZJ(String str) {
        String strLIZ;
        Map<String, Object> mapLIZ = new C004Z() { // from class: X.0q9w
            @Override // X.C004Z
            public final Map<String, Object> LIZ(String str2) {
                InterfaceC1193904ll interfaceC1193904ll = C1539370qA3.LIZ;
                if (interfaceC1193904ll != null) {
                    return interfaceC1193904ll.LIZ(str2);
                }
                return null;
            }
        }.LIZ(str);
        if (mapLIZ != null) {
            C1539290q9v c1539290q9v = this.LLJI;
            c1539290q9v.getClass();
            Iterator<Map.Entry<String, Object>> it2 = mapLIZ.entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry<String, Object> next = it2.next();
                    InterfaceC1539380qA4 interfaceC1539380qA4 = (InterfaceC1539380qA4) ((LinkedHashMap) c1539290q9v.LIZ).get(next.getKey());
                    if (interfaceC1539380qA4 != null && (strLIZ = interfaceC1539380qA4.LIZ(next.getValue())) != null && (!a0.LJJJIL(strLIZ))) {
                        break;
                    }
                } else {
                    strLIZ = null;
                    break;
                }
            }
            if (!TextUtils.isEmpty(strLIZ)) {
                return strLIZ;
            }
        }
        return str;
    }

    @Override // X.InterfaceC1541990qEH
    public final void LLD(boolean z) throws JSONException {
        destroy();
        C786410Ut5.LJLIIL(2000L, new BPEAHandler(), new Runnable() { // from class: X.0q9s
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SDUIKitView@7f99.destroy$1");
                try {
                    InterfaceC1538820q9A interfaceC1538820q9A = this.LL.getInitParams().LJII;
                    if (interfaceC1538820q9A != null) {
                        interfaceC1538820q9A.onDestroy();
                    }
                    C1529870puj c1529870puj = C1529870puj.LIZ;
                    String str = this.LL.getHybridContext().containerId;
                    c1529870puj.getClass();
                    C1529870puj.LJI(null, str);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SDUIKitView@7f99.destroy$1");
            }
        });
        this.LLJIJIL = true;
    }

    @Override // X.InterfaceC1541990qEH
    public final void U0(Map<String, ? extends Object> map) {
        Object c098200Yq;
        try {
            setGlobalProps(new JSONObject(map));
            this.LLILLJJLI.LIZLLL(map);
            LIZ("globalPropsUpdated", null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1490740otc c1490740otc = C1490740otc.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateGlobalPropsByIncrement failed, error = ");
            sbLIZ.append(Log.getStackTraceString(thM5exceptionOrNullimpl));
            c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "SDUIKitView");
        }
    }

    @Override // X.InterfaceC1541990qEH
    public final void d1(String str) {
        updateData(str);
    }

    @Override // X.C1317080kNW, X.InterfaceC1541990qEH
    public final void load(String str) {
        String strLIZJ = LIZJ(str);
        AbstractC1537870q7d abstractC1537870q7d = this.LLILZLL;
        if (abstractC1537870q7d != null) {
            abstractC1537870q7d.LJLIIL(this, str);
        }
        setGlobalProps(new JSONObject(C2097608Jq.LJIIZILJ((Map) this.LLILLJJLI.LJ.getValue())));
        super.load(strLIZJ, getInitData());
    }

    public final void setBridgeService$sdui_release(InterfaceC1538820q9A interfaceC1538820q9A) {
        this.LLIZ = interfaceC1538820q9A;
    }

    public final void setBuilder(C1317160kNe c1317160kNe) {
        this.LLILZ = c1317160kNe;
    }

    public void setHybridContext(C1537480q70 c1537480q70) {
        this.LLILLL = c1537480q70;
    }

    public final void setInitParams(C1539210q9n c1539210q9n) {
        this.LLILLJJLI = c1539210q9n;
    }

    @Override // X.C1317080kNW, X.InterfaceC1541990qEH
    public final void updateData(Map<String, ? extends Object> map) {
        super.updateData(map);
    }

    @Override // X.InterfaceC1541990qEH
    public final void LIZ(String str, JSONObject jSONObject) {
        C1538110q81.LIZIZ(this, str, jSONObject);
        sendGlobalEvent(str, jSONObject);
    }

    @Override // X.InterfaceC1541990qEH
    @InterfaceC1294060jmO
    public final void X0(String str, List<? extends Object> list) {
        C1538110q81.LIZ(this, str, list);
    }

    @Override // X.InterfaceC1541990qEH
    public final void Y0(String str, Map<String, ? extends Object> map) {
        C1538110q81.LIZJ(this, str, map);
    }

    public C1539250q9r(final Context context, C1539210q9n c1539210q9n, C1537480q70 c1537480q70, final C1317160kNe c1317160kNe, C1537790q7V c1537790q7V) {
        C1543710qH3 c1543710qH3;
        new C1317080kNW(context, c1317160kNe) { // from class: X.0kNO
            public final Map<String, List<InterfaceC1317030kNR>> LL = new HashMap();

            @Override // X.C1317080kNW
            public final void destroy() throws JSONException {
                super.destroy();
                ((HashMap) this.LL).clear();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0kNN] */
            {
                ?? r1 = new InterfaceC1317030kNR() { // from class: X.0kNN
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
                    @Override // X.InterfaceC1317030kNR
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(java.lang.String r11, org.json.JSONObject r12) throws org.json.JSONException {
                        /*
                            Method dump skipped, instruction units count: 311
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1316990kNN.LIZ(java.lang.String, org.json.JSONObject):void");
                    }
                };
                LIZIZ("playMusicStart", r1);
                LIZIZ("playMusicEnd", r1);
            }

            public final void LIZIZ(String str, C1316990kNN c1316990kNN) {
                if (((HashMap) this.LL).containsKey(str)) {
                    ((List) ((HashMap) this.LL).get(str)).add(c1316990kNN);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1316990kNN);
                ((HashMap) this.LL).put(str, arrayList);
            }

            @Override // X.C1317080kNW
            public final void sendGlobalEvent(String str, JSONObject jSONObject) {
                super.sendGlobalEvent(str, jSONObject);
                List list = (List) ((HashMap) this.LL).get(str);
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        ((InterfaceC1317030kNR) ListProtector.get(list, i)).LIZ(str, jSONObject);
                    }
                }
            }
        };
        this.LLILLJJLI = c1539210q9n;
        this.LLILLL = c1537480q70;
        this.LLILZ = c1317160kNe;
        this.LLIZLLLIL = "";
        C1539290q9v c1539290q9v = new C1539290q9v();
        this.LLJI = c1539290q9v;
        this.LLILZLL = c1537790q7V;
        c1539290q9v.LIZ.put("target_bundle", new InterfaceC1539380qA4() { // from class: X.0qA0
            @Override // X.InterfaceC1539380qA4
            public final String LIZ(Object obj) {
                if (obj instanceof String) {
                    return (String) obj;
                }
                return null;
            }
        });
        c1539290q9v.LIZ.put("extra_info", new InterfaceC1539380qA4() { // from class: X.0q9x
            @Override // X.InterfaceC1539380qA4
            public final String LIZ(Object obj) {
                if ((obj instanceof Map) && obj != null) {
                    this.LIZ.getInitParams().getClass();
                }
                return null;
            }
        });
        addSDUIViewClient(new AbstractC1317190kNh() { // from class: X.0q9q
            @Override // X.AbstractC1317190kNh
            public final void LIZLLL() {
                C1539250q9r c1539250q9r = this.LIZ;
                AbstractC1537870q7d abstractC1537870q7d = c1539250q9r.LLILZLL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIIL(c1539250q9r);
                }
            }

            @Override // X.AbstractC1317190kNh
            public final void LJ() throws JSONException {
                C1539250q9r c1539250q9r = this.LIZ;
                AbstractC1537870q7d abstractC1537870q7d = c1539250q9r.LLILZLL;
                if (abstractC1537870q7d != null) {
                    abstractC1537870q7d.LJLIIIL(c1539250q9r);
                }
                C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_sdui_pv");
                C1539250q9r c1539250q9r2 = this.LIZ;
                c1520360pfO.LIZ = c1539250q9r2.LLIZLLLIL;
                c1539250q9r2.getInitParams().getClass();
                c1520360pfO.LIZIZ = null;
                c1520360pfO.LJIIIIZZ = c1539250q9r2.getHybridContext().containerId;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_path", c1539250q9r2.LLIZLLLIL);
                c1539250q9r2.getInitParams().getClass();
                jSONObject.put("bid", (Object) null);
                jSONObject.put("server_version", "1");
                jSONObject.put("client_version", "0.0.1-rc.48");
                jSONObject.put("page_version", "1");
                jSONObject.put("schema", c1539250q9r2.getHybridContext().LJIJI());
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                c1520200pf8.getClass();
                C1520200pf8.LIZ(c1520350pfNLIZ);
            }

            @Override // X.AbstractC1317190kNh
            public final void LJII(C1291190jhl c1291190jhl) throws JSONException {
                Integer numValueOf;
                String strLIZ;
                Integer numValueOf2;
                String strLIZ2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onReceivedError: ");
                if (c1291190jhl != null) {
                    numValueOf = Integer.valueOf(c1291190jhl.LIZ);
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", errorReason: ");
                if (c1291190jhl != null) {
                    strLIZ = c1291190jhl.LIZ();
                } else {
                    strLIZ = null;
                }
                sbLIZ.append(strLIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                if (c1291190jhl != null) {
                    int i = c1291190jhl.LIZ;
                    C1539250q9r c1539250q9r = this.LIZ;
                    if (i < 0 && !c1539250q9r.LLILZIL) {
                        c1539250q9r.LLILZIL = true;
                        AbstractC1537870q7d abstractC1537870q7d = c1539250q9r.LLILZLL;
                        if (abstractC1537870q7d != null) {
                            String strValueOf = String.valueOf(c1539250q9r.getInitParams().LIZ);
                            C1542120qEU c1542120qEU = new C1542120qEU();
                            c1542120qEU.LIZ = Integer.valueOf(c1291190jhl.LIZ);
                            String strLIZ3 = c1291190jhl.LIZ();
                            strLIZ3.toString();
                            c1542120qEU.LIZIZ = strLIZ3;
                            abstractC1537870q7d.LJL(c1539250q9r, strValueOf, c1542120qEU);
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                C1539250q9r c1539250q9r2 = this.LIZ;
                jSONObject.put("page_path", c1539250q9r2.LLIZLLLIL);
                c1539250q9r2.getInitParams().getClass();
                jSONObject.put("bid", (Object) null);
                jSONObject.put("server_version", "1");
                jSONObject.put("client_version", "0.0.1-rc.48");
                jSONObject.put("page_version", "1");
                jSONObject.put("schema", String.valueOf(c1539250q9r2.LLJ));
                if (c1291190jhl != null) {
                    numValueOf2 = Integer.valueOf(c1291190jhl.LIZ);
                } else {
                    numValueOf2 = null;
                }
                jSONObject.put("error_code", numValueOf2);
                if (c1291190jhl == null || (strLIZ2 = c1291190jhl.LIZ()) == null) {
                    strLIZ2 = "";
                }
                jSONObject.put("error_msg", strLIZ2);
                jSONObject.put("enter_from", "sdk");
                C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                C1520360pfO c1520360pfO = new C1520360pfO("bd_hybrid_monitor_sdui_error_event");
                C1539250q9r c1539250q9r3 = this.LIZ;
                c1520360pfO.LIZ = c1539250q9r3.LLIZLLLIL;
                c1539250q9r3.getInitParams().getClass();
                c1520360pfO.LIZIZ = null;
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                c1520360pfO.LJIIIIZZ = c1539250q9r3.getHybridContext().containerId;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                c1520200pf8.getClass();
                C1520200pf8.LIZ(c1520350pfNLIZ);
            }

            @Override // X.AbstractC1317190kNh
            public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("page_path", this.LIZ.LLIZLLLIL);
                this.LIZ.getInitParams().getClass();
                jSONObject.put("bid", (Object) null);
                jSONObject.put("server_version", "1");
                jSONObject.put("client_version", "0.0.1-rc.48");
                jSONObject.put("page_version", "1");
                jSONObject.put("schema", this.LIZ.getHybridContext().LJIJI());
                C1520200pf8 c1520200pf8 = C1520200pf8.LIZ;
                C1520360pfO c1520360pfO = new C1520360pfO(str);
                C1539250q9r c1539250q9r = this.LIZ;
                c1520360pfO.LIZ = c1539250q9r.LLIZLLLIL;
                c1539250q9r.getInitParams().getClass();
                c1520360pfO.LIZIZ = null;
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LJIIJJI = EnumC993170bx5.Tea;
                c1520360pfO.LJIIIIZZ = c1539250q9r.getHybridContext().containerId;
                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                c1520200pf8.getClass();
                C1520200pf8.LIZ(c1520350pfNLIZ);
            }
        });
        C1537550q77 c1537550q77 = (C1537550q77) getHybridContext().LJFF(C1537550q77.class);
        Uri uri = this.LLILLJJLI.LIZ;
        if (uri != null) {
            this.LLJ = uri;
            this.LLIZLLLIL = String.valueOf(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url"));
        }
        InterfaceC1538820q9A interfaceC1538820q9A = this.LLILLJJLI.LJII;
        if (interfaceC1538820q9A != null) {
            interfaceC1538820q9A.LJI(context, this, c1537550q77);
            interfaceC1538820q9A.LJ();
            C1543410qGZ c1543410qGZ = ((C1542930qFn) interfaceC1538820q9A).LIZIZ;
            InterfaceC1317280kNq interfaceC1317280kNq = this.LLILZ.LIZIZ;
            if ((interfaceC1317280kNq instanceof C1543710qH3) && (c1543710qH3 = (C1543710qH3) interfaceC1317280kNq) != null) {
                c1543710qH3.LIZ = c1543410qGZ;
            }
            final C1543190qGD c1543190qGD = c1543410qGZ.LIZ.LIZ;
            c1543190qGD.LIZIZ(new AbstractC1543580qGq(c1543190qGD) { // from class: X.0q9u
                @Override // X.AbstractC1543580qGq
                public final void LJIIIIZZ() {
                }

                @Override // X.AbstractC1543580qGq
                public final void LJIIIZ(Object obj, String str) throws JSONException {
                    C1539250q9r c1539250q9r = this;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", 1);
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    jSONObject.put("data", obj);
                    c1539250q9r.sendGlobalEvent(str, jSONObject);
                }
            });
        }
        C1539210q9n c1539210q9n2 = this.LLILLJJLI;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("containerID", getHybridContext().containerId);
        InterfaceC1531560pxS interfaceC1531560pxS = getHybridContext().hybridParams;
        pairArr[1] = new Pair("originUrl", String.valueOf(interfaceC1531560pxS != null ? interfaceC1531560pxS.LIZ() : null));
        pairArr[2] = new Pair("templateResData", getHybridContext().templateResData);
        c1539210q9n2.LIZLLL(C2097608Jq.LJIIIIZZ(pairArr));
        C1529870puj.LIZ.getClass();
        C1529870puj.LIZIZ(this);
    }
}
