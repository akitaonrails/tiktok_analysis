package X;

import android.os.Looper;
import android.view.View;

/* JADX INFO: renamed from: X.0Oh9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626130Oh9 extends C11NZ<Object> {
    public final View LL;

    public C626130Oh9(View view) {
        this.LL = view;
    }

    @Override // X.C11NZ
    public final void LJJZZIII(InterfaceC626120Oh8<? super Object> interfaceC626120Oh8) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected to be called on the main thread but was ");
            sbLIZ.append(C786410Ut5.u3().getName());
            interfaceC626120Oh8.onError(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
            return;
        }
        ViewOnClickListenerC626140OhA viewOnClickListenerC626140OhA = new ViewOnClickListenerC626140OhA(this.LL, interfaceC626120Oh8);
        interfaceC626120Oh8.onSubscribe(viewOnClickListenerC626140OhA);
        C786410Ut5.I7(viewOnClickListenerC626140OhA, this.LL);
    }
}
