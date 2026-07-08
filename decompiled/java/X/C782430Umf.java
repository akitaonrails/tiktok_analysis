package X;

import Y.ATListenerS446S0100000_12;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Umf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782430Umf extends AbstractC1120020fFg {
    public final InterfaceC782440Umg LL;
    public final int LLILLJJLI;
    public final Function1<MotionEvent, Boolean> LLILLL;
    public final ATListenerS446S0100000_12 LLILZ = new ATListenerS446S0100000_12(this, 0);

    @Override // X.AbstractC1120020fFg
    public final void LIZJ() {
        InterfaceC782440Umg interfaceC782440Umg = this.LL;
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.v(this.LLILZ);
        }
    }

    @Override // X.AbstractC1120020fFg
    public final void LIZLLL() {
        InterfaceC782440Umg interfaceC782440Umg = this.LL;
        if (interfaceC782440Umg != null) {
            interfaceC782440Umg.LL(this.LLILZ);
        }
    }

    @Override // X.AbstractC1120020fFg
    public final int LIZIZ() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C782430Umf(InterfaceC782440Umg interfaceC782440Umg, int i, Function1<? super MotionEvent, Boolean> function1) {
        this.LL = interfaceC782440Umg;
        this.LLILLJJLI = i;
        this.LLILLL = function1;
    }

    @Override // X.AbstractC1120020fFg
    public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        Boolean boolInvoke = this.LLILLL.invoke(motionEvent);
        if (boolInvoke != null) {
            return boolInvoke.booleanValue();
        }
        return false;
    }
}
