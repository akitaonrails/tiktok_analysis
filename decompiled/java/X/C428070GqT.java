package X;

import Y.AAListenerS0S0911001_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GqT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428070GqT {
    public static void LIZ(final Context context, final LifecycleCoroutineScope lifecycleCoroutineScope, String str, final boolean z, final Integer num, final View view, ViewGroup viewGroup, final ViewGroup viewGroup2, final Function1 function1) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        if (C1508090pLb.LIZIZ()) {
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (context != null && view != null && viewGroup2 != null && viewGroup != null) {
            if (view.isShown() && viewGroup.isShown()) {
                final int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                final int[] iArr2 = new int[2];
                viewGroup2.getLocationOnScreen(iArr2);
                int i = iArr[0] - iArr2[0];
                int i2 = iArr[1] - iArr2[1];
                final int width = viewGroup.getWidth();
                final SmartImageView smartImageView = new SmartImageView(context);
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(smartImageView);
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZIZ = 0.0f;
                c1331750klB.LJ = width / 2;
                c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LIZLLL.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0GoA
                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view2) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                        C786410Ut5.LJJJLZIJ(smartImageView, viewGroup2);
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boolean.FALSE);
                        }
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(smartImageView, "alpha", 0.0f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(smartImageView, "scaleX", 1.0f, 0.2f);
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(smartImageView, "scaleY", 1.0f, 0.2f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        View view3 = view;
                        int[] iArr3 = iArr;
                        int i3 = width;
                        Context context2 = context;
                        boolean z2 = z;
                        int[] iArr4 = iArr2;
                        ViewGroup viewGroup3 = viewGroup2;
                        Integer num2 = num;
                        SmartImageView smartImageView2 = smartImageView;
                        LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
                        Function1<Boolean, Unit> function12 = function1;
                        animatorSet.setDuration(560L);
                        animatorSet.addListener(new AAListenerS0S0911001_6(view3, iArr3, i3, context2, z2, iArr4, viewGroup3, num2, smartImageView2, lifecycleCoroutineScope2, function12, 1));
                        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                        animatorSet.start();
                    }
                });
                C786410Ut5.u5(smartImageView, 0.0f);
                if (!z && i2 >= 0) {
                    if (viewGroup2 instanceof ConstraintLayout) {
                        C19ME c19me = new C19ME(width, width);
                        c19me.startToStart = 0;
                        c19me.topToTop = 0;
                        marginLayoutParams = c19me;
                    } else {
                        marginLayoutParams = new ViewGroup.MarginLayoutParams(width, width);
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    marginLayoutParams.topMargin = i2 + iIntValue;
                    marginLayoutParams.setMarginStart(i);
                    viewGroup2.addView(smartImageView, marginLayoutParams);
                    return;
                }
                if (viewGroup2 instanceof ConstraintLayout) {
                    C19ME c19me2 = new C19ME(width, width);
                    c19me2.startToStart = 0;
                    c19me2.endToEnd = 0;
                    c19me2.topToTop = 0;
                    c19me2.bottomToBottom = 0;
                    layoutParams = c19me2;
                } else if (viewGroup2 instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(width, width);
                    layoutParams2.gravity = 17;
                    layoutParams = layoutParams2;
                } else if (viewGroup2 instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(width, width);
                    layoutParams3.addRule(13, -1);
                    layoutParams = layoutParams3;
                } else {
                    layoutParams = new ViewGroup.LayoutParams(width, width);
                }
                viewGroup2.addView(smartImageView, layoutParams);
                return;
            }
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
                return;
            }
            return;
        }
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
    }
}
