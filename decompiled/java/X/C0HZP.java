package X;

import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS216S0200000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0HZP, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HZP {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
    public static final Map<View, ValueAnimator> LJ = new LinkedHashMap();

    public static void LIZIZ(int i, View view) {
        DrawableWrapper drawableWrapper;
        GradientDrawable gradientDrawable;
        Drawable background = view.getBackground();
        if ((background instanceof InsetDrawable) && (drawableWrapper = (DrawableWrapper) background) != null) {
            Drawable drawable = drawableWrapper.getDrawable();
            if ((drawable instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable) != null) {
                gradientDrawable.setColor(Color.argb(i, 0, 0, 0));
            }
        }
    }

    public static void LIZ(TuxIconView tuxIconView, View view, boolean z) {
        View view2;
        int iIntValue;
        Integer numLIZJ;
        View view3;
        int iIntValue2;
        int iIntValue3;
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams;
        int iIntValue4;
        Integer numLIZJ2;
        if (!C268330AfP.LIZLLL()) {
            return;
        }
        if (z) {
            if (tuxIconView != null) {
                Context context = tuxIconView.getContext();
                if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.agr, context)) != null) {
                    iIntValue4 = numLIZJ2.intValue();
                } else {
                    iIntValue4 = -1;
                }
                tuxIconView.setTintColor(iIntValue4);
            }
            if (view == null) {
                if (tuxIconView != null) {
                    view3 = tuxIconView;
                } else {
                    return;
                }
            } else {
                view3 = view;
            }
            Map<View, ValueAnimator> map = LJ;
            ValueAnimator valueAnimator = (ValueAnimator) ((LinkedHashMap) map).get(view3);
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (view != null) {
                if (view.getBackground() != null) {
                    LIZIZ(102, view);
                    if (tuxIconView != null) {
                        tuxIconView.setIconHeight(LIZLLL);
                        tuxIconView.setIconWidth(LIZLLL);
                        return;
                    }
                    return;
                }
                if (view != null) {
                    Integer numValueOf2 = Integer.valueOf(view.getWidth());
                    if (numValueOf2.intValue() > 0 || ((layoutParams = view.getLayoutParams()) != null && (numValueOf2 = Integer.valueOf(layoutParams.width)) != null)) {
                        iIntValue2 = numValueOf2.intValue();
                    } else {
                        iIntValue2 = LIZIZ;
                    }
                    Integer numValueOf3 = Integer.valueOf(view.getHeight());
                    if (numValueOf3.intValue() > 0) {
                        iIntValue3 = numValueOf3.intValue();
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if (layoutParams2 != null && (numValueOf = Integer.valueOf(layoutParams2.height)) != null) {
                            iIntValue3 = numValueOf.intValue();
                        } else {
                            iIntValue3 = LIZIZ;
                        }
                    }
                    int i = LIZ;
                    int i2 = (iIntValue2 - i) / 2;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int i3 = (iIntValue3 - i) / 2;
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(Color.argb(0, 0, 0, 0));
                    view.setBackground(new InsetDrawable((Drawable) gradientDrawable, i2, i3, i2, i3));
                }
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(250L);
            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS216S0200000_6(view, tuxIconView, 28));
            map.put(view3, valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            return;
        }
        if (tuxIconView != null) {
            Context context2 = tuxIconView.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            tuxIconView.setTintColor(iIntValue);
        }
        if (view == null) {
            if (tuxIconView == null) {
                return;
            } else {
                view2 = tuxIconView;
            }
        } else {
            view2 = view;
        }
        Map<View, ValueAnimator> map2 = LJ;
        ValueAnimator valueAnimator2 = (ValueAnimator) ((LinkedHashMap) map2).get(view2);
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        if (view != null && view.getBackground() != null) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(250L);
            valueAnimatorOfFloat2.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS216S0200000_6(view, tuxIconView, 27));
            valueAnimatorOfFloat2.addListener(new ALAdapterS3S0100000_6(view, 64));
            map2.put(view2, valueAnimatorOfFloat2);
            valueAnimatorOfFloat2.start();
            return;
        }
        if (tuxIconView == null) {
            return;
        }
        tuxIconView.setIconHeight(LIZJ);
        tuxIconView.setIconWidth(LIZJ);
    }
}
