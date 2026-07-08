package X;

import android.graphics.Rect;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.1CwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246401CwA {
    public final View LIZ;
    public int LIZIZ;
    public InterfaceC2246541CwO LIZJ;
    public final C1D16 LIZLLL;

    public C2246401CwA(C19EG c19eg) {
        View decorView;
        Window window = c19eg.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZ = decorView;
        Rect rect = new Rect();
        if (decorView != null) {
            decorView.getWindowVisibleDisplayFrame(rect);
        }
        this.LIZIZ = rect.height();
        this.LIZLLL = new C1D16(this, 1);
    }
}
