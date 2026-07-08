package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0vgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ViewTreeObserverOnPreDrawListenerC1751500vgC implements ViewTreeObserver.OnPreDrawListener {
    public final View LL;
    public boolean LLILLJJLI;
    public boolean LLILZIL;
    public boolean LLILLL = true;
    public boolean LLILZ = true;
    public final Rect LLILZLL = new Rect();

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.LL.getLocalVisibleRect(this.LLILZLL) && this.LL.isShown() && this.LLILLJJLI && this.LLILLL && this.LLILZ && !this.LLILZIL) {
            this.LLILZIL = true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1751500vgC(C1751490vgB c1751490vgB) {
        this.LL = c1751490vgB;
    }
}
