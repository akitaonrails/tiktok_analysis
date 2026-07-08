package X;

import Y.ACListenerS160S0100000_26;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749260vca extends FrameLayout {
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public final C1CRB LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final FrameLayout LLILZ;
    public final C0I7D LLILZIL;
    public final View LLILZLL;
    public final FrameLayout LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final LinearLayout LLJ;
    public final TuxIconView LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public C419910GdJ LLJJIJI;
    public View.OnClickListener LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public View LLJJJ;
    public View.OnClickListener LLJJJIL;
    public boolean LLJJJJ;
    public AbstractC1427330nFL LLJJJJJIL;
    public AbstractC1427330nFL LLJJJJLIIL;
    public EnumC1726100v1E LLJJL;

    public C1749260vca(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() throws Throwable {
        Editable editableLLLLJI = C2204961BRm.LLLLJI(this.LLILZIL, new C0WZX("dzBzEgAjS8/YVFkiQFyQc9zW+oBQDSnmM7uMl55Nqdj5U5IMZw==", null));
        if (!(editableLLLLJI == null || editableLLLLJI.length() == 0) && !this.LLJJIJIL) {
            C786410Ut5.LLLLLLZZ(this.LLJI, 0);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
        } else if (this.LLJJIJI != null) {
            C786410Ut5.LLLLLLZZ(this.LLJI, 8);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
        } else {
            C786410Ut5.LLLLLLZZ(this.LLJI, 8);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
        }
    }

    public final void LIZJ() {
        int iLIZIZ;
        int iLIZIZ2;
        if (this.LLJJI >= this.LLJJL.getSearchBarInnerHeight() / 2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        if (this.LLJJJ != null) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        }
        C1CRC c1crc = (C1CRC) this.LLILLJJLI.getLayoutParams();
        Context context = getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iLIZIZ);
        sbLIZ.append("px");
        c1crc.LIZ = C2230281CQw.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), "layout_left");
        C426750GoL.LJIIIZ(this.LLJI, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)) + iLIZIZ2), null, false, 26);
        C426750GoL.LJIIIZ(this.LLILLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(iLIZIZ2), null, false, 26);
    }

    public final View getCtaView() {
        return this.LLJJJ;
    }

    public final float getEditBackgroundRadius() {
        return this.LLJJI;
    }

    public final C0I7D getEditTextView() {
        return this.LLILZIL;
    }

    public final AbstractC1427330nFL getEndAction() {
        return this.LLJJJJLIIL;
    }

    public final boolean getHasInnerStartIcon() {
        return this.LLJJIII;
    }

    public final C419910GdJ getInnerEmptyEndIcon() {
        return this.LLJJIJI;
    }

    public final boolean getNotDisplayX() {
        return this.LLJJIJIL;
    }

    public final View.OnClickListener getOnClickClearListener() {
        return this.LLJJJIL;
    }

    public final View.OnClickListener getOnClickInnerEmptyEndIcon() {
        return this.LLJJIJIIJIL;
    }

    public final int getPrimaryColor$tux_theme_release() {
        return this.LLJIJIL;
    }

    public final EnumC1726100v1E getSearchBarHeight() {
        return this.LLJJL;
    }

    public final int getSecondaryColor$tux_theme_release() {
        return this.LLJILJIL;
    }

    public final boolean getShowSeparator() {
        return this.LLJJJJ;
    }

    public final AbstractC1427330nFL getStartAction() {
        return this.LLJJJJJIL;
    }

    public final void setCtaView(View view) {
        this.LLJJJ = view;
        C786410Ut5.LJJJJIZL(this.LLILZ);
        View view2 = this.LLJJJ;
        if (view2 != null) {
            this.LLILZ.addView(view2);
        }
        LIZJ();
    }

    public final void setEditBackgroundRadius(float f) {
        this.LLJJI = f;
        C1CRB c1crb = this.LL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(f);
        c384050F3z.LIZ = Integer.valueOf(this.LLJJ);
        c1crb.setBackground(c384050F3z.LIZ(getContext()));
        LIZJ();
    }

    public final void setEndAction(AbstractC1427330nFL abstractC1427330nFL) {
        this.LLJJJJLIIL = abstractC1427330nFL;
        LIZ(abstractC1427330nFL, this.LLIZLLLIL);
    }

    public final void setHasInnerStartIcon(boolean z) {
        this.LLJJIII = z;
        if (z) {
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 0);
        } else {
            C786410Ut5.LLLLLLZZ(this.LLILLJJLI, 8);
        }
    }

    public final void setInnerEmptyEndIcon(C419910GdJ c419910GdJ) {
        this.LLJJIJI = c419910GdJ;
        if (c419910GdJ != null) {
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        }
        this.LLILLL.setTuxIcon(c419910GdJ);
        LIZIZ();
    }

    public final void setInnerStartIconColorAttr(int i) {
        this.LLILLJJLI.setTintColorRes(i);
    }

    public final void setNotDisplayX(boolean z) throws Throwable {
        this.LLJJIJIL = z;
        LIZIZ();
    }

    public final void setOnClickClearListener(View.OnClickListener onClickListener) {
        this.LLJJJIL = onClickListener;
    }

    public final void setOnClickInnerEmptyEndIcon(View.OnClickListener onClickListener) {
        this.LLJJIJIIJIL = onClickListener;
        C786410Ut5.a9(this.LLILLL, onClickListener);
        if (onClickListener != null) {
            C427690Gpr.LJI(this.LLILLL, null);
        } else {
            this.LLILLL.setOnTouchListener(null);
        }
    }

    public final void setPrimaryColor$tux_theme_release(int i) {
        this.LLJIJIL = i;
    }

    public final void setSearchBarHeight(EnumC1726100v1E enumC1726100v1E) {
        this.LLJJL = enumC1726100v1E;
        C786410Ut5.d6(this.LLJ, new FrameLayout.LayoutParams(-1, enumC1726100v1E.getSearchBarHeight()));
        C1CRB c1crb = this.LL;
        ViewGroup.LayoutParams layoutParams = c1crb.getLayoutParams();
        layoutParams.height = enumC1726100v1E.getSearchBarInnerHeight();
        C786410Ut5.Z6(c1crb, layoutParams);
        LIZJ();
    }

    public final void setSecondaryColor$tux_theme_release(int i) {
        this.LLJILJIL = i;
    }

    public final void setShowSeparator(boolean z) {
        this.LLJJJJ = z;
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LLILZLL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLILZLL);
        }
    }

    public final void setStartAction(AbstractC1427330nFL abstractC1427330nFL) {
        this.LLJJJJJIL = abstractC1427330nFL;
        LIZ(abstractC1427330nFL, this.LLIZ);
    }

    public final void LIZ(AbstractC1427330nFL abstractC1427330nFL, FrameLayout frameLayout) {
        int iLIZIZ;
        int iLIZIZ2;
        Integer numValueOf;
        C786410Ut5.LJJJJIZL(frameLayout);
        int i = 0;
        if (this.LLJJJJJIL != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        if (this.LLJJJJLIIL != null) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        AttributeSet attributeSet = null;
        C426750GoL.LJIIL(this.LLJ, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ2), null, 26);
        if (abstractC1427330nFL != null) {
            if (abstractC1427330nFL instanceof C1427310nFJ) {
                C1427310nFJ c1427310nFJ = (C1427310nFJ) abstractC1427330nFL;
                TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
                C426750GoL.LJIIL(tuxIconView, Integer.valueOf(c1427310nFJ.LIZLLL), null, Integer.valueOf(c1427310nFJ.LJ), null, 26);
                C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(-2, -1));
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(c1427310nFJ.LIZIZ), null, Integer.valueOf(c1427310nFJ.LIZJ), null, false, 26);
                C419910GdJ c419910GdJ = new C419910GdJ();
                int i2 = LLJJLIIIJLLLLLLLZ;
                c419910GdJ.LIZIZ = i2;
                c419910GdJ.LIZJ = i2;
                c419910GdJ.LIZ = c1427310nFJ.LJI;
                if (c1427310nFJ.LIZ == EnumC1070180dxI.PRIMARY) {
                    numValueOf = Integer.valueOf(this.LLJIJIL);
                } else {
                    numValueOf = Integer.valueOf(this.LLJILJIL);
                }
                c419910GdJ.LIZLLL = numValueOf;
                tuxIconView.setTuxIcon(c419910GdJ);
                C786410Ut5.a9(tuxIconView, c1427310nFJ.LJFF);
                C427690Gpr.LJI(tuxIconView, null);
                c1427310nFJ.LJII = tuxIconView;
                c1427310nFJ.LJIIIIZZ = this;
                frameLayout.addView(tuxIconView);
                return;
            }
            if (!(abstractC1427330nFL instanceof C1427300nFI)) {
                return;
            }
            C1427300nFI c1427300nFI = (C1427300nFI) abstractC1427330nFL;
            TuxTextView tuxTextView = new TuxTextView(getContext(), attributeSet, 6, i);
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(c1427300nFI.LIZLLL), null, Integer.valueOf(c1427300nFI.LJ), null, 26);
            C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -1));
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(c1427300nFI.LIZIZ), null, Integer.valueOf(c1427300nFI.LIZJ), null, false, 26);
            tuxTextView.setGravity(16);
            if (c1427300nFI.LIZ == EnumC1070180dxI.PRIMARY) {
                tuxTextView.setTextColor(this.LLJIJIL);
                tuxTextView.setTuxFont(this.LLJILJILJ);
            } else {
                tuxTextView.setTextColor(this.LLJILJIL);
                tuxTextView.setTuxFont(this.LLJILLL);
            }
            tuxTextView.setText(c1427300nFI.LJI);
            C786410Ut5.h9(tuxTextView, c1427300nFI.LJFF);
            C427690Gpr.LJI(tuxTextView, null);
            c1427300nFI.LJII = tuxTextView;
            c1427300nFI.LJIIIIZZ = this;
            frameLayout.addView(tuxTextView);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1749260vca(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int color;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.ym;
        } else {
            i2 = 0;
        }
        super(context, attributeSet2, i2);
        this.LLJJIII = true;
        this.LLJJJJ = true;
        this.LLJJL = EnumC1726100v1E.HIGH;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gw, this, true);
        this.LL = (C1CRB) findViewById(R.id.u9_);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.kp6);
        this.LLILLJJLI = tuxIconView;
        this.LLILLL = (TuxIconView) findViewById(R.id.ko5);
        this.LLILZ = (FrameLayout) findViewById(R.id.fa6);
        C0I7D c0i7d = (C0I7D) findViewById(R.id.u9v);
        this.LLILZIL = c0i7d;
        View viewFindViewById = findViewById(R.id.uea);
        this.LLILZLL = viewFindViewById;
        this.LLIZ = (FrameLayout) findViewById(R.id.vy2);
        this.LLIZLLLIL = (FrameLayout) findViewById(R.id.h4_);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.u7a);
        this.LLJ = linearLayout;
        TuxIconView tuxIconView2 = (TuxIconView) findViewById(R.id.ko7);
        this.LLJI = tuxIconView2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.TuxSearchBar, i2, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar_tux_layoutBackgroundColor, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_editBackgroundColor, 0);
        setEditBackgroundRadius(typedArrayObtainStyledAttributes.getDimension(R$styleable.TuxSearchBar_tux_editBackgroundRadius, 0.0f));
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchInnerStartIconColor, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSearchBar__tux_searchInnerStartIcon, 0);
        setHasInnerStartIcon(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxSearchBar_tux_hasInnerStartIcon, true));
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSearchBar__tux_searchInnerEndIcon, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchInnerEndIconColor, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxSearchBar_tux_emptyEndIcon, 0);
        if (resourceId3 != 0) {
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar_tux_emptyEndIconColor, 0);
        } else {
            color = 0;
        }
        this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchPrimaryColor, 0);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchSecondaryColor, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSearchBar__tux_searchPrimaryActionFont, 0);
        this.LLJILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSearchBar__tux_searchSecondaryActionFont, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxSearchBar_tux_editHintText);
        int color5 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchEditHintTextColor, 0);
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxSearchBar_tux_editText);
        int color6 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchEditTextColor, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSearchBar__tux_searchEditTextFont, 0);
        int color7 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSearchBar__tux_searchSeparatorColor, 0);
        setShowSeparator(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxSearchBar_tux_showSeparator, true));
        typedArrayObtainStyledAttributes.recycle();
        linearLayout.setBackgroundColor(color2);
        viewFindViewById.setBackgroundColor(color7);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = Integer.valueOf(color3);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = resourceId2;
        c419910GdJ2.LIZLLL = Integer.valueOf(color4);
        tuxIconView.setTuxIcon(c419910GdJ);
        tuxIconView2.setTuxIcon(c419910GdJ2);
        C786410Ut5.a9(tuxIconView2, new ACListenerS160S0100000_26(this, 63));
        C427690Gpr.LJI(tuxIconView2, null);
        if (resourceId3 != 0) {
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = resourceId3;
            c419910GdJ3.LIZLLL = Integer.valueOf(color);
            setInnerEmptyEndIcon(c419910GdJ3);
        }
        c0i7d.addTextChangedListener(new C1775980wJg(this, 9));
        c0i7d.setHint(strXd);
        c0i7d.setHintTextColor(color5);
        c0i7d.setText(strXd2);
        c0i7d.setTextColor(color6);
        c0i7d.setTuxFont(i3);
        setSearchBarHeight(this.LLJJL);
        HandlerHook.viewPost(this.LL, new ARunnableS126S0100000_26(this, 15));
    }
}
