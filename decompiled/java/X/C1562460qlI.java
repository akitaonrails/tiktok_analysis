package X;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.legoImp.task.assem.ReporterExecutor;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1562460qlI extends AbstractC1562510qlN {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1554580qYa());
    public final boolean LIZJ = ((Boolean) C1562780qlo.LIZJ.getValue()).booleanValue();
    public final boolean LIZLLL = C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "assem_fix_lazy_lifecycle_merge", true, false);
    public final C01GW LJ = C452501pT.LIZIZ(new C1156304fh());

    public static final List<Class<? extends InterfaceC494301wD>> LJIILL() {
        return C1697810uHb.LJIIJJI(IPerformanceAbility.class, NewUserGuideAbility.class);
    }

    public static final boolean LIZJ() {
        return ((Boolean) C282520B5m.LIZ.getValue()).booleanValue();
    }

    public static final InterfaceC738110SxN LIZLLL() {
        if (!((Boolean) C07GS.LIZ.getValue()).booleanValue()) {
            return new InterfaceC738110SxN() { // from class: X.1Bpc
                @Override // X.InterfaceC738110SxN
                public final AbstractC2216811BpX LIZ(InterfaceC1731706qJ interfaceC1731706qJ) {
                    int i = C054I.LIZ[((EnumC12934054i) C1221804qG.LIZJ.getValue()).ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (((Boolean) C2219251BtT.LIZ.getValue()).booleanValue()) {
                                return new C2216841Bpa<T>(interfaceC1731706qJ) { // from class: X.1Bpb
                                    public int LLIZ = -1;

                                    @Override // X.AbstractC2216811BpX
                                    public final boolean LIZIZ() {
                                        return ((Boolean) C2219251BtT.LIZ.getValue()).booleanValue();
                                    }

                                    @Override // X.C2216841Bpa, X.AbstractC2216811BpX
                                    public final void LIZ() {
                                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                                            super.LIZ();
                                            return;
                                        }
                                        Executor executorLIZ = C725080ScM.LIZ();
                                        if (executorLIZ instanceof C1505540pHU) {
                                            int i2 = this.LLIZ;
                                            if (i2 == -1 || i2 != ((C1505540pHU) executorLIZ).LL) {
                                                this.LLILLJJLI = null;
                                            }
                                            this.LLIZ = ((C1505540pHU) executorLIZ).LL;
                                        }
                                    }
                                };
                            }
                            return null;
                        }
                        return new AbstractC2216811BpX<T>(interfaceC1731706qJ) { // from class: X.1BpZ
                            public long LLILZLL = -1;

                            @Override // X.AbstractC2216811BpX
                            public final void LIZ() {
                                long j = this.LLILZLL;
                                if (j == -1 || j != AbstractC2216811BpX.LLILZ) {
                                    this.LLILLJJLI = null;
                                }
                                this.LLILZLL = AbstractC2216811BpX.LLILZ;
                            }
                        };
                    }
                    return new C2216841Bpa(interfaceC1731706qJ);
                }
            };
        }
        return null;
    }

    public static final boolean LJFF() {
        return ((Boolean) C0AMP.LIZ.getValue()).booleanValue();
    }

    public static final List<Class<? extends InterfaceC494301wD>> LJI() {
        return C1697810uHb.LJIIJJI(HomeTabAbility.class, MainBusinessAbility.class, IPerformanceAbility.class, HomePageViewPagerAbility.class, MainDialogAbility.class, BackRefreshStrategyAbility.class, MainPageBusinessAbility.class, BottomTabAbility.class, MainFragmentBusinessAbility.class, HomeViewPagerAbility.class, IMFFeedAbility.class);
    }

    public static final Executor LJIIIIZZ() {
        return (Executor) C1505600pHa.LIZIZ.getValue();
    }

    public static final boolean LJIIIZ() {
        return ((Boolean) C0B7F.LIZ.getValue()).booleanValue();
    }

    public static final boolean LJIIJ() {
        return ((Boolean) C282540B5o.LIZ.getValue()).booleanValue();
    }

    public static final boolean LJIIJJI() {
        return ((Boolean) C0B6L.LIZ.getValue()).booleanValue();
    }

    public static final C11HC LJIILJJIL() {
        return (C11HC) C311420CIq.LJFF.getValue();
    }

    public static final boolean LJIILLIIL() {
        return ((Boolean) C282580B5s.LIZ.getValue()).booleanValue();
    }

    public static final Executor LJIJ() {
        return ReporterExecutor.LLILZIL.getValue();
    }

    public static final InterfaceC1554870qZ3 LJIJI() {
        if (((Boolean) C1240804tK.LIZIZ.getValue()).booleanValue()) {
            return new C1564000qnm();
        }
        return null;
    }

    public static final InterfaceC1557560qdO LJIJJ() {
        if (C302900Bu4.LIZ) {
            return new InterfaceC1557560qdO() { // from class: X.0qlf
                @Override // X.InterfaceC1557560qdO
                public final void LIZ(int i, String str, String str2) {
                    C2344809Gs.LIZLLL(i, str, str2);
                }
            };
        }
        return null;
    }

    public static final void LJIJJLI() {
        ((ExecutorService) C1505600pHa.LIZIZ.getValue()).execute(new Runnable() { // from class: X.0pHc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AssemInitTask$AssemExecutor@64a2.setPriority$1");
                try {
                    try {
                        int iMyTid = Process.myTid();
                        C01GW c01gw = C1505600pHa.LIZ;
                        Process.setThreadPriority(iMyTid, ((Number) c01gw.getValue()).intValue());
                        C2187801Ajq.LIZ.put("assem-serial-t", new C1505630pHd(iMyTid, ((Number) c01gw.getValue()).intValue()));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AssemInitTask$AssemExecutor@64a2.setPriority$1");
            }
        });
    }

    public static final void LJIL() {
        C1562470qlJ.LIZ.getClass();
        C725220Sca c725220Sca = C725220Sca.LIZ;
        C725430Scv.LJ(c725220Sca, C1562530qlP.LIZ().subscribeAssembleEvent, new C724980ScC());
        C738570Sy7 c738570Sy7 = C738570Sy7.LIZ;
        C725430Scv.LJ(c738570Sy7, C1562530qlP.LIZ().subscribeAssemLifecycleEvent, new C738590Sy9());
        C725210ScZ c725210ScZ = C725210ScZ.LIZ;
        C725430Scv.LJ(c725210ScZ, C1562530qlP.LIZ().subscribeAssemDslEvent, new C724970ScB());
        C725430Scv.LJ(C1561850qkJ.LIZ, C1562530qlP.LIZ().subscribeGetAbilityEvent, new C1561800qkE());
        C725430Scv.LJ(C1561840qkI.LIZ, C1562530qlP.LIZ().subscribeBindAbilityEvent, new C1561810qkF());
        C725410Sct c725410Sct = C725410Sct.LIZ;
        C725430Scv.LJ(c725410Sct, C1562530qlP.LIZ().subscribeAssemCreateEvent, new C1562340ql6());
        C737880Sx0 c737880Sx0 = C737880Sx0.LIZ;
        C725430Scv.LJ(c737880Sx0, C1562530qlP.LIZ().viewModelCreateEvent, new C737870Swz());
        C736780SvE c736780SvE = C736780SvE.LIZ;
        C725430Scv.LJ(c736780SvE, C1562530qlP.LIZ().viewModelSubscribePerformanceEvent, new C736770SvD());
        C1561880qkM c1561880qkM = C1561880qkM.LIZ;
        C725430Scv.LJ(c1561880qkM, C1562530qlP.LIZ().hierarchyDataPerformanceRate, new C1561940qkS());
        C725430Scv.LJ(C725230Scb.LIZ, C1562530qlP.LIZ().assemAssembleContainerInitEventRate, new C1561930qkR());
        C725310Scj c725310Scj = C725310Scj.LIZ;
        C725430Scv.LJ(c725310Scj, C1562530qlP.LIZ().bindProxyEventRate, new C725560Sd8());
        C725430Scv.LJ(C725350Scn.LIZ, C1562530qlP.LIZ().onHostBindEventRate, new C725380Scq());
        C725430Scv.LJ(C725250Scd.LIZ, C1562530qlP.LIZ().assemInitEventRate, new C1561950qkT());
        C725430Scv.LJ(C725260Sce.LIZ, C1562530qlP.LIZ().assemInitializeHostEvent, new C1561960qkU());
        C1561870qkL c1561870qkL = C1561870qkL.LIZ;
        C725430Scv.LJ(c1561870qkL, C1562530qlP.LIZ().vScopePerformanceEvent, new C1561820qkG());
        C1561910qkP c1561910qkP = C1561910qkP.LIZ;
        C725430Scv.LJ(c1561910qkP, C1562530qlP.LIZ().providerBindEvent, new C1562330ql5());
        C1561900qkO c1561900qkO = C1561900qkO.LIZ;
        C725430Scv.LJ(c1561900qkO, C1562530qlP.LIZ().providerProvideEvent, new C1562320ql4());
        C725430Scv.LJ(new AbstractC725500Sd2<C216800sY>() { // from class: X.0qkw
            @Override // X.AbstractC725500Sd2
            public final String LIZ() {
                return "AssemAsVScopeDebugTrackEvent";
            }
        }, 1.0f, new C1562250qkx());
        final C1562500qlM c1562500qlM = new C1562500qlM();
        C0CP3 c0cp3 = new C0CP3() { // from class: X.0VbX
            @Override // X.C0CP3
            public final void LIZ() {
                Executor executor = C725450Scx.LIZIZ;
                if (executor != null) {
                    final C1562500qlM c1562500qlM2 = c1562500qlM;
                    executor.execute(new Runnable() { // from class: X.0VbW
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AssemTrackSubscriber@2a39.addReportTask$1$callback$1");
                            try {
                                C800970VbT.LIZIZ.LJIIJJI();
                                c1562500qlM2.LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AssemTrackSubscriber@2a39.addReportTask$1$callback$1");
                        }
                    });
                }
            }
        };
        if (C0CP9.LIZ == C0CP8.COLD_BOOT_BEGIN) {
            C0CP9.LIZIZ.add(c0cp3);
        }
        C0CM3 c0cm3 = new C0CM3();
        c0cm3.LIZIZ = true;
        c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
        c0cm3.LJI = new C801020VbY(c1562500qlM);
        C312240CLu.LIZ(c0cm3);
        C1562470qlJ.LIZJ(c1561900qkO, null, new C1562680qle());
        C1562470qlJ.LIZJ(c1561870qkL, null, new C1562610qlX());
        C1562470qlJ.LIZJ(c1561910qkP, null, new C1562620qlY());
        C1562470qlJ.LIZJ(c725310Scj, null, new C738600SyA());
        C1562470qlJ.LIZJ(c1561880qkM, null, new C1562630qlZ());
        C1562470qlJ.LIZJ(c736780SvE, null, new C1562640qla());
        C1562470qlJ.LIZJ(c737880Sx0, null, new C1562650qlb());
        C1562470qlJ.LIZJ(c725410Sct, null, new C1562660qlc());
        C1562470qlJ.LIZJ(c725210ScZ, null, new C738610SyB());
        C1562470qlJ.LIZJ(c725220Sca, null, new C1562670qld());
        if (C1562470qlJ.LIZJ(c738570Sy7, Float.valueOf(C1562530qlP.LIZ().coldStartTrackRate), new C738540Sy4())) {
            AbstractC738140SxQ.Companion.getClass();
            AbstractC738140SxQ.forceTrack = true;
        }
        C725430Scv.LJ(C1561860qkK.LIZ, C1562530qlP.LIZ().vScopePerformanceEvent, new C1561830qkH());
        C725430Scv.LJ(C1561890qkN.LIZ, C1562530qlP.LIZ().subscribeBindAbilityEvent, new C1561920qkQ());
        C725430Scv.LJ(C725270Scf.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C1562570qlT());
        C725430Scv.LJ(C725200ScY.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C725190ScX());
        C725430Scv.LJ(C725280Scg.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C1562580qlU());
        C725430Scv.LJ(C725290Sch.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C1562590qlV());
        C725430Scv.LJ(C725300Sci.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C725390Scr());
        C725430Scv.LJ(C725240Scc.LIZ, C1562530qlP.LIZ().bindProxyEventRate, new C1562600qlW());
        if (C725430Scv.LJ(c725220Sca, C1562530qlP.LIZ().bindProxyEventRate, new C1562430qlF()) || C725430Scv.LJ(c1561870qkL, C1562530qlP.LIZ().bindProxyEventRate, new C1562410qlD()) || C725430Scv.LJ(c1561910qkP, C1562530qlP.LIZ().bindProxyEventRate, new C1562420qlE()) || C725430Scv.LJ(c1561910qkP, C1562530qlP.LIZ().bindProxyEventRate, new C1562400qlC()) || C725430Scv.LJ(c736780SvE, C1562530qlP.LIZ().bindProxyEventRate, new C1562450qlH()) || C725430Scv.LJ(c737880Sx0, C1562530qlP.LIZ().bindProxyEventRate, new C1562440qlG())) {
            C725430Scv.LIZIZ.add(new InterfaceC725440Scw() { // from class: X.0qlA
                @Override // X.InterfaceC725440Scw
                public void onEventBegin(AbstractC725500Sd2<?> abstractC725500Sd2) {
                    Executor executor;
                    if (Intrinsics.LJFF(abstractC725500Sd2, C725240Scc.LIZ) && (executor = C725450Scx.LIZIZ) != null) {
                        executor.execute(new Runnable() { // from class: X.0qlB
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("DropXCountMetricsReporter@ce45.registerOnReusedBindEventListener$1$onEventBegin$1");
                                try {
                                    C1562360ql8.LIZ = true;
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DropXCountMetricsReporter@ce45.registerOnReusedBindEventListener$1$onEventBegin$1");
                            }
                        });
                    }
                }

                @Override // X.InterfaceC725440Scw
                public void onEventEnd(AbstractC725500Sd2<?> abstractC725500Sd2) {
                    Executor executor;
                    if (Intrinsics.LJFF(abstractC725500Sd2, C725240Scc.LIZ) && (executor = C725450Scx.LIZIZ) != null) {
                        executor.execute(new Runnable() { // from class: X.0ql9
                            public static void LIZ() {
                                C1562360ql8.LIZ = false;
                                C1562360ql8.LIZIZ(C1562360ql8.LIZIZ, "drop_x_count_assemble_total_duration");
                                C1562360ql8.LIZIZ = 0L;
                                C1562360ql8.LIZIZ(C1562360ql8.LIZJ, "drop_x_count_create_vscope_instance_total_duration");
                                C1562360ql8.LIZJ = 0L;
                                C1562360ql8.LIZIZ(C1562360ql8.LJ, "drop_x_count_vprovider_bind_total_duration");
                                C1562360ql8.LJ = 0L;
                                C1562360ql8.LIZIZ(C1562360ql8.LIZLLL, "drop_x_count_vprovider_provide_total_duration");
                                C1562360ql8.LIZLLL = 0L;
                                C1562360ql8.LIZIZ(C1562360ql8.LJFF, "drop_x_count_vm_select_subscribe_vm_total_duration");
                                C1562360ql8.LJFF = 0L;
                                C1562360ql8.LIZIZ(C1562360ql8.LJI, "drop_x_count_vm_create_instance_total_duration");
                                C1562360ql8.LJI = 0L;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("DropXCountMetricsReporter@ce45.registerOnReusedBindEventListener$1$onEventEnd$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DropXCountMetricsReporter@ce45.registerOnReusedBindEventListener$1$onEventEnd$1");
                            }
                        });
                    }
                }
            });
        }
        C725430Scv.LJ(C725470Scz.LIZ, C1562530qlP.LIZ().assemPreloadSuccessRate, AFwS243S0000000_11.get$arr$(657));
    }

    @Override // X.AbstractC1562510qlN
    public final void LIZ() {
        C1562470qlJ.LIZ.getClass();
        C725360Sco.LIZ.getClass();
        if (((Boolean) C1562780qlo.LIZIZ.getValue()).booleanValue()) {
            C725430Scv.LJ(C725220Sca.LIZ, 1.0f, C725360Sco.LIZIZ);
            C725430Scv.LJ(C738570Sy7.LIZ, 1.0f, C725360Sco.LIZJ);
            if (C1562780qlo.LIZJ()) {
                C725430Scv.LJ(C725320Sck.LIZ, 1.0f, C725360Sco.LIZLLL);
                C725430Scv.LJ(C725300Sci.LIZ, 1.0f, C725360Sco.LJ);
            }
            C0CN5.LIZIZ(15000L, new Runnable() { // from class: X.0Scp
                public static void LIZ() {
                    C725360Sco.LIZ.getClass();
                    if (((Boolean) C1562780qlo.LIZIZ.getValue()).booleanValue()) {
                        C725430Scv.LJI(C725220Sca.LIZ, C725360Sco.LIZIZ);
                        C725430Scv.LJI(C738570Sy7.LIZ, C725360Sco.LIZJ);
                        if (C1562780qlo.LIZJ()) {
                            C725430Scv.LJI(C725320Sck.LIZ, C725360Sco.LIZLLL);
                            C725430Scv.LJI(C725300Sci.LIZ, C725360Sco.LJ);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FirstFeedPerformanceReporter@cdd8.subscribeFirstFeedPerformanceEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FirstFeedPerformanceReporter@cdd8.subscribeFirstFeedPerformanceEvent$1");
                }
            });
        }
    }

    public final InterfaceC738300Sxg LIZIZ() {
        return (InterfaceC738300Sxg) this.LIZIZ.getValue();
    }

    public final List<C13IQ<? extends ReusedAssem<?>>> LJ() {
        return (List) this.LJ.getValue();
    }

    public static final boolean LJII() {
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "enable_assem_skip_empty_method", true, false);
    }

    public static final boolean LJIIL() {
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "flatten_assem_lifecycle", true, false);
    }

    public static final boolean LJIILIIL() {
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "assem_inline_reporter", true, false);
    }

    public static final InterfaceC724700Sbk LJIIZILJ() {
        if (C1562780qlo.LIZIZ()) {
            return null;
        }
        return new InterfaceC724700Sbk() { // from class: X.0N9Y
            public long LIZ;

            @Override // X.InterfaceC724700Sbk
            public final void LIZ() {
                if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()) && C08TN.LIZ().LJIILIIL()) {
                    C799900VZk.LIZ.getClass();
                    if (C0CP9.LIZ()) {
                        return;
                    }
                    this.LIZ = SystemClock.uptimeMillis();
                }
            }

            @Override // X.InterfaceC724700Sbk
            public final void end(String str, String str2) {
                if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()) && C08TN.LIZ().LJIILIIL()) {
                    C799900VZk.LIZ.getClass();
                    if (!C0CP9.LIZ()) {
                        long jUptimeMillis = SystemClock.uptimeMillis() - this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        C202098145w c202098145wLIZ = C08TN.LIZ();
                        if (!((ConcurrentHashMap) c202098145wLIZ.LJIIJ).containsKey(strLIZIZ)) {
                            ((ConcurrentHashMap) c202098145wLIZ.LJIIJ).put(strLIZIZ, Long.valueOf(jUptimeMillis));
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(" cost:");
                        sbLIZ2.append(jUptimeMillis);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
            }
        };
    }
}
