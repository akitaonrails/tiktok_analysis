package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826460xd6 extends FrameLayout {
    public final FrameLayout LL;
    public final LinearLayout LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final FrameLayout LLILZIL;
    public final FrameLayout LLILZLL;
    public final LinearLayout LLIZ;
    public EnumC1779980wQ8 LLIZLLLIL;
    public EnumC1826470xd7 LLJ;
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
        int i = C1779990wQ9.LIZ[this.LLIZLLLIL.ordinal()];
        Double dValueOf = Double.valueOf(5.5d);
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            if (this.LLJ == EnumC1826470xd7.RECTANGLE) {
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
            this.LLILLJJLI.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            this.LLILLL.setTuxFont(this.LLJILJILJ);
            this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
            if (this.LLJI) {
                C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, 0, 0, false, 16);
                return;
            }
            C426750GoL.LJIIIZ(this.LLILZIL, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, false, 16);
            C426750GoL.LJIIIZ(this.LLILZLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 0, 0, 0, false, 16);
            C426750GoL.LJIIIZ(this.LLIZ, 0, 0, 0, 0, false, 16);
            return;
        }
        if (this.LLJ == EnumC1826470xd7.RECTANGLE) {
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
        this.LLILLJJLI.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        this.LLILLL.setTuxFont(this.LLJILJIL);
        this.LLILLJJLI.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)));
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
        ImageView imageView;
        int i = isSelected() ? this.LLJJI : this.LLJJIJIIJIL;
        int i2 = isFocused() ? this.LLJJIJIL : 0;
        if (!isEnabled()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.4f);
        } else if (!isPressed()) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
        GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
        if (baseColorLayerBackground != null) {
            baseColorLayerBackground.setColor(this.LLJJIII);
        }
        GradientDrawable containerBackground = getContainerBackground();
        if (containerBackground != null) {
            containerBackground.setStroke(i2 == 0 ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), i2);
            containerBackground.setColor(this.LLJJIJI);
        }
        this.LLILLL.setTextColor(i);
        this.LLILZ.setTextColor(i);
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout.getChildCount() > 0) {
            View childAt = frameLayout.getChildAt(0);
            if (!(childAt instanceof ImageView) || (imageView = (ImageView) childAt) == null) {
                return;
            }
            imageView.setColorFilter(i);
        }
    }

    public C1826460xd6(Context context) {
        int iIntValue;
        super(context, null, R.attr.yn);
        this.LLIZLLLIL = EnumC1779980wQ8.SMALL;
        EnumC1826470xd7 enumC1826470xd7 = EnumC1826470xd7.CAPSULE;
        this.LLJ = enumC1826470xd7;
        FrameLayout.inflate(context, R.layout.c4q, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSegment, R.attr.yn, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ze, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        this.LLJILLL = iIntValue;
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSelectedBackgroundColor, 0);
        this.LLJJ = color;
        this.LLJJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSelectedTitleColor, 0);
        this.LLJJIJI = 0;
        this.LLJJIII = 0;
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentNotSelectedTitleColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentSubtitleColor, 0);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegment__tux_segmentStrokeColor, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSegment__tux_segmentTitleFontSmall, 0);
        this.LLJILJIL = i;
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxSegment__tux_segmentTitleFontXSmall, 0);
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ujv);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
        gradientDrawable.setColor(iIntValue);
        frameLayout.setBackground(gradientDrawable);
        this.LL = frameLayout;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ujw);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
        gradientDrawable2.setColor(color);
        linearLayout.setBackground(gradientDrawable2);
        this.LLILLJJLI = linearLayout;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.uk2);
        tuxTextView.setTuxFont(i);
        tuxTextView.setText("");
        this.LLILLL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.uk1);
        tuxTextView2.setTuxFont(41);
        tuxTextView2.setTextColor(color2);
        tuxTextView2.setMinTextSize(5.0f);
        this.LLILZ = tuxTextView2;
        this.LLIZ = (LinearLayout) findViewById(R.id.y0w);
        this.LLILZIL = (FrameLayout) findViewById(R.id.uk0);
        this.LLILZLL = (FrameLayout) findViewById(R.id.uk3);
        LIZLLL();
    }

    private final void setLeadingIcon(InterfaceC1183504k5 interfaceC1183504k5) {
        LIZIZ(this.LLILZIL, interfaceC1183504k5);
    }

    private final void setSubtitle(String str) {
        if (Intrinsics.LJFF(String.valueOf(str), "Original")) {
            str = getContext().getString(2131834104);
        }
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

    private final void setTrailingIcon(InterfaceC1183504k5 interfaceC1183504k5) {
        LIZIZ(this.LLILZLL, interfaceC1183504k5);
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

    public final void setSegmentData(InterfaceC1780010wQB interfaceC1780010wQB) {
        boolean z = false;
        if (interfaceC1780010wQB instanceof C1782390wU1) {
            C1782390wU1 c1782390wU1 = (C1782390wU1) interfaceC1780010wQB;
            String strLIZIZ = c1782390wU1.LIZ;
            String str = c1782390wU1.LIZIZ;
            InterfaceC1183504k5 interfaceC1183504k5 = c1782390wU1.LIZJ;
            InterfaceC1183504k5 interfaceC1183504k52 = c1782390wU1.LIZLLL;
            Float f = c1782390wU1.LJFF;
            setTitle(strLIZIZ);
            setSubtitle(str);
            if (f != null) {
                float fFloatValue = f.floatValue();
                this.LLILLL.setTextSize(1, fFloatValue);
                this.LLILZ.setTextSize(1, fFloatValue);
            }
            setLeadingIcon(interfaceC1183504k5);
            setTrailingIcon(interfaceC1183504k52);
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
            z = c1782390wU1.LJ;
        } else if (interfaceC1780010wQB instanceof C1780000wQA) {
            interfaceC1780010wQB.getClass();
            interfaceC1780010wQB.getClass();
            setTitle(null);
            setSubtitle(null);
            setLeadingIcon(null);
            setTrailingIcon(null);
            setContentDescription(null);
            this.LLJI = true;
            LJFF();
            interfaceC1780010wQB.getClass();
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

    public final void setSize(EnumC1779980wQ8 enumC1779980wQ8) {
        this.LLIZLLLIL = enumC1779980wQ8;
        LJFF();
    }

    public final void setVariant(EnumC1826470xd7 enumC1826470xd7) {
        this.LLJ = enumC1826470xd7;
        int i = C1779990wQ9.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable baseColorLayerBackground = getBaseColorLayerBackground();
                if (baseColorLayerBackground != null) {
                    baseColorLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusXSmall())));
                }
                GradientDrawable containerBackground = getContainerBackground();
                if (containerBackground != null) {
                    containerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusXSmall())));
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        GradientDrawable baseColorLayerBackground2 = getBaseColorLayerBackground();
        if (baseColorLayerBackground2 != null) {
            baseColorLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
        }
        GradientDrawable containerBackground2 = getContainerBackground();
        if (containerBackground2 == null) {
            return;
        }
        containerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826470xd7.getInnerRadiusSmall())));
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

    public static void LJ(EnumC1779980wQ8 enumC1779980wQ8, FrameLayout frameLayout) {
        int i = C1779990wQ9.LIZ[enumC1779980wQ8.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                C786410Ut5.a6(frameLayout, layoutParams);
                TuxIconView tuxIconViewLIZ = C1808140x9Y.LIZ(frameLayout);
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
        layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        C786410Ut5.a6(frameLayout, layoutParams2);
        TuxIconView tuxIconViewLIZ2 = C1808140x9Y.LIZ(frameLayout);
        if (tuxIconViewLIZ2 == null) {
            return;
        }
        tuxIconViewLIZ2.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
        tuxIconViewLIZ2.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
    }

    public final void LIZIZ(FrameLayout frameLayout, InterfaceC1183504k5 interfaceC1183504k5) {
        int iLIZIZ;
        if (interfaceC1183504k5 == null) {
            LIZJ(null, frameLayout);
            return;
        }
        if (interfaceC1183504k5 instanceof C1183404k4) {
            int i = ((C1183404k4) interfaceC1183504k5).LIZ;
            TuxIconView tuxIconViewLIZ = C1808140x9Y.LIZ(frameLayout);
            if (tuxIconViewLIZ != null) {
                tuxIconViewLIZ.setIconRes(i);
                return;
            }
            int i2 = C1779990wQ9.LIZ[this.LLIZLLLIL.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                } else {
                    throw new C1954807lC();
                }
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            }
            TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
            C786410Ut5.M6(tuxIconView, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ, 17));
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LIZIZ = iLIZIZ;
            c419910GdJ.LIZJ = iLIZIZ;
            tuxIconView.setTuxIcon(c419910GdJ);
            LIZJ(tuxIconView, frameLayout);
            LIZLLL();
            return;
        }
        if (interfaceC1183504k5 instanceof C1182704jx) {
            LIZJ(null, frameLayout);
            return;
        }
        throw new C1954807lC();
    }
}
