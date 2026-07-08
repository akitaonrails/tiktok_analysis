package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS77S0100000_5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FN4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FN4 extends FrameLayout {
    public final C01GW LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public View LLIZ;
    public Function2<? super Boolean, ? super Integer, Unit> LLIZLLLIL;
    public Function0<Unit> LLJ;
    public Function0<Unit> LLJI;
    public boolean LLJIJIL;

    private final ValueAnimator getHeightAnimator() {
        return (ValueAnimator) this.LL.getValue();
    }

    private final Drawable getGradientDrawable() {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, getContext());
        int iIntValue = numLIZJ != null ? numLIZJ.intValue() : -1;
        int iLJIIL = C2441009hQ.LJIIL(iIntValue, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILLL - this.LLILZ, new int[]{iLJIIL, iIntValue}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        return shapeDrawable.mutate();
    }

    public final boolean getEnableAnim() {
        return this.LLJIJIL;
    }

    public final Function0<Unit> getExpandedCallback() {
        return this.LLJI;
    }

    public final Function0<Unit> getFoldedCallback() {
        return this.LLJ;
    }

    public final Function2<Boolean, Integer, Unit> getReachMaxHeightCallback() {
        return this.LLIZLLLIL;
    }

    public C0FN4(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1691));
        C426750GoL.LJIIL(this, 0, Integer.valueOf(C814420VxA.LIZIZ(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()))), 0, 0, 16);
        int iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 50, Resources.getSystem().getDisplayMetrics()));
        this.LLILLJJLI = iLIZIZ;
        this.LLILLL = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 64, Resources.getSystem().getDisplayMetrics()));
        this.LLILZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 40, Resources.getSystem().getDisplayMetrics()));
        this.LLILZLL = iLIZIZ;
    }

    public final void setEnableAnim(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setExpandedCallback(Function0<Unit> function0) {
        this.LLJI = function0;
    }

    public final void setFoldedCallback(Function0<Unit> function0) {
        this.LLJ = function0;
    }

    public final void setReachMaxHeightCallback(Function2<? super Boolean, ? super Integer, Unit> function2) {
        this.LLIZLLLIL = function2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.LLILZIL <= this.LLILLJJLI) {
            return;
        }
        int measuredHeight = getMeasuredHeight();
        if (measuredHeight > this.LLILZIL) {
            if (this.LLIZ == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                TuxTextView tuxTextView = new TuxTextView(frameLayout.getContext(), null, 6, 0);
                tuxTextView.setGravity(17);
                tuxTextView.setTuxFont(62);
                tuxTextView.setTextColorRes(R.attr.a1h);
                tuxTextView.setGravity(17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(frameLayout.getContext().getString(2131848546));
                spannableStringBuilder.append((CharSequence) " ");
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_down;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                float f = 14;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, frameLayout.getContext());
                c419890GdHLIZIZ.LIZIZ(C814420VxA.LIZIZ(TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics())), 0, C426750GoL.LIZLLL(frameLayout.getContext()));
                C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                tuxTextView.setText(spannableStringBuilder);
                C786410Ut5.I7(new AkS77S0100000_5(this, 9), tuxTextView);
                float fLIZIZ = C418440Gaw.LIZIZ(8);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a03, frameLayout.getContext());
                c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
                tuxTextView.setBackground(c384050F3z.LIZ(frameLayout.getContext()));
                C427690Gpr.LJ(tuxTextView, fLIZIZ);
                frameLayout.setBackground(getGradientDrawable());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.LLILZ);
                layoutParams.gravity = 81;
                float f2 = 16;
                layoutParams.setMarginStart(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics())));
                layoutParams.setMarginEnd(C814420VxA.LIZIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics())));
                frameLayout.addView(tuxTextView, layoutParams);
                this.LLIZ = frameLayout;
            }
            View view = this.LLIZ;
            if (view != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                removeView(view);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, this.LLILLL);
                layoutParams2.gravity = 81;
                addView(view, layoutParams2);
                Function0<Unit> function0 = this.LLJ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            measuredHeight = this.LLILZLL;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }
}
