package X;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: X.167I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C167I {
    public final View LIZ;
    public int LIZIZ;
    public C167L LIZJ;
    public final int LIZLLL;
    public final C16HO LJ;

    public C167I(C19EG c19eg) {
        View decorView;
        Window window;
        if (c19eg != null && (window = c19eg.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZ = decorView;
        this.LIZLLL = 200;
        this.LJ = new C16HO(this, c19eg, 0);
    }
}
