package X;

import Y.ACListenerS129S0200000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import avg.f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: renamed from: X.0xdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826510xdB extends FrameLayout {
    public Integer LL;
    public final LinearLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public ValueAnimator LLIZ;
    public C1826460xd6 LLIZLLLIL;
    public EnumC1779980wQ8 LLJ;
    public EnumC1826470xd7 LLJI;
    public EnumC1779950wQ5 LLJIJIL;
    public InterfaceC1826630xdN LLJILJIL;
    public final int LLJILJILJ;

    public final void LIZJ() {
        this.LLIZLLLIL = null;
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C786410Ut5.LJZ(8, this.LLILZIL);
        C786410Ut5.LJJJJJL(this.LLILLJJLI);
        LJIIIZ();
        LJIIIIZZ();
        LJII();
        requestLayout();
        invalidate();
    }

    private final GradientDrawable getBackgroundLayerBackground() {
        Drawable background = this.LLILLL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorCoveringColorLayoutBackground() {
        Drawable background = this.LLILZLL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorViewBackground() {
        Drawable background = this.LLILZIL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getMaterialLayerBackground() {
        Drawable background = this.LLILZ.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    public final void LJII() {
        int i = C20094413jq.LJIIZILJ;
        LinearLayout linearLayout = this.LLILLJJLI;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZLLL = new C1614480s7C(this.LLILLJJLI.getChildCount());
        C20094813ju.LIZ(linearLayout, c1397760mTe.LIZ());
        int childCount = this.LLILLJJLI.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LLILLJJLI.getChildAt(i2);
            int i3 = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe2 = new C1397760mTe();
            c1397760mTe2.LIZLLL = new C1614490s7D(i2);
            C20094813ju.LIZ(childAt, c1397760mTe2.LIZ());
        }
    }

    public final void LJIIIIZZ() {
        boolean z;
        Iterator<View> it2 = new C09RD(this.LLILLJJLI).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C1826460xd6) it2.next()).LIZ()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        for (C1826460xd6 c1826460xd6 : new C09RD(this.LLILLJJLI)) {
            if (c1826460xd6.LLJIJIL != z) {
                c1826460xd6.LLJIJIL = z;
                c1826460xd6.LJFF();
            }
        }
    }

    public final void LJIIIZ() {
        LinearLayout.LayoutParams layoutParams;
        Integer num = this.LL;
        for (View view : new C09RD(this.LLILLJJLI)) {
            if (num != null) {
                layoutParams = new LinearLayout.LayoutParams(num.intValue(), -2, 0.0f);
            } else {
                int i = C1779970wQ7.LIZJ[this.LLJIJIL.ordinal()];
                if (i == 1) {
                    layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), -2, 1.0f);
                } else {
                    if (i != 2) {
                        throw new C1954807lC();
                    }
                    layoutParams = new LinearLayout.LayoutParams(-2, -2, 0.0f);
                }
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void LIZ(C1782390wU1 c1782390wU1) {
        C1826460xd6 c1826460xd6 = new C1826460xd6(getContext());
        c1826460xd6.setVariant(this.LLJI);
        c1826460xd6.setSize(this.LLJ);
        c1826460xd6.setSegmentData(c1782390wU1);
        View.OnClickListener aCListenerS129S0200000_27 = new ACListenerS129S0200000_27(c1826460xd6, this, 30);
        if (C1848410yCV.LIZ) {
            aCListenerS129S0200000_27 = new f(aCListenerS129S0200000_27);
        }
        a aVar = new a(aCListenerS129S0200000_27);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1826460xd6);
        }
        c1826460xd6.setOnClickListener(aVar);
        this.LLILLJJLI.addView(c1826460xd6);
        LJIIIZ();
        LJIIIIZZ();
        LJII();
    }

    public final void LIZIZ(int i) {
        if (i < this.LLILLJJLI.getChildCount() && i >= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No segment at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Integer LIZLLL(int i) {
        int childCount = this.LLILLJJLI.getChildCount();
        Integer numValueOf = null;
        if (childCount <= 0) {
            return null;
        }
        int iLJ = C13LZ.LJ(i, 0, childCount - 1);
        try {
            LJ(iLJ);
            numValueOf = Integer.valueOf(iLJ);
            return numValueOf;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                if (this.LLILLJJLI.getChildCount() > 0) {
                    LJ(0);
                    numValueOf = 0;
                    return numValueOf;
                }
            } catch (IndexOutOfBoundsException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            return numValueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r9) {
        /*
            r8 = this;
            r8.LIZIZ(r9)
            android.animation.ValueAnimator r0 = r8.LLIZ
            if (r0 == 0) goto La
            r0.cancel()
        La:
            android.widget.FrameLayout r1 = r8.LLILZIL
            r0 = 8
            X.C786410Ut5.LJZ(r0, r1)
            android.widget.LinearLayout r0 = r8.LLILLJJLI
            android.view.View r7 = r0.getChildAt(r9)
            boolean r0 = r7 instanceof X.C1826460xd6
            if (r0 == 0) goto L6b
            X.0xd6 r7 = (X.C1826460xd6) r7
            if (r7 == 0) goto L6b
            X.0xd6 r2 = r8.LLIZLLLIL
            if (r2 == 0) goto L54
            android.view.ViewParent r1 = r2.getParent()
            android.widget.LinearLayout r0 = r8.LLILLJJLI
            if (r1 != r0) goto L54
            int r6 = r0.indexOfChild(r2)
        L2f:
            android.widget.LinearLayout r0 = r8.LLILLJJLI
            int r5 = r0.getChildCount()
            r4 = 0
            r3 = 0
        L37:
            r2 = 1
            if (r3 >= r5) goto L56
            android.widget.LinearLayout r0 = r8.LLILLJJLI
            android.view.View r1 = r0.getChildAt(r3)
            boolean r0 = r1 instanceof X.C1826460xd6
            if (r0 == 0) goto L51
            X.0xd6 r1 = (X.C1826460xd6) r1
            if (r1 == 0) goto L51
            if (r3 == r9) goto L4b
            r2 = 0
        L4b:
            r1.setSelected(r2)
            r1.setBackgroundSelected(r2)
        L51:
            int r3 = r3 + 1
            goto L37
        L54:
            r6 = -1
            goto L2f
        L56:
            if (r6 < 0) goto L61
            if (r6 == r9) goto L61
            X.0xdN r0 = r8.LLJILJIL
            if (r0 == 0) goto L61
            r0.LIZ(r6, r4)
        L61:
            X.0xdN r0 = r8.LLJILJIL
            if (r0 == 0) goto L68
            r0.LIZ(r9, r2)
        L68:
            r8.LLIZLLLIL = r7
            return
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1826510xdB.LJ(int):void");
    }

    public final void LJFF(String str) {
        String string;
        CharSequence text;
        String string2;
        String string3;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            int childCount = this.LLILLJJLI.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLILLJJLI.getChildAt(i).findViewById(R.id.uk1);
                if (appCompatTextView != null && (text = appCompatTextView.getText()) != null && (string2 = text.toString()) != null && (string3 = a0.LJLIIIL(string2).toString()) != null && string3.length() != 0 && u.LJIJI(string3, string, false)) {
                    if (i >= 0) {
                        LIZLLL(i);
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        LIZLLL(0);
    }

    public final void LJI(String str) {
        String string;
        CharSequence text;
        String string2;
        String string3;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            int childCount = this.LLILLJJLI.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.LLILLJJLI.getChildAt(i).findViewById(R.id.uk2);
                if (appCompatTextView != null && (text = appCompatTextView.getText()) != null && (string2 = text.toString()) != null && (string3 = a0.LJLIIIL(string2).toString()) != null && string3.length() != 0 && u.LJIJI(string3, string, false)) {
                    if (i >= 0) {
                        LIZLLL(i);
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        LIZLLL(0);
    }

    public final void setFixedSegmentWidthDp(Integer num) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        int i2 = 1;
        Integer numValueOf = null;
        if (num != null && num.intValue() > 0) {
            numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num)));
        }
        this.LL = numValueOf;
        if (numValueOf != null) {
            i = -2;
            i2 = 8388611;
        } else {
            i = -1;
        }
        LinearLayout linearLayout = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = i;
            C786410Ut5.W5(linearLayout, layoutParams3);
            FrameLayout frameLayout = this.LLILLL;
            ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
            if (layoutParams4 != null) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
                layoutParams5.width = i;
                C786410Ut5.W5(frameLayout, layoutParams5);
                FrameLayout frameLayout2 = this.LLILZ;
                ViewGroup.LayoutParams layoutParams6 = frameLayout2.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.width = i;
                    C786410Ut5.W5(frameLayout2, layoutParams6);
                    ViewGroup.LayoutParams layoutParams7 = this.LLILZ.getLayoutParams();
                    if ((layoutParams7 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams7) != null) {
                        layoutParams.gravity = i2;
                        C786410Ut5.a6(this.LLILZ, layoutParams);
                    }
                    LJIIIZ();
                    requestLayout();
                    invalidate();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setMaterial(EnumC1779960wQ6 enumC1779960wQ6) {
        int i = C1779970wQ7.LIZIZ[enumC1779960wQ6.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setColor(this.LLJILJILJ);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
        if (materialLayerBackground2 == null) {
            return;
        }
        materialLayerBackground2.setColor(0);
    }

    public final void setOnSelectedChangeListener(InterfaceC1826630xdN interfaceC1826630xdN) {
        this.LLJILJIL = interfaceC1826630xdN;
    }

    public final void setSelected(final C1826460xd6 c1826460xd6) {
        int iIndexOfChild = this.LLILLJJLI.indexOfChild(c1826460xd6);
        C1826460xd6 c1826460xd62 = this.LLIZLLLIL;
        if (c1826460xd62 == null) {
            c1826460xd6.setSelected(true);
            InterfaceC1826630xdN interfaceC1826630xdN = this.LLJILJIL;
            if (interfaceC1826630xdN != null) {
                interfaceC1826630xdN.LIZ(iIndexOfChild, true);
            }
            c1826460xd6.setBackgroundSelected(true);
            this.LLIZLLLIL = c1826460xd6;
            return;
        }
        if (Intrinsics.LJFF(c1826460xd62, c1826460xd6)) {
            return;
        }
        c1826460xd6.setSelected(true);
        InterfaceC1826630xdN interfaceC1826630xdN2 = this.LLJILJIL;
        if (interfaceC1826630xdN2 != null) {
            interfaceC1826630xdN2.LIZ(iIndexOfChild, true);
        }
        ValueAnimator valueAnimator = this.LLIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C1826460xd6 c1826460xd63 = this.LLIZLLLIL;
        if (c1826460xd63 != null) {
            int iIndexOfChild2 = this.LLILLJJLI.indexOfChild(c1826460xd63);
            c1826460xd63.setSelected(false);
            InterfaceC1826630xdN interfaceC1826630xdN3 = this.LLJILJIL;
            if (interfaceC1826630xdN3 != null) {
                interfaceC1826630xdN3.LIZ(iIndexOfChild2, false);
            }
            c1826460xd63.setBackgroundSelected(false);
            FrameLayout frameLayout = this.LLILZIL;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = c1826460xd63.getMeasuredWidth();
            layoutParams.height = c1826460xd63.getMeasuredHeight();
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.Gd(this.LLILZIL, c1826460xd63.getX());
            C786410Ut5.Md(this.LLILZIL, c1826460xd63.getY());
            C786410Ut5.LJZ(0, this.LLILZIL);
            final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIIJ());
            final int measuredWidth = c1826460xd63.getMeasuredWidth();
            final float x = c1826460xd63.getX();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0xdE
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) valueAnimatorOfFloat.getAnimatedValue()).floatValue();
                    FrameLayout frameLayout2 = this.LLILZIL;
                    ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                    layoutParams2.width = measuredWidth + ((int) ((c1826460xd6.getMeasuredWidth() - r1) * fFloatValue));
                    C786410Ut5.a6(frameLayout2, layoutParams2);
                    C786410Ut5.Gd(this.LLILZIL, x + ((int) ((c1826460xd6.getX() - x) * fFloatValue)));
                    if (fFloatValue == 1.0f) {
                        C786410Ut5.LJZ(8, this.LLILZIL);
                        c1826460xd6.setBackgroundSelected(true);
                    }
                }
            });
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.start();
            this.LLIZ = valueAnimatorOfFloat;
        }
        this.LLIZLLLIL = c1826460xd6;
    }

    public final void setSelectedAt(int i) {
        LIZIZ(i);
        setSelected((C1826460xd6) this.LLILLJJLI.getChildAt(i));
    }

    public final void setSize(EnumC1779980wQ8 enumC1779980wQ8) {
        if (this.LLJ == enumC1779980wQ8) {
            return;
        }
        this.LLJ = enumC1779980wQ8;
        int i = C1779970wQ7.LIZ[enumC1779980wQ8.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LLJI == EnumC1826470xd7.RECTANGLE) {
                    GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                    if (backgroundLayerBackground != null) {
                        backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getOuterRadiusXSmall())));
                    }
                    GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                    if (materialLayerBackground != null) {
                        materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getOuterRadiusXSmall())));
                    }
                    GradientDrawable cursorViewBackground = getCursorViewBackground();
                    if (cursorViewBackground != null) {
                        cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getInnerRadiusXSmall())));
                    }
                    GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                    if (cursorCoveringColorLayoutBackground != null) {
                        cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getInnerRadiusXSmall())));
                    }
                }
                C426750GoL.LJIIL(this.LLILLJJLI, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
            } else {
                throw new C1954807lC();
            }
        } else {
            if (this.LLJI == EnumC1826470xd7.RECTANGLE) {
                GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
                if (backgroundLayerBackground2 != null) {
                    backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getOuterRadiusSmall())));
                }
                GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
                if (materialLayerBackground2 != null) {
                    materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getOuterRadiusSmall())));
                }
                GradientDrawable cursorViewBackground2 = getCursorViewBackground();
                if (cursorViewBackground2 != null) {
                    cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getInnerRadiusSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground2 != null) {
                    cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJI.getInnerRadiusSmall())));
                }
            }
            C426750GoL.LJIIL(this.LLILLJJLI, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
        }
        Iterator<View> it2 = new C09RD(this.LLILLJJLI).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (view instanceof C1826460xd6) {
                    ((C1826460xd6) view).setSize(enumC1779980wQ8);
                }
            } else {
                LJIIIZ();
                return;
            }
        }
    }

    public final void setVariant(EnumC1826470xd7 enumC1826470xd7) {
        if (this.LLJI == enumC1826470xd7) {
            return;
        }
        this.LLJI = enumC1826470xd7;
        int i = C1779970wQ7.LIZ[this.LLJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                if (backgroundLayerBackground != null) {
                    backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusXSmall())));
                }
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusXSmall())));
                }
                GradientDrawable cursorViewBackground = getCursorViewBackground();
                if (cursorViewBackground != null) {
                    cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusXSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground != null) {
                    cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusXSmall())));
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
            if (backgroundLayerBackground2 != null) {
                backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusSmall())));
            }
            GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
            if (materialLayerBackground2 != null) {
                materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusSmall())));
            }
            GradientDrawable cursorViewBackground2 = getCursorViewBackground();
            if (cursorViewBackground2 != null) {
                cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
            }
            GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
            if (cursorCoveringColorLayoutBackground2 != null) {
                cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
            }
        }
        for (View view : new C09RD(this.LLILLJJLI)) {
            if (view instanceof C1826460xd6) {
                ((C1826460xd6) view).setVariant(enumC1826470xd7);
            }
        }
    }

    public final void setWidthRule(EnumC1779950wQ5 enumC1779950wQ5) {
        this.LLJIJIL = enumC1779950wQ5;
        LJIIIZ();
    }

    public C1826510xdB(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, R.attr.yo);
        this.LLJ = EnumC1779980wQ8.SMALL;
        EnumC1826470xd7 enumC1826470xd7 = EnumC1826470xd7.CAPSULE;
        this.LLJI = enumC1826470xd7;
        this.LLJIJIL = EnumC1779950wQ5.HUGCONTENT;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c4r, this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSegmentedControl, R.attr.yo, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlBackgroundLayerColor, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlMaterialLayerColor, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ze, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlCursorCoveringColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLJJLI = (LinearLayout) findViewById(R.id.uk5);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bod);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusSmall())));
        gradientDrawable.setColor(color);
        frameLayout.setBackground(gradientDrawable);
        this.LLILLL = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.o3s);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getOuterRadiusSmall())));
        frameLayout2.setBackground(gradientDrawable2);
        this.LLILZ = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.fbn);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
        gradientDrawable3.setColor(iIntValue);
        frameLayout3.setBackground(gradientDrawable3);
        this.LLILZIL = frameLayout3;
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.fbm);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
        gradientDrawable4.setColor(color2);
        frameLayout4.setBackground(gradientDrawable4);
        this.LLILZLL = frameLayout4;
    }
}
