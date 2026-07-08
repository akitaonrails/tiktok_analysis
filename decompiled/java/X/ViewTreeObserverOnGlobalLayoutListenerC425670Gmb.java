package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.0Gmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC425670Gmb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C423240Gig LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C786410Ut5.C3(this.LL.getViewTreeObserver(), this);
        if (this.LL.getMeasuredWidth() <= 0) {
            return;
        }
        this.LL.setDuraion(this.LLILLJJLI);
        if (C11VU.LJI(this.LL)) {
            C423240Gig c423240Gig = this.LL;
            c423240Gig.LLILZ.right = c423240Gig.getMeasuredWidth();
            this.LL.LLILZ.left = (int) (r0.getMeasuredWidth() - this.LLILLL);
        } else {
            Rect rect = this.LL.LLILZ;
            rect.left = 0;
            rect.right = (int) this.LLILLL;
        }
        C423240Gig c423240Gig2 = this.LL;
        c423240Gig2.LLIZ = (int) this.LLILZ;
        c423240Gig2.invalidate();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC425670Gmb(C423240Gig c423240Gig, long j, float f, float f2) {
        this.LL = c423240Gig;
        this.LLILLJJLI = j;
        this.LLILLL = f;
        this.LLILZ = f2;
    }
}
