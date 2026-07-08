package X;

import Y.ALAdapterS3S0000000_26;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0w3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class KeyEventCallbackC1765760w3C implements KeyEvent.Callback {
    public static int LLILLL;
    public static int LLILZ;
    public static C1765780w3E LLILZIL;
    public static Window.Callback LLILZLL;
    public static C1765720w38 LLIZ;
    public static C1765720w38 LLIZLLLIL;
    public static ViewGroup LLJ;
    public static ViewGroup.LayoutParams LLJI;
    public static ViewGroup LLJIJIL;
    public static ImageView LLJILJIL;
    public static float LLJILJILJ;
    public static float LLJILLL;
    public static float LLJJ;
    public static float LLJJI;
    public static final KeyEventCallbackC1765760w3C LL = new KeyEventCallbackC1765760w3C();
    public static final int[] LLILLJJLI = new int[2];
    public static EnumC1508450pMB LLJJIII = EnumC1508450pMB.PREVIEW;

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    public static void LIZIZ(boolean z) {
        Context context;
        Window window$player_release;
        Window window$player_release2;
        C1765720w38 c1765720w38;
        LifecycleOwner lifecycleOwner;
        Activity activity;
        Window window$player_release3;
        C1765720w38 c1765720w382;
        LifecycleOwner lifecycleOwner2;
        View statusBarView;
        C1547940qNs videoView;
        Bitmap videoFrame;
        C1765720w38 c1765720w383 = LLIZ;
        if (c1765720w383 != null) {
            context = c1765720w383.getContext();
        } else {
            context = null;
        }
        C1765720w38 c1765720w384 = LLIZ;
        if (c1765720w384 != null) {
            window$player_release = c1765720w384.getWindow$player_release();
        } else {
            window$player_release = null;
        }
        Window.Callback callback = LLILZLL;
        if (callback != null && window$player_release != null) {
            window$player_release.setCallback(callback);
        }
        if (LLJJIII == EnumC1508450pMB.PORTRAIT) {
            LLJJIII = EnumC1508450pMB.PREVIEW;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ImageView imageView = LLJILJIL;
            C1765720w38 c1765720w385 = LLIZ;
            if (c1765720w385 != null && (videoView = c1765720w385.getVideoView()) != null && (videoFrame = videoView.getVideoFrame()) != null && imageView != null) {
                imageView.setImageBitmap(videoFrame);
            }
            LIZ(LLJILJIL, LLJIJIL, null);
            LIZJ(LLIZ);
            C1765720w38 c1765720w386 = LLIZ;
            if (c1765720w386 != null) {
                ViewGroup.LayoutParams layoutParams = LLJI;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1765720w386);
                c1765720w386.setLayoutParams(layoutParams);
            }
            LIZ(LLIZ, LLJ, null);
            C1765720w38 c1765720w387 = LLIZ;
            if (c1765720w387 != null && (window$player_release3 = c1765720w387.getWindow$player_release()) != null) {
                C1765720w38 c1765720w388 = LLIZ;
                if (c1765720w388 != null && (statusBarView = c1765720w388.getStatusBarView()) != null) {
                    C786410Ut5.LJLLLLLL(8, statusBarView);
                }
                C19EG c19eg = (C19EG) context;
                TuxImmersionBar tuxImmersionBarLJI = C1766560w4U.LJI(c19eg, window$player_release3);
                tuxImmersionBarLJI.LIZJ(false, false);
                tuxImmersionBarLJI.LIZIZ.LJIIJ(true);
                tuxImmersionBarLJI.LIZIZ.LJIIL();
                tuxImmersionBarLJI.LJFF(-1);
                tuxImmersionBarLJI.LIZIZ.LJII(true);
                if (z && (c1765720w382 = LLIZ) != null && (lifecycleOwner2 = ViewTreeLifecycleOwner.get(c1765720w382)) != null) {
                    TuxImmersionBar.LIZIZ(lifecycleOwner2, c19eg, window$player_release3);
                }
                tuxImmersionBarLJI.LIZLLL();
            }
            C1765720w38 c1765720w389 = LLIZLLLIL;
            if (c1765720w389 != null) {
                c1765720w389.LJ(LLJJIII);
            }
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0w3D
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) KeyEventCallbackC1765760w3C.LLJILJIL.getLayoutParams();
                    float f = KeyEventCallbackC1765760w3C.LLJILLL;
                    float f2 = KeyEventCallbackC1765760w3C.LLJJI;
                    float f3 = 2;
                    float f4 = (f - f2) / f3;
                    int[] iArr = KeyEventCallbackC1765760w3C.LLILLJJLI;
                    marginLayoutParams.topMargin = (int) (f4 + ((iArr[1] - f4) * fFloatValue));
                    float f5 = KeyEventCallbackC1765760w3C.LLJILJILJ;
                    float f6 = KeyEventCallbackC1765760w3C.LLJJ;
                    float f7 = (f5 - f6) / f3;
                    marginLayoutParams.leftMargin = (int) (f7 + ((iArr[0] - f7) * fFloatValue));
                    float f8 = KeyEventCallbackC1765760w3C.LLILZ;
                    float f9 = 1.0f - fFloatValue;
                    marginLayoutParams.width = (int) (f8 + ((f6 - f8) * f9));
                    float f10 = KeyEventCallbackC1765760w3C.LLILLL;
                    marginLayoutParams.height = (int) (f10 + (f9 * (f2 - f10)));
                    ImageView imageView2 = KeyEventCallbackC1765760w3C.LLJILJIL;
                    if (imageView2 != null) {
                        C786410Ut5.c6(imageView2, marginLayoutParams);
                    }
                }
            });
            valueAnimatorOfFloat.addListener(new ALAdapterS3S0000000_26(1));
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setInterpolator(new AccelerateInterpolator());
            valueAnimatorOfFloat.start();
            return;
        }
        if (LLJJIII != EnumC1508450pMB.HORIZONTAL) {
            return;
        }
        LLJJIII = EnumC1508450pMB.PREVIEW;
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            try {
                activity.setRequestedOrientation(1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZJ(LLIZ);
        C1765720w38 c1765720w3810 = LLIZ;
        if (c1765720w3810 != null) {
            ViewGroup.LayoutParams layoutParams2 = LLJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1765720w3810);
            c1765720w3810.setLayoutParams(layoutParams2);
        }
        LIZ(LLIZ, LLJ, null);
        C1765720w38 c1765720w3811 = LLIZ;
        if (c1765720w3811 != null && (window$player_release2 = c1765720w3811.getWindow$player_release()) != null) {
            C19EG c19eg2 = (C19EG) context;
            TuxImmersionBar tuxImmersionBarLJI2 = C1766560w4U.LJI(c19eg2, window$player_release2);
            tuxImmersionBarLJI2.LIZJ(false, false);
            tuxImmersionBarLJI2.LIZIZ.LJIIJ(true);
            tuxImmersionBarLJI2.LIZIZ.LJIIL();
            tuxImmersionBarLJI2.LJFF(-1);
            tuxImmersionBarLJI2.LIZIZ.LJII(true);
            if (z && (c1765720w38 = LLIZ) != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(c1765720w38)) != null) {
                TuxImmersionBar.LIZIZ(lifecycleOwner, c19eg2, window$player_release2);
            }
            tuxImmersionBarLJI2.LIZLLL();
        }
        C1765720w38 c1765720w3812 = LLIZLLLIL;
        if (c1765720w3812 != null) {
            c1765720w3812.LJ(LLJJIII);
        }
        LLJIJIL = null;
        LLJILJIL = null;
        LLIZ = null;
        LLJ = null;
        LLJI = null;
        LLIZLLLIL = null;
        LLILZIL = null;
        LLILZLL = null;
    }

    public static void LIZJ(View view) {
        ViewGroup viewGroup;
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                try {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if ((LLJJIII != EnumC1508450pMB.PORTRAIT && LLJJIII != EnumC1508450pMB.HORIZONTAL) || i != 4 || keyEvent.isCanceled()) {
            return false;
        }
        LIZIZ(false);
        return true;
    }

    public static void LIZ(View view, ViewGroup viewGroup, Integer num) {
        int childCount;
        if (viewGroup != null) {
            try {
                if (num != null) {
                    childCount = num.intValue();
                } else {
                    childCount = viewGroup.getChildCount();
                }
                viewGroup.addView(view, childCount);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
