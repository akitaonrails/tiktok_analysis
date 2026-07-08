package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0anR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948750anR {
    public final View LIZ;
    public int LIZIZ;
    public InterfaceC948760anS LIZJ;
    public final ViewTreeObserverOnGlobalLayoutListenerC987060bnE LIZLLL;

    public final void LIZ() {
        View view = this.LIZ;
        if (view != null && this.LIZLLL != null) {
            C786410Ut5.C3(view.getViewTreeObserver(), this.LIZLLL);
        }
        this.LIZJ = null;
    }

    public C948750anR(View view) {
        this.LIZ = view;
        Rect rect = new Rect();
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        this.LIZIZ = rect.height();
        this.LIZLLL = new ViewTreeObserverOnGlobalLayoutListenerC987060bnE(view, this, 1);
    }

    public final void LIZIZ(InterfaceC948760anS interfaceC948760anS) {
        this.LIZJ = interfaceC948760anS;
        View view = this.LIZ;
        if (view != null && this.LIZLLL != null) {
            C786410Ut5.x3(view.getViewTreeObserver(), this.LIZLLL);
        }
    }
}
