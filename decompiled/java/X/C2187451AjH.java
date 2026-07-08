package X;

import Y.ARunnableS100S0000000_26;
import Y.ARunnableS104S0000000_31;
import Y.ARunnableS106S0000000_33;
import Y.ARunnableS10S0001000_33;
import Y.ARunnableS44S0101000_33;
import Y.ARunnableS83S0000000_3;
import Y.ARunnableS88S0000000_9;
import Y.ARunnableS89S0000000_10;
import Y.ARunnableS92S0000000_13;
import Y.AfS146S0000000_33;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.view.LayoutInflater;
import com.bytedance.applog.util.BlockHelper;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.BlackDenseRegionThresholdOpt;
import com.bytedance.common.jato.boost.PrePageFaultOpt3;
import com.bytedance.common.jato.boost.PrePageFaultOpt4;
import com.bytedance.common.jato.boost.RSpaceLiveRatioOpt;
import com.bytedance.common.jato.boost.SoftReferenceLruOpt;
import com.bytedance.common.jato.boost.sched.ThreadAttrFixer;
import com.bytedance.common.jato.gfx.DoFrameController;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.memory.StringCacheOpt;
import com.bytedance.common.jato.util.DeviceInfoUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.BlackDenseRegionThresholdConfig;
import com.ss.android.ugc.aweme.experiment.JitCompilerConfig;
import com.ss.android.ugc.aweme.experiment.LaunchDexReclaimPara;
import com.ss.android.ugc.aweme.experiment.MemLeakAutoFixConfig;
import com.ss.android.ugc.aweme.experiment.PrePageFaultConfig;
import com.ss.android.ugc.aweme.experiment.RegionSpaceLiveRatioOptConfig;
import com.ss.android.ugc.aweme.experiment.SoftReferenceLruConfig;
import com.ss.android.ugc.aweme.experiment.StringCacheConfig;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187451AjH {
    public static int LIZ = 0;
    public static int LIZIZ = 0;
    public static int LIZJ = 0;
    public static int LIZLLL = 0;
    public static boolean LJ = false;
    public static int LJFF = -1;
    public static long LJI = 0;
    public static int LJII = 0;
    public static int LJIIIIZZ = 0;
    public static String LJIIIZ = "";
    public static final LinkedList<String> LJIIJ = new LinkedList<>();
    public static boolean LJIIJJI = false;
    public static final List<InterfaceC2184631Aej> LJIIL = new CopyOnWriteArrayList();
    public static int LJIILIIL = -1;
    public static final Object LJIILJJIL = new Object();
    public static boolean LJIILL = false;
    public static int LJIILLIIL = -1;
    public static int LJIIZILJ = 0;
    public static final Object LJIJ = new Object();
    public static boolean LJIJI = false;

    public static void LJIIIIZZ() {
        JitBlock.LIZIZ = true;
        JitBlock.LIZIZ(true);
        int i = C0AFZ.LIZ;
        if (i != -1) {
            JitBlock.LIZLLL(i);
        }
        C01GW c01gw = C258970ACx.LIZ;
        if (((Number) c01gw.getValue()).longValue() != -1) {
            JitBlock.LIZJ(((Number) c01gw.getValue()).longValue());
        }
    }

    public static void LIZ() {
        BlackDenseRegionThresholdConfig blackDenseRegionThresholdConfig = (BlackDenseRegionThresholdConfig) C2187531AjP.LIZ.getValue();
        if (blackDenseRegionThresholdConfig != null && DeviceInfoUtils.LIZ() >= 35) {
            if (!blackDenseRegionThresholdConfig.dynamicAdjust) {
                BlackDenseRegionThresholdOpt.LIZIZ(blackDenseRegionThresholdConfig.threshold);
                return;
            }
            Map<Float, Integer> map = blackDenseRegionThresholdConfig.thresholdMap;
            if (map == null || map.isEmpty()) {
                return;
            }
            Map<Float, Integer> map2 = blackDenseRegionThresholdConfig.thresholdMap;
            long j = blackDenseRegionThresholdConfig.minInterval;
            if (C821410WKd.LJFF.compareAndSet(false, true)) {
                C821410WKd c821410WKd = new C821410WKd(map2, j);
                C20125113on.LIZIZ().getClass();
                C20125113on.LIZ(c821410WKd);
            }
        }
    }

    public static void LIZIZ() {
        RegionSpaceLiveRatioOptConfig regionSpaceLiveRatioOptConfig;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 34 || (regionSpaceLiveRatioOptConfig = (RegionSpaceLiveRatioOptConfig) C2187521AjO.LIZ.getValue()) == null) {
            return;
        }
        if (!regionSpaceLiveRatioOptConfig.dynamicAdjust) {
            RSpaceLiveRatioOpt.LIZ(regionSpaceLiveRatioOptConfig.ratio);
            return;
        }
        Map<Float, Integer> map = regionSpaceLiveRatioOptConfig.ratioMap;
        if (map == null || map.isEmpty()) {
            return;
        }
        Map<Float, Integer> map2 = regionSpaceLiveRatioOptConfig.ratioMap;
        long j = regionSpaceLiveRatioOptConfig.minInterval;
        if (C821400WKc.LJFF.compareAndSet(false, true)) {
            C821400WKc c821400WKc = new C821400WKc(map2, j);
            C20125113on.LIZIZ().getClass();
            C20125113on.LIZ(c821400WKc);
        }
    }

    public static void LIZJ() {
        C1505630pHd c1505630pHd;
        if (!((Boolean) C2219251BtT.LIZLLL.getValue()).booleanValue() || (c1505630pHd = (C1505630pHd) ((LinkedHashMap) C2187801Ajq.LIZ).get("assem-serial-t")) == null) {
            return;
        }
        try {
            JatoXL.setPriority(c1505630pHd.LIZ, c1505630pHd.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL() {
        MemLeakAutoFixConfig memLeakAutoFixConfig = (MemLeakAutoFixConfig) C2187481AjK.LIZ.getValue();
        if (memLeakAutoFixConfig == null) {
            return;
        }
        Application applicationLIZ = C1BWL.LIZ();
        C20124613oi c20124613oi = new C20124613oi();
        c20124613oi.LJI = memLeakAutoFixConfig.fixLeakMinInterval;
        c20124613oi.LJFF = memLeakAutoFixConfig.memoryUsageThreshold;
        c20124613oi.LJII = memLeakAutoFixConfig.objectLeakCountThreshold;
        c20124613oi.LJIIIIZZ = memLeakAutoFixConfig.objectLeakTimeThreshold;
        c20124613oi.LJIIIZ = memLeakAutoFixConfig.replaceLeakObjectWithNull;
        c20124613oi.LIZLLL = memLeakAutoFixConfig.fixActivityLeak;
        c20124613oi.LJ = memLeakAutoFixConfig.fixFragmentLeak;
        c20124613oi.LIZJ = C823050WQl.LIZLLL();
        synchronized (C20124513oh.class) {
            AtomicBoolean atomicBoolean = C20124513oh.LJIIJ;
            if (atomicBoolean.get()) {
                throw new IllegalStateException("MemoryLeakAutoFixer already initialized. getInstance() should be used to access the instance.");
            }
            if (C20124513oh.LJIIIZ == null) {
                C20124513oh.LJIIIZ = c20124613oi.LIZ();
                atomicBoolean.set(true);
            }
        }
        C20124513oh c20124513ohLIZIZ = C20124513oh.LIZIZ();
        C13A0 c13a0 = c20124513ohLIZIZ.LIZIZ;
        boolean z = c20124513ohLIZIZ.LJI;
        boolean z2 = c20124513ohLIZIZ.LJII;
        String[] strArr = c20124513ohLIZIZ.LJIIIIZZ;
        c13a0.getClass();
        C199657139z c199657139z = new C199657139z(c13a0);
        ArrayList<InterfaceC199653139v> arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C199655139x(applicationLIZ, c199657139z));
        }
        if (z2) {
            arrayList.add(new C199651139t(applicationLIZ, c199657139z, strArr));
        }
        arrayList.isEmpty();
        if (!c13a0.LIZIZ) {
            c13a0.LIZ = new C13A1();
            for (InterfaceC199653139v interfaceC199653139v : arrayList) {
                interfaceC199653139v.LIZ();
                ((ArrayList) c13a0.LIZJ).add(interfaceC199653139v);
            }
            c13a0.LIZIZ = true;
        }
        c20124513ohLIZIZ.LIZJ.getClass();
        C20125113on.LIZ(c20124513ohLIZIZ);
    }

    public static void LJIIIZ() {
        C01GW c01gw = C0BHH.LIZ;
        if (((Number) c01gw.getValue()).longValue() <= 0) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new ARunnableS83S0000000_3(25));
            return;
        }
        C786410Ut5.LJLIIL(((Number) c01gw.getValue()).longValue(), C799570VYd.LIZJ(), new ARunnableS83S0000000_3(24));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ() {
        /*
            int r1 = X.C2187451AjH.LJFF
            r0 = -1
            r4 = 0
            r3 = 1
            if (r1 != r0) goto L40
            X.0XAv r2 = X.C844470XAv.LIZ
            r2.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "local_test"
            boolean r0 = X.C2093608Ic.LIZJ(r1, r0)
            if (r0 != 0) goto L46
            r2.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "lark_inhouse"
            boolean r0 = X.C2093608Ic.LIZJ(r1, r0)
            if (r0 != 0) goto L46
            r2.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "monkey"
            boolean r0 = X.C2093608Ic.LIZJ(r1, r0)
            if (r0 != 0) goto L46
            r2.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "rhea"
            boolean r0 = X.C2093608Ic.LIZJ(r1, r0)
            if (r0 != 0) goto L46
            r0 = 0
        L3e:
            X.C2187451AjH.LJFF = r0
        L40:
            int r0 = X.C2187451AjH.LJFF
            if (r0 != r3) goto L45
            r4 = 1
        L45:
            return r4
        L46:
            r0 = 1
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2187451AjH.LJIIJ():boolean");
    }

    public static void LJIIJJI() {
        C1C7U.LIZ("OptimizerHelper@3f44.resetSubpageJitOptions$1L");
        JitCompilerConfig jitCompilerConfigLIZ = C2187431AjF.LIZ();
        JitCompilerConfig jitCompilerConfig = C2187431AjF.LIZIZ;
        if (!Intrinsics.LJFF(jitCompilerConfigLIZ, jitCompilerConfig)) {
            C2187431AjF.LIZ.getClass();
            JatoXL.setJitOptions(jitCompilerConfig.compileThreshold, jitCompilerConfig.warmupThreshold, jitCompilerConfig.osrThreshold, jitCompilerConfig.priorityThreadWeight, jitCompilerConfig.invokeTransitionWeight);
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.resetSubpageJitOptions$1L");
    }

    public static void LJIJ() {
        synchronized (LJIILJJIL) {
            try {
                if (LJIILL) {
                    return;
                }
                LJIILL = true;
                C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new AfS146S0000000_33(1));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJI() {
        synchronized (LJIJ) {
            try {
                if (LJIJI) {
                    return;
                }
                LJIJI = true;
                C1906580ziK.LIZJ().LIZJ().LJLLLLLL(new AfS146S0000000_33(0));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIL() {
        SoftReferenceLruConfig softReferenceLruConfig;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 36 || C2366809Pe.LIZ() <= 0 || (softReferenceLruConfig = (SoftReferenceLruConfig) C2187541AjQ.LIZ.getValue()) == null) {
            return;
        }
        SoftReferenceLruOpt.LIZIZ(softReferenceLruConfig.lruSoftEpoch, softReferenceLruConfig.lruSoftInterval);
    }

    public static void LJJIII() {
        int iLIZ;
        LaunchDexReclaimPara launchDexReclaimPara = (LaunchDexReclaimPara) C2187571AjT.LIZ.getValue();
        if (launchDexReclaimPara == null || launchDexReclaimPara.getEnableWhen() <= 0) {
            return;
        }
        if (C2366709Pd.LIZ() <= 0 || ((iLIZ = DeviceInfoUtils.LIZ()) >= 24 && iLIZ <= C2366709Pd.LIZ())) {
            if (launchDexReclaimPara.getReclaimPercent() > 0) {
                JatoXL.reclaimCodeItemV3(launchDexReclaimPara.getReclaimPercent());
            }
            if (launchDexReclaimPara.getMlockPercent() > 0) {
                LJIIL(launchDexReclaimPara.getMlockPercent());
            }
            if (launchDexReclaimPara.getMUnlockInBg()) {
                LJIJ();
            }
        }
    }

    public static void LJJIIJ() {
        LaunchDexReclaimPara launchDexReclaimPara = (LaunchDexReclaimPara) C2187551AjR.LIZ.getValue();
        if (launchDexReclaimPara == null || launchDexReclaimPara.getEnableWhen() <= 0) {
            return;
        }
        if (launchDexReclaimPara.getReclaimPercent() > 0) {
            JatoXL.reclaimCodeOdexV4(launchDexReclaimPara.getReclaimPercent());
        }
        if (launchDexReclaimPara.getMlockPercent() > 0) {
            LJIILIIL(launchDexReclaimPara.getMlockPercent(), launchDexReclaimPara.getMlockMaxKb());
        }
        if (launchDexReclaimPara.getMUnlockInBg()) {
            LJIJI();
        }
    }

    public static void LJIJJLI() {
        if (JatoXL.isInited() && ((Boolean) C0C3R.LIZIZ.getValue()).booleanValue()) {
            if (((Boolean) C0C3R.LIZJ.getValue()).booleanValue()) {
                ThreadAttrFixer.nativeFixThreadAttrInherited(true);
            } else if (((Boolean) C0C3R.LIZLLL.getValue()).booleanValue()) {
                ThreadAttrFixer.nativeFixThreadAttrInherited(false);
            }
        }
    }

    public static void LJJ() {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS83S0000000_3(27));
    }

    public static void LJJII() {
        PrePageFaultConfig prePageFaultConfig;
        if (LJIIJ() || (prePageFaultConfig = (PrePageFaultConfig) C2187561AjS.LIZ.getValue()) == null) {
            return;
        }
        int i = prePageFaultConfig.dexReclaimPercent;
        if (i > 0) {
            JatoXL.reclaimCodeItem(i);
        }
        if (prePageFaultConfig.dexMunlockInBg) {
            JatoXL.munlockInBackground();
        }
        int i2 = prePageFaultConfig.dexMlockPercent;
        if (i2 > 0) {
            JatoXL.mlockCodeItem(i2);
        }
    }

    public static void LJJIIJZLJL() {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS92S0000000_13(24));
    }

    public static void LJJIIZ() {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS10S0001000_33(Process.myTid(), 1));
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS92S0000000_13(48));
        }
    }

    public static void LJ(long j) {
        C799900VZk c799900VZk = C799900VZk.LIZ;
        EnumC799980VZs enumC799980VZs = EnumC799980VZs.TASK_BOOT_FINISH;
        c799900VZk.getClass();
        InterfaceC800100Va4 interfaceC800100Va4 = C799900VZk.LJIIIIZZ.get(enumC799980VZs);
        if (interfaceC800100Va4 != null) {
            interfaceC800100Va4.LJI();
        }
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS88S0000000_9(12));
    }

    public static void LJFF(long j) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0X3K
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.blockGC$1");
                try {
                    JatoXL.startBlockGc("beginBlockGC");
                    C2187451AjH.LIZ++;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.blockGC$1");
            }
        });
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0X3L
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.blockGC$2");
                try {
                    if (C2187451AjH.LIZ < 2) {
                        JatoXL.stopBlockGc("beginBlockGC");
                    }
                    C2187451AjH.LIZ--;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.blockGC$2");
            }
        });
    }

    public static void LJI(long j) {
        LJII(j, true);
    }

    public static void LJIIL(int i) {
        if (i <= 0) {
            return;
        }
        synchronized (LJIILJJIL) {
            try {
                int i2 = LJIILIIL;
                if (i2 > 0 && i < i2) {
                    PrePageFaultOpt3.munlockCodeItem();
                }
                LJIILIIL = i;
                PrePageFaultOpt3.mlockCodeItem(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILJJIL(boolean z) {
        synchronized (LJIILJJIL) {
            try {
                if (LJIILIIL > 0) {
                    PrePageFaultOpt3.munlockCodeItem();
                    if (z) {
                        LJIILIIL = -1;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILL(boolean z) {
        synchronized (LJIJ) {
            try {
                if (LJIILLIIL > 0) {
                    PrePageFaultOpt4.munlockCodeOdex();
                    if (z) {
                        LJIILLIIL = -1;
                        LJIIZILJ = 0;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIILLIIL(int i) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS44S0101000_33(i, 5));
    }

    public static void LJIIZILJ(InterfaceC2184631Aej interfaceC2184631Aej) {
        ((CopyOnWriteArrayList) LJIIL).add(interfaceC2184631Aej);
    }

    public static void LJJI(long j) {
        DoFrameController.LIZIZ = 3;
        LIZJ++;
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new Runnable() { // from class: X.0N4s
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.startDoframe$1");
                try {
                    if (C2187451AjH.LIZJ < 2) {
                        DoFrameController.LIZIZ = 0;
                    }
                    C2187451AjH.LIZJ--;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.startDoframe$1");
            }
        });
    }

    public static void LJJIFFI(long j) {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0uOt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.startLightJitBlockOpt$1");
                try {
                    JitBlock.lightJitBlockStart();
                    C2187451AjH.LIZLLL++;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.startLightJitBlockOpt$1");
            }
        });
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS100S0000000_26(15));
    }

    public static void LJJIIZI(boolean z) {
        String[] strArrMergeDefault;
        String[] strArrMergeDefault2;
        if (z) {
            if (!((Boolean) C0B5F.LIZ.getValue()).booleanValue()) {
                return;
            }
        } else if (((Boolean) C0B5F.LIZ.getValue()).booleanValue()) {
            return;
        }
        StringCacheConfig stringCacheConfig = (StringCacheConfig) C21517619Iw.LIZIZ.getValue();
        String[] strArrMergeDefault3 = null;
        if (stringCacheConfig != null) {
            strArrMergeDefault = stringCacheConfig.mergeDefault(C21517619Iw.LIZ);
        } else {
            strArrMergeDefault = null;
        }
        StringCacheConfig stringCacheConfig2 = (StringCacheConfig) C20174313wj.LIZIZ.getValue();
        if (stringCacheConfig2 != null) {
            strArrMergeDefault2 = stringCacheConfig2.mergeDefault(C20174313wj.LIZ);
        } else {
            strArrMergeDefault2 = null;
        }
        StringCacheConfig stringCacheConfig3 = (StringCacheConfig) C21517519Iv.LIZIZ.getValue();
        if (stringCacheConfig3 != null) {
            strArrMergeDefault3 = stringCacheConfig3.mergeDefault(C21517519Iv.LIZ);
        }
        boolean zBooleanValue = ((Boolean) C0B5G.LIZ.getValue()).booleanValue();
        if (!zBooleanValue && strArrMergeDefault == null && strArrMergeDefault2 == null && strArrMergeDefault3 == null) {
            return;
        }
        StringCacheOpt.LIZ(zBooleanValue, strArrMergeDefault2, strArrMergeDefault, strArrMergeDefault3);
    }

    public static void LJJIJ(long j) {
        C1490100osa.LJFF().LJIIJJI("optimizer_helper");
        C786410Ut5.LJLIIL(j, C2113808Pw.LIZIZ.LL, new ARunnableS89S0000000_10(0));
    }

    public static void LJJIJIIJI(String str) {
        if (C1220604q4.LIZ()) {
            Iterator it2 = ((CopyOnWriteArrayList) LJIIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC2184631Aej) it2.next()).onFragmentChange(LJIIIZ, str, false);
            }
        }
        LJIIIZ = str;
    }

    public static void LJJIJIIJIL(long j) {
        if (!Intrinsics.LJFF(C2187431AjF.LIZ(), C2187431AjF.LIZIZ)) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS106S0000000_33(3));
            C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new ARunnableS104S0000000_31(1));
        }
    }

    public static void LJII(long j, final boolean z) {
        final int iMyTid = Process.myTid();
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.1Ajn
            public final void LIZ() {
                C1505630pHd c1505630pHd;
                if (z) {
                    BlockHelper.beginBlock();
                }
                C823020WQi.LIZIZ = true;
                if (((Boolean) C2219251BtT.LIZLLL.getValue()).booleanValue() && (c1505630pHd = (C1505630pHd) ((LinkedHashMap) C2187801Ajq.LIZ).get("assem-serial-t")) != null) {
                    C2187801Ajq.LIZ(c1505630pHd.LIZ, -5);
                }
                if (C2187891Ajz.LIZIZ()) {
                    Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                    int i = iMyTid;
                    C2187841Aju.LIZ.getClass();
                    int iLIZ = C2187841Aju.LIZ();
                    int i2 = C2187841Aju.LJFF;
                    if ((iLIZ & i2) == i2) {
                        JatoXL.tryCpuBoost(1500L);
                        JatoXL.tryGpuBoost(1500L);
                    }
                    if (C2187821Ajs.LJ()) {
                        JatoXL.setPriority(i, -20);
                    } else {
                        Thread thread = (Thread) ((LinkedHashMap) C2187801Ajq.LJFF).get("main");
                        if (thread != null) {
                            ThreadMethodProxy.setPriority(thread, 7);
                        }
                    }
                    if (C2187821Ajs.LJFF()) {
                        JatoXL.boostRenderThread(C104100aN.LIZ().getApplication(), -20);
                    } else {
                        Thread thread2 = (Thread) ((LinkedHashMap) C2187801Ajq.LJFF).get("RenderThread");
                        if (thread2 != null) {
                            ThreadMethodProxy.setPriority(thread2, 10);
                        }
                    }
                    if (!C2187821Ajs.LIZIZ()) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) C2187801Ajq.LJFF;
                        Thread thread3 = (Thread) linkedHashMap.get("play_thread_0");
                        if (thread3 != null) {
                            ThreadMethodProxy.setPriority(thread3, 7);
                        }
                        Thread thread4 = (Thread) linkedHashMap.get("play_thread_1");
                        if (thread4 != null) {
                            ThreadMethodProxy.setPriority(thread4, 7);
                        }
                        Thread thread5 = (Thread) linkedHashMap.get("explay_thread_1");
                        if (thread5 != null) {
                            ThreadMethodProxy.setPriority(thread5, 7);
                        }
                    }
                }
                if (!C584360Mvy.LIZ()) {
                    IStrategyApi iStrategyApiLIZ = C104100aN.LIZ();
                    AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(338);
                    if (iStrategyApiLIZ.LJJIJ(aFwS223S0000000_32) || C104100aN.LIZ().LJJIJ(AFwS223S0000000_32.get$arr$(339))) {
                        Map<String, C1505630pHd> map2 = C2187801Ajq.LIZ;
                        int i3 = C104100aN.LIZ().LJJIJ(aFwS223S0000000_32) ? 1 : 6;
                        Iterator it2 = ((LinkedHashMap) C2187801Ajq.LJ).entrySet().iterator();
                        while (it2.hasNext()) {
                            ThreadMethodProxy.setPriority((Thread) ((Map.Entry) it2.next()).getValue(), i3);
                        }
                    }
                }
                if (((Boolean) C303880Bve.LJIIIIZZ.getValue()).booleanValue() && C2214201BlK.LJFF() != null) {
                    C2184511AeX c2184511AeX = C2184511AeX.LJ;
                    final Activity activityLJFF = C2214201BlK.LJFF();
                    Objects.requireNonNull(activityLJFF);
                    c2184511AeX.LIZIZ(new InterfaceC739920T0s() { // from class: X.0T29
                        @Override // X.InterfaceC739920T0s
                        public final LayoutInflater LIZ() {
                            return activityLJFF.getLayoutInflater();
                        }
                    }, 0);
                }
                C1505550pHV.LIZIZ.LLILLJJLI = true;
                boolean z2 = C0VC7.LIZ;
                C0VEP.LIZ.getClass();
                if (((Boolean) C0VEP.LIZLLL.getValue()).booleanValue()) {
                    C0VC7.LIZ = true;
                }
                C2187451AjH.LIZIZ++;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.blockLog$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.blockLog$1");
            }
        });
        C786410Ut5.LJLIIL(j, C799570VYd.LIZIZ(), new Runnable() { // from class: X.1Ajo
            public final /* synthetic */ boolean LLILLJJLI = false;

            public final void LIZ() {
                if (C2187451AjH.LIZIZ < 2) {
                    if (z) {
                        BlockHelper.endBlock();
                    }
                    if (!this.LLILLJJLI) {
                        C1492110ovp.LIZIZ("applogslidebatch", new C20302814cM(), ((Boolean) C256140A2a.LIZJ.getValue()).booleanValue());
                    }
                    C823020WQi.LIZIZ = false;
                    C2187451AjH.LIZJ();
                    if (C2187891Ajz.LIZIZ()) {
                        Map<String, C1505630pHd> map = C2187801Ajq.LIZ;
                        C2187801Ajq.LJIIIZ(iMyTid);
                    }
                    if (!C584360Mvy.LIZ() && (C104100aN.LIZ().LJJIJ(AFwS223S0000000_32.get$arr$(338)) || C104100aN.LIZ().LJJIJ(AFwS223S0000000_32.get$arr$(339)))) {
                        for (Map.Entry entry : ((LinkedHashMap) C2187801Ajq.LJ).entrySet()) {
                            Integer num = (Integer) ((LinkedHashMap) C2187801Ajq.LIZJ).get(entry.getKey());
                            if (num != null) {
                                ThreadMethodProxy.setPriority((Thread) entry.getValue(), num.intValue());
                            }
                        }
                    }
                    if (((Boolean) C303880Bve.LJIIIIZZ.getValue()).booleanValue()) {
                        C2184511AeX.LJ.LIZJ();
                    }
                    C1505540pHU c1505540pHU = C1505550pHV.LIZIZ;
                    c1505540pHU.LLILLJJLI = false;
                    c1505540pHU.LLILLL = 0L;
                    C0VC7.LIZ();
                }
                C2187451AjH.LIZIZ--;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OptimizerHelper@3f44.blockLog$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OptimizerHelper@3f44.blockLog$2");
            }
        });
        C1602860roS.LIZ.getClass();
        if (C1602860roS.LJ()) {
            C1553140qWG.LIZ(j);
        }
    }

    public static void LJIILIIL(int i, int i2) {
        if (i <= 0) {
            return;
        }
        synchronized (LJIJ) {
            try {
                int i3 = LJIILLIIL;
                if (i3 > 0 && i < i3) {
                    PrePageFaultOpt4.munlockCodeOdex();
                }
                LJIILLIIL = i;
                LJIIZILJ = i2;
                PrePageFaultOpt4.mlockCodeOdex(i, i2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJJ(int i, String str, boolean z) {
        if (C2538209x6.LIZ > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", z);
                jSONObject.put("type", i);
                jSONObject.put("params", str);
                jSONObject.put("extend_boost", C08DU.LIZ);
                jSONObject.put("qualcomm_untrusted_fix", C08DV.LIZ);
                C20684815ws.LJIJ("framework_perflock_report", jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
