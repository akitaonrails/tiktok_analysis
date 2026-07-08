package X;

import Y.ACListenerS130S0200000_28;
import Y.ARunnableS102S0100000_2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.skydoves.balloon.Balloon;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1CyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247861CyW {
    public static final int LJIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LJIJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
    public static final int LJIJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
    public static final int LJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
    public final InterfaceC1860040yVG LIZ;
    public final Function0<C2236841Cgk> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final LifecycleOwner LJ;
    public final Function1<InterfaceC1860040yVG, Unit> LJFF;
    public final Function0<Unit> LJI;
    public final Context LJII;
    public final C19389110tN LJIIIIZZ;
    public final View LJIIIZ;
    public final Balloon LJIIJ;
    public ViewOnAttachStateChangeListenerC2247901Cya LJIIJJI;
    public final LifecycleEventObserver LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public C2247841CyU LJIIZILJ;

    public final void LJ() {
        InterfaceC1859950yV7 textSelector;
        C2236841Cgk c2236841Cgk;
        if (this.LJIILIIL || (textSelector = this.LIZ.getTextSelector()) == null) {
            return;
        }
        if (textSelector.LJII() == textSelector.LJIIIZ()) {
            this.LJIIJ.dismiss();
            C19389110tN c19389110tN = this.LJIIIIZZ;
            c19389110tN.getClass();
            C19389110tN.LIZ(new C19389010tM(c19389110tN));
            InterfaceC1859950yV7 textSelector2 = this.LIZ.getTextSelector();
            if (textSelector2 != null) {
                textSelector2.LIZJ();
            }
            this.LJI.invoke();
            return;
        }
        View rootView = this.LIZ.LJJZZI().getRootView();
        if (rootView == null) {
            return;
        }
        int[] iArr = new int[3];
        textSelector.LJIILJJIL(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        this.LJIIIZ.measure(0, 0);
        int measuredWidth = this.LJIIIZ.getMeasuredWidth();
        int measuredHeight = this.LJIIIZ.getMeasuredHeight();
        C2236841Cgk c2236841CgkInvoke = this.LIZIZ.invoke();
        if (c2236841CgkInvoke != null) {
            int i4 = LJIJI;
            int i5 = c2236841CgkInvoke.LIZ + i4;
            int i6 = c2236841CgkInvoke.LIZJ - i4;
            if (i6 < i5) {
                i6 = i5;
            }
            c2236841Cgk = new C2236841Cgk(i5, c2236841CgkInvoke.LIZIZ, i6, c2236841CgkInvoke.LIZLLL);
        } else {
            View rootView2 = this.LIZ.LJJZZI().getRootView();
            c2236841Cgk = new C2236841Cgk(0, LJIJJ, rootView2.getWidth(), rootView2.getHeight() - LJIJJLI);
        }
        EnumC1982907pj enumC1982907pj = i2 >= c2236841Cgk.LIZIZ + measuredHeight ? EnumC1982907pj.LL : EnumC1982907pj.LLILLJJLI;
        int i7 = c2236841Cgk.LIZLLL - measuredHeight;
        int i8 = LJIL;
        EnumC1982907pj enumC1982907pj2 = i3 <= i7 - i8 ? EnumC1982907pj.LLILLJJLI : EnumC1982907pj.LL;
        if (C2247831CyT.LIZ[this.LJIIZILJ.LIZ.ordinal()] == 1) {
            if (enumC1982907pj == EnumC1982907pj.LL) {
                int iLIZLLL = LIZLLL(i2, measuredHeight, c2236841Cgk);
                int iLIZIZ = LIZIZ(rootView, i, measuredWidth, this.LJIIZILJ, c2236841Cgk);
                C1086760eO2 c1086760eO2 = C1086760eO2.LIZ;
                Balloon balloon = this.LJIIJ;
                c1086760eO2.getClass();
                C1086760eO2.LIZ(balloon, rootView, iLIZIZ, iLIZLLL);
                return;
            }
            if (enumC1982907pj2 == EnumC1982907pj.LLILLJJLI) {
                int iLIZLLL2 = LIZLLL(i3 + i8 + measuredHeight, measuredHeight, c2236841Cgk);
                int iLIZJ = LIZJ(false, textSelector);
                C1086760eO2 c1086760eO22 = C1086760eO2.LIZ;
                Balloon balloon2 = this.LJIIJ;
                c1086760eO22.getClass();
                C1086760eO2.LIZ(balloon2, rootView, iLIZJ, iLIZLLL2);
                return;
            }
            int iLIZLLL3 = LIZLLL(i2 + i8 + measuredHeight, measuredHeight, c2236841Cgk);
            int iLIZIZ2 = LIZIZ(rootView, i, measuredWidth, this.LJIIZILJ, c2236841Cgk);
            C1086760eO2 c1086760eO23 = C1086760eO2.LIZ;
            Balloon balloon3 = this.LJIIJ;
            c1086760eO23.getClass();
            C1086760eO2.LIZ(balloon3, rootView, iLIZIZ2, iLIZLLL3);
            return;
        }
        if (enumC1982907pj2 == EnumC1982907pj.LLILLJJLI) {
            int iLIZLLL4 = LIZLLL(i3 + i8 + measuredHeight, measuredHeight, c2236841Cgk);
            int iLIZIZ3 = LIZIZ(rootView, i, measuredWidth, this.LJIIZILJ, c2236841Cgk);
            C1086760eO2 c1086760eO24 = C1086760eO2.LIZ;
            Balloon balloon4 = this.LJIIJ;
            c1086760eO24.getClass();
            C1086760eO2.LIZ(balloon4, rootView, iLIZIZ3, iLIZLLL4);
            return;
        }
        if (enumC1982907pj == EnumC1982907pj.LL) {
            int iLIZLLL5 = LIZLLL(i2, measuredHeight, c2236841Cgk);
            int iLIZJ2 = LIZJ(true, textSelector);
            C1086760eO2 c1086760eO25 = C1086760eO2.LIZ;
            Balloon balloon5 = this.LJIIJ;
            c1086760eO25.getClass();
            C1086760eO2.LIZ(balloon5, rootView, iLIZJ2, iLIZLLL5);
            return;
        }
        int iLIZLLL6 = LIZLLL(i3 - i8, measuredHeight, c2236841Cgk);
        int iLIZIZ4 = LIZIZ(rootView, i, measuredWidth, this.LJIIZILJ, c2236841Cgk);
        C1086760eO2 c1086760eO26 = C1086760eO2.LIZ;
        Balloon balloon6 = this.LJIIJ;
        c1086760eO26.getClass();
        C1086760eO2.LIZ(balloon6, rootView, iLIZIZ4, iLIZLLL6);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LIZ(boolean r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2247861CyW.LIZ(boolean):java.lang.Integer");
    }

    public final long LJFF(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        long width = this.LJIILL - (iArr[0] + (view.getWidth() / 2));
        long height = this.LJIILLIIL - (iArr[1] + (view.getHeight() / 2));
        return (width * width) + (height * height);
    }

    public final int LIZJ(boolean z, InterfaceC1859950yV7 interfaceC1859950yV7) {
        C2248181Cz2 c2248181Cz2LJIIJJI;
        View rootView = this.LIZ.LJJZZI().getRootView();
        int[] iArr = new int[2];
        rootView.getLocationOnScreen(iArr);
        int width = iArr[0] + (rootView.getWidth() / 2);
        if (z) {
            c2248181Cz2LJIIJJI = interfaceC1859950yV7.LJIIL();
        } else {
            c2248181Cz2LJIIJJI = interfaceC1859950yV7.LJIIJJI();
        }
        if ((c2248181Cz2LJIIJJI instanceof View) && c2248181Cz2LJIIJJI != null && c2248181Cz2LJIIJJI.getWidth() > 0) {
            int[] iArr2 = new int[2];
            c2248181Cz2LJIIJJI.getLocationOnScreen(iArr2);
            return (iArr2[0] + (c2248181Cz2LJIIJJI.getWidth() / 2)) - width;
        }
        Integer numLIZ = LIZ(z);
        if (numLIZ != null) {
            return numLIZ.intValue() - width;
        }
        int[] iArr3 = new int[3];
        interfaceC1859950yV7.LJIILJJIL(iArr3);
        return iArr3[0];
    }

    public static int LIZLLL(int i, int i2, C2236841Cgk c2236841Cgk) {
        int i3 = c2236841Cgk.LIZIZ + i2;
        int i4 = c2236841Cgk.LIZLLL;
        if (i3 <= i4) {
            return C13LZ.LJ(i, i3, i4);
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZIZ(android.view.View r9, int r10, int r11, X.C2247841CyU r12, X.C2236841Cgk r13) {
        /*
            r8 = this;
            r6 = 2
            int[] r5 = new int[r6]
            r9.getLocationOnScreen(r5)
            r3 = 0
            r7 = r5[r3]
            int r0 = r9.getWidth()
            int r0 = r0 / r6
            int r7 = r7 + r0
            X.1CyS r1 = r12.LIZ
            X.1CyS r0 = X.EnumC2247821CyS.NONE
            if (r1 == r0) goto L50
            int r0 = r12.LIZIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r1 = r2.intValue()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L29
            java.lang.Integer r2 = r8.LIZ(r3)
            if (r2 == 0) goto L50
        L29:
            int r0 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L50
            int r4 = r0.intValue()
        L37:
            int r11 = r11 / r6
            r3 = r5[r3]
            int r2 = r13.LIZ
            int r2 = r2 + r3
            int r1 = X.C2247861CyW.LJIJ
            int r2 = r2 + r1
            int r2 = r2 + r11
            int r0 = r13.LIZJ
            int r3 = r3 + r0
            int r3 = r3 - r1
            int r3 = r3 - r11
            if (r2 > r3) goto L4e
            int r0 = X.C13LZ.LJ(r4, r2, r3)
        L4c:
            int r0 = r0 - r7
            return r0
        L4e:
            r0 = r7
            goto L4c
        L50:
            int r4 = r7 + r10
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2247861CyW.LIZIZ(android.view.View, int, int, X.1CyU, X.1Cgk):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v83, types: [X.1Cya, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout, java.lang.Object] */
    public C2247861CyW(InterfaceC1860040yVG interfaceC1860040yVG, List list, AwS435S0200000_34 awS435S0200000_34, boolean z, boolean z2, ReusedUISlotAssem reusedUISlotAssem, AwS613S0100000_34 awS613S0100000_34, AwS578S0100000_34 awS578S0100000_34) {
        int iIntValue;
        int iIntValue2;
        Pair pair;
        int iIntValue3;
        int iIntValue4;
        int iIntValue5;
        View linearLayout;
        this.LIZ = interfaceC1860040yVG;
        this.LIZIZ = awS435S0200000_34;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = reusedUISlotAssem;
        this.LJFF = awS613S0100000_34;
        this.LJI = awS578S0100000_34;
        Context context = interfaceC1860040yVG.LJJZZI().getContext();
        this.LJII = context;
        this.LJIIIIZZ = new C19389110tN(interfaceC1860040yVG.LJJZZI());
        C1868740yjI c1868740yjI = new Object() { // from class: X.0yjI
        };
        AwS613S0100000_34 awS613S0100000_342 = new AwS613S0100000_34(this, 20);
        c1868740yjI.getClass();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15));
        ?? linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        int i = 16;
        linearLayout2.setGravity(16);
        linearLayout2.setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(180)));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        gradientDrawable.setColor(iIntValue);
        linearLayout2.setBackground(gradientDrawable);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1868730yjH c1868730yjH = (C1868730yjH) it2.next();
            Function1<Context, View> function1 = c1868730yjH.LJ;
            if (function1 == null || (linearLayout = function1.invoke(context)) == 0) {
                new Object() { // from class: X.0yjI
                }.getClass();
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c1868730yjH.LIZJ)));
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ2 != null) {
                    iIntValue5 = numLIZJ2.intValue();
                } else {
                    iIntValue5 = -1;
                }
                linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(i);
                C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)), 1.0f));
                linearLayout.setClickable(true);
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.setGravity(i);
                linearLayout3.setClickable(false);
                linearLayout3.setFocusable(false);
                Integer num = c1868730yjH.LIZIZ;
                if (num != null) {
                    int iIntValue6 = num.intValue();
                    TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                    tuxIconView.setIconRes(iIntValue6);
                    tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                    tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                    tuxIconView.setTintColor(iIntValue5);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                    layoutParams.setMarginStart(iLIZIZ2);
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                    C786410Ut5.M6(tuxIconView, layoutParams);
                    linearLayout3.addView(tuxIconView);
                }
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setText(c1868730yjH.LIZ);
                tuxTextView.setTuxFont(102);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView.setTextColorRes(R.attr.a1h);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                if (c1868730yjH.LIZIZ == null) {
                    layoutParams2.setMarginStart(iLIZIZ2);
                }
                layoutParams2.setMarginEnd(iLIZIZ2);
                C786410Ut5.R6(tuxTextView, layoutParams2);
                linearLayout3.addView(tuxTextView);
                linearLayout.addView(linearLayout3, new LinearLayout.LayoutParams(-2, -1));
            }
            C786410Ut5.I7(new ACListenerS130S0200000_28(c1868730yjH, awS613S0100000_342, 26), linearLayout);
            linearLayout2.addView(linearLayout);
            i = 16;
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) + iLIZIZ);
        ?? frameLayout2 = new FrameLayout(context);
        frameLayout2.setClipChildren(false);
        C19659111vp c19659111vp = new C19659111vp();
        c19659111vp.LIZ = C418440Gaw.LIZIZ(12);
        c19659111vp.LJFF = Integer.valueOf(ColorProtector.parseColor("#1a000000"));
        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(26);
        c19659111vp.LIZJ = C418440Gaw.LIZIZ(5);
        frameLayout2.setBackground(c19659111vp.LIZ(context));
        frameLayout2.addView(linearLayout2, new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-2, -2));
        new Object() { // from class: X.0yjI
        }.getClass();
        HandlerHook.viewPost(frameLayout, new ARunnableS102S0100000_2((Object) frameLayout, 27));
        this.LJIIIZ = frameLayout;
        C1086760eO2 c1086760eO2 = C1086760eO2.LIZ;
        Context context2 = this.LJII;
        AwS578S0100000_34 awS578S0100000_342 = new AwS578S0100000_34(this, 39);
        C0HJD c0hjd = C0HJD.LIZ;
        c1086760eO2.getClass();
        C2247921Cyc c2247921Cyc = new C2247921Cyc(context2);
        c2247921Cyc.LIZIZ(Integer.MIN_VALUE);
        c2247921Cyc.LIZ(Integer.MIN_VALUE);
        c2247921Cyc.LJIILL = 16.0f;
        c2247921Cyc.LJII = EnumC1152950g6n.ALIGN_BALLOON;
        c2247921Cyc.LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 0, Resources.getSystem().getDisplayMetrics()));
        c2247921Cyc.LJI = 0.5f;
        c2247921Cyc.LJIIJJI = 0;
        c2247921Cyc.LJJIFFI = false;
        c2247921Cyc.LJJII = 0;
        c2247921Cyc.LJJIII = c0hjd;
        c2247921Cyc.LJJIIZI = false;
        c2247921Cyc.LJJJJIZL = false;
        c2247921Cyc.LJJIJ = false;
        c2247921Cyc.LJJJJ = false;
        c2247921Cyc.LJJIIJZLJL = new C11HK(new AwS578S0100000_34(awS578S0100000_342, (Function0<Unit>) 38));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        c2247921Cyc.LJJIJIL = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LJFF() : null;
        c2247921Cyc.LJJI = frameLayout;
        this.LJIIJ = new Balloon(context2, c2247921Cyc);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.feature.select.menu.IMPopupMenuContainer$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.LL.LJI.invoke();
                }
            }
        };
        this.LJIIL = lifecycleEventObserver;
        this.LJIILL = Integer.MIN_VALUE;
        this.LJIILLIIL = Integer.MIN_VALUE;
        this.LJIIZILJ = C2247841CyU.LIZLLL;
        InterfaceC2248331CzH interfaceC2248331CzH = new InterfaceC2248331CzH() { // from class: X.1CyY
            @Override // X.InterfaceC2248331CzH
            public final void LIZ(int i2, int i3, int i4, boolean z3) {
                C2247841CyU c2247841CyU;
                Long lValueOf;
                boolean z4;
                EnumC2247821CyS enumC2247821CyS;
                C2247861CyW c2247861CyW = this.LIZ;
                if (c2247861CyW.LJIILIIL) {
                    return;
                }
                c2247861CyW.LJIILJJIL = z3;
                c2247861CyW.LJIILL = i2;
                c2247861CyW.LJIILLIIL = i3;
                if (z3) {
                    c2247861CyW.LJIIJ.dismiss();
                    C19389110tN c19389110tN = this.LIZ.LJIIIIZZ;
                    c19389110tN.getClass();
                    C19389110tN.LIZ(new C19389210tO(c19389110tN, i2, i3));
                    return;
                }
                InterfaceC1859950yV7 textSelector = c2247861CyW.LIZ.getTextSelector();
                if (textSelector != null) {
                    C2247861CyW c2247861CyW2 = this.LIZ;
                    if (c2247861CyW2.LJIILL != Integer.MIN_VALUE && c2247861CyW2.LJIILLIIL != Integer.MIN_VALUE) {
                        C2248181Cz2 c2248181Cz2LJIIL = textSelector.LJIIL();
                        Long lValueOf2 = null;
                        if (!(c2248181Cz2LJIIL instanceof View)) {
                            c2248181Cz2LJIIL = null;
                        }
                        boolean z5 = true;
                        if (c2248181Cz2LJIIL == null || c2248181Cz2LJIIL.getWidth() <= 0) {
                            c2248181Cz2LJIIL = null;
                        }
                        C2248181Cz2 c2248181Cz2LJIIJJI = textSelector.LJIIJJI();
                        if (!(c2248181Cz2LJIIJJI instanceof View) || c2248181Cz2LJIIJJI == null || c2248181Cz2LJIIJJI.getWidth() <= 0) {
                            c2248181Cz2LJIIJJI = null;
                        }
                        if (c2248181Cz2LJIIL != null) {
                            lValueOf = Long.valueOf(c2247861CyW2.LJFF(c2248181Cz2LJIIL));
                        } else {
                            lValueOf = null;
                        }
                        if (c2248181Cz2LJIIJJI != null) {
                            lValueOf2 = Long.valueOf(c2247861CyW2.LJFF(c2248181Cz2LJIIJJI));
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("pickHandle: raw=(");
                        sbLIZ.append(c2247861CyW2.LJIILL);
                        sbLIZ.append(',');
                        sbLIZ.append(c2247861CyW2.LJIILLIIL);
                        sbLIZ.append(") startLaidOut=");
                        if (c2248181Cz2LJIIL != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        sbLIZ.append(z4);
                        sbLIZ.append(" endLaidOut=");
                        if (c2248181Cz2LJIIJJI == null) {
                            z5 = false;
                        }
                        sbLIZ.append(z5);
                        sbLIZ.append(" startSqDist=");
                        sbLIZ.append(lValueOf);
                        sbLIZ.append(" endSqDist=");
                        sbLIZ.append(lValueOf2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (c2248181Cz2LJIIL != null) {
                            if (c2248181Cz2LJIIJJI == null || c2247861CyW2.LJFF(c2248181Cz2LJIIL) <= c2247861CyW2.LJFF(c2248181Cz2LJIIJJI)) {
                                c2248181Cz2LJIIJJI = c2248181Cz2LJIIL;
                            }
                            if (c2248181Cz2LJIIJJI == c2248181Cz2LJIIL) {
                                enumC2247821CyS = EnumC2247821CyS.START;
                            }
                            int[] iArr = new int[2];
                            c2248181Cz2LJIIJJI.getLocationOnScreen(iArr);
                            c2247841CyU = new C2247841CyU(enumC2247821CyS, iArr[0] + (c2248181Cz2LJIIJJI.getWidth() / 2));
                        } else if (c2248181Cz2LJIIJJI == null) {
                            c2247841CyU = C2247841CyU.LIZJ;
                        }
                        enumC2247821CyS = EnumC2247821CyS.END;
                        int[] iArr2 = new int[2];
                        c2248181Cz2LJIIJJI.getLocationOnScreen(iArr2);
                        c2247841CyU = new C2247841CyU(enumC2247821CyS, iArr2[0] + (c2248181Cz2LJIIJJI.getWidth() / 2));
                    } else {
                        c2247841CyU = C2247841CyU.LIZJ;
                    }
                    c2247861CyW2.LJIIZILJ = c2247841CyU;
                }
                this.LIZ.LJ();
                C19389110tN c19389110tN2 = this.LIZ.LJIIIIZZ;
                c19389110tN2.getClass();
                C19389110tN.LIZ(new C19389010tM(c19389110tN2));
            }
        };
        InterfaceC2247911Cyb interfaceC2247911Cyb = new InterfaceC2247911Cyb() { // from class: X.1CyZ
            @Override // X.InterfaceC2247911Cyb
            public final void onShow() {
                this.LIZ.LJ();
                C19389110tN c19389110tN = this.LIZ.LJIIIIZZ;
                c19389110tN.getClass();
                C19389110tN.LIZ(new C19389010tM(c19389110tN));
            }

            @Override // X.InterfaceC2247911Cyb
            public final void LIZIZ(boolean z3) {
                InterfaceC1859950yV7 textSelector;
                this.LIZ.LJIIJ.dismiss();
                if (z3 && (textSelector = this.LIZ.LIZ.getTextSelector()) != null) {
                    textSelector.LJ(null);
                }
                C2247861CyW c2247861CyW = this.LIZ;
                if (!c2247861CyW.LJIILJJIL) {
                    InterfaceC1859950yV7 textSelector2 = c2247861CyW.LIZ.getTextSelector();
                    if (textSelector2 != null && textSelector2.LJII() != textSelector2.LJIIIZ()) {
                        return;
                    }
                    c2247861CyW.LJI.invoke();
                }
            }
        };
        if (this.LJ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            this.LJIILIIL = true;
            return;
        }
        InterfaceC1860040yVG interfaceC1860040yVG2 = this.LIZ;
        boolean z3 = this.LIZJ;
        boolean z4 = this.LIZLLL;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(interfaceC1860040yVG2.LJJZZI().getContext(), false);
        if (z4) {
            if (z3) {
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.o5, c1361400lX0LIZ);
                if (numLIZJ3 != null) {
                    iIntValue4 = numLIZJ3.intValue();
                } else {
                    iIntValue4 = -16776961;
                }
                Integer numValueOf = Integer.valueOf(iIntValue4);
                Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.cb, c1361400lX0LIZ);
                pair = new Pair(numValueOf, Integer.valueOf(C2441009hQ.LJIIL(numLIZJ4 != null ? numLIZJ4.intValue() : -16776961, 77)));
            } else {
                Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.o5, c1361400lX0LIZ);
                if (numLIZJ5 != null) {
                    iIntValue3 = numLIZJ5.intValue();
                } else {
                    iIntValue3 = -16776961;
                }
                Integer numValueOf2 = Integer.valueOf(iIntValue3);
                Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.cb, c1361400lX0LIZ);
                pair = new Pair(numValueOf2, Integer.valueOf(C2441009hQ.LJIIL(numLIZJ6 != null ? numLIZJ6.intValue() : -16776961, 77)));
            }
        } else if (z3) {
            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.zi, c1361400lX0LIZ);
            iIntValue2 = numLIZJ7 != null ? numLIZJ7.intValue() : -16776961;
            pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(C2441009hQ.LJIIL(iIntValue2, 51)));
        } else {
            Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.o5, c1361400lX0LIZ);
            iIntValue2 = numLIZJ8 != null ? numLIZJ8.intValue() : -16776961;
            pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(C2441009hQ.LJIIL(iIntValue2, 38)));
        }
        int iIntValue7 = ((Number) pair.getFirst()).intValue();
        int iIntValue8 = ((Number) pair.getSecond()).intValue();
        InterfaceC1859950yV7 textSelector = interfaceC1860040yVG2.getTextSelector();
        if (textSelector != null) {
            textSelector.LJIIIIZZ(0);
            textSelector.LJFF(0);
            textSelector.LJI(new BackgroundColorSpan(iIntValue8));
            C2248181Cz2 c2248181Cz2LJIIL = textSelector.LJIIL();
            if (c2248181Cz2LJIIL != null) {
                c2248181Cz2LJIIL.setCursorColor(iIntValue7);
            }
            C2248181Cz2 c2248181Cz2LJIIJJI = textSelector.LJIIJJI();
            if (c2248181Cz2LJIIJJI != null) {
                c2248181Cz2LJIIJJI.setCursorColor(iIntValue7);
            }
        }
        InterfaceC1859950yV7 textSelector2 = this.LIZ.getTextSelector();
        if (textSelector2 != null) {
            textSelector2.LIZ();
        }
        this.LIZ.LJIILLIIL();
        this.LIZ.LJ(interfaceC2248331CzH);
        InterfaceC1859950yV7 textSelector3 = this.LIZ.getTextSelector();
        if (textSelector3 != null) {
            textSelector3.LJ(interfaceC2247911Cyb);
        }
        ?? LJJZZI = this.LIZ.LJJZZI();
        ?? r0 = new View.OnAttachStateChangeListener() { // from class: X.1Cya
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C2247861CyW c2247861CyW = this.LL;
                c2247861CyW.LJFF.invoke(c2247861CyW.LIZ);
            }
        };
        this.LJIIJJI = r0;
        LJJZZI.addOnAttachStateChangeListener(r0);
        this.LJ.getLifecycle().addObserver(lifecycleEventObserver);
        LJ();
    }
}
