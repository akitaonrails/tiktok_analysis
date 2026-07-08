package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1Aib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.GyroscopeRecord$reset$1", f = "GyroscopeRecord.kt", l = {}, m = "invokeSuspend")
public final class C2187031Aib extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2187041Aic LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2187031Aib(C2187041Aic c2187041Aic, InterfaceC1364105Vn<? super C2187031Aib> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2187041Aic;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2187031Aib(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GyroscopeRecord@82c5.reset$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C2187041Aic c2187041Aic = this.LL;
            C1300690jx5.LJ(c2187041Aic.LJI, c2187041Aic.LJIIJJI, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic2 = this.LL;
            C1300690jx5.LJ(c2187041Aic2.LJI, c2187041Aic2.LJIIL, C2187081Aig.LIZ());
            C2187041Aic c2187041Aic3 = this.LL;
            C1300690jx5.LJ(c2187041Aic3.LJI, c2187041Aic3.LJIIJ, C2187081Aig.LIZ());
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GyroscopeRecord@82c5.reset$1");
        return unit;
    }
}
