package X;

import Y.ALAdapterS5S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AUListenerS258S0100000_8;
import Y.AsS35S0100000_8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0LJV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJV extends LinearLayout {
    public int LL;
    public FrameLayout LLILLJJLI;
    public RecyclerView LLILLL;
    public TextView LLILZ;
    public ViewGroup LLILZIL;
    public FrameLayout LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public C0LJU LLJI;
    public InterfaceC530060Kqa LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public final ARunnableS108S0100000_8 LLJILLL;
    public boolean LLJJ;
    public final C0LJW LLJJI;
    public final Interpolator LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC529170Kp9 LLJJIJIIJIL;
    public final AsS35S0100000_8 LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public long LLJJJJ;

    public final Drawable LIZJ() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C12ES.LIZJ(4.0f, getContext()));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1c);
        return c384050F3z.LIZ(getContext());
    }

    public final void LJ() {
        C786410Ut5.LJLLLLLL(8, this.LLJ);
        C786410Ut5.LLIL(this.LLILZ, 4);
        ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
        layoutParams.width = (int) C12ES.LIZJ(56.0f, C0CHQ.LIZ);
        C786410Ut5.a6(this.LLILLJJLI, layoutParams);
        this.LLJILJIL = false;
    }

    public final void LJFF() {
        RecyclerView recyclerView;
        if (this.LLJIJIL == null || (recyclerView = this.LLILLL) == null || recyclerView.getLayoutManager() == null) {
            return;
        }
        InterfaceC530060Kqa interfaceC530060Kqa = this.LLJIJIL;
        RecyclerView.LayoutManager layoutManager = this.LLILLL.getLayoutManager();
        String string = interfaceC530060Kqa.LLFF(layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition() : layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).LJIJ(null)[0] : 0).toString();
        if (this.LLIZ.getText().equals(string)) {
            return;
        }
        this.LLIZ.setText(string);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0LJW] */
    public C0LJV(Context context) {
        super(context, null, 0);
        this.LLJILJILJ = "";
        this.LLJILLL = new ARunnableS108S0100000_8(this, 39);
        this.LLJJ = false;
        this.LLJJI = new Runnable() { // from class: X.0LJW
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FastScroller$ResumeFrescoRunnable@2bb4.run");
                try {
                    C1322200kVm.LIZ().LJIJJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FastScroller$ResumeFrescoRunnable@2bb4.run");
            }
        };
        this.LLJJIII = C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = new AsS35S0100000_8(this, 3);
        this.LLJJJ = 0.0f;
        this.LLJJJIL = 0.0f;
        this.LLJJJJ = 0L;
        LinearLayout.inflate(context, R.layout.c62, this);
        setClipChildren(false);
        setOrientation(0);
        this.LLILZ = (TextView) findViewById(R.id.hpk);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.hpl);
        this.LLJ = findViewById(R.id.hpm);
        this.LLILZIL = (ViewGroup) findViewById(R.id.xwt);
        this.LLILZLL = (FrameLayout) findViewById(R.id.xws);
        this.LLIZ = (TuxTextView) findViewById(R.id.xxx);
        this.LLIZLLLIL = findViewById(R.id.xwx);
        this.LLILZLL.setBackground(LIZIZ(C12ES.LIZJ(20.0f, getContext())));
        this.LLIZLLLIL.setBackground(LIZJ());
        C786410Ut5.LLIL(this.LLILZ, 8);
        C786410Ut5.LJZ(8, this.LLILLJJLI);
        C786410Ut5.LJLZ(0, this.LLILZIL);
        if (C1388580mEq.LIZIZ(context)) {
            this.LLJJ = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setRecyclerViewPosition(float r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            if (r0 == 0) goto L9c
            X.19ry r0 = r0.getAdapter()
            if (r0 == 0) goto L9c
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            if (r0 == 0) goto L9c
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            X.19ry r0 = r0.getAdapter()
            int r4 = r0.getItemCount()
            android.view.ViewGroup r0 = r5.LLILZIL
            float r0 = r0.getY()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            android.view.ViewGroup r0 = r5.LLILZIL
            float r2 = r0.getY()
            android.view.ViewGroup r0 = r5.LLILZIL
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r2 = r2 + r0
            int r1 = r5.LL
            int r0 = r1 + (-5)
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb4
            r1 = 1065353216(0x3f800000, float:1.0)
        L40:
            float r0 = (float) r4
            float r1 = r1 * r0
            int r2 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r0 == 0) goto Lab
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            boolean r0 = r1.getReverseLayout()
        L57:
            if (r0 == 0) goto L5b
            int r2 = r4 - r2
        L5b:
            int r1 = r4 + (-1)
            int r0 = java.lang.Math.max(r3, r2)
            int r1 = java.lang.Math.min(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.scrollToPosition(r1)
            r5.LJFF()
            X.0Kqa r2 = r5.LLJIJIL
            if (r2 == 0) goto L9c
            androidx.recyclerview.widget.RecyclerView r0 = r5.LLILLL
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L9d
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r3 = r1.findFirstVisibleItemPosition()
        L85:
            java.lang.CharSequence r0 = r2.LLFF(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r5.LLJILJILJ
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
            r5.LLJILJILJ = r1
            android.widget.TextView r0 = r5.LLILZ
            r0.setText(r1)
        L9c:
            return
        L9d:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L85
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r0 = 0
            int[] r0 = r1.LJIJ(r0)
            r3 = r0[r3]
            goto L85
        Lab:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L5b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            boolean r0 = r1.LLIZLLLIL
            goto L57
        Lb4:
            float r0 = (float) r1
            float r1 = r6 / r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LJV.setRecyclerViewPosition(float):void");
    }

    public final void LIZ(RecyclerView recyclerView) {
        this.LLILLL = recyclerView;
        if (getParent() instanceof ViewGroup) {
            setLayoutParams((ViewGroup) getParent());
        } else if (recyclerView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            viewGroup.addView(this);
            setLayoutParams(viewGroup);
        }
        recyclerView.addOnScrollListener(this.LLJJIJIL);
        HandlerHook.viewPost(this, new ARunnableS108S0100000_8(this, 41));
    }

    public final Drawable LIZIZ(float f) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(f);
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        return c384050F3z.LIZ(getContext());
    }

    public final float LIZLLL(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        int measuredHeight = this.LLILZIL.getMeasuredHeight();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float fComputeVerticalScrollRange = (recyclerView.computeVerticalScrollRange() - this.LL) + measuredHeight;
        float f = iComputeVerticalScrollOffset;
        if (fComputeVerticalScrollRange <= 0.0f) {
            fComputeVerticalScrollRange = 1.0f;
        }
        float f2 = f / fComputeVerticalScrollRange;
        if (this.LLJILJIL) {
            getHandler().removeCallbacks(this.LLJILLL);
            this.LLILZIL.clearAnimation();
        }
        View view = this.LLJ;
        if (view == null || view.getVisibility() != 0) {
            C786410Ut5.T4(this.LLJ, 0.0f);
            C786410Ut5.LJLLLLLL(0, this.LLJ);
            this.LLJILJIL = false;
            C786410Ut5.R4(0.0f, this.LLILZIL);
            C786410Ut5.Jc(this.LLJ, 0.0f);
            C786410Ut5.T4(this.LLJ, 1.0f);
            C786410Ut5.LJLZ(0, this.LLILZIL);
            this.LLILZIL.animate().alpha(1.0f).setListener(null).setDuration(200L).start();
        }
        return ((this.LL - measuredHeight) * f2) + (measuredHeight / 2.0f);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int measuredWidth;
        int measuredHeight;
        float fLIZJ;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            requestDisallowInterceptTouchEvent(false);
            this.LLILZIL.setSelected(false);
            InterfaceC529170Kp9 interfaceC529170Kp9 = this.LLJJIJIIJIL;
            if (interfaceC529170Kp9 != null) {
                interfaceC529170Kp9.LIZ(false);
            }
            this.LLILZLL.animate().setInterpolator(this.LLJJIII).translationX(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            this.LLILZLL.setBackground(LIZIZ(C12ES.LIZJ(20.0f, getContext())));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZLLLIL.getMeasuredWidth(), C12ES.LIZJ(3.0f, C0CHQ.LIZ));
            valueAnimatorOfFloat.setInterpolator(this.LLJJIII);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS258S0100000_8(this, 4));
            valueAnimatorOfFloat.addListener(new ALAdapterS5S0100000_8(this, 7));
            valueAnimatorOfFloat.start();
            if (Math.abs(motionEvent.getY() - this.LLJJJ) > 10.0f) {
                this.LLJI.onTimeLineMoveEnd();
            }
            C0LJU c0lju = this.LLJI;
            if (c0lju != null) {
                c0lju.onFastScrollStop(true);
            }
            if (C1322200kVm.LIZ().LJIILL()) {
                getHandler().removeCallbacks(this.LLJJI);
                C1322200kVm.LIZ().LJIJJ();
            }
            return true;
        }
        View view = this.LLJ;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        this.LLJJJ = motionEvent.getY();
        this.LLJJJIL = this.LLILZIL.getY();
        int[] iArr = new int[2];
        this.LLILZLL.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.LLIZLLLIL.getLocationOnScreen(iArr2);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (this.LLJJ) {
            i = iArr2[0];
            i2 = iArr2[1];
            measuredWidth = iArr[0] + this.LLILZLL.getMeasuredWidth();
            measuredHeight = iArr[1] + this.LLILZLL.getMeasuredHeight();
        } else {
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = iArr2[0] + this.LLIZLLLIL.getMeasuredWidth();
            measuredHeight = iArr2[1] + this.LLIZLLLIL.getMeasuredHeight();
        }
        if (rawY < i2 || rawY > measuredHeight || rawX < i || rawX > measuredWidth || this.LLJILJIL) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        this.LLILZIL.setSelected(true);
        InterfaceC529170Kp9 interfaceC529170Kp92 = this.LLJJIJIIJIL;
        if (interfaceC529170Kp92 != null) {
            interfaceC529170Kp92.LIZ(true);
        }
        getHandler().removeCallbacks(this.LLJILLL);
        if (this.LLJJ) {
            fLIZJ = C12ES.LIZJ(56.0f, getContext());
        } else {
            fLIZJ = -C12ES.LIZJ(56.0f, getContext());
        }
        this.LLILZLL.animate().setInterpolator(this.LLJJIII).translationX(fLIZJ).scaleX(1.25f).scaleY(1.25f).setDuration(200L).start();
        this.LLILZLL.setBackground(LIZIZ(C12ES.LIZJ(25.0f, getContext())));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(C12ES.LIZJ(3.0f, C0CHQ.LIZ), C12ES.LIZJ(4.0f, C0CHQ.LIZ));
        valueAnimatorOfFloat2.setInterpolator(this.LLJJIII);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS258S0100000_8(this, 5));
        valueAnimatorOfFloat2.addListener(new ALAdapterS5S0100000_8(this, 6));
        valueAnimatorOfFloat2.start();
        if (!C1322200kVm.LIZ().LJIILL()) {
            C1322200kVm.LIZ().LJIILLIIL();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJJJ < 50) {
            getHandler().removeCallbacks(this.LLJJI);
        }
        this.LLJJJJ = jCurrentTimeMillis;
        C786410Ut5.LJLIIL(50L, getHandler(), this.LLJJI);
        float y = motionEvent.getY();
        float measuredHeight2 = this.LLJJJIL + (y - this.LLJJJ) + (this.LLILZIL.getMeasuredHeight() / 2.0f);
        setTimeLineViewsPosition(measuredHeight2);
        if (Math.abs(y - this.LLJJJ) > 10.0f) {
            setRecyclerViewPosition(measuredHeight2);
        }
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public void setFastScrollListener(C0LJU c0lju) {
        this.LLJI = c0lju;
    }

    public void setLayoutParams(ViewGroup viewGroup) {
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null && recyclerView.getId() != -1) {
            if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                layoutParams.height = -1;
                layoutParams.gravity = 8388613;
                layoutParams.setMargins(0, 0, 0, 0);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setLayoutParams(layoutParams);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.LLILZ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.LLILLJJLI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                this.LLILZIL.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                return;
            }
            throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
        }
        throw new IllegalArgumentException("RecyclerView must have a view ID");
    }

    public void setSectionIndexer(InterfaceC530060Kqa interfaceC530060Kqa) {
        this.LLJIJIL = interfaceC530060Kqa;
    }

    public void setTimeLineSelectStateListener(InterfaceC529170Kp9 interfaceC529170Kp9) {
        this.LLJJIJIIJIL = interfaceC529170Kp9;
    }

    public void setTimeLineViewsPosition(float f) {
        int measuredHeight = this.LLILZIL.getMeasuredHeight();
        C786410Ut5.Kd(Math.min(Math.max(0, (int) (f - (measuredHeight / 2))), this.LL - measuredHeight), this.LLILZIL);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -1;
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LL = i2;
    }
}
