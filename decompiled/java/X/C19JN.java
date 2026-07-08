package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.YogaNative;
import com.bytedance.adsdk.ugeno.yoga.YogaNodeJNIBase;
import com.bytedance.adsdk.ugeno.yoga.a;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.19JN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JN extends ViewGroup implements C19J1, InterfaceC1049770dQN {
    public final Map<View, a> LL;
    public final C19JX LLILLJJLI;
    public C19JK LLILLL;
    public final C1337110ktp LLILZ;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19JR(-1, -1);
    }

    public float getBorderRadius() {
        return this.LLILZ.LLILLJJLI;
    }

    @Override // X.C19J1
    public float getRipple() {
        return this.LLILZ.LLILLL;
    }

    @Override // X.C19J1
    public float getRubIn() {
        return this.LLILZ.LLILZLL;
    }

    @Override // X.C19J1
    public float getShine() {
        return this.LLILZ.LLILZ;
    }

    @Override // X.C19J1
    public float getStretch() {
        return this.LLILZ.LLILZIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19JK c19jk = this.LLILLL;
        if (c19jk != null) {
            c19jk.LJIIJJI();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C19JK c19jk = this.LLILLL;
        if (c19jk != null) {
            c19jk.LJIIL();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LJIIIZ(getChildAt(i), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LJIIIZ(getChildAt(i), true);
        }
        super.removeAllViewsInLayout();
    }

    public a getYogaNode() {
        return this.LLILLJJLI;
    }

    public C19JN(Context context) {
        super(context, null, 0);
        this.LLILZ = new C1337110ktp(this);
        C19JX c19jx = new C19JX();
        this.LLILLJJLI = c19jx;
        this.LL = new HashMap();
        c19jx.LLILZIL = this;
        c19jx.LJJIIJ(new C19JZ());
        LJFF((C19JR) generateDefaultLayoutParams(), c19jx, this);
    }

    public static void LJIIIIZZ(a aVar) {
        if (aVar.LJIIIIZZ() != null) {
            LJIIIIZZ(aVar.LJIIIIZZ());
        } else {
            aVar.LIZ();
        }
    }

    @Override // X.InterfaceC1049770dQN
    public final void LIZ(int i) {
        C19JX c19jx = this.LLILLJJLI;
        if (c19jx != null) {
            if (i == -1) {
                c19jx.LJJIFFI();
            } else if (i == -2) {
                c19jx.LJJI();
            } else {
                c19jx.LJIL(i);
            }
            requestLayout();
        }
    }

    @Override // X.InterfaceC1049770dQN
    public final void LIZLLL(int i) {
        C19JX c19jx = this.LLILLJJLI;
        if (c19jx != null) {
            if (i == -1) {
                c19jx.LJJIJL();
            } else if (i == -2) {
                c19jx.LJJIJIL();
            } else {
                c19jx.LJJIJIIJIL(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19JR;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19JR(layoutParams);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C19JY c19jy;
        C19JK c19jk = this.LLILLL;
        if (c19jk != null && (c19jy = c19jk.LLLLLLZZ) != null) {
            c19jy.LJI();
        }
        super.onDraw(canvas);
        C19JK c19jk2 = this.LLILLL;
        if (c19jk2 != null) {
            c19jk2.LIZIZ(canvas);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        C19JY c19jy;
        super.onWindowFocusChanged(z);
        C19JK c19jk = this.LLILLL;
        if (c19jk != null && (c19jy = c19jk.LLLLLLZZ) != null) {
            c19jy.LIZLLL();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        LJIIIZ(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        LJIIIZ(getChildAt(i), false);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        LJIIIZ(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.LLILZ.LIZ(i);
    }

    public void setBorderRadius(float f) {
        this.LLILZ.LIZIZ(f);
    }

    public void setRipple(float f) {
        View view;
        C1337110ktp c1337110ktp = this.LLILZ;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILLL = f;
            view.postInvalidate();
        }
    }

    public void setRubIn(float f) {
        C1337110ktp c1337110ktp = this.LLILZ;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZLL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    public void setShine(float f) {
        View view;
        C1337110ktp c1337110ktp = this.LLILZ;
        if (c1337110ktp != null && (view = c1337110ktp.LL) != null) {
            c1337110ktp.LLILZ = f;
            view.postInvalidate();
        }
    }

    public void setStretch(float f) {
        C1337110ktp c1337110ktp = this.LLILZ;
        if (c1337110ktp != null) {
            c1337110ktp.LLILZIL = f;
            c1337110ktp.LL.postInvalidate();
        }
    }

    @Override // X.InterfaceC1049770dQN
    public final void LIZIZ(int i, View view) {
        a aVar;
        if (view == null || (aVar = (a) ((HashMap) this.LL).get(view)) == null) {
            return;
        }
        if (i == -1) {
            aVar.LJJIJL();
        } else if (i == -2) {
            aVar.LJJIJIL();
        } else {
            aVar.LJJIJIIJIL(i);
        }
        view.requestLayout();
    }

    @Override // X.InterfaceC1049770dQN
    public final void LIZJ(int i, View view) {
        List<YogaNodeJNIBase> list;
        int iIndexOf;
        C786410Ut5.LJLLLLLL(i, view);
        try {
            a aVar = (a) ((HashMap) this.LL).get(view);
            Object tag = view.getTag(151060224);
            if (i == 0) {
                if (tag != null) {
                    List<YogaNodeJNIBase> list2 = this.LLILLJJLI.LLILLJJLI;
                    if (list2 == null || ((ArrayList) list2).indexOf(aVar) == -1) {
                        int iIntValue = ((Integer) tag).intValue();
                        if (iIntValue < this.LLILLJJLI.LIZJ()) {
                            this.LLILLJJLI.LJJIZ((a) ((HashMap) this.LL).get(view), iIntValue);
                        } else {
                            this.LLILLJJLI.LJJIZ((a) ((HashMap) this.LL).get(view), this.LLILLJJLI.LIZJ());
                        }
                        LJIIIIZZ(this.LLILLJJLI);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 8 && (list = this.LLILLJJLI.LLILLJJLI) != null && (iIndexOf = ((ArrayList) list).indexOf(aVar)) != -1) {
                this.LLILLJJLI.LJJJ(iIndexOf);
                view.setTag(151060224, Integer.valueOf(iIndexOf));
                LJIIIIZZ(this.LLILLJJLI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1049770dQN
    public final void LJ(int i, View view) {
        a aVar;
        if (view == null || (aVar = (a) ((HashMap) this.LL).get(view)) == null) {
            return;
        }
        if (i == -1) {
            aVar.LJJIFFI();
        } else if (i == -2) {
            aVar.LJJI();
        } else {
            aVar.LJIL(i);
        }
        view.requestLayout();
    }

    public final void LJII(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == 1073741824) {
            this.LLILLJJLI.LJIL(size2);
        }
        if (mode == 1073741824) {
            this.LLILLJJLI.LJJIJIIJIL(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.LLILLJJLI.LLILZ, size2);
        }
        if (mode == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.LLILLJJLI.LLILZ, size);
        }
        this.LLILLJJLI.LIZ();
    }

    public final void LJIIIZ(View view, boolean z) {
        a aVar = (a) ((HashMap) this.LL).get(view);
        if (aVar == null) {
            return;
        }
        YogaNodeJNIBase yogaNodeJNIBaseLJIIIIZZ = aVar.LJIIIIZZ();
        int i = 0;
        while (true) {
            if (i >= yogaNodeJNIBaseLJIIIIZZ.LIZJ()) {
                break;
            }
            if (yogaNodeJNIBaseLJIIIIZZ.LIZIZ(i).equals(aVar)) {
                yogaNodeJNIBaseLJIIIIZZ.LJJJ(i);
                break;
            }
            i++;
        }
        aVar.LJIILJJIL(null);
        ((HashMap) this.LL).remove(view);
        if (z) {
            this.LLILLJJLI.LIZ();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C19JY c19jy;
        if (!(getParent() instanceof C19JN)) {
            LJII(i, i2);
        }
        C19JK c19jk = this.LLILLL;
        if (c19jk != null) {
            int[] iArrLJIIIZ = c19jk.LJIIIZ(i, i2);
            setMeasuredDimension(iArrLJIIIZ[0], iArrLJIIIZ[1]);
        } else {
            setMeasuredDimension(Math.round(this.LLILLJJLI.LJFF()), Math.round(this.LLILLJJLI.LJ()));
        }
        C19JK c19jk2 = this.LLILLL;
        if (c19jk2 != null && (c19jy = c19jk2.LLLLLLZZ) != null && !c19jk2.LLLLLZ) {
            c19jk2.LLLLLZ = true;
            c19jy.LIZIZ();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            LJIIIZ(getChildAt(i3), false);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            LJIIIZ(getChildAt(i3), true);
        }
        super.removeViewsInLayout(i, i2);
    }

    public static void LJFF(C19JR c19jr, a aVar, View view) {
        C19JM c19jm;
        C19JM c19jm2;
        C19JM c19jm3;
        C19JM c19jm4;
        C19JM c19jm5;
        C19JM c19jm6;
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            aVar.LJIILL(C0WLU.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                aVar.LJJIIZI(C19JM.LEFT, r3.left);
                aVar.LJJIIZI(C19JM.TOP, r3.top);
                aVar.LJJIIZI(C19JM.RIGHT, r3.right);
                aVar.LJJIIZI(C19JM.BOTTOM, r3.bottom);
            }
        }
        for (int i = 0; i < c19jr.LIZ.size(); i++) {
            int iKeyAt = c19jr.LIZ.keyAt(i);
            float fFloatValue = c19jr.LIZ.valueAt(i).floatValue();
            if (iKeyAt == 4) {
                aVar.LJIIIZ(C14QG.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                aVar.LJIIJ(C14QG.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                aVar.LJIIJJI(C14QG.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                aVar.LJIILIIL(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    aVar.LJIJ();
                } else {
                    aVar.LJIILLIIL(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                aVar.LJIJI(C14QK.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                aVar.LJIJJ(fFloatValue);
            } else if (iKeyAt == 7) {
                aVar.LJIJJLI(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    aVar.LJJIFFI();
                } else if (fFloatValue == -2.0f) {
                    aVar.LJJI();
                } else {
                    aVar.LJIL(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm6 = C19JM.START;
                } else {
                    c19jm6 = C19JM.LEFT;
                }
                aVar.LJJIII(c19jm6, fFloatValue);
            } else if (iKeyAt == 3) {
                aVar.LJJII(C14QH.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                aVar.LJJIII(C19JM.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm5 = C19JM.END;
                } else {
                    c19jm5 = C19JM.RIGHT;
                }
                aVar.LJJIII(c19jm5, fFloatValue);
            } else if (iKeyAt == 19) {
                aVar.LJJIII(C19JM.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                aVar.LJJIIJZLJL(fFloatValue);
            } else if (iKeyAt == 27) {
                aVar.LJJIIZ(fFloatValue);
            } else if (iKeyAt == 22) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm4 = C19JM.START;
                } else {
                    c19jm4 = C19JM.LEFT;
                }
                aVar.LJJIIZI(c19jm4, fFloatValue);
            } else if (iKeyAt == 21) {
                aVar.LJJIIZI(C19JM.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm3 = C19JM.END;
                } else {
                    c19jm3 = C19JM.RIGHT;
                }
                aVar.LJJIIZI(c19jm3, fFloatValue);
            } else if (iKeyAt == 23) {
                aVar.LJJIIZI(C19JM.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm2 = C19JM.START;
                } else {
                    c19jm2 = C19JM.LEFT;
                }
                aVar.LJJIJ(c19jm2, fFloatValue);
            } else if (iKeyAt == 10) {
                aVar.LJJIJ(C19JM.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                if (C1015570cXD.LIZ().LJ) {
                    c19jm = C19JM.END;
                } else {
                    c19jm = C19JM.RIGHT;
                }
                aVar.LJJIJ(c19jm, fFloatValue);
            } else if (iKeyAt == 12) {
                aVar.LJJIJ(C19JM.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                aVar.LJJIJIIJI(C14QD.fromInt(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    aVar.LJJIJL();
                } else if (fFloatValue == -2.0f) {
                    aVar.LJJIJIL();
                } else {
                    aVar.LJJIJIIJIL(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                aVar.LJJIJLIJ(C14Q6.fromInt(Math.round(fFloatValue)));
            }
        }
    }

    public final void LJI(a aVar, float f, float f2) {
        View view = (View) aVar.LIZLLL();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(aVar.LJI() + f);
            int iRound2 = Math.round(aVar.LJII() + f2);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(aVar.LJFF()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(aVar.LJ()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iLIZJ = aVar.LIZJ();
        for (int i = 0; i < iLIZJ; i++) {
            if (equals(view)) {
                LJI(aVar.LIZIZ(i), f, f2);
            } else if (!(view instanceof C19JN)) {
                LJI(aVar.LIZIZ(i), aVar.LJI() + f, aVar.LJII() + f2);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a c19jx;
        this.LLILLJJLI.LJJIIJ(null);
        if (!(view instanceof C19JO)) {
            super.addView(view, i, layoutParams);
            if (((HashMap) this.LL).containsKey(view)) {
                return;
            }
            if (view instanceof C19JN) {
                c19jx = ((C19JN) view).getYogaNode();
            } else {
                if (((HashMap) this.LL).containsKey(view)) {
                    c19jx = (a) ((HashMap) this.LL).get(view);
                } else {
                    c19jx = new C19JX();
                }
                c19jx.LJIILJJIL(view);
                c19jx.LJJIIJ(new C19JZ());
            }
            LJFF((C19JR) view.getLayoutParams(), c19jx, view);
            ((HashMap) this.LL).put(view, c19jx);
            if (view.getVisibility() == 8) {
                view.setTag(151060224, Integer.valueOf(this.LLILLJJLI.LIZJ()));
                return;
            } else {
                C19JX c19jx2 = this.LLILLJJLI;
                c19jx2.LJJIZ(c19jx, c19jx2.LIZJ());
                return;
            }
        }
        view.getClass();
        C19JO.LIZ(this);
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C19JK c19jk = this.LLILLL;
        if (c19jk != null) {
            c19jk.LJIILLIIL(i, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C19JY c19jy;
        C19JY c19jy2;
        C19JK c19jk = this.LLILLL;
        if (c19jk != null && (c19jy2 = c19jk.LLLLLLZZ) != null && !c19jk.LLLLLZL) {
            c19jk.LLLLLZL = true;
            c19jy2.LIZ();
        }
        if (!(getParent() instanceof C19JN)) {
            LJII(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - i2, 1073741824));
        }
        LJI(this.LLILLJJLI, 0.0f, 0.0f);
        C19JK c19jk2 = this.LLILLL;
        if (c19jk2 != null && (c19jy = c19jk2.LLLLLLZZ) != null && !c19jk2.LLLLZ) {
            c19jk2.LLLLZ = true;
            c19jy.LJIIIZ();
        }
    }
}
