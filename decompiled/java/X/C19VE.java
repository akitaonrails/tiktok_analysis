package X;

import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19VE, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VE extends C19VF {
    public CharSequence LLJ;
    public CharSequence LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public LinearLayout LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final int LLJJIJIL;

    public final void LJII() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLJILJILJ = null;
        this.LLILLL = null;
        this.LLILZ = null;
        View view = this.LLJILJIL;
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LJI() {
        if (this.LLJILLL == null) {
            C786410Ut5.Sd(R.layout.he, C786410Ut5.ne(getContext()), this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.LLJILLL = linearLayout;
            this.LLJJ = (TextView) linearLayout.findViewById(R.id.a1z);
            this.LLJJI = (TextView) this.LLJILLL.findViewById(R.id.a1s);
            if (this.LLJJIII != 0) {
                this.LLJJ.setTextAppearance(getContext(), this.LLJJIII);
            }
            if (this.LLJJIJI != 0) {
                this.LLJJI.setTextAppearance(getContext(), this.LLJJIJI);
            }
        }
        this.LLJJ.setText(this.LLJ);
        this.LLJJI.setText(this.LLJI);
        boolean z = !TextUtils.isEmpty(this.LLJ);
        boolean z2 = !TextUtils.isEmpty(this.LLJI);
        int i = 0;
        C786410Ut5.LLIL(this.LLJJI, z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.LLJILLL;
        if (!z && !z2) {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayout2);
        if (this.LLJILLL.getParent() == null) {
            addView(this.LLJILLL);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // X.C19VF
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // X.C19VF
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.LLILZ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C19VI c19vi = this.LLILZ.LLJJJ;
            if (c19vi == null || !c19vi.LIZIZ()) {
                return;
            }
            c19vi.LJIIIZ.dismiss();
        }
    }

    public CharSequence getSubtitle() {
        return this.LLJI;
    }

    public CharSequence getTitle() {
        return this.LLJ;
    }

    public final void LJFF(AbstractC21549319Vb abstractC21549319Vb) {
        View view = this.LLJIJIL;
        if (view == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), this.LLJJIJIL, this, false);
            this.LLJIJIL = viewTd;
            addView(viewTd);
        } else if (view.getParent() == null) {
            addView(this.LLJIJIL);
        }
        View viewFindViewById = this.LLJIJIL.findViewById(R.id.a44);
        this.LLJILJIL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS167S0100000_33(abstractC21549319Vb, 1), viewFindViewById);
        C19V6 c19v6LJ = abstractC21549319Vb.LJ();
        ActionMenuPresenter actionMenuPresenter = this.LLILZ;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C19VI c19vi = actionMenuPresenter.LLJJJ;
            if (c19vi != null && c19vi.LIZIZ()) {
                c19vi.LJIIIZ.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.LLILZ = actionMenuPresenter2;
        actionMenuPresenter2.LLJILJILJ = true;
        actionMenuPresenter2.LLJILLL = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c19v6LJ.LIZIZ(this.LLILZ, this.LLILLJJLI);
        ActionMenuPresenter actionMenuPresenter3 = this.LLILZ;
        InterfaceC21549819Vg interfaceC21549819Vg = actionMenuPresenter3.LLIZLLLIL;
        if (interfaceC21549819Vg == null) {
            InterfaceC21549819Vg interfaceC21549819Vg2 = (InterfaceC21549819Vg) C786410Ut5.Td(actionMenuPresenter3.LLILZ, actionMenuPresenter3.LLILZLL, this, false);
            actionMenuPresenter3.LLIZLLLIL = interfaceC21549819Vg2;
            interfaceC21549819Vg2.LIZIZ(actionMenuPresenter3.LLILLL);
            actionMenuPresenter3.LJII(true);
        }
        InterfaceC21549819Vg interfaceC21549819Vg3 = actionMenuPresenter3.LLIZLLLIL;
        if (interfaceC21549819Vg != interfaceC21549819Vg3) {
            ((C19VD) interfaceC21549819Vg3).setPresenter(actionMenuPresenter3);
        }
        C19VD c19vd = (C19VD) interfaceC21549819Vg3;
        this.LLILLL = c19vd;
        c19vd.setBackground(null);
        addView(this.LLILLL, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // X.C19VF
    public void setContentHeight(int i) {
        this.LLILZIL = i;
    }

    public void setCustomView(View view) {
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        this.LLJILJILJ = view;
        if (view != null) {
            LinearLayout linearLayout = this.LLJILLL;
            if (linearLayout != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, linearLayout);
                removeView(linearLayout);
                this.LLJILLL = null;
            }
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.LLJI = charSequence;
        LJI();
    }

    public void setTitle(CharSequence charSequence) {
        this.LLJ = charSequence;
        LJI();
        q0.LJIJJ(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.LLJJIJIIJIL) {
            requestLayout();
        }
        this.LLJJIJIIJIL = z;
    }

    @Override // X.C19VF, android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public C19VE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.b8p);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context, attributeSet, R$styleable.ActionMode, R.attr.b8p, 0);
        setBackground(c21411918qrLJIILIIL.LJ(R$styleable.ActionMode_background));
        this.LLJJIII = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionMode_titleTextStyle, 0);
        this.LLJJIJI = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionMode_subtitleTextStyle, 0);
        this.LLILZIL = c21411918qrLJIILIIL.LIZIZ.getLayoutDimension(R$styleable.ActionMode_height, 0);
        this.LLJJIJIL = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionMode_closeItemLayout, R.layout.hj);
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 1073741824;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 0) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = this.LLILZIL;
                if (size2 <= 0) {
                    size2 = View.MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int iMin = size2 - paddingTop;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                View view = this.LLJIJIL;
                if (view != null) {
                    int iLIZJ = C19VF.LIZJ(view, paddingLeft, iMakeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJIJIL.getLayoutParams();
                    paddingLeft = iLIZJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                C19VD c19vd = this.LLILLL;
                if (c19vd != null && c19vd.getParent() == this) {
                    paddingLeft = C19VF.LIZJ(this.LLILLL, paddingLeft, iMakeMeasureSpec);
                }
                LinearLayout linearLayout = this.LLJILLL;
                if (linearLayout != null && this.LLJILJILJ == null) {
                    if (this.LLJJIJIIJIL) {
                        this.LLJILLL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                        int measuredWidth = this.LLJILLL.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z = true;
                            paddingLeft -= measuredWidth;
                        } else {
                            z = false;
                        }
                        LinearLayout linearLayout2 = this.LLJILLL;
                        if (z) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        C786410Ut5.LJZL(i4, linearLayout2);
                    } else {
                        paddingLeft = C19VF.LIZJ(linearLayout, paddingLeft, iMakeMeasureSpec);
                    }
                }
                View view2 = this.LLJILJILJ;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i6 = layoutParams.width;
                    if (i6 != -2) {
                        i3 = 1073741824;
                        if (i6 >= 0) {
                            paddingLeft = Math.min(i6, paddingLeft);
                        }
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    int i7 = layoutParams.height;
                    if (i7 != -2) {
                        if (i7 >= 0) {
                            iMin = Math.min(i7, iMin);
                        }
                    } else {
                        i5 = Integer.MIN_VALUE;
                    }
                    this.LLJILJILJ.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(iMin, i5));
                }
                if (this.LLILZIL <= 0) {
                    int childCount = getChildCount();
                    int i8 = 0;
                    for (int i9 = 0; i9 < childCount; i9++) {
                        int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i8) {
                            i8 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i8);
                    return;
                }
                setMeasuredDimension(size, size2);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getClass().getSimpleName());
            sbLIZ.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(getClass().getSimpleName());
        sbLIZ2.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getLayoutDirection() == 1) {
            z2 = true;
            paddingLeft = (i3 - i) - getPaddingRight();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.LLJIJIL;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLJIJIL.getLayoutParams();
            if (z2) {
                int i7 = marginLayoutParams.rightMargin;
                i5 = marginLayoutParams.leftMargin;
                i6 = paddingLeft - i7;
            } else {
                int i8 = marginLayoutParams.leftMargin;
                i5 = marginLayoutParams.rightMargin;
                i6 = paddingLeft + i8;
            }
            int iLIZLLL = i6 + C19VF.LIZLLL(this.LLJIJIL, i6, paddingTop, paddingTop2, z2);
            if (z2) {
                paddingLeft = iLIZLLL - i5;
            } else {
                paddingLeft = iLIZLLL + i5;
            }
        }
        LinearLayout linearLayout = this.LLJILLL;
        if (linearLayout != null && this.LLJILJILJ == null && linearLayout.getVisibility() != 8) {
            paddingLeft += C19VF.LIZLLL(this.LLJILLL, paddingLeft, paddingTop, paddingTop2, z2);
        }
        View view2 = this.LLJILJILJ;
        if (view2 != null) {
            C19VF.LIZLLL(view2, paddingLeft, paddingTop, paddingTop2, z2);
        }
        if (z2) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i3 - i) - getPaddingRight();
        }
        C19VD c19vd = this.LLILLL;
        if (c19vd != null) {
            C19VF.LIZLLL(c19vd, paddingRight, paddingTop, paddingTop2, !z2);
        }
    }
}
