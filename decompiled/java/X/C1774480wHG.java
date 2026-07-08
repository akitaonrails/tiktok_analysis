package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: X.0wHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774480wHG extends RecyclerView {
    public Drawable LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final LinearLayoutManager LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public final Set<InterfaceC1774590wHR> LLJILJILJ;
    public float LLJILLL;

    public C1774480wHG() {
        throw null;
    }

    public void setPositionThreshold(float f) {
    }

    public int getSelectedPosition() {
        return this.LLILZLL;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        int left;
        int right;
        int i;
        View viewFindViewByPosition = this.LLILZIL.findViewByPosition(this.LLILZLL);
        if (viewFindViewByPosition == null) {
            if (this.LLJIJIL) {
                this.LLJIJIL = false;
                LIZJ(0.0f, this.LLILZLL, false);
                return;
            }
            return;
        }
        this.LLJIJIL = false;
        if (getLayoutDirection() == 1) {
            left = ((viewFindViewByPosition.getLeft() - this.LLIZLLLIL) - this.LLIZ) + this.LLILLL;
            right = (viewFindViewByPosition.getRight() - this.LLIZLLLIL) + this.LLIZ;
            i = this.LLILLL;
        } else {
            left = ((viewFindViewByPosition.getLeft() + this.LLIZLLLIL) - this.LLIZ) + this.LLILLL;
            right = viewFindViewByPosition.getRight() + this.LLIZLLLIL + this.LLIZ;
            i = this.LLILLL;
        }
        int i2 = right - i;
        int height = (getHeight() - this.LLILLJJLI) - this.LLILZ;
        int height2 = getHeight() - this.LLILZ;
        Drawable drawable = this.LL;
        if (drawable != null) {
            drawable.setBounds(left, height, i2, height2);
            this.LL.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC21673619ry abstractC21673619ry) {
        super.setAdapter(abstractC21673619ry);
        if (abstractC21673619ry instanceof AbstractC1774490wHH) {
            ((AbstractC1774490wHH) abstractC21673619ry).LL = new C1774560wHO(this, abstractC21673619ry);
            return;
        }
        throw new RuntimeException("only support RecyclerTabLayout.Adapter");
    }

    public void setClickPayload(String str) {
        this.LLJILJIL = str;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        AbstractC21673619ry adapter = getAdapter();
        if (adapter instanceof AbstractC1774490wHH) {
            ((AbstractC1774490wHH) adapter).LLILLJJLI = z;
        }
    }

    public void setIndicatorDrawable(Drawable drawable) {
        this.LL = drawable;
    }

    public void setIndicatorHeight(int i) {
        this.LLILLJJLI = i;
    }

    public void setIndicatorMarginBottom(int i) {
        this.LLILZ = i;
    }

    public void setIndicatorMarinHorizon(int i) {
        this.LLILLL = i;
    }

    public void setSelectedPosition(int i) {
        LJ(i, null, true);
    }

    public C1774480wHG(Context context, int i) {
        super(context, null, 0);
        this.LLILZLL = -1;
        this.LLJ = -1;
        this.LLJILJIL = "click";
        this.LLJILJILJ = new HashSet();
        this.LLJILLL = 0.0f;
        setWillNotDraw(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.LLILZIL = linearLayoutManager;
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        setItemAnimator(null);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final void LIZLLL(final int i, boolean z) {
        float f;
        if (z && i != this.LLILZLL) {
            View viewFindViewByPosition = this.LLILZIL.findViewByPosition(i);
            if (viewFindViewByPosition != null) {
                this.LLJILLL = viewFindViewByPosition.getX();
            }
            float[] fArr = new float[2];
            if (getLayoutDirection() == 1) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            fArr[0] = f;
            fArr[1] = 0.0f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0wHL
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1774480wHG c1774480wHG = this.LL;
                    int i2 = i;
                    c1774480wHG.getClass();
                    c1774480wHG.LIZJ(((Float) valueAnimator.getAnimatedValue()).floatValue(), i2, true);
                }
            });
            valueAnimatorOfFloat.start();
            return;
        }
        LIZJ(0.0f, i, false);
    }

    public final void LIZJ(float f, int i, boolean z) {
        float measuredWidth;
        View viewFindViewByPosition = this.LLILZIL.findViewByPosition(i);
        View viewFindViewByPosition2 = this.LLILZIL.findViewByPosition(i + 1);
        int i2 = 0;
        if (viewFindViewByPosition != null) {
            int measuredWidth2 = getMeasuredWidth();
            if (i == 0) {
                measuredWidth = 0.0f;
            } else {
                measuredWidth = (measuredWidth2 / 2.0f) - (viewFindViewByPosition.getMeasuredWidth() / 2.0f);
            }
            int i3 = (int) (((measuredWidth - this.LLJILLL) * f) + measuredWidth);
            if (viewFindViewByPosition2 != null) {
                float f2 = measuredWidth - i3;
                if (i == 0) {
                    float measuredWidth3 = (viewFindViewByPosition2.getMeasuredWidth() - viewFindViewByPosition.getMeasuredWidth()) / 2.0f;
                    this.LLIZ = (int) (measuredWidth3 * f);
                    this.LLIZLLLIL = (int) ((viewFindViewByPosition.getMeasuredWidth() + measuredWidth3) * f);
                } else {
                    this.LLIZ = (int) (((viewFindViewByPosition2.getMeasuredWidth() - viewFindViewByPosition.getMeasuredWidth()) / 2.0f) * f);
                    this.LLIZLLLIL = (int) f2;
                }
            } else {
                this.LLIZLLLIL = 0;
                this.LLIZ = 0;
            }
            if (z) {
                this.LLIZLLLIL = 0;
                this.LLIZ = 0;
            }
            i2 = i3;
        } else {
            getMeasuredWidth();
            this.LLJIJIL = true;
        }
        this.LLILZLL = i;
        stopScroll();
        if (i != this.LLJ || i2 != this.LLJI) {
            this.LLILZIL.scrollToPositionWithOffset(i, i2);
        }
        if (this.LLILLJJLI > 0) {
            invalidate();
        }
        this.LLJ = i;
        this.LLJI = i2;
    }

    public final void LJ(int i, Object obj, boolean z) {
        AbstractC1774490wHH abstractC1774490wHH;
        int i2;
        AbstractC21673619ry adapter = getAdapter();
        int i3 = this.LLILZLL;
        if (i == i3) {
            return;
        }
        if ((adapter instanceof AbstractC1774490wHH) && (i2 = (abstractC1774490wHH = (AbstractC1774490wHH) adapter).LLILLL) != i) {
            abstractC1774490wHH.notifyItemChanged(i2);
            abstractC1774490wHH.notifyItemChanged(i);
            abstractC1774490wHH.LLILLL = i;
        }
        LIZLLL(i, z);
        Iterator it2 = ((HashSet) this.LLJILJILJ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1774590wHR) it2.next()).LIZ(i, i3, obj);
        }
    }
}
