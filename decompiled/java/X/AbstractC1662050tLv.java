package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1662050tLv extends ConstraintLayout {
    public abstract void h0(Function0 function0, boolean z);

    public abstract void i0(C1662100tM0 c1662100tM0, View view);

    public void j0(String str) {
    }

    public boolean isShowing() {
        return getVisibility() == 0;
    }

    public AbstractC1662050tLv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void e0(ViewGroup viewGroup, C1662100tM0 c1662100tM0, View view) {
        if (!(viewGroup instanceof FrameLayout)) {
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            viewGroup.addView(frameLayout, 0, new ViewGroup.LayoutParams(-1, -1));
            viewGroup = frameLayout;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        int i = iArr[1];
        layoutParams.topMargin = i;
        if (c1662100tM0.LJIIIZ == EnumC1662090tLz.NORMAL) {
            layoutParams.topMargin = i + ((int) view.getTranslationY());
        }
        if (getParent() == null) {
            if (c1662100tM0.LJI == EnumC862650Xsl.BELOW_ICON) {
                viewGroup.addView(this, 0, layoutParams);
                return;
            } else {
                viewGroup.addView(this, layoutParams);
                return;
            }
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
