package X;

import Y.ALAdapterS2S0200000_5;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.IStickerPreviewService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;

/* JADX INFO: renamed from: X.0Ejm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372960Ejm extends AbstractC381020Ewm<InterfaceC373130Ek3> implements InterfaceC373130Ek3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LLILLL;
    public final C372960Ejm LLILZ;
    public InterfaceC361710EGb LLILZIL;
    public InterfaceC372990Ejp LLILZLL;
    public final long LLIZ;
    public Rect LLIZLLLIL;
    public Rect LLJ;
    public int LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public int LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C372960Ejm.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/portrait/cutout/CutoutPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = 8;
    }

    private final C357270DzZ Z1() {
        return (C357270DzZ) this.LLJIJIL.getValue(this, LLJILJILJ[0]);
    }

    private final int o2() {
        int[] iArrLLJLLIL;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return 0;
        }
        float[] fArrLLJLLIL = c0e48W1.getPlayer().LLJLLIL();
        if (fArrLLJLLIL == null) {
            fArrLLJLLIL = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        InterfaceC372990Ejp interfaceC372990Ejp = this.LLILZLL;
        if (interfaceC372990Ejp == null || (iArrLLJLLIL = interfaceC372990Ejp.LLJLLIL()) == null) {
            iArrLLJLLIL = new int[]{0, 0, 0, 0};
        }
        return ((int) fArrLLJLLIL[1]) - iArrLLJLLIL[1];
    }

    private final void w2() {
        String str;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        c0e48W1.S7().LIZIZ(Boolean.TRUE, "is_bottom_panel_showing", false);
        C357270DzZ c357270DzZZ1 = Z1();
        if (c357270DzZZ1 == null || (str = c357270DzZZ1.LL) == null) {
            str = "sound_adjust_panel";
        }
        c0e48W1.S7().LIZIZ(new C0E2C(300.0f, str, true), "panel_bounce_event", false);
    }

    @Override // X.InterfaceC373130Ek3
    public void bind() {
        w2();
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        this.LLILZIL = iPreviewServiceLIZ != null ? iPreviewServiceLIZ.getPreviewPanelApi() : null;
        IStickerPreviewService iStickerPreviewServiceLIZIZ = C357280Dza.LIZIZ();
        this.LLILZLL = iStickerPreviewServiceLIZIZ != null ? iStickerPreviewServiceLIZIZ.getStickerPreviewApi() : null;
        float[] fArrLLJLLIL = c0e48W1.getPlayer().LLJLLIL();
        if (fArrLLJLLIL == null) {
            fArrLLJLLIL = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        float f = fArrLLJLLIL[0];
        float f2 = fArrLLJLLIL[1];
        this.LLIZLLLIL = new Rect((int) f, (int) f2, (int) (f + fArrLLJLLIL[2]), (int) (f2 + fArrLLJLLIL[3]));
        this.LLJILJIL = (int) fArrLLJLLIL[1];
        this.LLJI = o2();
        Rect rect = this.LLIZLLLIL;
        this.LLJ = T2(rect, rect.height() + this.LLJILJIL);
    }

    public C372960Ejm X1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public C372960Ejm(C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = this;
        this.LLIZ = 250L;
        this.LLIZLLLIL = new Rect(0, 0, 0, 0);
        this.LLJ = new Rect(0, 0, 0, 0);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C357270DzZ.class, null);
    }

    public final void G2(Function1<? super Size, Unit> function1) {
        final C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        float[] fArrLLJLLIL = c0e48W1.getPlayer().LLJLLIL();
        if (fArrLLJLLIL == null) {
            fArrLLJLLIL = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        float f = fArrLLJLLIL[0];
        float f2 = fArrLLJLLIL[1];
        final Rect rect = new Rect((int) f, (int) f2, (int) (f + fArrLLJLLIL[2]), (int) (f2 + fArrLLJLLIL[3]));
        int i = rect.left;
        Rect rect2 = this.LLIZLLLIL;
        final int i2 = i - rect2.left;
        final int i3 = rect.top - rect2.top;
        final int i4 = rect.right - rect2.right;
        final int i5 = rect.bottom - rect2.bottom;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Ejo
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                Rect rect3 = rect;
                float f3 = rect3.left - (i2 * animatedFraction);
                float f4 = rect3.top - (i3 * animatedFraction);
                float f5 = (rect3.right - (i4 * animatedFraction)) - f3;
                float f6 = (rect3.bottom - (i5 * animatedFraction)) - f4;
                c0e48W1.getPlayer().LJIILJJIL(f3, f4, f5, f6, null);
                InterfaceC372990Ejp interfaceC372990Ejp = this.LLILZLL;
                if (interfaceC372990Ejp != null) {
                    interfaceC372990Ejp.setDisplayPos((int) f3, (int) (f4 - r0.LLJI), (int) f5, (int) f6);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0200000_5(this, function1, 5));
        valueAnimatorOfFloat.setDuration(this.LLIZ);
        valueAnimatorOfFloat.setInterpolator(new C21388418n4());
        valueAnimatorOfFloat.start();
    }

    public final void H2(Function1<? super Size, Unit> function1) {
        final C0E48 c0e48W1 = W1();
        if (c0e48W1 == null) {
            return;
        }
        Rect rect = this.LLJ;
        int i = rect.left;
        Rect rect2 = this.LLIZLLLIL;
        final int i2 = i - rect2.left;
        final int i3 = rect.top - rect2.top;
        final int i4 = rect.right - rect2.right;
        final int i5 = rect.bottom - rect2.bottom;
        InterfaceC372990Ejp interfaceC372990Ejp = this.LLILZLL;
        if (interfaceC372990Ejp != null) {
            interfaceC372990Ejp.O2(false);
        }
        InterfaceC361710EGb interfaceC361710EGb = this.LLILZIL;
        if (interfaceC361710EGb != null) {
            interfaceC361710EGb.LR1(false);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Ejn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                Rect rect3 = this.LL.LLIZLLLIL;
                float f = rect3.left + (i2 * animatedFraction);
                float f2 = rect3.top + (i3 * animatedFraction);
                float f3 = (rect3.right + (i4 * animatedFraction)) - f;
                float f4 = (rect3.bottom + (i5 * animatedFraction)) - f2;
                c0e48W1.getPlayer().LJIILJJIL(f, f2, f3, f4, null);
                InterfaceC372990Ejp interfaceC372990Ejp2 = this.LL.LLILZLL;
                if (interfaceC372990Ejp2 != null) {
                    interfaceC372990Ejp2.setDisplayPos((int) f, (int) (f2 - r0.LLJI), (int) f3, (int) f4);
                }
            }
        });
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0200000_5(this, function1, 6));
        valueAnimatorOfFloat.setDuration(this.LLIZ);
        valueAnimatorOfFloat.setInterpolator(new C21388418n4());
        valueAnimatorOfFloat.start();
    }

    public final Size W2(boolean z) {
        C372830EjZ c372830EjZ;
        int i;
        int iWidth;
        Rect rect;
        C357270DzZ c357270DzZZ1 = Z1();
        if (c357270DzZZ1 != null && (c372830EjZ = c357270DzZZ1.LLJIJIL) != null) {
            int height = c372830EjZ.getPreviewLayout().getHeight();
            if (z) {
                i = height + this.LLJILJIL;
            } else {
                i = -1;
            }
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updatePreviewPanelWithOffset, targetHeight: ");
            sbLIZ.append(i);
            C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i);
            layoutParams.addRule(2, c372830EjZ.getControlLayout().getId());
            if (c372830EjZ.getCanvasConfig().LIZJ == EnumC372730EjP.VARIABLE) {
                FrameLayout grabberView = c372830EjZ.getGrabberView();
                if (grabberView != null) {
                    layoutParams.addRule(2, grabberView.getId());
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                layoutParams.addRule(2, c372830EjZ.getControlLayout().getId());
            }
            if (!z) {
                EnumC372850Ejb enumC372850Ejb = c372830EjZ.getCanvasConfig().LIZIZ;
                if (enumC372850Ejb == EnumC372850Ejb.NAV_BAR_STYLE_V2) {
                    layoutParams.addRule(10);
                    C426750GoL.LJIIJ(layoutParams, c372830EjZ.getPreviewLayout().getContext(), null, Integer.valueOf(c372830EjZ.getNavBarHeight()), null, null, 58);
                } else if (enumC372850Ejb == EnumC372850Ejb.NAV_BAR_AT_TOP) {
                    View navBarLayout = c372830EjZ.getNavBarLayout();
                    if (navBarLayout != null) {
                        layoutParams.addRule(3, navBarLayout.getId());
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else if (enumC372850Ejb == EnumC372850Ejb.NAV_BAR_OVERLAY_AT_TOP) {
                    layoutParams.addRule(10);
                }
            }
            C786410Ut5.W5(c372830EjZ.getPreviewLayout(), layoutParams);
            if (z) {
                iWidth = this.LLJ.width();
                rect = this.LLJ;
            } else {
                iWidth = this.LLIZLLLIL.width();
                rect = this.LLIZLLLIL;
            }
            return new Size(iWidth, rect.height());
        }
        return null;
    }

    @Override // X.InterfaceC373130Ek3
    public void ml2(Function1<? super Size, Unit> function1) {
        C354270Duj.LIZJ(0L, new AwS406S0200000_5(this, (C372960Ejm) function1, (Function1<? super Size, Unit>) 83));
    }

    @Override // X.InterfaceC373130Ek3
    public void pV0(Function1<? super Size, Unit> function1) {
        C354270Duj.LIZJ(0L, new AwS406S0200000_5(this, (C372960Ejm) function1, (Function1<? super Size, Unit>) 84));
    }

    private final Rect T2(Rect rect, int i) {
        float fWidth = rect.width();
        int i2 = rect.bottom;
        float fHeight = ((i * (fWidth / rect.height())) - fWidth) / 2;
        return new Rect((int) (rect.left - fHeight), i2 - i, (int) (rect.right + fHeight), i2);
    }
}
