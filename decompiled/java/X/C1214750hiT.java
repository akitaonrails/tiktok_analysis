package X;

import Y.ARunnableS119S0100000_19;
import Y.AUListenerS15S0102000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0hiT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214750hiT {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0hiU
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            final View view;
            C1214780hiW c1214780hiW;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleMessage,whatValue=");
            sbLIZ.append(message.what);
            sbLIZ.append(", realVal=");
            sbLIZ.append(message.arg1 + 1);
            sbLIZ.append(", view=");
            sbLIZ.append(HandlerHook.getMessageObj(message.obj));
            C2188811AlT.LIZIZ(sbLIZ);
            if (message.what != message.arg1 + 1) {
                return false;
            }
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (!(messageObj instanceof View) || (view = (View) messageObj) == null) {
                return false;
            }
            Object tag = view.getTag(R.id.s0z);
            if (!(tag instanceof C1214780hiW) || (c1214780hiW = (C1214780hiW) tag) == null) {
                return false;
            }
            if (((Boolean) C268390AfV.LIZ.getValue()).booleanValue()) {
                BPEAHandler bPEAHandler = C1214750hiT.LIZ;
                boolean z = c1214780hiW.LIZ;
                String str = c1214780hiW.LIZIZ;
                int i2 = c1214780hiW.LIZJ;
                Runnable runnable = c1214780hiW.LIZLLL;
                Runnable runnable2 = c1214780hiW.LJ;
                Runnable runnable3 = c1214780hiW.LJFF;
                Runnable runnable4 = c1214780hiW.LJI;
                Object parent = view.getParent();
                if (parent == null) {
                    C1214750hiT.LIZIZ(view, false);
                    return true;
                }
                view.clearAnimation();
                C786410Ut5.LJLLLLLL(8, view);
                view.measure(View.MeasureSpec.makeMeasureSpec(((View) parent).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = view.getMeasuredHeight();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("startComponentAnimation v2, height = [");
                sbLIZ2.append(measuredHeight);
                sbLIZ2.append(',');
                sbLIZ2.append(i2);
                sbLIZ2.append("], tag=");
                sbLIZ2.append(str);
                sbLIZ2.append(", view=");
                sbLIZ2.append(view);
                sbLIZ2.append(", parent=");
                sbLIZ2.append(parent);
                C1720106oR.LJI("AnimationUtils", C2188811AlT.LIZIZ(sbLIZ2));
                if (measuredHeight == i2) {
                    C1214750hiT.LIZIZ(view, false);
                    return true;
                }
                C1214750hiT.LIZ(view, i2, measuredHeight, z, runnable, runnable2, runnable3, runnable4);
                C786410Ut5.LJLIIL(300L, C1214750hiT.LIZ, new ARunnableS119S0100000_19(view, 235));
                return true;
            }
            BPEAHandler bPEAHandler2 = C1214750hiT.LIZ;
            final boolean z2 = c1214780hiW.LIZ;
            final String str2 = c1214780hiW.LIZIZ;
            final int i3 = c1214780hiW.LIZJ;
            final Runnable runnable5 = c1214780hiW.LIZLLL;
            final Runnable runnable6 = c1214780hiW.LJ;
            final Runnable runnable7 = c1214780hiW.LJFF;
            final Runnable runnable8 = c1214780hiW.LJI;
            view.clearAnimation();
            C786410Ut5.LJLLLLLL(8, view);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startComponentAnimation v2, currentHeight=");
            sbLIZ3.append(i3);
            sbLIZ3.append(", tag=");
            sbLIZ3.append(str2);
            sbLIZ3.append(", view=");
            sbLIZ3.append(view);
            C2188811AlT.LIZIZ(sbLIZ3);
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            C786410Ut5.y3(viewTreeObserver, new ViewTreeObserver.OnPreDrawListener() { // from class: X.0hiV
                public final AtomicInteger LL = new AtomicInteger(0);

                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    int measuredHeight2 = view.getMeasuredHeight();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("startComponentAnimation v3, layoutHeight=");
                    sbLIZ4.append(measuredHeight2);
                    sbLIZ4.append(", tag=");
                    sbLIZ4.append(str2);
                    sbLIZ4.append(", view=");
                    sbLIZ4.append(view);
                    sbLIZ4.append(", visible=");
                    sbLIZ4.append(view.getVisibility() == 0);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    if (!viewTreeObserver.isAlive()) {
                        return false;
                    }
                    if (measuredHeight2 != 0 || this.LL.getAndIncrement() >= 3) {
                        C786410Ut5.D3(viewTreeObserver, this);
                    }
                    int i4 = i3;
                    if (measuredHeight2 == i4) {
                        BPEAHandler bPEAHandler3 = C1214750hiT.LIZ;
                        C1214750hiT.LIZIZ(view, false);
                        return true;
                    }
                    BPEAHandler bPEAHandler4 = C1214750hiT.LIZ;
                    C1214750hiT.LIZ(view, i4, measuredHeight2, z2, runnable5, runnable6, runnable7, runnable8);
                    return true;
                }
            });
            C786410Ut5.LJLIIL(300L, C1214750hiT.LIZ, new ARunnableS119S0100000_19(view, 234));
            return true;
        }
    });

    public static void LIZIZ(View view, boolean z) {
        if (z) {
            view.getLayoutParams().height = -2;
        }
        C786410Ut5.LJLLLLLL(0, view);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("AnimationUtils", "resetViewVisible");
    }

    public static void LIZ(final View view, int i, int i2, boolean z, final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        C786410Ut5.LJLILLLLZI(LIZ, 2);
        C786410Ut5.LJLLLLLL(8, view);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        view.clearAnimation();
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS15S0102000_17(view, i, i2 - i, 2));
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0hiS
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                Runnable runnable5 = runnable3;
                if (runnable5 != null) {
                    runnable5.run();
                }
                BPEAHandler bPEAHandler = C1214750hiT.LIZ;
                C1214750hiT.LIZIZ(view, true);
                C1214750hiT.LIZ.removeMessages(2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Runnable runnable5 = runnable2;
                if (runnable5 != null) {
                    runnable5.run();
                }
                BPEAHandler bPEAHandler = C1214750hiT.LIZ;
                C1214750hiT.LIZIZ(view, true);
                C1214750hiT.LIZ.removeMessages(2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                Runnable runnable5 = runnable4;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                Runnable runnable5 = runnable;
                if (runnable5 != null) {
                    runnable5.run();
                }
                BPEAHandler bPEAHandler = C1214750hiT.LIZ;
                C1214750hiT.LIZIZ(view, false);
            }
        });
        if (z) {
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.reverse();
        }
    }
}
