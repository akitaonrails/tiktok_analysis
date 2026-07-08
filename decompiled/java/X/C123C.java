package X;

import android.graphics.PointF;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: X.123C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123C implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ AnonymousClass1238 LLILLL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C786410Ut5.C3(this.LLILLL.LJIIL.getViewTreeObserver(), new C12YW(this, 8));
        PointF pointFLJIILIIL = this.LLILLL.LJIIL.LJIILIIL(this.LL, this.LLILLJJLI);
        AnonymousClass1238 anonymousClass1238 = this.LLILLL;
        anonymousClass1238.LJ = pointFLJIILIIL.x;
        anonymousClass1238.LJFF = pointFLJIILIIL.y;
    }

    public C123C(AnonymousClass1238 anonymousClass1238, int i, int i2) {
        this.LLILLL = anonymousClass1238;
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
