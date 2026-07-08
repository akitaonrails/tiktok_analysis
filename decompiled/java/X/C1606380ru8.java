package X;

import Y.ARunnableS124S0100000_24;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0ru8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606380ru8 {
    public View LIZ;
    public ViewGroup LIZIZ;
    public boolean LIZJ;
    public final ARunnableS124S0100000_24 LIZLLL = new ARunnableS124S0100000_24(this, 114);

    public final void LIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        View view = this.LIZ;
        if (view == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(view, this.LIZLLL);
        view.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS124S0100000_24(this, 113)).start();
    }
}
