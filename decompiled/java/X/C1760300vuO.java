package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1760300vuO implements InterfaceC1760230vuH {
    public static final /* synthetic */ int LJFF = 0;
    public final C1760330vuR LIZIZ;
    public C1760290vuN LIZJ;
    public InterfaceC1541990qEH LIZLLL;
    public final Map<String, Object> LJ = new LinkedHashMap();

    public final void LIZIZ() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZLLL;
        if (interfaceC1541990qEH != null) {
            interfaceC1541990qEH.LLD(true);
        }
        this.LIZLLL = null;
        this.LIZJ = null;
        ((LinkedHashMap) this.LJ).clear();
    }

    public final View LIZJ() {
        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZLLL;
        if (interfaceC1541990qEH != null) {
            return interfaceC1541990qEH.e1();
        }
        return null;
    }

    public C1760300vuO(C1760330vuR c1760330vuR) {
        this.LIZIZ = c1760330vuR;
    }

    public final void LJ(Map<String, ? extends Object> map) {
        Map<String, Object> map2 = this.LJ;
        if (map != null) {
            map2.putAll(map);
        }
        C1018703yb.LJ("tiktokec_rd_pdp_exception_dynamic_container", map2);
    }

    public final InterfaceC1541990qEH LIZ(Context context, C1760290vuN c1760290vuN, final InterfaceC1760340vuS interfaceC1760340vuS) {
        boolean z;
        boolean z2;
        HybridSchemaParam hybridSchemaParamLIZJ;
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ;
        String str;
        IECommerceHostService iECommerceHostService;
        List listLJJLIIIJILLIZJL;
        String str2;
        IECommerceHostService iECommerceHostService2;
        boolean z3;
        List listLJJLIIIJILLIZJL2;
        String str3;
        IECommerceHostService iECommerceHostService3;
        boolean z4;
        boolean z5;
        String name;
        C1760330vuR c1760330vuR;
        C1537910q7h c1537910q7h;
        String str4 = c1760290vuN.LIZIZ;
        if (str4 != null && !a0.LJJJIL(str4)) {
            z = false;
        } else {
            z = true;
        }
        String name2 = null;
        if (z) {
            return null;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1760330vuR c1760330vuR2 = this.LIZIZ;
        if (c1760330vuR2 != null && c1760330vuR2.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        String str5 = c1760290vuN.LIZIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        boolean z6 = !z2;
        c1538590q8n.LIZLLL = z6;
        c1538590q8n.LJ = z6;
        c1538590q8n.LJFF = false;
        c1538590q8n.LJI = true;
        c1538590q8n.LIZ = true;
        SparkContext sparkContextLIZJ = c1538140q84.LIZJ(str5, c1538590q8n);
        Map<String, Object> map = c1760290vuN.LIZLLL;
        if (map != null) {
            sparkContextLIZJ.LJJLIIIJILLIZJL(map);
        }
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContextLIZJ.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            Map<String, Object> map2 = c1760290vuN.LIZJ;
            if (map2 != null && !map2.isEmpty()) {
                c1537910q7h.LJIJJ = TemplateData.LJII(c1760290vuN.LIZJ);
            }
            c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0vuQ
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIIJ() {
                    InterfaceC1760340vuS interfaceC1760340vuS2 = interfaceC1760340vuS;
                    if (interfaceC1760340vuS2 != null) {
                        interfaceC1760340vuS2.LJJ();
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILJJIL() {
                    C1760300vuO c1760300vuO = this;
                    Map<? extends String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("load_result", 1), new Pair("t_load_end", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)));
                    c1760300vuO.getClass();
                    Map<String, Object> map3 = c1760300vuO.LJ;
                    map3.putAll(mapLJIIIIZZ);
                    C1018703yb.LJ("tiktokec_rd_pdp_perf_dynamic_container", map3);
                    InterfaceC1760340vuS interfaceC1760340vuS2 = interfaceC1760340vuS;
                    if (interfaceC1760340vuS2 != null) {
                        interfaceC1760340vuS2.LJIJJLI();
                    }
                }
            });
        }
        if (z2 && (c1760330vuR = this.LIZIZ) != null && c1760330vuR.LIZIZ.get() != null) {
            sparkContextLIZJ.LJJ(InterfaceC1538610q8p.class, new C21395118o9(this.LIZIZ.LIZIZ.get()));
        }
        InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContextLIZJ.hybridParams;
        if (interfaceC1531560pxS2 == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) == null || (interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContextLIZJ, context, new AbstractC1537870q7d() { // from class: X.0vuP
            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str6) {
                InterfaceC1760340vuS interfaceC1760340vuS2 = interfaceC1760340vuS;
                if (interfaceC1760340vuS2 != null) {
                    interfaceC1760340vuS2.LIZ();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((Object) null);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str6, C1542120qEU c1542120qEU) {
                C1760300vuO c1760300vuO = this;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("load_result", 0);
                pairArr[1] = new Pair("error_msg", "load fail");
                String str7 = c1542120qEU.LIZIZ;
                if (str7 == null) {
                    str7 = "";
                }
                pairArr[2] = new Pair("extra_error_info", str7);
                pairArr[3] = new Pair("t_load_end", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                Map<? extends String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                c1760300vuO.getClass();
                Map<String, Object> map3 = c1760300vuO.LJ;
                map3.putAll(mapLJIIIIZZ);
                C1018703yb.LJ("tiktokec_rd_pdp_perf_dynamic_container", map3);
                InterfaceC1760340vuS interfaceC1760340vuS2 = interfaceC1760340vuS;
                if (interfaceC1760340vuS2 != null) {
                    interfaceC1760340vuS2.LJIL(c1542120qEU.LIZIZ);
                }
            }
        })) == null) {
            return null;
        }
        C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEHLIZIZ.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J != null) {
            C1757320vpa c1757320vpa = new C1757320vpa(null);
            InterfaceC1760150vu9<?> interfaceC1760150vu9 = c1760290vuN.LJI;
            if (interfaceC1760150vu9 != null) {
                c1757320vpa.LIZJ = new WeakReference<>(interfaceC1760150vu9);
            }
            ISeaPdpCommunicationService iSeaPdpCommunicationService = c1760290vuN.LJ;
            if (iSeaPdpCommunicationService != null) {
                c1757320vpa.LIZLLL = new WeakReference<>(iSeaPdpCommunicationService);
            }
            c1075770e6J.LJIJ(C1757320vpa.class, c1757320vpa);
        }
        if (C1744700vVE.LJ(context, null)) {
            str = "dark";
        } else {
            str = "light";
        }
        C1537720q7O c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
        c1537720q7O.U0(C2097908Jt.LIZJ(new Pair("theme", str)));
        Map<String, Object> map3 = c1760290vuN.LJFF;
        if (map3 != null) {
            this.LJ.putAll(map3);
        }
        this.LJ.put("container_name", c1760290vuN.LIZ);
        this.LJ.put("container_type", Integer.valueOf(EnumC1760270vuL.LYNX.getType()));
        this.LJ.put("t_create_end", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z5);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            String strLIZIZ = C20723089x.LIZIZ(c1760290vuN.LIZIZ);
            if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
                this.LJ.put("gecko_url", strLIZIZ);
                String str6 = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{"tiktok/fe/live/"}, 0, 6));
                if (str6 != null && (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str6, new String[]{"/"}, 0, 6)) != null && (str3 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL2)) != null && !a0.LJJJIL(str3)) {
                    this.LJ.put("gecko_channel", str3);
                    Map<String, Object> map4 = this.LJ;
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                        IHybridDependencyService iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                        if (iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String name4 = IHybridDependencyService.class.getName();
                        if (iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin != null) {
                            name2 = iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                        }
                        C1AQS.LIZJ(jElapsedRealtime3, 1, name4, name2, z4);
                        iECommerceHostService3 = iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin;
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                    }
                    map4.put("is_offline", Integer.valueOf(((IHybridDependencyService) iECommerceHostService3).isGeckoBundleExists(str3) ? 1 : 0));
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                String strLIZIZ2 = C20723089x.LIZIZ(c1760290vuN.LIZIZ);
                if (strLIZIZ2 != null && !a0.LJJJIL(strLIZIZ2)) {
                    this.LJ.put("gecko_url", strLIZIZ2);
                    String str7 = (String) C13LP.LJJJLZIJ(1, a0.LJJLIIIJILLIZJL(strLIZIZ2, new String[]{"tiktok/fe/live/"}, 0, 6));
                    if (str7 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str7, new String[]{"/"}, 0, 6)) != null && (str2 = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) != null && !a0.LJJJIL(str2)) {
                        this.LJ.put("gecko_channel", str2);
                        Map<String, Object> map5 = this.LJ;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                            IHybridDependencyService iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin2 = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                            if (iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String name5 = IHybridDependencyService.class.getName();
                            if (iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin2 != null) {
                                name2 = iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin2.getClass().getName();
                            }
                            C1AQS.LIZJ(jElapsedRealtime4, 1, name5, name2, z3);
                            iECommerceHostService2 = iHybridDependencyServiceCreateIHybridDependencyServicebyMonsterPlugin2;
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
                        }
                        map5.put("is_offline", Integer.valueOf(((IHybridDependencyService) iECommerceHostService2).isGeckoBundleExists(str2) ? 1 : 0));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        c1537720q7O.load();
        return interfaceC1541990qEHLIZIZ;
    }

    public final View LIZLLL(Context context, C1760290vuN c1760290vuN, InterfaceC1760340vuS interfaceC1760340vuS) {
        boolean z;
        IECommerceHostService iECommerceHostService;
        String str;
        View viewE1;
        LynxView lynxView;
        String str2;
        View viewE12;
        LynxView lynxView2;
        boolean z2;
        String name;
        String str3 = c1760290vuN.LIZIZ;
        if (str3 != null && !a0.LJJJIL(str3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LJ(C2097908Jt.LIZJ(new Pair("error_msg", "schema null")));
            return LIZJ();
        }
        Unit unit = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (this.LIZLLL != null) {
                String str4 = c1760290vuN.LIZIZ;
                C1760290vuN c1760290vuN2 = this.LIZJ;
                if (c1760290vuN2 != null) {
                    str2 = c1760290vuN2.LIZIZ;
                } else {
                    str2 = null;
                }
                if (C20723089x.LIZ(str4, str2)) {
                    Map<String, Object> map = c1760290vuN.LIZJ;
                    if (map != null) {
                        InterfaceC1541990qEH interfaceC1541990qEH = this.LIZLLL;
                        if (interfaceC1541990qEH != null) {
                            viewE12 = interfaceC1541990qEH.e1();
                        } else {
                            viewE12 = null;
                        }
                        if (viewE12 instanceof LynxView) {
                            lynxView2 = (LynxView) viewE12;
                        } else {
                            lynxView2 = null;
                        }
                        if (lynxView2 != null) {
                            lynxView2.updateData(map);
                            unit = Unit.LIZ;
                        }
                    }
                } else {
                    LJ(C2097908Jt.LIZJ(new Pair("error_msg", "schema change")));
                    unit = Unit.LIZ;
                }
            } else {
                this.LIZJ = c1760290vuN;
                this.LIZLLL = LIZ(context, c1760290vuN, interfaceC1760340vuS);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } else {
            try {
                if (this.LIZLLL != null) {
                    String str5 = c1760290vuN.LIZIZ;
                    C1760290vuN c1760290vuN3 = this.LIZJ;
                    if (c1760290vuN3 != null) {
                        str = c1760290vuN3.LIZIZ;
                    } else {
                        str = null;
                    }
                    if (C20723089x.LIZ(str5, str)) {
                        Map<String, Object> map2 = c1760290vuN.LIZJ;
                        if (map2 != null) {
                            InterfaceC1541990qEH interfaceC1541990qEH2 = this.LIZLLL;
                            if (interfaceC1541990qEH2 != null) {
                                viewE1 = interfaceC1541990qEH2.e1();
                            } else {
                                viewE1 = null;
                            }
                            if (viewE1 instanceof LynxView) {
                                lynxView = (LynxView) viewE1;
                            } else {
                                lynxView = null;
                            }
                            if (lynxView != null) {
                                lynxView.updateData(map2);
                                unit = Unit.LIZ;
                            }
                        }
                    } else {
                        LJ(C2097908Jt.LIZJ(new Pair("error_msg", "schema change")));
                        unit = Unit.LIZ;
                    }
                } else {
                    this.LIZJ = c1760290vuN;
                    this.LIZLLL = LIZ(context, c1760290vuN, interfaceC1760340vuS);
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return LIZJ();
    }
}
