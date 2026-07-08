package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.creative.common.api.navigation.IIMCreativeCameraService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.common.api.navigation.IMCreativeCameraService$scheduleBindOnIo$1", f = "IMCreativeCameraService.kt", l = {}, m = "invokeSuspend")
public final class C1702540uPE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1702540uPE(InterfaceC1364105Vn<? super C1702540uPE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702540uPE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCreativeCameraService@4b8c.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C1702560uPG.LIZJ != null) {
                Unit unit = Unit.LIZ;
                C1702560uPG.LIZLLL = false;
                C1C7U.LIZIZ("IMCreativeCameraService@4b8c.scheduleBindOnIo$1");
                return unit;
            }
            C1702560uPG.LIZ.getClass();
            IIMCreativeCameraService iIMCreativeCameraServiceLIZIZ = C1702560uPG.LIZIZ();
            if (iIMCreativeCameraServiceLIZIZ != C1702560uPG.LIZJ()) {
                C1702560uPG.LIZJ = iIMCreativeCameraServiceLIZIZ;
            }
            C1702560uPG.LIZLLL = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMCreativeCameraService@4b8c.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1702560uPG.LIZLLL = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1702540uPE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
