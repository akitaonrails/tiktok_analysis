package X;

import Y.AAListenerS269S0200000_17;
import Y.AAListenerS328S0100000_17;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS1S0110000_6;
import Y.ALAdapterS7S0300000_17;
import Y.ARunnableS86S0200000_17;
import Y.AUListenerS253S0100000_2;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.level.FansClubLottieConfig;
import com.bytedance.android.livesdk.livesetting.level.FansClubSettings;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAnimMarginFixSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ed8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1096120ed8 {
    public final InterfaceC1095350ebt LIZ;
    public final C1295960jpS LIZIZ;
    public final Handler LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1096120ed8.LJI():int");
    }

    public final int LJII() {
        int i;
        View view;
        View view2;
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        if (C497740JfY.LJJ()) {
            iLIZIZ = -iLIZIZ;
        }
        int[] iArr = new int[2];
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt != null && (view2 = ((C1096340edU) interfaceC1095350ebt).LIZ) != null) {
            view2.getLocationOnScreen(iArr);
        }
        int measuredWidth = 0;
        if (C497740JfY.LJJ()) {
            i = iArr[0];
        } else {
            int i2 = iArr[0];
            InterfaceC1095350ebt interfaceC1095350ebt2 = this.LIZ;
            if (interfaceC1095350ebt2 != null && (view = ((C1096340edU) interfaceC1095350ebt2).LIZ) != null) {
                measuredWidth = view.getMeasuredWidth();
            }
            i = i2 + measuredWidth;
        }
        return i + iLIZIZ;
    }

    public final int LJIIIIZZ() {
        ViewGroup viewGroup;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt == null || (viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ) == null) {
            return 0;
        }
        return viewGroup.getMeasuredWidth();
    }

    public final int LJFF() {
        ViewGroup viewGroup;
        int iLJIIIIZZ = LJIIIIZZ();
        if (C497740JfY.LJJ()) {
            iLJIIIIZZ = -iLJIIIIZZ;
        }
        int[] iArr = new int[2];
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt != null && (viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ) != null) {
            viewGroup.getLocationOnScreen(iArr);
        }
        int iLJIIIIZZ2 = iArr[0];
        if (C497740JfY.LJJ()) {
            iLJIIIIZZ2 += LJIIIIZZ();
        }
        return iLJIIIIZZ2 + iLJIIIIZZ;
    }

    public static ValueAnimator LIZJ(int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        return valueAnimatorOfInt;
    }

    public static PathInterpolator LJIIL(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new PathInterpolator(0.29f, 0.0f, 0.44f, 1.0f);
                            }
                            return new PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f);
                        }
                        return new PathInterpolator(0.66f, 0.0f, 0.45f, 1.0f);
                    }
                    return new PathInterpolator(0.29f, 0.0f, 0.44f, 1.0f);
                }
                return new PathInterpolator(0.33f, 0.0f, 0.45f, 1.0f);
            }
            return new PathInterpolator(0.65f, 0.0f, 0.45f, 1.0f);
        }
        return new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    }

    public final void LJIILL(Function0<Unit> function0) {
        FansClubLottieConfig fansClubLottieConfig = FansClubSettings.INSTANCE.getFansClubConfig().fansClubLottieConfig;
        if (fansClubLottieConfig != null) {
            IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
            String str = "";
            if (iHostResource != null) {
                String str2 = fansClubLottieConfig.lottieChannel;
                if (str2 == null) {
                    str2 = "";
                }
                if (iHostResource.u61(str2) && !TextUtils.isEmpty(fansClubLottieConfig.weakGuideLottieName)) {
                    LJIJ(false);
                    C12ES.LJIILL(0, this.LIZIZ);
                    C1295960jpS c1295960jpS = this.LIZIZ;
                    if (c1295960jpS != null) {
                        c1295960jpS.removeAllAnimatorListeners();
                    }
                    C1295960jpS c1295960jpS2 = this.LIZIZ;
                    if (c1295960jpS2 != null) {
                        c1295960jpS2.addAnimatorListener(new AAListenerS269S0200000_17(this, function0, 7));
                    }
                    C1295960jpS c1295960jpS3 = this.LIZIZ;
                    String str3 = fansClubLottieConfig.lottieChannel;
                    if (str3 != null) {
                        str = str3;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(fansClubLottieConfig.weakGuideLottieName);
                    sbLIZ.append(".zip");
                    C1143680frq.LJIIL(c1295960jpS3, str, C2188811AlT.LIZIZ(sbLIZ), "", true, null, Boolean.FALSE, null);
                    return;
                }
            }
        }
        C786410Ut5.LJLIIL(1000L, this.LIZJ, new ARunnableS86S0200000_17(this, function0, 88));
    }

    public final void LJIILLIIL(int i) {
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt != null && (viewGroup = ((C1096340edU) interfaceC1095350ebt).LJIILJJIL) != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.width = i;
            ViewGroup viewGroup2 = ((C1096340edU) this.LIZ).LJIILJJIL;
            if (viewGroup2 != null) {
                C786410Ut5.W5(viewGroup2, layoutParams);
            }
        }
    }

    public final void LJIJ(boolean z) {
        int measuredWidth;
        int i;
        C1295960jpS c1295960jpS;
        ViewGroup.LayoutParams layoutParams;
        C1295960jpS c1295960jpS2 = this.LIZIZ;
        if (c1295960jpS2 != null) {
            measuredWidth = c1295960jpS2.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (z) {
            i = R.dimen.are;
        } else {
            i = R.dimen.ao3;
        }
        int iLJIIIZ = C497740JfY.LJIIIZ(i);
        if (measuredWidth != iLJIIIZ && (c1295960jpS = this.LIZIZ) != null && (layoutParams = c1295960jpS.getLayoutParams()) != null) {
            layoutParams.width = iLJIIIZ;
            layoutParams.height = iLJIIIZ;
            C1295960jpS c1295960jpS3 = this.LIZIZ;
            if (c1295960jpS3 != null) {
                C786410Ut5.s6(c1295960jpS3, layoutParams);
            }
        }
    }

    public static void LJIILJJIL(long j, Function0 function0) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.29f, 0.0f, 0.44f, 1.0f));
        valueAnimatorOfInt.addListener(new AAListenerS328S0100000_17(function0, 33));
        valueAnimatorOfInt.start();
    }

    public static void LJIIZILJ(int i, View view) {
        try {
            C12ES.LJIILL(i, view);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final ValueAnimator LJIIIZ(int i, int i2) {
        ViewGroup viewGroup;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt != null) {
            viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ;
        } else {
            viewGroup = null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(400L);
        valueAnimatorOfInt.setStartDelay(400L);
        valueAnimatorOfInt.setInterpolator(new PathInterpolator(0.29f, 0.0f, 0.44f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(viewGroup, 157));
        return valueAnimatorOfInt;
    }

    public final ValueAnimator LJIIJ(int i, int i2) {
        ViewGroup viewGroup;
        InterfaceC1095350ebt interfaceC1095350ebt = this.LIZ;
        if (interfaceC1095350ebt != null) {
            viewGroup = ((C1096340edU) interfaceC1095350ebt).LJ;
        } else {
            viewGroup = null;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(LJIIL(5));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(viewGroup, 47));
        return valueAnimatorOfInt;
    }

    public AbstractC1096120ed8(InterfaceC1095350ebt interfaceC1095350ebt, C1295960jpS c1295960jpS, BPEAHandler bPEAHandler) {
        this.LIZ = interfaceC1095350ebt;
        this.LIZIZ = c1295960jpS;
        this.LIZJ = bPEAHandler;
    }

    public static ObjectAnimator LIZ(View view, Property property, float... fArr) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        return objectAnimatorOfFloat;
    }

    public static Pair LIZIZ(float f, float f2, long j, long j2, View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f, f2);
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setStartDelay(j2);
        Pair pair = new Pair(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        ValueAnimator valueAnimator = (ValueAnimator) pair.getFirst();
        ValueAnimator valueAnimator2 = (ValueAnimator) pair.getSecond();
        valueAnimator.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimator2.setInterpolator(C0GY9.LIZIZ(0.25f, 0.1f, 0.25f, 1.0f));
        return new Pair(valueAnimator, valueAnimator2);
    }

    public static ObjectAnimator LIZLLL(C1095940ecq c1095940ecq, View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator, Function0 function0, int i) {
        if ((i & 16) != 0) {
            j2 = 0;
        }
        if ((i & 128) != 0) {
            function0 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setStartDelay(j2);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        if (function0 != null) {
            objectAnimatorOfFloat.addListener(new AAListenerS328S0100000_17(function0, 28));
        }
        return objectAnimatorOfFloat;
    }

    public static AnimatorSet LJ(C1095940ecq c1095940ecq, View view, float f, float f2, long j, long j2, PathInterpolator pathInterpolator, Function0 function0, AwS561S0100000_17 awS561S0100000_17, int i) {
        Function0 function02 = function0;
        if ((i & 16) != 0) {
            j2 = 0;
        }
        AwS561S0100000_17 awS561S0100000_172 = null;
        if ((i & 64) != 0) {
            function02 = null;
        }
        if ((i & 128) == 0) {
            awS561S0100000_172 = awS561S0100000_17;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        animatorSet.setStartDelay(j2);
        animatorSet.setInterpolator(pathInterpolator);
        if (function02 != null) {
            animatorSet.addListener(new AAListenerS328S0100000_17(function02, 30));
        }
        if (awS561S0100000_172 != null) {
            animatorSet.addListener(new AAListenerS328S0100000_17(awS561S0100000_172, 32));
        }
        return animatorSet;
    }

    public static C443120HZe LJIIJJI(final AbstractC1096120ed8 abstractC1096120ed8, final InterfaceC1095350ebt interfaceC1095350ebt, final C16F5 c16f5, long j, long j2, long j3, Function0 function0, Function0 function02, boolean z, int i) {
        int i2;
        int i3;
        int measuredWidth;
        boolean z2;
        boolean z3;
        int iLIZIZ;
        int measuredWidth2;
        int i4;
        int i5;
        int i6;
        final boolean z4 = z;
        Function0 function03 = function0;
        long j4 = j3;
        if ((i & 16) != 0) {
            j2 = 0;
        }
        if ((i & 32) != 0) {
            j4 = 300;
        }
        final Function0 function04 = null;
        if ((i & 64) != 0) {
            function03 = null;
        }
        if ((i & 128) == 0) {
            function04 = function02;
        }
        boolean z5 = false;
        if ((i & 256) != 0) {
            z4 = false;
        }
        abstractC1096120ed8.getClass();
        LJIIZILJ(4, c16f5);
        if (c16f5 != null) {
            c16f5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int iLJII = abstractC1096120ed8.LJII();
        int iLJFF = abstractC1096120ed8.LJFF();
        int iLJI = abstractC1096120ed8.LJI();
        if (C497740JfY.LJJ()) {
            i2 = iLJII - iLJFF;
        } else {
            i2 = iLJFF - iLJII;
        }
        if (C497740JfY.LJJ()) {
            i3 = iLJII - iLJI;
        } else {
            i3 = iLJI - iLJII;
        }
        if (c16f5 != null) {
            measuredWidth = c16f5.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        final int iLJIIIIZZ = abstractC1096120ed8.LJIIIIZZ();
        if (measuredWidth > i3) {
            z5 = true;
        }
        if (measuredWidth > i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z5) {
            z3 = true;
            iLIZIZ = (int) ((((double) measuredWidth) + (((double) i3) / 3.0d)) / (((double) ((int) C497740JfY.LIZIZ(30.0f))) / 1000.0d));
        } else {
            z3 = false;
            i3 = measuredWidth;
            iLIZIZ = 0;
        }
        long j5 = j + ((long) iLIZIZ) + 300;
        C1096340edU c1096340edU = (C1096340edU) interfaceC1095350ebt;
        ViewGroup viewGroup = c1096340edU.LJIILJJIL;
        if (viewGroup != null) {
            measuredWidth2 = viewGroup.getMeasuredWidth();
        } else {
            measuredWidth2 = 0;
        }
        if (z2) {
            i4 = (i3 - i2) + measuredWidth2;
        } else {
            i4 = measuredWidth2;
        }
        int[] iArr = new int[2];
        iArr[0] = iLJIIIIZZ;
        if (i3 < iLJIIIIZZ) {
            i5 = iLJIIIIZZ;
        } else {
            i5 = i3;
        }
        iArr[1] = i5;
        ValueAnimator valueAnimatorLIZJ = LIZJ(iArr);
        valueAnimatorLIZJ.setDuration(300L);
        valueAnimatorLIZJ.setStartDelay(0L);
        valueAnimatorLIZJ.addListener(new AAListenerS328S0100000_17(function03, 47));
        valueAnimatorLIZJ.addUpdateListener(new AUListenerS256S0100000_6(c16f5, 186));
        int[] iArr2 = new int[2];
        iArr2[0] = measuredWidth2;
        if (i4 < measuredWidth2) {
            i6 = measuredWidth2;
        } else {
            i6 = i4;
        }
        iArr2[1] = i6;
        ValueAnimator valueAnimatorLIZJ2 = LIZJ(iArr2);
        valueAnimatorLIZJ2.setDuration(300L);
        valueAnimatorLIZJ2.setStartDelay(0L);
        valueAnimatorLIZJ2.addUpdateListener(new AUListenerS266S0100000_17(abstractC1096120ed8, 158));
        ObjectAnimator objectAnimatorLIZ = LIZ(c1096340edU.LIZIZ, View.ALPHA, 1.0f, 0.2f);
        objectAnimatorLIZ.setDuration(300L);
        objectAnimatorLIZ.setStartDelay(0L);
        ObjectAnimator objectAnimatorLIZ2 = LIZ(c16f5, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ2.setDuration(j4);
        objectAnimatorLIZ2.setStartDelay(0 + j2);
        objectAnimatorLIZ2.addListener(new ALAdapterS12S0200000_17(abstractC1096120ed8, c16f5, 41));
        objectAnimatorLIZ2.addListener(new ALAdapterS1S0110000_6(c16f5, z3, 6));
        ObjectAnimator objectAnimatorLIZ3 = LIZ(c16f5, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ3.setDuration(200L);
        objectAnimatorLIZ3.setStartDelay(j5);
        objectAnimatorLIZ3.addListener(new ALAdapterS12S0200000_17(abstractC1096120ed8, c16f5, 42));
        ObjectAnimator objectAnimatorLIZ4 = LIZ(c1096340edU.LIZIZ, View.ALPHA, 0.2f, 1.0f);
        objectAnimatorLIZ4.setDuration(300L);
        objectAnimatorLIZ4.setStartDelay(j5);
        int[] iArr3 = new int[2];
        if (i4 < measuredWidth2) {
            i4 = measuredWidth2;
        }
        iArr3[0] = i4;
        iArr3[1] = measuredWidth2;
        ValueAnimator valueAnimatorLIZJ3 = LIZJ(iArr3);
        valueAnimatorLIZJ3.setDuration(300L);
        valueAnimatorLIZJ3.setStartDelay(j5);
        valueAnimatorLIZJ3.addUpdateListener(new AUListenerS266S0100000_17(abstractC1096120ed8, 160));
        int[] iArr4 = new int[2];
        if (i3 < iLJIIIIZZ) {
            i3 = iLJIIIIZZ;
        }
        iArr4[0] = i3;
        iArr4[1] = iLJIIIIZZ;
        ValueAnimator valueAnimatorLIZJ4 = LIZJ(iArr4);
        valueAnimatorLIZJ4.setDuration(300L);
        valueAnimatorLIZJ4.setStartDelay(j5);
        valueAnimatorLIZJ4.addUpdateListener(new AUListenerS256S0100000_6(c16f5, 187));
        valueAnimatorLIZJ4.addListener(new AnimatorListenerAdapter() { // from class: X.0edA
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2;
                ViewGroup.LayoutParams layoutParams;
                super.onAnimationEnd(animator);
                this.LL.LJIILLIIL(-2);
                AbstractC1096120ed8 abstractC1096120ed82 = this.LL;
                C16F5 c16f52 = c16f5;
                abstractC1096120ed82.getClass();
                AbstractC1096120ed8.LJIIZILJ(8, c16f52);
                ((C1096340edU) interfaceC1095350ebt).LJ();
                if (z4 && LiveFansClubAnimMarginFixSetting.INSTANCE.isEnable() && (viewGroup2 = ((C1096340edU) interfaceC1095350ebt).LJ) != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                    layoutParams.width = iLJIIIIZZ;
                }
                Function0<Unit> function05 = function04;
                if (function05 != null) {
                    function05.invoke();
                }
            }
        });
        return new C443120HZe(new ValueAnimator[]{valueAnimatorLIZJ, valueAnimatorLIZJ2, objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3, objectAnimatorLIZ4, valueAnimatorLIZJ3, valueAnimatorLIZJ4}, Long.valueOf(j5), Long.valueOf(j5 + 300));
    }

    public static C443120HZe LJIILIIL(final AbstractC1096120ed8 abstractC1096120ed8, final InterfaceC1095350ebt interfaceC1095350ebt, final C16F5 c16f5, final LinearLayout linearLayout, long j, long j2, long j3, int i, Function0 function0, Function0 function02, boolean z, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int iLIZIZ;
        int measuredWidth;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        final Function0 function03 = function02;
        Function0 function04 = function0;
        final boolean z5 = z;
        long j4 = j3;
        if ((i2 & 32) != 0) {
            j2 = 0;
        }
        if ((i2 & 64) != 0) {
            j4 = 300;
        }
        if ((i2 & 128) != 0) {
            i8 = 0;
        }
        if ((i2 & 256) != 0) {
            function04 = null;
        }
        if ((i2 & 512) != 0) {
            function03 = null;
        }
        if ((i2 & 1024) != 0) {
            z5 = false;
        }
        LJIIZILJ(4, c16f5);
        c16f5.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iLJII = abstractC1096120ed8.LJII();
        int iLJFF = abstractC1096120ed8.LJFF();
        int iLJI = abstractC1096120ed8.LJI();
        if (C497740JfY.LJJ()) {
            i3 = iLJII - iLJFF;
        } else {
            i3 = iLJFF - iLJII;
        }
        if (C497740JfY.LJJ()) {
            i4 = iLJII - iLJI;
        } else {
            i4 = iLJI - iLJII;
        }
        int measuredWidth2 = c16f5.getMeasuredWidth();
        int i9 = i8 + measuredWidth2;
        final int iLJIIIIZZ = abstractC1096120ed8.LJIIIIZZ();
        if (i9 > i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i9 > i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            z4 = true;
            iLIZIZ = (int) ((((double) measuredWidth2) + (((double) i4) / 3.0d)) / (((double) ((int) C497740JfY.LIZIZ(30.0f))) / 1000.0d));
        } else {
            z4 = false;
            i4 = i9;
            iLIZIZ = 0;
        }
        long j5 = j + ((long) iLIZIZ) + 300;
        C1096340edU c1096340edU = (C1096340edU) interfaceC1095350ebt;
        ViewGroup viewGroup = c1096340edU.LJIILJJIL;
        if (viewGroup != null) {
            measuredWidth = viewGroup.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (z3) {
            i5 = (i4 - i3) + measuredWidth;
        } else {
            i5 = measuredWidth;
        }
        int[] iArr = new int[2];
        iArr[0] = iLJIIIIZZ;
        if (i4 < iLJIIIIZZ) {
            i6 = iLJIIIIZZ;
        } else {
            i6 = i4;
        }
        iArr[1] = i6;
        ValueAnimator valueAnimatorLIZJ = LIZJ(iArr);
        valueAnimatorLIZJ.setDuration(300L);
        valueAnimatorLIZJ.setStartDelay(0L);
        valueAnimatorLIZJ.addListener(new AAListenerS328S0100000_17(function04, 81));
        valueAnimatorLIZJ.addUpdateListener(new AUListenerS253S0100000_2(linearLayout, 48));
        int[] iArr2 = new int[2];
        iArr2[0] = measuredWidth;
        if (i5 < measuredWidth) {
            i7 = measuredWidth;
        } else {
            i7 = i5;
        }
        iArr2[1] = i7;
        ValueAnimator valueAnimatorLIZJ2 = LIZJ(iArr2);
        valueAnimatorLIZJ2.setDuration(300L);
        valueAnimatorLIZJ2.setStartDelay(0L);
        valueAnimatorLIZJ2.addUpdateListener(new AUListenerS266S0100000_17(abstractC1096120ed8, 161));
        ObjectAnimator objectAnimatorLIZ = LIZ(c1096340edU.LIZIZ, View.ALPHA, 1.0f, 0.2f);
        objectAnimatorLIZ.setDuration(300L);
        objectAnimatorLIZ.setStartDelay(0L);
        ObjectAnimator objectAnimatorLIZ2 = LIZ(linearLayout, View.ALPHA, 0.0f, 1.0f);
        objectAnimatorLIZ2.setDuration(j4);
        objectAnimatorLIZ2.setStartDelay(0 + j2);
        objectAnimatorLIZ2.addListener(new ALAdapterS7S0300000_17(linearLayout, c16f5, abstractC1096120ed8, 14));
        objectAnimatorLIZ2.addListener(new ALAdapterS1S0110000_6(c16f5, z4, 7));
        ObjectAnimator objectAnimatorLIZ3 = LIZ(linearLayout, View.ALPHA, 1.0f, 0.0f);
        objectAnimatorLIZ3.setDuration(200L);
        objectAnimatorLIZ3.setStartDelay(j5);
        objectAnimatorLIZ3.addListener(new ALAdapterS7S0300000_17(linearLayout, c16f5, abstractC1096120ed8, 15));
        ObjectAnimator objectAnimatorLIZ4 = LIZ(c1096340edU.LIZIZ, View.ALPHA, 0.2f, 1.0f);
        objectAnimatorLIZ4.setDuration(300L);
        objectAnimatorLIZ4.setStartDelay(j5);
        int[] iArr3 = new int[2];
        if (i5 < measuredWidth) {
            i5 = measuredWidth;
        }
        iArr3[0] = i5;
        iArr3[1] = measuredWidth;
        ValueAnimator valueAnimatorLIZJ3 = LIZJ(iArr3);
        valueAnimatorLIZJ3.setDuration(300L);
        valueAnimatorLIZJ3.setStartDelay(j5);
        valueAnimatorLIZJ3.addUpdateListener(new AUListenerS266S0100000_17(abstractC1096120ed8, 162));
        int[] iArr4 = new int[2];
        if (i4 < iLJIIIIZZ) {
            i4 = iLJIIIIZZ;
        }
        iArr4[0] = i4;
        iArr4[1] = iLJIIIIZZ;
        ValueAnimator valueAnimatorLIZJ4 = LIZJ(iArr4);
        valueAnimatorLIZJ4.setDuration(300L);
        valueAnimatorLIZJ4.setStartDelay(j5);
        valueAnimatorLIZJ4.addUpdateListener(new AUListenerS253S0100000_2(linearLayout, 49));
        valueAnimatorLIZJ4.addListener(new AnimatorListenerAdapter() { // from class: X.0ed9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2;
                ViewGroup.LayoutParams layoutParams;
                super.onAnimationEnd(animator);
                this.LL.LJIILLIIL(-2);
                AbstractC1096120ed8 abstractC1096120ed82 = this.LL;
                C16F5 c16f52 = c16f5;
                abstractC1096120ed82.getClass();
                AbstractC1096120ed8.LJIIZILJ(8, c16f52);
                AbstractC1096120ed8 abstractC1096120ed83 = this.LL;
                LinearLayout linearLayout2 = linearLayout;
                abstractC1096120ed83.getClass();
                AbstractC1096120ed8.LJIIZILJ(8, linearLayout2);
                ((C1096340edU) interfaceC1095350ebt).LJ();
                if (z5 && LiveFansClubAnimMarginFixSetting.INSTANCE.isEnable() && (viewGroup2 = ((C1096340edU) interfaceC1095350ebt).LJ) != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                    layoutParams.width = iLJIIIIZZ;
                }
                Function0<Unit> function05 = function03;
                if (function05 != null) {
                    function05.invoke();
                }
            }
        });
        return new C443120HZe(new ValueAnimator[]{valueAnimatorLIZJ, valueAnimatorLIZJ2, objectAnimatorLIZ, objectAnimatorLIZ2, objectAnimatorLIZ3, objectAnimatorLIZ4, valueAnimatorLIZJ3, valueAnimatorLIZJ4}, Long.valueOf(j5), Long.valueOf(j5 + 300));
    }
}
