package X;

import Y.ARunnableS109S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0OUU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OUU {
    public final ViewGroup LIZ;
    public FrameLayout LIZIZ;
    public C1390410mHn LIZJ;
    public View LIZLLL;
    public C197039127h LJ;
    public final ARunnableS109S0100000_9 LJFF;
    public int LJI;
    public int LJII;

    public final void LIZIZ() {
        ViewGroup viewGroup;
        HandlerHook.viewRemoveCallbacks(this.LIZ, this.LJFF);
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            return;
        }
        C1390410mHn c1390410mHn = this.LIZJ;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C786410Ut5.LJJJJIZL(frameLayout);
        ViewParent parent = frameLayout.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
    }

    public C0OUU(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        viewGroup.addOnAttachStateChangeListener(new C0P4L(this, 2));
        this.LJFF = new ARunnableS109S0100000_9(this, 159);
    }

    public final FrameLayout LIZ(int i, int i2) {
        ViewGroup viewGroup;
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout == null) {
            frameLayout = new FrameLayout(this.LIZ.getContext());
            this.LIZIZ = frameLayout;
        }
        frameLayout.setMinimumWidth(i);
        frameLayout.setMinimumHeight(i2);
        if (frameLayout.getParent() != this.LIZ) {
            ViewParent parent = frameLayout.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
            }
            this.LIZ.addView(frameLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        }
        return frameLayout;
    }
}
