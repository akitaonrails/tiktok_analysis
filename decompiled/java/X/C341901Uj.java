package X;

import com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampSwipeUpComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampSwipeUpComponent$onViewCreatedInner$5", f = "NujRevampSwipeUpComponent.kt", l = {195}, m = "invokeSuspend")
public final class C341901Uj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NujRevampSwipeUpComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C341901Uj(NujRevampSwipeUpComponent nujRevampSwipeUpComponent, InterfaceC1364105Vn<? super C341901Uj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nujRevampSwipeUpComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C341901Uj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NujRevampSwipeUpComponent@9674.onViewCreatedInner$5");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("NujRevampSwipeUpComponent@9674.onViewCreatedInner$5");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLJJL = true;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NujRevampSwipeUpComponent@9674.onViewCreatedInner$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
