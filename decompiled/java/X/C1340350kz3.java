package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0kz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340350kz3 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(458));

    public static final void LIZIZ(AppCompatTextView appCompatTextView) {
        C01GW c01gw = LIZ;
        if (c01gw.getValue() != null && appCompatTextView != null) {
            appCompatTextView.setTypeface((Typeface) c01gw.getValue());
        }
    }

    public static final void LIZJ(TuxTextView tuxTextView) {
        Integer numLIZJ;
        Context context = tuxTextView.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1s, context)) != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
    }

    public static final void LIZLLL(AppCompatTextView appCompatTextView) {
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setTextSize(2, 15.0f);
    }

    public static final void LJ(TuxTextView tuxTextView) {
        if (tuxTextView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iLIZ = C0HD5.LIZ(tuxTextView, 4);
            int iLIZ2 = C0HD5.LIZ(tuxTextView, 4);
            int marginStart = marginLayoutParams.getMarginStart();
            int marginEnd = marginLayoutParams.getMarginEnd();
            marginLayoutParams.setMarginStart(marginStart);
            marginLayoutParams.topMargin = iLIZ;
            marginLayoutParams.setMarginEnd(marginEnd);
            marginLayoutParams.bottomMargin = iLIZ2;
            C786410Ut5.W5(tuxTextView, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void LIZ(View view, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int marginStart = marginLayoutParams.getMarginStart();
                int marginEnd = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = 0;
                C786410Ut5.W5(view, layoutParams);
                view.setPaddingRelative(view.getPaddingStart(), 0, view.getPaddingEnd(), 0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        if (tuxTextView != null) {
            tuxTextView.setPaddingRelative(tuxTextView.getPaddingStart(), C0HD5.LIZ(tuxTextView, 4), tuxTextView.getPaddingEnd(), C0HD5.LIZ(tuxTextView, 4));
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setPaddingRelative(tuxTextView2.getPaddingStart(), C0HD5.LIZ(tuxTextView2, 4), 0, C0HD5.LIZ(tuxTextView2, 4));
            C0H9H.LIZLLL(0, tuxTextView2);
        }
    }

    public static final void LJFF(int i, final View view, boolean z) {
        float f;
        float f2 = 12.0f;
        if (i != 2) {
            f = 8.0f;
            if (i != 3) {
                if (i != 4) {
                    f2 = 10.0f;
                } else {
                    f2 = 8.0f;
                }
                f = 4.0f;
            }
        } else {
            f = 2.0f;
        }
        int iLIZJ = (int) C12ES.LIZJ(f, view.getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(f2, view.getContext());
        if (iLIZJ != view.getPaddingTop()) {
            if (z) {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(new Object(view) { // from class: X.0kz4
                    public final View LIZ;

                    {
                        this.LIZ = view;
                    }
                }, "paddingTop", view.getPaddingTop(), iLIZJ);
                ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(new Object(view) { // from class: X.0kz4
                    public final View LIZ;

                    {
                        this.LIZ = view;
                    }
                }, "paddingBottom", view.getPaddingBottom(), iLIZJ2);
                Animator animator = objectAnimatorOfInt;
                if (objectAnimatorOfInt == null) {
                    animator = objectAnimatorOfInt2;
                    if (objectAnimatorOfInt2 == null) {
                        return;
                    }
                } else if (objectAnimatorOfInt2 != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2);
                    animator = animatorSet;
                }
                animator.setDuration(250L);
                animator.start();
                return;
            }
            view.setPaddingRelative(view.getPaddingStart(), iLIZJ, view.getPaddingEnd(), iLIZJ2);
        }
    }
}
