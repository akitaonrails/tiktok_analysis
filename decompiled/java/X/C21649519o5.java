package X;

import Y.AAListenerS343S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.19o5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21649519o5 extends FrameLayout implements InterfaceC21650219oC<C21649319o3>, InterfaceC21650319oD {
    public C1765590w2v LL;
    public Rect LLILLJJLI;
    public final Rect LLILLL;
    public final Rect LLILZ;
    public final RectF LLILZIL;
    public final Matrix LLILZLL;
    public View LLIZ;
    public ViewGroup.LayoutParams LLIZLLLIL;
    public final FrameLayout.LayoutParams LLJ;
    public final ValueAnimator LLJI;
    public final C21649319o3 LLJIJIL;
    public int LLJILJIL;
    public InterfaceC21650319oD LLJILJILJ;
    public final ValueAnimator LLJILLL;
    public final LinkedHashSet<InterfaceC21650419oE> LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public float LLJJIJI;

    private final float getDragFactor() {
        float f = this.LLJIJIL.LLILZLL;
        if (f <= 0.0f) {
            return 1.0f;
        }
        float f2 = 1;
        float f3 = f / 1300;
        if (f3 > 0.95f) {
            f3 = 0.95f;
        }
        return f2 - f3;
    }

    public final void LJII() {
        InterfaceC21650319oD interfaceC21650319oD = this.LLJILJILJ;
        if (interfaceC21650319oD != null) {
            interfaceC21650319oD.setDragTransitionEnabled(this.LLJJIII);
        }
        InterfaceC21650319oD interfaceC21650319oD2 = this.LLJILJILJ;
        if (interfaceC21650319oD2 != null) {
            interfaceC21650319oD2.setMaxDragTransitionFactor(this.LLJJIJI);
        }
    }

    public final C1765590w2v getPlayerViewV2FromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qtx);
            this.LL = (C1765590w2v) callbackFindViewById;
        }
        return (C1765590w2v) callbackFindViewById;
    }

    public final View LJFF() {
        if (getChildCount() >= 2) {
            throw new IllegalStateException("only allow one child view");
        }
        if (this.LLIZ == null) {
            this.LLIZ = getChildAt(0);
        }
        return this.LLIZ;
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZ(C21649319o3 c21649319o3) {
        if (this.LLJJIII && this.LLJIJIL.LLJILJIL == 4 && this.LLJILJIL != 3) {
            this.LLJILJIL = 3;
            Iterator<InterfaceC21650419oE> it2 = this.LLJJ.iterator();
            while (it2.hasNext()) {
                it2.next().xP(this.LLJILJIL);
            }
            View viewLJFF = LJFF();
            if (viewLJFF != null) {
                this.LLIZLLLIL = viewLJFF.getLayoutParams();
                C786410Ut5.W5(viewLJFF, this.LLJ);
            }
        }
        if (this.LLJJIII && this.LLJILJIL == 3) {
            this.LLILZLL.reset();
            this.LLJJI = getDragFactor();
            Matrix matrix = this.LLILZLL;
            C21649319o3 c21649319o32 = this.LLJIJIL;
            matrix.postTranslate(c21649319o32.LLILZIL, c21649319o32.LLILZLL);
            Matrix matrix2 = this.LLILZLL;
            float f = this.LLJJI;
            matrix2.postScale(f, f, this.LLILZ.centerX(), this.LLILZ.centerY());
            this.LLILZIL.set(this.LLILLL);
            this.LLILZLL.mapRect(this.LLILZIL);
            Rect rect = this.LLILZ;
            RectF rectF = this.LLILZIL;
            rect.left = (int) rectF.left;
            rect.top = (int) rectF.top;
            rect.right = (int) rectF.right;
            rect.bottom = (int) rectF.bottom;
            View viewLJFF2 = LJFF();
            if (viewLJFF2 != null) {
                LJI(this.LLILZ, viewLJFF2);
            }
            Iterator<InterfaceC21650419oE> it3 = this.LLJJ.iterator();
            while (it3.hasNext()) {
                it3.next().kG(this.LLJJI, this.LLJILJIL);
            }
        }
    }

    @Override // X.InterfaceC21650319oD
    public final void LIZIZ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJJ.add(interfaceC21650419oE);
        InterfaceC21650319oD interfaceC21650319oD = this.LLJILJILJ;
        if (interfaceC21650319oD != null) {
            interfaceC21650319oD.LIZIZ(interfaceC21650419oE);
        }
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZJ(C21649319o3 c21649319o3) {
        this.LLJILJIL = -1;
    }

    @Override // X.InterfaceC21650219oC
    public final void LIZLLL(C21649319o3 c21649319o3) {
        if (this.LLJILJIL == 3) {
            Iterator<InterfaceC21650419oE> it2 = this.LLJJ.iterator();
            while (it2.hasNext()) {
                it2.next().gA(this.LLJILJIL);
            }
            float dragFactor = getDragFactor();
            this.LLJJI = dragFactor;
            if (dragFactor < this.LLJJIJI) {
                this.LLILLJJLI.set(this.LLILZ);
                this.LLILZLL.reset();
                this.LLILZLL.postScale(0.0f, 0.0f, this.LLILZ.centerX(), this.LLILZ.centerY());
                this.LLILZIL.set(this.LLILLL);
                this.LLILZLL.mapRect(this.LLILZIL);
                Rect rect = this.LLILZ;
                RectF rectF = this.LLILZIL;
                rect.left = (int) rectF.left;
                rect.top = (int) rectF.top;
                rect.right = (int) rectF.right;
                rect.bottom = (int) rectF.bottom;
                this.LLILLL.set(rect);
                this.LLJILJIL = 2;
                this.LLJI.start();
                this.LLJILLL.start();
                return;
            }
            this.LLILLJJLI.set(this.LLILZ);
            this.LLJILJIL = 1;
            this.LLJI.start();
        }
    }

    @Override // X.InterfaceC21650319oD
    public final void LJ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJJ.remove(interfaceC21650419oE);
        InterfaceC21650319oD interfaceC21650319oD = this.LLJILJILJ;
        if (interfaceC21650319oD != null) {
            interfaceC21650319oD.LJ(interfaceC21650419oE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJI.isRunning()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.LLJILJILJ == null) {
            if (motionEvent != null) {
                this.LLJIJIL.LJ(motionEvent);
            }
            if (this.LLJILJIL == 3) {
                z = true;
            } else {
                z = false;
            }
            requestDisallowInterceptTouchEvent(z);
        }
        if (this.LLJILJIL == 3) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLJILJIL == 3) {
            requestDisallowInterceptTouchEvent(true);
        }
        this.LLJIJIL.LJ(motionEvent);
        return true;
    }

    public final void setDelegateDragTransitionView(InterfaceC21650319oD interfaceC21650319oD) {
        this.LLJILJILJ = interfaceC21650319oD;
        LJII();
        for (InterfaceC21650419oE interfaceC21650419oE : this.LLJJ) {
            InterfaceC21650319oD interfaceC21650319oD2 = this.LLJILJILJ;
            if (interfaceC21650319oD2 != null) {
                interfaceC21650319oD2.LIZIZ(interfaceC21650419oE);
            }
        }
    }

    @Override // X.InterfaceC21650319oD
    public void setDragTransitionEnabled(boolean z) {
        this.LLJJIII = z;
        LJII();
    }

    @Override // X.InterfaceC21650319oD
    public void setMaxDragTransitionFactor(float f) {
        this.LLJJIJI = f;
        LJII();
    }

    public final void setPlayerViewV2FromXml(C1765590w2v c1765590w2v) {
        this.LL = c1765590w2v;
    }

    public C21649519o5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new Rect();
        this.LLILLL = new Rect();
        this.LLILZ = new Rect();
        this.LLILZIL = new RectF();
        this.LLILZLL = new Matrix();
        this.LLJ = new FrameLayout.LayoutParams(0, 0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJI = valueAnimatorOfFloat;
        C21649319o3 c21649319o3 = new C21649319o3();
        this.LLJIJIL = c21649319o3;
        this.LLJILJIL = -1;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.LLJILLL = valueAnimatorOfFloat2;
        this.LLJJ = new LinkedHashSet<>();
        this.LLJJI = 1.0f;
        AUListenerS280S0100000_33 aUListenerS280S0100000_33 = new AUListenerS280S0100000_33(this, 54);
        this.LLJJIII = true;
        this.LLJJIJI = 0.7f;
        AUListenerS280S0100000_33 aUListenerS280S0100000_332 = new AUListenerS280S0100000_33(this, 53);
        AAListenerS343S0100000_33 aAListenerS343S0100000_33 = new AAListenerS343S0100000_33(this, 18);
        if (!c21649319o3.LLILLL.contains(2)) {
            c21649319o3.LLILLL.add(2);
        }
        valueAnimatorOfFloat.addUpdateListener(aUListenerS280S0100000_332);
        valueAnimatorOfFloat.addListener(aAListenerS343S0100000_33);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat2.setDuration(250L);
        valueAnimatorOfFloat2.addUpdateListener(aUListenerS280S0100000_33);
        c21649319o3.LL = this;
    }

    public static void LJI(Rect rect, View view) {
        C786410Ut5.Fd(view, rect.left);
        C786410Ut5.Ld(view, rect.top);
        view.getLayoutParams().width = rect.width();
        view.getLayoutParams().height = rect.height();
        view.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View viewLJFF = LJFF();
        if (viewLJFF != null && this.LLJILJIL == -1) {
            this.LLILLL.set(0, 0, viewLJFF.getMeasuredWidth(), viewLJFF.getMeasuredHeight());
        }
    }
}
