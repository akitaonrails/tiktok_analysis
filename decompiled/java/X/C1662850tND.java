package X;

import Y.ALAdapterS20S0100000_25;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tND, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662850tND extends C1662870tNF {
    public static final int LLLLJ = (int) C11VU.LIZIZ(2.0f, C2219091BtD.LIZ());
    public static final int LLLLJI = (int) C11VU.LIZIZ(3.0f, C2219091BtD.LIZ());
    public final int LLLIIL;
    public final int LLLIILIL;
    public final boolean LLLIL;
    public final boolean LLLILZ;
    public final boolean LLLILZJ;
    public final int LLLILZLLLI;
    public final int LLLIZZ;
    public final Integer LLLJ;
    public final C2252321DDq LLLJIL;
    public C19670811xi LLLJL;
    public ImageView LLLL;
    public FrameLayout LLLLII;
    public TuxTextView LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final Animation LLLLIILL;
    public final Animation LLLLIILLL;
    public final C01GW LLLLIL;
    public boolean LLLLILI;

    @Override // X.C1662870tNF
    public int LJ() {
        return R.layout.fv0;
    }

    public final void setShowDownloadIcon(boolean z) {
    }

    private final ImageView getDownloadImgCenterOpt() {
        return (ImageView) this.LLLLIIL.getValue();
    }

    private final ViewStub getLibraryLayoutStub() {
        return (ViewStub) this.LLLLIL.getValue();
    }

    public final void LJIILLIIL() {
        if (this.LLLLIILL.hasStarted()) {
            ImageView imageView = this.LLLL;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(this.LLLIIL);
            ImageView imageView2 = this.LLLL;
            if (imageView2 == null) {
                imageView2 = null;
            }
            C786410Ut5.LJLLLLLL(4, imageView2);
            ImageView imageView3 = this.LLLL;
            (imageView3 != null ? imageView3 : null).clearAnimation();
        }
    }

    public final void LJIJ() {
        if (this.LLLILZJ) {
            LJIIIZ(false);
        }
        ImageView imageView = this.LLLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJLLLLLL(8, imageView);
        if (!getEnableLoadingUnify() || !this.LLLLILI) {
            C19670811xi c19670811xi = this.LLLJL;
            C786410Ut5.G1(c19670811xi != null ? c19670811xi : null, 4);
            return;
        }
        C2281551ESb c2281551ESb = C2281551ESb.LIZIZ;
        if (c2281551ESb.LIZ()) {
            C19670811xi c19670811xi2 = this.LLLJL;
            if (c19670811xi2 == null) {
                c19670811xi2 = null;
            }
            if (c19670811xi2.getVisibility() != 0) {
                return;
            }
        }
        if (c2281551ESb.LJJ()) {
            C19746412Nq c19746412Nq = new C19746412Nq("scaleX", new C0HIW(1.0f, 1.8f));
            C19746412Nq c19746412Nq2 = new C19746412Nq("scaleY", new C0HIX(1.0f, 1.8f));
            Context context = getContext();
            C19670811xi c19670811xi3 = this.LLLJL;
            C21647019ng c21647019ng = new C21647019ng(context, c19670811xi3 != null ? c19670811xi3 : null, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(987.0f), new C1342130l1v(56.0f)), C1697810uHb.LJIIJJI(c19746412Nq, c19746412Nq2)), false);
            InterfaceC21641019mi interfaceC21641019mi = new InterfaceC21641019mi() { // from class: X.0tNG
                @Override // X.InterfaceC21641019mi
                public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                }

                @Override // X.InterfaceC21641019mi
                public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                    C19670811xi c19670811xi4 = this.LIZ.LLLJL;
                    C19670811xi c19670811xi5 = null;
                    if (c19670811xi4 == null) {
                        c19670811xi4 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi4);
                    c19670811xi4.setScaleX(1.0f);
                    C19670811xi c19670811xi6 = this.LIZ.LLLJL;
                    if (c19670811xi6 == null) {
                        c19670811xi6 = null;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi6);
                    c19670811xi6.setScaleY(1.0f);
                    C19670811xi c19670811xi7 = this.LIZ.LLLJL;
                    if (c19670811xi7 != null) {
                        c19670811xi5 = c19670811xi7;
                    }
                    C786410Ut5.G1(c19670811xi5, 8);
                }
            };
            c21647019ng.LIZJ("scaleX", interfaceC21641019mi);
            c21647019ng.LIZJ("scaleY", interfaceC21641019mi);
            c21647019ng.LJI(true);
            return;
        }
        C19670811xi c19670811xi4 = this.LLLJL;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = (c19670811xi4 != null ? c19670811xi4 : null).animate();
        if (viewPropertyAnimatorAnimate != null) {
            viewPropertyAnimatorAnimate.scaleX(1.8f);
            viewPropertyAnimatorAnimate.scaleY(1.8f);
            viewPropertyAnimatorAnimate.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
            viewPropertyAnimatorAnimate.setDuration(200L);
            viewPropertyAnimatorAnimate.setListener(new ALAdapterS20S0100000_25(this, 7));
            viewPropertyAnimatorAnimate.start();
        }
    }

    public final void LJIJI() {
        ImageView imageView = this.LLLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(8, imageView);
        C19670811xi c19670811xi = this.LLLJL;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        C786410Ut5.G1(c19670811xi, 0);
        this.LLLJIL.setValue(0);
        C19670811xi c19670811xi2 = this.LLLJL;
        (c19670811xi2 != null ? c19670811xi2 : null).setProgress(0);
    }

    public final void LJIJJ() {
        ImageView imageView = this.LLLL;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJLLLLLL(4, imageView);
        if (this.LLLILZJ) {
            LJIIIZ(false);
        }
        C19670811xi c19670811xi = this.LLLJL;
        C786410Ut5.G1(c19670811xi != null ? c19670811xi : null, 4);
    }

    public final boolean getEnableLoadingUnify() {
        return C2281551ESb.LIZIZ.LIZIZ();
    }

    private final ImageView getDownloadImgCenter() {
        ViewStub libraryLayoutStub;
        if (!getEnableSimplifyLayout()) {
            return null;
        }
        ViewStub libraryLayoutStub2 = getLibraryLayoutStub();
        if (libraryLayoutStub2 != null && libraryLayoutStub2.getParent() != null && (libraryLayoutStub = getLibraryLayoutStub()) != null) {
            C786410Ut5.LJLLLL(libraryLayoutStub);
        }
        return getDownloadImgCenterOpt();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662850tND.LJIILL():void");
    }

    public final boolean getEnableSimplifyLayout() {
        return getSimpleLayoutMode();
    }

    public final int getCircleLoadingSizeHeight() {
        return this.LLLIZZ;
    }

    public final int getCircleLoadingSizeWidth() {
        return this.LLLILZLLLI;
    }

    public final int getDownloadIconRes() {
        return this.LLLIIL;
    }

    public final boolean getEnableDotView() {
        return this.LLLIL;
    }

    public final FrameLayout getGradientNameBgFl() {
        return this.LLLLII;
    }

    public final TuxTextView getGradientNameContentTv() {
        return this.LLLLIIIILLL;
    }

    public final int getLoadingIconRes() {
        return this.LLLIILIL;
    }

    public final boolean getShouldShowDownloadImg() {
        return this.LLLILZ;
    }

    public final boolean getUseCenterLoadingImg() {
        return this.LLLILZJ;
    }

    @Override // X.C1662870tNF
    public View LIZLLL(Context context) {
        FrameLayout.LayoutParams layoutParams;
        if (!getEnableSimplifyLayout()) {
            return super.LIZLLL(context);
        }
        View viewLJIIJJI = LJIIJJI(context);
        if (this.LLJJJJ) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
        }
        C786410Ut5.W5(viewLJIIJJI, layoutParams);
        return viewLJIIJJI;
    }

    @Override // X.C1662870tNF
    public View LJFF(Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C1636840shG c1636840shG = new C1636840shG(context);
        c1636840shG.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c1636840shG.setHorizontalFadingEdgeEnabled(true);
        c1636840shG.setMaxEms(4);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1636840shG);
        c1636840shG.setLayoutParams(layoutParams);
        c1636840shG.setGravity(17);
        if (this.LLJJL) {
            c1636840shG.setSingleLine();
            c1636840shG.setEllipsize(TextUtils.TruncateAt.END);
        }
        return c1636840shG;
    }

    public final void LJIIIZ(boolean z) {
        ImageView downloadImgCenter;
        ImageView downloadImgCenter2;
        if (z) {
            Animation animation = this.LLLLIILLL;
            if ((animation == null || !animation.hasStarted()) && (downloadImgCenter2 = getDownloadImgCenter()) != null) {
                downloadImgCenter2.clearAnimation();
                C786410Ut5.LJLLLLLL(0, downloadImgCenter2);
                downloadImgCenter2.startAnimation(this.LLLLIILLL);
                return;
            }
            return;
        }
        Animation animation2 = this.LLLLIILLL;
        if ((animation2 == null || animation2.hasStarted()) && (downloadImgCenter = getDownloadImgCenter()) != null) {
            C786410Ut5.LJLLLLLL(4, downloadImgCenter);
            downloadImgCenter.clearAnimation();
        }
    }

    public void LJIIJ(FrameLayout frameLayout) {
        C1324800kZy c1324800kZy = new C1324800kZy(frameLayout.getContext());
        c1324800kZy.setId(R.id.gx9);
        c1324800kZy.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C786410Ut5.o7(c1324800kZy, layoutParams);
        frameLayout.addView(c1324800kZy);
    }

    public final View LJIIJJI(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.gvn);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -2));
        LJIIJ(frameLayout);
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.view_stub_library_layout);
        C786410Ut5.Y5(viewStub, new FrameLayout.LayoutParams(-1, -2));
        viewStub.setLayoutResource(R.layout.fvo);
        frameLayout.addView(viewStub);
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.khf);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        int iLIZ = (int) C11VU.LIZ(16.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ);
        layoutParams.gravity = 8388693;
        int iLIZ2 = (int) C11VU.LIZ(1.0f);
        layoutParams.setMargins(iLIZ2, iLIZ2, iLIZ2, iLIZ2);
        C786410Ut5.c6(imageView, layoutParams);
        int iIntValue = 0;
        C786410Ut5.LJZI(0, imageView);
        imageView.setImageDrawable(imageView.getResources().getDrawable(R.drawable.a_y));
        frameLayout.addView(imageView);
        AttributeSet attributeSet = null;
        C19670811xi c19670811xi = new C19670811xi(context, null);
        c19670811xi.setId(R.id.lno);
        int iLIZ3 = (int) C11VU.LIZ(16.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZ3, iLIZ3);
        layoutParams2.gravity = 8388693;
        int iLIZ4 = (int) C11VU.LIZ(1.0f);
        layoutParams2.setMargins(iLIZ4, iLIZ4, iLIZ4, iLIZ4);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19670811xi);
        c19670811xi.setLayoutParams(layoutParams2);
        C786410Ut5.G1(c19670811xi, 8);
        c19670811xi.setBackground(c19670811xi.getResources().getDrawable(R.drawable.a_z));
        c19670811xi.setCircleRadius(C11VU.LIZ(5.0f));
        frameLayout.addView(c19670811xi);
        if (getEnableLoadingUnify()) {
            C19671011xk c19671011xk = new C19671011xk(context, null);
            c19671011xk.setId(R.id.lns);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C11VU.LIZ(this.LLLILZLLLI), (int) C11VU.LIZ(this.LLLIZZ));
            layoutParams3.gravity = 17;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19671011xk);
            c19671011xk.setLayoutParams(layoutParams3);
            C786410Ut5.I1(c19671011xk, 8);
            c19671011xk.setCircleRadius((c19671011xk.getLayoutParams().width / 2) - C11VU.LIZ(8.0f));
            c19671011xk.setViewBorderRadius(LJIILJJIL(context));
            frameLayout.addView(c19671011xk);
        }
        int iGenerateViewId = FrameLayout.generateViewId();
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        C786410Ut5.LJZ(8, frameLayout2);
        this.LLLLII = frameLayout2;
        frameLayout2.setId(iGenerateViewId);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) C11VU.LIZ(30.0f));
        layoutParams4.gravity = 80;
        C786410Ut5.a6(frameLayout2, layoutParams4);
        frameLayout.addView(frameLayout2);
        int iGenerateViewId2 = FrameLayout.generateViewId();
        TuxTextView tuxTextView = new TuxTextView(frameLayout.getContext(), attributeSet, 6, iIntValue);
        C786410Ut5.LLLLZLL(tuxTextView, 8);
        tuxTextView.setTuxFont(82);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, tuxTextView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setGravity(8388627);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.LLLLIIIILLL = tuxTextView;
        tuxTextView.setId(iGenerateViewId2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 8388627;
        layoutParams5.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams5.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        C786410Ut5.R6(tuxTextView, layoutParams5);
        frameLayout2.addView(tuxTextView);
        return frameLayout;
    }

    public final float LJIILJJIL(Context context) {
        if (this.LLLJ != null) {
            try {
                return context.getResources().getDimension(this.LLLJ.intValue());
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "EffectResourceStickerView: resource not found!");
                return LJIILIIL(8.0f, context);
            }
        }
        return LJIILIIL(8.0f, context);
    }

    public final void LJIIZILJ(int i) {
        if (this.LLLILZJ) {
            LJIIIZ(true);
            return;
        }
        ImageView imageView = this.LLLL;
        C19670811xi c19670811xi = null;
        if (imageView == null) {
            imageView = null;
        }
        C786410Ut5.LJZI(8, imageView);
        C19670811xi c19670811xi2 = this.LLLJL;
        if (c19670811xi2 == null) {
            c19670811xi2 = null;
        }
        if (c19670811xi2.getVisibility() != 0) {
            C19670811xi c19670811xi3 = this.LLLJL;
            if (c19670811xi3 == null) {
                c19670811xi3 = null;
            }
            C786410Ut5.G1(c19670811xi3, 0);
        }
        if (i > ((Number) this.LLLJIL.getValue()).intValue()) {
            this.LLLJIL.setValue(Integer.valueOf(i));
            C19670811xi c19670811xi4 = this.LLLJL;
            if (c19670811xi4 != null) {
                c19670811xi = c19670811xi4;
            }
            c19670811xi.setProgress(i);
        }
    }

    public final void setFailureImageScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        getImageView().getHierarchy().LJIJJLI(getPlaceHolderDrawableCached(), interfaceC1320380kSq);
    }

    public final void setGradientBgDrawable(Drawable drawable) {
        FrameLayout frameLayout = this.LLLLII;
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
            frameLayout.setBackground(drawable);
        }
    }

    public final void setGradientBgName(String str) {
        TuxTextView tuxTextView = this.LLLLIIIILLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(str);
        }
    }

    public final void setGradientNameBgFl(FrameLayout frameLayout) {
        this.LLLLII = frameLayout;
    }

    public final void setGradientNameContentTv(TuxTextView tuxTextView) {
        this.LLLLIIIILLL = tuxTextView;
    }

    public final void setPlaceHolderScaleType(InterfaceC1320380kSq interfaceC1320380kSq) {
        getImageView().getHierarchy().LJJIFFI(getPlaceHolderDrawableCached(), interfaceC1320380kSq);
    }

    public static float LJIILIIL(float f, Context context) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public final void LJIIL(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            LJIIZILJ(i2);
                            return;
                        }
                        return;
                    }
                    LJIJ();
                    return;
                }
                LJIJJ();
                return;
            }
            LJIJI();
            return;
        }
        LJIJ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1662850tND(Context context, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, int i9, int i10, int i11, int i12, boolean z3, boolean z4, int i13, int i14, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, int i19, int i20, Integer num, int i21, int i22, int i23) {
        int i24 = i21;
        boolean z13 = z5;
        int i25 = i20;
        boolean z14 = z8;
        int i26 = i8;
        int i27 = i7;
        boolean z15 = z7;
        int i28 = i19;
        boolean z16 = z6;
        boolean z17 = z10;
        Integer num2 = num;
        boolean z18 = z11;
        int i29 = i5;
        boolean z19 = z9;
        int i30 = (i22 & 32) != 0 ? 0 : i4;
        i29 = (i22 & 64) != 0 ? 0 : i29;
        i27 = (i22 & 512) != 0 ? 0 : i27;
        i26 = (i22 & 1024) != 0 ? 0 : i26;
        z13 = (33554432 & i22) != 0 ? true : z13;
        z16 = (67108864 & i22) != 0 ? false : z16;
        z15 = (134217728 & i22) != 0 ? true : z15;
        z14 = (268435456 & i22) != 0 ? false : z14;
        z19 = (536870912 & i22) != 0 ? false : z19;
        z17 = (1073741824 & i22) != 0 ? false : z17;
        z18 = (i22 & Integer.MIN_VALUE) != 0 ? false : z18;
        i28 = (i23 & 4) != 0 ? 48 : i28;
        i25 = (i23 & 8) != 0 ? 48 : i25;
        num2 = (i23 & 16) != 0 ? null : num2;
        super(context, z, i, i2, i3, i30, i29, i6, z2, i27, i26, i9, i10, i11, i12, R.color.jb, z3, z4, i13, i14, i15, 2, i16, z13, z16, false, (i23 & 32) != 0 ? 0 : i24, 0, z19, z17, z18, i, -1979711488, 12);
        this.LLLIIL = i17;
        this.LLLIILIL = i18;
        this.LLLIL = z13;
        this.LLLILZ = z15;
        this.LLLILZJ = z14;
        this.LLLILZLLLI = i28;
        this.LLLIZZ = i25;
        this.LLLJ = num2;
        this.LLLJIL = C1BNE.LIZ(0);
        this.LLLLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 874));
        this.LLLLIILL = AnimationUtils.loadAnimation(context, R.anim.gi);
        this.LLLLIILLL = z14 ? AnimationUtils.loadAnimation(context, R.anim.gi) : null;
        this.LLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 875));
        LJIILL();
    }
}
