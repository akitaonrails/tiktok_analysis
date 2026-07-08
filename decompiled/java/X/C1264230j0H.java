package X;

import Y.ARunnableS119S0100000_19;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0j0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264230j0H extends C214906198m {
    public View LL;
    public View LLILLJJLI;
    public final Context LLILLL;
    public final View LLILZ;
    public final C1264250j0J LLILZIL;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (!this.LLILZIL.LIZJ) {
            LJJIIJZLJL();
        } else {
            LJJIIJ(false);
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS119S0100000_19(this, 211));
        }
    }

    public final void LJJIIJZLJL() {
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIIJ(boolean z) {
        float translationY;
        float fApplyDimension;
        int dimensionPixelSize;
        View viewFindViewById = this.LL.findViewById(R.id.y55);
        if (z) {
            translationY = -viewFindViewById.getMeasuredHeight();
            int iN3 = C786410Ut5.n3(this.LLILLL.getResources(), "status_bar_height", "dimen", "android");
            if (iN3 > 0) {
                dimensionPixelSize = this.LLILLL.getResources().getDimensionPixelSize(iN3);
            } else {
                dimensionPixelSize = 0;
            }
            fApplyDimension = dimensionPixelSize + TypedValue.applyDimension(1, 0, Resources.getSystem().getDisplayMetrics()) + this.LLILZIL.LJ;
        } else {
            translationY = viewFindViewById.getTranslationY();
            fApplyDimension = -viewFindViewById.getMeasuredHeight();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(viewFindViewById, "translationY", translationY, fApplyDimension).setDuration(416L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        C786410Ut5.Pd(duration);
    }

    public C1264230j0H(Context context, View view, C1264250j0J c1264250j0J) {
        this.LLILLL = context;
        this.LLILZ = view;
        this.LLILZIL = c1264250j0J;
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setTouchable(false);
        int color = context.getResources().getColor(R.color.sa);
        float fApplyDimension = TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics());
        int color2 = context.getResources().getColor(R.color.sb);
        View viewSd = C786410Ut5.Sd(R.layout.dtq, C786410Ut5.ne(context), null);
        this.LL = viewSd;
        setContentView(viewSd);
        View viewFindViewById = this.LL.findViewById(R.id.y55);
        this.LLILLJJLI = viewFindViewById;
        C1264260j0K c1264260j0K = new C1264260j0K();
        c1264260j0K.LIZ = Integer.valueOf(color);
        c1264260j0K.LIZIZ = Float.valueOf(fApplyDimension);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = c1264260j0K.LIZ;
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        Float f = c1264260j0K.LIZIZ;
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        viewFindViewById.setBackground(gradientDrawable);
        if (c1264250j0J.LIZLLL > 0) {
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            layoutParams.width = c1264250j0J.LIZLLL;
            C786410Ut5.W5(this.LLILLJJLI, layoutParams);
        }
        TextView textView = (TextView) this.LL.findViewById(R.id.o8v);
        textView.setTextColor(color2);
        if (!TextUtils.isEmpty(c1264250j0J.LIZ)) {
            textView.setText(c1264250j0J.LIZ);
        }
    }
}
