package X;

import Y.AAListenerS261S0200000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Gp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427190Gp3 extends LinearLayout implements InterfaceC427210Gp5 {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final ArrayList<ImageView> LLILZLL;
    public AnimatorSet LLIZ;
    public int LLIZLLLIL;
    public final HashMap<Integer, ObjectAnimator> LLJ;

    public final void LIZ() {
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLIZ = null;
        Iterator<T> it2 = this.LLJ.values().iterator();
        while (it2.hasNext()) {
            ((ValueAnimator) it2.next()).cancel();
        }
        this.LLJ.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
    }

    public final void LIZIZ(int i) {
        boolean z;
        int i2 = this.LLILLL;
        if (i != i2 && i >= 0 && i < this.LLILZIL) {
            if (this.LLILZIL <= 6) {
                if (Math.abs(i - i2) == 1) {
                    LIZLLL(this.LLILLL, 200L);
                    LIZJ(i, 200L);
                } else {
                    LIZJ(this.LLILLL, 0L);
                    LIZLLL(this.LLILLL, 0L);
                    LIZJ(i, 0L);
                }
                this.LLILZ = i;
                this.LLILLL = i;
                return;
            }
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            LIZLLL(i2, 200L);
            LIZJ(i, 200L);
            this.LLILLL = i;
            if (z) {
                int i3 = this.LLILZ;
                if (i3 >= 4) {
                    LJ(true);
                    return;
                } else {
                    this.LLILZ = i3 + 1;
                    return;
                }
            }
            int i4 = this.LLILZ;
            if (i4 <= 1) {
                LJ(false);
            } else {
                this.LLILZ = i4 - 1;
            }
        }
    }

    public final void LJ(boolean z) {
        AnimatorSet animatorSet = this.LLIZ;
        if (animatorSet != null && animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        int i = this.LLILLJJLI + this.LL;
        if (z) {
            i = -i;
        }
        if (getLayoutDirection() == 1) {
            i = -i;
        }
        this.LLIZLLLIL += i;
        ArrayList<ImageView> arrayList = this.LLILZLL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (ImageView imageView : arrayList) {
            arrayList2.add(ObjectAnimator.ofFloat(imageView, "translationX", imageView.getTranslationX(), this.LLIZLLLIL));
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList2);
        animatorSet2.setDuration(200L);
        animatorSet2.start();
        this.LLIZ = animatorSet2;
    }

    @Override // X.InterfaceC427210Gp5
    public void setTotal(int i) {
        int i2;
        int i3;
        if (i <= 1) {
            return;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILZLL.clear();
        LIZ();
        this.LLILZIL = i;
        this.LLILZ = 0;
        this.LLILLL = 0;
        if (i >= 6) {
            i3 = this.LL * 6;
            i2 = this.LLILLJJLI * 5;
        } else {
            i2 = this.LL * i;
            i3 = (i - 1) * this.LLILLJJLI;
        }
        int i4 = i3 + i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(i4, this.LL);
        }
        layoutParams.width = i4;
        layoutParams.height = this.LL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int i5 = 0;
        do {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.btu);
            C786410Ut5.V4(imageView, 0.6f);
            int i6 = this.LL;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i6, i6);
            if (i5 > 0) {
                if (getLayoutDirection() == 1) {
                    layoutParams2.setMargins(0, 0, this.LLILLJJLI, 0);
                } else {
                    layoutParams2.setMargins(this.LLILLJJLI, 0, 0, 0);
                }
            }
            C786410Ut5.c6(imageView, layoutParams2);
            addView(imageView);
            this.LLILZLL.add(imageView);
            i5++;
        } while (i5 < i);
        LIZJ(0, 0L);
    }

    public C427190Gp3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(context.getResources().getDisplayMetrics().density * 6.0f);
        this.LLILLJJLI = C814420VxA.LIZIZ(context.getResources().getDisplayMetrics().density * 6.0f);
        this.LLILZLL = new ArrayList<>();
        this.LLJ = new HashMap<>();
        setOrientation(0);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public final void LIZJ(int i, long j) {
        ImageView imageView;
        if (i >= 0 && i < this.LLILZLL.size() && (imageView = (ImageView) ListProtector.get(this.LLILZLL, i)) != null) {
            imageView.setImageResource(R.drawable.btt);
            ObjectAnimator objectAnimatorRemove = this.LLJ.remove(Integer.valueOf(i));
            if (objectAnimatorRemove != null) {
                objectAnimatorRemove.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", imageView.getAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.addListener(new AAListenerS261S0200000_6(imageView, imageView, 4));
            this.LLJ.put(Integer.valueOf(i), objectAnimatorOfFloat);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    public final void LIZLLL(int i, long j) {
        ImageView imageView;
        if (i >= 0 && i < this.LLILZLL.size() && (imageView = (ImageView) ListProtector.get(this.LLILZLL, i)) != null) {
            imageView.setImageResource(R.drawable.btu);
            ObjectAnimator objectAnimatorRemove = this.LLJ.remove(Integer.valueOf(i));
            if (objectAnimatorRemove != null) {
                objectAnimatorRemove.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", imageView.getAlpha(), 0.6f);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.addListener(new AAListenerS261S0200000_6(imageView, imageView, 5));
            this.LLJ.put(Integer.valueOf(i), objectAnimatorOfFloat);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }
}
