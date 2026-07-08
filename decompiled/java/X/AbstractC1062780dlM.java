package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dlM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1062780dlM extends AbstractC1063600dmg {
    public volatile InterfaceC1063690dmp LLILLJJLI;

    public abstract InterfaceC1063690dmp LIZ();

    @Override // X.InterfaceC1063710dmr
    public final void realHandle(Map<String, ? extends Object> map, final InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC) {
        JSONObject jSONObject;
        EnumC1059790dgX enumC1059790dgX;
        C1543190qGD c1543190qGD;
        EnumC1063300dmC enumC1063300dmC2;
        C1059860dge c1059860dge;
        Context context;
        View view = null;
        if (this.LLILLJJLI == null) {
            synchronized (this) {
                try {
                    if (this.LLILLJJLI == null) {
                        C1544610qIV c1544610qIV = this.LL;
                        if (c1544610qIV == null || (c1059860dge = (C1059860dge) c1544610qIV.LIZIZ(C1059860dge.class)) == null) {
                            c1059860dge = new C1059860dge();
                            C1544610qIV c1544610qIV2 = this.LL;
                            if (c1544610qIV2 != null) {
                                context = c1544610qIV2.getContext();
                            } else {
                                context = null;
                            }
                            c1059860dge.LIZLLL(Context.class, context);
                            c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dlN
                                @Override // X.InterfaceC1052500dUm
                                public final String LIZ() {
                                    C1544610qIV c1544610qIV3 = this.LIZ.LL;
                                    if (c1544610qIV3 != null) {
                                        return c1544610qIV3.LIZLLL;
                                    }
                                    return null;
                                }
                            });
                        }
                        this.LLILLJJLI = LIZ();
                        InterfaceC1063690dmp interfaceC1063690dmp = this.LLILLJJLI;
                        if (interfaceC1063690dmp != null) {
                            interfaceC1063690dmp.LIZ(c1059860dge);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC1063690dmp interfaceC1063690dmp2 = this.LLILLJJLI;
        if (interfaceC1063690dmp2 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("code", -2);
            linkedHashMap.put("msg", "xBridgeMethod is null, it doesn't support in this environment");
            interfaceC801410VcB.LIZ(linkedHashMap);
            return;
        }
        Object obj = map.get("real_original_params");
        Object obj2 = map;
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 instanceof JSONObject) {
            jSONObject = (JSONObject) obj2;
        } else {
            jSONObject = new JSONObject();
        }
        C1323820kYO c1323820kYO = new C1323820kYO(jSONObject);
        InterfaceC1063920dnC interfaceC1063920dnC = new InterfaceC1063920dnC() { // from class: X.0VcA
            @Override // X.InterfaceC1063920dnC
            public final void LIZ(Map<String, Object> map2) {
                Object c098200Yq;
                try {
                    interfaceC801410VcB.LIZ(map2);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                InterfaceC801410VcB interfaceC801410VcB2 = interfaceC801410VcB;
                AbstractC1062780dlM abstractC1062780dlM = this;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    abstractC1062780dlM.getClass();
                    interfaceC801410VcB2.LIZ(C2097608Jq.LJIIIIZZ(new Pair("code", Integer.valueOf(C386801es.DEFAULT)), new Pair("msg", C13LQ.LJJJ(thM5exceptionOrNullimpl.getStackTrace(), "\n", null, null, null, 62)), new Pair("data", map2)));
                }
            }
        };
        C1544610qIV c1544610qIV3 = this.LL;
        if (c1544610qIV3 != null && (c1543190qGD = (C1543190qGD) c1544610qIV3.LIZIZ(C1543190qGD.class)) != null && (enumC1063300dmC2 = c1543190qGD.LJIILJJIL) != null) {
            if (enumC1063300dmC2 == EnumC1063300dmC.LYNX) {
                enumC1059790dgX = EnumC1059790dgX.LYNX;
            } else if (enumC1063300dmC2 == EnumC1063300dmC.WEB) {
                enumC1059790dgX = EnumC1059790dgX.WEB;
            } else {
                enumC1059790dgX = EnumC1059790dgX.ALL;
            }
        } else {
            C1544610qIV c1544610qIV4 = this.LL;
            if (c1544610qIV4 != null) {
                view = c1544610qIV4.getView();
            }
            if (view instanceof LynxView) {
                enumC1059790dgX = EnumC1059790dgX.LYNX;
            } else if (view instanceof WebView) {
                enumC1059790dgX = EnumC1059790dgX.WEB;
            } else {
                enumC1059790dgX = EnumC1059790dgX.ALL;
            }
        }
        interfaceC1063690dmp2.LIZIZ(c1323820kYO, interfaceC1063920dnC, enumC1059790dgX);
    }
}
