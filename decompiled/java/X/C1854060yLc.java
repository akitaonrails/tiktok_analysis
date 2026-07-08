package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854060yLc extends RelativeLayout {
    public int LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Function0<Unit> LLIZ;
    public AbstractC1177930gl5 LLIZLLLIL;
    public final C01GW LLJ;
    public C1066370dr9 LLJI;
    public BottomSheetBehavior<?> LLJIJIL;
    public boolean LLJILJIL;
    public View LLJILJILJ;

    private final int getMinHeightPx() {
        return ((Number) this.LLJ.getValue()).intValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        BottomSheetBehavior<?> bottomSheetBehaviorFrom;
        C16G1 c16g1;
        View view;
        super.onAttachedToWindow();
        int i = this.LL;
        final boolean z = i == 2 || i == 3;
        C1066370dr9 c1066370dr9 = this.LLJI;
        if (c1066370dr9 != null) {
            C786410Ut5.LLLZIL(c1066370dr9, z ? 0 : 8);
        }
        View view2 = this;
        do {
            Object parent = view2.getParent();
            if (parent instanceof C16G0) {
                if (this.LLJIJIL == null) {
                    bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                        c16g1.LIZIZ(this.LLJIJIL);
                    }
                    bottomSheetBehaviorFrom = this.LLJIJIL;
                }
                this.LLJIJIL = bottomSheetBehaviorFrom;
                if (bottomSheetBehaviorFrom != null) {
                    bottomSheetBehaviorFrom.setDraggable(this.LLJILJIL);
                }
                BottomSheetBehavior<?> bottomSheetBehavior = this.LLJIJIL;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0yLd
                        @Override // X.AbstractC1177930gl5
                        public final void LIZJ(View view3, float f) {
                            AbstractC1177930gl5 bottomSheetCallback = this.LIZ.getBottomSheetCallback();
                            if (bottomSheetCallback != null) {
                                bottomSheetCallback.LIZJ(view3, f);
                            }
                        }

                        @Override // X.AbstractC1177930gl5
                        public final void LIZLLL(int i2, View view3) {
                            Function0<Unit> dismissFunc;
                            C1066370dr9 handleView;
                            int i3;
                            if (z && this.LIZ.getVariant() == 3 && (handleView = this.LIZ.getHandleView()) != null) {
                                if (i2 == 3) {
                                    i3 = 8;
                                } else {
                                    i3 = 0;
                                }
                                C786410Ut5.LLLZIL(handleView, i3);
                            }
                            if (i2 == 5 && (dismissFunc = this.LIZ.getDismissFunc()) != null) {
                                dismissFunc.invoke();
                            }
                            AbstractC1177930gl5 bottomSheetCallback = this.LIZ.getBottomSheetCallback();
                            if (bottomSheetCallback != null) {
                                bottomSheetCallback.LIZLLL(i2, view3);
                            }
                        }
                    });
                }
                BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLJIJIL;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setHideable(this.LLILLJJLI);
                }
                if (this.LLILZIL >= 0) {
                    this.LLJILJILJ = getRootView().findViewById(R.id.eqx);
                    return;
                }
                return;
            }
            if (!(parent instanceof View)) {
                return;
            }
            view = (View) parent;
            view2 = view;
        } while (view != null);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLJI = (C1066370dr9) findViewById(R.id.v4f);
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.LLJIJIL;
    }

    public final AbstractC1177930gl5 getBottomSheetCallback() {
        return this.LLIZLLLIL;
    }

    public final Function0<Unit> getDismissFunc() {
        return this.LLIZ;
    }

    public final boolean getDragable() {
        return this.LLJILJIL;
    }

    public final int getDynamicMaxHeightPx() {
        return this.LLILZLL;
    }

    public final int getDynamicPeekHeightPx() {
        return this.LLILZ;
    }

    public final int getFixedHeightPx() {
        return this.LLILLL;
    }

    public final C1066370dr9 getHandleView() {
        return this.LLJI;
    }

    public final int getMinVisibleHeightPx() {
        return this.LLILZIL;
    }

    public final int getVariant() {
        return this.LL;
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.LLJIJIL = bottomSheetBehavior;
    }

    public final void setBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        this.LLIZLLLIL = abstractC1177930gl5;
    }

    public final void setDismissFunc(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setDragable(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.LLILZLL = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.LLILZ = i;
    }

    public final void setDynamicPeekHeightPx$live_release(int i) {
        this.LLILZ = i;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJIJIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(i);
        }
    }

    public final void setFixedHeightPx(int i) {
        this.LLILLL = i;
    }

    public final void setFixedHeightPx$live_release(int i) {
        this.LLILLL = i;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJIJIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(i);
        }
    }

    public final void setHandleView(C1066370dr9 c1066370dr9) {
        this.LLJI = c1066370dr9;
    }

    public final void setHideable(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setHideable$live_release(boolean z) {
        this.LLILLJJLI = z;
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJIJIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(z);
        }
    }

    public final void setMinVisibleHeightPx(int i) {
        this.LLILZIL = i;
    }

    public final void setVariant(int i) {
        this.LL = i;
    }

    public C1854060yLc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = true;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1268));
        this.LLJILJIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[PHI: r4
      0x0064: PHI (r4v4 java.lang.Integer) = (r4v2 java.lang.Integer), (r4v0 java.lang.Integer) binds: [B:28:0x0061, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[PHI: r0
      0x009e: PHI (r0v2 int) = (r0v1 int), (r0v10 int) binds: [B:52:0x009c, B:44:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            android.content.Context r0 = r9.getContext()
            if (r0 == 0) goto L4e
            int r3 = X.C497820Jfg.LIZ(r0)
            int r5 = r9.getMeasuredHeight()
            int r1 = r9.LL
            r7 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            r4 = 0
            if (r1 == 0) goto L92
            r0 = 1
            if (r1 == r0) goto L66
            r0 = 2
            if (r1 == r0) goto L57
            r0 = 3
            if (r1 != r0) goto L64
            int r6 = android.view.View.MeasureSpec.getSize(r11)
            double r1 = (double) r6
            double r1 = r1 * r7
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L2f:
            if (r6 == r5) goto L41
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r10, r0)
            int r0 = r9.getMeasuredWidth()
            r9.setMeasuredDimension(r0, r6)
        L41:
            if (r4 == 0) goto L4f
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r1 = r9.LLJIJIL
            if (r1 == 0) goto L4e
            int r0 = r4.intValue()
            r1.setPeekHeight(r0)
        L4e:
            return
        L4f:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r9.LLJIJIL
            if (r0 == 0) goto L4e
            r0.setPeekHeight(r6)
            return
        L57:
            int r0 = r9.LLILZ
            if (r0 <= 0) goto L5f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L5f:
            int r6 = r9.LLILZLL
            if (r6 <= 0) goto L64
            goto L2f
        L64:
            r6 = r5
            goto L2f
        L66:
            int r6 = r9.LLILLL
            if (r6 <= 0) goto L90
            int r2 = r9.LLILZIL
            if (r2 < 0) goto L83
            if (r2 > 0) goto L74
            int r2 = r9.getMinHeightPx()
        L74:
            android.view.View r0 = r9.LLJILJILJ
            if (r0 == 0) goto L8e
            int r1 = r0.getPaddingBottom()
        L7c:
            int r0 = r9.LLILLL
            int r6 = r0 - r1
            if (r6 >= r2) goto L83
            r6 = r0
        L83:
            double r2 = (double) r3
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r0
            int r0 = (int) r2
            if (r6 <= r0) goto L2f
            goto L9e
        L8e:
            r1 = 0
            goto L7c
        L90:
            r6 = r5
            goto L83
        L92:
            int r6 = r9.getMinHeightPx()
            if (r5 < r6) goto L99
            r6 = r5
        L99:
            double r1 = (double) r3
            double r1 = r1 * r7
            int r0 = (int) r1
            if (r6 <= r0) goto L2f
        L9e:
            r6 = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1854060yLc.onMeasure(int, int):void");
    }
}
