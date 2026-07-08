package X;

import Y.ARunnableS112S0100000_12;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;

/* JADX INFO: renamed from: X.0UsH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnLayoutChangeListenerC785910UsH implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC785910UsH(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC785910UsH viewOnLayoutChangeListenerC785910UsH, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (i9 != i10) {
            if (i10 == 0) {
                ((SkeletonSharePanelFragment) viewOnLayoutChangeListenerC785910UsH.l0).LLLLILI = i9;
            }
            if (((FrameLayout) viewOnLayoutChangeListenerC785910UsH.l1).getChildCount() > 0) {
                View childAt = ((FrameLayout) viewOnLayoutChangeListenerC785910UsH.l1).getChildAt(0);
                if (i9 < ((SkeletonSharePanelFragment) viewOnLayoutChangeListenerC785910UsH.l0).LLLLILI) {
                    childAt.animate().alpha(0.0f).setInterpolator(C1619980sG4.LJIILIIL()).setDuration(200L).withEndAction(new ARunnableS112S0100000_12(childAt, 219)).start();
                } else {
                    childAt.animate().alpha(1.0f).setInterpolator(C1619980sG4.LJIILIIL()).setDuration(200L).withEndAction(new ARunnableS112S0100000_12(childAt, 220)).start();
                }
            }
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC785910UsH viewOnLayoutChangeListenerC785910UsH, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((LiveHostSettingFragmentSheet) viewOnLayoutChangeListenerC785910UsH.l0).zS((LinearLayout) viewOnLayoutChangeListenerC785910UsH.l1);
    }
}
