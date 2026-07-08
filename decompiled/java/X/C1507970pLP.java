package X;

import Y.ARunnableS29S0201000_23;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPageLife;
import com.ss.android.ugc.aweme.ecommerce.loadretreat.EcomLoadRetreatConfigPreload;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceCondition;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECDispatchResourceConditionItem;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadDispatchGlobalConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadTaskConfig;
import com.ss.android.ugc.aweme.ecommerce.preloader.experiment.ECPreloadTaskDedupConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pLP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1507970pLP {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final BlockingQueue<C1507990pLR> LIZ;
    public EcomLoadRetreatConfigPageLife LIZLLL;
    public final C1508190pLl LJI;
    public final ArrayList<InterfaceC1508070pLZ> LJII;
    public final C1508030pLV LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public volatile C0C49 LJIIJJI;
    public volatile C0C49 LJIIL;
    public long LJIILIIL;
    public final ScheduledExecutorService LIZIZ = C807400Vlq.LJ();
    public final ArrayList<C1507980pLQ> LIZJ = new ArrayList<>();
    public final C1508000pLS LJ = new C1508000pLS();
    public final C1508000pLS LJFF = new C1508000pLS();

    public final void LJFF() {
        List<EcomLoadRetreatConfigPreload> list;
        String str;
        if (this.LIZ.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.LIZ.drainTo(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            ECPreloadTaskConfig eCPreloadTaskConfig = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C1507990pLR c1507990pLR = (C1507990pLR) next;
            List<ECPreloadTaskConfig> list2 = C1508080pLa.LIZ().taskConfigList;
            if (list2 != null) {
                Iterator<ECPreloadTaskConfig> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ECPreloadTaskConfig next2 = it3.next();
                    ECPreloadTaskConfig eCPreloadTaskConfig2 = next2;
                    if (c1507990pLR.LIZ(eCPreloadTaskConfig2.taskScene, eCPreloadTaskConfig2.preloadName)) {
                        eCPreloadTaskConfig = next2;
                        break;
                    }
                }
                ECPreloadTaskConfig eCPreloadTaskConfig3 = eCPreloadTaskConfig;
                if (eCPreloadTaskConfig3 != null) {
                    if (eCPreloadTaskConfig3.enable) {
                        c1507990pLR.LIZLLL = eCPreloadTaskConfig3.priority;
                    }
                }
            }
            arrayList2.add(next);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList<C1507980pLQ> arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new C1507980pLQ((C1507990pLR) it4.next()));
        }
        for (C1507980pLQ c1507980pLQ : arrayList3) {
            C1507990pLR c1507990pLR2 = c1507980pLQ.LIZ;
            if (((ECPreloadTaskDedupConfig) C1508100pLc.LIZIZ.getValue()).enableTaskDedup && (str = c1507990pLR2.LJIIL) != null && str.length() > 0) {
                String str2 = c1507990pLR2.LIZJ;
                String str3 = c1507990pLR2.LJIIIZ;
                C1508000pLS c1508000pLS = this.LJ;
                if (!(c1508000pLS instanceof Collection) || !c1508000pLS.isEmpty()) {
                    Iterator<C1507980pLQ> it5 = c1508000pLS.iterator();
                    while (it5.hasNext()) {
                        if (LJII(it5.next(), str2, str, str3)) {
                            break;
                        }
                    }
                }
                C1508000pLS c1508000pLS2 = this.LJFF;
                if (!(c1508000pLS2 instanceof Collection) || !c1508000pLS2.isEmpty()) {
                    Iterator<C1507980pLQ> it6 = c1508000pLS2.iterator();
                    while (it6.hasNext()) {
                        if (LJII(it6.next(), str2, str, str3)) {
                            break;
                        }
                    }
                }
                ArrayList<C1507980pLQ> arrayList4 = this.LIZJ;
                if (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty()) {
                    Iterator<C1507980pLQ> it7 = arrayList4.iterator();
                    while (it7.hasNext()) {
                        if (LJII(it7.next(), str2, str, str3)) {
                            break;
                        }
                    }
                }
            }
            if (C1507840pLC.LIZJ()) {
                EcomLoadRetreatConfigPageLife ecomLoadRetreatConfigPageLife = this.LIZLLL;
                if (ecomLoadRetreatConfigPageLife != null && (list = ecomLoadRetreatConfigPageLife.preload) != null) {
                    Iterator<EcomLoadRetreatConfigPreload> it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        EcomLoadRetreatConfigPreload next3 = it8.next();
                        EcomLoadRetreatConfigPreload ecomLoadRetreatConfigPreload = next3;
                        if (c1507980pLQ.LIZ.LIZ(ecomLoadRetreatConfigPreload.scene, ecomLoadRetreatConfigPreload.preloadName)) {
                            if (next3 != null) {
                                this.LJ.add(c1507980pLQ);
                            }
                        }
                    }
                }
                this.LJFF.add(c1507980pLQ);
            } else {
                this.LJFF.add(c1507980pLQ);
            }
        }
    }

    public final C1508000pLS LJI() {
        return this.LIZLLL != null ? this.LJ : this.LJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03e7  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r7v2, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1507970pLP.LJIIIZ():void");
    }

    public final void LJ() {
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        try {
            LJIIIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                if (!Intrinsics.LJFF(((IApplicationDependencyService) iECommerceHostService2).getChannel(), "local_test")) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR87, th, null);
                    return;
                }
            }
            throw th;
        }
    }

    public final boolean LJIIIIZZ() {
        return LJI().isEmpty() && this.LIZJ.isEmpty() && this.LIZ.isEmpty();
    }

    public C1507970pLP(BlockingQueue<C1507990pLR> blockingQueue) {
        this.LIZ = blockingQueue;
        C1508190pLl c1508190pLl = new C1508190pLl();
        this.LJI = c1508190pLl;
        this.LJII = C1697810uHb.LJ(new InterfaceC1508070pLZ() { // from class: X.0pLU
            public final int LIZ = ((Number) C1BCA.LJI().LJIIIIZZ.getValue()).intValue();

            @Override // X.InterfaceC1508070pLZ
            public final String LIZJ() {
                return "cpu";
            }

            @Override // X.InterfaceC1508070pLZ
            public final Pair<Boolean, Float> LIZ() {
                ECDispatchResourceCondition eCDispatchResourceCondition;
                ECDispatchResourceConditionItem eCDispatchResourceConditionItem;
                C1512840pTG c1512840pTG = C1506030pIH.LIZ;
                float f = c1512840pTG != null ? (float) c1512840pTG.LIZJ : 0.0f;
                int i = this.LIZ;
                if (i < 1) {
                    i = 1;
                }
                float f2 = f / i;
                ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
                return new Pair<>(Boolean.valueOf(f2 < ((eCPreloadDispatchGlobalConfig == null || (eCDispatchResourceCondition = eCPreloadDispatchGlobalConfig.dispatchResourceCondition) == null || (eCDispatchResourceConditionItem = eCDispatchResourceCondition.cpu) == null) ? 1.0f : eCDispatchResourceConditionItem.below)), Float.valueOf(f2));
            }
        }, new InterfaceC1508070pLZ() { // from class: X.0pLT
            @Override // X.InterfaceC1508070pLZ
            public final String LIZJ() {
                return "memory";
            }

            @Override // X.InterfaceC1508070pLZ
            public final Pair<Boolean, Float> LIZ() {
                ECDispatchResourceCondition eCDispatchResourceCondition;
                ECDispatchResourceConditionItem eCDispatchResourceConditionItem;
                C1512820pTE c1512820pTE = C1506030pIH.LIZIZ;
                long j = c1512820pTE != null ? c1512820pTE.LIZIZ : 0L;
                long j2 = c1512820pTE != null ? c1512820pTE.LIZJ : 1L;
                ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
                float f = 1.0f - (j / (j + j2 >= 1 ? r6 : 1L));
                return new Pair<>(Boolean.valueOf(f < ((eCPreloadDispatchGlobalConfig == null || (eCDispatchResourceCondition = eCPreloadDispatchGlobalConfig.dispatchResourceCondition) == null || (eCDispatchResourceConditionItem = eCDispatchResourceCondition.memory) == null) ? 1.0f : eCDispatchResourceConditionItem.below)), Float.valueOf(f));
            }
        }, new InterfaceC1508070pLZ() { // from class: X.0pLW
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC1508070pLZ
            public final String LIZJ() {
                return "net";
            }

            @Override // X.InterfaceC1508070pLZ
            public final Pair<Boolean, Integer> LIZ() {
                ECDispatchResourceCondition eCDispatchResourceCondition;
                ECPreloadDispatchGlobalConfig eCPreloadDispatchGlobalConfig = C1508080pLa.LIZ().preloadConfig;
                return C1507870pLF.LIZ((eCPreloadDispatchGlobalConfig == null || (eCDispatchResourceCondition = eCPreloadDispatchGlobalConfig.dispatchResourceCondition) == null) ? null : eCDispatchResourceCondition.f356net);
            }
        }, new C1508160pLi(), c1508190pLl);
        this.LJIIIIZZ = new C1508030pLV();
        this.LJIILIIL = -1L;
    }

    public final void LIZIZ(ArrayList<C1507980pLQ> arrayList) {
        for (final C1507980pLQ c1507980pLQ : arrayList) {
            this.LIZJ.add(c1507980pLQ);
            InterfaceC1508140pLg interfaceC1508140pLg = new InterfaceC1508140pLg() { // from class: X.0pLM
                @Override // X.InterfaceC1508140pLg
                public final void onStateChange(int i) {
                    C1507970pLP c1507970pLP = this.LIZ;
                    c1507970pLP.LIZIZ.submit(new ARunnableS29S0201000_23(i, c1507970pLP, c1507980pLQ, 6));
                }
            };
            synchronized (c1507980pLQ) {
                c1507980pLQ.LJ.add(interfaceC1508140pLg);
            }
            Integer num = c1507980pLQ.LIZ.LJII;
            if (num != null) {
                if (num.intValue() == 1) {
                    C817503Hh c817503Hh = C817503Hh.LL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C1408010mkB(c1507980pLQ, null), 2);
                } else if (num.intValue() == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c1507980pLQ.LIZJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ECPreloadTask_trace, realSchedule(), time4444=");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
    }

    public static final void LIZJ(String str, C1508000pLS c1508000pLS) {
        ArrayList<C1507980pLQ> arrayList = new ArrayList();
        for (Object obj : c1508000pLS) {
            if (Intrinsics.LJFF(((C1507980pLQ) obj).LIZ.LJIILIIL, str)) {
                arrayList.add(obj);
            }
        }
        for (C1507980pLQ c1507980pLQ : arrayList) {
            C1507980pLQ.LIZ(c1507980pLQ);
            c1508000pLS.remove((Object) c1507980pLQ);
        }
    }

    public final synchronized void LIZ(String str, boolean z) {
        Boolean boolValueOf;
        C0C49 c0c49;
        C0C49 c0c492;
        C0C49 c0c493;
        C0C49 c0c494;
        C0C49 c0c495;
        C0C49 c0c496;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchxxx addDispatchTask from=");
        sbLIZ.append(str);
        sbLIZ.append(", taskQueueSize=");
        sbLIZ.append(LJI().size());
        sbLIZ.append(" && executingTaskSize=");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(" && taskQueueProviderSize=");
        sbLIZ.append(this.LIZ.size());
        sbLIZ.append(" cur running=");
        C0C49 c0c497 = this.LJIIJJI;
        Boolean boolValueOf2 = null;
        if (c0c497 != null) {
            boolValueOf = Boolean.valueOf(c0c497.LLILLL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", pre running=");
        C0C49 c0c498 = this.LJIIL;
        if (c0c498 != null) {
            boolValueOf2 = Boolean.valueOf(c0c498.LLILLL);
        }
        sbLIZ.append(boolValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LJIIIIZZ()) {
            if (z) {
                C0C49 c0c499 = this.LJIIJJI;
                if ((c0c499 == null || !c0c499.LL || (c0c496 = this.LJIIJJI) == null || c0c496.LLILLL) && ((c0c494 = this.LJIIL) == null || !c0c494.LL || (c0c495 = this.LJIIL) == null || c0c495.LLILLL)) {
                    this.LJIIL = this.LJIIJJI;
                    C0C49 c0c4910 = new C0C49(new AwS567S0100000_23(this, 185), true);
                    this.LJIIJJI = c0c4910;
                    this.LIZIZ.schedule(c0c4910, 1000L, TimeUnit.MILLISECONDS);
                }
            } else {
                C0C49 c0c4911 = this.LJIIJJI;
                if ((c0c4911 == null || c0c4911.LL || (c0c493 = this.LJIIJJI) == null || c0c493.LLILLL) && ((c0c49 = this.LJIIL) == null || c0c49.LL || (c0c492 = this.LJIIL) == null || c0c492.LLILLL)) {
                    this.LJIIL = this.LJIIJJI;
                    C0C49 c0c4912 = new C0C49(new AwS567S0100000_23(this, 186), false);
                    this.LJIIJJI = c0c4912;
                    this.LIZIZ.submit(c0c4912);
                }
            }
        }
    }

    public final List<C1507980pLQ> LIZLLL(ArrayList<C1507980pLQ> arrayList, Function1<? super C1507980pLQ, Boolean> function1) {
        if (arrayList.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList<C1507980pLQ> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (function1.invoke(obj).booleanValue()) {
                arrayList3.add(obj);
            }
        }
        for (C1507980pLQ c1507980pLQ : arrayList3) {
            C1507980pLQ.LIZ(c1507980pLQ);
            if (!Intrinsics.LJFF(arrayList, this.LIZJ)) {
                arrayList.remove(c1507980pLQ);
            }
        }
        return arrayList3;
    }

    public static boolean LJII(C1507980pLQ c1507980pLQ, String str, String str2, String str3) {
        if (Intrinsics.LJFF(c1507980pLQ.LIZ.LIZJ, str) && Intrinsics.LJFF(c1507980pLQ.LIZIZ, str2) && Intrinsics.LJFF(c1507980pLQ.LIZ.LJIIIZ, str3)) {
            return true;
        }
        return false;
    }
}
