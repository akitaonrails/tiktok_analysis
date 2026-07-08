package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05TQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {296}, m = "invokeSuspend")
public final class C05TQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1683030ttl LLILLJJLI;
    public final /* synthetic */ InterfaceC1677030tk5<Float> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TQ(C1683030ttl c1683030ttl, InterfaceC1677030tk5<Float> interfaceC1677030tk5, InterfaceC1364105Vn<? super C05TQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1683030ttl;
        this.LLILLL = interfaceC1677030tk5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI.LIZJ;
            Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
            InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILLL;
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, interfaceC1677030tk5, null, null, this, 12) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
