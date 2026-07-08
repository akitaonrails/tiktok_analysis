package X;

import Y.ATListenerS455S0100000_22;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS59S0310000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1447770nmJ {
    public final Context LIZ;
    public final C1447790nmL LIZIZ;
    public final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public int LJFF;
    public int LJI;
    public int LJII;
    public final int LJIIIIZZ;
    public final WindowManager.LayoutParams LJIIIZ;
    public WindowManager LJIIJ;
    public final int LJIIJJI;
    public int LJIIL;
    public final BPEAHandler LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public ValueAnimator LJIIZILJ;
    public ValueAnimator LJIJ;
    public boolean LJIJI;
    public float LJIJJ;
    public float LJIJJLI;
    public float LJIL;
    public float LJJ;
    public long LJJI;
    public long LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public final long LJJIIJZLJL;
    public final long LJJIIZ;
    public final long LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public long LJJIJIIJIL;
    public final MutableLiveData<Boolean> LJJIJIL;
    public InterfaceC1447780nmK LJJIJL;

    public static void LIZIZ(C1447770nmJ c1447770nmJ) {
        int i;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        WindowManager.LayoutParams layoutParams = c1447770nmJ.LJIIIZ;
        if (C1388580mEq.LIZIZ(c1447770nmJ.LIZ)) {
            int i2 = c1447770nmJ.LJIILL;
            int i3 = c1447770nmJ.LJI;
            if (c1447770nmJ.LIZIZ.getMeasuredWidth() > 0) {
                iLIZIZ = c1447770nmJ.LIZIZ.getMeasuredWidth();
            }
            i = (i3 - iLIZIZ) - i2;
        } else {
            i = c1447770nmJ.LJIILL;
        }
        layoutParams.x = i;
        layoutParams.y = c1447770nmJ.LJIILLIIL;
    }

    public final void LIZJ(C1447790nmL c1447790nmL) {
        Float fValueOf;
        try {
            WindowManager windowManager = this.LJIIJ;
            if (windowManager != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeWindowView: x = ");
                sbLIZ.append(this.LJIIIZ.x);
                sbLIZ.append(", y = ");
                sbLIZ.append(this.LJIIIZ.y);
                sbLIZ.append(", alpha = ");
                if (c1447790nmL == null) {
                    fValueOf = null;
                } else {
                    fValueOf = Float.valueOf(c1447790nmL.getAlpha());
                }
                sbLIZ.append(fValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                windowManager.removeViewImmediate(c1447790nmL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C1447770nmJ(Context context, C1447790nmL c1447790nmL) {
        this.LIZ = context;
        this.LIZIZ = c1447790nmL;
        this.LJFF = C14KQ.LJ(context);
        this.LJI = ScreenUtils.getScreenWidth(context);
        this.LJII = ScreenUtils.getStatusBarHeight(context);
        this.LJIIIIZZ = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(context);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LJIIIZ = layoutParams;
        this.LJIIJJI = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LJIILIIL = new BPEAHandler(Looper.getMainLooper());
        this.LJIILJJIL = true;
        PublishProgressDialogAddHelper.LIZ.getClass();
        this.LJIILL = PublishProgressDialogAddHelper.LIZJ;
        this.LJIILLIIL = PublishProgressDialogAddHelper.LIZLLL + this.LJII;
        this.LJIJJ = -1.0f;
        this.LJIJJLI = -1.0f;
        this.LJIL = -1.0f;
        this.LJJ = -1.0f;
        this.LJJIII = true;
        this.LJJIIJZLJL = 500L;
        this.LJJIIZ = 300L;
        this.LJJIIZI = 200L;
        this.LJJIJIL = new MutableLiveData<>(Boolean.FALSE);
        layoutParams.type = LSPassThroughRecordSizeConfig.DEFAULT;
        layoutParams.flags = 552;
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        c1447790nmL.setOnTouchListener(new ATListenerS455S0100000_22(this, 3));
        LIZIZ(this);
    }

    public static void LIZLLL(final C1447770nmJ c1447770nmJ, int i) {
        boolean z;
        int i2;
        int measuredWidth = 0;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            measuredWidth = c1447770nmJ.LIZIZ.getMeasuredWidth();
        }
        if (!Intrinsics.LJFF(c1447770nmJ.LJJIJIL.getValue(), Boolean.TRUE)) {
            final int i3 = c1447770nmJ.LJIIIZ.x;
            int i4 = c1447770nmJ.LIZJ;
            int i5 = (c1447770nmJ.LJI - measuredWidth) - i4;
            final C118300cf c118300cf = new C118300cf();
            WindowManager.LayoutParams layoutParams = c1447770nmJ.LJIIIZ;
            if (layoutParams.x > (c1447770nmJ.LJI - measuredWidth) / 2) {
                i2 = i5;
            } else {
                i2 = i4;
            }
            c118300cf.element = i2;
            float f = c1447770nmJ.LJJIJIIJI;
            if (f > 0.0f && c1447770nmJ.LJJIJ > 0.8f && z) {
                c118300cf.element = i5;
            } else if (f < 0.0f && c1447770nmJ.LJJIJ > 0.8f && z) {
                c118300cf.element = i4;
            }
            final int i6 = layoutParams.y;
            int i7 = c1447770nmJ.LIZLLL + c1447770nmJ.LJII;
            final int measuredHeight = ((c1447770nmJ.LJFF - c1447770nmJ.LJIIIIZZ) - c1447770nmJ.LIZIZ.getMeasuredHeight()) - c1447770nmJ.LJ;
            int i8 = c1447770nmJ.LJIIIZ.y;
            if (i8 <= measuredHeight) {
                if (i8 < i7) {
                    measuredHeight = i7;
                } else {
                    measuredHeight = i8;
                }
            }
            if (z) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0ner
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (this.LL.LIZIZ.getParent() != null) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            C1447770nmJ c1447770nmJ2 = this.LL;
                            WindowManager.LayoutParams layoutParams2 = c1447770nmJ2.LJIIIZ;
                            layoutParams2.x = (int) (i3 + ((c118300cf.element - r2) * fFloatValue));
                            layoutParams2.y = (int) (i6 + ((measuredHeight - r2) * fFloatValue));
                            WindowManager windowManager = c1447770nmJ2.LJIIJ;
                            if (windowManager != null) {
                                windowManager.updateViewLayout(c1447770nmJ2.LIZIZ, layoutParams2);
                            }
                        }
                    }
                });
                valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILJJIL());
                valueAnimatorOfFloat.start();
                return;
            }
            if (c1447770nmJ.LIZIZ.getParent() == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams2 = c1447770nmJ.LJIIIZ;
            layoutParams2.x = c118300cf.element;
            layoutParams2.y = measuredHeight;
            WindowManager windowManager = c1447770nmJ.LJIIJ;
            if (windowManager == null) {
                return;
            }
            windowManager.updateViewLayout(c1447770nmJ.LIZIZ, layoutParams2);
        }
    }

    public static void LIZ(C1447770nmJ c1447770nmJ, Activity activity, int i, int i2, Function1 function1, boolean z, boolean z2, boolean z3, int i3) {
        WindowManager windowManager;
        int iLIZIZ;
        boolean z4 = z2;
        if ((i3 & 2) != 0) {
            i = -1;
        }
        if ((i3 & 4) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
            z = false;
        }
        if ((i3 & 32) != 0) {
            z4 = false;
        }
        if ((i3 & 64) != 0) {
            z3 = false;
        }
        if (i > 0 && !c1447770nmJ.LJIJI) {
            c1447770nmJ.LJIILL = i;
            WindowManager.LayoutParams layoutParams = c1447770nmJ.LJIIIZ;
            if ((C1388580mEq.LIZIZ(c1447770nmJ.LIZ) && !z3) || (!C1388580mEq.LIZIZ(c1447770nmJ.LIZ) && z3)) {
                int i4 = c1447770nmJ.LJI;
                if (c1447770nmJ.LIZIZ.getMeasuredWidth() > 0) {
                    iLIZIZ = c1447770nmJ.LIZIZ.getMeasuredWidth();
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                }
                i = (i4 - iLIZIZ) - i;
            }
            layoutParams.x = i;
        }
        if (i2 > 0) {
            if (!c1447770nmJ.LJIJI) {
                c1447770nmJ.LJIILLIIL = i2;
                c1447770nmJ.LJIIIZ.y = i2 + c1447770nmJ.LJII;
            }
        } else {
            c1447770nmJ.getClass();
        }
        Object objF2 = C786410Ut5.F2(activity, "window");
        Float fValueOf = null;
        if (objF2 instanceof WindowManager) {
            windowManager = (WindowManager) objF2;
        } else {
            windowManager = null;
        }
        c1447770nmJ.LJIIJ = windowManager;
        IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
        if (windowToken == null) {
            if (!z) {
                C430110Gtl.LIZ(activity.getWindow().getDecorView(), new AwS59S0310000_22(c1447770nmJ, (C1447770nmJ) activity, (Activity) function1, (Function1<? super Boolean, Unit>) z4, true));
                return;
            } else {
                function1.invoke(Boolean.FALSE);
                return;
            }
        }
        c1447770nmJ.LJIIIZ.token = windowToken;
        int iLJ = C14KQ.LJ(c1447770nmJ.LIZ);
        if (iLJ != c1447770nmJ.LJFF) {
            c1447770nmJ.LJFF = iLJ;
            c1447770nmJ.LJI = ScreenUtils.getScreenWidth(c1447770nmJ.LIZ);
            c1447770nmJ.LJII = ScreenUtils.getStatusBarHeight(c1447770nmJ.LIZ);
        }
        WindowManager windowManager2 = c1447770nmJ.LJIIJ;
        if (windowManager2 != null) {
            int iHashCode = windowManager2.hashCode();
            if (iHashCode == c1447770nmJ.LJIIL) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            if (c1447770nmJ.LIZIZ.getParent() != null) {
                c1447770nmJ.LIZJ(c1447770nmJ.LIZIZ);
            }
            C1447790nmL c1447790nmL = c1447770nmJ.LIZIZ;
            WindowManager.LayoutParams layoutParams2 = c1447770nmJ.LJIIIZ;
            try {
                WindowManager windowManager3 = c1447770nmJ.LJIIJ;
                if (windowManager3 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addWindowView: x = ");
                    sbLIZ.append(c1447770nmJ.LJIIIZ.x);
                    sbLIZ.append(", y = ");
                    sbLIZ.append(c1447770nmJ.LJIIIZ.y);
                    sbLIZ.append(", alpha = ");
                    if (c1447790nmL != null) {
                        fValueOf = Float.valueOf(c1447790nmL.getAlpha());
                    }
                    sbLIZ.append(fValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    windowManager3.addView(c1447790nmL, layoutParams2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C430110Gtl.LIZ(c1447770nmJ.LIZIZ, new AwS566S0100000_22(c1447770nmJ, 350));
            c1447770nmJ.LJIIL = iHashCode;
        }
        function1.invoke(Boolean.TRUE);
    }
}
