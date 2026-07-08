package X;

import Y.AAListenerS334S0100000_24;
import Y.ACListenerS158S0100000_24;
import Y.AUListenerS72S0101000_24;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1607680rwE extends FrameLayout {
    public C1235870iGX LL;
    public C21597019fc LLILLJJLI;
    public InterfaceC1581880rGc LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public ValueAnimator LLJIJIL;
    public long LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public View LLJJ;

    public final void LIZ() {
        this.LLJIJIL = ValueAnimator.ofFloat(0.0f, 1.0f);
        int viewPagerMarginTop = getViewPagerMarginTop();
        int i = (viewPagerMarginTop * (-200)) / this.LLJ;
        if (i < 0) {
            i = 200;
        }
        this.LLJIJIL.setDuration(i);
        this.LLJIJIL.addUpdateListener(new AUListenerS72S0101000_24(this, viewPagerMarginTop, 1));
        this.LLJIJIL.addListener(new AAListenerS334S0100000_24(this, 4));
        this.LLJIJIL.start();
        C1235870iGX c1235870iGXLIZIZ = LIZIZ(false);
        if (c1235870iGXLIZIZ != null) {
            C786410Ut5.LJLLLLLL(8, c1235870iGXLIZIZ);
        }
    }

    public void setLoadMoreListener(InterfaceC1607690rwF interfaceC1607690rwF) {
    }

    public int getViewPagerMarginTop() {
        C21597019fc c21597019fc = this.LLILLJJLI;
        if (c21597019fc == null) {
            return 0;
        }
        return ((ViewGroup.MarginLayoutParams) c21597019fc.getLayoutParams()).topMargin;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        try {
            super.onFinishInflate();
            this.LLJILLL = true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C1235870iGX LIZIZ(boolean z) {
        if (this.LL == null && z && this.LLJILLL) {
            try {
                this.LL = new C1235870iGX(getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C341940Daq.LIZ(60.0d));
                layoutParams.gravity = 80;
                layoutParams.setMargins(0, 0, 0, C341940Daq.LIZ(49.0d));
                addView(this.LL, 0, layoutParams);
                if (this.LLJJ == null) {
                    TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(getContext()), null);
                    textView.setGravity(17);
                    textView.setTextColor(getContext().getResources().getColor(R.color.bg));
                    this.LLJJ = textView;
                }
                C1235870iGX c1235870iGX = this.LL;
                C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(getContext());
                ACListenerS158S0100000_24 aCListenerS158S0100000_24 = new ACListenerS158S0100000_24(this, 62);
                c1209530ha3LIZ.LIZJ(2131836754);
                C786410Ut5.I7(aCListenerS158S0100000_24, c1209530ha3LIZ.LIZLLL);
                c1209530ha3LIZ.LIZIZ(this.LLJJ);
                c1235870iGX.setBuilder(c1209530ha3LIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LL = null;
            }
        }
        C1235870iGX c1235870iGX2 = this.LL;
        if (c1235870iGX2 != null && c1235870iGX2.LIZLLL()) {
            this.LLIZLLLIL = -1;
        }
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.19fc r0 = r6.LLILLJJLI
            r2 = 0
            if (r0 == 0) goto L3b
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            if (r0 == 0) goto L3b
            X.19fc r0 = r6.LLILLJJLI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r0 = r0.getCount()
            if (r0 == 0) goto L3b
            X.19fc r0 = r6.LLILLJJLI
            androidx.viewpager.widget.PagerAdapter r0 = r0.getAdapter()
            int r1 = r0.getCount()
            r5 = 1
            int r1 = r1 - r5
            X.19fc r0 = r6.LLILLJJLI
            int r0 = r0.getCurrentItem()
            if (r1 != r0) goto L3b
            X.19fc r0 = r6.LLILLJJLI
            boolean r0 = r0.LLLILZLLLI
            if (r0 != 0) goto L3b
            X.0rGc r0 = r6.LLILLL
            if (r0 == 0) goto L3c
            boolean r0 = r0.LJJIIJZLJL()
            if (r0 == 0) goto L3c
        L3b:
            return r2
        L3c:
            int r1 = r7.getAction()
            if (r1 == 0) goto L88
            if (r1 == r5) goto L85
            r0 = 2
            if (r1 == r0) goto L4d
            r0 = 3
            if (r1 == r0) goto L85
        L4a:
            boolean r0 = r6.LLILZIL
            return r0
        L4d:
            float r4 = r7.getY()
            float r3 = r6.LLILZLL
            float r2 = r3 - r4
            int r0 = r6.LLILZ
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6a
            boolean r0 = r6.LLILZIL
            if (r0 != 0) goto L6a
            r6.LLILZIL = r5
            android.animation.ValueAnimator r0 = r6.LLJIJIL
            if (r0 == 0) goto L4a
            r0.cancel()
            goto L4a
        L6a:
            float r4 = r4 - r3
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4a
            boolean r0 = r6.LLILZIL
            if (r0 != 0) goto L4a
            X.19fc r0 = r6.LLILLJJLI
            int r0 = r0.getTop()
            if (r0 >= 0) goto L4a
            r6.LLILZIL = r5
            android.animation.ValueAnimator r0 = r6.LLJIJIL
            if (r0 == 0) goto L4a
            r0.cancel()
            goto L4a
        L85:
            r6.LLILZIL = r2
            goto L4a
        L88:
            r6.LLILZIL = r2
            float r0 = r7.getY()
            r6.LLILZLL = r0
            r6.LLIZ = r0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1607680rwE.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C21597019fc c21597019fc;
        InterfaceC1581880rGc interfaceC1581880rGc;
        int i;
        C1235870iGX c1235870iGXLIZIZ = LIZIZ(true);
        if (c1235870iGXLIZIZ == null || (c21597019fc = this.LLILLJJLI) == null || c21597019fc.getAdapter() == null || this.LLILLJJLI.getAdapter().getCount() == 0 || this.LLILLJJLI.getAdapter().getCount() - 1 != this.LLILLJJLI.getCurrentItem() || this.LLILLJJLI.LLLILZLLLI || ((interfaceC1581880rGc = this.LLILLL) != null && interfaceC1581880rGc.LJJIIJZLJL())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && this.LLILZIL) {
                        LIZ();
                        this.LLILZIL = false;
                    }
                } else if (this.LLILZIL) {
                    float y = motionEvent.getY();
                    int i2 = (int) ((y - this.LLIZ) / 1.0f);
                    this.LLIZ = y;
                    int viewPagerMarginTop = getViewPagerMarginTop();
                    int i3 = viewPagerMarginTop + i2;
                    if (i3 > 0) {
                        i2 = -viewPagerMarginTop;
                    }
                    if (i3 >= (-this.LLJ)) {
                        setViewPagerMarginTopByDelta(i2);
                        if (c1235870iGXLIZIZ.LIZLLL()) {
                            c1235870iGXLIZIZ.LJIIIIZZ();
                        } else {
                            C1235870iGX c1235870iGXLIZIZ2 = LIZIZ(true);
                            if (c1235870iGXLIZIZ2 != null) {
                                C786410Ut5.LJLLLLLL(0, c1235870iGXLIZIZ2);
                            }
                            setBackgroundColor(getContext().getResources().getColor(R.color.b6));
                        }
                    }
                }
            } else if (this.LLILZIL) {
                if (getViewPagerMarginTop() <= (-this.LLJI) && (i = this.LLIZLLLIL) != 1 && i != 2) {
                    this.LLJIJIL = ValueAnimator.ofFloat(0.0f, 1.0f);
                    int viewPagerMarginTop2 = getViewPagerMarginTop();
                    int i4 = ((this.LLJI + viewPagerMarginTop2) * (-200)) / this.LLJ;
                    if (i4 < 0) {
                        i4 = 200;
                    }
                    this.LLJIJIL.setDuration(i4);
                    this.LLJIJIL.addUpdateListener(new AUListenerS72S0101000_24(this, viewPagerMarginTop2, 2));
                    this.LLJIJIL.addListener(new AAListenerS334S0100000_24(this, 9));
                    this.LLJIJIL.start();
                } else {
                    LIZ();
                }
                this.LLILZIL = false;
            }
        } else {
            this.LLILZIL = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setLabel(String str) {
        this.LLJILJILJ = str;
    }

    public void setViewPagerMarginTopByDelta(int i) {
        C21597019fc c21597019fc = this.LLILLJJLI;
        if (c21597019fc == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c21597019fc.getLayoutParams();
        int i2 = marginLayoutParams.topMargin + i;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = -i2;
        C21597019fc c21597019fc2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21597019fc2);
        c21597019fc2.setLayoutParams(marginLayoutParams);
    }

    public C1607680rwE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = -1;
        this.LLJILJIL = -1L;
        this.LLILZ = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJI = (int) (getContext().getResources().getDisplayMetrics().density * 109.0f);
        this.LLJ = (int) (getContext().getResources().getDisplayMetrics().density * 218.0f);
    }
}
