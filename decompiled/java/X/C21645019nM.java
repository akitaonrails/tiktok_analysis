package X;

import Y.ARunnableS106S0100000_6;
import Y.AsS58S0100000_33;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19nM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21645019nM extends C0DXR implements InterfaceC21676019sM {
    public static final int[] LLJLIL = {R.attr.state_pressed};
    public static final int[] LLJLILLLLZIIL = new int[0];
    public final int LL;
    public final int LLILLJJLI;
    public final StateListDrawable LLILLL;
    public final Drawable LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final StateListDrawable LLIZ;
    public final Drawable LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public float LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public RecyclerView LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public final int[] LLJJJJJIL = new int[2];
    public final int[] LLJJJJLIIL = new int[2];
    public final ValueAnimator LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final ARunnableS106S0100000_6 LLJL;

    @Override // X.InterfaceC21676019sM
    public final void LJIIZILJ(boolean z) {
    }

    public final void LJII() {
        int i = this.LLJJLIIIJLLLLLLLZ;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.LLJJL.cancel();
            }
        }
        this.LLJJLIIIJLLLLLLLZ = 1;
        ValueAnimator valueAnimator = this.LLJJL;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.LLJJL.setDuration(500L);
        this.LLJJL.setStartDelay(0L);
        this.LLJJL.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r5) {
        /*
            r4 = this;
            r2 = 2
            if (r5 != r2) goto L4e
            int r0 = r4.LLJJJIL
            if (r0 == r2) goto L15
            android.graphics.drawable.StateListDrawable r1 = r4.LLILLL
            int[] r0 = X.C21645019nM.LLJLIL
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLJJIJIIJIL
            Y.ARunnableS106S0100000_6 r0 = r4.LLJL
            r1.removeCallbacks(r0)
        L15:
            r4.LJII()
        L18:
            int r0 = r4.LLJJJIL
            if (r0 != r2) goto L39
            if (r5 == r2) goto L36
            android.graphics.drawable.StateListDrawable r1 = r4.LLILLL
            int[] r0 = X.C21645019nM.LLJLILLLLZIIL
            r1.setState(r0)
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLJJIJIIJIL
            Y.ARunnableS106S0100000_6 r0 = r4.LLJL
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r4.LLJJIJIIJIL
            Y.ARunnableS106S0100000_6 r2 = r4.LLJL
            r0 = 1200(0x4b0, float:1.682E-42)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
        L36:
            r4.LLJJJIL = r5
            return
        L39:
            r0 = 1
            if (r5 != r0) goto L36
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLJJIJIIJIL
            Y.ARunnableS106S0100000_6 r0 = r4.LLJL
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r4.LLJJIJIIJIL
            Y.ARunnableS106S0100000_6 r2 = r4.LLJL
            r0 = 1500(0x5dc, float:2.102E-42)
            long r0 = (long) r0
            r3.postDelayed(r2, r0)
            goto L36
        L4e:
            if (r5 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r4.LLJJIJIIJIL
            r0.invalidate()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21645019nM.LJI(int):void");
    }

    public final boolean LJ(float f, float f2) {
        if (f2 >= this.LLJJIJI - this.LLJ) {
            int i = this.LLJJ;
            int i2 = this.LLJILLL;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJFF(float f, float f2) {
        if (this.LLJJIJIIJIL.getLayoutDirection() == 1) {
            if (f > this.LLILZIL) {
                return false;
            }
        } else if (f < this.LLJJIII - this.LLILZIL) {
            return false;
        }
        int i = this.LLJILJIL;
        int i2 = this.LLJIJIL / 2;
        if (f2 < i - i2 || f2 > i + i2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC21676019sM
    public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.LLJJJIL == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zLJFF = LJFF(motionEvent.getX(), motionEvent.getY());
            boolean zLJ = LJ(motionEvent.getX(), motionEvent.getY());
            if (!zLJFF) {
                if (!zLJ) {
                    return;
                }
            } else {
                if (!zLJ) {
                    if (zLJFF) {
                        this.LLJJJJ = 2;
                        this.LLJILJILJ = (int) motionEvent.getY();
                    }
                }
                LJI(2);
                return;
            }
            this.LLJJJJ = 1;
            this.LLJJI = (int) motionEvent.getX();
            LJI(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.LLJJJIL == 2) {
            this.LLJILJILJ = 0.0f;
            this.LLJJI = 0.0f;
            LJI(1);
            this.LLJJJJ = 0;
            return;
        }
        if (motionEvent.getAction() != 2 || this.LLJJJIL != 2) {
            return;
        }
        LJII();
        if (this.LLJJJJ == 1) {
            float x = motionEvent.getX();
            int[] iArr = this.LLJJJJLIIL;
            int i = this.LLILLJJLI;
            iArr[0] = i;
            int i2 = this.LLJJIII - i;
            iArr[1] = i2;
            float fMax = Math.max(i, Math.min(i2, x));
            if (Math.abs(this.LLJJ - fMax) >= 2.0f) {
                float f = this.LLJJI;
                int iComputeHorizontalScrollRange = this.LLJJIJIIJIL.computeHorizontalScrollRange();
                int iComputeHorizontalScrollOffset = this.LLJJIJIIJIL.computeHorizontalScrollOffset();
                int i3 = this.LLJJIII;
                int i4 = iArr[1] - iArr[0];
                if (i4 != 0) {
                    int i5 = iComputeHorizontalScrollRange - i3;
                    int i6 = (int) (((fMax - f) / i4) * i5);
                    int i7 = iComputeHorizontalScrollOffset + i6;
                    if (i7 < i5 && i7 >= 0 && i6 != 0) {
                        this.LLJJIJIIJIL.scrollBy(i6, 0);
                    }
                }
                this.LLJJI = fMax;
            }
        }
        if (this.LLJJJJ != 2) {
            return;
        }
        float y = motionEvent.getY();
        int[] iArr2 = this.LLJJJJJIL;
        int i8 = this.LLILLJJLI;
        iArr2[0] = i8;
        int i9 = this.LLJJIJI - i8;
        iArr2[1] = i9;
        float fMax2 = Math.max(i8, Math.min(i9, y));
        if (Math.abs(this.LLJILJIL - fMax2) < 2.0f) {
            return;
        }
        float f2 = this.LLJILJILJ;
        int iComputeVerticalScrollRange = this.LLJJIJIIJIL.computeVerticalScrollRange();
        int iComputeVerticalScrollOffset = this.LLJJIJIIJIL.computeVerticalScrollOffset();
        int i10 = this.LLJJIJI;
        int i11 = iArr2[1] - iArr2[0];
        if (i11 != 0) {
            int i12 = iComputeVerticalScrollRange - i10;
            int i13 = (int) (((fMax2 - f2) / i11) * i12);
            int i14 = iComputeVerticalScrollOffset + i13;
            if (i14 < i12 && i14 >= 0 && i13 != 0) {
                this.LLJJIJIIJIL.scrollBy(0, i13);
            }
        }
        this.LLJILJILJ = fMax2;
    }

    @Override // X.InterfaceC21676019sM
    public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.LLJJJIL;
        if (i == 1) {
            boolean zLJFF = LJFF(motionEvent.getX(), motionEvent.getY());
            boolean zLJ = LJ(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                if (!zLJFF) {
                    if (!zLJ) {
                        return false;
                    }
                } else {
                    if (!zLJ) {
                        if (zLJFF) {
                            this.LLJJJJ = 2;
                            this.LLJILJILJ = (int) motionEvent.getY();
                        }
                    }
                    LJI(2);
                    return true;
                }
                this.LLJJJJ = 1;
                this.LLJJI = (int) motionEvent.getX();
                LJI(2);
                return true;
            }
            return false;
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C0DXR
    public final void LIZLLL(Canvas canvas, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        if (this.LLJJIII == this.LLJJIJIIJIL.getWidth() && this.LLJJIJI == this.LLJJIJIIJIL.getHeight()) {
            if (this.LLJJLIIIJLLLLLLLZ != 0) {
                if (this.LLJJIJIL) {
                    int i = this.LLJJIII;
                    int i2 = this.LLILZIL;
                    int i3 = i - i2;
                    int i4 = this.LLJILJIL;
                    int i5 = this.LLJIJIL;
                    int i6 = i4 - (i5 / 2);
                    this.LLILLL.setBounds(0, 0, i2, i5);
                    this.LLILZ.setBounds(0, 0, this.LLILZLL, this.LLJJIJI);
                    if (this.LLJJIJIIJIL.getLayoutDirection() == 1) {
                        this.LLILZ.draw(canvas);
                        canvas.translate(this.LLILZIL, i6);
                        canvas.scale(-1.0f, 1.0f);
                        this.LLILLL.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-this.LLILZIL, -i6);
                    } else {
                        canvas.translate(i3, 0.0f);
                        this.LLILZ.draw(canvas);
                        canvas.translate(0.0f, i6);
                        this.LLILLL.draw(canvas);
                        canvas.translate(-i3, -i6);
                    }
                }
                if (this.LLJJJ) {
                    int i7 = this.LLJJIJI;
                    int i8 = this.LLJ;
                    int i9 = this.LLJJ;
                    int i10 = this.LLJILLL;
                    this.LLIZ.setBounds(0, 0, i10, i8);
                    this.LLIZLLLIL.setBounds(0, 0, this.LLJJIII, this.LLJI);
                    canvas.translate(0.0f, i7 - i8);
                    this.LLIZLLLIL.draw(canvas);
                    canvas.translate(i9 - (i10 / 2), 0.0f);
                    this.LLIZ.draw(canvas);
                    canvas.translate(-r6, -r5);
                    return;
                }
                return;
            }
            return;
        }
        this.LLJJIII = this.LLJJIJIIJIL.getWidth();
        this.LLJJIJI = this.LLJJIJIIJIL.getHeight();
        LJI(0);
    }

    public C21645019nM(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJL = valueAnimatorOfFloat;
        this.LLJJLIIIJLLLLLLLZ = 0;
        ARunnableS106S0100000_6 aRunnableS106S0100000_6 = new ARunnableS106S0100000_6(this, 10);
        this.LLJL = aRunnableS106S0100000_6;
        AsS58S0100000_33 asS58S0100000_33 = new AsS58S0100000_33(this, 0);
        this.LLILLL = stateListDrawable;
        this.LLILZ = drawable;
        this.LLIZ = stateListDrawable2;
        this.LLIZLLLIL = drawable2;
        this.LLILZIL = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.LLILZLL = Math.max(i, drawable.getIntrinsicWidth());
        this.LLJ = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.LLJI = Math.max(i, drawable2.getIntrinsicWidth());
        this.LL = i2;
        this.LLILLJJLI = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0GgN
            public boolean LL;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                this.LL = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (this.LL) {
                    this.LL = false;
                    return;
                }
                if (((Float) this.LLILLJJLI.LLJJL.getAnimatedValue()).floatValue() == 0.0f) {
                    C21645019nM c21645019nM = this.LLILLJJLI;
                    c21645019nM.LLJJLIIIJLLLLLLLZ = 0;
                    c21645019nM.LJI(0);
                } else {
                    C21645019nM c21645019nM2 = this.LLILLJJLI;
                    c21645019nM2.LLJJLIIIJLLLLLLLZ = 2;
                    c21645019nM2.LLJJIJIIJIL.invalidate();
                }
            }
        });
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19nN
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                this.LL.LLILLL.setAlpha(iFloatValue);
                this.LL.LLILZ.setAlpha(iFloatValue);
                this.LL.LLJJIJIIJIL.invalidate();
            }
        });
        RecyclerView recyclerView2 = this.LLJJIJIIJIL;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.LLJJIJIIJIL.removeOnItemTouchListener(this);
                this.LLJJIJIIJIL.removeOnScrollListener(asS58S0100000_33);
                this.LLJJIJIIJIL.removeCallbacks(aRunnableS106S0100000_6);
            }
            this.LLJJIJIIJIL = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.LLJJIJIIJIL.addOnItemTouchListener(this);
                this.LLJJIJIIJIL.addOnScrollListener(asS58S0100000_33);
            }
        }
    }
}
