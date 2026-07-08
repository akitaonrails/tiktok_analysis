package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582570rHj extends FrameLayout {
    public static final /* synthetic */ int LLJJIII = 0;
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final C1183604k6 LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public InterfaceC1183704k7 LLJILJIL;
    public InterfaceC1203260hPw LLJILJILJ;
    public int LLJILLL;
    public final Map<FrameLayout, C21616519il> LLJJ;
    public final Map<FrameLayout, View> LLJJI;

    public C1582570rHj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final GradientDrawable getContainerBackground() {
        Drawable background = this.LL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582570rHj.LJFF():void");
    }

    public final int getParentWidth$tux_theme_release() {
        return this.LLJILLL;
    }

    private final void setLabel(CharSequence charSequence) {
        this.LLILLJJLI.setText(charSequence);
        TuxTextView tuxTextView = this.LLILLJJLI;
        int i = 0;
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, tuxTextView);
    }

    private final void setLeadingIcon(InterfaceC1183704k7 interfaceC1183704k7) {
        this.LLJILJIL = interfaceC1183704k7;
        LIZIZ(this.LLILLL, interfaceC1183704k7);
    }

    private final void setTrailingIcon(InterfaceC1183704k7 interfaceC1183704k7) {
        LIZIZ(this.LLILZ, interfaceC1183704k7);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        LJFF();
    }

    public final void setFont(Integer num) {
        if (num != null) {
            num.intValue();
            this.LLILLJJLI.setTuxFont(num.intValue());
        }
    }

    public final void setParentWidth$tux_theme_release(int i) {
        this.LLJILLL = i;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        LJFF();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        InterfaceC1183704k7 interfaceC1183704k7;
        super.setSelected(z);
        if (this.LLJILJILJ instanceof C1582500rHc) {
            FrameLayout frameLayout = this.LLILLL;
            if (isSelected()) {
                interfaceC1183704k7 = this.LLJ;
            } else {
                interfaceC1183704k7 = this.LLJILJIL;
            }
            LIZIZ(frameLayout, interfaceC1183704k7);
        }
        LJFF();
    }

    public final void setSelectionStyle(InterfaceC1203260hPw interfaceC1203260hPw) {
        InterfaceC1183704k7 interfaceC1183704k7;
        this.LLJILJILJ = interfaceC1203260hPw;
        if (interfaceC1203260hPw instanceof C1582500rHc) {
            FrameLayout frameLayout = this.LLILLL;
            if (isSelected()) {
                interfaceC1183704k7 = this.LLJ;
            } else {
                interfaceC1183704k7 = this.LLJILJIL;
            }
            LIZIZ(frameLayout, interfaceC1183704k7);
        } else {
            LIZIZ(this.LLILLL, this.LLJILJIL);
        }
        if (isSelected()) {
            LJFF();
        }
    }

    public final void setVariant(EnumC1166860gTE enumC1166860gTE) {
        GradientDrawable containerBackground = getContainerBackground();
        if (containerBackground != null) {
            containerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1166860gTE.getCornerRadiusDp())));
        }
    }

    public final void setWidthRule(InterfaceC1170390gYv interfaceC1170390gYv) {
        if (interfaceC1170390gYv instanceof C1582580rHk) {
            LinearLayout linearLayout = this.LL;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -2;
            C786410Ut5.d6(linearLayout, layoutParams);
            C1582580rHk c1582580rHk = (C1582580rHk) interfaceC1170390gYv;
            this.LL.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1582580rHk.LIZJ))));
            this.LLILLJJLI.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1582580rHk.LIZ))));
            this.LLILLJJLI.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1582580rHk.LIZIZ))));
            return;
        }
        if (interfaceC1170390gYv instanceof C1170400gYw) {
            LinearLayout linearLayout2 = this.LL;
            ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((C1170400gYw) interfaceC1170390gYv).LIZ)));
            C786410Ut5.d6(linearLayout2, layoutParams2);
            this.LLILLJJLI.setMinWidth(0);
            this.LLILLJJLI.setMaxWidth(Integer.MAX_VALUE);
            return;
        }
        throw new C1954807lC();
    }

    public final void LIZIZ(FrameLayout frameLayout, InterfaceC1183704k7 interfaceC1183704k7) {
        if (interfaceC1183704k7 == null) {
            LIZJ(null, frameLayout);
            return;
        }
        if (interfaceC1183704k7 instanceof C1183604k6) {
            int i = ((C1183604k6) interfaceC1183704k7).LIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            TuxIconView tuxIconViewLIZIZ = C1582590rHl.LIZIZ(frameLayout);
            if (tuxIconViewLIZIZ != null) {
                tuxIconViewLIZIZ.setIconRes(i);
            } else {
                tuxIconViewLIZIZ = new TuxIconView(getContext(), null, 0, 6, null);
                C786410Ut5.M6(tuxIconViewLIZIZ, new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                c419910GdJ.LIZIZ = iLIZIZ;
                c419910GdJ.LIZJ = iLIZIZ;
                tuxIconViewLIZIZ.setTuxIcon(c419910GdJ);
            }
            LIZJ(tuxIconViewLIZIZ, frameLayout);
            LJFF();
            return;
        }
        if (interfaceC1183704k7 instanceof C1182604jw) {
            LIZJ(null, frameLayout);
            return;
        }
        throw new C1954807lC();
    }

    public final void LIZJ(TuxIconView tuxIconView, final FrameLayout frameLayout) {
        if (this.LLJJI.containsKey(frameLayout) && Intrinsics.LJFF(((LinkedHashMap) this.LLJJI).get(frameLayout), tuxIconView)) {
            return;
        }
        this.LLJJI.put(frameLayout, tuxIconView);
        AbstractC21616419ik abstractC21616419ik = (AbstractC21616419ik) ((LinkedHashMap) this.LLJJ).get(frameLayout);
        if (abstractC21616419ik != null) {
            abstractC21616419ik.LIZLLL();
        }
        if (tuxIconView != null) {
            frameLayout.addView(tuxIconView);
            if (getRight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) > this.LLJILLL) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C786410Ut5.a6(frameLayout, layoutParams);
                C786410Ut5.LJLLLLLL(0, frameLayout);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.width = 0;
            C786410Ut5.a6(frameLayout, layoutParams2);
            C786410Ut5.LJLLLLLL(0, frameLayout);
            C21616519il c21616519ilLIZ = LIZ(0.0f, C418440Gaw.LIZIZ(16), frameLayout);
            c21616519ilLIZ.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0rHo
                @Override // X.InterfaceC1427630nFp
                public final void LIZ(AbstractC21616419ik abstractC21616419ik2, boolean z, float f, float f2) {
                    this.LLJJ.remove(frameLayout);
                }
            });
            c21616519ilLIZ.LJIIIZ();
            return;
        }
        C21616519il c21616519ilLIZ2 = LIZ(frameLayout.getWidth(), 0.0f, frameLayout);
        c21616519ilLIZ2.LIZIZ(new InterfaceC1427630nFp() { // from class: X.0rHn
            @Override // X.InterfaceC1427630nFp
            public final void LIZ(AbstractC21616419ik abstractC21616419ik2, boolean z, float f, float f2) {
                C786410Ut5.LJJJJIZL(frameLayout);
                C786410Ut5.LJLLLLLL(8, frameLayout);
                this.LLJJ.remove(frameLayout);
            }
        });
        c21616519ilLIZ2.LJIIIZ();
    }

    public final void LIZLLL(InterfaceC1183704k7 interfaceC1183704k7, CharSequence charSequence) {
        setLabel(null);
        setLeadingIcon(interfaceC1183704k7);
        setTrailingIcon(null);
        setContentDescription(charSequence);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1582570rHj(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.xo;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLJILJILJ = new C1582480rHa(null, null, null, null);
        FrameLayout.inflate(context, R.layout.g2, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxChip, i2, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipSingleSelectBackgroundColor, 0);
        this.LLILZLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipSingleSelectForegroundColor, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipMultiSelectForegroundColor, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipMultiSelectStrokeColor, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxChip__tux_chipMultiSelectIcon, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipUnselectedBackgroundColor, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxChip__tux_chipUnselectedForegroundColor, 0);
        int i3 = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxChip__tux_chipLabelFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        setPadding(0, iLIZIZ, 0, iLIZIZ);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.drt);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(EnumC1166860gTE.CAPSULE.getCornerRadiusDp())));
        linearLayout.setBackground(gradientDrawable);
        this.LL = linearLayout;
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.drv);
        tuxTextView.setTuxFont(i3);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(208)));
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = (FrameLayout) findViewById(R.id.drw);
        this.LLILZ = (FrameLayout) findViewById(R.id.drx);
        this.LLJ = new C1183604k6(resourceId);
        LJFF();
        this.LLJJ = new LinkedHashMap();
        this.LLJJI = new LinkedHashMap();
    }

    public final C21616519il LIZ(float f, float f2, final FrameLayout frameLayout) {
        C21616519il c21616519il = new C21616519il(new C1582560rHi());
        c21616519il.LJJ = new C21581419d6(f2);
        c21616519il.LJI(f);
        c21616519il.LJJ.LIZ(0.85f);
        c21616519il.LJJ.LIZIZ(2680.0f);
        c21616519il.LIZJ(new InterfaceC20731416Am() { // from class: X.0rHm
            @Override // X.InterfaceC20731416Am
            public final void LIZ(float f3, float f4) {
                FrameLayout frameLayout2 = frameLayout;
                ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
                layoutParams.width = (int) f3;
                C786410Ut5.a6(frameLayout2, layoutParams);
            }
        });
        this.LLJJ.put(frameLayout, c21616519il);
        return c21616519il;
    }

    public final void LJ(CharSequence charSequence, InterfaceC1183704k7 interfaceC1183704k7, InterfaceC1183704k7 interfaceC1183704k72) {
        setLabel(charSequence);
        setLeadingIcon(interfaceC1183704k7);
        setTrailingIcon(interfaceC1183704k72);
        setContentDescription(charSequence);
    }
}
