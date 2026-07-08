package X;

import android.view.ViewTreeObserver;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.122E, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C122E implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C12UW LLILLL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C786410Ut5.C3(this.LLILLL.LLJZIJLIL.getViewTreeObserver(), this);
        this.LLILLL.LLL.setBackgroundResource(R.color.z7);
        C786410Ut5.LJLLLLLL(0, this.LLILLL.LLL);
        C423240Gig c423240Gig = this.LLILLL.LLJZIJLIL;
        int visibility = c423240Gig.getVisibility();
        c423240Gig.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c423240Gig);
        C12UW c12uw = this.LLILLL;
        C423240Gig c423240Gig2 = c12uw.LLJZIJLIL;
        float audioStartTranslationX = c12uw.getAudioStartTranslationX();
        C12UW c12uw2 = this.LLILLL;
        int i = this.LL;
        float f = i;
        float f2 = this.LLILLJJLI;
        C786410Ut5.x3(c423240Gig2.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC425670Gmb(c423240Gig2, i, f >= f2 ? f2 / c12uw2.LLJLL.LJ : f / c12uw2.LLJLL.LJ, audioStartTranslationX));
    }

    public C122E(C12UW c12uw, int i, int i2) {
        this.LLILLL = c12uw;
        this.LL = i;
        this.LLILLJJLI = i2;
    }
}
