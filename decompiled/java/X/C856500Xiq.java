package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856500Xiq {
    public final Function0<Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public C856510Xir LIZJ;
    public C856510Xir LIZLLL;

    public final void LIZ(Function1 function1) {
        C856510Xir c856510Xir = new C856510Xir(function1, this.LIZIZ);
        if (this.LIZJ == null) {
            this.LIZJ = c856510Xir;
        }
        C856510Xir c856510Xir2 = this.LIZLLL;
        if (c856510Xir2 != null) {
            c856510Xir2.LIZJ = c856510Xir;
        }
        this.LIZLLL = c856510Xir;
    }

    public C856500Xiq(Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = function0;
        this.LIZIZ = function02;
    }
}
