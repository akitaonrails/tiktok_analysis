package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C429301lj {
    public View LIZ;
    public volatile Function2<? super Boolean, ? super Integer, Unit> LIZIZ;
    public int LIZJ;
    public final Rect LIZLLL = new Rect();
    public final C01GW LJ = C452501pT.LIZIZ(new C5182020e(this, 275));

    public final void LIZ() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LIZ;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LJ.getValue();
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        this.LIZJ = 0;
        this.LIZIZ = null;
        this.LIZ = null;
    }

    public C429301lj(View view) {
        this.LIZ = view;
    }
}
