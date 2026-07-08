package X;

import Y.AUListenerS153S0300000_18;
import Y.AUListenerS225S0200000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.uiwidget.gallery.PoiGalleryAnchorData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0gtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182990gtF {
    public static final C1182990gtF LIZ = new C1182990gtF();

    public static void LIZ(C19GS c19gs) {
        View viewFindViewById = c19gs.findViewById(R.id.r2i);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS267S0100000_18(viewFindViewById, 8));
        valueAnimatorOfFloat.start();
    }

    public static void LIZJ(C19GS c19gs) {
        View viewFindViewById = c19gs.findViewById(R.id.r2i);
        View viewFindViewById2 = c19gs.findViewById(R.id.r2n);
        View viewFindViewById3 = c19gs.findViewById(R.id.r31);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS153S0300000_18(viewFindViewById, viewFindViewById2, viewFindViewById3, 0));
        valueAnimatorOfFloat.start();
    }

    public static void LJ(final C19GS c19gs) {
        View viewFindViewById = c19gs.findViewById(R.id.r2i);
        View viewFindViewById2 = c19gs.findViewById(R.id.r2n);
        View viewFindViewById3 = c19gs.findViewById(R.id.r31);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setStartOffset(100L);
        final int i = 0;
        alphaAnimation.setAnimationListener(new Animation.AnimationListener(c19gs, i) { // from class: X.0hYl
            public final int $t;
            public Object l0;

            public static final void onAnimationRepeat$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationRepeat$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationStart$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationStart$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationEnd$0(this, animation);
                        break;
                    case 1:
                        onAnimationEnd$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationRepeat$0(this, animation);
                        break;
                    case 1:
                        onAnimationRepeat$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationStart$0(this, animation);
                        break;
                    case 1:
                        onAnimationStart$1(this, animation);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = c19gs;
            }

            public static final void onAnimationEnd$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
                ((C19GS) animationAnimationListenerC1208730hYl.l0).finish();
            }

            public static final void onAnimationEnd$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
                ((C19GS) animationAnimationListenerC1208730hYl.l0).finish();
            }
        });
        viewFindViewById2.startAnimation(alphaAnimation);
        viewFindViewById.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setFillAfter(true);
        alphaAnimation2.setDuration(200L);
        final int i2 = 1;
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener(c19gs, i2) { // from class: X.0hYl
            public final int $t;
            public Object l0;

            public static final void onAnimationRepeat$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationRepeat$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationStart$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            public static final void onAnimationStart$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationEnd$0(this, animation);
                        break;
                    case 1:
                        onAnimationEnd$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationRepeat$0(this, animation);
                        break;
                    case 1:
                        onAnimationRepeat$1(this, animation);
                        break;
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                switch (this.$t) {
                    case 0:
                        onAnimationStart$0(this, animation);
                        break;
                    case 1:
                        onAnimationStart$1(this, animation);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = c19gs;
            }

            public static final void onAnimationEnd$0(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
                ((C19GS) animationAnimationListenerC1208730hYl.l0).finish();
            }

            public static final void onAnimationEnd$1(AnimationAnimationListenerC1208730hYl animationAnimationListenerC1208730hYl, Animation animation) {
                ((C19GS) animationAnimationListenerC1208730hYl.l0).finish();
            }
        });
        viewFindViewById3.startAnimation(alphaAnimation2);
    }

    public static boolean LJFF(int i, ArrayList arrayList) {
        PoiGalleryAnchorData poiGalleryAnchorData;
        if (arrayList == null || i < 0 || i >= arrayList.size() || 1 == 0 || (poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i)) == null || poiGalleryAnchorData.x < 0 || poiGalleryAnchorData.y < 0 || poiGalleryAnchorData.w <= 0 || poiGalleryAnchorData.h <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Context context, ArrayList arrayList, C19HL c19hl, int i) {
        View viewFindViewById;
        C19GS c19gs;
        C19GS c19gs2;
        boolean z = context instanceof C19GS;
        View viewFindViewById2 = null;
        if (z && (c19gs2 = (C19GS) context) != null) {
            viewFindViewById = c19gs2.findViewById(R.id.r2i);
        } else {
            viewFindViewById = null;
        }
        if (z && (c19gs = (C19GS) context) != null) {
            viewFindViewById2 = c19gs.findViewById(R.id.r2n);
        }
        PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
        if (poiGalleryAnchorData != null && poiGalleryAnchorData.x >= 0 && poiGalleryAnchorData.y >= 0 && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
            Matrix matrixLIZLLL = C19HN.LIZLLL();
            RectF rectFLJFF = C19HN.LJFF();
            c19hl.LJI(rectFLJFF);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryDoStartAnimWithAnchor currentAnchor x: ");
            sbLIZ.append(poiGalleryAnchorData.x);
            sbLIZ.append(", y: ");
            sbLIZ.append(poiGalleryAnchorData.y);
            sbLIZ.append(", w: ");
            sbLIZ.append(poiGalleryAnchorData.w);
            sbLIZ.append(", h: ");
            sbLIZ.append(poiGalleryAnchorData.h);
            sbLIZ.append("; \n bound: x: ");
            sbLIZ.append(rectFLJFF.left);
            sbLIZ.append(", y: ");
            sbLIZ.append(rectFLJFF.top);
            sbLIZ.append(", w: ");
            sbLIZ.append(rectFLJFF.width());
            sbLIZ.append(", h: ");
            sbLIZ.append(rectFLJFF.height());
            C2188811AlT.LIZIZ(sbLIZ);
            float f = 2;
            matrixLIZLLL.postScale(poiGalleryAnchorData.w / rectFLJFF.width(), poiGalleryAnchorData.h / rectFLJFF.height(), (rectFLJFF.width() / f) + rectFLJFF.left, (rectFLJFF.height() / f) + rectFLJFF.top);
            matrixLIZLLL.postTranslate((poiGalleryAnchorData.x + (poiGalleryAnchorData.w / 2)) - ((rectFLJFF.left + c19hl.getLeft()) + (rectFLJFF.width() / f)), ((poiGalleryAnchorData.y - C12ES.LJIIJJI(context)) + (poiGalleryAnchorData.h / 2)) - ((rectFLJFF.top + c19hl.getTop()) + (rectFLJFF.height() / f)));
            c19hl.LJIIJJI(matrixLIZLLL, 0L, null, null);
            C19HN.LIZJ(matrixLIZLLL);
            Matrix matrixLIZLLL2 = C19HN.LIZLLL();
            c19hl.LJIIJJI(matrixLIZLLL2, 300L, null, new AUListenerS225S0200000_18(viewFindViewById, viewFindViewById2, 0));
            C19HN.LIZJ(matrixLIZLLL2);
        }
    }

    public static void LIZLLL(final Context context, ArrayList arrayList, final C19HL c19hl, int i) {
        final C19GS c19gs;
        C19GS c19gs2;
        final float alpha;
        RectF rectF;
        Unit unit = null;
        if ((context instanceof C19GS) && (c19gs = (C19GS) context) != null) {
            final Window window = c19gs.getWindow();
            final View viewFindViewById = c19gs.findViewById(R.id.r2i);
            final View viewFindViewById2 = c19gs.findViewById(R.id.r2n);
            final View viewFindViewById3 = c19gs.findViewById(R.id.r2y);
            PoiGalleryAnchorData poiGalleryAnchorData = (PoiGalleryAnchorData) ListProtector.get(arrayList, i);
            if (poiGalleryAnchorData != null && poiGalleryAnchorData.x >= 0 && poiGalleryAnchorData.y >= 0 && poiGalleryAnchorData.w > 0 && poiGalleryAnchorData.h > 0) {
                Drawable drawable = c19hl.getDrawable();
                if (drawable == null) {
                    try {
                        c19hl.LLIZLLLIL = false;
                        c19hl.invalidate();
                        C786410Ut5.LLFZ(4, c19hl);
                        if ((context instanceof C19GS) && (c19gs2 = (C19GS) context) != null) {
                            c19gs2.finish();
                            unit = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                        return;
                    }
                }
                final RectF rectFLJI = c19hl.LJI(new RectF());
                final Matrix matrixLJII = c19hl.LJII(new Matrix());
                matrixLJII.postConcat(c19hl.LLJJIJI);
                if (viewFindViewById != null) {
                    alpha = viewFindViewById.getAlpha();
                } else {
                    alpha = 0.0f;
                }
                int[] iArr = new int[2];
                c19hl.getLocationOnScreen(iArr);
                RectF rectF2 = new RectF(poiGalleryAnchorData.x - iArr[0], poiGalleryAnchorData.y - iArr[1], r2 + poiGalleryAnchorData.w, r7 + poiGalleryAnchorData.h);
                LIZ.getClass();
                final Matrix matrix = new Matrix();
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth > 0.0f && intrinsicHeight > 0.0f) {
                    float fWidth = rectF2.width();
                    float fHeight = rectF2.height();
                    float f = fWidth / intrinsicWidth;
                    float f2 = fHeight / intrinsicHeight;
                    if (f < f2) {
                        f = f2;
                    }
                    float f3 = rectF2.left + ((fWidth - (intrinsicWidth * f)) * 0.5f);
                    float f4 = rectF2.top + ((fHeight - (intrinsicHeight * f)) * 0.5f);
                    matrix.setScale(f, f);
                    matrix.postTranslate(f3, f4);
                }
                if (poiGalleryAnchorData.visibleW > 0 && poiGalleryAnchorData.visibleH > 0) {
                    rectF = new RectF(poiGalleryAnchorData.visibleX - iArr[0], poiGalleryAnchorData.visibleY - iArr[1], r7 + poiGalleryAnchorData.visibleW, r6 + poiGalleryAnchorData.visibleH);
                    if (!rectF.intersect(rectF2)) {
                        rectF.set(rectF2);
                    }
                } else {
                    rectF = rectF2;
                }
                final int statusBarColor = window.getStatusBarColor();
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.bix, typedValue, true);
                final int i2 = typedValue.data;
                final int navigationBarColor = window.getNavigationBarColor();
                TypedValue typedValue2 = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.bix, typedValue2, true);
                final int i3 = typedValue2.data;
                final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
                final C1A6V c1a6v = new C1A6V(window, window.getDecorView());
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                final RectF rectF3 = rectF;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0gtI
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fExp;
                        float f5;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        RectF rectF4 = rectFLJI;
                        float f6 = rectF4.left;
                        RectF rectF5 = rectF3;
                        float f7 = f6 + ((rectF5.left - f6) * fFloatValue);
                        float f8 = rectF4.top;
                        float f9 = f8 + ((rectF5.top - f8) * fFloatValue);
                        float f10 = rectF4.right;
                        float f11 = f10 + ((rectF5.right - f10) * fFloatValue);
                        float f12 = rectF4.bottom;
                        c19hl.setAnimClipRect(new RectF(f7, f9, f11, f12 + ((rectF5.bottom - f12) * fFloatValue)));
                        C1182990gtF c1182990gtF = C1182990gtF.LIZ;
                        Matrix matrix2 = matrixLJII;
                        Matrix matrix3 = matrix;
                        c1182990gtF.getClass();
                        float[] fArr = new float[9];
                        float[] fArr2 = new float[9];
                        matrix2.getValues(fArr);
                        matrix3.getValues(fArr2);
                        float f13 = fArr[0];
                        float f14 = fArr2[0];
                        float f15 = 0.0f;
                        if (f13 > 0.0f && f14 > 0.0f) {
                            fExp = (float) (((double) f13) * Math.exp(Math.log(f14 / f13) * ((double) fFloatValue)));
                        } else {
                            fExp = f13 + ((f14 - f13) * fFloatValue);
                        }
                        float f16 = fArr[2];
                        float f18 = fArr[5];
                        float f19 = f16 + ((fArr2[2] - f16) * fFloatValue);
                        float f20 = f18 + ((fArr2[5] - f18) * fFloatValue);
                        Matrix matrix4 = new Matrix();
                        matrix4.setScale(fExp, fExp);
                        matrix4.postTranslate(f19, f20);
                        c19hl.setAnimContentMatrix(matrix4);
                        View view = viewFindViewById;
                        if (view != null) {
                            float f21 = alpha;
                            C786410Ut5.T4(view, f21 - (f21 * fFloatValue));
                        }
                        View view2 = viewFindViewById2;
                        float f22 = 1.0f - (2 * fFloatValue);
                        if (f22 < 0.0f) {
                            f5 = 0.0f;
                        } else {
                            f5 = f22;
                        }
                        C786410Ut5.T4(view2, f5);
                        View view3 = viewFindViewById3;
                        if (view3 != null) {
                            if (f22 >= 0.0f) {
                                f15 = f22;
                            }
                            C786410Ut5.T4(view3, f15);
                        }
                        window.setStatusBarColor(((Integer) argbEvaluator.evaluate(fFloatValue, Integer.valueOf(statusBarColor), Integer.valueOf(i2))).intValue());
                        window.setNavigationBarColor(((Integer) argbEvaluator.evaluate(fFloatValue, Integer.valueOf(navigationBarColor), Integer.valueOf(i3))).intValue());
                        if (fFloatValue > 0.5f) {
                            C1A6V c1a6v2 = c1a6v;
                            if (c1a6v2 != null) {
                                c1a6v2.LIZJ(true);
                                return;
                            }
                            return;
                        }
                        C1A6V c1a6v3 = c1a6v;
                        if (c1a6v3 == null) {
                            return;
                        }
                        c1a6v3.LIZJ(false);
                    }
                });
                valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0gtG
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        onAnimationEnd(animator);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Activity activity;
                        C19HL c19hl2 = c19hl;
                        c19hl2.setImageMatrix(c19hl2.getAnimContentMatrix());
                        C19HL c19hl3 = c19hl;
                        c19hl3.LLIZLLLIL = false;
                        c19hl3.invalidate();
                        C786410Ut5.LLFZ(4, c19hl);
                        Context context2 = context;
                        if ((context2 instanceof C19GS) && (activity = (Activity) context2) != null) {
                            activity.finish();
                        }
                        C786410Ut5.be(c19gs, 0, 0);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C19HL c19hl2 = c19hl;
                        c19hl2.LLIZLLLIL = true;
                        c19hl2.invalidate();
                    }
                });
                valueAnimatorOfFloat.start();
            }
        }
    }
}
