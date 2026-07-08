package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195640hDe extends FrameLayout {
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxTextView LLILZ;
    public final GradientDrawable LLILZIL;
    public final C1195600hDa LLILZLL;
    public EnumC1195650hDf LLIZ;
    public EnumC1175460gh6 LLIZLLLIL;
    public EnumC1195670hDh LLJ;
    public CharSequence LLJI;
    public AbstractC789120UxS LLJIJIL;
    public AbstractC789090UxP LLJILJIL;
    public boolean LLJILJILJ;

    public final void LIZ() {
        C788800Uww c788800Uww;
        int iLIZIZ;
        TextView textView;
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        Integer numLIZJ;
        Integer numLIZJ2;
        int i = C1195660hDg.LIZ[this.LLJ.ordinal()];
        Integer numValueOf = Integer.valueOf(R.attr.a00);
        if (i == 1) {
            c788800Uww = isSelected() ? new C788800Uww(R.attr.a1h, null, numValueOf) : new C788800Uww(R.attr.a1h, null, Integer.valueOf(R.attr.a01));
        } else if (i == 2) {
            c788800Uww = isSelected() ? new C788800Uww(R.attr.a0o, numValueOf, null) : new C788800Uww(R.attr.a1h, Integer.valueOf(R.attr.zq), null);
        } else if (i == 3) {
            c788800Uww = isSelected() ? new C788800Uww(R.attr.a1h, Integer.valueOf(R.attr.a03), null) : new C788800Uww(R.attr.a1j, null, null);
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            c788800Uww = isSelected() ? new C788800Uww(R.attr.a0o, numValueOf, null) : new C788800Uww(R.attr.a1j, Integer.valueOf(R.attr.a03), null);
        }
        Integer num = c788800Uww.LIZ;
        int iIntValue = (num == null || (numLIZJ2 = C1308910kAL.LIZJ(num.intValue(), getContext())) == null) ? 0 : numLIZJ2.intValue();
        Integer numLIZJ3 = C1308910kAL.LIZJ(c788800Uww.LIZIZ, getContext());
        int iIntValue2 = numLIZJ3 != null ? numLIZJ3.intValue() : -16777216;
        Integer num2 = c788800Uww.LIZJ;
        int iIntValue3 = (num2 == null || (numLIZJ = C1308910kAL.LIZJ(num2.intValue(), getContext())) == null) ? 0 : numLIZJ.intValue();
        if (c788800Uww.LIZJ != null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(isSelected() ? 1.3f : 0.5f)));
        } else {
            iLIZIZ = 0;
        }
        this.LLILZIL.setColor(iIntValue);
        this.LLILZIL.setStroke(iLIZIZ, iIntValue3);
        this.LLILZ.setTextColor(iIntValue2);
        View childAt = this.LLILLJJLI.getChildAt(0);
        if ((childAt instanceof TuxIconView) && (tuxIconView2 = (TuxIconView) childAt) != null) {
            tuxIconView2.setTintColor(iIntValue2);
        }
        View childAt2 = this.LLILLL.getChildAt(0);
        if ((childAt2 instanceof TuxIconView) && (tuxIconView = (TuxIconView) childAt2) != null) {
            tuxIconView.setTintColor(iIntValue2);
        }
        View childAt3 = this.LLILLL.getChildAt(0);
        if (!(childAt3 instanceof TuxTextView) || (textView = (TextView) childAt3) == null) {
            return;
        }
        textView.setTextColor(iIntValue2);
    }

    public final void LIZIZ() {
        CharSequence charSequence = this.LLJI;
        if (charSequence == null || charSequence.length() == 0) {
            C786410Ut5.LLLLZLL(this.LLILZ, 8);
        } else {
            C786410Ut5.LLLLZLL(this.LLILZ, 0);
            this.LLILZ.setText(charSequence);
        }
    }

    public final void LIZJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = this.LLILZ.getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJIJIL != null ? 2 : 4))));
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.R6(this.LLILZ, marginLayoutParams);
    }

    public final void LIZLLL() {
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZ.getChipHeightDp()))));
        }
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZ.getChipHeightDp())));
        C786410Ut5.d6(this.LL, layoutParams);
        this.LLILZ.setTuxFont(this.LLIZ.getLabelFont());
        LJ();
        LJFF();
    }

    public final void LJ() {
        C786410Ut5.LJJJJIZL(this.LLILLJJLI);
        AbstractC789120UxS abstractC789120UxS = this.LLJIJIL;
        if (abstractC789120UxS == null) {
            C786410Ut5.LJZ(8, this.LLILLJJLI);
            return;
        }
        C786410Ut5.LJZ(0, this.LLILLJJLI);
        if (!(abstractC789120UxS instanceof C789110UxR)) {
            if (abstractC789120UxS instanceof C223000tY) {
                C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZ.getAvatarSizeDp())));
                throw null;
            }
            if (!(abstractC789120UxS instanceof C223100tZ)) {
                throw new C1954807lC();
            }
            this.LLIZ.getAvatarSizeDp();
            throw null;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZ.getIconSizeDp())));
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = ((C789110UxR) abstractC789120UxS).LIZ;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILLJJLI.addView(tuxIconView);
    }

    public final void LJFF() {
        C786410Ut5.LJJJJIZL(this.LLILLL);
        AbstractC789090UxP abstractC789090UxP = this.LLJILJIL;
        if (abstractC789090UxP == null) {
            C786410Ut5.LJZ(8, this.LLILLL);
            return;
        }
        C786410Ut5.LJZ(0, this.LLILLL);
        if (!(abstractC789090UxP instanceof C789100UxQ)) {
            if (!(abstractC789090UxP instanceof C789080UxO)) {
                throw new C1954807lC();
            }
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            C786410Ut5.R6(tuxTextView, new FrameLayout.LayoutParams(-2, -2));
            tuxTextView.setTuxFont(this.LLIZ.getTrailingNumberFont());
            tuxTextView.setIncludeFontPadding(false);
            tuxTextView.setText(((C789080UxO) abstractC789090UxP).LIZ);
            this.LLILLL.addView(tuxTextView);
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZ.getIconSizeDp())));
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = ((C789100UxQ) abstractC789090UxP).LIZ;
        c419910GdJ.LIZIZ = iLIZIZ;
        c419910GdJ.LIZJ = iLIZIZ;
        tuxIconView.setTuxIcon(c419910GdJ);
        this.LLILLL.addView(tuxIconView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJILJILJ) {
            return;
        }
        this.LLILZLL.LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195640hDe(Context context) {
        EnumC1195650hDf enumC1195650hDf;
        EnumC1175460gh6 enumC1175460gh6;
        EnumC1195670hDh enumC1195670hDh;
        super(context, null, 0);
        AbstractC789090UxP c789080UxO = null;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LLILZIL = gradientDrawable;
        this.LLILZLL = new C1195600hDa(this, EnumC1195620hDc.CHIP, null);
        this.LLIZ = new C1194900hCS(0).LIZ;
        this.LLIZLLLIL = new C1194900hCS(0).LIZIZ;
        this.LLJ = new C1194900hCS(0).LIZJ;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.djt, this, true);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.nsh);
        this.LL = linearLayout;
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.nsg);
        this.LLILLL = (FrameLayout) findViewById(R.id.nsi);
        this.LLILZ = (TuxTextView) findViewById(R.id.nsf);
        linearLayout.setBackground(gradientDrawable);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.LsChip, 0, 0);
        if (typedArrayObtainStyledAttributes.getInt(R$styleable.LsChip_lsChipSize, 0) == 1) {
            enumC1195650hDf = EnumC1195650hDf.LARGE;
        } else {
            enumC1195650hDf = EnumC1195650hDf.MEDIUM;
        }
        this.LLIZ = enumC1195650hDf;
        if (typedArrayObtainStyledAttributes.getInt(R$styleable.LsChip_lsChipVariant, 0) == 1) {
            enumC1175460gh6 = EnumC1175460gh6.RECTANGLE;
        } else {
            enumC1175460gh6 = EnumC1175460gh6.CAPSULE;
        }
        this.LLIZLLLIL = enumC1175460gh6;
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.LsChip_lsChipAppearance, 0);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    enumC1195670hDh = EnumC1195670hDh.STROKED;
                } else {
                    enumC1195670hDh = EnumC1195670hDh.TUX_FILL;
                }
            } else {
                enumC1195670hDh = EnumC1195670hDh.QUIET;
            }
        } else {
            enumC1195670hDh = EnumC1195670hDh.FILL;
        }
        this.LLJ = enumC1195670hDh;
        this.LLJI = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LsChip_lsChipLabel);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LsChip_lsChipLeadingIcon, 0);
        if (resourceId != 0) {
            this.LLJIJIL = new C789110UxR(resourceId);
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LsChip_lsChipTrailingIcon, 0);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LsChip_lsChipTrailingNumber);
        if (resourceId2 != 0) {
            c789080UxO = new C789100UxQ(resourceId2);
        } else if (strXd != null && strXd.length() != 0) {
            c789080UxO = new C789080UxO(strXd);
        }
        this.LLJILJIL = c789080UxO;
        typedArrayObtainStyledAttributes.recycle();
        LIZIZ();
        LIZLLL();
        LIZJ();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZLLLIL.getCornerRadiusDp())));
        LIZ();
    }

    public final void setAppearance(EnumC1195670hDh enumC1195670hDh) {
        this.LLJ = enumC1195670hDh;
        LIZ();
    }

    public final void setLabel(CharSequence charSequence) {
        this.LLJI = charSequence;
        LIZIZ();
        LIZ();
    }

    public final void setLeading(AbstractC789120UxS abstractC789120UxS) {
        this.LLJIJIL = abstractC789120UxS;
        LJ();
        LIZJ();
        LIZ();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        LIZ();
    }

    public final void setSize(EnumC1195650hDf enumC1195650hDf) {
        this.LLIZ = enumC1195650hDf;
        LIZLLL();
        LIZ();
    }

    public final void setStyle(C1194900hCS c1194900hCS) {
        this.LLIZ = c1194900hCS.LIZ;
        this.LLIZLLLIL = c1194900hCS.LIZIZ;
        this.LLJ = c1194900hCS.LIZJ;
        LIZIZ();
        LIZLLL();
        LIZJ();
        this.LLILZIL.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLIZLLLIL.getCornerRadiusDp())));
        LIZ();
    }

    public final void setSuppressShowReport(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setTrackParams(C1174900ggC c1174900ggC) {
        C1195600hDa c1195600hDa = this.LLILZLL;
        c1195600hDa.LIZLLL = c1174900ggC;
        c1195600hDa.LIZ();
    }

    public final void setTrailing(AbstractC789090UxP abstractC789090UxP) {
        this.LLJILJIL = abstractC789090UxP;
        LJFF();
        LIZJ();
        LIZ();
    }

    public final void setVariant(EnumC1175460gh6 enumC1175460gh6) {
        this.LLIZLLLIL = enumC1175460gh6;
        this.LLILZIL.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1175460gh6.getCornerRadiusDp())));
    }
}
