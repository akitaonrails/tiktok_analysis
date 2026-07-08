package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0tNF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662870tNF extends FrameLayout {
    public final boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final boolean LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final boolean LLJJL;
    public final boolean LLJJLIIIJLLLLLLLZ;
    public final boolean LLJL;
    public final boolean LLJLIL;
    public final int LLJLILLLLZIIL;
    public Integer LLJLL;
    public Integer LLJLLIL;
    public View LLJLLL;
    public C1324800kZy LLJZ;
    public FrameLayout LLJZIJLIL;
    public View LLL;
    public TextView LLLF;
    public View LLLFF;
    public View LLLFFI;
    public ColorStateList LLLFZ;
    public final ColorStateList LLLI;
    public boolean LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public Drawable LLLIIIL;

    public int LJ() {
        return R.layout.fuz;
    }

    public View getBorderLayout() {
        GradientDrawable gradientDrawableLIZ;
        Integer numLIZJ;
        if (this.LLJJI && this.LLLFF == null) {
            Context context = getContext();
            int iLIZIZ = (int) C11VU.LIZIZ(this.LLJJIII, context);
            int iLIZIZ2 = (iLIZIZ * 2) + (((int) C11VU.LIZIZ(this.LLJJJJJIL, context)) * 2);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.LLILLL + iLIZIZ2, iLIZIZ2 + this.LLILZ);
            View view = new View(context);
            C786410Ut5.W5(view, layoutParams);
            int color = context.getResources().getColor(this.LLJJIJI);
            Integer num = this.LLJLL;
            if (num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context)) != null) {
                color = numLIZJ.intValue();
            }
            if (this.LL) {
                C1643380sro c1643380sro = new C1643380sro();
                c1643380sro.LIZLLL(1);
                c1643380sro.LIZIZ(0);
                c1643380sro.LJ(color, iLIZIZ);
                gradientDrawableLIZ = c1643380sro.LIZ();
            } else {
                C1643380sro c1643380sro2 = new C1643380sro();
                c1643380sro2.LIZLLL(0);
                c1643380sro2.LIZIZ(0);
                c1643380sro2.LJ(color, iLIZIZ);
                c1643380sro2.LIZJ(this.LLJLILLLLZIIL);
                gradientDrawableLIZ = c1643380sro2.LIZ();
            }
            view.setBackground(gradientDrawableLIZ);
            FrameLayout frameLayout = this.LLJZIJLIL;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.addView(view);
            this.LLLFF = view;
        }
        return this.LLLFF;
    }

    public final C1324800kZy getDynamicView() {
        C1324800kZy c1324800kZy = this.LLJZ;
        if (c1324800kZy == null) {
            c1324800kZy = null;
        }
        c1324800kZy.setClipToOutline(true);
        C1324800kZy c1324800kZy2 = this.LLJZ;
        if (c1324800kZy2 == null) {
            c1324800kZy2 = null;
        }
        c1324800kZy2.setOutlineProvider(new C1698020uHw(this, 0));
        C1324800kZy c1324800kZy3 = this.LLJZ;
        if (c1324800kZy3 != null) {
            return c1324800kZy3;
        }
        return null;
    }

    public final C1324800kZy getImageView() {
        C1324800kZy c1324800kZy = this.LLJZ;
        if (c1324800kZy == null) {
            return null;
        }
        return c1324800kZy;
    }

    public final View getImageViewContainer() {
        View view = this.LLJLLL;
        if (view == null) {
            return null;
        }
        return view;
    }

    public final Drawable getPlaceHolderDrawableCached() {
        if (this.LLLIIIL == null) {
            this.LLLIIIL = getPlaceHolderDrawable();
        }
        return this.LLLIIIL;
    }

    public final Drawable getPlaceHolderDrawable() {
        int color = getResources().getColor(R.color.a0t);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.afb, getContext());
        if (numLIZJ != null) {
            color = numLIZJ.intValue();
        }
        if (this.LLIZ != 0) {
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(getContext(), this.LLIZ);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zi, getContext());
            return C19734012Iw.LIZLLL(drawableLIZIZ, numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        }
        if (this.LL) {
            C1643380sro c1643380sro = new C1643380sro();
            c1643380sro.LIZLLL(1);
            c1643380sro.LIZIZ(color);
            c1643380sro.LJ(color, 0);
            return c1643380sro.LIZ();
        }
        C1643380sro c1643380sro2 = new C1643380sro();
        c1643380sro2.LIZLLL(0);
        c1643380sro2.LIZIZ(color);
        c1643380sro2.LJ(color, 0);
        c1643380sro2.LIZJ(this.LLILLJJLI);
        return c1643380sro2.LIZ();
    }

    public final int getBorderColorRes() {
        return this.LLJJIJI;
    }

    public final Integer getBorderColorResAttr() {
        return this.LLJLL;
    }

    public final int getBorderPadding() {
        return this.LLJJJJJIL;
    }

    public final int getBorderRadius() {
        return this.LLJLILLLLZIIL;
    }

    public final View getBorderView() {
        return this.LLLFF;
    }

    public final int getBorderWidth() {
        return this.LLJJIII;
    }

    public final int getContainerHeight() {
        return this.LLILZLL;
    }

    public final int getContainerWidth() {
        return this.LLILZIL;
    }

    public final View getDotView() {
        return this.LLLFFI;
    }

    public final boolean getEnableBorder() {
        return this.LLJJI;
    }

    public final boolean getEnableCellStyle() {
        return this.LLJLIL;
    }

    public final boolean getEnableExpandBorder() {
        return this.LLJL;
    }

    public final int getImageMarginLeft() {
        return this.LLJI;
    }

    public final int getImageMarginTop() {
        return this.LLJ;
    }

    public final int getImgHeight() {
        return this.LLILZ;
    }

    public final int getImgLayoutHeight() {
        return this.LLLIIIIL;
    }

    public final int getImgLayoutWidth() {
        return this.LLLIIII;
    }

    public final int getImgWidth() {
        return this.LLILLL;
    }

    public final int getRoundRadius() {
        return this.LLILLJJLI;
    }

    public final int getRoundRadiusForIcon() {
        return this.LLJJJ;
    }

    public final boolean getSimpleLayoutMode() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final Integer getTextColorSelectedAttr() {
        return this.LLJLLIL;
    }

    public final TextView getTextView() {
        return this.LLLF;
    }

    public final void LIZIZ(Context context) {
        int i;
        int i2;
        int iLIZIZ = (int) C11VU.LIZIZ(this.LLJJIII, getContext());
        int iLIZIZ2 = (int) C11VU.LIZIZ(this.LLJJJJJIL, getContext());
        boolean z = this.LLJJI;
        if (z) {
            i = (iLIZIZ * 2) + (iLIZIZ2 * 2) + this.LLILLL;
        } else {
            i = this.LLILLL;
        }
        this.LLLIIII = i;
        if (z) {
            i2 = (iLIZIZ * 2) + (iLIZIZ2 * 2) + this.LLILZ;
        } else {
            i2 = this.LLILZ;
        }
        this.LLLIIIIL = i2;
        View viewLIZLLL = LIZLLL(context);
        this.LLJLLL = viewLIZLLL;
        FrameLayout frameLayout = null;
        if (viewLIZLLL == null) {
            viewLIZLLL = null;
        }
        C1324800kZy c1324800kZy = (C1324800kZy) viewLIZLLL.findViewById(R.id.gx9);
        C1331070kk5 c1331070kk5LIZ = new C1331090kk7(getResources()).LIZ();
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        boolean z2 = this.LL;
        c1331100kk8.LIZIZ = z2;
        if (!z2) {
            c1331100kk8.LJII(this.LLJJJ);
        }
        c1331070kk5LIZ.LJJIII(c1331100kk8);
        c1331070kk5LIZ.LJIJ(getPlaceHolderDrawableCached(), 1);
        c1331070kk5LIZ.LJIJ(getPlaceHolderDrawableCached(), 5);
        c1324800kZy.setHierarchy(c1331070kk5LIZ);
        this.LLJZ = c1324800kZy;
        if (this.LLIZLLLIL) {
            View viewLJFF = LJFF(context);
            this.LLL = viewLJFF;
            TextView textView = (TextView) viewLJFF;
            if (this.LLJJ) {
                textView.setSingleLine();
            }
            textView.setTextSize(1, this.LLJJJJLIIL);
            this.LLLF = textView;
            this.LLLFZ = textView.getTextColors();
        }
        LinearLayout linearLayout = new LinearLayout(context);
        LIZ(linearLayout, this.LLJJJJ);
        addView(linearLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LLJZIJLIL = frameLayout2;
        View view = this.LLJLLL;
        if (view == null) {
            view = null;
        }
        LJII(view, frameLayout2, this.LLLIIII, this.LLLIIIIL, this.LLJJJJ);
        FrameLayout frameLayout3 = this.LLJZIJLIL;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        View view2 = this.LLJLLL;
        if (view2 == null) {
            view2 = null;
        }
        frameLayout3.addView(view2);
        FrameLayout frameLayout4 = this.LLJZIJLIL;
        if (frameLayout4 != null) {
            frameLayout = frameLayout4;
        }
        linearLayout.addView(frameLayout);
        View view3 = this.LLL;
        if (view3 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view3.getLayoutParams());
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) C11VU.LIZIZ(this.LLJIJIL, context);
            layoutParams.bottomMargin = (int) C11VU.LIZIZ(this.LLJILJIL, context);
            layoutParams.leftMargin = (int) C11VU.LIZIZ(this.LLJILJILJ, context);
            layoutParams.rightMargin = (int) C11VU.LIZIZ(this.LLJILLL, context);
            C786410Ut5.W5(view3, layoutParams);
            linearLayout.addView(view3);
        }
        if (this.LLJJJIL) {
            View viewLIZJ = LIZJ(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(viewLIZJ.getLayoutParams());
            layoutParams2.gravity = 8388661;
            C786410Ut5.W5(viewLIZJ, layoutParams2);
            linearLayout.addView(viewLIZJ);
            this.LLLFFI = viewLIZJ;
        }
        LJI(false, true);
        LJIIIIZZ(false);
    }

    public View LIZJ(Context context) {
        int iLIZIZ = (int) C11VU.LIZIZ(6.0f, context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
        View view = new View(context);
        C786410Ut5.W5(view, layoutParams);
        int color = getResources().getColor(this.LLJJIJIIJIL);
        C1643380sro c1643380sro = new C1643380sro();
        c1643380sro.LIZLLL(1);
        c1643380sro.LIZIZ(color);
        c1643380sro.LJ(color, (int) C11VU.LIZIZ(this.LLJJIJIL, context));
        view.setBackground(c1643380sro.LIZ());
        return view;
    }

    public View LIZLLL(Context context) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = new FrameLayout(context);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), LJ(), frameLayout, false);
        if (this.LLJJJJ) {
            i = -2;
        } else {
            i = -1;
        }
        C786410Ut5.W5(viewTd, new FrameLayout.LayoutParams(-1, i));
        frameLayout.addView(viewTd);
        if (this.LLJJJJ) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.LLILLL, this.LLILZ);
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        return frameLayout;
    }

    public View LJFF(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C19518211Xw c19518211Xw = new C19518211Xw(context, null);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw);
        c19518211Xw.setLayoutParams(layoutParams);
        c19518211Xw.setGravity(17);
        return c19518211Xw;
    }

    public void LJIIIIZZ(boolean z) {
        int i;
        View view = this.LLLFFI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void setBorderColorResAttr(Integer num) {
        this.LLJLL = num;
    }

    public final void setBorderView(View view) {
        this.LLLFF = view;
    }

    public void setCustomSelected(boolean z) {
        LJI(z, false);
    }

    public final void setDotView(View view) {
        this.LLLFFI = view;
    }

    public final void setImgLayoutHeight(int i) {
        this.LLLIIIIL = i;
    }

    public final void setImgLayoutWidth(int i) {
        this.LLLIIII = i;
    }

    public final void setPlaceHolderDrawableCached(Drawable drawable) {
        this.LLLIIIL = drawable;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        if (charSequence != null && charSequence.length() != 0 && (textView = this.LLLF) != null) {
            if (((int) textView.getPaint().measureText(charSequence, 0, charSequence.length())) > this.LLILLL && this.LLJJ) {
                textView.setGravity(8388611);
            } else {
                textView.setGravity(17);
            }
            textView.setText(charSequence);
        }
    }

    public final void setTextColorSelectedAttr(Integer num) {
        this.LLJLLIL = num;
    }

    public void LIZ(LinearLayout linearLayout, boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
    }

    public final void LJI(boolean z, boolean z2) {
        View borderLayout;
        int i;
        Integer numLIZJ;
        if (this.LLLII == z && !z2) {
            return;
        }
        this.LLLII = z;
        setSelected(z);
        TextView textView = this.LLLF;
        if (textView != null) {
            if (z) {
                this.LLLFZ = textView.getTextColors();
                textView.setTextColor(this.LLLI);
                Integer num = this.LLJLLIL;
                if (num != null && (numLIZJ = C1308910kAL.LIZJ(num.intValue(), textView.getContext())) != null) {
                    textView.setTextColor(numLIZJ.intValue());
                }
                if (this.LLJJ) {
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                }
            } else {
                ColorStateList colorStateList = this.LLLFZ;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
            }
            textView.setEllipsize(null);
            if (this.LLJJL) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if ((this.LLLFF != null || z) && (borderLayout = getBorderLayout()) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, borderLayout);
        }
    }

    public void LJII(View view, FrameLayout frameLayout, int i, int i2, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i, i2);
        }
        layoutParams.gravity = 1;
        C786410Ut5.a6(frameLayout, layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams2.gravity = 17;
        C786410Ut5.W5(view, layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662870tNF(Context context, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z3, boolean z4, int i14, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, int i19, int i20, boolean z8, boolean z9, boolean z10, int i21, int i22, int i23) {
        super(context);
        int i24 = i11;
        int i25 = i7;
        int i26 = i5;
        int i27 = i8;
        boolean z11 = z9;
        int i28 = i21;
        boolean z12 = z10;
        boolean z13 = z8;
        int i29 = i20;
        int i30 = i19;
        boolean z14 = z5;
        int i31 = i18;
        boolean z15 = z6;
        int i32 = i12;
        int i33 = (i22 & 32) != 0 ? 0 : i4;
        i26 = (i22 & 64) != 0 ? 0 : i26;
        i25 = (i22 & 512) != 0 ? 0 : i25;
        i27 = (i22 & 1024) != 0 ? 0 : i27;
        i24 = (i22 & 8192) != 0 ? 0 : i24;
        i32 = (i22 & 16384) != 0 ? 0 : i32;
        i31 = (4194304 & i22) != 0 ? i : i31;
        z14 = (8388608 & i22) != 0 ? true : z14;
        z15 = (16777216 & i22) != 0 ? false : z15;
        z7 = (33554432 & i22) != 0 ? false : z7;
        i30 = (67108864 & i22) != 0 ? 0 : i30;
        i29 = (134217728 & i22) != 0 ? 0 : i29;
        z13 = (268435456 & i22) != 0 ? false : z13;
        z11 = (536870912 & i22) != 0 ? false : z11;
        z12 = (i22 & 1073741824) != 0 ? false : z12;
        i28 = (i23 & 2) != 0 ? 0 : i28;
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i33;
        this.LLILZLL = i26;
        this.LLIZ = i6;
        this.LLIZLLLIL = z2;
        this.LLJ = i25;
        this.LLJI = i27;
        this.LLJIJIL = i9;
        this.LLJILJIL = i10;
        this.LLJILJILJ = i24;
        this.LLJILLL = i32;
        this.LLJJ = z3;
        this.LLJJI = z4;
        this.LLJJIII = i14;
        this.LLJJIJI = i15;
        this.LLJJIJIIJIL = i16;
        this.LLJJIJIL = i17;
        this.LLJJJ = i31;
        this.LLJJJIL = z14;
        this.LLJJJJ = z15;
        this.LLJJJJJIL = i30;
        this.LLJJJJLIIL = i29;
        this.LLJJL = z13;
        this.LLJJLIIIJLLLLLLLZ = z11;
        this.LLJL = z12;
        this.LLJLIL = false;
        this.LLJLILLLLZIIL = i28;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLLI = getResources().getColorStateList(i13);
        this.LLLIIII = getImgWidth();
        this.LLLIIIIL = getImgHeight();
        if (!z7) {
            LIZIZ(context);
        }
    }
}
