package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YZ<T> extends C13Y7 implements InterfaceC20029213Yk<T> {
    public final Function0<T> LL;
    public final C13FF<T> LLILLJJLI;
    public C20028213Ya<T> LLILLL = new C20028213Ya<>(C13YE.LJIIIZ().LJI());

    public final String toString() {
        C13YE.LJII(this.LLILLL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DerivedState(value=");
        C20028213Ya c20028213Ya = (C20028213Ya) C13YE.LJII(this.LLILLL);
        sbLIZ.append(c20028213Ya.LIZLLL(this, C13YE.LJIIIZ()) ? String.valueOf(c20028213Ya.LJFF) : "<Not calculated>");
        sbLIZ.append(")@");
        sbLIZ.append(hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC20029213Yk
    public final C20028213Ya LIZJ() {
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        return LJIJI((C20028213Ya) C13YE.LJIIIIZZ(this.LLILLL, c13ygLJIIIZ), c13ygLJIIIZ, false, this.LL);
    }

    @Override // X.C05P1
    public final T getValue() {
        Function1<Object, Unit> function1LJ = C13YE.LJIIIZ().LJ();
        if (function1LJ != null) {
            function1LJ.invoke(this);
        }
        C13YG c13ygLJIIIZ = C13YE.LJIIIZ();
        return (T) LJIJI((C20028213Ya) C13YE.LJIIIIZZ(this.LLILLL, c13ygLJIIIZ), c13ygLJIIIZ, true, this.LL).LJFF;
    }

    @Override // X.InterfaceC20029213Yk
    public final C13FF<T> LJFF() {
        return this.LLILLJJLI;
    }

    @Override // X.C13YP
    public final AbstractC19977113Ej LJIIZILJ() {
        return this.LLILLL;
    }

    @Override // X.C13YP
    public final void LJIIL(AbstractC19977113Ej abstractC19977113Ej) {
        this.LLILLL = (C20028213Ya) abstractC19977113Ej;
    }

    public C13YZ(C13FF c13ff, Function0 function0) {
        this.LL = function0;
        this.LLILLJJLI = c13ff;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20028213Ya<T> LJIJI(X.C20028213Ya<T> r20, X.C13YG r21, boolean r22, kotlin.jvm.functions.Function0<? extends T> r23) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13YZ.LJIJI(X.13Ya, X.13YG, boolean, kotlin.jvm.functions.Function0):X.13Ya");
    }
}
