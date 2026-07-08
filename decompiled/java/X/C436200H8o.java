package X;

import Y.ARunnableS106S0100000_6;
import Y.ATListenerS350S0200000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436200H8o extends C214906198m {
    public static final /* synthetic */ int LLILZLL = 0;
    public final C19GS LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final ConstraintLayout LLILZ;
    public final TuxTextView LLILZIL;

    public final void LJJIIJ(boolean z) {
        float fLIZ;
        float f;
        float fLIZ2;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator interpolatorLIZIZ = C1619980sG4.LIZIZ();
        float alpha = 0.0f;
        if (z) {
            fLIZ2 = C341940Daq.LIZ(20.0d);
            f = 1.0f;
            fLIZ = 0.0f;
        } else {
            alpha = this.LLILZ.getAlpha();
            fLIZ = C341940Daq.LIZ(20.0d);
            f = 0.0f;
            fLIZ2 = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.LLILZ, "alpha", alpha, f).setDuration(300L);
        duration.setInterpolator(interpolatorLIZIZ);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LLILZ, "translationY", fLIZ2, fLIZ).setDuration(300L);
        duration2.setInterpolator(interpolatorLIZIZ);
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public static boolean LJJIIJZLJL(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()).contains((int) f, (int) f2);
    }

    public C436200H8o(C19GS c19gs, Aweme aweme, String str, String str2) {
        super(c19gs);
        this.LL = c19gs;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        setContentView(C786410Ut5.Sd(R.layout.ba5, C786410Ut5.ne(c19gs), null));
        this.LLILZ = (ConstraintLayout) getContentView().findViewById(R.id.fxx);
        TuxTextView tuxTextView = (TuxTextView) getContentView().findViewById(R.id.fxy);
        this.LLILZIL = tuxTextView;
        getContentView().findViewById(R.id.fxs);
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        tuxTextView.setText(c19gs.getString(2131838247));
        setFocusable(false);
        C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS106S0100000_6(this, 266));
        setTouchInterceptor(new ATListenerS350S0200000_31(this, aweme, 2));
        LJJIIJ(true);
    }
}
