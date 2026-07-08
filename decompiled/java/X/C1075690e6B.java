package X;

import Y.ARunnableS116S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075690e6B {
    public static final int LJIILJJIL = (int) C0I7Z.LIZ(37);
    public static final int LJIILL = (int) C0I7Z.LIZ(24);
    public static final float LJIILLIIL = C0I7Z.LIZ(37);
    public final FrameLayout LIZ;
    public final List<String> LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(480));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 904));
    public final C01GW LJFF;
    public ObjectAnimator LJI;
    public ObjectAnimator LJII;
    public ValueAnimator LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final List<Pair<Integer, Integer>> LJIIL;
    public ARunnableS116S0100000_16 LJIILIIL;

    public final LinearLayout LIZ() {
        return (LinearLayout) this.LJ.getValue();
    }

    public static void LIZIZ(LinearLayout linearLayout) {
        if (linearLayout.getChildCount() > 0) {
            View childAt = linearLayout.getChildAt(0);
            C786410Ut5.LJJLJ(0, linearLayout);
            linearLayout.addView(childAt, linearLayout.getChildCount());
            C786410Ut5.hd(linearLayout, linearLayout.getTranslationY() + LJIILLIIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1075690e6B(FrameLayout frameLayout, List<String> list) {
        this.LIZ = frameLayout;
        this.LIZIZ = list;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 902));
        this.LJFF = c01gwLIZIZ;
        this.LJIIIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 901));
        this.LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 903));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 905));
        int i = 0;
        this.LJIIL = C1697810uHb.LJIILJJIL(new Pair(0, 0), new Pair(217, 255), new Pair(255, 255));
        LinearLayout linearLayoutLIZ = LIZ();
        linearLayoutLIZ.setOrientation(1);
        float translationY = linearLayoutLIZ.getTranslationY();
        int i2 = LJIILJJIL;
        C786410Ut5.hd(linearLayoutLIZ, translationY + i2);
        frameLayout.addView(linearLayoutLIZ);
        LinearLayout linearLayout = (LinearLayout) c01gwLIZIZ.getValue();
        linearLayout.setOrientation(1);
        C786410Ut5.hd(linearLayout, linearLayout.getTranslationY() + i2);
        frameLayout.addView(linearLayout);
        Iterator<String> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            LinearLayout linearLayoutLIZ2 = LIZ();
            Context context = LIZ().getContext();
            LinearLayout linearLayout2 = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, LJIILJJIL);
            layoutParams.gravity = 17;
            C786410Ut5.d6(linearLayout2, layoutParams);
            TuxTextView tuxTextView = new TuxTextView(context, null == true ? 1 : 0, 6, i);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 17;
            int i3 = LJIILL;
            layoutParams2.setMarginStart(i3);
            layoutParams2.setMarginEnd(i3);
            C786410Ut5.R6(tuxTextView, layoutParams2);
            tuxTextView.setGravity(17);
            tuxTextView.setTextColorRes(R.attr.a1h);
            tuxTextView.setText(next);
            tuxTextView.setTuxFont(13);
            tuxTextView.setMaxLines(1);
            tuxTextView.setMinTextSize(C0I7Z.LIZ(1));
            linearLayout2.addView(tuxTextView);
            linearLayoutLIZ2.addView(linearLayout2);
        }
        LIZJ(0, 0, (View) this.LJIIIZ.getValue());
        LIZJ(217, 255, (View) this.LJIIJ.getValue());
        LIZJ(255, 255, (View) this.LJIIJJI.getValue());
        LinearLayout linearLayoutLIZ3 = LIZ();
        float translationY2 = LIZ().getTranslationY();
        float f = LJIILLIIL;
        this.LJI = ObjectAnimator.ofFloat(linearLayoutLIZ3, "translationY", LIZ().getTranslationY(), translationY2 - f);
        this.LJII = ObjectAnimator.ofFloat(this.LJFF.getValue(), "translationY", LIZ().getTranslationY(), LIZ().getTranslationY() - f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJIIIIZZ = valueAnimatorOfFloat;
        (valueAnimatorOfFloat == null ? null : valueAnimatorOfFloat).addUpdateListener(new AUListenerS265S0100000_16(this, 53));
        AnimatorSet animatorSet = (AnimatorSet) this.LIZLLL.getValue();
        Animator[] animatorArr = new Animator[3];
        ObjectAnimator objectAnimator = this.LJI;
        animatorArr[0] = objectAnimator == null ? null : objectAnimator;
        ObjectAnimator objectAnimator2 = this.LJII;
        animatorArr[1] = objectAnimator2 == null ? null : objectAnimator2;
        ValueAnimator valueAnimator = this.LJIIIIZZ;
        animatorArr[2] = valueAnimator != null ? valueAnimator : null;
        animatorSet.playTogether(animatorArr);
        ((AnimatorSet) this.LIZLLL.getValue()).setDuration(400L);
        this.LJIILIIL = new ARunnableS116S0100000_16(this, 221);
    }

    public final void LIZJ(int i, int i2, View view) {
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-2, LJIILJJIL));
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(i, 255, 255, 255), Color.argb(i2, 255, 255, 255)}));
        ((ViewGroup) this.LJFF.getValue()).addView(view);
    }

    public final void LIZLLL(float f, int i, int i2, View view) {
        if (i < this.LJIIL.size() && i2 < this.LJIIL.size()) {
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (((Number) ((Pair) ListProtector.get(this.LJIIL, i)).getFirst()).floatValue() + ((((Number) ((Pair) ListProtector.get(this.LJIIL, i2)).getFirst()).intValue() - ((Number) ((Pair) ListProtector.get(this.LJIIL, i)).getFirst()).intValue()) * f)), 255, 255, 255), Color.argb((int) (((Number) ((Pair) ListProtector.get(this.LJIIL, i)).getSecond()).floatValue() + (f * (((Number) ((Pair) ListProtector.get(this.LJIIL, i2)).getSecond()).intValue() - ((Number) ((Pair) ListProtector.get(this.LJIIL, i)).getSecond()).intValue()))), 255, 255, 255)}));
        }
    }
}
