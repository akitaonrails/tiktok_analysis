package X;

import Y.ARunnableS20S0400000_11;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS255S0300000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699370Rbz {
    public final Function1<String, C699090RbX<ComponentPriorityProtocol>> LIZ;
    public final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, ValueAnimator> LIZJ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public C699370Rbz(Function1<? super String, C699090RbX<ComponentPriorityProtocol>> function1) {
        this.LIZ = function1;
    }

    public static boolean LJ(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            if (view.getHeight() > 0) {
                return true;
            }
            return false;
        }
        if (layoutParams.height != 0 && view.getHeight() > 0) {
            return true;
        }
        return false;
    }

    public static void LJFF(View view) {
        view.animate().cancel();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height != -2) {
            layoutParams.height = -2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public final void LIZIZ(String str) {
        ValueAnimator valueAnimatorRemove = this.LIZJ.remove(str);
        if (valueAnimatorRemove != null) {
            valueAnimatorRemove.cancel();
        }
    }

    public final void LIZJ(String str, String str2) {
        if (Intrinsics.LJFF(this.LIZIZ.get(str), str2)) {
            this.LIZIZ.remove(str);
        }
    }

    public final void LIZLLL(C699810Rch c699810Rch, C699390Rc1 c699390Rc1) {
        C699090RbX<ComponentPriorityProtocol> c699090RbXInvoke;
        if (!C299710Bov.LIZ() || (c699090RbXInvoke = this.LIZ.invoke(c699810Rch.LIZ)) == null) {
            return;
        }
        View viewXb = c699090RbXInvoke.LL.xb();
        this.LIZIZ.put(c699810Rch.LIZ, c699390Rc1.LIZ);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            if (Intrinsics.LJFF(this.LIZIZ.get(c699810Rch.LIZ), c699390Rc1.LIZ)) {
                LIZIZ(c699810Rch.LIZ);
                LJFF(viewXb);
                if (c699390Rc1.LJFF != EnumC1986107qF.NONE && LJ(viewXb)) {
                    LIZJ(c699810Rch.LIZ, c699390Rc1.LIZ);
                    return;
                }
                String str = c699810Rch.LIZ;
                if (c699390Rc1.LJFF == EnumC1986107qF.SLIDE_FROM_BOTTOM) {
                    LIZ(str, viewXb, true, null);
                }
                LIZJ(c699810Rch.LIZ, c699390Rc1.LIZ);
                return;
            }
            return;
        }
        C637920P0k.LIZ(viewXb, new ARunnableS20S0400000_11(this, c699810Rch, c699390Rc1, viewXb, 0));
    }

    public final void LIZ(final String str, final View view, final boolean z, final AwS255S0300000_11 awS255S0300000_11) {
        int iMakeMeasureSpec;
        View view2;
        int measuredHeight;
        int iIntValue;
        final ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i = 0;
        if (view.getHeight() > 0) {
            measuredHeight = view.getHeight();
        } else {
            if (view.getMeasuredWidth() > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
            } else {
                Object parent = view.getParent();
                if ((parent instanceof View) && (view2 = (View) parent) != null && view2.getWidth() > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(((View) view.getParent()).getWidth(), 1073741824);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
            }
            view.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = view.getMeasuredHeight();
        }
        if (z) {
            iIntValue = 0;
        } else {
            Integer numValueOf = Integer.valueOf(view.getHeight());
            if (numValueOf.intValue() > 0) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = measuredHeight;
            }
            measuredHeight = 0;
        }
        if (iIntValue == measuredHeight) {
            if (z) {
                i = -2;
            }
            layoutParams.height = i;
            C786410Ut5.W5(view, layoutParams);
            if (awS255S0300000_11 != null) {
                awS255S0300000_11.invoke();
                return;
            }
            return;
        }
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iIntValue, measuredHeight);
        this.LIZJ.put(str, valueAnimatorOfInt);
        valueAnimatorOfInt.setDuration(220L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Rc7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (this.LL.LIZJ.get(str) != valueAnimatorOfInt) {
                    return;
                }
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C786410Ut5.W5(view, layoutParams);
            }
        });
        valueAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0Rc5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i2;
                if (this.LL.LIZJ.get(str) != animator) {
                    return;
                }
                this.LL.LIZJ.remove(str);
                ViewGroup.LayoutParams layoutParams2 = layoutParams;
                if (z) {
                    i2 = -2;
                } else {
                    i2 = 0;
                }
                layoutParams2.height = i2;
                C786410Ut5.W5(view, layoutParams);
                Function0<Unit> function0 = awS255S0300000_11;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
        valueAnimatorOfInt.start();
    }
}
