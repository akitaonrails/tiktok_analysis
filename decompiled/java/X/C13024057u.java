package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.057u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$initEcUgPitaya$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C13024057u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C13024057u(InterfaceC1364105Vn<? super C13024057u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13024057u(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("EcUgPitayaManager@a4f0.initEcUgPitaya$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IECommerceMallDependencyService.class.getName();
            if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
        }
        if (Intrinsics.LJFF(((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin).shouldShowMall2TabOrTopTab(), true)) {
            EcUgPitayaManager ecUgPitayaManager = EcUgPitayaManager.INSTANCE;
            if (ecUgPitayaManager.pitayaEnable() && !EcUgPitayaManager.msgHandlerRegistered) {
                ecUgPitayaManager.registerPitayaMsgHandler();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.initEcUgPitaya$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C13024057u(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
