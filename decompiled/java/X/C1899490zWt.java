package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS137S0110000_19;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899490zWt extends ViewOnTouchListenerC1899510zWv {
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public View LLJLL;
    public TextView LLJLLIL;
    public final C01GW LLJLLL;
    public View LLJZ;
    public TextView LLJZIJLIL;
    public View LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public final float LLLIL;
    public final float LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public int LLLIZZ;
    public C1899650zX9 LLLJ;
    public boolean LLLJIL;
    public final C01GW LLLJL;
    public float LLLL;
    public float LLLLII;
    public float LLLLIIIILLL;
    public float LLLLIIL;
    public long LLLLIILL;
    public final int LLLLIILLL;
    public InterfaceC1898910zVx LLLLIL;

    public final void LJIJJ() {
        setCanDrag(true);
        this.LLJLILLLLZIIL = false;
        C01U6.LIZIZ(new AwS572S0100000_28(this, 1024));
        C786410Ut5.LLLLLIL(getShrinkLottieView(), 8);
        C786410Ut5.LLZZLLIL(getSmallSmartImageView(), 8);
        C786410Ut5.LLLLZLL(getPendantBottomTextView(), 8);
        if (this.LLLILZJ && this.LLLIIL) {
            LJIL();
            setCloseViewStatus(!this.LLLII);
            LJIILLIIL(1);
            return;
        }
        C786410Ut5.LLZZLLIL(getSmartImageView(), 0);
        C786410Ut5.LLLLLIL(getNormalLottieView(), 8);
        C01U6.LIZIZ(new AwS572S0100000_28(this, 1025));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LJII(this.LLLF, getSmartImageView(), new InterfaceC1910160zo6() { // from class: X.0zXE
                @Override // X.InterfaceC1910160zo6
                public final void onComplete() {
                    C1899490zWt c1899490zWt = this.LIZ;
                    c1899490zWt.LLLIIIIL = true;
                    c1899490zWt.setCloseViewStatus(!c1899490zWt.LLLII);
                    this.LIZ.getClass();
                    C1899490zWt.LJIILLIIL(1);
                }

                @Override // X.InterfaceC1910160zo6
                public final void onFailed(Throwable th) {
                    this.LIZ.LLLIIIIL = false;
                    C1899490zWt.LJIILLIIL(0);
                }
            });
        }
    }

    private final TuxIconView getArrowView() {
        return (TuxIconView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LIZJ() {
        this.LLLJIL = this.LLJLILLLLZIIL;
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final Float LJIIIIZZ() {
        if (this.LLJLILLLLZIIL && C0BIV.LIZ()) {
            return Float.valueOf(LJIIL(C1899620zX6.LIZIZ(getContext())));
        }
        return null;
    }

    public final void LJIJJLI() {
        C01U6.LIZIZ(new AwS563S0100000_19(this, 3290));
    }

    public final ImageView getCloseView() {
        return (ImageView) this.LLJJJJLIIL.getValue();
    }

    public final FrameLayout getImageLayout() {
        return (FrameLayout) this.LLJL.getValue();
    }

    public final View getLongBubbleLayout() {
        return (View) this.LLJLLL.getValue();
    }

    public final C1302030jzF getNormalLottieView() {
        return (C1302030jzF) this.LLJJJ.getValue();
    }

    public final View getPendantAssetAnchorView() {
        return (View) C01U6.LJ(new AwS572S0100000_28(this, 1013), null);
    }

    public final TuxTextView getPendantBottomTextView() {
        return (TuxTextView) this.LLJJJJ.getValue();
    }

    public final FrameLayout getPendantLayout() {
        return (FrameLayout) this.LLJJL.getValue();
    }

    public final C1302030jzF getShrinkLottieView() {
        return (C1302030jzF) this.LLJJJIL.getValue();
    }

    public final FrameLayout getSmallImageLayout() {
        return (FrameLayout) this.LLJLIL.getValue();
    }

    public final C1322110kVd getSmallSmartImageView() {
        return (C1322110kVd) this.LLJJJJJIL.getValue();
    }

    public final C1322110kVd getSmartImageView() {
        return (C1322110kVd) this.LLJJIJIL.getValue();
    }

    public final C2261111Den getTransitionAnimator() {
        return (C2261111Den) this.LLLJL.getValue();
    }

    public final void LJIL() {
        if (getVisibility() == 0) {
            this.LLLIIL = true;
            C786410Ut5.LLZZLLIL(getSmartImageView(), 8);
            C786410Ut5.LLZZLLIL(getSmallSmartImageView(), 8);
            C786410Ut5.LLLLLIL(getShrinkLottieView(), 8);
            C786410Ut5.LLLLLIL(getNormalLottieView(), 0);
            if (this.LLLFFI.length() > 0) {
                C786410Ut5.LLLLZLL(getPendantBottomTextView(), 0);
                getPendantBottomTextView().setText(this.LLLFFI);
                TuxTextView pendantBottomTextView = getPendantBottomTextView();
                C0SVC c0svc = C0SVC.LIZ;
                pendantBottomTextView.setTextColor(C0SVC.LIZIZ(c0svc, this.LLLI));
                TuxTextView pendantBottomTextView2 = getPendantBottomTextView();
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(C0SVC.LIZIZ(c0svc, this.LLLFZ));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(90));
                pendantBottomTextView2.setBackground(c384050F3z.LIZ(getContext()));
                C01U6.LIZLLL(new AwS563S0100000_19(this, 3291));
            }
            C01U6.LIZIZ(new AwS572S0100000_28(this, 1025));
            C1899450zWp.LIZIZ(getNormalLottieView(), Integer.MAX_VALUE);
            C786410Ut5.LJZI(this.LLLII ? 8 : 0, getCloseView());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C01U6.LIZIZ(new AwS572S0100000_28(this, 1024));
    }

    public final int getNormalPendantSubType() {
        return this.LLLIZZ;
    }

    public final boolean getStaticPendantIsFold() {
        return this.LLJLILLLLZIIL;
    }

    public final int getSubType() {
        return this.LLLIZZ;
    }

    public final InterfaceC1898910zVx getSubViewListener() {
        return this.LLLLIL;
    }

    public C1899490zWt(Context context) {
        int i;
        super(context, null, 0);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1022));
        this.LLJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1006));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1016));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1007));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1020));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1021));
        this.LLJJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1008));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1019));
        this.LLJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1027));
        this.LLJLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1018));
        this.LLJLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1005));
        this.LLLF = "";
        this.LLLFF = "";
        this.LLLFFI = "";
        this.LLLFZ = "#E75300";
        this.LLLI = "#FFFFFF";
        this.LLLIIII = true;
        this.LLLIL = 36.0f;
        this.LLLILZ = 92.0f;
        this.LLLIZZ = 1;
        this.LLLJL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1023));
        if (!C293530Bex.LIZ() && !C0BIU.LIZ()) {
            i = R.layout.fwq;
        } else {
            i = R.layout.fwr;
        }
        C786410Ut5.Td(C786410Ut5.ne(context), i, this, true);
        if (C1899620zX6.LIZ()) {
            C786410Ut5.Fb(getArrowView(), 180.0f);
        }
        this.LLLLIILLL = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static boolean LJIILJJIL(NormalPendant normalPendant) {
        String str;
        String str2;
        String str3 = null;
        if (normalPendant != null) {
            str3 = normalPendant.lottieFileZip;
        }
        if (str3 == null || str3.length() == 0 || normalPendant == null || (str = normalPendant.lottieFileMd5) == null || str.length() == 0 || normalPendant == null || (str2 = normalPendant.lottieShrinkName) == null || str2.length() == 0) {
            return false;
        }
        return true;
    }

    public static void LJIILLIIL(int i) {
        int iIntValue;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1893670zNV c1893670zNVLJ = C2178808gE.LIZ().LJ(1);
        if (c1893670zNVLJ != null) {
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            int i2 = c1893670zNVLJ.LIZ;
            Integer num = c1893670zNVLJ.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c1893680zNW.getClass();
            C1893680zNW.LIZ(i, i2, iIntValue, 1, "");
        }
    }

    @Override // X.ViewOnTouchListenerC1899510zWv
    public final void LIZLLL(MotionEvent motionEvent) {
        C01U6.LIZIZ(new AwS429S0200000_28(this, motionEvent, 141));
    }

    public final float LJIIL(boolean z) {
        return ((Number) C01U6.LJ(new AwS137S0110000_19(this, z, 17), Float.valueOf(0.0f))).floatValue();
    }

    public final void LJIIZILJ(float f) {
        int i;
        int iLJIILJJIL = C12ES.LJIILJJIL(C12ES.LJIIJJI(getContext()) + 0.0f, getContext());
        if (C1899480zWs.LIZ(getContext())) {
            i = 80;
        } else {
            i = 70;
        }
        int i2 = iLJIILJJIL + i;
        ViewGroup.LayoutParams layoutParams = getPendantLayout().getLayoutParams();
        layoutParams.width = (int) C12ES.LIZJ(f, getContext());
        C786410Ut5.a6(getPendantLayout(), layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) C12ES.LIZJ(i2, getContext());
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
    }

    public final void LJIJI(final Function1<? super Boolean, Unit> function1) {
        this.LLLIZZ = 1;
        this.LLLIIII = true;
        C786410Ut5.LLZZLLIL(getSmartImageView(), 0);
        C786410Ut5.LLZZLLIL(getSmallSmartImageView(), 8);
        C786410Ut5.LLLLLIL(getNormalLottieView(), 8);
        C786410Ut5.LLLLLIL(getShrinkLottieView(), 8);
        C786410Ut5.LLLLZLL(getPendantBottomTextView(), 8);
        C01U6.LIZIZ(new AwS572S0100000_28(this, 1025));
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LJII(this.LLLF, getSmartImageView(), new InterfaceC1910160zo6() { // from class: X.0zWu
                @Override // X.InterfaceC1910160zo6
                public final void onComplete() {
                    C1899490zWt c1899490zWt = this.LIZ;
                    c1899490zWt.LLLIIIIL = true;
                    C786410Ut5.LJZI(!this.LIZ.LLLII ? 0 : 8, c1899490zWt.getCloseView());
                    this.LIZ.LJIJJLI();
                    if (this.LIZ.LLLFFI.length() > 0) {
                        C786410Ut5.LLLLZLL(this.LIZ.getPendantBottomTextView(), 0);
                        this.LIZ.getPendantBottomTextView().setText(this.LIZ.LLLFFI);
                        TuxTextView pendantBottomTextView = this.LIZ.getPendantBottomTextView();
                        C0SVC c0svc = C0SVC.LIZ;
                        pendantBottomTextView.setTextColor(C0SVC.LIZIZ(c0svc, this.LIZ.LLLI));
                        TuxTextView pendantBottomTextView2 = this.LIZ.getPendantBottomTextView();
                        C1899490zWt c1899490zWt2 = this.LIZ;
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZ = Integer.valueOf(C0SVC.LIZIZ(c0svc, c1899490zWt2.LLLFZ));
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                        pendantBottomTextView2.setBackground(c384050F3z.LIZ(this.LIZ.getContext()));
                        C1899490zWt c1899490zWt3 = this.LIZ;
                        c1899490zWt3.getClass();
                        C01U6.LIZLLL(new AwS563S0100000_19(c1899490zWt3, 3291));
                    }
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.TRUE);
                    }
                    this.LIZ.getClass();
                    C1899490zWt.LJIILLIIL(1);
                }

                @Override // X.InterfaceC1910160zo6
                public final void onFailed(Throwable th) {
                    this.LIZ.LLLIIIIL = false;
                    Function1<Boolean, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("block_reason", "resource_load_fail"));
                    c1894320zOY.getClass();
                    C1894320zOY.LJIILIIL(1, mapLJIIJ);
                    this.LIZ.getClass();
                    C1899490zWt.LJIILLIIL(0);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1 != 3) goto L13;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            boolean r0 = X.C0BIU.LIZ()
            r7 = r13
            r6 = r12
            if (r0 != 0) goto Le
            boolean r0 = X.C293530Bex.LIZ()
            if (r0 == 0) goto L26
        Le:
            float r4 = r7.getX()
            float r5 = r7.getY()
            int r1 = r7.getAction()
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L60
            if (r1 == r2) goto L5d
            r0 = 2
            if (r1 == r0) goto L2b
            r0 = 3
            if (r1 == r0) goto L5d
        L26:
            boolean r0 = super.onInterceptTouchEvent(r7)
            return r0
        L2b:
            float r0 = r6.LLLL
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            float r0 = r6.LLLLII
            float r5 = r5 - r0
            float r3 = java.lang.Math.abs(r5)
            int r0 = r6.LLLLIILLL
            float r1 = (float) r0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L44
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L26
        L44:
            boolean r0 = r6.getCanDrag()
            if (r0 == 0) goto L5c
            boolean r0 = r6.LLJJIJIIJIL
            if (r0 != 0) goto L5c
            float r10 = r6.LLLLIIIILLL
            float r11 = r6.LLLLIIL
            long r8 = r6.LLLLIILL
            X.0zX3 r5 = new X.0zX3
            r5.<init>(r6, r7, r8, r10, r11)
            X.C01U6.LIZIZ(r5)
        L5c:
            return r2
        L5d:
            r6.LLJJIII = r3
            return r3
        L60:
            r6.LLLL = r4
            r6.LLLLII = r5
            float r0 = r7.getRawX()
            r6.LLLLIIIILLL = r0
            float r0 = r7.getRawY()
            r6.LLLLIIL = r0
            long r0 = java.lang.System.currentTimeMillis()
            r6.LLLLIILL = r0
            boolean r0 = r6.LLJLILLLLZIIL
            r6.LLLJIL = r0
            if (r0 == 0) goto L8b
            boolean r0 = X.C0BIV.LIZ()
            if (r0 == 0) goto L8b
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L8b
            r0.requestDisallowInterceptTouchEvent(r2)
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1899490zWt.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCloseViewStatus(boolean z) {
        int i;
        ImageView closeView = getCloseView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZI(i, closeView);
    }

    public final void setLottieStatus(boolean z) {
        this.LLLILZJ = z;
    }

    public final void setShrinkLottieStatus(boolean z) {
        this.LLLILZLLLI = z;
    }

    public final void setSubType(int i) {
        this.LLLIZZ = i;
    }

    public final void setSubViewListener(InterfaceC1898910zVx interfaceC1898910zVx) {
        this.LLLLIL = interfaceC1898910zVx;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: Exception -> 0x004e, PHI: r2
      0x001a: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x0015, B:12:0x0018] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x004e, blocks: (B:9:0x0013, B:13:0x001a, B:20:0x0026, B:23:0x0037, B:25:0x0044, B:27:0x0048, B:17:0x0021), top: B:34:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[PHI: r2
      0x001e: PHI (r2v1 java.lang.String) = (r2v5 java.lang.String), (r2v6 java.lang.String) binds: [B:14:0x001c, B:12:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[Catch: Exception -> 0x004e, PHI: r1 r2
      0x0021: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:16:0x001f, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0021: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:16:0x001f, B:14:0x001c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x004e, blocks: (B:9:0x0013, B:13:0x001a, B:20:0x0026, B:23:0x0037, B:25:0x0044, B:27:0x0048, B:17:0x0021), top: B:34:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(com.bytedance.touchpoint.api.model.NormalPendant r7, final kotlin.jvm.internal.AwS394S0200000_28 r8) {
        /*
            r6 = this;
            boolean r0 = LJIILJJIL(r7)
            if (r0 != 0) goto Le
            if (r8 == 0) goto Ld
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.invoke(r0)
        Ld:
            return
        Le:
            r5 = 0
            java.lang.String r4 = ""
            if (r7 == 0) goto L17
            java.lang.String r2 = r7.activityId     // Catch: java.lang.Exception -> L4e
            if (r2 != 0) goto L1a
        L17:
            r2 = r4
            if (r7 == 0) goto L1e
        L1a:
            java.lang.String r1 = r7.lottieFileMd5     // Catch: java.lang.Exception -> L4e
            if (r1 != 0) goto L21
        L1e:
            r1 = r4
            if (r7 == 0) goto L26
        L21:
            java.lang.String r0 = r7.lottieShrinkName     // Catch: java.lang.Exception -> L4e
            if (r0 == 0) goto L26
            r4 = r0
        L26:
            X.0zXr r0 = new X.0zXr     // Catch: java.lang.Exception -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L4e
            X.0VSP r3 = r0.LIZJ(r2, r1, r4)     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = r0.LIZIZ(r2, r1)     // Catch: java.lang.Exception -> L4e
            if (r3 == 0) goto L44
            if (r2 == 0) goto L44
            X.0jzF r1 = r6.getShrinkLottieView()     // Catch: java.lang.Exception -> L4e
            X.0zX2 r0 = new X.0zX2     // Catch: java.lang.Exception -> L4e
            r0.<init>()     // Catch: java.lang.Exception -> L4e
            X.C1899450zWp.LIZ(r1, r3, r2, r0, r4)     // Catch: java.lang.Exception -> L4e
            return
        L44:
            r6.LLLIILIL = r5     // Catch: java.lang.Exception -> L4e
            if (r8 == 0) goto L4d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L4e
            r8.invoke(r0)     // Catch: java.lang.Exception -> L4e
        L4d:
            return
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6.LLLIILIL = r5
            if (r8 == 0) goto L5b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.invoke(r0)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1899490zWt.LJIILL(com.bytedance.touchpoint.api.model.NormalPendant, kotlin.jvm.internal.AwS394S0200000_28):void");
    }

    public final void LJIJ(float f, float f2) {
        ViewGroup.LayoutParams layoutParams = getPendantLayout().getLayoutParams();
        layoutParams.height = (int) C12ES.LIZJ(f2, getContext());
        layoutParams.width = (int) C12ES.LIZJ(f, getContext());
        C786410Ut5.a6(getPendantLayout(), layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C01U6.LIZLLL(new C1899690zXD(this, z, i, i2, i3, i4));
    }
}
