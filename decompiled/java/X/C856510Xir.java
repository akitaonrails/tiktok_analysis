package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856510Xir implements InterfaceC20507515Mj {
    public final Function1<InterfaceC20507515Mj, Boolean> LIZ;
    public final Function0<Unit> LIZIZ;
    public C856510Xir LIZJ;

    @Override // X.InterfaceC20507515Mj
    public final void LIZ() {
    }

    @Override // X.InterfaceC20507515Mj
    public final void getIntercepted() {
    }

    @Override // X.InterfaceC20507515Mj
    public final void LIZIZ() {
        Function0<Unit> function0 = this.LIZIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.InterfaceC20507515Mj
    public final void LIZJ() {
        C856510Xir c856510Xir = this.LIZJ;
        if (c856510Xir != null) {
            c856510Xir.LIZLLL();
        }
    }

    public final void LIZLLL() {
        C856510Xir c856510Xir;
        if (this.LIZ.invoke(this).booleanValue() || (c856510Xir = this.LIZJ) == null) {
            return;
        }
        c856510Xir.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C856510Xir(Function1<? super InterfaceC20507515Mj, Boolean> function1, Function0<Unit> function0) {
        this.LIZ = function1;
        this.LIZIZ = function0;
    }
}
