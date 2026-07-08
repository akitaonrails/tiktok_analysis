package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0df8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058920df8 extends AbstractC1058820dey {
    public static final C1058920df8 LIZ = new C1058920df8();

    public static C1058910df7 LJFF(C1543910qHN c1543910qHN) {
        String value;
        JSONObject jSONObject = new JSONObject(c1543910qHN.LJIILIIL);
        C1058910df7 c1058910df7 = new C1058910df7();
        c1058910df7.LIZJ = jSONObject.optString("func");
        c1058910df7.LIZ = JSONObjectProtectorUtils.getString(jSONObject, "__msg_type");
        c1058910df7.LIZLLL = jSONObject.optJSONObject("params");
        c1058910df7.LIZIZ = jSONObject.optString("__callback_id");
        c1058910df7.LJ = jSONObject.optInt("JSSDK");
        c1058910df7.LJFF = jSONObject.optString("namespace");
        c1058910df7.LJI = jSONObject.optString("__iframe_url");
        EnumC1063540dma enumC1063540dma = c1543910qHN.LJIILLIIL;
        if (enumC1063540dma == null || (value = enumC1063540dma.getValue()) == null) {
            value = "";
        }
        c1058910df7.LJIIJ = value;
        c1058910df7.LJIIJJI = true;
        c1058910df7.LJII = Boolean.TRUE;
        return c1058910df7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0dfI, X.0e6J, X.0q9A, X.0qFn] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0dfD] */
    @Override // X.InterfaceC1058830dez
    public final InterfaceC1538820q9A LIZ(InterfaceC1543060qG0 interfaceC1543060qG0) {
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC1543060qG0;
        if (interfaceC1543060qG0 == 0) {
            c259800zU.element = new C1058970dfD(null, false, 3);
        }
        final ?? r2 = new C1542930qFn() { // from class: X.0dfI
            @Override // X.C1542930qFn, X.InterfaceC1538970q9P
            public final void LJII(Context context) {
                C1059860dge c1059860dge;
                super.LJII(context);
                InterfaceC1541990qEH interfaceC1541990qEHLJIJJLI = LJIJJLI();
                if (interfaceC1541990qEHLJIJJLI != null && (c1059860dge = (C1059860dge) interfaceC1541990qEHLJIJJLI.getHybridContext().LJFF(C1059860dge.class)) != null) {
                    c1059860dge.LIZLLL(Context.class, context);
                }
            }
        };
        r2.LIZLLL = (InterfaceC1543060qG0) c259800zU.element;
        LIZ.getClass();
        ((ArrayList) r2.LJIIIZ).addAll(AbstractC1058820dey.LIZIZ());
        ((ArrayList) r2.LJIIIIZZ).addAll(AbstractC1058820dey.LIZJ());
        r2.LJIIZILJ(new AbstractC1544140qHk() { // from class: X.0dfQ
            @Override // X.AbstractC1544140qHk
            public final String LIZ() {
                return "CrossPlatform_jsb_support_life_clent";
            }

            @Override // X.AbstractC1544140qHk
            public final void LJ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
                C1544200qHq.LIZ(c1543190qGD, c1543910qHN);
            }

            @Override // X.AbstractC1544140qHk
            public final C1543280qGM LJIIIZ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
                InterfaceC1059000dfG interfaceC1059000dfG;
                String strName;
                C1537480q70 hybridContext;
                InterfaceC1541510qDV interfaceC1541510qDV;
                InterfaceC1543060qG0 interfaceC1543060qG02 = c259800zU.element;
                if ((interfaceC1543060qG02 instanceof C1058970dfD) && (interfaceC1059000dfG = ((C1058970dfD) interfaceC1543060qG02).LIZ) != null) {
                    if (interfaceC1059000dfG.LIZ(c1543910qHN.LJFF)) {
                        return super.LJIIIZ(c1543190qGD, c1543910qHN);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the ");
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJLI = LJIJJLI();
                    if (interfaceC1541990qEHLJIJJLI != null && (hybridContext = interfaceC1541990qEHLJIJJLI.getHybridContext()) != null && (interfaceC1541510qDV = (InterfaceC1541510qDV) hybridContext.LJFF(InterfaceC1541510qDV.class)) != null) {
                        strName = interfaceC1541510qDV.name();
                    } else {
                        strName = null;
                    }
                    sbLIZ.append(strName);
                    sbLIZ.append(" runtime does not support this JSB : ");
                    sbLIZ.append(c1543910qHN.LJFF);
                    sbLIZ.append('!');
                    return new C1543280qGM(false, C2188811AlT.LIZIZ(sbLIZ), "CrossPlatform_jsb_support_life_clent");
                }
                return super.LJIIIZ(c1543190qGD, c1543910qHN);
            }
        });
        return r2;
    }

    public static C650250Pex LIZLLL(final String str, final InterfaceC1051760dTa interfaceC1051760dTa, final InterfaceC1058850df1 interfaceC1058850df1) {
        C650250Pex c650250Pex = new C650250Pex();
        c650250Pex.LIZ = str;
        if (!C1697810uHb.LJIILJJIL("x.hideLoading", "x.reportAppLog").contains(str)) {
            c650250Pex.LIZIZ = EnumC1062400dkk.PROTECT;
        }
        c650250Pex.LIZLLL = new C1543340qGS(interfaceC1058850df1, str) { // from class: X.0df0
            public final InterfaceC1051760dTa LIZIZ;
            public final /* synthetic */ InterfaceC1058850df1 LIZLLL;
            public final /* synthetic */ String LJ;

            @Override // X.C1543340qGS, X.InterfaceC1538970q9P
            public final void LJII(Context context) {
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi != null) {
                    iSparkHostApi.LLIILZL(this.LIZIZ, context);
                }
            }

            {
                this.LIZLLL = interfaceC1058850df1;
                this.LJ = str;
                this.LIZIZ = this.LIZJ;
            }

            @Override // X.C1543340qGS
            public final void LIZJ(C1543910qHN c1543910qHN, Object obj, C1543350qGT c1543350qGT) {
                Object c098200Yq;
                if (!(obj instanceof String)) {
                    return;
                }
                InterfaceC1058850df1 interfaceC1058850df12 = this.LIZLLL;
                InterfaceC1051760dTa interfaceC1051760dTa2 = this.LIZJ;
                try {
                    JSONObject jSONObject = new JSONObject();
                    C1058920df8.LIZ.getClass();
                    C1058910df7 c1058910df7LJFF = C1058920df8.LJFF(c1543910qHN);
                    interfaceC1058850df12.LIZIZ(c1058910df7LJFF.LIZIZ, c1543350qGT);
                    interfaceC1051760dTa2.call(c1058910df7LJFF, jSONObject);
                    if (c1058910df7LJFF.LJIIJJI) {
                        c1543350qGT.LIZ(1, jSONObject, "success");
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                String str2 = this.LJ;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fail to invoke JSB ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", error:");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    c1543350qGT.LIZ(0, null, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
        return c650250Pex;
    }

    public static List LJ(InterfaceC1541990qEH interfaceC1541990qEH, Context context, final InterfaceC1058850df1 interfaceC1058850df1, boolean z) {
        Pair pairLLJJJIL;
        C1063220dm4 c1063220dm4LJZI;
        C1018780ccO c1018780ccOLJLJJLL;
        C1BRZ c1brzLJZ;
        ISparkHostApi iSparkHostApi;
        ArrayList arrayList = new ArrayList();
        final C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
        if (interfaceC1541990qEH.e1() instanceof WebView) {
            WebView webView = (WebView) interfaceC1541990qEH.e1();
            IESJsBridge iESJsBridge = new IESJsBridge(webView);
            LIZ.getClass();
            iESJsBridge.LJFF = new InterfaceC1058960dfC() { // from class: X.0df9
                @Override // X.InterfaceC1058960dfC
                public final C1058950dfB LIZ(int i, String str, JSONObject jSONObject) throws Exception {
                    if (str == null) {
                        return null;
                    }
                    InterfaceC1058850df1 interfaceC1058850df12 = interfaceC1058850df1;
                    C1537480q70 c1537480q70 = hybridContext;
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        C1075770e6J c1075770e6J = (C1075770e6J) c1537480q70.LJFF(C1075770e6J.class);
                        if (c1075770e6J != null) {
                            if (jSONObject == null) {
                                jSONObject = new JSONObject();
                            }
                            c1075770e6J.sendEvent(str, jSONObject);
                        }
                        SettingsManager.LIZLLL().getClass();
                        if (!SettingsManager.LIZ("Fix_CrossPlatform_Event_Hook_Bug", false)) {
                            return null;
                        }
                        return new C1058950dfB();
                    }
                    C1058970dfD c1058970dfD = (C1058970dfD) interfaceC1058850df12;
                    if (c1058970dfD.LIZLLL.get()) {
                        return null;
                    }
                    C1051810dTf c1051810dTf = c1058970dfD.LIZJ.get(str);
                    if (c1051810dTf != null) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        c1051810dTf.LIZ(1, jSONObject, "success");
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("crossplatform_jsb_callback_unregister", false)) {
                            c1058970dfD.LIZJ.remove(str);
                        }
                        return new C1058950dfB();
                    }
                    if (!C2213981Bky.LIZIZ.isDebug()) {
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("crossPlatform JSB can not find callback in cache, callback_id = ");
                    sbLIZ.append(str);
                    throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
            if (iSparkHostApi2 != null && (pairLLJJJIL = iSparkHostApi2.LLJJJIL(interfaceC1541990qEH)) != null) {
                Object first = pairLLJJJIL.getFirst();
                Object second = pairLLJJJIL.getSecond();
                ISparkHostApi iSparkHostApi3 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi3 != null && (c1063220dm4LJZI = iSparkHostApi3.LJZI(interfaceC1541990qEH)) != null) {
                    ISparkHostApi iSparkHostApi4 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi4 != null && (c1018780ccOLJLJJLL = iSparkHostApi4.LJLJJLL(interfaceC1541990qEH)) != null) {
                        ISparkHostApi iSparkHostApi5 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                        if (iSparkHostApi5 != null && (c1brzLJZ = iSparkHostApi5.LJZ(second)) != null) {
                            ISparkHostApi iSparkHostApi6 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi6 != null) {
                                iSparkHostApi6.LJLLLLLL(hybridContext, webView, iESJsBridge, first, c1063220dm4LJZI, c1018780ccOLJLJJLL, c1brzLJZ);
                                C1059860dge c1059860dge = new C1059860dge();
                                c1059860dge.LIZLLL(IESJsBridge.class, iESJsBridge);
                                c1059860dge.LIZLLL(Context.class, context);
                                c1059860dge.LIZIZ(InterfaceC1548390qOb.class, new InterfaceC1548390qOb() { // from class: X.0R04
                                    @Override // X.InterfaceC1548390qOb
                                    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
                                        JSONObject jSONObject;
                                        if (interfaceC1107590evd != null) {
                                            C1872780ypo.LIZ.getClass();
                                            jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                                        } else {
                                            jSONObject = new JSONObject();
                                        }
                                        C1075770e6J c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class);
                                        if (c1075770e6J != null) {
                                            c1075770e6J.sendEvent(str, jSONObject);
                                        }
                                    }
                                });
                                c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dfA
                                    @Override // X.InterfaceC1052500dUm
                                    public final String LIZ() {
                                        String str;
                                        C1537480q70 c1537480q70 = hybridContext;
                                        return (c1537480q70 == null || (str = c1537480q70.containerId) == null) ? "" : str;
                                    }
                                });
                                hybridContext.LJJ(C1059860dge.class, c1059860dge);
                                C1075770e6J c1075770e6J = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class);
                                if (c1075770e6J != null) {
                                    c1075770e6J.LJIJ(C1059860dge.class, c1059860dge);
                                }
                                if (!z && !C1544000qHW.LJIIZILJ && (iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null)) != null) {
                                    Map mapLJIILIIL = iSparkHostApi.LJIILIIL(context, hybridContext);
                                    if (!mapLJIILIIL.isEmpty()) {
                                        iSparkHostApi.LLJIJIL(hybridContext);
                                        String strLIZIZ = "all bridge name: \n";
                                        for (Map.Entry entry : mapLJIILIIL.entrySet()) {
                                            C1058920df8 c1058920df8 = LIZ;
                                            String str = (String) entry.getKey();
                                            InterfaceC1051760dTa interfaceC1051760dTa = (InterfaceC1051760dTa) entry.getValue();
                                            c1058920df8.getClass();
                                            C650250Pex c650250PexLIZLLL = LIZLLL(str, interfaceC1051760dTa, interfaceC1058850df1);
                                            arrayList.add(c650250PexLIZLLL);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(strLIZIZ);
                                            sbLIZ.append(c650250PexLIZLLL.LIZ);
                                            sbLIZ.append('\n');
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalStateException("ISparkHostApi.configureDMTJsBridgeForHybridContext() returned null");
                            }
                        } else {
                            throw new IllegalStateException("ISparkHostApi.createJsRequestCallback() returned null");
                        }
                    } else {
                        throw new IllegalStateException("ISparkHostApi.createAdInfo() returned null");
                    }
                } else {
                    throw new IllegalStateException("ISparkHostApi.createIEventObserver() returned null");
                }
            } else {
                throw new IllegalStateException("ISparkHostApi.createContextProviderFactoryWithMonitorSession() returned null");
            }
        }
        return arrayList;
    }
}
