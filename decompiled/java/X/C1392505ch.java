package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.lazy.LazyListState$scrollToItem$2", f = "LazyListState.kt", l = {}, m = "invokeSuspend")
public final class C1392505ch extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392505ch(C1690080u58 c1690080u58, int i, int i2, InterfaceC1364105Vn<? super C1392505ch> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1690080u58;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392505ch(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIJJI(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
