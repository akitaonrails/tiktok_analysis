package X;

import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.graphics.Color;
import android.os.Looper;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0yF0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849960yF0 extends FrameLayout {
    public static final PathInterpolator LLJI = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    public static final PathInterpolator LLJIJIL = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
    public final BPEAHandler LL;
    public final List<String> LLILLJJLI;
    public final TuxTextView LLILLL;
    public final FrameLayout LLILZ;
    public final TuxTextView LLILZIL;
    public final C1390410mHn LLILZLL;
    public int LLIZ;
    public ARunnableS127S0100000_27 LLIZLLLIL;
    public boolean LLJ;

    public final void LIZLLL() {
        C786410Ut5.B5(this.LLILLL, 0.0f);
        C786410Ut5.wd(this.LLILLL, LIZIZ(28.0f));
        C786410Ut5.U4(this.LLILZ, 0.0f);
        C786410Ut5.fd(this.LLILZ, LIZIZ(20.0f));
        C1390410mHn c1390410mHn = this.LLILZLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn);
        c1390410mHn.setAlpha(0.0f);
        C1390410mHn c1390410mHn2 = this.LLILZLL;
        float fLIZIZ = LIZIZ(6.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1390410mHn2);
        c1390410mHn2.setTranslationY(fLIZIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJ = false;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = this.LLIZLLLIL;
        if (aRunnableS127S0100000_27 != null) {
            this.LL.removeCallbacks(aRunnableS127S0100000_27);
        }
        this.LL.removeCallbacksAndMessages(null);
        this.LLIZLLLIL = null;
        this.LLILZLL.LIZLLL();
    }

    public C1849960yF0(Context context) {
        int iIntValue;
        super(context);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLILLJJLI = C1697810uHb.LJIIJJI(context.getString(2131845793), context.getString(2131845794), context.getString(2131845795), context.getString(2131845796), context.getString(2131845797));
        LinearLayout linearLayout = new LinearLayout(context);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILLL = tuxTextView;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LLILZ = frameLayout;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        this.LLILZIL = tuxTextView2;
        C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
        this.LLILZLL = c1390410mHn;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        setBackgroundColor(iIntValue);
        tuxTextView.setText(tuxTextView.getContext().getString(2131845798));
        tuxTextView.setTextColor(-1);
        tuxTextView.setTuxFont(123);
        tuxTextView.setGravity(17);
        tuxTextView2.setTextColor(Color.argb(224, 255, 255, 255));
        tuxTextView2.setTuxFont(51);
        tuxTextView2.setGravity(49);
        tuxTextView2.setTextAlignment(4);
        tuxTextView2.setMaxLines(3);
        frameLayout.addView(tuxTextView2, new FrameLayout.LayoutParams(LIZJ(262), -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(tuxTextView, new LinearLayout.LayoutParams(LIZJ(262), -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LIZJ(262), LIZJ(54));
        layoutParams.topMargin = LIZJ(12);
        linearLayout.addView(frameLayout, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(LIZJ(32), LIZJ(32));
        layoutParams2.topMargin = LIZJ(24);
        linearLayout.addView(c1390410mHn, layoutParams2);
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        LIZLLL();
    }

    public final float LIZIZ(float f) {
        return f * getResources().getDisplayMetrics().density;
    }

    public final int LIZJ(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    public static void LIZ(View view, float f) {
        view.animate().cancel();
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.ed(view, f);
        view.animate().alpha(1.0f).translationY(0.0f).setDuration(200L).setInterpolator(LLJIJIL).start();
    }
}
