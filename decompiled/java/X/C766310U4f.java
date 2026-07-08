package X;

import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHint;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766310U4f {
    public boolean LIZ;
    public EffectHint LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public ValueAnimator LJ;
    public FrameLayout LJFF;

    public C766310U4f() {
        this(0);
    }

    public final void LIZ() {
        if (this.LIZIZ == null) {
            return;
        }
        this.LJ.cancel();
        FrameLayout frameLayout = this.LJFF;
        if (frameLayout == null) {
            frameLayout = null;
        }
        View view = this.LIZJ;
        C786410Ut5.LJJJZ(view != null ? view : null, frameLayout);
        this.LIZ = false;
    }

    public C766310U4f(int i) {
        this.LIZ = false;
        this.LIZIZ = null;
        this.LJ = ValueAnimator.ofInt(0, 5500);
    }

    public final void LIZIZ(FrameLayout frameLayout, EffectHint effectHint) {
        this.LIZIZ = effectHint;
        this.LJFF = frameLayout;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(frameLayout.getContext()), R.layout.d41, frameLayout, false);
        this.LIZJ = viewTd;
        FrameLayout frameLayout2 = this.LJFF;
        View view = null;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        if (viewTd == null) {
            viewTd = null;
        }
        frameLayout2.addView(viewTd, 0);
        View view2 = this.LIZJ;
        if (view2 == null) {
            view2 = null;
        }
        this.LIZLLL = view2.findViewById(R.id.i2v);
        View view3 = this.LIZJ;
        if (view3 == null) {
            view3 = null;
        }
        TextView textView = (TextView) view3.findViewById(R.id.w6v);
        View view4 = this.LIZJ;
        if (view4 == null) {
            view4 = null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view4.findViewById(R.id.w6w);
        EffectHint effectHint2 = this.LIZIZ;
        if (effectHint2 != null) {
            textView.setText(effectHint2.getHint());
            if (effectHint2.getHintIcon().length() > 0) {
                C786410Ut5.LLILIL(appCompatImageView, 0);
                C1335790krh c1335790krh = C1335790krh.LIZIZ;
                Context context = frameLayout.getContext();
                String hintIcon = effectHint2.getHintIcon();
                C0UD9 c0ud9 = new C0UD9();
                c0ud9.LJ = ImageView.ScaleType.FIT_CENTER;
                c0ud9.LIZIZ(R.drawable.ayx);
                c1335790krh.LIZLLL(context, hintIcon, appCompatImageView, new C0UDA(c0ud9));
            } else {
                C786410Ut5.LLILIL(appCompatImageView, 8);
            }
        }
        View view5 = this.LIZLLL;
        if (view5 != null) {
            view = view5;
        }
        C786410Ut5.T4(view, 0.3f);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 5500);
        this.LJ = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(5500L);
        this.LJ.setInterpolator(new LinearInterpolator());
        this.LJ.addUpdateListener(new AUListenerS262S0100000_12(this, 30));
        this.LJ.start();
        this.LIZ = true;
    }
}
