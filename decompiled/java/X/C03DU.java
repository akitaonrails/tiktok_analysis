package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.03DU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C03DU extends FrameLayout {
    public TuxTextView LL;

    public C03DU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public void LIZ() {
    }

    public final TuxTextView getTitleTextView() {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final void setTitleText(int i) {
        getTitleTextView().setText(i);
    }

    public final void setTitleTextView(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public C03DU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTuxFont(62);
        tuxTextView.setTextColorRes(R.attr.a1k);
        q0.LJJI(tuxTextView, true);
        q0.LJIJI(tuxTextView, true);
        setTitleTextView(tuxTextView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        addView(getTitleTextView(), layoutParams);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 16);
        LIZ();
    }

    public /* synthetic */ C03DU(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
