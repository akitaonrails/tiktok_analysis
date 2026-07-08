package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.194k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214800194k extends RelativeLayout {
    public static final float LLJJIJIIJIL = C418440Gaw.LIZIZ(12);
    public EnumC214804194o LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public Function0<Unit> LLIZ;
    public Boolean LLIZLLLIL;
    public AbstractC1177930gl5 LLJ;
    public int LLJI;
    public float LLJIJIL;
    public GradientDrawable LLJILJIL;
    public final RectF LLJILJILJ;
    public final Path LLJILLL;
    public float[] LLJJ;
    public final C01GW LLJJI;
    public C1066370dr9 LLJJIII;
    public CreativeBottomSheetBehavior<?> LLJJIJI;

    private final int getMinHeightPx() {
        return ((Number) this.LLJJI.getValue()).intValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        final boolean zBooleanValue;
        C16G1 c16g1;
        super.onAttachedToWindow();
        Boolean bool = this.LLIZLLLIL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            EnumC214804194o enumC214804194o = this.LL;
            zBooleanValue = enumC214804194o == EnumC214804194o.DYNAMIC || enumC214804194o == EnumC214804194o.FULLSCREEN;
        }
        C1066370dr9 c1066370dr9 = this.LLJJIII;
        if (c1066370dr9 != null) {
            C786410Ut5.LLLZIL(c1066370dr9, zBooleanValue ? 0 : 8);
        }
        if (this.LLJJIJI == null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (!(layoutParams instanceof C16G1)) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (!(c16bc instanceof CreativeBottomSheetBehavior)) {
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            this.LLJJIJI = (CreativeBottomSheetBehavior) c16bc;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
            c16g1.LIZIZ(this.LLJJIJI);
        }
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior = this.LLJJIJI;
        if (creativeBottomSheetBehavior != null) {
            int i = this.LLJI;
            creativeBottomSheetBehavior.LJJJI = i;
            C21583119dN c21583119dN = creativeBottomSheetBehavior.LJJIFFI;
            if (c21583119dN != null) {
                c21583119dN.LJIIJJI = i;
            }
            AbstractC214811194v abstractC214811194v = new AbstractC214811194v() { // from class: X.194q
                @Override // X.AbstractC214811194v
                public final void LIZ(View view, float f) {
                    AbstractC1177930gl5 bottomSheetCallback = this.LIZ.getBottomSheetCallback();
                    if (bottomSheetCallback != null) {
                        bottomSheetCallback.LIZJ(view, f);
                    }
                }

                @Override // X.AbstractC214811194v
                public final void LIZIZ(int i2, View view) {
                    Function0<Unit> dismissFunc;
                    C1066370dr9 handleView;
                    int i3;
                    if (zBooleanValue && this.LIZ.getVariant() == EnumC214804194o.FULLSCREEN && (handleView = this.LIZ.getHandleView()) != null) {
                        if (i2 == 3) {
                            i3 = 8;
                        } else {
                            i3 = 0;
                        }
                        C786410Ut5.LLLZIL(handleView, i3);
                    }
                    AbstractC1177930gl5 bottomSheetCallback = this.LIZ.getBottomSheetCallback();
                    if (bottomSheetCallback != null) {
                        bottomSheetCallback.LIZLLL(i2, view);
                    }
                    if (i2 == 5 && (dismissFunc = this.LIZ.getDismissFunc()) != null) {
                        dismissFunc.invoke();
                    }
                }
            };
            creativeBottomSheetBehavior.LJJIJIIJIL.clear();
            creativeBottomSheetBehavior.LJJIJIIJIL.add(abstractC214811194v);
        }
        CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior2 = this.LLJJIJI;
        if (creativeBottomSheetBehavior2 != null) {
            boolean z = this.LLILLJJLI;
            if (creativeBottomSheetBehavior2.LJIJJLI != z) {
                creativeBottomSheetBehavior2.LJIJJLI = z;
                if (!z && creativeBottomSheetBehavior2.LJJI == 5) {
                    creativeBottomSheetBehavior2.setState(4);
                }
                creativeBottomSheetBehavior2.updateAccessibilityActions();
            }
            EnumC214804194o enumC214804194o2 = this.LL;
            if (enumC214804194o2 == EnumC214804194o.FIXED) {
                creativeBottomSheetBehavior2.setPeekHeight(this.LLILLL);
            } else if (enumC214804194o2 == EnumC214804194o.DYNAMIC) {
                creativeBottomSheetBehavior2.setPeekHeight(this.LLILZIL);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLJJIII = (C1066370dr9) findViewById(R.id.v4f);
    }

    public final CreativeBottomSheetBehavior<?> getBehavior() {
        return this.LLJJIJI;
    }

    public final int getBottomSheetAnimDuration() {
        return this.LLJI;
    }

    public final AbstractC1177930gl5 getBottomSheetCallback() {
        return this.LLJ;
    }

    public final Function0<Unit> getDismissFunc() {
        return this.LLIZ;
    }

    public final int getDynamicMaxHeightPx() {
        return this.LLILZLL;
    }

    public final int getDynamicPeekHeightPx() {
        return this.LLILZIL;
    }

    public final int getFixedHeightPx() {
        return this.LLILLL;
    }

    public final int getForceScreenHeight() {
        return this.LLILZ;
    }

    public final Boolean getForceSheetHandleShow() {
        return this.LLIZLLLIL;
    }

    public final C1066370dr9 getHandleView() {
        return this.LLJJIII;
    }

    public final float getRadius() {
        return this.LLJIJIL;
    }

    public final EnumC214804194o getVariant() {
        return this.LL;
    }

    public final GradientDrawable LIZ(Integer num) {
        C384050F3z c384050F3z = new C384050F3z();
        if (num == null) {
            num = 0;
        }
        c384050F3z.LIZIZ = num;
        c384050F3z.LJIIIIZZ = Float.valueOf(this.LLJIJIL);
        c384050F3z.LJIIIZ = Float.valueOf(this.LLJIJIL);
        return (GradientDrawable) c384050F3z.LIZ(getContext());
    }

    public final void LIZIZ(boolean z) {
        float f;
        if (z) {
            f = this.LLJIJIL;
        } else {
            f = 0.0f;
        }
        float[] fArr = {f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.LLJJ = fArr;
        GradientDrawable gradientDrawable = this.LLJILJIL;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.LLJILJILJ.set(0.0f, 0.0f, getWidth(), getHeight());
        float[] fArr = this.LLJJ;
        if (fArr != null) {
            this.LLJILLL.reset();
            this.LLJILLL.addRoundRect(this.LLJILJILJ, fArr, Path.Direction.CW);
            canvas.clipPath(this.LLJILLL);
        } else {
            canvas.clipRect(this.LLJILJILJ);
        }
        super.draw(canvas);
    }

    public final void setBehavior(CreativeBottomSheetBehavior<?> creativeBottomSheetBehavior) {
        this.LLJJIJI = creativeBottomSheetBehavior;
    }

    public final void setBottomSheetAnimDuration(int i) {
        this.LLJI = i;
    }

    public final void setBottomSheetBackground$tools_creative_sheet_scene_release(GradientDrawable gradientDrawable) {
        if (gradientDrawable == null) {
            gradientDrawable = LIZ(null);
        }
        this.LLJILJIL = gradientDrawable;
        setBackground(gradientDrawable);
    }

    public final void setBottomSheetBackgroundColor$tools_creative_sheet_scene_release(Integer num) {
        GradientDrawable gradientDrawableLIZ = LIZ(num);
        this.LLJILJIL = gradientDrawableLIZ;
        setBackground(gradientDrawableLIZ);
    }

    public final void setBottomSheetCallback(AbstractC1177930gl5 abstractC1177930gl5) {
        this.LLJ = abstractC1177930gl5;
    }

    public final void setDismissFunc(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setDynamicMaxHeightPx(int i) {
        this.LLILZLL = i;
    }

    public final void setDynamicPeekHeightPx(int i) {
        this.LLILZIL = i;
    }

    public final void setFixedHeightPx(int i) {
        this.LLILLL = i;
    }

    public final void setForceScreenHeight(int i) {
        this.LLILZ = i;
    }

    public final void setForceSheetHandleShow(Boolean bool) {
        this.LLIZLLLIL = bool;
    }

    public final void setHandleView(C1066370dr9 c1066370dr9) {
        this.LLJJIII = c1066370dr9;
    }

    public final void setHideable(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setRadius(float f) {
        this.LLJIJIL = f;
    }

    public final void setVariant(EnumC214804194o enumC214804194o) {
        this.LL = enumC214804194o;
    }

    public C214800194k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC214804194o.AUTO_SIZE;
        this.LLILLJJLI = true;
        this.LLILLL = -1;
        this.LLILZ = C418440Gaw.LIZJ(context);
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLJI = -1;
        this.LLJIJIL = LLJJIJIIJIL;
        this.LLJILJILJ = new RectF();
        this.LLJILLL = new Path();
        this.LLJJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 781));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065 A[PHI: r4
      0x0065: PHI (r4v4 java.lang.Integer) = (r4v2 java.lang.Integer), (r4v0 java.lang.Integer) binds: [B:26:0x0062, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083 A[PHI: r0
      0x0083: PHI (r0v4 int) = (r0v3 int), (r0v12 int) binds: [B:39:0x0081, B:33:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r10, int r11) {
        /*
            r9 = this;
            super.onMeasure(r10, r11)
            int r2 = r9.LLILZ
            int r5 = r9.getMeasuredHeight()
            X.194o r0 = r9.LL
            int[] r1 = X.C214803194n.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 2
            r7 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            r4 = 0
            if (r1 == r0) goto L77
            r0 = 3
            if (r1 == r0) goto L67
            r0 = 4
            if (r1 == r0) goto L58
            r0 = 5
            if (r1 != r0) goto L65
            int r6 = android.view.View.MeasureSpec.getSize(r11)
            double r1 = (double) r6
            double r1 = r1 * r7
            int r0 = (int) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L30:
            if (r6 == r5) goto L42
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            super.onMeasure(r10, r0)
            int r0 = r9.getMeasuredWidth()
            r9.setMeasuredDimension(r0, r6)
        L42:
            if (r4 == 0) goto L50
            com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior<?> r1 = r9.LLJJIJI
            if (r1 == 0) goto L4f
            int r0 = r4.intValue()
            r1.setPeekHeight(r0)
        L4f:
            return
        L50:
            com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior<?> r0 = r9.LLJJIJI
            if (r0 == 0) goto L4f
            r0.setPeekHeight(r6)
            return
        L58:
            int r0 = r9.LLILZIL
            if (r0 <= 0) goto L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L60:
            int r6 = r9.LLILZLL
            if (r6 <= 0) goto L65
            goto L30
        L65:
            r6 = r5
            goto L30
        L67:
            int r6 = r9.LLILLL
            if (r6 > 0) goto L6c
            r6 = r5
        L6c:
            double r2 = (double) r2
            r0 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r2 = r2 * r0
            int r0 = (int) r2
            if (r6 <= r0) goto L30
            goto L83
        L77:
            int r6 = r9.getMinHeightPx()
            if (r5 < r6) goto L7e
            r6 = r5
        L7e:
            double r1 = (double) r2
            double r1 = r1 * r7
            int r0 = (int) r1
            if (r6 <= r0) goto L30
        L83:
            r6 = r0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214800194k.onMeasure(int, int):void");
    }
}
