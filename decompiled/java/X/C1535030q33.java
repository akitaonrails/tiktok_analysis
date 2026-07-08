package X;

import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535030q33 implements InterfaceC1534950q2v, InterfaceC1535230q3N {
    public final Function1<C1533490q0Z, Boolean> LIZIZ;
    public final Function1<C1533790q13, Unit> LIZJ;
    public final Function1<C1533490q0Z, Unit> LIZLLL;

    @Override // X.InterfaceC1535230q3N
    public final void LIZ() {
    }

    @Override // X.InterfaceC1534950q2v
    public final void LJ(RequestParams requestParams) {
    }

    @Override // X.InterfaceC1535230q3N
    public final void LIZJ(C1533490q0Z c1533490q0Z) {
        Function1<C1533490q0Z, Unit> function1;
        if (this.LIZIZ.invoke(c1533490q0Z).booleanValue() && (function1 = this.LIZLLL) != null) {
            function1.invoke(c1533490q0Z);
        }
    }

    @Override // X.InterfaceC1534950q2v
    public final void LJFF(C1533790q13 c1533790q13) {
        if (this.LIZIZ.invoke(c1533790q13.LIZ).booleanValue()) {
            this.LIZJ.invoke(c1533790q13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1535030q33(Function1<? super C1533490q0Z, Boolean> function1, Function1<? super C1533790q13, Unit> function12, Function1<? super C1533490q0Z, Unit> function13) {
        this.LIZIZ = function1;
        this.LIZJ = function12;
        this.LIZLLL = function13;
    }
}
