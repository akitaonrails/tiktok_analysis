package X;

import Y.ARunnableS101S0200000_32;
import Y.ARunnableS132S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.1863, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1863 extends C185J<FrameLayout, C185K> {
    public C185K LIZLLL;
    public Integer LJ;
    public Animator LJFF;
    public Animator LJI;
    public ARunnableS101S0200000_32 LJII;
    public ARunnableS132S0100000_32 LJIIIIZZ;
    public final C186O LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;

    public static final FrameLayout.LayoutParams LJIILL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)));
        layoutParams.gravity = 8388627;
        return layoutParams;
    }

    public final void LJIILIIL() {
        Animator animator = this.LJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LJI = null;
        C786410Ut5.LJJJJIZL(LJIIZILJ());
    }

    public final void LJIILJJIL() {
        ARunnableS101S0200000_32 aRunnableS101S0200000_32 = this.LJII;
        if (aRunnableS101S0200000_32 != null) {
            HandlerHook.viewRemoveCallbacks(this.LIZ, aRunnableS101S0200000_32);
        }
        this.LJII = null;
        ARunnableS132S0100000_32 aRunnableS132S0100000_32 = this.LJIIIIZZ;
        if (aRunnableS132S0100000_32 != null) {
            HandlerHook.viewRemoveCallbacks(LJIJ(), aRunnableS132S0100000_32);
        }
        this.LJIIIIZZ = null;
    }

    public final FrameLayout LJIIZILJ() {
        return (FrameLayout) this.LJIILIIL.getValue();
    }

    public final C0F4N LJIJ() {
        return (C0F4N) this.LJIIJJI.getValue();
    }

    public final TuxTextView LJIJI() {
        return (TuxTextView) this.LJIIZILJ.getValue();
    }

    public final TuxTextView LJIJJ() {
        return (TuxTextView) this.LJIILL.getValue();
    }

    public final TuxTextView LJIJJLI() {
        return (TuxTextView) this.LJIJ.getValue();
    }

    public final ConstraintLayout LJIL() {
        return (ConstraintLayout) this.LJIIJ.getValue();
    }

    public final TuxTextView LJJ() {
        return (TuxTextView) this.LJIILLIIL.getValue();
    }

    public final LinearLayout LJJI() {
        return (LinearLayout) this.LJIIL.getValue();
    }

    public final TuxTextView LJJIFFI() {
        return (TuxTextView) this.LJIILJJIL.getValue();
    }

    public final void LJJIIJ() {
        C786410Ut5.U4((FrameLayout) this.LIZ, 1.0f);
        this.LIZ.setClipBounds(null);
        LJIJ().setClipBounds(null);
        C786410Ut5.B5(LJJ(), 1.0f);
        C786410Ut5.Vc(LJJ(), 0.0f);
        C786410Ut5.W4(LJJI(), 1.0f);
        C786410Ut5.Mc(LJJI(), 0.0f);
        C786410Ut5.B5(LJIJI(), 1.0f);
        C786410Ut5.Vc(LJIJI(), 0.0f);
    }

    public final void LJJIIZI() {
        Animator animator = this.LJFF;
        if (animator != null) {
            animator.cancel();
        }
        LJIILJJIL();
        LJJIIJ();
        C185K c185k = this.LIZLLL;
        if (c185k != null) {
            LJJIII(c185k, false, false, true);
        }
        LJIIIZ(true);
    }

    public final void destroy() {
        Animator animator = this.LJFF;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        LJIILJJIL();
        LJJIIJ();
        this.LIZLLL = null;
        this.LJ = null;
        C786410Ut5.LJJJJIZL((FrameLayout) this.LIZ);
    }

    public AnonymousClass1863(FrameLayout frameLayout) {
        super(frameLayout);
        final C19344810mE c19344810mE = new C19344810mE();
        this.LJIIIZ = new C186O(new C186V() { // from class: X.186U
            @Override // X.C186V
            public final EnumC1990607qy LIZIZ() {
                return c19344810mE.LIZIZ();
            }

            @Override // X.C186V
            public final void LIZJ(List<String> list) {
                c19344810mE.LIZJ(list);
            }

            @Override // X.C186V
            public final int LIZLLL() {
                return c19344810mE.LIZLLL();
            }

            @Override // X.C186V
            public final int LJ() {
                return c19344810mE.LJ();
            }

            @Override // X.C186V
            public final boolean LJFF() {
                return true;
            }

            @Override // X.C186V
            public final int LJI() {
                return c19344810mE.LJI();
            }

            @Override // X.C186V
            public final int LJII() {
                return c19344810mE.LJII();
            }

            @Override // X.C186V
            public final int LJIIIIZZ() {
                return c19344810mE.LJIIIIZZ();
            }

            @Override // X.C186V
            public final int LJIIIZ() {
                return c19344810mE.LJIIIZ();
            }

            @Override // X.C186V
            public final int LJIIJ() {
                return c19344810mE.LJIIJ();
            }

            @Override // X.C186V
            public final int LJIIJJI() {
                return c19344810mE.LJIIJJI();
            }

            @Override // X.C186V
            public final Integer LJIIL() {
                return c19344810mE.LJIIL();
            }

            @Override // X.C186V
            public final int LJIILIIL() {
                return c19344810mE.LJIILIIL();
            }

            @Override // X.C186V
            public final int LJIILJJIL() {
                return c19344810mE.LJIILJJIL();
            }

            @Override // X.C186V
            public final C186X LJIILL() {
                return c19344810mE.LJIILL();
            }

            @Override // X.C186V
            public final List<String> LJIILLIIL() {
                return c19344810mE.LJIILLIIL();
            }

            @Override // X.C186V
            public final boolean LJIIZILJ() {
                return true;
            }

            @Override // X.C186V
            public final void LJIJ(C186X c186x) {
                c19344810mE.LJIJ(c186x);
            }

            @Override // X.C186V
            public final int LJIJI() {
                return c19344810mE.LJIJI();
            }

            @Override // X.C186V
            public final int LIZ() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            }
        });
        this.LJIIJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1049));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1045));
        this.LJIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1051));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1044));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1052));
        this.LJIILL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1047));
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1050));
        this.LJIIZILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1046));
        this.LJIJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1048));
    }

    public static final float LJIIJ(int i) {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i * 14)));
    }

    public static C185K LJJII(C185K c185k) {
        C185H c185h = c185k.LIZIZ;
        return C185K.LIZ(c185k, C185H.LIZ(c185h, 0, null, C13LP.LL(c185h.LIZJ, 2), 0.0f, 27));
    }

    public static boolean LJJIIZ(C185I c185i) {
        Integer num = c185i.LJIIIIZZ;
        if (num != null && num.intValue() == 1 && C703302op.LIZ(c185i.LJIIIZ)) {
            return true;
        }
        return false;
    }

    public final void LJIIJJI(List<C1555800qaY> list) {
        String str;
        C786410Ut5.LJJJJIZL(LJIIZILJ());
        int i = 0;
        for (Object obj : C13LP.LL(list, 2)) {
            int i2 = i + 1;
            if (i >= 0) {
                FrameLayout frameLayoutLJIIZILJ = LJIIZILJ();
                FrameLayout frameLayoutLJIILLIIL = LJIILLIIL(this.LIZJ, (C1555800qaY) obj);
                if (i == 0) {
                    str = "sea_flash_sale_price_avatar_first";
                } else {
                    str = "sea_flash_sale_price_avatar_second";
                }
                frameLayoutLJIILLIIL.setTag(str);
                frameLayoutLJIILLIIL.setZ(2 - i);
                C786410Ut5.U4(frameLayoutLJIILLIIL, 1.0f);
                C786410Ut5.Pb(frameLayoutLJIILLIIL, 1.0f);
                C786410Ut5.qc(frameLayoutLJIILLIIL, 1.0f);
                C786410Ut5.Gd(frameLayoutLJIILLIIL, LJIIJ(i));
                C786410Ut5.Md(frameLayoutLJIILLIIL, 0.0f);
                frameLayoutLJIIZILJ.addView(frameLayoutLJIILLIIL, LJIILL());
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LJJIIJZLJL(C185K c185k) {
        Animator animator = this.LJFF;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJI;
        if (animator2 != null) {
            animator2.cancel();
        }
        LJIILJJIL();
        this.LIZLLL = LJJII(c185k);
        this.LJ = null;
        LJJIIJ();
        C786410Ut5.LJJJJIZL((FrameLayout) this.LIZ);
    }

    public final void LJJIJ(int i) {
        LinearLayout.LayoutParams layoutParams;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams2 = LJJIFFI().getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            if (i > 0) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
            } else {
                iLIZIZ = 0;
            }
            layoutParams.setMarginStart(iLIZIZ);
            C786410Ut5.R6(LJJIFFI(), layoutParams);
            LJJIFFI().setMaxWidth(Integer.MAX_VALUE);
            LJJIFFI().setMinWidth(0);
        }
    }

    public static final FrameLayout LJIILLIIL(Context context, C1555800qaY c1555800qaY) {
        String str;
        FrameLayout frameLayout = new FrameLayout(context);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Float fValueOf = Float.valueOf(1.5f);
        gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), -1);
        gradientDrawable.setColor(-1);
        smartImageView.setBackground(gradientDrawable);
        smartImageView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
        ECImage eCImage = c1555800qaY.LIZ;
        if (eCImage != null) {
            str = eCImage.url;
        } else {
            str = null;
        }
        if (C703302op.LIZ(str)) {
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LIZLLL.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LIZLLL);
        }
        frameLayout.addView(smartImageView, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), 17));
        return frameLayout;
    }

    public final void LJIIL(C185H c185h, boolean z, boolean z2) {
        final View viewFindViewWithTag;
        int i;
        int i2 = c185h.LIZ;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                LJIILIIL();
                LJJIJ(0);
                LJJIFFI().setText("");
                return;
            } else {
                C786410Ut5.LJZL(0, LJJI());
                LJIILIIL();
                C786410Ut5.LJZ(8, LJIIZILJ());
                LJJIJ(0);
                LJJIFFI().setText(c185h.LIZIZ);
                return;
            }
        }
        C786410Ut5.LJZL(0, LJJI());
        List listLL = C13LP.LL(c185h.LIZJ, 2);
        if (z2 || LJIIZILJ().getChildCount() != listLL.size()) {
            final List<C1555800qaY> listLL2 = C13LP.LL(listLL, 2);
            if (listLL2.size() < 2) {
                LJIILIIL();
            } else if (LJIIZILJ().getChildCount() < 2 || !z) {
                LJIIJJI(listLL2);
            } else {
                Animator animator = this.LJI;
                if (animator != null) {
                    animator.cancel();
                }
                final View viewFindViewWithTag2 = LJIIZILJ().findViewWithTag("sea_flash_sale_price_avatar_first");
                if (viewFindViewWithTag2 == null || (viewFindViewWithTag = LJIIZILJ().findViewWithTag("sea_flash_sale_price_avatar_second")) == null) {
                    LJIIJJI(listLL2);
                } else {
                    float fLJIIJ = LJIIJ(1);
                    final FrameLayout frameLayoutLJIILLIIL = LJIILLIIL(this.LIZJ, (C1555800qaY) C13LP.LJJJJZI(listLL2));
                    frameLayoutLJIILLIIL.setTag("sea_flash_sale_price_avatar_incoming");
                    C786410Ut5.U4(frameLayoutLJIILLIIL, 1.0f);
                    C786410Ut5.Pb(frameLayoutLJIILLIIL, 0.0f);
                    C786410Ut5.qc(frameLayoutLJIILLIIL, 0.0f);
                    frameLayoutLJIILLIIL.setPivotX(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) / 2.0f);
                    frameLayoutLJIILLIIL.setPivotY(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) / 2.0f);
                    C786410Ut5.Gd(frameLayoutLJIILLIIL, LJIIJ(0));
                    C786410Ut5.Md(frameLayoutLJIILLIIL, 0.0f);
                    frameLayoutLJIILLIIL.setZ(3.0f);
                    LJIIZILJ().addView(frameLayoutLJIILLIIL, LJIILL());
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(600L);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(viewFindViewWithTag2, (Property<View, Float>) View.X, viewFindViewWithTag2.getX(), fLJIIJ), ObjectAnimator.ofFloat(viewFindViewWithTag, (Property<View, Float>) View.X, viewFindViewWithTag.getX(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) + fLJIIJ), ObjectAnimator.ofFloat(viewFindViewWithTag, (Property<View, Float>) View.ALPHA, viewFindViewWithTag.getAlpha(), 0.0f), ObjectAnimator.ofFloat(frameLayoutLJIILLIIL, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(frameLayoutLJIILLIIL, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f));
                    animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.1864
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator2) {
                            String str;
                            C185H c185h2;
                            this.LL.LJIIJJI(listLL2);
                            TuxTextView tuxTextViewLJJIFFI = this.LL.LJJIFFI();
                            C185K c185k = this.LL.LIZLLL;
                            if (c185k == null || (c185h2 = c185k.LIZIZ) == null || (str = c185h2.LIZIZ) == null) {
                                str = "";
                            }
                            tuxTextViewLJJIFFI.setText(str);
                            this.LL.LJI = null;
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            String str;
                            C185H c185h2;
                            AnonymousClass1863 anonymousClass1863 = this.LL;
                            FrameLayout frameLayout = frameLayoutLJIILLIIL;
                            View view = viewFindViewWithTag2;
                            View view2 = viewFindViewWithTag;
                            anonymousClass1863.getClass();
                            C786410Ut5.T4(view2, 0.0f);
                            C786410Ut5.LJJJZ(view2, anonymousClass1863.LJIIZILJ());
                            frameLayout.setTag("sea_flash_sale_price_avatar_first");
                            C786410Ut5.T4(frameLayout, 1.0f);
                            C786410Ut5.Ob(frameLayout, 1.0f);
                            C786410Ut5.pc(frameLayout, 1.0f);
                            C786410Ut5.Fd(frameLayout, AnonymousClass1863.LJIIJ(0));
                            C786410Ut5.Ld(frameLayout, 0.0f);
                            frameLayout.setZ(2.0f);
                            view.setTag("sea_flash_sale_price_avatar_second");
                            C786410Ut5.T4(view, 1.0f);
                            C786410Ut5.Ob(view, 1.0f);
                            C786410Ut5.pc(view, 1.0f);
                            C786410Ut5.Fd(view, AnonymousClass1863.LJIIJ(1));
                            C786410Ut5.Ld(view, 0.0f);
                            view.setZ(1.0f);
                            anonymousClass1863.LJIIZILJ().bringChildToFront(view);
                            anonymousClass1863.LJIIZILJ().bringChildToFront(frameLayout);
                            anonymousClass1863.LJIIZILJ().invalidate();
                            TuxTextView tuxTextViewLJJIFFI = this.LL.LJJIFFI();
                            C185K c185k = this.LL.LIZLLL;
                            if (c185k == null || (c185h2 = c185k.LIZIZ) == null || (str = c185h2.LIZIZ) == null) {
                                str = "";
                            }
                            tuxTextViewLJJIFFI.setText(str);
                            this.LL.LJI = null;
                        }
                    });
                    animatorSet.start();
                    this.LJI = animatorSet;
                }
            }
        }
        if (c185h.LIZJ.size() < 2) {
            i3 = 0;
        }
        FrameLayout frameLayoutLJIIZILJ = LJIIZILJ();
        if (i3 > 0) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZ(i, frameLayoutLJIIZILJ);
        LJJIJ(i3);
        if (this.LJI != null) {
            return;
        }
        LJJIFFI().setText(c185h.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(X.C185K r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1863.LJJIII(X.185K, boolean, boolean, boolean):void");
    }
}
