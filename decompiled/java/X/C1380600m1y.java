package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0m1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380600m1y implements InterfaceC1380590m1x<C1380540m1s> {
    public final InterfaceC1380590m1x<C1380540m1s> LIZ;
    public Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o> LIZIZ = new AwS600S0100000_21(this, 395);
    public final AwS565S0100000_21 LIZJ = new AwS565S0100000_21(this, 1607);
    public final AwS600S0100000_21 LIZLLL = new AwS600S0100000_21(this, 396);
    public final AwS600S0100000_21 LJ = new AwS600S0100000_21(this, 397);

    @Override // X.InterfaceC1380590m1x
    public final Function1<InterfaceC1380500m1o, InterfaceC1380500m1o> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1380590m1x
    public final Function1<Function2<? super C1380540m1s, ? super InterfaceC1380500m1o, ? extends C1380540m1s>, Unit> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1380590m1x
    public final Function1<Function0<Unit>, Function0<Unit>> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1380590m1x
    public final Function0<C1380540m1s> LJ() {
        return this.LIZJ;
    }

    public C1380600m1y(InterfaceC1380590m1x<C1380540m1s> interfaceC1380590m1x) {
        this.LIZ = interfaceC1380590m1x;
    }

    @Override // X.InterfaceC1380590m1x
    public final void LIZIZ(Function1<? super InterfaceC1380500m1o, ? extends InterfaceC1380500m1o> function1) {
        this.LIZIZ = function1;
    }
}
