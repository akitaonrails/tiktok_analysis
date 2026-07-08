package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.BootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IBootLogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfTracker$onDeeplinkToMall$1", f = "MallLandingPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C1703990uRZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MallLandingPerfTracker LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1703990uRZ(MallLandingPerfTracker mallLandingPerfTracker, String str, boolean z, long j, InterfaceC1364105Vn<? super C1703990uRZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mallLandingPerfTracker;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1703990uRZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin;
        long jColdBootBegin;
        boolean z;
        String name;
        String strLIZ;
        boolean inMallTab;
        boolean zLJIJ;
        String strLIZIZ;
        C1C7U.LIZ("MallLandingPerfTracker@76af.onDeeplinkToMall$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MallLandingPerfTracker mallLandingPerfTracker = this.LL;
        String str = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        long j = this.LLILZ;
        try {
            mallLandingPerfTracker.getClass();
            boolean z3 = true;
            if (MallLandingPerfTracker.LJII(str, true, false)) {
                if (!z2) {
                    jColdBootBegin = j;
                } else {
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = BootLogDependencyService.createIBootLogDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IBootLogDependencyService.class.getName();
                        if (anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBootLogDependencyService.class);
                    }
                    jColdBootBegin = ((IBootLogDependencyService) anonymousClass0317CreateIBootLogDependencyServicebyMonsterPlugin).coldBootBegin();
                }
                if (str == null || (strLIZ = C1704080uRi.LIZ(str)) == null) {
                    strLIZ = "deeplink";
                }
                C1704020uRc c1704020uRc = C1704020uRc.LIZ;
                if (jColdBootBegin != -1) {
                    c1704020uRc.LIZ();
                }
                C1704020uRc.LIZJ = jColdBootBegin;
                IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
                if (iEcUgBackButtonServiceOfficial != null) {
                    inMallTab = iEcUgBackButtonServiceOfficial.getInMallTab();
                } else {
                    inMallTab = false;
                }
                C1704020uRc.LJIIJ = inMallTab;
                IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService != null) {
                    zLJIJ = iECommerceMallService.LJIJ();
                } else {
                    zLJIJ = true;
                }
                C1704020uRc.LJIIJJI = zLJIJ;
                if (!z2) {
                    z3 = false;
                }
                C1704020uRc.LJIIL = z3;
                C1704020uRc.LJIILIIL = strLIZ;
                if (str == null || (strLIZIZ = C1704080uRi.LIZIZ(str)) == null) {
                    strLIZIZ = "";
                }
                C1704020uRc.LJIILJJIL = strLIZIZ;
                mallLandingPerfTracker.LJIIIZ(EnumC1704040uRe.USER_CLICK_ENTRY, strLIZ, null);
                C1704020uRc.LIZLLL = j;
                mallLandingPerfTracker.LJIIIZ(EnumC1704040uRe.JUMP_TO_MALL, strLIZ, null);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MallLandingPerfTracker@76af.onDeeplinkToMall$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
