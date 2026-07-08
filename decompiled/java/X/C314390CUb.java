package X;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0CUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314390CUb implements InterfaceC586170Myt {
    public static final C314390CUb LL = new C314390CUb();

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        if (i == 1 && z) {
            try {
                C314380CUa c314380CUa = C314380CUa.LIZ;
                long j = C314380CUa.LIZLLL;
                c314380CUa.getClass();
                C0XQ7.LJ();
                C0XQ7.LIZ.LJI(C314380CUa.LJII);
                C340370DVz c340370DVz = C340370DVz.LIZ;
                C0CUZ c0cuz = C0CUZ.CHECK_LOGIN;
                EnumC314460CUi enumC314460CUi = EnumC314460CUi.SUCCESS;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
                c340370DVz.getClass();
                C340370DVz.LIZJ(c0cuz, enumC314460CUi, jElapsedRealtime);
                if (C314380CUa.LIZIZ) {
                    IECommerceMallService iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
                    boolean zShouldShowMallTab = iECommerceMallService.shouldShowMallTab();
                    boolean zShouldShowMallTopTab = iECommerceMallService.shouldShowMallTopTab();
                    if (!zShouldShowMallTab && !zShouldShowMallTopTab) {
                        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
                        ArrayList arrayList = new ArrayList(abstractC1387200mCcArrLJII.length);
                        int length = abstractC1387200mCcArrLJII.length;
                        int i3 = 0;
                        while (true) {
                            Activity activityLIZ = null;
                            if (i3 >= length) {
                                break;
                            }
                            Activity activityLIZIZ = abstractC1387200mCcArrLJII[i3].LIZIZ();
                            if (activityLIZIZ != null) {
                                activityLIZ = C085T.LIZ(activityLIZIZ);
                            }
                            arrayList.add(activityLIZ);
                            i3++;
                        }
                        List listLJLJJLL = C13LP.LJLJJLL(arrayList);
                        if (listLJLJJLL != null) {
                            Iterator it2 = listLJLJJLL.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Activity activity = (Activity) it2.next();
                                if ((activity instanceof InterfaceC1603190roz) && (activity instanceof C19EG) && (mainActivityScopeLIZJ = C0S4U.LIZJ((C19EG) activity)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
                                    if (homeTabAbilityLIZ.zd1()) {
                                        C1589640rT8.LIZIZ.h3();
                                        C1595430rcT.LIZIZ.LIZIZ().updateDynamicDelegate();
                                        C1DFH c1dfh = C0PEM.LIZ;
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0CUE(homeTabAbilityLIZ, null), 3);
                                        if (!homeTabAbilityLIZ.zd1()) {
                                            C340370DVz c340370DVz2 = C340370DVz.LIZ;
                                            C0CUZ c0cuz2 = C0CUZ.RESET_TAB;
                                            EnumC314460CUi enumC314460CUi2 = EnumC314460CUi.SUCCESS;
                                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
                                            c340370DVz2.getClass();
                                            C340370DVz.LIZJ(c0cuz2, enumC314460CUi2, jElapsedRealtime2);
                                        } else {
                                            C340370DVz c340370DVz3 = C340370DVz.LIZ;
                                            C0CUZ c0cuz3 = C0CUZ.RESET_TAB;
                                            EnumC314460CUi enumC314460CUi3 = EnumC314460CUi.FAIL;
                                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - j;
                                            c340370DVz3.getClass();
                                            C340370DVz.LIZJ(c0cuz3, enumC314460CUi3, jElapsedRealtime3);
                                        }
                                    } else if (homeTabAbilityLIZ.dR("Shop")) {
                                        C1DFH c1dfh2 = C0PEM.LIZ;
                                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0CUD(homeTabAbilityLIZ, null), 3);
                                        if (!homeTabAbilityLIZ.dR("Shop")) {
                                            C340370DVz c340370DVz4 = C340370DVz.LIZ;
                                            C0CUZ c0cuz4 = C0CUZ.RESET_TAB;
                                            EnumC314460CUi enumC314460CUi4 = EnumC314460CUi.SUCCESS;
                                            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - j;
                                            c340370DVz4.getClass();
                                            C340370DVz.LIZJ(c0cuz4, enumC314460CUi4, jElapsedRealtime4);
                                        } else {
                                            C340370DVz c340370DVz5 = C340370DVz.LIZ;
                                            C0CUZ c0cuz5 = C0CUZ.RESET_TAB;
                                            EnumC314460CUi enumC314460CUi5 = EnumC314460CUi.FAIL;
                                            long jElapsedRealtime5 = SystemClock.elapsedRealtime() - j;
                                            c340370DVz5.getClass();
                                            C340370DVz.LIZJ(c0cuz5, enumC314460CUi5, jElapsedRealtime5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
