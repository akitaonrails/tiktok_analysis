package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.wallet.service.payment.impl.PayManagerV2$tryQueryOngoingPurchases$1", f = "PayManagerV2.kt", l = {52}, m = "invokeSuspend")
public final class C1789390wfJ extends C09AX implements Function1<InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1157380gDw>>>, Object> {
    public int LL;

    public C1789390wfJ(InterfaceC1364105Vn<? super C1789390wfJ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1789390wfJ(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super AbstractC1157840gEg<List<? extends C1157380gDw>>> interfaceC1364105Vn) {
        return new C1789390wfJ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PayManagerV2@3a4b.tryQueryOngoingPurchases$1");
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
            C1789140weu c1789140weuLIZIZ = InterfaceC1789300wfA.LIZ.LIZIZ();
            EnumC1780720wRK enumC1780720wRK = EnumC1780720wRK.INAPP;
            this.LL = 1;
            obj = c1789140weuLIZIZ.LJIIIIZZ(enumC1780720wRK, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PayManagerV2@3a4b.tryQueryOngoingPurchases$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PayManagerV2@3a4b.tryQueryOngoingPurchases$1");
        return obj;
    }
}
