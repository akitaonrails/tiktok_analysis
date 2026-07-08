package X;

import android.view.View;

/* JADX INFO: renamed from: X.0riF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599010riF implements InterfaceC21676519sR {
    public boolean LL;
    public final /* synthetic */ C1598650rhf LLILLJJLI;

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
    }

    public C1599010riF(C1598650rhf c1598650rhf) {
        this.LLILLJJLI = c1598650rhf;
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        if (this.LL) {
            return;
        }
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1620800sHO(view, this, this.LLILLJJLI, 0));
    }
}
