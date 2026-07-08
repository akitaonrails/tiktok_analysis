package X;

import Y.ARunnableS129S0100000_29;
import android.widget.ViewFlipper;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.10nB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19350710nB implements InterfaceC655250Pn1 {
    public final ViewFlipper LIZ;
    public boolean LIZIZ;

    @Override // X.InterfaceC655250Pn1
    public final void pause() {
        ViewFlipper viewFlipper = this.LIZ;
        viewFlipper.setInAnimation(null);
        viewFlipper.setOutAnimation(null);
        viewFlipper.setDisplayedChild(0);
        this.LIZ.stopFlipping();
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC655250Pn1
    public final void start() {
        if (this.LIZ.getChildCount() > 1) {
            this.LIZ.stopFlipping();
            this.LIZ.setInAnimation(null);
            this.LIZ.setOutAnimation(null);
            this.LIZ.setDisplayedChild(0);
            this.LIZ.startFlipping();
            HandlerHook.viewPost(this.LIZ, new ARunnableS129S0100000_29(this, 170));
        }
    }

    @Override // X.InterfaceC655250Pn1
    public final void stop() {
        this.LIZ.stopFlipping();
        this.LIZIZ = false;
    }

    @Override // X.InterfaceC655250Pn1
    public final boolean isPlaying() {
        return this.LIZIZ;
    }

    public C19350710nB(ViewFlipper viewFlipper) {
        this.LIZ = viewFlipper;
    }
}
