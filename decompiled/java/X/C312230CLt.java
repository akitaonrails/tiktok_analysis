package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS37S0300000_4;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312230CLt {
    public static final ConcurrentHashMap<String, AtomicInteger> LIZ = new ConcurrentHashMap<>();
    public static RunnableC310500CFc LIZIZ;
    public static RunnableC310510CFd LIZJ;
    public static RunnableC310520CFe LIZLLL;
    public static ARunnableS104S0100000_4 LJ;
    public static final AtomicBoolean LJFF;
    public static boolean LJI;
    public static C0CMC LJII;
    public static boolean LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;
    public static final C01GW LJIILIIL;
    public static final ConcurrentHashMap<C0CME, Runnable> LJIILJJIL;
    public static final C01GW LJIILL;
    public static final C01GW LJIILLIIL;
    public static final C01GW LJIIZILJ;
    public static final C01GW LJIJ;
    public static final C01GW LJIJI;
    public static final C01GW LJIJJ;
    public static final C01GW LJIJJLI;
    public static Function0<Boolean> LJIL;
    public static C0CMD LJJ;
    public static C0CMF LJJI;

    static {
        new AtomicBoolean(false);
        LJFF = new AtomicBoolean(false);
        LJIIIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1825));
        LJIIJ = C452501pT.LIZIZ(new C0CMB());
        LJIIJJI = C452501pT.LIZIZ(new C0CFI());
        LJIIL = C452501pT.LIZIZ(new C0CM9());
        LJIILIIL = C452501pT.LIZIZ(new C0CFH());
        LJIILJJIL = new ConcurrentHashMap<>();
        LJIILL = C452501pT.LIZIZ(new C309730CCd());
        LJIILLIIL = C452501pT.LIZIZ(new C0CC5());
        LJIIZILJ = C452501pT.LIZIZ(new C0CC6());
        LJIJ = C452501pT.LIZIZ(new C309740CCe());
        LJIJI = C452501pT.LIZIZ(new C309750CCf());
        LJIJJ = C452501pT.LIZIZ(new C0CM6());
        LJIJJLI = C452501pT.LIZIZ(new C0CM7());
    }

    public static final Handler LIZIZ() {
        return (Handler) LJIILL.getValue();
    }

    public static Set LIZJ() {
        return (Set) LJIIL.getValue();
    }

    public static Handler LIZLLL() {
        return (Handler) LJIILLIIL.getValue();
    }

    public static boolean LJI() {
        if (((Boolean) LJIIIZ.getValue()).booleanValue()) {
            return LJIIIIZZ;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0CMF] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0CMD] */
    public static void LJIIJJI() {
        if (LJFF.get()) {
            return;
        }
        for (C0CME c0cme : C0CME.getEntries()) {
            if (!c0cme.isCoreScene()) {
                LIZJ().add(c0cme);
            }
        }
        LJJ = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0CMD
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                C0CMF c0cmf;
                C1602200rnO c1602200rnO3 = c1602200rnO2;
                if (c1602200rnO3.LIZJ()) {
                    C312230CLt.LJIIJ(C0CME.FIRST_VIDEO_SHOW);
                    if (((Boolean) C0CMX.LJFF.getValue()).booleanValue() && (c0cmf = C312230CLt.LJJI) != null) {
                        C1BCA.LJJII(c0cmf);
                        return;
                    }
                    return;
                }
                if (!c1602200rnO3.LIZIZ()) {
                    return;
                }
                C312230CLt.LJIIJ(C0CME.FIRST_UI_FRAME);
                C312230CLt.LIZ(C0CME.FIRST_VIDEO_SHOW);
                C312230CLt.LIZ(C0CME.START_UP_END);
            }
        };
        if (((Boolean) C0CMX.LJFF.getValue()).booleanValue()) {
            LIZJ().add(C0CME.SCROLL_END);
            LJJI = new C0CMW() { // from class: X.0CMF
                @Override // X.InterfaceC1006670cIr
                public final void LJIIJ(C1603920rqA c1603920rqA, C1603920rqA c1603920rqA2) {
                    C1603920rqA c1603920rqA3 = c1603920rqA;
                    C1603920rqA c1603920rqA4 = c1603920rqA2;
                    if (Intrinsics.LJFF("com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment", C2187451AjH.LJIIIZ)) {
                        if (!c1603920rqA3.LIZ) {
                            if (c1603920rqA4.LIZ) {
                                Set setLIZJ = C312230CLt.LIZJ();
                                C0CME c0cme2 = C0CME.SCROLL_END;
                                setLIZJ.remove(c0cme2);
                                C312230CLt.LIZ(c0cme2);
                                return;
                            }
                            return;
                        }
                        if (c1603920rqA4.LIZ) {
                            return;
                        }
                        C0CME c0cme3 = C0CME.SCROLL_END;
                        C312230CLt.LJIIJ(c0cme3);
                        C312230CLt.LIZJ().add(c0cme3);
                    }
                }
            };
        }
        C312250CLv c312250CLv = new C312250CLv();
        if (C0CMA.LIZ == null) {
            C0CMA.LIZ = c312250CLv;
        }
        C312260CLw c312260CLw = new C312260CLw();
        if (C0CMA.LIZIZ == null) {
            C0CMA.LIZIZ = c312260CLw;
        }
        C0CM1 c0cm1 = new C0CM1();
        if (C0CMA.LIZJ == null) {
            C0CMA.LIZJ = c0cm1;
        }
        EnumC312610CNf enumC312610CNf = EnumC312610CNf.SATRTUP;
        C0CMD c0cmd = LJJ;
        if (c0cmd == null) {
            return;
        }
        C1BCA.LJIJJLI(enumC312610CNf, c0cmd);
        LJFF.set(true);
    }

    public static final void LJIIIZ() {
        boolean zLJI = MethodIDManager.LJI(71779);
        LJIIIZ();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0CFd] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0CFe] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0CFc] */
    public static final void LIZ(final C0CME c0cme) {
        int i = C0CGN.LIZ[c0cme.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (LJ == null) {
                            LJ = new ARunnableS104S0100000_4(c0cme, 162);
                        }
                        Handler handlerLIZIZ = LIZIZ();
                        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = LJ;
                        if (aRunnableS104S0100000_4 == null) {
                            return;
                        }
                        C786410Ut5.LJLIIL(25000L, handlerLIZIZ, aRunnableS104S0100000_4);
                        return;
                    }
                    return;
                }
                if (LIZLLL == null) {
                    LIZLLL = new Runnable() { // from class: X.0CFe
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("DowngradeAbility@31d1.ensureTrigger$3");
                            try {
                                C312230CLt.LJIIJ(c0cme);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("DowngradeAbility@31d1.ensureTrigger$3");
                        }
                    };
                }
                Handler handlerLIZIZ2 = LIZIZ();
                RunnableC310520CFe runnableC310520CFe = LIZLLL;
                if (runnableC310520CFe == null) {
                    return;
                }
                C786410Ut5.LJLIIL(((Number) C0CMX.LIZLLL.getValue()).longValue(), handlerLIZIZ2, runnableC310520CFe);
                return;
            }
            if (LIZJ == null) {
                LIZJ = new Runnable() { // from class: X.0CFd
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DowngradeAbility@31d1.ensureTrigger$2");
                        try {
                            C312230CLt.LJIIJ(c0cme);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DowngradeAbility@31d1.ensureTrigger$2");
                    }
                };
            } else {
                Handler handlerLIZIZ3 = LIZIZ();
                RunnableC310520CFe runnableC310520CFe2 = LIZLLL;
                if (runnableC310520CFe2 == null) {
                    return;
                } else {
                    handlerLIZIZ3.removeCallbacks(runnableC310520CFe2);
                }
            }
            Handler handlerLIZIZ4 = LIZIZ();
            RunnableC310510CFd runnableC310510CFd = LIZJ;
            if (runnableC310510CFd == null) {
                return;
            }
            C786410Ut5.LJLIIL(((Number) C0CMX.LIZJ.getValue()).longValue(), handlerLIZIZ4, runnableC310510CFd);
            return;
        }
        if (LIZIZ == null) {
            LIZIZ = new Runnable() { // from class: X.0CFc
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.ensureTrigger$1");
                    try {
                        C312230CLt.LJIIJ(c0cme);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.ensureTrigger$1");
                }
            };
        }
        Handler handlerLIZIZ5 = LIZIZ();
        RunnableC310500CFc runnableC310500CFc = LIZIZ;
        if (runnableC310500CFc == null) {
            return;
        }
        C786410Ut5.LJLIIL(((Number) C0CMX.LIZIZ.getValue()).longValue(), handlerLIZIZ5, runnableC310500CFc);
    }

    public static final boolean LJ(String str) {
        return !((Set) LJIIJJI.getValue()).contains(str);
    }

    public static boolean LJFF(C0CME c0cme) {
        if (((Boolean) C0CMX.LJIIIZ.getValue()).booleanValue()) {
            return LIZJ().contains(c0cme);
        }
        return ((Set) LJIIJ.getValue()).contains(c0cme);
    }

    public static final void LJIIJ(C0CME c0cme) {
        boolean zLJI = MethodIDManager.LJI(71779);
        if (C0CMX.LIZ() && !LIZJ().contains(c0cme)) {
            int i = C0CGN.LIZ[c0cme.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            ConcurrentHashMap<C0CME, Runnable> concurrentHashMap = LJIILJJIL;
                            Runnable runnable = concurrentHashMap.get(c0cme);
                            if (runnable != null) {
                                LIZIZ().removeCallbacks(runnable);
                            }
                            concurrentHashMap.remove(c0cme);
                        } else if (LJ != null) {
                            Handler handlerLIZIZ = LIZIZ();
                            ARunnableS104S0100000_4 aRunnableS104S0100000_4 = LJ;
                            if (aRunnableS104S0100000_4 == null) {
                                if (zLJI) {
                                    MethodIDManager.LJ();
                                    return;
                                }
                                return;
                            }
                            handlerLIZIZ.removeCallbacks(aRunnableS104S0100000_4);
                        }
                    } else if (LIZLLL != null) {
                        Handler handlerLIZIZ2 = LIZIZ();
                        RunnableC310520CFe runnableC310520CFe = LIZLLL;
                        if (runnableC310520CFe == null) {
                            if (zLJI) {
                                MethodIDManager.LJ();
                                return;
                            }
                            return;
                        }
                        handlerLIZIZ2.removeCallbacks(runnableC310520CFe);
                    }
                } else if (LIZJ != null) {
                    Handler handlerLIZIZ3 = LIZIZ();
                    RunnableC310510CFd runnableC310510CFd = LIZJ;
                    if (runnableC310510CFd == null) {
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    handlerLIZIZ3.removeCallbacks(runnableC310510CFd);
                }
            } else if (LIZIZ != null) {
                Handler handlerLIZIZ4 = LIZIZ();
                RunnableC310500CFc runnableC310500CFc = LIZIZ;
                if (runnableC310500CFc == null) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                handlerLIZIZ4.removeCallbacks(runnableC310500CFc);
            }
            LIZJ().add(c0cme);
            Object value = c0cme.getCache$launcher_lazy_util_release().LJFF.getValue();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c0cme.getCache$launcher_lazy_util_release().LIZLLL.getValue();
            CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) c0cme.getCache$launcher_lazy_util_release().LJ.getValue();
            Function2<? super CopyOnWriteArrayList<C0CM8>, ? super C0CME, Unit> function2 = C0CMA.LIZJ;
            if (function2 != null) {
                function2.invoke(value, c0cme);
            }
            C786410Ut5.LJL(new BPEAHandler(Looper.getMainLooper()), new ARunnableS37S0300000_4(copyOnWriteArrayList2, c0cme, copyOnWriteArrayList, 15));
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LJII(final C0CM8 c0cm8, CopyOnWriteArrayList copyOnWriteArrayList) {
        String str;
        C844470XAv.LIZ.getClass();
        if ((C08Q0.LIZIZ(C844470XAv.LIZ(), 0, "downgrade_ability_performance_opt") & 2) != 2 || C2187451AjH.LJIIJ()) {
            int i = c0cm8.LL;
            if (i == C0CMJ.HIGH_PRIORITY.getType()) {
                str = "[High]";
            } else if (i == C0CMJ.TOP_PRIORITY.getType()) {
                str = "[Top]";
            } else {
                str = "[Normal]";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Delayed logic is triggered (");
            sbLIZ.append(str);
            sbLIZ.append("), scene is ");
            sbLIZ.append(c0cm8.LLILZ.name());
            sbLIZ.append(", main thread: ");
            sbLIZ.append(!c0cm8.LLILLL);
            sbLIZ.append(", list size is ");
            sbLIZ.append(copyOnWriteArrayList.size());
            sbLIZ.append(", class : ");
            sbLIZ.append(c0cm8.LLILZIL.getClass());
            sbLIZ.append(", tag : ");
            sbLIZ.append(c0cm8.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        c0cm8.LLILZIL.invoke();
        C786410Ut5.LJJZZIII(LIZLLL(), new Runnable() { // from class: X.0CLm
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DowngradeAbility@31d1.onTaskExecute$1");
                try {
                    C311900CKm c311900CKm = C311900CKm.LIZLLL;
                    C0CM8 c0cm82 = c0cm8;
                    c311900CKm.getClass();
                    c311900CKm.LIZ(new C312150CLl(c0cm82));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DowngradeAbility@31d1.onTaskExecute$1");
            }
        });
        C0VY3.LIZIZ("DowngradeAbility", new AwS405S0200000_4(c0cm8, (C0CM8) copyOnWriteArrayList, (CopyOnWriteArrayList<C0CM8>) 59));
    }

    public static void LJIIIIZZ(final int i, final CopyOnWriteArrayList copyOnWriteArrayList) {
        final long jLIZIZ;
        if (i == C0CMJ.HIGH_PRIORITY.getType()) {
            jLIZIZ = ((Number) C0CMX.LJIIJJI.getValue()).longValue();
        } else {
            C0CMC c0cmc = LJII;
            if (c0cmc == null) {
                return;
            } else {
                jLIZIZ = c0cmc.LIZIZ();
            }
        }
        if (jLIZIZ > 0) {
            Message messageObtain = Message.obtain(LIZIZ(), new Runnable() { // from class: X.0CM0
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.splitOrMergeForegroundTasks$specificMessage$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.splitOrMergeForegroundTasks$specificMessage$1");
                }

                public final void LIZ() {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    while (!copyOnWriteArrayList.isEmpty()) {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLIZIZ) {
                            C312230CLt.LJIIIIZZ(i, copyOnWriteArrayList);
                            C0CMC c0cmc2 = C312230CLt.LJII;
                            if (c0cmc2 != null && c0cmc2.LIZ() && i == C0CMJ.HIGH_PRIORITY.getType()) {
                                C805950VjV.LIZ();
                                return;
                            }
                            return;
                        }
                        copyOnWriteArrayList.remove(0).run();
                    }
                }
            });
            messageObtain.what = 99999;
            C786410Ut5.LJLJJLL(LIZIZ(), messageObtain);
        }
    }
}
