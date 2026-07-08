package X;

import Y.AAListenerS341S0100000_31;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15pG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20637615pG extends C0DXR {
    public final RecyclerView LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1471));
    public final Rect LLILLL = new Rect();
    public final C20637815pI LLILZ = new C20637815pI();
    public Animator LLILZIL;

    public C20637615pG(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
    }

    @Override // X.C0DXR
    public final void LIZJ(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        C20637815pI c20637815pI = this.LLILZ;
        if (c20637815pI.LIZ >= 0 && (viewHolderFindViewHolderForAdapterPosition = this.LL.findViewHolderForAdapterPosition(c20637815pI.LIZ)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            this.LLILLL.set(view.getLeft(), view.getTop() - c20637815pI.LIZIZ, view.getRight(), view.getBottom() - c20637815pI.LIZJ);
            canvas.drawRect(this.LLILLL, (Paint) this.LLILLJJLI.getValue());
        }
    }

    public final void LJ(View view, View view2, int i, int i2) {
        View view3;
        Pair pair;
        if (C0BY9.LIZ()) {
            return;
        }
        if (view != null) {
            pair = new Pair(Integer.valueOf(view2.getTop() - view.getTop()), Integer.valueOf(view2.getBottom() - view.getBottom()));
        } else if (i < i2) {
            pair = new Pair(Integer.valueOf(view2.getBottom() + view2.getHeight()), Integer.valueOf(view2.getBottom()));
        } else {
            Object parent = view2.getParent();
            if (!(parent instanceof View) || (view3 = (View) parent) == null) {
                return;
            }
            int height = view3.getHeight();
            pair = new Pair(Integer.valueOf(view2.getTop() - height), Integer.valueOf((view2.getTop() - height) - view2.getHeight()));
        }
        final int iIntValue = ((Number) pair.getFirst()).intValue();
        final int iIntValue2 = ((Number) pair.getSecond()).intValue();
        Animator animator = this.LLILZIL;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.15pH
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.LL.LLILZ.LIZIZ = (int) (iIntValue * ((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.LL.LLILZ.LIZJ = (int) (iIntValue2 * ((Float) valueAnimator.getAnimatedValue()).floatValue());
                this.LL.LL.invalidateItemDecorations();
            }
        });
        valueAnimatorOfFloat.addListener(new AAListenerS341S0100000_31(this, 13));
        valueAnimatorOfFloat.start();
        this.LLILZIL = valueAnimatorOfFloat;
    }
}
