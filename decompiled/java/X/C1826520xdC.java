package X;

import Y.ACListenerS129S0200000_27;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0xdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826520xdC extends FrameLayout {
    public static final C0HU6 LLJILJILJ = new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(37.7f));
    public final LinearLayout LL;
    public final FrameLayout LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final FrameLayout LLILZIL;
    public C21647019ng LLILZLL;
    public C1826480xd8 LLIZ;
    public EnumC1119290fEV LLIZLLLIL;
    public EnumC1826490xd9 LLJ;
    public EnumC1119260fES LLJI;
    public InterfaceC1119310fEX LLJIJIL;
    public final int LLJILJIL;

    public C1826520xdC(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final GradientDrawable getBackgroundLayerBackground() {
        Drawable background = this.LLILLJJLI.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorCoveringColorLayoutBackground() {
        Drawable background = this.LLILZIL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getCursorViewBackground() {
        Drawable background = this.LLILZ.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    private final GradientDrawable getMaterialLayerBackground() {
        Drawable background = this.LLILLL.getBackground();
        if (background instanceof GradientDrawable) {
            return (GradientDrawable) background;
        }
        return null;
    }

    public final void LIZIZ() {
        LinearLayout.LayoutParams layoutParams;
        for (View view : new C09RD(this.LL)) {
            int i = C1119270fET.LIZJ[this.LLJI.ordinal()];
            if (i == 1) {
                layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), -2, 1.0f);
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                layoutParams = new LinearLayout.LayoutParams(-2, -2, 0.0f);
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C21647019ng c21647019ng = this.LLILZLL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
    }

    public final void LIZ(C1782380wU0 c1782380wU0) {
        int i;
        boolean z;
        C1826480xd8 c1826480xd8 = new C1826480xd8(getContext());
        c1826480xd8.setVariant(this.LLJ);
        c1826480xd8.setSize(this.LLIZLLLIL);
        c1826480xd8.setSegmentData(c1782380wU0);
        View.OnClickListener aCListenerS129S0200000_27 = new ACListenerS129S0200000_27(c1826480xd8, this, 45);
        if (C1848410yCV.LIZ) {
            aCListenerS129S0200000_27 = new f(aCListenerS129S0200000_27);
        }
        a aVar = new a(aCListenerS129S0200000_27);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1826480xd8);
        }
        c1826480xd8.setOnClickListener(aVar);
        this.LL.addView(c1826480xd8);
        LIZIZ();
        Iterator<View> it2 = new C09RD(this.LL).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                if (((C1826480xd8) ((View) c09re.next())).LIZ()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator<View> it3 = new C09RD(this.LL).iterator();
        while (true) {
            C09RE c09re2 = (C09RE) it3;
            if (!c09re2.hasNext()) {
                break;
            }
            C1826480xd8 c1826480xd82 = (C1826480xd8) ((View) c09re2.next());
            if (c1826480xd82.LLJIJIL != z) {
                c1826480xd82.LLJIJIL = z;
                c1826480xd82.LJFF();
            }
        }
        int i2 = C20094413jq.LJIIZILJ;
        LinearLayout linearLayout = this.LL;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZLLL = new C1614480s7C(this.LL.getChildCount());
        C20094813ju.LIZ(linearLayout, c1397760mTe.LIZ());
        int childCount = this.LL.getChildCount();
        for (i = 0; i < childCount; i++) {
            View childAt = this.LL.getChildAt(i);
            int i3 = C20094413jq.LJIIZILJ;
            C1397760mTe c1397760mTe2 = new C1397760mTe();
            c1397760mTe2.LIZLLL = new C1614490s7D(i);
            C20094813ju.LIZ(childAt, c1397760mTe2.LIZ());
        }
    }

    public final void setMaterial(EnumC1119280fEU enumC1119280fEU) {
        int i = C1119270fET.LIZIZ[enumC1119280fEU.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setColor(this.LLJILJIL);
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

    public final void setOnSelectedChangeListener(InterfaceC1119310fEX interfaceC1119310fEX) {
        this.LLJIJIL = interfaceC1119310fEX;
    }

    public final void setSelected(final C1826480xd8 c1826480xd8) {
        int iIndexOfChild = this.LL.indexOfChild(c1826480xd8);
        C1826480xd8 c1826480xd82 = this.LLIZ;
        if (c1826480xd82 == null) {
            c1826480xd8.setSelected(true);
            InterfaceC1119310fEX interfaceC1119310fEX = this.LLJIJIL;
            if (interfaceC1119310fEX != null) {
                interfaceC1119310fEX.LIZ(iIndexOfChild, true);
            }
            c1826480xd8.setBackgroundSelected(true);
            this.LLIZ = c1826480xd8;
            return;
        }
        if (Intrinsics.LJFF(c1826480xd82, c1826480xd8)) {
            return;
        }
        c1826480xd8.setSelected(true);
        InterfaceC1119310fEX interfaceC1119310fEX2 = this.LLJIJIL;
        if (interfaceC1119310fEX2 != null) {
            interfaceC1119310fEX2.LIZ(iIndexOfChild, true);
        }
        C21647019ng c21647019ng = this.LLILZLL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        C1826480xd8 c1826480xd83 = this.LLIZ;
        if (c1826480xd83 != null) {
            int iIndexOfChild2 = this.LL.indexOfChild(c1826480xd83);
            c1826480xd83.setSelected(false);
            InterfaceC1119310fEX interfaceC1119310fEX3 = this.LLJIJIL;
            if (interfaceC1119310fEX3 != null) {
                interfaceC1119310fEX3.LIZ(iIndexOfChild2, false);
            }
            c1826480xd83.setBackgroundSelected(false);
            FrameLayout frameLayout = this.LLILZ;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = c1826480xd83.getMeasuredWidth();
            layoutParams.height = c1826480xd83.getMeasuredHeight();
            C786410Ut5.a6(frameLayout, layoutParams);
            C786410Ut5.Gd(this.LLILZ, c1826480xd83.getX());
            C786410Ut5.Md(this.LLILZ, c1826480xd83.getY());
            C786410Ut5.LJZ(0, this.LLILZ);
            if (C07XO.LIZ) {
                C786410Ut5.LJZ(8, this.LLILZ);
                c1826480xd8.setBackgroundSelected(true);
            } else {
                C19746412Nq c19746412Nq = new C19746412Nq("SegmentedControl", new C082N(c1826480xd83.getX(), c1826480xd8.getX()));
                Context context = getContext();
                FrameLayout frameLayout2 = this.LLILZ;
                EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
                C0HU6 c0hu6 = LLJILJILJ;
                C21647019ng c21647019ng2 = new C21647019ng(context, frameLayout2, new C19746312Np(enumC19746112Nn, c0hu6, Collections.singletonList(c19746412Nq)), false);
                this.LLILZLL = c21647019ng2;
                c21647019ng2.LJI = c21647019ng2.LIZIZ(new C19746312Np(enumC19746112Nn, c0hu6, Collections.singletonList(c19746412Nq)));
                final int measuredWidth = c1826480xd83.getMeasuredWidth();
                final float x = c1826480xd83.getX();
                InterfaceC21641019mi interfaceC21641019mi = new InterfaceC21641019mi() { // from class: X.0xdF
                    @Override // X.InterfaceC21641019mi
                    public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                        C786410Ut5.LJZ(8, this.LIZ.LLILZ);
                        c1826480xd8.setBackgroundSelected(true);
                    }

                    @Override // X.InterfaceC21641019mi
                    public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                        FrameLayout frameLayout3 = this.LIZ.LLILZ;
                        ViewGroup.LayoutParams layoutParams2 = frameLayout3.getLayoutParams();
                        layoutParams2.width = measuredWidth + ((int) ((c1826480xd8.getMeasuredWidth() - r2) * interfaceC1844880y6o.getProgress()));
                        C786410Ut5.a6(frameLayout3, layoutParams2);
                        C786410Ut5.Gd(this.LIZ.LLILZ, x + ((int) ((c1826480xd8.getX() - x) * interfaceC1844880y6o.getProgress())));
                    }
                };
                C21647019ng c21647019ng3 = this.LLILZLL;
                if (c21647019ng3 != null) {
                    c21647019ng3.LIZJ("SegmentedControl", interfaceC21641019mi);
                }
                C21647019ng c21647019ng4 = this.LLILZLL;
                if (c21647019ng4 != null) {
                    c21647019ng4.LJI(true);
                }
            }
        }
        this.LLIZ = c1826480xd8;
    }

    public final void setSelectedAt(int i) {
        if (i < this.LL.getChildCount() && i >= 0) {
            setSelected((C1826480xd8) this.LL.getChildAt(i));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No segment at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setSize(EnumC1119290fEV enumC1119290fEV) {
        if (this.LLIZLLLIL == enumC1119290fEV) {
            return;
        }
        this.LLIZLLLIL = enumC1119290fEV;
        int i = C1119270fET.LIZ[enumC1119290fEV.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.LLJ == EnumC1826490xd9.RECTANGLE) {
                    GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                    if (backgroundLayerBackground != null) {
                        backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusXSmall())));
                    }
                    GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                    if (materialLayerBackground != null) {
                        materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusXSmall())));
                    }
                    GradientDrawable cursorViewBackground = getCursorViewBackground();
                    if (cursorViewBackground != null) {
                        cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                    }
                    GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                    if (cursorCoveringColorLayoutBackground != null) {
                        cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusXSmall())));
                    }
                }
                C426750GoL.LJIIL(this.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), 16);
            } else {
                throw new C1954807lC();
            }
        } else {
            if (this.LLJ == EnumC1826490xd9.RECTANGLE) {
                GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
                if (backgroundLayerBackground2 != null) {
                    backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusSmall())));
                }
                GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
                if (materialLayerBackground2 != null) {
                    materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getOuterRadiusSmall())));
                }
                GradientDrawable cursorViewBackground2 = getCursorViewBackground();
                if (cursorViewBackground2 != null) {
                    cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground2 != null) {
                    cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(this.LLJ.getInnerRadiusSmall())));
                }
            }
            C426750GoL.LJIIL(this.LL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3))), 16);
        }
        Iterator<View> it2 = new C09RD(this.LL).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (view instanceof C1826480xd8) {
                    ((C1826480xd8) view).setSize(enumC1119290fEV);
                }
            } else {
                LIZIZ();
                return;
            }
        }
    }

    public final void setVariant(EnumC1826490xd9 enumC1826490xd9) {
        if (this.LLJ == enumC1826490xd9) {
            return;
        }
        this.LLJ = enumC1826490xd9;
        int i = C1119270fET.LIZ[this.LLIZLLLIL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                GradientDrawable backgroundLayerBackground = getBackgroundLayerBackground();
                if (backgroundLayerBackground != null) {
                    backgroundLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusXSmall())));
                }
                GradientDrawable materialLayerBackground = getMaterialLayerBackground();
                if (materialLayerBackground != null) {
                    materialLayerBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusXSmall())));
                }
                GradientDrawable cursorViewBackground = getCursorViewBackground();
                if (cursorViewBackground != null) {
                    cursorViewBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusXSmall())));
                }
                GradientDrawable cursorCoveringColorLayoutBackground = getCursorCoveringColorLayoutBackground();
                if (cursorCoveringColorLayoutBackground != null) {
                    cursorCoveringColorLayoutBackground.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusXSmall())));
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            GradientDrawable backgroundLayerBackground2 = getBackgroundLayerBackground();
            if (backgroundLayerBackground2 != null) {
                backgroundLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusSmall())));
            }
            GradientDrawable materialLayerBackground2 = getMaterialLayerBackground();
            if (materialLayerBackground2 != null) {
                materialLayerBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusSmall())));
            }
            GradientDrawable cursorViewBackground2 = getCursorViewBackground();
            if (cursorViewBackground2 != null) {
                cursorViewBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusSmall())));
            }
            GradientDrawable cursorCoveringColorLayoutBackground2 = getCursorCoveringColorLayoutBackground();
            if (cursorCoveringColorLayoutBackground2 != null) {
                cursorCoveringColorLayoutBackground2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusSmall())));
            }
        }
        for (View view : new C09RD(this.LL)) {
            if (view instanceof C1826480xd8) {
                ((C1826480xd8) view).setVariant(enumC1826490xd9);
            }
        }
    }

    public final void setWidthRule(EnumC1119260fES enumC1119260fES) {
        this.LLJI = enumC1119260fES;
        LIZIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1826520xdC(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yo;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLIZLLLIL = EnumC1119290fEV.SMALL;
        EnumC1826490xd9 enumC1826490xd9 = EnumC1826490xd9.CAPSULE;
        this.LLJ = enumC1826490xd9;
        this.LLJI = EnumC1119260fES.HugContent;
        FrameLayout.inflate(context, R.layout.gy, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxSegmentedControl, i2, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlBackgroundLayerColor, 0);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlMaterialLayerColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlCursorColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSegmentedControl__tux_segmentedControlCursorCoveringColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = (LinearLayout) findViewById(R.id.uk5);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.bod);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusSmall())));
        gradientDrawable.setColor(color);
        frameLayout.setBackground(gradientDrawable);
        this.LLILLJJLI = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.o3s);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getOuterRadiusSmall())));
        frameLayout2.setBackground(gradientDrawable2);
        this.LLILLL = frameLayout2;
        FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.fbn);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusSmall())));
        gradientDrawable3.setColor(color2);
        frameLayout3.setBackground(gradientDrawable3);
        this.LLILZ = frameLayout3;
        FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.fbm);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(enumC1826490xd9.getInnerRadiusSmall())));
        gradientDrawable4.setColor(color3);
        frameLayout4.setBackground(gradientDrawable4);
        this.LLILZIL = frameLayout4;
    }
}
