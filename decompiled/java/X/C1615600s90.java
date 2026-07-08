package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0s90, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615600s90 extends FrameLayout {
    public final FrameLayout LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final FrameLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public final LinearLayout LLIZ;
    public EnumC1615660s96 LLIZLLLIL;
    public EnumC1615630s93 LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public final int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;

    private final GradientDrawable getBaseColorLayerBackground() {
        Drawable background = this.LL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getContainerBackground() {
        Drawable background = this.LLILLJJLI.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    public final boolean LIZ() {
        CharSequence text = this.LLILZ.getText();
        return !(text == null || text.length() == 0);
    }

    public final void LJFF() {
        LJ(this.LLIZLLLIL, this.LLILZIL);
        LJ(this.LLIZLLLIL, this.LLILZLL);
        int i = C1615680s98.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            if (this.LLJ == EnumC1615630s93.RECTANGLE) {
                GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
                if (baseColorLayerBackground != null) {
                    baseColorLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                }
                GradientDrawable containerBackground = getContainerBackground();
                if (containerBackground != null) {
                    containerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                }
            }
            C786410Ut5.LLLLZLL(this.LLILZ, 8);
            LinearLayout linearLayout = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            C786410Ut5.d6(linearLayout, layoutParams);
            this.LLILLJJLI.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            this.LLILLL.setTuxFont(this.LLJILJILJ);
            this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d))));
            if (this.LLJI) {
                C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, 0, 0, false, 16);
                return;
            }
            C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, false, 16);
            C426750GoL.LJIIIZ(this.LLILZLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, 0, false, 16);
            C426750GoL.LJIIIZ(this.LLIZ, 0, 0, 0, 0, false, 16);
            return;
        }
        if (this.LLJ == EnumC1615630s93.RECTANGLE) {
            GradientDrawable baseColorLayerBackground2 = getBaseColorLayerBackground();
            if (baseColorLayerBackground2 != null) {
                baseColorLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
            }
            GradientDrawable containerBackground2 = getContainerBackground();
            if (containerBackground2 != null) {
                containerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
            }
        }
        if (LIZ()) {
            C786410Ut5.LLLLZLL(this.LLILZ, 0);
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJIJIL ? 47 : 34)));
        C786410Ut5.d6(linearLayout2, layoutParams2);
        this.LLILLJJLI.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        this.LLILLL.setTuxFont(this.LLJILJIL);
        this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(7.5d))));
        if (this.LLJI) {
            C426750GoL.LJIIIZ(this.LLILZIL, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 16);
            return;
        }
        if (LIZ()) {
            C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, false, 16);
            C426750GoL.LJIIIZ(this.LLILZLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, 0, false, 16);
            C426750GoL.LJIIIZ(this.LLIZ, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, false, 16);
        } else {
            C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, false, 16);
            C426750GoL.LJIIIZ(this.LLILZLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, 0, 0, false, 16);
            C426750GoL.LJIIIZ(this.LLIZ, 0, 0, 0, 0, false, 16);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public final void LIZLLL() {
        int i = isSelected() ? this.LLJJI : this.LLJJIJIIJIL;
        int i2 = isFocused() ? this.LLJJIJIL : 0;
        if (!isEnabled()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.4f);
        } else if (isPressed()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.5f);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
        GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
        if (baseColorLayerBackground != null) {
            baseColorLayerBackground.setColor(this.LLJJIII);
        }
        GradientDrawable containerBackground = getContainerBackground();
        if (containerBackground != null) {
            containerBackground.setStroke(i2 != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) : 0, i2);
            containerBackground.setColor(this.LLJJIJI);
        }
        this.LLILLL.setTextColor(i);
        TuxIconView tuxIconViewLIZ = C1615690s99.LIZ(this.LLILZIL);
        if (tuxIconViewLIZ != null) {
            tuxIconViewLIZ.setTintColor(i);
        }
        TuxIconView tuxIconViewLIZ2 = C1615690s99.LIZ(this.LLILZLL);
        if (tuxIconViewLIZ2 != null) {
            tuxIconViewLIZ2.setTintColor(i);
        }
    }

    public C1615600s90(Context context) {
        super(context, null, R.attr.yn);
        this.LLIZLLLIL = EnumC1615660s96.SMALL;
        EnumC1615630s93 enumC1615630s93 = EnumC1615630s93.CAPSULE;
        this.LLJ = enumC1615630s93;
        FrameLayout.inflate(context, R.layout.gx, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSegment, R.attr.yn, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSelectedBaseColor, 0);
        this.LLJILLL = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSelectedBackgroundColor, 0);
        this.LLJJ = color2;
        this.LLJJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSelectedTitleColor, 0);
        this.LLJJIJI = 0;
        this.LLJJIII = 0;
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentNotSelectedTitleColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSubtitleColor, 0);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentStrokeColor, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSegment__tux_segmentTitleFontSmall, 0);
        this.LLJILJIL = i;
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSegment__tux_segmentTitleFontXSmall, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSegment__tux_segmentSubtitleFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ujv);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
        gradientDrawable.setColor(color);
        frameLayout.setBackground(gradientDrawable);
        this.LL = frameLayout;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ujw);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
        gradientDrawable2.setColor(color2);
        linearLayout.setBackground(gradientDrawable2);
        this.LLILLJJLI = linearLayout;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.uk2);
        tuxTextView.setTuxFont(i);
        tuxTextView.setText("");
        this.LLILLL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.uk1);
        tuxTextView2.setTuxFont(i2);
        tuxTextView2.setTextColor(color3);
        this.LLILZ = tuxTextView2;
        this.LLIZ = (LinearLayout) findViewById(R.id.y0w);
        this.LLILZIL = (FrameLayout) findViewById(R.id.uk0);
        this.LLILZLL = (FrameLayout) findViewById(R.id.uk3);
        LIZLLL();
    }

    private final void setLeadingIcon(InterfaceC1182904jz interfaceC1182904jz) {
        LIZIZ(this.LLILZIL, interfaceC1182904jz);
    }

    private final void setSubtitle(String str) {
        this.LLILZ.setText(str);
        TuxTextView tuxTextView = this.LLILZ;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    private final void setTitle(String str) {
        this.LLILLL.setText(str);
        TuxTextView tuxTextView = this.LLILLL;
        int i = 0;
        if (str == null || str.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    private final void setTrailingIcon(InterfaceC1182904jz interfaceC1182904jz) {
        LIZIZ(this.LLILZLL, interfaceC1182904jz);
    }

    public final void setBackgroundSelected(boolean z) {
        if (z) {
            this.LLJJIII = this.LLJILLL;
            this.LLJJIJI = this.LLJJ;
        } else {
            this.LLJJIII = 0;
            this.LLJJIJI = 0;
        }
        GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
        if (baseColorLayerBackground != null) {
            baseColorLayerBackground.setColor(this.LLJJIII);
        }
        GradientDrawable containerBackground = getContainerBackground();
        if (containerBackground != null) {
            containerBackground.setColor(this.LLJJIJI);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        LIZLLL();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        LIZLLL();
    }

    public final void setSegmentData(InterfaceC1614510s7F interfaceC1614510s7F) {
        boolean z = false;
        if (interfaceC1614510s7F instanceof C1615610s91) {
            C1615610s91 c1615610s91 = (C1615610s91) interfaceC1614510s7F;
            String strLIZIZ = c1615610s91.LIZ;
            String str = c1615610s91.LIZIZ;
            InterfaceC1182904jz interfaceC1182904jz = c1615610s91.LIZJ;
            InterfaceC1182904jz interfaceC1182904jz2 = c1615610s91.LIZLLL;
            setTitle(strLIZIZ);
            setSubtitle(str);
            setLeadingIcon(interfaceC1182904jz);
            setTrailingIcon(interfaceC1182904jz2);
            this.LLJI = false;
            if (str != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(", ");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            setContentDescription(strLIZIZ);
            LJFF();
            z = c1615610s91.LJ;
        } else if (interfaceC1614510s7F instanceof C1615670s97) {
            interfaceC1614510s7F.getClass();
            interfaceC1614510s7F.getClass();
            setTitle(null);
            setSubtitle(null);
            setLeadingIcon(null);
            setTrailingIcon(null);
            setContentDescription(null);
            this.LLJI = true;
            LJFF();
            interfaceC1614510s7F.getClass();
        } else {
            throw new C1954807lC();
        }
        setEnabled(z);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        LIZLLL();
    }

    public final void setSize(EnumC1615660s96 enumC1615660s96) {
        this.LLIZLLLIL = enumC1615660s96;
        LJFF();
    }

    public final void setVariant(EnumC1615630s93 enumC1615630s93) {
        this.LLJ = enumC1615630s93;
        int i = C1615680s98.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
                if (baseColorLayerBackground != null) {
                    baseColorLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusXSmall())));
                }
                GradientDrawable containerBackground = getContainerBackground();
                if (containerBackground != null) {
                    containerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusXSmall())));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        GradientDrawable baseColorLayerBackground2 = getBaseColorLayerBackground();
        if (baseColorLayerBackground2 != null) {
            baseColorLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
        }
        GradientDrawable containerBackground2 = getContainerBackground();
        if (containerBackground2 == null) {
            return;
        }
        containerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1615630s93.getInnerRadiusSmall())));
    }

    public final void setWidth(int i) {
        LinearLayout linearLayout = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.d6(linearLayout, layoutParams);
    }

    public static void LIZJ(TuxIconView tuxIconView, FrameLayout frameLayout) {
        C786410Ut5.LJJJJIZL(frameLayout);
        if (tuxIconView != null) {
            frameLayout.addView(tuxIconView);
            C786410Ut5.LJLLLLLL(0, frameLayout);
        } else {
            C786410Ut5.LJLLLLLL(8, frameLayout);
        }
    }

    public static void LJ(EnumC1615660s96 enumC1615660s96, FrameLayout frameLayout) {
        int i = C1615680s98.LIZ[enumC1615660s96.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C786410Ut5.a6(frameLayout, layoutParams);
                TuxIconView tuxIconViewLIZ = C1615690s99.LIZ(frameLayout);
                if (tuxIconViewLIZ != null) {
                    tuxIconViewLIZ.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    tuxIconViewLIZ.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
        C786410Ut5.a6(frameLayout, layoutParams2);
        TuxIconView tuxIconViewLIZ2 = C1615690s99.LIZ(frameLayout);
        if (tuxIconViewLIZ2 == null) {
            return;
        }
        tuxIconViewLIZ2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        tuxIconViewLIZ2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
    }

    public final void LIZIZ(FrameLayout frameLayout, InterfaceC1182904jz interfaceC1182904jz) {
        int iLIZIZ;
        if (interfaceC1182904jz == null) {
            LIZJ(null, frameLayout);
            return;
        }
        if (interfaceC1182904jz instanceof C1182804jy) {
            TuxIconView tuxIconViewLIZ = C1615690s99.LIZ(frameLayout);
            if (tuxIconViewLIZ != null) {
                tuxIconViewLIZ.setIconRes(0);
                return;
            }
            int i = C1615680s98.LIZ[this.LLIZLLLIL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    throw new C1954807lC();
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            }
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ, 17));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = 0;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ);
            LIZJ(tuxIconView, frameLayout);
            LIZLLL();
            return;
        }
        if (interfaceC1182904jz instanceof C1182404ju) {
            LIZJ(null, frameLayout);
            return;
        }
        throw new C1954807lC();
    }
}
