package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091260eVI extends ConstraintLayout {
    public C1091260eVI() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZIZ = C2450809j0.LIZIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current view ids: ");
            sbLIZ.append(strLIZIZ);
            C13SZ.LIZ(e, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            throw e;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1091260eVI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ;
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            iLIZIZ = (int) (((double) (C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(24.0f)))) * 0.6d);
        } else {
            iLIZIZ = (int) C497740JfY.LIZIZ(150.0f);
        }
        if (iLIZIZ > 0 && View.MeasureSpec.getSize(i) > iLIZIZ) {
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                i = View.MeasureSpec.makeMeasureSpec(iLIZIZ, Integer.MIN_VALUE);
            } else {
                i = View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824);
            }
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(40.0f);
        if (iLIZIZ2 > 0 && View.MeasureSpec.getSize(i2) > iLIZIZ2) {
            if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLIZIZ2, Integer.MIN_VALUE);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec(iLIZIZ2, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }
}
