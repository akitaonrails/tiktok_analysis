package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eRL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088810eRL extends FrameLayout {
    public final int LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public AnimatorSet LLILZ;

    public final void LIZ() {
        C786410Ut5.od(this.LLILLJJLI, 0.0f);
        this.LLILLJJLI.setTextColor(this.LL);
        this.LLILLL.setTextColor(this.LL);
        C786410Ut5.od(this.LLILLL, 0.0f);
        C786410Ut5.LLJJJJ(this.LLILLL, 8);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setText$liverevenue_impl_release(CharSequence charSequence) {
        AnimatorSet animatorSet = this.LLILZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLILZ;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLILLJJLI.setText(charSequence);
            LIZ();
            return;
        }
        this.LLILLJJLI.setText(charSequence);
    }

    public C1088810eRL(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ex7, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LL = iIntValue;
        C16F5 c16f5 = new C16F5(context, null);
        c16f5.setIncludeFontPadding(false);
        c16f5.setSingleLine();
        c16f5.setTextColor(iIntValue);
        c16f5.LJJJI(R.style.a9i);
        this.LLILLJJLI = c16f5;
        C16F5 c16f52 = new C16F5(context, null);
        c16f52.setIncludeFontPadding(false);
        c16f52.setSingleLine();
        c16f52.setTextColor(iIntValue);
        c16f52.LJJJI(R.style.a9i);
        C786410Ut5.LLJJJJ(c16f52, 8);
        this.LLILLL = c16f52;
        addView(c16f5, new FrameLayout.LayoutParams(-2, -2));
        addView(c16f52, new FrameLayout.LayoutParams(-2, -2));
    }
}
