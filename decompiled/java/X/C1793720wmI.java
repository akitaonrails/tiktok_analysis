package X;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: X.0wmI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793720wmI {
    public final View LIZ;
    public int LIZIZ;
    public InterfaceC1793740wmK LIZJ;
    public final ViewTreeObserverOnGlobalLayoutListenerC1864770yct LIZLLL;

    public C1793720wmI(View view) {
        this.LIZ = view;
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        this.LIZIZ = rect.height();
        this.LIZLLL = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(this, 5);
    }
}
