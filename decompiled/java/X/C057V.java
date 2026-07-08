package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.pitaya.PitayaDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.pitaya.IPitayaDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.057V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$tryInitPitayaSdk$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C057V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C057V(InterfaceC1364105Vn<? super C057V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C057V(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2;
        boolean z2;
        boolean z3;
        String name;
        C1C7U.LIZ("EcUgPitayaManager@a4f0.tryInitPitayaSdk$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2 = PitayaDependencyService.createIPitayaDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name4 = IPitayaDependencyService.class.getName();
                if (anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2 != null) {
                    name2 = anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPitayaDependencyService.class);
            }
            ((IPitayaDependencyService) anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin2).initPitaya("EcUgPitayaManager");
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin = PitayaDependencyService.createIPitayaDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name5 = IPitayaDependencyService.class.getName();
                    if (anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin != null) {
                        name2 = anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name5, name2, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPitayaDependencyService.class);
                }
                ((IPitayaDependencyService) anonymousClass0317CreateIPitayaDependencyServicebyMonsterPlugin).initPitaya("EcUgPitayaManager");
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
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.tryInitPitayaSdk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C057V(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
