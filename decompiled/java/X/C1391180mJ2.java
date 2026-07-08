package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391180mJ2 extends RelativeLayout {
    public int LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Float LLIZ;
    public Float LLIZLLLIL;
    public Float LLJ;
    public AbstractC1177930gl5 LLJI;
    public AbstractC1391240mJ8 LLJIJIL;
    public Boolean LLJILJIL;
    public List<? extends AbstractC1391220mJ6> LLJILJILJ;
    public final C01GW LLJILLL;
    public boolean LLJJ;
    public C1066370dr9 LLJJI;
    public BottomSheetBehavior<?> LLJJIII;
    public boolean LLJJIJI;
    public TuxSheetBehavior<?> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public View LLJJJ;
    public C1391200mJ4 LLJJJIL;
    public Function1<? super View, Unit> LLJJJJ;
    public Function0<Unit> dismissFunc;

    private final int getMinHeightPx() {
        return ((Number) this.LLJILLL.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.0mJ4, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        final boolean zBooleanValue;
        BottomSheetBehavior<?> bottomSheetBehaviorFrom;
        C16G1 c16g1;
        TuxSheetBehavior<?> tuxSheetBehavior;
        C16G1 c16g12;
        TuxSheetBehavior<?> tuxSheetBehavior2;
        C16G1 c16g13;
        List<? extends AbstractC1391220mJ6> list;
        View view;
        super.onAttachedToWindow();
        Boolean bool = this.LLJILJIL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            int i = this.LL;
            zBooleanValue = i == 2 || i == 3 || i == 5;
        }
        C1066370dr9 c1066370dr9 = this.LLJJI;
        if (c1066370dr9 != null) {
            C786410Ut5.LLLZIL(c1066370dr9, zBooleanValue ? 0 : 8);
        }
        View view2 = this;
        do {
            Object parent = view2.getParent();
            C16BC c16bc = null;
            if (parent instanceof C16G0) {
                boolean z = !(this.LL != 5 || (list = this.LLJILJILJ) == null || list.isEmpty()) || (TuxSheet.LLLILZLLLI && (this.LLJJIJIIJIL != null || (this.LLJJIII == null && zBooleanValue)));
                this.LLJJIJIL = z;
                if (z) {
                    if (this.LLJJIJIIJIL == null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        if (layoutParams instanceof C16G1) {
                            c16g13 = (C16G1) layoutParams;
                            if (c16g13 != null) {
                                c16bc = c16g13.LIZ;
                            }
                        } else {
                            c16g13 = null;
                        }
                        if (!(c16bc instanceof TuxSheetBehavior) || (tuxSheetBehavior = (TuxSheetBehavior) c16bc) == null) {
                            tuxSheetBehavior = new TuxSheetBehavior<>();
                            if (c16g13 != null) {
                                c16g13.LIZIZ(tuxSheetBehavior);
                            }
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if ((layoutParams2 instanceof C16G1) && (c16g12 = (C16G1) layoutParams2) != null) {
                            c16g12.LIZIZ(this.LLJJIJIIJIL);
                        }
                        tuxSheetBehavior = this.LLJJIJIIJIL;
                    }
                    this.LLJJIJIIJIL = tuxSheetBehavior;
                    if (this.LL == 5) {
                        if (tuxSheetBehavior != null) {
                            tuxSheetBehavior.setFitToContents(false);
                        }
                    } else if (tuxSheetBehavior != null) {
                        tuxSheetBehavior.LIZJ = C13BV.INSTANCE;
                        if (tuxSheetBehavior.LJJII != 0) {
                            tuxSheetBehavior.LIZ();
                        }
                    }
                    C1391200mJ4 c1391200mJ4 = this.LLJJJIL;
                    if (c1391200mJ4 != null && (tuxSheetBehavior2 = this.LLJJIJIIJIL) != null) {
                        tuxSheetBehavior2.LJJIIJ.remove(c1391200mJ4);
                    }
                    ?? r5 = new AbstractC1391240mJ8() { // from class: X.0mJ4
                        @Override // X.AbstractC1391240mJ8
                        public final void LIZ(View view3, float f) {
                            AbstractC1391240mJ8 tuxSheetCallback = this.LIZ.getTuxSheetCallback();
                            if (tuxSheetCallback != null) {
                                tuxSheetCallback.LIZ(view3, f);
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
                        @Override // X.AbstractC1391240mJ8
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(int r8, android.view.View r9) {
                            /*
                                r7 = this;
                                boolean r0 = r2
                                r4 = 5
                                if (r0 == 0) goto L4c
                                X.0mJ2 r0 = r7.LIZ
                                int r0 = r0.getVariant()
                                r3 = 3
                                r6 = 1
                                r2 = 0
                                if (r0 != r3) goto L67
                                r5 = 1
                            L11:
                                X.0mJ2 r0 = r7.LIZ
                                int r0 = r0.getVariant()
                                if (r0 != r4) goto L65
                                X.0mJ2 r0 = r7.LIZ
                                java.util.List r1 = r0.getStopHeightsConfig()
                                if (r1 == 0) goto L65
                                boolean r0 = r1.isEmpty()
                                if (r0 != 0) goto L65
                                java.util.Iterator r1 = r1.iterator()
                            L2b:
                                boolean r0 = r1.hasNext()
                                if (r0 == 0) goto L65
                                java.lang.Object r0 = r1.next()
                                boolean r0 = r0 instanceof X.C1391250mJ9
                                if (r0 == 0) goto L2b
                            L39:
                                if (r5 != 0) goto L3d
                                if (r6 == 0) goto L4c
                            L3d:
                                X.0mJ2 r0 = r7.LIZ
                                X.0dr9 r0 = r0.getHandleView()
                                if (r0 == 0) goto L4c
                                if (r8 != r3) goto L49
                                r2 = 8
                            L49:
                                X.C786410Ut5.LLLZIL(r0, r2)
                            L4c:
                                if (r8 != r4) goto L59
                                X.0mJ2 r0 = r7.LIZ
                                kotlin.jvm.functions.Function0 r0 = r0.getDismissFunc()
                                if (r0 == 0) goto L59
                                r0.invoke()
                            L59:
                                X.0mJ2 r0 = r7.LIZ
                                X.0mJ8 r0 = r0.getTuxSheetCallback()
                                if (r0 == 0) goto L64
                                r0.LIZIZ(r8, r9)
                            L64:
                                return
                            L65:
                                r6 = 0
                                goto L39
                            L67:
                                r5 = 0
                                goto L11
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1391200mJ4.LIZIZ(int, android.view.View):void");
                        }
                    };
                    TuxSheetBehavior<?> tuxSheetBehavior3 = this.LLJJIJIIJIL;
                    if (tuxSheetBehavior3 != null && !tuxSheetBehavior3.LJJIIJ.contains(r5)) {
                        tuxSheetBehavior3.LJJIIJ.add((AbstractC1391240mJ8) r5);
                    }
                    this.LLJJJIL = r5;
                    if (this.LLJJIJI) {
                        TuxSheetBehavior<?> tuxSheetBehavior4 = this.LLJJIJIIJIL;
                        if (tuxSheetBehavior4 != null) {
                            tuxSheetBehavior4.setState(3);
                        }
                        this.LLJJ = true;
                    }
                    TuxSheetBehavior<?> tuxSheetBehavior5 = this.LLJJIJIIJIL;
                    if (tuxSheetBehavior5 != null) {
                        tuxSheetBehavior5.setHideable(this.LLILLJJLI);
                    }
                } else {
                    if (this.LLJJIII == null) {
                        bottomSheetBehaviorFrom = BottomSheetBehavior.from(view2);
                    } else {
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        if ((layoutParams3 instanceof C16G1) && (c16g1 = (C16G1) layoutParams3) != null) {
                            c16g1.LIZIZ(this.LLJJIII);
                        }
                        bottomSheetBehaviorFrom = this.LLJJIII;
                    }
                    this.LLJJIII = bottomSheetBehaviorFrom;
                    if (bottomSheetBehaviorFrom != null) {
                        bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0mJ5
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
                                if (zBooleanValue && this.LIZ.getVariant() == 3 && (handleView = this.LIZ.getHandleView()) != null) {
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
                    if (this.LLJJIJI) {
                        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJJIII;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setState(3);
                        }
                        this.LLJJ = true;
                    }
                    BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLJJIII;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.setHideable(this.LLILLJJLI);
                    }
                }
                if (this.LLILZIL >= 0) {
                    this.LLJJJ = getRootView().findViewById(R.id.eqx);
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        TuxSheetBehavior<?> tuxSheetBehavior;
        super.onDetachedFromWindow();
        C1391200mJ4 c1391200mJ4 = this.LLJJJIL;
        if (c1391200mJ4 != null && (tuxSheetBehavior = this.LLJJIJIIJIL) != null) {
            tuxSheetBehavior.LJJIIJ.remove(c1391200mJ4);
        }
        this.LLJJJIL = null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLJJI = (C1066370dr9) findViewById(R.id.v4f);
    }

    public final BottomSheetBehavior<?> getBehavior() {
        return this.LLJJIII;
    }

    public final AbstractC1177930gl5 getBottomSheetCallback() {
        return this.LLJI;
    }

    public final Float getCustomAutoSizeMaxHeightRatio() {
        return this.LLIZLLLIL;
    }

    public final Float getCustomAutoSizeMinHeightRatio() {
        return this.LLJ;
    }

    public final Function0<Unit> getDismissFunc() {
        return this.dismissFunc;
    }

    public final TuxSheetBehavior<?> getDragBehavior() {
        return this.LLJJIJIIJIL;
    }

    public final int getDynamicMaxHeightPx() {
        return this.LLILZLL;
    }

    public final int getDynamicPeekHeightPx() {
        return this.LLILZ;
    }

    public final boolean getExpandOnShow() {
        return this.LLJJIJI;
    }

    public final int getFixedHeightPx() {
        return this.LLILLL;
    }

    public final Boolean getForceSheetHandleShow() {
        return this.LLJILJIL;
    }

    public final Float getFullScreenSheetInitialVisibleRatio() {
        return this.LLIZ;
    }

    public final C1066370dr9 getHandleView() {
        return this.LLJJI;
    }

    public final int getMinVisibleHeightPx() {
        return this.LLILZIL;
    }

    public final Function1<View, Unit> getOnInitialExpandLayout() {
        return this.LLJJJJ;
    }

    public final List<AbstractC1391220mJ6> getStopHeightsConfig() {
        return this.LLJILJILJ;
    }

    public final AbstractC1391240mJ8 getTuxSheetCallback() {
        return this.LLJIJIL;
    }

    public final boolean getUsingDragBehavior() {
        return this.LLJJIJIL;
    }

    public final int getVariant() {
        return this.LL;
    }

    public final void setBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        this.LLJJIII = bottomSheetBehavior;
    }

    public final void setBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        this.LLJI = abstractC1177930gl5;
    }

    public final void setCustomAutoSizeMaxHeightRatio(Float f) {
        this.LLIZLLLIL = f;
    }

    public final void setCustomAutoSizeMinHeightRatio(Float f) {
        this.LLJ = f;
    }

    public final void setDismissFunc(Function0<Unit> function0) {
        this.dismissFunc = function0;
    }

    public final void setDragBehavior(TuxSheetBehavior<?> tuxSheetBehavior) {
        this.LLJJIJIIJIL = tuxSheetBehavior;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.LLILZLL = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.LLILZ = i;
    }

    public final void setDynamicPeekHeightPx$tux_theme_release(int i) {
        this.LLILZ = i;
        if (this.LLJJIJIL) {
            TuxSheetBehavior<?> tuxSheetBehavior = this.LLJJIJIIJIL;
            if (tuxSheetBehavior != null) {
                tuxSheetBehavior.setPeekHeight(i);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJJIII;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setPeekHeight(i);
    }

    public final void setExpandOnShow(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setFixedHeightPx(int i) {
        this.LLILLL = i;
    }

    public final void setFixedHeightPx$tux_theme_release(int i) {
        this.LLILLL = i;
        if (this.LLJJIJIL) {
            TuxSheetBehavior<?> tuxSheetBehavior = this.LLJJIJIIJIL;
            if (tuxSheetBehavior != null) {
                tuxSheetBehavior.setPeekHeight(i);
                return;
            }
            return;
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJJIII;
        if (bottomSheetBehavior == null) {
            return;
        }
        bottomSheetBehavior.setPeekHeight(i);
    }

    public final void setForceSheetHandleShow(Boolean bool) {
        this.LLJILJIL = bool;
    }

    public final void setFullScreenSheetInitialVisibleRatio(Float f) {
        this.LLIZ = f;
    }

    public final void setHandleView(C1066370dr9 c1066370dr9) {
        this.LLJJI = c1066370dr9;
    }

    public final void setHideable(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setHideable$tux_theme_release(boolean z) {
        this.LLILLJJLI = z;
        TuxSheetBehavior<?> tuxSheetBehavior = this.LLJJIJIIJIL;
        if (tuxSheetBehavior != null) {
            tuxSheetBehavior.setHideable(z);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLJJIII;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setHideable(this.LLILLJJLI);
        }
    }

    public final void setMinVisibleHeightPx(int i) {
        this.LLILZIL = i;
    }

    public final void setOnInitialExpandLayout(Function1<? super View, Unit> function1) {
        this.LLJJJJ = function1;
    }

    public final void setStopHeightsConfig(List<? extends AbstractC1391220mJ6> list) {
        this.LLJILJILJ = list;
    }

    public final void setTuxSheetCallback(AbstractC1391240mJ8 abstractC1391240mJ8) {
        this.LLJIJIL = abstractC1391240mJ8;
    }

    public final void setVariant(int i) {
        this.LL = i;
    }

    public C1391180mJ2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = true;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLJILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1527));
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0116 A[PHI: r4 r6
      0x0116: PHI (r4v1 java.lang.Integer) = (r4v0 java.lang.Integer), (r4v0 java.lang.Integer), (r4v3 java.lang.Integer) binds: [B:75:0x0102, B:63:0x00e4, B:82:0x0114] A[DONT_GENERATE, DONT_INLINE]
      0x0116: PHI (r6v5 int) = (r6v2 int), (r6v8 int), (r6v11 int) binds: [B:75:0x0102, B:63:0x00e4, B:82:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1391180mJ2.onMeasure(int, int):void");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        C1066370dr9 c1066370dr9;
        super.onLayout(z, i, i2, i3, i4);
        if (this.LLJJ) {
            this.LLJJ = false;
            if (this.LL == 3 && (c1066370dr9 = this.LLJJI) != null) {
                C786410Ut5.LLLZIL(c1066370dr9, 8);
            }
            View view2 = this;
            do {
                Object parent = view2.getParent();
                if (parent instanceof C16G0) {
                    Function1<? super View, Unit> function1 = this.LLJJJJ;
                    if (function1 != null) {
                        function1.invoke(view2);
                        return;
                    }
                    return;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                    view2 = view;
                } else {
                    return;
                }
            } while (view != null);
        }
    }
}
