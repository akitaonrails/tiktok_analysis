package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;

/* JADX INFO: renamed from: X.0alT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947530alT extends C0UHS {
    public static final /* synthetic */ int LJJIFFI = 0;
    public final ConstraintLayout LJIILLIIL;
    public final View LJIIZILJ;
    public final View LJIJ;
    public final View LJIJI;
    public final View LJIJJ;
    public final View LJIJJLI;
    public final View LJIL;
    public final ViewOnLayoutChangeListenerC986930bn1 LJJ;
    public Animator LJJI;

    public final void LJIIIIZZ() {
        ViewGroup viewGroup;
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (!C927600aFK.LJIILL() || (viewGroup = this.LJFF) == null) {
            return;
        }
        viewGroup.addOnLayoutChangeListener(this.LJJ);
    }

    public C947530alT(C19P4 c19p4, ViewGroup viewGroup, ViewGroup viewGroup2, View view, ConstraintLayout constraintLayout, View view2, ViewGroup viewGroup3, ViewGroup viewGroup4, C16F5 c16f5, FrameLayout frameLayout, View view3, View view4, LiveIconView liveIconView, View view5) {
        super(c19p4, viewGroup, viewGroup2, view, viewGroup3, viewGroup4, frameLayout);
        this.LJIILLIIL = constraintLayout;
        this.LJIIZILJ = view2;
        this.LJIJ = c16f5;
        this.LJIJI = view3;
        this.LJIJJ = view4;
        this.LJIJJLI = liveIconView;
        this.LJIL = view5;
        if ((constraintLayout instanceof ConstraintLayout) && constraintLayout != null) {
            constraintLayout.setMaxHeight((int) (((double) C497740JfY.LJIILLIIL()) * 0.9d));
        }
        this.LJJ = new ViewOnLayoutChangeListenerC986930bn1(viewGroup4, this, view, 0);
    }
}
