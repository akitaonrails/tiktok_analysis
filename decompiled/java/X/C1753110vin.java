package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0vin, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753110vin extends FrameLayout {
    public InterfaceC1753120vio LL;
    public ViewPropertyAnimator LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;

    public final void LIZ() {
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().translationX(-(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZ)) / 2.0f)).setStartDelay(10000L).setDuration(200L).withEndAction(new ARunnableS126S0100000_26(this, 82));
        this.LLILLJJLI = viewPropertyAnimatorWithEndAction;
        if (viewPropertyAnimatorWithEndAction != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.LLILLJJLI;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.LLILLJJLI = null;
    }

    public C1753110vin(Context context) {
        super(context, null, 0);
        this.LLILZ = 48;
        this.LLILZIL = 48;
    }

    public final void setOnAiAssistanceEntranceViewClickListener(InterfaceC1753120vio interfaceC1753120vio) {
        this.LL = interfaceC1753120vio;
    }
}
