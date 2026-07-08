package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06VX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06VX extends LinearLayout {
    public final Animator LL;
    public boolean LLILLJJLI;

    public final void setLoading(boolean z) {
        int i;
        if (this.LLILLJJLI == z) {
            return;
        }
        if (z) {
            this.LL.start();
            i = 0;
        } else {
            this.LL.cancel();
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        this.LLILLJJLI = z;
    }

    public C06VX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setGravity(0);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        tuxIconView.setTintColor(R.attr.a1j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        layoutParams.gravity = 16;
        C786410Ut5.M6(tuxIconView, layoutParams);
        addView(tuxIconView);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 360.0f);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        this.LL = objectAnimatorOfFloat;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.ud);
        tuxTextView.setText(2131850755);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        layoutParams2.gravity = 16;
        C786410Ut5.R6(tuxTextView, layoutParams2);
        addView(tuxTextView);
    }
}
