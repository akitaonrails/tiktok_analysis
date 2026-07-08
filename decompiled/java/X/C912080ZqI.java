package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.service.IIMMediaService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZqI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.IMMediaService$scheduleBindOnIo$1", f = "IMMediaService.kt", l = {}, m = "invokeSuspend")
public final class C912080ZqI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C912080ZqI(InterfaceC1364105Vn<? super C912080ZqI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912080ZqI(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMediaService@7112.scheduleBindOnIo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (C912070ZqH.LIZJ != null) {
                Unit unit = Unit.LIZ;
                C912070ZqH.LJ = false;
                C1C7U.LIZIZ("IMMediaService@7112.scheduleBindOnIo$1");
                return unit;
            }
            C912070ZqH.LIZIZ.getClass();
            IIMMediaService iIMMediaServiceLIZ = C912070ZqH.LIZ();
            IIMMediaService.LIZ.getClass();
            if (iIMMediaServiceLIZ != C912100ZqK.LIZ()) {
                C912070ZqH.LIZJ = iIMMediaServiceLIZ;
            }
            C912070ZqH.LJ = false;
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMMediaService@7112.scheduleBindOnIo$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C912070ZqH.LJ = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C912080ZqI(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
