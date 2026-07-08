package X;

import android.view.View;

/* JADX INFO: renamed from: X.0d82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1038400d82 implements InterfaceC1399350mWD, InterfaceC1008670cM5 {
    public final View LL;

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    public AbstractC1038400d82(View view) {
        this.LL = view;
    }

    @Override // X.InterfaceC1008670cM5
    public final void enable(boolean z) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        InterfaceC655270Pn3 interfaceC655270Pn32;
        if (z) {
            Object objLIZIZ = C487580JAe.LIZIZ(this.LL);
            if ((objLIZIZ instanceof InterfaceC655270Pn3) && (interfaceC655270Pn32 = (InterfaceC655270Pn3) objLIZIZ) != null) {
                interfaceC655270Pn32.registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        Object objLIZIZ2 = C487580JAe.LIZIZ(this.LL);
        if (!(objLIZIZ2 instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) objLIZIZ2) == null) {
            return;
        }
        interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this);
    }
}
