package X;

import android.view.KeyEvent;
import java.util.Stack;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12PV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PV {
    public final InterfaceC524950KiL LIZ;
    public final Stack<Function0<Unit>> LIZIZ = new Stack<>();
    public final C12PW LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0EJn, X.12PW] */
    public C12PV(InterfaceC524950KiL interfaceC524950KiL) {
        this.LIZ = interfaceC524950KiL;
        ?? r0 = new InterfaceC362610EJn() { // from class: X.12PW
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i == 4 && !this.LL.LIZIZ.isEmpty()) {
                    this.LL.LIZIZ.pop().invoke();
                    return true;
                }
                return false;
            }
        };
        this.LIZJ = r0;
        interfaceC524950KiL.kF(r0);
    }
}
