package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Ril, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C703570Ril<T> implements InterfaceC1449905lx<T> {
    public final InterfaceC1449905lx<T> LIZ;
    public Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> LIZIZ = new AwS590S0100000_11((C703570Ril) this, 1);
    public final AwS555S0100000_11 LIZJ = new AwS555S0100000_11(this, 2);
    public final AwS590S0100000_11 LIZLLL = new AwS590S0100000_11((C703570Ril) this, 2);
    public final AwS625S0100000_11 LJ = new AwS625S0100000_11(this, 0);

    @Override // X.InterfaceC1449905lx
    public final T getState() {
        return (T) ((AwS555S0100000_11) LJ()).invoke();
    }

    @Override // X.InterfaceC1449905lx
    public final Function1<InterfaceC1445905lJ, InterfaceC1445905lJ> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1449905lx
    public final Function1<Function2<? super T, ? super InterfaceC1445905lJ, ? extends T>, Unit> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1449905lx
    public final Function2<Boolean, Function1<? super T, Unit>, Function0<Unit>> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC1449905lx
    public final Function0<T> LJ() {
        return this.LIZJ;
    }

    public C703570Ril(InterfaceC1449905lx<T> interfaceC1449905lx) {
        this.LIZ = interfaceC1449905lx;
    }

    @Override // X.InterfaceC1449905lx
    public final void LIZIZ(Function1<? super InterfaceC1445905lJ, ? extends InterfaceC1445905lJ> function1) {
        this.LIZIZ = function1;
    }
}
