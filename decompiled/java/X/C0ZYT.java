package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.IIMCustomizeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZYT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.IMCustomizeService$scheduleBindOnIo$1", f = "IMCustomizeService.kt", l = {}, m = "invokeSuspend")
public final class C0ZYT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0ZYT(InterfaceC1364105Vn<? super C0ZYT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZYT(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCustomizeService@30ed.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C0ZYS.LIZJ != null) {
                Unit unit = Unit.LIZ;
                C0ZYS.LJ = false;
                C1C7U.LIZIZ("IMCustomizeService@30ed.scheduleBindOnIo$1");
                return unit;
            }
            C0ZYS.LIZIZ.getClass();
            IIMCustomizeService iIMCustomizeServiceLIZJ = C0ZYS.LIZJ();
            IIMCustomizeService.LIZ.getClass();
            if (iIMCustomizeServiceLIZJ != C0ZYV.LIZ()) {
                C0ZYS.LIZJ = iIMCustomizeServiceLIZJ;
            }
            C0ZYS.LJ = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMCustomizeService@30ed.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0ZYS.LJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0ZYT(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
