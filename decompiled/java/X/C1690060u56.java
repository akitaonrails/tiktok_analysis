package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend")
public final class C1690060u56 extends C09AX implements Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1690050u55 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690060u56(C1690050u55 c1690050u55, int i, int i2, InterfaceC1364105Vn<? super C1690060u56> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1690050u55;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1690060u56(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1690050u55 c1690050u55 = this.LL;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        if (((C13FG) c1690050u55.LIZLLL.LIZ).LIZLLL() == i && ((C13FG) c1690050u55.LIZLLL.LIZIZ).LIZLLL() == i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LazyLayoutItemAnimator<C1690030u53> lazyLayoutItemAnimator = c1690050u55.LJIIL;
            lazyLayoutItemAnimator.LJ();
            lazyLayoutItemAnimator.LIZIZ = null;
            lazyLayoutItemAnimator.LIZJ = -1;
        }
        C1690360u5a c1690360u5a = c1690050u55.LIZLLL;
        c1690360u5a.getClass();
        if (i < 0.0f) {
            C1691080u6k.LIZ("Index should be non-negative");
        }
        ((C13FG) c1690360u5a.LIZ).LJIIJ(i);
        c1690360u5a.LJ.LJIIL(i);
        ((C13FG) c1690360u5a.LIZIZ).LJIIJ(i2);
        c1690360u5a.LIZLLL = null;
        InterfaceC1690550u5t interfaceC1690550u5t = c1690050u55.LJIIIZ;
        if (interfaceC1690550u5t != null) {
            interfaceC1690550u5t.LJIIL();
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1392705cj interfaceC1392705cj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1392705cj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
