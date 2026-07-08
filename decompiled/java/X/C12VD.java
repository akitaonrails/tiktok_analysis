package X;

import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.12VD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VD implements C12VB {
    public InterfaceC1609810rzf LIZ;
    public Function0<? extends Typeface> LIZIZ;
    public Function1<? super C12V9, Unit> LIZJ;
    public Function1<? super C12VB, Unit> LIZLLL;

    public final void LJI() {
        if (this.LIZLLL != null) {
            synchronized (this) {
                try {
                    Function1<? super C12VB, Unit> function1 = this.LIZLLL;
                    if (function1 != null) {
                        function1.invoke(this);
                    }
                    this.LIZLLL = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C12VB
    public final Function0<Typeface> LIZIZ() {
        LJI();
        return this.LIZIZ;
    }

    @Override // X.C12VB
    public final Function1<C12V9, Unit> LIZJ() {
        LJI();
        return this.LIZJ;
    }

    @Override // X.C12VB
    public final InterfaceC1609810rzf LJFF() {
        LJI();
        return this.LIZ;
    }

    @Override // X.C12VB
    public final void LIZ(C680800Qn8 c680800Qn8) {
        this.LIZ = c680800Qn8;
    }

    @Override // X.C12VB
    public final void LIZLLL(C12V8 c12v8) {
        this.LIZJ = c12v8;
    }

    @Override // X.C12VB
    public final void LJ(C12VJ c12vj) {
        this.LIZIZ = c12vj;
    }
}
