package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {481}, m = "invokeSuspend")
public final class C1690110u5B extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1690080u58 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690110u5B(C1690080u58 c1690080u58, int i, int i2, InterfaceC1364105Vn<? super C1690110u5B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1690080u58;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1690110u5B c1690110u5B = new C1690110u5B(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1690110u5B.LLILLJJLI = obj;
        return c1690110u5B;
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
            InterfaceC1392705cj interfaceC1392705cj = (InterfaceC1392705cj) this.LLILLJJLI;
            C1690080u58 c1690080u58 = this.LLILLL;
            C1567740qto c1567740qto = new C1567740qto(interfaceC1392705cj, c1690080u58);
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            InterfaceC1690500u5o interfaceC1690500u5o = ((C1690070u57) ((C13FE) c1690080u58.LJ).getValue()).LJIIIIZZ;
            this.LL = 1;
            if (C20090513jD.LIZIZ(c1567740qto, i2, i3, 100, interfaceC1690500u5o, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
