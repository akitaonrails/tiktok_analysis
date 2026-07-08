package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01OU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.clientai.IncentiveMobCompensationManager$tryCompensationEventData$1", f = "IncentiveMobCompensationManager.kt", l = {43}, m = "invokeSuspend")
public final class C01OU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C01OU(InterfaceC1364105Vn<? super C01OU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01OU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IncentiveMobCompensationManager@6ed3.tryCompensationEventData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long jIntValue = ((long) ((Number) C100200Zk.LIZ.getValue()).intValue()) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("IncentiveMobCompensationManager@6ed3.tryCompensationEventData$1");
                return objLJFF;
            }
        }
        C01U6.LIZIZ(AnonymousClass0206.get$arr$(10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentiveMobCompensationManager@6ed3.tryCompensationEventData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01OU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
