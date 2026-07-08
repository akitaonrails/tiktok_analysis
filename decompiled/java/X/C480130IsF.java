package X;

import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.feed.api.TopLiveClearModelChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480130IsF extends ConstraintLayout {
    public C472280Ifa LL;
    public FrameLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public C21546719Ub LLILZ;
    public Function0<Unit> LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final int LLIZLLLIL;
    public int LLJ;
    public VelocityTracker LLJI;
    public final boolean LLJIJIL;
    public boolean LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public boolean LLJILLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            this.LLJILJILJ.removeCallbacksAndMessages(null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final Function0<Unit> getCloseSkyLight() {
        return this.LLILZIL;
    }

    public final C472280Ifa getFirstTabPageContainer() {
        return this.LL;
    }

    public final FrameLayout getSecondTabPageContainer() {
        return this.LLILLJJLI;
    }

    public final C21546719Ub getTopBar() {
        return this.LLILZ;
    }

    public final FrameLayout getTopTabContainer() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(final int r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "animateToTab targetTabPosition="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveTabContainer"
            X.C20441214yg.LIZIZ(r0, r1)
            X.19Ub r0 = r6.LLILZ
            r5 = 0
            if (r0 == 0) goto L98
            int r2 = r0.getSelectedTabPosition()
        L1e:
            r4 = 0
            r3 = 1
            r0 = 2
            if (r7 != r2) goto L69
            float[] r1 = new float[r0]
            if (r2 == 0) goto L5e
            if (r2 != r3) goto L67
            android.widget.FrameLayout r0 = r6.LLILLJJLI
            if (r0 == 0) goto L67
            float r0 = r0.getTranslationX()
        L31:
            r1[r5] = r0
            r1[r3] = r4
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
        L39:
            if (r3 == 0) goto L5d
            r0 = 200(0xc8, double:9.9E-322)
            r3.setDuration(r0)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r3.setInterpolator(r0)
            Y.AUListenerS257S0100000_7 r1 = new Y.AUListenerS257S0100000_7
            r0 = 10
            r1.<init>(r6, r0)
            r3.addUpdateListener(r1)
            X.0IsG r0 = new X.0IsG
            r0.<init>()
            r3.addListener(r0)
            r3.start()
        L5d:
            return
        L5e:
            X.0Ifa r0 = r6.LL
            if (r0 == 0) goto L67
            float r0 = r0.getTranslationX()
            goto L31
        L67:
            r0 = 0
            goto L31
        L69:
            float[] r1 = new float[r0]
            if (r2 == 0) goto L8f
            if (r2 != r3) goto L77
            android.widget.FrameLayout r0 = r6.LLILLJJLI
            if (r0 == 0) goto L77
            float r4 = r0.getTranslationX()
        L77:
            r1[r5] = r4
            boolean r0 = r6.LLJIJIL
            if (r0 == 0) goto L89
            if (r2 != 0) goto L8b
        L7f:
            int r0 = r6.LLJ
        L81:
            float r0 = (float) r0
            r1[r3] = r0
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
            goto L39
        L89:
            if (r2 != 0) goto L7f
        L8b:
            int r0 = r6.LLJ
            int r0 = -r0
            goto L81
        L8f:
            X.0Ifa r0 = r6.LL
            if (r0 == 0) goto L77
            float r4 = r0.getTranslationX()
            goto L77
        L98:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C480130IsF.e0(int):void");
    }

    public final void h0(float f) {
        int selectedTabPosition;
        float f2;
        int i;
        int i2;
        C21546719Ub c21546719Ub = this.LLILZ;
        if (c21546719Ub != null) {
            selectedTabPosition = c21546719Ub.getSelectedTabPosition();
        } else {
            selectedTabPosition = 0;
        }
        float fAbs = Math.abs(f) / this.LLJ;
        if (selectedTabPosition == 0) {
            f2 = fAbs;
        } else {
            f2 = 1 - fAbs;
        }
        if (selectedTabPosition != 0) {
            if (selectedTabPosition == 1) {
                FrameLayout frameLayout = this.LLILLJJLI;
                if (frameLayout != null) {
                    C786410Ut5.Kc(frameLayout, f);
                }
                C472280Ifa c472280Ifa = this.LL;
                if (c472280Ifa != null) {
                    C786410Ut5.LLLII(c472280Ifa, 0);
                }
                C472280Ifa c472280Ifa2 = this.LL;
                if (c472280Ifa2 != null) {
                    if (this.LLJIJIL) {
                        i2 = this.LLJ;
                    } else {
                        i2 = -this.LLJ;
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472280Ifa2);
                    c472280Ifa2.setTranslationX(i2 + f);
                }
                FrameLayout frameLayout2 = this.LLILLJJLI;
                if (frameLayout2 != null) {
                    C786410Ut5.U4(frameLayout2, 1.0f - (fAbs * 0.3f));
                }
                C472280Ifa c472280Ifa3 = this.LL;
                if (c472280Ifa3 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472280Ifa3);
                    c472280Ifa3.setAlpha((fAbs * 0.3f) + 0.7f);
                }
            }
        } else {
            C472280Ifa c472280Ifa4 = this.LL;
            if (c472280Ifa4 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472280Ifa4);
                c472280Ifa4.setTranslationX(f);
            }
            FrameLayout frameLayout3 = this.LLILLJJLI;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
            FrameLayout frameLayout4 = this.LLILLJJLI;
            if (frameLayout4 != null) {
                if (this.LLJIJIL) {
                    i = -this.LLJ;
                } else {
                    i = this.LLJ;
                }
                C786410Ut5.Kc(frameLayout4, i + f);
            }
            C472280Ifa c472280Ifa5 = this.LL;
            if (c472280Ifa5 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472280Ifa5);
                c472280Ifa5.setAlpha(1.0f - (fAbs * 0.3f));
            }
            FrameLayout frameLayout5 = this.LLILLJJLI;
            if (frameLayout5 != null) {
                C786410Ut5.U4(frameLayout5, (fAbs * 0.3f) + 0.7f);
            }
        }
        C21546719Ub c21546719Ub2 = this.LLILZ;
        if (c21546719Ub2 != null) {
            c21546719Ub2.LJIILLIIL(0, f2, false, true);
        }
    }

    public final void i0(int i) {
        float f;
        float f2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prepareViewsForSwipe currentTab=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveTabContainer", C2188811AlT.LIZIZ(sbLIZ));
        C472280Ifa c472280Ifa = this.LL;
        if (c472280Ifa != null && this.LLILLJJLI != null) {
            if (i != 0) {
                if (i == 1) {
                    C786410Ut5.LLLII(c472280Ifa, 0);
                    FrameLayout frameLayout = this.LLILLJJLI;
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(0, frameLayout);
                    }
                    C472280Ifa c472280Ifa2 = this.LL;
                    if (c472280Ifa2 != null) {
                        if (this.LLJIJIL) {
                            f2 = this.LLJ;
                        } else {
                            f2 = -this.LLJ;
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c472280Ifa2);
                        c472280Ifa2.setTranslationX(f2);
                        return;
                    }
                    return;
                }
                return;
            }
            C786410Ut5.LLLII(c472280Ifa, 0);
            FrameLayout frameLayout2 = this.LLILLJJLI;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(0, frameLayout2);
            }
            FrameLayout frameLayout3 = this.LLILLJJLI;
            if (frameLayout3 == null) {
                return;
            }
            if (this.LLJIJIL) {
                f = -this.LLJ;
            } else {
                f = this.LLJ;
            }
            C786410Ut5.Kc(frameLayout3, f);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C20441214yg.LJIIIZ("LiveTabContainer", "onConfigurationChanged");
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null && C500260Jjc.LJJJJIZL(frameLayout)) {
            DataChannelGlobal.LLILZ.HQ2(TopLiveClearModelChannel.class, new C475540Ikq(true));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        boolean z;
        C21546719Ub c21546719Ub;
        C21546719Ub c21546719Ub2;
        InterfaceC472300Ifc touchEventInterceptor;
        boolean z2;
        C472280Ifa c472280Ifa;
        InterfaceC472300Ifc touchEventInterceptor2;
        C21546719Ub c21546719Ub3;
        FrameLayout frameLayout;
        C21546719Ub c21546719Ub4;
        InterfaceC472300Ifc touchEventInterceptor3;
        if (!LiveTopTabSwitch.slideOpt()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        boolean z3 = true;
        if (this.LLJILLL) {
            return true;
        }
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                if (motionEvent != null) {
                    this.LLILZLL = motionEvent.getRawX();
                    this.LLIZ = motionEvent.getRawY();
                    C472280Ifa c472280Ifa2 = this.LL;
                    if (c472280Ifa2 != null && c472280Ifa2.getSkylightOpen() && (frameLayout = this.LLILLL) != null && C500260Jjc.LJJJJIZL(frameLayout) && (c21546719Ub4 = this.LLILZ) != null && c21546719Ub4.getSelectedTabPosition() == 0) {
                        C472280Ifa c472280Ifa3 = this.LL;
                        if (c472280Ifa3 != null && (touchEventInterceptor3 = c472280Ifa3.getTouchEventInterceptor()) != null && touchEventInterceptor3.Fh(motionEvent)) {
                            z2 = true;
                        }
                    } else {
                        FrameLayout frameLayout2 = this.LLILLL;
                        if (frameLayout2 != null && C500260Jjc.LJJJJIZL(frameLayout2) && (c21546719Ub3 = this.LLILZ) != null) {
                            c21546719Ub3.getSelectedTabPosition();
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onInterceptTouchEvent ACTION_DOWN, intercept=");
                sbLIZ.append(z2);
                C20441214yg.LJIIIZ("LiveTabContainer", C2188811AlT.LIZIZ(sbLIZ));
                C472280Ifa c472280Ifa4 = this.LL;
                if (c472280Ifa4 != null && c472280Ifa4.getSkylightOpen() && (c472280Ifa = this.LL) != null && (touchEventInterceptor2 = c472280Ifa.getTouchEventInterceptor()) != null) {
                    touchEventInterceptor2.Je();
                }
                return z2;
            }
            if (numValueOf.intValue() == 2) {
                float rawX = motionEvent.getRawX() - this.LLILZLL;
                float rawY = motionEvent.getRawY() - this.LLIZ;
                if (this.LLJIJIL) {
                    rawX = -rawX;
                }
                if (Math.abs(rawX) > this.LLIZLLLIL * 3 && Math.abs(rawX) * 0.5f > Math.abs(rawY)) {
                    FrameLayout frameLayout3 = this.LLILLL;
                    if (frameLayout3 != null && C500260Jjc.LJJJJIZL(frameLayout3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (c21546719Ub2 = this.LLILZ) != null && c21546719Ub2.getSelectedTabPosition() == 0) {
                        C472280Ifa c472280Ifa5 = this.LL;
                        if (c472280Ifa5 != null && (touchEventInterceptor = c472280Ifa5.getTouchEventInterceptor()) != null && touchEventInterceptor.Fh(motionEvent)) {
                            if (rawX < 0.0f) {
                                i0(0);
                            }
                        } else {
                            z3 = false;
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onInterceptTouchEvent ACTION_MOVE, tab0 shouldIntercept=");
                        sbLIZ2.append(z3);
                        C20441214yg.LJIIIZ("LiveTabContainer", C2188811AlT.LIZIZ(sbLIZ2));
                        return z3;
                    }
                    FrameLayout frameLayout4 = this.LLILLL;
                    if (frameLayout4 != null && C500260Jjc.LJJJJIZL(frameLayout4) && (c21546719Ub = this.LLILZ) != null && c21546719Ub.getSelectedTabPosition() == 1 && rawX > 0.0f && !this.LLJILJIL) {
                        C20441214yg.LJIIIZ("LiveTabContainer", "onInterceptTouchEvent ACTION_MOVE, tab1 true");
                        i0(1);
                        return true;
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Integer numValueOf2;
        int selectedTabPosition;
        int selectedTabPosition2;
        float xVelocity;
        Function0<Unit> function0;
        int i;
        float f;
        if (!LiveTopTabSwitch.slideOpt()) {
            return super.onTouchEvent(motionEvent);
        }
        FrameLayout frameLayout = this.LLILLL;
        int selectedTabPosition3 = 0;
        if (frameLayout != null && C500260Jjc.LJJJJIZL(frameLayout)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onTouchEvent ");
            if (motionEvent != null) {
                numValueOf = Integer.valueOf(motionEvent.getAction());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            C20441214yg.LIZIZ("LiveTabContainer", C2188811AlT.LIZIZ(sbLIZ));
            if (motionEvent != null && (numValueOf2 = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf2.intValue() == 0) {
                    C20441214yg.LIZIZ("LiveTabContainer", "onTouchEvent ACTION_DOWN");
                    this.LLILZLL = motionEvent.getRawX();
                    this.LLIZ = motionEvent.getRawY();
                    if (this.LLJI == null) {
                        this.LLJI = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker = this.LLJI;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                } else {
                    float f2 = 0.0f;
                    if (numValueOf2 != null) {
                        if (numValueOf2.intValue() == 2) {
                            C20441214yg.LIZIZ("LiveTabContainer", "onTouchEvent ACTION_MOVE");
                            float rawX = motionEvent.getRawX() - this.LLILZLL;
                            float rawY = motionEvent.getRawY() - this.LLIZ;
                            if (this.LLJI == null) {
                                this.LLJI = VelocityTracker.obtain();
                            }
                            VelocityTracker velocityTracker2 = this.LLJI;
                            if (velocityTracker2 != null) {
                                velocityTracker2.addMovement(motionEvent);
                            }
                            if (Math.abs(rawX) <= this.LLIZLLLIL * 3 || Math.abs(rawX) * 0.5f <= Math.abs(rawY)) {
                                return false;
                            }
                            this.LLJILLL = true;
                            C21546719Ub c21546719Ub = this.LLILZ;
                            if (c21546719Ub != null) {
                                selectedTabPosition3 = c21546719Ub.getSelectedTabPosition();
                            }
                            if (this.LLJIJIL) {
                                f = -rawX;
                            } else {
                                f = rawX;
                            }
                            if (selectedTabPosition3 == 0 ? f < 0.0f : !(selectedTabPosition3 != 1 || f <= 0.0f)) {
                                f2 = rawX;
                            }
                            h0(f2);
                            return true;
                        }
                        if (numValueOf2.intValue() == 1) {
                            C20441214yg.LJIIIZ("LiveTabContainer", "onTouchEvent ACTION_UP");
                            float rawX2 = motionEvent.getRawX() - this.LLILZLL;
                            C21546719Ub c21546719Ub2 = this.LLILZ;
                            if (c21546719Ub2 != null) {
                                selectedTabPosition2 = c21546719Ub2.getSelectedTabPosition();
                            } else {
                                selectedTabPosition2 = 0;
                            }
                            VelocityTracker velocityTracker3 = this.LLJI;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                                VelocityTracker velocityTracker4 = this.LLJI;
                                if (velocityTracker4 != null) {
                                    xVelocity = velocityTracker4.getXVelocity();
                                } else {
                                    xVelocity = 0.0f;
                                }
                                VelocityTracker velocityTracker5 = this.LLJI;
                                if (velocityTracker5 != null) {
                                    velocityTracker5.recycle();
                                }
                                this.LLJI = null;
                            } else {
                                xVelocity = 0.0f;
                            }
                            if (this.LLJIJIL) {
                                rawX2 = -rawX2;
                            }
                            if (this.LLJILLL) {
                                if (selectedTabPosition2 != 0) {
                                    if (selectedTabPosition2 == 1 && rawX2 > 0.0f && (Math.abs(rawX2) > this.LLJ * 0.33333334f || Math.abs(xVelocity) > 500.0f)) {
                                        i = 0;
                                        e0(i);
                                    }
                                    e0(selectedTabPosition2);
                                } else {
                                    if (rawX2 < 0.0f && (Math.abs(rawX2) > this.LLJ * 0.33333334f || Math.abs(xVelocity) > 500.0f)) {
                                        i = 1;
                                        e0(i);
                                    }
                                    e0(selectedTabPosition2);
                                }
                            } else if (selectedTabPosition2 == 0 && (function0 = this.LLILZIL) != null) {
                                function0.invoke();
                            }
                            this.LLJILLL = false;
                            return true;
                        }
                        if (numValueOf2.intValue() == 3) {
                            C20441214yg.LIZIZ("LiveTabContainer", "onTouchEvent ACTION_CANCEL");
                            if (this.LLJILLL) {
                                C21546719Ub c21546719Ub3 = this.LLILZ;
                                if (c21546719Ub3 != null) {
                                    selectedTabPosition = c21546719Ub3.getSelectedTabPosition();
                                } else {
                                    selectedTabPosition = 0;
                                }
                                e0(selectedTabPosition);
                                this.LLJILLL = false;
                                VelocityTracker velocityTracker6 = this.LLJI;
                                if (velocityTracker6 != null) {
                                    velocityTracker6.recycle();
                                    this.LLJI = null;
                                    return true;
                                }
                            }
                        }
                    }
                }
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCloseSkyLight(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setFirstTabPageContainer(C472280Ifa c472280Ifa) {
        this.LL = c472280Ifa;
    }

    public final void setSecondTabPageContainer(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setTopBar(C21546719Ub c21546719Ub) {
        this.LLILZ = c21546719Ub;
    }

    public final void setTopTabContainer(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public C480130IsF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C480130IsF(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLIZLLLIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJIJIL = C497740JfY.LJJ();
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        new ARunnableS107S0100000_7(this, 151);
        HandlerHook.viewPost(this, new ARunnableS107S0100000_7(this, 150));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.LLJ = i;
        }
    }
}
