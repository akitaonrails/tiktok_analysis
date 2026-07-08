package X;

import android.app.Application;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.bullet.IBulletHostProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0deq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058740deq extends AbstractC1058820dey {
    public static final C1058740deq LIZ = new C1058740deq();

    public static C1051660dTQ LIZLLL(InterfaceC1541990qEH interfaceC1541990qEH) {
        Context context;
        Context contextN3;
        AbstractC1047330dMR abstractC1047330dMR;
        InterfaceC1058800dew interfaceC1058800dew;
        InterfaceC1531560pxS interfaceC1531560pxS;
        Context context2;
        C1051660dTQ c1051660dTQ = new C1051660dTQ();
        interfaceC1541990qEH.getHybridContext().LJJ(C1051660dTQ.class, c1051660dTQ);
        View viewE1 = interfaceC1541990qEH.e1();
        c1051660dTQ.LIZIZ = interfaceC1541990qEH.getHybridContext();
        View viewE12 = interfaceC1541990qEH.e1();
        final EnumC1067640dtC type = null;
        if (viewE12 != null) {
            context = viewE12.getContext();
        } else {
            context = null;
        }
        c1051660dTQ.LJ(Context.class, context);
        c1051660dTQ.LJ(View.class, viewE1);
        View viewE13 = interfaceC1541990qEH.e1();
        if (viewE13 != null && (context2 = viewE13.getContext()) != null) {
            contextN3 = C786410Ut5.N3(context2);
        } else {
            contextN3 = null;
        }
        if (contextN3 instanceof Application) {
            c1051660dTQ.LIZJ(Application.class, contextN3);
        }
        C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
        if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null) {
            type = interfaceC1531560pxS.getType();
        }
        if (C0DJQ.LIZ()) {
            final WeakReference weakReference = new WeakReference(interfaceC1541990qEH);
            abstractC1047330dMR = new AbstractC1047330dMR(type, weakReference) { // from class: X.0dYE
                public final EnumC1067640dtC LIZJ;

                @Override // X.AbstractC1047330dMR, X.InterfaceC1028200cra
                public final EnumC1054630dYD LJ() {
                    EnumC1067640dtC enumC1067640dtC = this.LIZJ;
                    return enumC1067640dtC == EnumC1067640dtC.LYNX ? EnumC1054630dYD.LYNX : enumC1067640dtC == EnumC1067640dtC.WEB ? EnumC1054630dYD.WEB : enumC1067640dtC == EnumC1067640dtC.SDUI ? EnumC1054630dYD.SDUI : EnumC1054630dYD.NONE;
                }

                {
                    super(weakReference);
                    this.LIZJ = type;
                }
            };
        } else {
            final WeakReference weakReference2 = new WeakReference(interfaceC1541990qEH);
            abstractC1047330dMR = new AbstractC1047330dMR(weakReference2) { // from class: X.0dYG
                @Override // X.AbstractC1047330dMR, X.InterfaceC1028200cra
                public final EnumC1054630dYD LJ() {
                    EnumC1067640dtC enumC1067640dtC = type;
                    return enumC1067640dtC == EnumC1067640dtC.LYNX ? EnumC1054630dYD.LYNX : enumC1067640dtC == EnumC1067640dtC.WEB ? EnumC1054630dYD.WEB : enumC1067640dtC == EnumC1067640dtC.SDUI ? EnumC1054630dYD.SDUI : EnumC1054630dYD.NONE;
                }
            };
        }
        c1051660dTQ.LIZJ(InterfaceC1028200cra.class, abstractC1047330dMR);
        if (viewE1 instanceof WebView) {
            c1051660dTQ.LJ(WebView.class, viewE1);
            c1051660dTQ.LIZJ(IESJsBridge.class, new IESJsBridge((WebView) viewE1));
        } else if (viewE1 instanceof LynxView) {
            c1051660dTQ.LJ(LynxView.class, viewE1);
        }
        if (C0DJQ.LIZ()) {
            interfaceC1058800dew = new InterfaceC1058800dew() { // from class: X.0der
                @Override // X.InterfaceC1058800dew
                public final void LIZ(int i, JSONObject jSONObject) {
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null) {
                        iSparkHostApi.LJII(i, jSONObject);
                    }
                }
            };
        } else {
            interfaceC1058800dew = new InterfaceC1058800dew() { // from class: X.0des
                @Override // X.InterfaceC1058800dew
                public final void LIZ(int i, JSONObject jSONObject) {
                    ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi != null) {
                        iSparkHostApi.LJII(i, jSONObject);
                    }
                }
            };
        }
        C1058770det c1058770det = new C1058770det();
        c1058770det.LIZ = "99999";
        c1051660dTQ.LIZJ(InterfaceC1058720deo.class, new C1058860df2(interfaceC1058800dew, new C1058780deu(c1058770det.LIZ)));
        c1051660dTQ.LJ(InterfaceC1541990qEH.class, interfaceC1541990qEH);
        return c1051660dTQ;
    }

    @Override // X.InterfaceC1058830dez
    public final InterfaceC1538820q9A LIZ(InterfaceC1543060qG0 interfaceC1543060qG0) {
        C1542930qFn c1542930qFn = new C1542930qFn() { // from class: X.0dfH
            @Override // X.C1542930qFn, X.InterfaceC1538970q9P
            public final void LJII(Context context) {
                super.LJII(context);
                final InterfaceC1541990qEH interfaceC1541990qEHLJIJJLI = LJIJJLI();
                if (interfaceC1541990qEHLJIJJLI != null) {
                    C1051660dTQ c1051660dTQ = (C1051660dTQ) interfaceC1541990qEHLJIJJLI.getHybridContext().LJFF(C1051660dTQ.class);
                    if (c1051660dTQ != null) {
                        c1051660dTQ.LJ(Context.class, context);
                    }
                    C1059860dge c1059860dge = (C1059860dge) interfaceC1541990qEHLJIJJLI.getHybridContext().LJFF(C1059860dge.class);
                    if (c1059860dge == null) {
                        C1059860dge c1059860dge2 = new C1059860dge();
                        c1059860dge2.LIZLLL(Context.class, context);
                        c1059860dge2.LIZLLL(C1051660dTQ.class, c1051660dTQ);
                        c1059860dge2.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dfJ
                            @Override // X.InterfaceC1052500dUm
                            public final String LIZ() {
                                return interfaceC1541990qEHLJIJJLI.getHybridContext().containerId;
                            }
                        });
                        interfaceC1541990qEHLJIJJLI.getHybridContext().LJJ(C1059860dge.class, c1059860dge2);
                        LJIJ(C1059860dge.class, c1059860dge2);
                        return;
                    }
                    c1059860dge.LIZLLL(Context.class, context);
                    c1059860dge.LIZLLL(C1051660dTQ.class, c1051660dTQ);
                }
            }
        };
        c1542930qFn.LIZLLL = new InterfaceC1543060qG0() { // from class: X.0dn2
            @Override // X.InterfaceC1543060qG0
            public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH) {
                String str = interfaceC1541990qEH.getHybridContext().containerId;
                C1063840dn4.LIZ.getClass();
                C1063840dn4.LIZJ.getValue().remove(str);
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
            @Override // X.InterfaceC1543060qG0
            public final void LIZ(Context context, InterfaceC1541990qEH interfaceC1541990qEH) {
                List<Class<? extends InterfaceC1063710dmr>> listLIZ;
                IBulletHostProxy iBulletHostProxy;
                List<InterfaceC1051730dTX> listLIZJ;
                C650250Pex c650250PexLJ;
                C1075770e6J c1075770e6J;
                HashMap<Class<?>, HashMap<String, Class<?>>> mapLJFF;
                Integer numValueOf;
                HashMap<Class<?>, HashMap<String, Class<?>>> mapLIZLLL;
                Integer numValueOf2;
                C1075770e6J c1075770e6J2;
                C1075770e6J c1075770e6J3 = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
                if (c1075770e6J3 != null) {
                    if (interfaceC1541990qEH.e1() != null) {
                        boolean z = interfaceC1541990qEH.getHybridContext().jsbOptimizeV2;
                        C1063840dn4.LIZ.getClass();
                        final C259800zU c259800zU = new C259800zU();
                        c259800zU.element = interfaceC1541990qEH.getHybridContext().containerId;
                        C1058740deq.LIZ.getClass();
                        C1051660dTQ c1051660dTQLIZLLL = C1058740deq.LIZLLL(interfaceC1541990qEH);
                        C1063840dn4.LIZJ.getValue().put(c259800zU.element, c1051660dTQLIZLLL);
                        interfaceC1541990qEH.getHybridContext().LJJ(C1051660dTQ.class, c1051660dTQLIZLLL);
                        C1059860dge c1059860dge = new C1059860dge();
                        c1059860dge.LIZLLL(Context.class, c1051660dTQLIZLLL.LIZIZ(Context.class));
                        c1059860dge.LIZLLL(C1051660dTQ.class, c1051660dTQLIZLLL);
                        c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.0dn5
                            @Override // X.InterfaceC1052500dUm
                            public final String LIZ() {
                                return c259800zU.element;
                            }
                        });
                        interfaceC1541990qEH.getHybridContext().LJJ(C1059860dge.class, c1059860dge);
                        C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                        if (hybridContext != null && (c1075770e6J2 = (C1075770e6J) hybridContext.LJFF(C1075770e6J.class)) != null) {
                            c1075770e6J2.LJIJ(C1059860dge.class, c1059860dge);
                        }
                        C1063830dn3.LIZIZ();
                        if (C1543410qGZ.LJIIJJI == null) {
                            C1063910dnB.LIZ(Boolean.TRUE, "jsb_tt_bridge_factory_manager_null");
                            C1063830dn3.LIZ();
                        }
                        C1063910dnB.LIZ(C1543410qGZ.LJIIJJI, "jsb_tt_register_ibridge");
                        C1063890dn9 c1063890dn9 = C1543410qGZ.LJIIJJI;
                        if (c1063890dn9 != null) {
                            boolean zLJJJLZIJ = false;
                            ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                            if (iSparkHostApi != null) {
                                zLJJJLZIJ = iSparkHostApi.LJJJLZIJ();
                            }
                            C1063910dnB.LIZ(Boolean.valueOf(zLJJJLZIJ), "jsb_tt_xbridge_classes");
                            SettingsManager.LIZLLL().getClass();
                            boolean zLIZ = SettingsManager.LIZ("jsb_spark_init_optimize", false);
                            if (zLIZ && (C1871520ynm.LJIIL == null || !zLJJJLZIJ)) {
                                if (iSparkHostApi != null) {
                                    iSparkHostApi.LJJJ();
                                    iSparkHostApi.LJJJJI();
                                }
                                C1063910dnB.LIZ(Boolean.TRUE, "jsb_tt_init_optimize_settings_2");
                            }
                            if (!C1544000qHW.LJIIZILJ) {
                                if (zLIZ) {
                                    IBulletHostProxy iBulletHostProxy2 = C1063840dn4.LIZIZ;
                                    if (iBulletHostProxy2 != null && (mapLIZLLL = iBulletHostProxy2.LIZLLL()) != null) {
                                        HashMap<String, Class<?>> map = mapLIZLLL.get(InterfaceC1063690dmp.class);
                                        if (map != null) {
                                            numValueOf2 = Integer.valueOf(map.size());
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        C1063910dnB.LIZ(String.valueOf(numValueOf2), "jsb_tt_init_only_xbridge_classes_size");
                                        ((C1063810dn1) c1063890dn9).LIZLLL(mapLIZLLL);
                                    }
                                } else {
                                    IBulletHostProxy iBulletHostProxy3 = C1063840dn4.LIZIZ;
                                    if (iBulletHostProxy3 != null && (mapLJFF = iBulletHostProxy3.LJFF()) != null) {
                                        HashMap<String, Class<?>> map2 = mapLJFF.get(InterfaceC1063690dmp.class);
                                        if (map2 != null) {
                                            numValueOf = Integer.valueOf(map2.size());
                                        } else {
                                            numValueOf = null;
                                        }
                                        C1063910dnB.LIZ(String.valueOf(numValueOf), "jsb_tt_init_xbridge_classes_size");
                                        ((C1063810dn1) c1063890dn9).LIZLLL(mapLJFF);
                                    }
                                }
                            }
                            C1063910dnB.LIZ(Boolean.TRUE, "jsb_tt_init_xbridge_classes");
                        }
                        if (!z && !C1544000qHW.LJIIZILJ && (iBulletHostProxy = C1063840dn4.LIZIZ) != null && (listLIZJ = iBulletHostProxy.LIZJ(c1051660dTQLIZLLL)) != null) {
                            C1063910dnB.LIZ(Integer.valueOf(listLIZJ.size()), "jsb_tt_init_unique_constructor_method_size");
                            for (InterfaceC1051730dTX interfaceC1051730dTX : listLIZJ) {
                                C1058740deq.LIZ.getClass();
                                if (!C1544000qHW.LJIIZILJ && (c650250PexLJ = C1058740deq.LJ(interfaceC1051730dTX, interfaceC1541990qEH)) != null && (c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class)) != null) {
                                    c1075770e6J.LJIILJJIL(c650250PexLJ);
                                }
                            }
                        }
                        C1063910dnB.LIZ(Boolean.TRUE, "init_unique_constructor_method");
                    }
                    C1063840dn4.LIZ.getClass();
                    C1063830dn3.LIZIZ();
                    IBulletHostProxy iBulletHostProxy4 = C1063840dn4.LIZIZ;
                    if (iBulletHostProxy4 != null && (listLIZ = iBulletHostProxy4.LIZ()) != null) {
                        Iterator<Class<? extends InterfaceC1063710dmr>> it2 = listLIZ.iterator();
                        while (it2.hasNext()) {
                            C1543490qGh.LIZIZ(it2.next(), null, 6);
                        }
                    }
                    c1075770e6J3.LJIILIIL("bullet");
                }
            }
        };
        LIZ.getClass();
        ((ArrayList) c1542930qFn.LJIIIZ).addAll(AbstractC1058820dey.LIZIZ());
        ((ArrayList) c1542930qFn.LJIIIIZZ).addAll(AbstractC1058820dey.LIZJ());
        c1542930qFn.LJIIZILJ(new AbstractC1544140qHk() { // from class: X.0dfR
            @Override // X.AbstractC1544140qHk
            public final String LIZ() {
                return "Bullet_bridge_life_client";
            }

            @Override // X.AbstractC1544140qHk
            public final void LJ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
                C1544200qHq.LIZ(c1543190qGD, c1543910qHN);
            }
        });
        return c1542930qFn;
    }

    public static C650250Pex LJ(final InterfaceC1051730dTX interfaceC1051730dTX, InterfaceC1541990qEH interfaceC1541990qEH) {
        final boolean z;
        EnumC1062400dkk enumC1062400dkk;
        EnumC1067640dtC type = null;
        if (C1544000qHW.LJIIZILJ) {
            return null;
        }
        InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
        if (interfaceC1531560pxS != null) {
            type = interfaceC1531560pxS.getType();
        }
        if (type == EnumC1067640dtC.WEB) {
            z = true;
        } else {
            z = false;
        }
        C650250Pex c650250Pex = new C650250Pex();
        c650250Pex.LIZ = interfaceC1051730dTX.getName();
        c650250Pex.LIZJ = "";
        EnumC1051570dTH access = interfaceC1051730dTX.getAccess();
        if (C1544000qHW.LJIIZILJ) {
            enumC1062400dkk = EnumC1062400dkk.PUBLIC;
        } else {
            int i = C1051560dTG.LIZ[access.ordinal()];
            if (i != 1) {
                if (i == 2 || i != 3) {
                    enumC1062400dkk = EnumC1062400dkk.PUBLIC;
                } else {
                    enumC1062400dkk = EnumC1062400dkk.PROTECT;
                }
            } else {
                enumC1062400dkk = EnumC1062400dkk.PRIVATE;
            }
        }
        c650250Pex.LIZIZ = enumC1062400dkk;
        interfaceC1051730dTX.getNeedCallback();
        c650250Pex.LIZLLL = new C1543340qGS() { // from class: X.0dep
            @Override // X.C1543340qGS, X.InterfaceC1538970q9P
            public final void LJII(Context context) {
            }

            @Override // X.C1543340qGS
            public final void LIZLLL() {
                interfaceC1051730dTX.release();
            }

            @Override // X.C1543340qGS
            public final void LIZJ(C1543910qHN c1543910qHN, Object obj, final C1543350qGT c1543350qGT) {
                JSONObject jSONObject;
                String value;
                Object c098200Yq;
                if (!(obj instanceof String)) {
                    return;
                }
                try {
                    jSONObject = new JSONObject((String) obj);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (Intrinsics.LJFF(a0.LJLIIIL((String) obj).toString(), "")) {
                        jSONObject = new JSONObject();
                    } else {
                        c1543350qGT.LIZ(-1, null, "params illegal, params = " + ((String) obj));
                        return;
                    }
                }
                if (z) {
                    C1058740deq c1058740deq = C1058740deq.LIZ;
                    String str = c1543910qHN.LJIILIIL;
                    EnumC1063540dma enumC1063540dma = c1543910qHN.LJIILLIIL;
                    if (enumC1063540dma == null || (value = enumC1063540dma.getValue()) == null) {
                        value = "";
                    }
                    c1058740deq.getClass();
                    if (!C1544000qHW.LJIIZILJ) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", jSONObject2.optString("__msg_type"));
                            jSONObject3.put("func", jSONObject2.optString("func"));
                            jSONObject3.put("callback_id", jSONObject2.optString("__callback_id", ""));
                            jSONObject3.put("version", jSONObject2.optString("JSSDK"));
                            jSONObject3.put("fromBDXBridge", true);
                            jSONObject3.put("needCallback", true);
                            jSONObject3.put("permissionGroup", value);
                            jSONObject.put("jsMsg", jSONObject3);
                            jSONObject.put("func", jSONObject2.optString("func"));
                            jSONObject.put("res", new JSONObject());
                            c098200Yq = jSONObject.put("permissionGroup", value);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    }
                }
                interfaceC1051730dTX.handle(jSONObject, new InterfaceC1058710den() { // from class: X.0QBC
                    @Override // X.InterfaceC1058710den
                    public final void LIZ(JSONObject jSONObject4) {
                        c1543350qGT.LIZ(1, jSONObject4, "success");
                    }

                    @Override // X.InterfaceC1058710den
                    public final void onError(int i2, String str2) {
                        c1543350qGT.LIZ(i2, null, str2);
                    }

                    @Override // X.InterfaceC1058710den
                    public final void LIZIZ(int i2, String str2, JSONObject jSONObject4) throws JSONException {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("code", i2);
                        jSONObject5.put("msg", str2);
                        jSONObject5.put("data", jSONObject4);
                        c1543350qGT.LIZ(i2, jSONObject5, str2);
                    }
                });
            }
        };
        return c650250Pex;
    }
}
