package X;

import android.animation.AnimatorSet;
import android.graphics.drawable.Animatable;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932450aN9 {
    public C1324720kZq LIZ;
    public Animatable LIZIZ;
    public boolean LIZJ;
    public ViewGroup LIZLLL;
    public LiveIconView LJ;
    public C16F5 LJFF;
    public AnimatorSet LJI;

    public final void LIZ(Long l, boolean z) {
        String strLJIJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            ViewGroup viewGroup = this.LIZLLL;
            if (viewGroup != null) {
                viewGroup.setEnabled(false);
            }
            ViewGroup viewGroup2 = this.LIZLLL;
            if (viewGroup2 != null) {
                viewGroup2.setClickable(false);
            }
            ViewGroup viewGroup3 = this.LIZLLL;
            if (viewGroup3 != null) {
                viewGroup3.setBackgroundResource(R.drawable.dza);
            }
            LiveIconView liveIconView = this.LJ;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.ejp);
            }
            LiveIconView liveIconView2 = this.LJ;
            if (liveIconView2 != null && (layoutParams = liveIconView2.getLayoutParams()) != null) {
                layoutParams.width = C439101nJ.LIZ(14);
                layoutParams.height = C439101nJ.LIZ(14);
            }
            LiveIconView liveIconView3 = this.LJ;
            if (liveIconView3 != null) {
                C786410Ut5.w6(liveIconView3, layoutParams);
            }
            C16F5 c16f5 = this.LJFF;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131850341));
                return;
            }
            return;
        }
        ViewGroup viewGroup4 = this.LIZLLL;
        if (viewGroup4 != null) {
            viewGroup4.setEnabled(true);
        }
        ViewGroup viewGroup5 = this.LIZLLL;
        if (viewGroup5 != null) {
            viewGroup5.setClickable(true);
        }
        ViewGroup viewGroup6 = this.LIZLLL;
        if (viewGroup6 != null) {
            viewGroup6.setBackgroundResource(R.drawable.dz_);
        }
        LiveIconView liveIconView4 = this.LJ;
        if (liveIconView4 != null) {
            liveIconView4.setIconAttr(R.attr.e_6);
        }
        LiveIconView liveIconView5 = this.LJ;
        if (liveIconView5 != null && (layoutParams = liveIconView5.getLayoutParams()) != null) {
            layoutParams.width = C439101nJ.LIZ(16);
            layoutParams.height = C439101nJ.LIZ(16);
        }
        LiveIconView liveIconView6 = this.LJ;
        if (liveIconView6 != null) {
            C786410Ut5.w6(liveIconView6, layoutParams);
        }
        C16F5 c16f52 = this.LJFF;
        if (c16f52 == null) {
            return;
        }
        if (l != null && l.longValue() == 3) {
            strLJIJI = C497740JfY.LJIJI(2131850340);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131841701);
        }
        c16f52.setText(strLJIJI);
    }
}
