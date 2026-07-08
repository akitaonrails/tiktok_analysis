package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS5S1201000_20;
import Y.ARunnableS89S0200000_20;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEngine;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.core.LynxEngineProxy;
import com.lynx.tasm.eventreport.LynxEventReporter;
import com.lynx.tasm.performance.PerformanceController;
import j27.s;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1309750kBh implements InterfaceC1299150jub {
    public final /* synthetic */ LynxTemplateRender LIZ;

    @Override // X.InterfaceC1299150jub
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC1299150jub
    public final void LJ() {
        C1310200kCQ c1310200kCQ = this.LIZ.LJIIIIZZ;
        if (c1310200kCQ != null) {
            c1310200kCQ.getClass();
            c1310200kCQ.LIZ = EnumC1309880kBu.SUCCESSFUL;
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIJJ() {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        lynxTemplateRender.nativeClearPipelineTimingInfo(lynxTemplateRender.LJJLIIIJ, lynxTemplateRender.LJJLI);
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIJJLI() {
        InterfaceC1309730kBf interfaceC1309730kBf;
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onTASMFinishedByNative");
            this.LIZ.LJIILIIL.LJJIIJ();
            LynxTemplateRender lynxTemplateRender2 = this.LIZ;
            if (lynxTemplateRender2.LJJLIIIJL) {
                s sVar = lynxTemplateRender2.mLynxContext;
                if (sVar != null && (interfaceC1309730kBf = lynxTemplateRender2.LJJJIL) != null) {
                    C1311720kEs c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ;
                    if (c1311720kEs != null && c1311720kEs.LIZIZ != null) {
                        C1311720kEs c1311720kEs2 = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ;
                        (c1311720kEs2 != null ? c1311720kEs2.LIZIZ : null).getWidth();
                        sVar.getClass();
                        s sVar2 = lynxTemplateRender2.mLynxContext;
                        C1311720kEs c1311720kEs3 = ((LynxUIRenderer) lynxTemplateRender2.LJJJIL).LIZIZ;
                        (c1311720kEs3 != null ? c1311720kEs3.LIZIZ : null).getHeight();
                        sVar2.getClass();
                    }
                }
                if (lynxTemplateRender2.LJJLL != null) {
                    if (lynxTemplateRender2.LJJLJ.decrementAndGet() == 0) {
                        LynxEngine lynxEngine = lynxTemplateRender2.LJJLL;
                        lynxEngine.getClass();
                        lynxEngine.LJFF(EnumC1309960kC2.READY_BE_REUSED);
                        C1299860jvk c1299860jvk = C1299870jvl.LIZ;
                        c1299860jvk.getClass();
                        LinkedList<LynxEngine> linkedListLIZ = c1299860jvk.LIZ(lynxEngine.LIZJ);
                        if (TraceController.isTracingStarted()) {
                            HashMap map = new HashMap();
                            map.put("engineQueue", linkedListLIZ.toString());
                            map.put("registerEngine", String.valueOf(lynxEngine));
                            map.put("templateBundle", String.valueOf(lynxEngine.LIZJ));
                            TraceEvent.LIZJ("LynxEnginePool.registerReuseEngineWrapper", map);
                        }
                        synchronized (c1299860jvk) {
                            try {
                                if (!linkedListLIZ.contains(lynxEngine)) {
                                    linkedListLIZ.offer(lynxEngine);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        new WeakReference(linkedListLIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("registerReuseEngineWrapper EngineQueue Cache: ");
                        sbLIZ.append(linkedListLIZ);
                        sbLIZ.append(", bundle:");
                        sbLIZ.append(lynxEngine.LIZJ);
                        LynxLog.i("LynxEnginePool", C2188811AlT.LIZIZ(sbLIZ));
                        TraceEvent.LJII("LynxEnginePool.registerReuseEngineWrapper");
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Can not call registerLynxEngineReused, because next pipeline is running. mEmbeddedPipelineCounter:");
                        sbLIZ2.append(lynxTemplateRender2.LJJLJ.get());
                        LynxLog.e("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onTASMFinishedByNative");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateRenderCallback.onUpdateDataWithoutChange ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onUpdateDataWithoutChange");
            this.LIZ.LJIILIIL.LJJIIZI();
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onUpdateDataWithoutChange");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TASMCallback.onRuntimeReady ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onRuntimeReady");
            this.LIZ.LJIILIIL.LJJIFFI();
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onRuntimeReady");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TASMCallback.onDataUpdated ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onDataUpdated");
            this.LIZ.LJIILIIL.LJII();
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onDataUpdated");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIILJJIL() {
    }

    public C1309750kBh(LynxTemplateRender lynxTemplateRender) {
        this.LIZ = lynxTemplateRender;
    }

    @Override // X.InterfaceC1299150jub
    public final void LIZJ(TemplateBundle templateBundle) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onTemplateBundleReady");
            this.LIZ.LJIILIIL.LJJIIJZLJL(templateBundle);
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onTemplateBundleReady");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LIZLLL(HashMap<String, Object> map) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onDynamicComponentPerf");
            this.LIZ.LJIILIIL.LJIIIZ(map);
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onDynamicComponentPerf");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJFF(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TASMCallback.onLoaded templateSize:");
        sbLIZ.append(i);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        C1310450kCp c1310450kCp = C1310440kCo.LIZ;
        C1310660kDA c1310660kDA = this.LIZ.LJJII;
        c1310450kCp.getClass();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (LynxUI lynxUI : c1310450kCp.LIZJ.keySet()) {
            if (lynxUI.mContext.LLJILJILJ.LL == c1310660kDA) {
                atomicInteger.incrementAndGet();
                lynxUI.execEnterAnim(new C1310240kCU(atomicInteger));
            }
        }
        atomicInteger.get();
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("dispatchLoadSuccess templateSize in ");
            sbLIZ2.append(lynxTemplateRender.toString());
            LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ2));
            if (lynxTemplateRender.LJIILIIL != null) {
                lynxTemplateRender.LJJJJI("Client.onLoadSuccess");
                lynxTemplateRender.LJIILIIL.LJIILJJIL();
                LynxTemplateRender.LJJJJIZL("Client.onLoadSuccess");
            }
        }
        LynxTemplateRender lynxTemplateRender2 = this.LIZ;
        C1311720kEs c1311720kEs = ((LynxUIRenderer) lynxTemplateRender2.LJJJIL).LIZIZ;
        if (c1311720kEs != null && lynxTemplateRender2.LJJJJI != null) {
            PerformanceController performanceController = lynxTemplateRender2.LJJJJI;
            C1310160kCM c1310160kCM = new C1310160kCM(this, c1311720kEs);
            performanceController.getClass();
            if (LynxEnv.inst().enableFSP()) {
                if (performanceController.LJIIIIZZ == null) {
                    performanceController.LJIIIIZZ = new C1309900kBw(performanceController);
                }
                C1309900kBw c1309900kBw = performanceController.LJIIIIZZ;
                if (c1309900kBw.LIZ.LIZ && !c1309900kBw.LIZIZ.get()) {
                    C1309860kBs c1309860kBs = c1309900kBw.LIZ;
                    if (!c1309860kBs.LJIIJ && c1309860kBs.LIZ) {
                        TraceEvent.LIZLLL("FSPConfig.parse");
                        HashMap<String, String> fSPConfig = LynxEnv.inst().getFSPConfig();
                        c1309860kBs.LIZIZ = C1309860kBs.LIZ(30, "min_content_fill_percentage_x", fSPConfig);
                        c1309860kBs.LIZJ = C1309860kBs.LIZ(30, "min_content_fill_percentage_y", fSPConfig);
                        c1309860kBs.LIZLLL = C1309860kBs.LIZ(30, "min_content_fill_percentage_total_area", fSPConfig);
                        c1309860kBs.LJ = C1309860kBs.LIZ(1, "min_container_fill_percentage_container_area", fSPConfig);
                        c1309860kBs.LJFF = C1309860kBs.LIZ(10, "acceptable_pixel_diff_per_sec", fSPConfig);
                        c1309860kBs.LJI = C1309860kBs.LIZ(100, "acceptable_area_diff_per_sec", fSPConfig);
                        c1309860kBs.LJII = C1309860kBs.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, "min_diff_interval_ms", fSPConfig);
                        c1309860kBs.LJIIIIZZ = C1309860kBs.LIZ(10000, "hard_timeout_ms", fSPConfig);
                        c1309860kBs.LJIIIZ = C1309860kBs.LIZ(17, "snapshotIntervalMs", fSPConfig);
                        c1309860kBs.LJIIJ = true;
                        TraceEvent.LJIIIIZZ("FSPConfig.parse", fSPConfig);
                    }
                    c1309900kBw.LIZIZ.set(true);
                    c1309900kBw.LIZIZ(c1310160kCM);
                    int i2 = c1309900kBw.LIZ.LJIIIIZZ;
                    if (i2 > 0) {
                        LynxEventReporter.delayRunOnReportThread(new ARunnableS120S0100000_20(c1309900kBw, 380), i2);
                    }
                }
            }
        }
        this.LIZ.LJJJJIZL = "update";
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIIIIZZ(C1299170jud c1299170jud) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        C1299170jud c1299170jud2 = lynxTemplateRender.LJJIIJ;
        if (c1299170jud2 == null) {
            lynxTemplateRender.LJJIIJ = c1299170jud;
        } else {
            c1299170jud2.LIZ = c1299170jud.LIZ;
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIIIZ(Map<String, Object> map) {
        int i;
        C1309780kBk c1309780kBk = this.LIZ.LJIILIIL;
        if (c1309780kBk != null) {
            c1309780kBk.LJI(map);
        }
        if (LynxDevtoolGlobalHelper.getInstance().isRemoteDebugAvailable()) {
            s sVar = this.LIZ.mLynxContext;
            if (sVar != null) {
                i = sVar.LLJLILLLLZIIL;
            } else {
                i = -1;
            }
            LynxDevtoolGlobalHelper.getInstance().onPerfMetricsEvent("lynxsdk_jsb_timing", new JSONObject(map), i);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIIJ(boolean z) {
        long j;
        C1311720kEs c1311720kEs;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TASMCallback.onPageChanged isFirstScreen:");
        sbLIZ.append(z);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C1310250kCV c1310250kCV = this.LIZ.LIZ;
            c1310250kCV.getClass();
            LynxLog.i("LynxTemplateRender", "onFirstScreen");
            InterfaceC1309730kBf interfaceC1309730kBf = c1310250kCV.LIZ.LJJJIL;
            if (interfaceC1309730kBf != null && (c1311720kEs = ((LynxUIRenderer) interfaceC1309730kBf).LIZIZ) != null) {
                c1311720kEs.LJIIJ = false;
            }
            try {
                C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1310250kCV, 74));
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        C1310250kCV c1310250kCV2 = this.LIZ.LIZ;
        c1310250kCV2.getClass();
        try {
            LynxLog.i("LynxTemplateRender", "onPageUpdate");
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(c1310250kCV2, 54));
            final LynxTemplateRender lynxTemplateRender = c1310250kCV2.LIZ;
            if (!lynxTemplateRender.LJJIJIIJIL && PerformanceController.LJIIJ()) {
                lynxTemplateRender.LJJIJIIJIL = true;
                if (PerformanceController.LJIIJJI >= 0) {
                    j = PerformanceController.LJIIJJI;
                } else {
                    String memoryAcquisitionDelaySec = LynxEnv.inst().getMemoryAcquisitionDelaySec();
                    j = 2;
                    if (memoryAcquisitionDelaySec != null && !memoryAcquisitionDelaySec.isEmpty()) {
                        try {
                            j = CastLongProtector.parseLong(memoryAcquisitionDelaySec);
                            PerformanceController.LJIIJJI = j;
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                C786410Ut5.LJLIIL(j * 1000, C1289620jfE.LIZ(), new Runnable(lynxTemplateRender) { // from class: X.0kBn
                    public final WeakReference<LynxTemplateRender> LL;

                    public final void LIZ() {
                        InterfaceC1309730kBf interfaceC1309730kBf2;
                        C1311720kEs c1311720kEs2;
                        HashMap map;
                        LynxTemplateRender lynxTemplateRender2 = this.LL.get();
                        if (lynxTemplateRender2 == null) {
                            return;
                        }
                        lynxTemplateRender2.LJJIJIIJIL = false;
                        PerformanceController performanceController = lynxTemplateRender2.LJJJJI;
                        if (performanceController == null || (interfaceC1309730kBf2 = lynxTemplateRender2.LJJJIL) == null || (c1311720kEs2 = ((LynxUIRenderer) interfaceC1309730kBf2).LIZIZ) == null) {
                            return;
                        }
                        if (c1311720kEs2.LJI == null) {
                            map = null;
                        } else {
                            map = new HashMap();
                            Iterator<Map.Entry<Integer, LynxBaseUI>> it2 = c1311720kEs2.LJI.entrySet().iterator();
                            while (it2.hasNext()) {
                                LynxBaseUI value = it2.next().getValue();
                                if (value != null) {
                                    String tagName = value.getTagName();
                                    if (tagName != null) {
                                        long memoryUsageBytes = value.getMemoryUsageBytes();
                                        C1310120kCI c1310120kCI = (C1310120kCI) map.get(tagName);
                                        if (c1310120kCI == null) {
                                            c1310120kCI = new C1310120kCI(tagName);
                                            map.put(tagName, c1310120kCI);
                                        }
                                        c1310120kCI.LIZJ++;
                                        c1310120kCI.LIZIZ += memoryUsageBytes;
                                        Map<String, String> memoryUsageDetail = value.getMemoryUsageDetail();
                                        if (memoryUsageDetail != null) {
                                            if (c1310120kCI.LIZLLL == null) {
                                                c1310120kCI.LIZLLL = new HashMap();
                                            }
                                            c1310120kCI.LIZLLL.putAll(memoryUsageDetail);
                                        }
                                    }
                                } else {
                                    LynxLog.e("LynxUIOwner", "getMemoryUsage failed, the ui is null or not LynxBaseUI");
                                }
                            }
                        }
                        if (performanceController.LJ || map == null) {
                            return;
                        }
                        performanceController.LJIILJJIL(new ARunnableS89S0200000_20(map, performanceController, 206));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LynxTemplateRender$UpdateMemoryUsageTask@2e80.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LynxTemplateRender$UpdateMemoryUsageTask@2e80.run");
                    }

                    {
                        this.LL = new WeakReference<>(lynxTemplateRender);
                    }
                });
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIILL(ReadableMap readableMap) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        InterfaceC1299290jup interfaceC1299290jup = lynxTemplateRender.LJIJJ;
        if (interfaceC1299290jup != null) {
            ((C1299280juo) interfaceC1299290jup).LIZ(lynxTemplateRender.LJJ(), readableMap);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIILLIIL(JavaOnlyMap javaOnlyMap) {
        C1309780kBk c1309780kBk = this.LIZ.LJIILIIL;
        if (c1309780kBk != null) {
            c1309780kBk.LJIIL(javaOnlyMap);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJJ(C1310290kCZ c1310290kCZ) {
        LynxEngine lynxEngine;
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJJLIIIJL && (lynxEngine = lynxTemplateRender.LJJLL) != null) {
            lynxEngine.LJII = c1310290kCZ;
        }
        C1310290kCZ.LIZ(c1310290kCZ, lynxTemplateRender.mLynxContext, lynxTemplateRender.LJJJIL);
    }

    @Override // X.InterfaceC1299150jub
    public final void onErrorOccurred(LynxError lynxError) {
        Object objValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TASMCallback.onErrorOccurred errorCode:");
        if (lynxError != null) {
            objValueOf = Integer.valueOf(lynxError.LIZIZ());
        } else {
            objValueOf = "null";
        }
        sbLIZ.append(objValueOf);
        sbLIZ.append(" ");
        sbLIZ.append(this.LIZ.LJ());
        LynxLog.i("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.onErrorOccurred(lynxError);
    }

    @Override // X.InterfaceC1299150jub
    public final void LIZ(int i, JavaOnlyMap javaOnlyMap) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJJJJZ) {
            if (lynxTemplateRender.LJJJLL != null) {
                C1298840ju6.LIZ.getClass();
                ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(javaOnlyMap);
                LynxEngineProxy lynxEngineProxy = this.LIZ.LJJJLL;
                lynxEngineProxy.getClass();
                C1289620jfE.LIZLLL(new ARunnableS5S1201000_20(lynxEngineProxy, i, "__Card__", byteBufferLIZIZ, 0));
                return;
            }
            return;
        }
        JSProxy jSProxy = lynxTemplateRender.LJJJJZI;
        if (jSProxy == null) {
            return;
        }
        jSProxy.LIZLLL(i, javaOnlyMap);
    }

    @Override // X.InterfaceC1299150jub
    public final String LIZIZ(String str, String str2) {
        InterfaceC1310580kD2 themeResourceProviderProvider = LynxEnv.inst().getThemeResourceProviderProvider();
        if (themeResourceProviderProvider != null) {
            if (str2 != null) {
                try {
                    str2.isEmpty();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("translateResourceForTheme exception ");
                    sbLIZ.append(th.toString());
                    LynxLog.d("LynxTemplateRender", C2188811AlT.LIZIZ(sbLIZ));
                    return null;
                }
            }
            this.LIZ.LJJ();
            return themeResourceProviderProvider.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1299150jub
    public final void LJI(int i, String str, String str2) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        LynxTemplateRender.nativeUpdateI18nResource(lynxTemplateRender.LJJLIIIJ, lynxTemplateRender.LJJLI, str, str2, i);
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIIL(long j, boolean z, long j2) {
        LynxBaseUI lynxBaseUILJIILLIIL;
        s sVar = this.LIZ.mLynxContext;
        if (sVar != null && sVar.LJIILIIL() != null && (lynxBaseUILJIILLIIL = this.LIZ.mLynxContext.LJIILIIL().LJIILLIIL((int) j)) != null) {
            lynxBaseUILJIILLIIL.onEventCapture(z, j2);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIILIIL(long j, boolean z, long j2) {
        LynxBaseUI lynxBaseUILJIILLIIL;
        s sVar = this.LIZ.mLynxContext;
        if (sVar != null && sVar.LJIILIIL() != null && (lynxBaseUILJIILLIIL = this.LIZ.mLynxContext.LJIILIIL().LJIILLIIL((int) j)) != null) {
            lynxBaseUILJIILLIIL.onEventBubble(z, j2);
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIIZILJ(String str, String str2, int i) {
        LynxTemplateRender lynxTemplateRender = this.LIZ;
        if (lynxTemplateRender.LJIILIIL != null) {
            lynxTemplateRender.LJJJJI("Client.onModuleMethodInvoked");
            this.LIZ.LJIILIIL.LJ(str, str2, i);
            this.LIZ.getClass();
            LynxTemplateRender.LJJJJIZL("Client.onModuleMethodInvoked");
        }
    }

    @Override // X.InterfaceC1299150jub
    public final void LJIL(long j, boolean z, long j2) {
        LynxBaseUI lynxBaseUILJIILLIIL;
        s sVar = this.LIZ.mLynxContext;
        if (sVar != null && sVar.LJIILIIL() != null && (lynxBaseUILJIILLIIL = this.LIZ.mLynxContext.LJIILIIL().LJIILLIIL((int) j)) != null) {
            lynxBaseUILJIILLIIL.onEventFire(z, j2);
        }
    }
}
