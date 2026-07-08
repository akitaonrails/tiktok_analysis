package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rit, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703650Rit<T> implements InterfaceC703670Riv<T> {
    public final InterfaceC703670Riv<T> LIZ;
    public Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> LIZIZ = new C703630Rir(this);
    public final C703680Riw LIZJ = new C703680Riw(this);
    public final C703660Riu LIZLLL = new C703660Riu(this);
    public final C703640Ris LJ = new C703640Ris(this);

    @Override // X.InterfaceC703670Riv
    public final T getState() {
        return (T) ((C703680Riw) LJ()).invoke();
    }

    @Override // X.InterfaceC703670Riv
    public final Function1<InterfaceC700750ReD, InterfaceC700750ReD> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC703670Riv
    public final Function1<Function2<? super T, ? super InterfaceC700750ReD, ? extends T>, Unit> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC703670Riv
    public final Function1<Function0<Unit>, Function0<Unit>> LIZLLL() {
        return this.LJ;
    }

    @Override // X.InterfaceC703670Riv
    public final Function0<T> LJ() {
        return this.LIZJ;
    }

    public C703650Rit(InterfaceC703670Riv<T> interfaceC703670Riv) {
        this.LIZ = interfaceC703670Riv;
    }

    @Override // X.InterfaceC703670Riv
    public final void LIZIZ(Function1<? super InterfaceC700750ReD, ? extends InterfaceC700750ReD> function1) {
        this.LIZIZ = function1;
    }
}
