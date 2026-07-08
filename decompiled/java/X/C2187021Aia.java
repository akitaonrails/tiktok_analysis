package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Aia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.GyroscopeRecord$record$1", f = "GyroscopeRecord.kt", l = {}, m = "invokeSuspend")
public final class C2187021Aia extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2187041Aic LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187021Aia(C2187041Aic c2187041Aic, InterfaceC1364105Vn<? super C2187021Aia> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2187041Aic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2187021Aia(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GyroscopeRecord@82c5.record$1");
        boolean zLJI = MethodIDManager.LJI(196941);
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2187041Aic c2187041Aic = this.LL;
            C1300690jx5.LJ(c2187041Aic.LJI, c2187041Aic.LJIIJJI, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic2 = this.LL;
            C1300690jx5.LJ(c2187041Aic2.LJI, c2187041Aic2.LJIIL, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic3 = this.LL;
            C1300690jx5.LJ(c2187041Aic3.LJI, c2187041Aic3.LJIIJ, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic4 = this.LL;
            C1300690jx5.LIZJ(c2187041Aic4.LJI, c2187041Aic4.LJIIJJI, c2187041Aic4.LJIIIIZZ, 3, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic5 = this.LL;
            C1300690jx5.LIZJ(c2187041Aic5.LJI, c2187041Aic5.LJIIL, c2187041Aic5.LJIIIZ, 3, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic6 = this.LL;
            C1300690jx5.LIZJ(c2187041Aic6.LJI, c2187041Aic6.LJIIJ, c2187041Aic6.LJII, 3, C2187081Aig.LIZ());
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        C1C7U.LIZIZ("GyroscopeRecord@82c5.record$1");
        return unit;
    }
}
