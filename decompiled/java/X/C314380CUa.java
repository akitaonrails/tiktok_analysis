package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.spi.IHomeTabStabilityService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0CUa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314380CUa {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static long LIZLLL;
    public static n LJ;
    public static boolean LJFF;
    public static volatile C314410CUd LJIIJJI;
    public static final C314380CUa LIZ = new C314380CUa();
    public static Integer LJI = -1;
    public static final C314390CUb LJII = C314390CUb.LL;
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static volatile long LJIIIZ = -1;
    public static final AtomicBoolean LJIIJ = new AtomicBoolean(false);

    public static void LIZ(final long j) {
        Object objLIZLLL;
        if (C307020C1s.LIZ()) {
            return;
        }
        try {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            if (C10RS.LIZ().LIZ) {
                C340370DVz c340370DVz = C340370DVz.LIZ;
                C0CUZ c0cuz = C0CUZ.CHECK_AB;
                EnumC314460CUi enumC314460CUi = EnumC314460CUi.FAIL;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZJ(c0cuz, enumC314460CUi, jElapsedRealtime);
                return;
            }
            if (LJFF) {
                LJFF = false;
                n nVar = LJ;
                if (nVar != null) {
                    LIZ.getClass();
                    LJ(nVar);
                }
            }
            C0CUY.LIZ.getClass();
            int iLIZ = C0CUY.LIZ();
            if (iLIZ != 1 && iLIZ != 2) {
                C340370DVz c340370DVz2 = C340370DVz.LIZ;
                C0CUZ c0cuz2 = C0CUZ.CHECK_AB;
                EnumC314460CUi enumC314460CUi2 = EnumC314460CUi.WAITING;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                c340370DVz2.getClass();
                C340370DVz.LIZJ(c0cuz2, enumC314460CUi2, jElapsedRealtime2);
                C0C5P.LIZJ().LJIIJJI("tt_mall_experiment", new InterfaceC304970BxP() { // from class: X.0CUe
                    @Override // X.InterfaceC304970BxP
                    public final void LIZ() {
                        final long j2 = j;
                        try {
                            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0CUc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("EcUgFirstLaunchManager@5b6d.checkAB$1$2$onChanged$$inlined$runOnWorkerThread$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("EcUgFirstLaunchManager@5b6d.checkAB$1$2$onChanged$$inlined$runOnWorkerThread$1");
                                }

                                public final void LIZ() {
                                    try {
                                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                        AFwS190S0000000_4 aFwS190S0000000_4 = AFwS190S0000000_4.get$arr$(5254);
                                        c2341109Fh.getClass();
                                        C2341109Fh.LJFF(aFwS190S0000000_4);
                                        C0CUY.LIZ.getClass();
                                        C0CUY.LIZJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "tt_mall_experiment", false);
                                        if (C0CUY.LIZ() != 0) {
                                            C314380CUa c314380CUa = C314380CUa.LIZ;
                                            long j3 = j2;
                                            c314380CUa.getClass();
                                            C314380CUa.LIZJ(j3);
                                            C0C5P.LIZJ().LJIJ("tt_mall_experiment", this);
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
                            });
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                });
                LJIIIZ = j;
                ISettingManagerService iSettingManagerService = (ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class);
                C844470XAv.LIZ.getClass();
                C844470XAv.LIZ();
                iSettingManagerService.LIZIZ(0);
                objLIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CUW(j, null), 3);
            } else {
                C340370DVz c340370DVz3 = C340370DVz.LIZ;
                C0CUZ c0cuz3 = C0CUZ.CHECK_AB;
                EnumC314460CUi enumC314460CUi3 = EnumC314460CUi.PASS;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                c340370DVz3.getClass();
                C340370DVz.LIZJ(c0cuz3, enumC314460CUi3, jElapsedRealtime3);
                LIZ.getClass();
                LJFF(j);
                LIZIZ(j);
                objLIZLLL = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objLIZLLL);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(long j) {
        try {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            if (C10RS.LIZ().LIZ) {
                C340370DVz c340370DVz = C340370DVz.LIZ;
                C0CUZ c0cuz = C0CUZ.CHECK_LOGIN;
                EnumC314460CUi enumC314460CUi = EnumC314460CUi.FAIL;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZJ(c0cuz, enumC314460CUi, jElapsedRealtime);
                return;
            }
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                EventBus.LIZLLL().LJIJJ(LIZ);
                C340370DVz c340370DVz2 = C340370DVz.LIZ;
                C0CUZ c0cuz2 = C0CUZ.CHECK_LOGIN;
                EnumC314460CUi enumC314460CUi2 = EnumC314460CUi.WAITING;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                c340370DVz2.getClass();
                C340370DVz.LIZJ(c0cuz2, enumC314460CUi2, jElapsedRealtime2);
                C0XQ7.LJ();
                C0XQ7.LIZ.LJIILL(LJII);
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

    public static void LIZJ(long j) {
        LJIIIZ = -1L;
        try {
            if (LJIIJ.compareAndSet(false, true)) {
                C340370DVz c340370DVz = C340370DVz.LIZ;
                C0CUZ c0cuz = C0CUZ.CHECK_AB;
                EnumC314460CUi enumC314460CUi = EnumC314460CUi.SUCCESS;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZJ(c0cuz, enumC314460CUi, jElapsedRealtime);
                LIZ.getClass();
                LJFF(j);
                LIZIZ(j);
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

    public static void LJ(n nVar) {
        FriendsTabTopExperiment.FriendsTabTopConfig friendsTabTopConfig;
        n nVarLIZ;
        Integer num = LJI;
        if (num != null) {
            int iIntValue = num.intValue();
            C0CUY.LIZ.getClass();
            C0CUY.LIZLLL = iIntValue;
        }
        Integer num2 = LJI;
        if (num2 != null && num2.intValue() == 1) {
            n nVarLIZ2 = C678560QjW.LIZ(nVar, "tt_friends_top_tab_experiment");
            Integer numLIZIZ = null;
            if (nVarLIZ2 != null && (nVarLIZ = C678560QjW.LIZ(nVarLIZ2, "val")) != null) {
                friendsTabTopConfig = (FriendsTabTopExperiment.FriendsTabTopConfig) C314470CUj.LIZ(nVarLIZ, FriendsTabTopExperiment.FriendsTabTopConfig.class);
            } else {
                friendsTabTopConfig = null;
            }
            n nVarLIZ3 = C678560QjW.LIZ(nVar, "tt_friends_experiment");
            if (nVarLIZ3 != null) {
                numLIZIZ = C2399609ak.LIZIZ(nVarLIZ3, "val");
            }
            if (!LIZJ) {
                LIZJ = true;
                C1589640rT8.LIZIZ.g2(friendsTabTopConfig, numLIZIZ);
                C1595430rcT.LIZIZ.LIZIZ().updateDynamicDelegate();
            }
        }
    }

    public static void LJFF(long j) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        if (C307020C1s.LIZ()) {
            return;
        }
        try {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            int i = 0;
            if (!C10RS.LIZ().LIZ) {
                IECommerceMallService iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
                boolean zShouldShowMallTab = iECommerceMallService.shouldShowMallTab();
                boolean zShouldShowMallTopTab = iECommerceMallService.shouldShowMallTopTab();
                if (!zShouldShowMallTab && !zShouldShowMallTopTab) {
                    C340370DVz c340370DVz = C340370DVz.LIZ;
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                    c340370DVz.getClass();
                    C340370DVz.LIZIZ(jElapsedRealtime, "can not show", false);
                    return;
                }
                AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                ArrayList arrayList = new ArrayList(abstractC1387200mCcArrLJII.length);
                int length = abstractC1387200mCcArrLJII.length;
                while (true) {
                    Activity activityLIZ = null;
                    if (i >= length) {
                        break;
                    }
                    Activity activityLIZIZ = abstractC1387200mCcArrLJII[i].LIZIZ();
                    if (activityLIZIZ != null) {
                        activityLIZ = C085T.LIZ(activityLIZIZ);
                    }
                    arrayList.add(activityLIZ);
                    i++;
                }
                List<Activity> listLJLJJLL = C13LP.LJLJJLL(arrayList);
                if (listLJLJJLL != null) {
                    for (Activity activity : listLJLJJLL) {
                        if ((activity instanceof InterfaceC1603190roz) && (activity instanceof C19EG) && (mainActivityScopeLIZJ = C0S4U.LIZJ((C19EG) activity)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                            if (zShouldShowMallTab && !homeTabAbilityLIZ.zd1()) {
                                if (!LIZJ) {
                                    LIZJ = true;
                                    C1589640rT8.LIZIZ.g2(null, null);
                                    C1595430rcT.LIZIZ.LIZIZ().updateDynamicDelegate();
                                }
                                C1DFH c1dfh = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0CUS(homeTabAbilityLIZ, j, null), 3);
                                return;
                            }
                            if (zShouldShowMallTopTab && !homeTabAbilityLIZ.dR("Shop")) {
                                C1DFH c1dfh2 = C0PEM.LIZ;
                                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0CUT(homeTabAbilityLIZ, j, null), 3);
                                return;
                            } else {
                                C340370DVz c340370DVz2 = C340370DVz.LIZ;
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                                c340370DVz2.getClass();
                                C340370DVz.LIZIZ(jElapsedRealtime2, "has loaded", true);
                                return;
                            }
                        }
                    }
                }
                C340370DVz c340370DVz3 = C340370DVz.LIZ;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                c340370DVz3.getClass();
                C340370DVz.LIZIZ(jElapsedRealtime3, "no MainActivity", true);
            } else {
                C340370DVz c340370DVz4 = C340370DVz.LIZ;
                long jElapsedRealtime4 = SystemClock.elapsedRealtime() - j;
                c340370DVz4.getClass();
                C340370DVz.LIZIZ(jElapsedRealtime4, "nuj finish", false);
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

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNewUserJourneyFinishEvent(C0DNB c0dnb) {
        C19EG c19egLIZIZ;
        IHomeTabStabilityService iHomeTabStabilityService;
        EventBus.LIZLLL().LJJI(this);
        C0XQ7.LJ();
        C0XQ7.LIZ.LJI(LJII);
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            if (abstractC1387200mCc.LIZ instanceof InterfaceC1711206n0) {
                Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                if (activityLIZIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (iHomeTabStabilityService = (IHomeTabStabilityService) PluggableExtentionKt.pluggableSpi$default(IHomeTabStabilityService.class, false, false, false, 14, null)) != null) {
                    iHomeTabStabilityService.LIZIZ(c19egLIZIZ, EnumC1585090rLn.NUJ_END);
                    return;
                }
                return;
            }
        }
    }

    public static void LIZLLL(long j, String str) {
        try {
            if ((!a0.LJJJIL(str)) && LJIIIIZZ.compareAndSet(false, true)) {
                C340370DVz c340370DVz = C340370DVz.LIZ;
                C0CUZ c0cuz = C0CUZ.CHECK_DID;
                EnumC314460CUi enumC314460CUi = EnumC314460CUi.SUCCESS;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZJ(c0cuz, enumC314460CUi, jElapsedRealtime);
                LIZ.getClass();
                LIZ(j);
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
}
