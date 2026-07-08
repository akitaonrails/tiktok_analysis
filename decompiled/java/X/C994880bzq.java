package X;

import Y.AAListenerS327S0100000_16;
import Y.ARunnableS116S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0bzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C994880bzq extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public ViewGroup LLIZLLLIL;
    public FrameLayout.LayoutParams LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public final AnimatorSet LLJJ;
    public final List<Animator.AnimatorListener> LLJJI;
    public EnumC992210bvX LLJJIII;

    public void LIZJ() {
    }

    public final void LIZIZ() {
        if (this.LLILZIL) {
            return;
        }
        if (this.LLJJ.isStarted()) {
            this.LLJJ.cancel();
        }
        HandlerHook.viewPost(this, new ARunnableS116S0100000_16(this, 129));
    }

    public final void LJ() {
        Object objLIZIZ;
        View view;
        if (this.LLILZIL) {
            this.LLILZIL = false;
            if (this.LLIZLLLIL == null) {
                SAFHelper.LIZ.getClass();
                ViewGroup viewGroup = null;
                if (SAFHelper.LJIIJ()) {
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
                    if (c19egLIZIZ != null && (objLIZIZ = C651580Ph6.LIZIZ(c19egLIZIZ)) != null && (view = ((Fragment) objLIZIZ).getView()) != null) {
                        viewGroup = (ViewGroup) view.findViewById(R.id.ue6);
                    }
                } else {
                    Activity activityLIZ = C06MM.LIZ(getContext());
                    if (activityLIZ != null) {
                        viewGroup = (ViewGroup) activityLIZ.findViewById(R.id.ue6);
                    }
                }
                this.LLIZLLLIL = viewGroup;
            }
            ViewGroup viewGroup2 = this.LLIZLLLIL;
            if (viewGroup2 != null) {
                HandlerHook.viewPost(viewGroup2, new ARunnableS116S0100000_16(this, 128));
            }
        }
    }

    public final void LJFF() {
        int height;
        int iLIZLLL;
        if (this.LLJJ.isStarted()) {
            this.LLJJ.cancel();
        }
        Activity activityLIZ = C06MM.LIZ(getContext());
        if (activityLIZ == null) {
            return;
        }
        float marginEnd = this.LLJ.getMarginEnd();
        float f = this.LLJ.topMargin;
        int iHeight = this.LLIZ ? (Build.VERSION.SDK_INT < 30 || !((Boolean) C04SP.LIZ.getValue()).booleanValue()) ? activityLIZ.getResources().getDisplayMetrics().heightPixels : C2204961BRm.LLILZ(activityLIZ.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1Hz1C31Pp8mqZGpQfeqBXrxCQnv82LhN0Y+KGdsIAJ3iEd1lol03qbYvQRrMEAdXrw==", null)).getBounds().height() : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(C445490HdT.LIZIZ(activityLIZ, Double.valueOf(C445490HdT.LIZ(activityLIZ))))));
        int height2 = this.LLJ.topMargin + getHeight();
        int i = this.LLJILJILJ;
        if (height2 + i > iHeight) {
            height = (iHeight - i) - getHeight();
        } else {
            height = this.LLJ.topMargin;
            int i2 = this.LLJILJIL;
            if (height < i2) {
                height = i2;
            }
        }
        int i3 = C992220bvY.LIZ[this.LLJJIII.ordinal()];
        if (i3 == 1) {
            iLIZLLL = (C418440Gaw.LIZLLL(getContext()) - this.LLJI) - getWidth();
        } else {
            if (i3 != 2) {
                throw new C1954807lC();
            }
            iLIZLLL = this.LLJIJIL;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) f, height);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS265S0100000_16(this, 34));
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt((int) marginEnd, iLIZLLL);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS265S0100000_16(this, 35));
        valueAnimatorOfInt2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.LLJJ.addListener(new AAListenerS327S0100000_16(this, 8));
        this.LLJILLL = true;
        AnimatorSet animatorSet = this.LLJJ;
        animatorSet.setDuration(300L);
        animatorSet.playTogether(valueAnimatorOfInt2, valueAnimatorOfInt);
        animatorSet.start();
    }

    public final int getBottomMargin() {
        return this.LLJILJILJ;
    }

    public final int getEndMargin() {
        return this.LLJIJIL;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        return this.LLJ;
    }

    public final int getStartMargin() {
        return this.LLJI;
    }

    public final int getTopMargin() {
        return this.LLJILJIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View viewLIZ = LIZ(this, motionEvent.getRawX(), motionEvent.getRawY());
        if (viewLIZ != null && viewLIZ.getVisibility() == 4) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        float rawX;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                this.LL = this.LLJ.getMarginEnd();
                this.LLILLJJLI = this.LLJ.topMargin;
                this.LLILLL = motionEvent.getRawX();
                this.LLILZ = motionEvent.getRawY();
            } else if (numValueOf.intValue() == 2) {
                if (Math.abs(motionEvent.getRawX() - this.LLILLL) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) || Math.abs(motionEvent.getRawY() - this.LLILZ) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))) {
                    this.LLILZLL = true;
                    FrameLayout.LayoutParams layoutParams = this.LLJ;
                    if (!C426750GoL.LIZLLL(getContext())) {
                        rawX = this.LL - (motionEvent.getRawX() - this.LLILLL);
                    } else {
                        rawX = this.LL + (motionEvent.getRawX() - this.LLILLL);
                    }
                    layoutParams.setMarginEnd((int) rawX);
                    this.LLJ.topMargin = (int) (this.LLILLJJLI + (motionEvent.getRawY() - this.LLILZ));
                    FrameLayout.LayoutParams layoutParams2 = this.LLJ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                    setLayoutParams(layoutParams2);
                    return true;
                }
            } else if (numValueOf.intValue() == 1) {
                if (this.LLILZLL) {
                    LJFF();
                } else {
                    LIZJ();
                }
                this.LLILZLL = false;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2;
        if ((layoutParams instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams) != null) {
            this.LLJ = layoutParams2;
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setSnapStatus(EnumC992210bvX enumC992210bvX) {
        this.LLJJIII = enumC992210bvX;
    }

    public void LJI(Integer num, Integer num2) {
        if (num != null) {
            this.LLJ.setMarginEnd(num.intValue());
        }
        if (num2 != null) {
            this.LLJ.topMargin = num2.intValue();
        }
        FrameLayout.LayoutParams layoutParams = this.LLJ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public C994880bzq(Context context, AttributeSet attributeSet, int i) {
        Object objLIZIZ;
        View view;
        super(context, attributeSet, i);
        this.LLILZIL = true;
        SAFHelper.LIZ.getClass();
        ViewGroup viewGroup = null;
        if (SAFHelper.LJIIJ()) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null && (objLIZIZ = C651580Ph6.LIZIZ(c19egLIZIZ)) != null && (view = ((Fragment) objLIZIZ).getView()) != null) {
                viewGroup = (ViewGroup) view.findViewById(R.id.ue6);
            }
        } else {
            Activity activityLIZ = C06MM.LIZ(context);
            if (activityLIZ != null) {
                viewGroup = (ViewGroup) activityLIZ.findViewById(R.id.ue6);
            }
        }
        this.LLIZLLLIL = viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388613;
        this.LLJ = layoutParams;
        this.LLJJ = new AnimatorSet();
        this.LLJJI = new ArrayList();
        this.LLJJIII = EnumC992210bvX.SNAP_TO_RIGHT;
    }

    public static View LIZ(ViewGroup viewGroup, float f, float f2) {
        View viewLIZ;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            int[] iArr = new int[2];
            childAt.getLocationOnScreen(iArr);
            if (f >= iArr[0] && f <= r1 + childAt.getWidth()) {
                if (f2 >= iArr[1] && f2 <= r1 + childAt.getHeight()) {
                    if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getVisibility() == 0 && (viewLIZ = LIZ(viewGroup2, f, f2)) != null) {
                            return viewLIZ;
                        }
                    }
                    return childAt;
                }
            }
        }
        return null;
    }

    public static void LIZLLL(C994880bzq c994880bzq, int i, int i2, int i3, int i4, boolean z, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 16) != 0) {
            z = false;
        }
        c994880bzq.LLJI = i;
        c994880bzq.LLJILJIL = i2;
        c994880bzq.LLJILJILJ = i3;
        c994880bzq.LLJIJIL = i4;
        c994880bzq.LLIZ = z;
    }
}
