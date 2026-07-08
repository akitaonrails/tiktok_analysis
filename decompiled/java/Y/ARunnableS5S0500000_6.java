package Y;

import X.C013C;
import X.C098200Yq;
import X.C0GVT;
import X.C13LQ;
import X.C1619980sG4;
import X.C189200o6;
import X.C1C7U;
import X.C376710Epp;
import X.C418440Gaw;
import X.C426880GoY;
import X.C786410Ut5;
import X.C814420VxA;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS5S0500000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    public final void LIZ$1() {
        List listLJIJI = C13LQ.LJIJI(new ObjectAnimator[]{(ObjectAnimator) this.l0, (ObjectAnimator) this.l1, (ObjectAnimator) this.l2, (ObjectAnimator) this.l3, (ObjectAnimator) this.l4});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(listLJIJI);
        animatorSet.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Object c098200Yq;
        C426880GoY c426880GoY = C426880GoY.LIZ;
        TuxTextView tuxTextView = (TuxTextView) this.l0;
        c426880GoY.getClass();
        CharSequence text = tuxTextView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            ImageSpan imageSpan = (ImageSpan) C13LQ.LJJIIZ(0, spanned.getSpans(0, spanned.length(), C0GVT.class));
            if (imageSpan != null) {
                final Drawable drawable = imageSpan.getDrawable();
                if (((FrameLayout) this.l1).getParent() != null) {
                    Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
                    if (numValueOf.intValue() > 0) {
                        int iIntValue = numValueOf.intValue();
                        Integer numValueOf2 = Integer.valueOf(drawable.getIntrinsicHeight());
                        if (numValueOf2.intValue() > 0) {
                            try {
                                c098200Yq = C376710Epp.LIZ(drawable, iIntValue, numValueOf2.intValue(), Bitmap.Config.ARGB_8888);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            Bitmap bitmap = (Bitmap) c098200Yq;
                            if (bitmap != null) {
                                final ImageView imageView = new ImageView(((ViewGroup) this.l3).getContext());
                                imageView.setImageBitmap(bitmap);
                                C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()));
                                C426880GoY c426880GoY2 = C426880GoY.LIZ;
                                TuxTextView tuxTextView2 = (TuxTextView) this.l0;
                                FrameLayout frameLayout = (FrameLayout) this.l1;
                                c426880GoY2.getClass();
                                CharSequence text2 = tuxTextView2.getText();
                                if (text2 instanceof Spanned) {
                                    int spanStart = ((Spanned) text2).getSpanStart(imageSpan);
                                    Layout layout = tuxTextView2.getLayout();
                                    if (layout != null) {
                                        int lineForOffset = layout.getLineForOffset(spanStart);
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        int lineTop = layout.getLineTop(lineForOffset);
                                        tuxTextView2.getLocationOnScreen(new int[2]);
                                        frameLayout.getLocationOnScreen(new int[2]);
                                        PointF pointF = new PointF((r1[0] + primaryHorizontal) - r5[0], (r1[1] + lineTop) - r5[1]);
                                        View view = (View) this.l4;
                                        view.getLocationInWindow(new int[2]);
                                        ((FrameLayout) this.l1).getLocationInWindow(new int[2]);
                                        PointF pointF2 = new PointF(r4[0] - r5[0], r4[1] - r5[1]);
                                        final PointF pointF3 = new PointF(pointF.x + (drawable.getIntrinsicWidth() / 2.0f), pointF.y + (drawable.getIntrinsicHeight() / 2.0f));
                                        final PointF pointF4 = new PointF(pointF2.x + (((View) this.l4).getWidth() / 2.0f), pointF2.y + (((View) this.l4).getHeight() / 2.0f));
                                        float f = pointF4.x;
                                        final PointF pointF5 = new PointF(f + ((pointF3.x - f) * 0.9f), Math.min(pointF3.y, pointF4.y) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
                                        C786410Ut5.Hd(imageView, pointF3.x - (drawable.getIntrinsicWidth() / 2.0f));
                                        C786410Ut5.Nd(imageView, pointF3.y - (drawable.getIntrinsicHeight() / 2.0f));
                                        C786410Ut5.Cb(imageView, 0.0f);
                                        ((FrameLayout) this.l1).addView(imageView);
                                        final long jAbs = (long) (((double) Math.abs(pointF4.y - pointF3.y)) * 0.4d);
                                        final float f2 = jAbs / 2.0f;
                                        final long j = jAbs - 60;
                                        final C013C c013c = new C013C();
                                        final C013C c013c2 = new C013C();
                                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        valueAnimatorOfFloat.setDuration(jAbs);
                                        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
                                        final View view2 = (View) this.l4;
                                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0GoX
                                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                float interpolation;
                                                boolean z;
                                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                                                C426880GoY c426880GoY3 = C426880GoY.LIZ;
                                                PointF pointF6 = pointF3;
                                                PointF pointF7 = pointF5;
                                                PointF pointF8 = pointF4;
                                                c426880GoY3.getClass();
                                                float f3 = 1 - animatedFraction;
                                                float f4 = f3 * f3;
                                                float f5 = 2;
                                                float f6 = f3 * f5;
                                                float f7 = f6 * animatedFraction;
                                                float f8 = animatedFraction * animatedFraction;
                                                PointF pointF9 = new PointF((pointF6.x * f4) + (pointF7.x * f7) + (pointF8.x * f8), (f4 * pointF6.y) + (f7 * pointF7.y) + (f8 * pointF8.y));
                                                PointF pointF10 = pointF3;
                                                PointF pointF11 = pointF5;
                                                PointF pointF12 = pointF4;
                                                float f9 = pointF11.x;
                                                float f10 = ((f9 - pointF10.x) * f6) + ((pointF12.x - f9) * f5 * animatedFraction);
                                                float f11 = pointF11.y;
                                                float degrees = (float) Math.toDegrees((float) Math.atan2((f6 * (f11 - pointF10.y)) + (r4 * (pointF12.y - f11)), f10));
                                                C786410Ut5.Hd(imageView, pointF9.x - (drawable.getIntrinsicWidth() / 2.0f));
                                                C786410Ut5.Nd(imageView, pointF9.y - (drawable.getIntrinsicHeight() / 2.0f));
                                                C786410Ut5.Cb(imageView, degrees + 90.0f);
                                                float f12 = currentPlayTime;
                                                float f13 = f2;
                                                float f14 = 1.0f;
                                                if (f12 <= f13) {
                                                    interpolation = (C1619980sG4.LIZLLL().getInterpolation(f12 / f13) * 0.5f) + 1.0f;
                                                } else if (currentPlayTime <= jAbs) {
                                                    interpolation = 1.5f - (C1619980sG4.LIZLLL().getInterpolation((f12 - f13) / f13) * 0.5f);
                                                } else {
                                                    interpolation = 1.0f;
                                                }
                                                C786410Ut5.Qb(imageView, interpolation);
                                                C786410Ut5.rc(imageView, interpolation);
                                                long j2 = j;
                                                if (currentPlayTime >= j2) {
                                                    if (j2 <= currentPlayTime && currentPlayTime <= jAbs) {
                                                        f14 = 1.0f - ((currentPlayTime - j2) / 60.0f);
                                                    } else {
                                                        f14 = 0.0f;
                                                    }
                                                }
                                                C786410Ut5.V4(imageView, f14);
                                                if (j <= currentPlayTime && currentPlayTime <= jAbs) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    C013C c013c3 = c013c;
                                                    if (!c013c3.element) {
                                                        c013c3.element = true;
                                                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "scaleX", 1.0f, 0.8f);
                                                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", 1.0f, 0.8f);
                                                        AnimatorSet animatorSet = new AnimatorSet();
                                                        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                                                        animatorSet.setDuration(60L);
                                                        animatorSet.setInterpolator(C1619980sG4.LIZLLL());
                                                        animatorSet.start();
                                                        return;
                                                    }
                                                }
                                                if (currentPlayTime < jAbs) {
                                                    return;
                                                }
                                                C013C c013c4 = c013c2;
                                                if (c013c4.element) {
                                                    return;
                                                }
                                                c013c4.element = true;
                                                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, "scaleX", 0.8f, 1.0f);
                                                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view2, "scaleY", 0.8f, 1.0f);
                                                AnimatorSet animatorSet2 = new AnimatorSet();
                                                animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                                                animatorSet2.setDuration(100L);
                                                animatorSet2.setInterpolator(C1619980sG4.LIZLLL());
                                                animatorSet2.start();
                                            }
                                        });
                                        valueAnimatorOfFloat.addListener(new ALAdapterS1S0300000_6((ViewGroup) this.l3, (FrameLayout) this.l1, (Function0) this.l2, 0));
                                        valueAnimatorOfFloat.start();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    ((Function0) this.l2).invoke();
                }
            }
        }
    }

    public final void LIZ$2() {
        View view = (View) this.l0;
        Function1 function1 = (Function1) this.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        function1.invoke(layoutParams);
        C786410Ut5.W5(view, layoutParams);
        View view2 = (View) this.l2;
        if (view2 != null) {
            Function1 function12 = (Function1) this.l3;
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            function12.invoke(layoutParams2);
            C786410Ut5.W5(view2, layoutParams2);
        }
        View view3 = (View) this.l4;
        if (view3 == null || view3.getParent() == null) {
            return;
        }
        ((View) this.l4).requestFocus();
    }

    public static final void run$0(ARunnableS5S0500000_6 aRunnableS5S0500000_6) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3ReplyAnimatorUtil@2ec0.playFriendsV3ReplyAnimate$1");
        try {
            aRunnableS5S0500000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3ReplyAnimatorUtil@2ec0.playFriendsV3ReplyAnimate$1");
    }

    public static final void run$1(ARunnableS5S0500000_6 aRunnableS5S0500000_6) {
        boolean zLIZ;
        C1C7U.LIZ("CoHostWindowView@cc83.animateEnigmaRevealTransition$1");
        try {
            aRunnableS5S0500000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CoHostWindowView@cc83.animateEnigmaRevealTransition$1");
    }

    public static final void run$2(ARunnableS5S0500000_6 aRunnableS5S0500000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SharedFeedEntranceTutorial@3453.show$layoutListener$1$onGlobalLayout$1");
        try {
            aRunnableS5S0500000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedFeedEntranceTutorial@3453.show$layoutListener$1$onGlobalLayout$1");
    }

    public ARunnableS5S0500000_6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
