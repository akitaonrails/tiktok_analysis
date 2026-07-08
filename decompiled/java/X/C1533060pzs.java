package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533060pzs implements InterfaceC1532560pz4 {
    public final Function1<C1532710pzJ, Boolean> LIZIZ;
    public final Function1<C1532310pyf, Unit> LIZJ;
    public final Function1<C1532710pzJ, Unit> LIZLLL;

    @Override // X.InterfaceC1532560pz4
    public final void LIZIZ(C1532310pyf c1532310pyf) {
        if (this.LIZIZ.invoke(c1532310pyf.LIZ).booleanValue()) {
            this.LIZJ.invoke(c1532310pyf);
        }
    }

    @Override // X.InterfaceC1532560pz4
    public final void LIZLLL(C1532710pzJ c1532710pzJ) {
        Function1<C1532710pzJ, Unit> function1;
        if (this.LIZIZ.invoke(c1532710pzJ).booleanValue() && (function1 = this.LIZLLL) != null) {
            function1.invoke(c1532710pzJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1533060pzs(Function1<? super C1532710pzJ, Boolean> function1, Function1<? super C1532310pyf, Unit> function12, Function1<? super C1532710pzJ, Unit> function13) {
        this.LIZIZ = function1;
        this.LIZJ = function12;
        this.LIZLLL = function13;
    }
}
