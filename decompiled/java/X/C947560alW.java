package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;

/* JADX INFO: renamed from: X.0alW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947560alW extends C0UHS {
    public static final /* synthetic */ int LJJIFFI = 0;
    public final ConstraintLayout LJIILLIIL;
    public final View LJIIZILJ;
    public final View LJIJ;
    public final View LJIJI;
    public final View LJIJJ;
    public final View LJIJJLI;
    public final ViewOnLayoutChangeListenerC986930bn1 LJIL;
    public Animator LJJ;
    public int LJJI;

    public C947560alW(C19P4 c19p4, ViewGroup viewGroup, ViewGroup viewGroup2, View view, ConstraintLayout constraintLayout, View view2, ViewGroup viewGroup3, ViewGroup viewGroup4, FrameLayout frameLayout, View view3, View view4, LiveIconView liveIconView, C1103220eoa c1103220eoa) {
        super(c19p4, viewGroup, viewGroup2, view, viewGroup3, viewGroup4, frameLayout);
        this.LJIILLIIL = constraintLayout;
        this.LJIIZILJ = view2;
        this.LJIJ = view3;
        this.LJIJI = view4;
        this.LJIJJ = liveIconView;
        this.LJIJJLI = c1103220eoa;
        if ((constraintLayout instanceof ConstraintLayout) && constraintLayout != null) {
            constraintLayout.setMaxHeight((int) (((double) C497740JfY.LJIILLIIL()) * 0.8d));
        }
        this.LJIL = new ViewOnLayoutChangeListenerC986930bn1(viewGroup4, this, view, 1);
    }
}
