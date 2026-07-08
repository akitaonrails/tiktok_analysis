package X;

import Y.ALAdapterS14S0110000_33;
import Y.ALAdapterS27S0100000_33;
import Y.ARunnableS133S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19cN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21576919cN extends ViewGroup implements C19PU, InterfaceC1318530kPr {
    public static final ViewGroup.MarginLayoutParams LLLLZIL = new ViewGroup.MarginLayoutParams(-1, -1);
    public final int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final float LLJILJIL;
    public char LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final int LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public int LLJJJIL;
    public final Scroller LLJJJJ;
    public final VelocityTracker LLJJJJJIL;
    public final C19ZZ LLJJJJLIIL;
    public final int[] LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final boolean LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final boolean LLJLL;
    public final boolean LLJLLIL;
    public final boolean LLJLLL;
    public final boolean LLJZ;
    public final boolean LLJZIJLIL;
    public final boolean LLL;
    public boolean LLLF;
    public final boolean LLLFF;
    public final boolean LLLFFI;
    public final boolean LLLFZ;
    public final boolean LLLI;
    public boolean LLLII;
    public final boolean LLLIIII;
    public final boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public final boolean LLLIL;
    public final boolean LLLILZ;
    public InterfaceC21578219ca LLLILZJ;
    public InterfaceC21578119cZ LLLILZLLLI;
    public InterfaceC21577819cW LLLIZZ;
    public int LLLJ;
    public boolean LLLJIL;
    public final int[] LLLJL;
    public final C1318260kPQ LLLL;
    public final C1317550kOH LLLLII;
    public int LLLLIIIILLL;
    public C21577919cX LLLLIIL;
    public int LLLLIILL;
    public C21577919cX LLLLIILLL;
    public final int LLLLIL;
    public final int LLLLILI;
    public final float LLLLJ;
    public final float LLLLJI;
    public final float LLLLL;
    public final float LLLLLIL;
    public InterfaceC21576219cG LLLLLILLIL;
    public InterfaceC21576819cM LLLLLJIL;
    public C21560319Zh LLLLLJLJLL;
    public Paint LLLLLL;
    public final BPEAHandler LLLLLLIL;
    public final C21577019cO LLLLLLJ;
    public EnumC21577619cU LLLLLLL;
    public EnumC21577619cU LLLLLLLLL;
    public long LLLLLLLLLL;
    public int LLLLLLLZIL;
    public int LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public MotionEvent LLLLLZL;
    public Runnable LLLLZ;
    public ValueAnimator LLLLZI;

    public static void setDefaultRefreshFooterCreator(InterfaceC21578319cb interfaceC21578319cb) {
    }

    public static void setDefaultRefreshHeaderCreator(InterfaceC21578419cc interfaceC21578419cc) {
    }

    public static void setDefaultRefreshInitializer(InterfaceC21578519cd interfaceC21578519cd) {
    }

    public ViewGroup getLayout() {
        return this;
    }

    public final void LJIILJJIL() {
        EnumC21577619cU enumC21577619cU = this.LLLLLLL;
        EnumC21577619cU enumC21577619cU2 = EnumC21577619cU.TwoLevel;
        if (enumC21577619cU == enumC21577619cU2) {
            if (this.LLJJJIL > -1000 && this.LLILLJJLI > getMeasuredHeight() / 2) {
                ValueAnimator valueAnimatorLIZ = this.LLLLLLJ.LIZ(getMeasuredHeight());
                if (valueAnimatorLIZ != null) {
                    valueAnimatorLIZ.setDuration(this.LLILZIL);
                    return;
                }
                return;
            }
            if (this.LLJILLL) {
                C21577019cO c21577019cO = this.LLLLLLJ;
                C21576919cN c21576919cN = c21577019cO.LIZ;
                if (c21576919cN.LLLLLLL == enumC21577619cU2) {
                    c21576919cN.LLLLLLJ.LIZJ(EnumC21577619cU.TwoLevelFinish);
                    if (c21577019cO.LIZ.LLILLJJLI != 0) {
                        c21577019cO.LIZ(0).setDuration(c21577019cO.LIZ.LLILZIL);
                        return;
                    } else {
                        c21577019cO.LIZIZ(0, false);
                        c21577019cO.LIZ.LJIILIIL(EnumC21577619cU.None);
                        return;
                    }
                }
                return;
            }
            return;
        }
        EnumC21577619cU enumC21577619cU3 = EnumC21577619cU.Loading;
        if (enumC21577619cU == enumC21577619cU3 || (this.LLJLLL && this.LLLIIIL && this.LLLIIL && this.LLILLJJLI < 0 && LJIIJ(this.LLJL))) {
            int i = this.LLILLJJLI;
            int i2 = -this.LLLLIILL;
            if (i < i2) {
                this.LLLLLLJ.LIZ(i2);
                return;
            } else {
                if (i > 0) {
                    this.LLLLLLJ.LIZ(0);
                    return;
                }
                return;
            }
        }
        EnumC21577619cU enumC21577619cU4 = this.LLLLLLL;
        EnumC21577619cU enumC21577619cU5 = EnumC21577619cU.Refreshing;
        if (enumC21577619cU4 == enumC21577619cU5) {
            int i3 = this.LLILLJJLI;
            int i4 = this.LLLLIIIILLL;
            if (i3 > i4) {
                this.LLLLLLJ.LIZ(i4);
                return;
            } else {
                if (i3 < 0) {
                    this.LLLLLLJ.LIZ(0);
                    return;
                }
                return;
            }
        }
        if (enumC21577619cU4 == EnumC21577619cU.PullDownToRefresh) {
            this.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownCanceled);
            return;
        }
        if (enumC21577619cU4 == EnumC21577619cU.PullUpToLoad) {
            this.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpCanceled);
            return;
        }
        if (enumC21577619cU4 == EnumC21577619cU.ReleaseToRefresh) {
            this.LLLLLLJ.LIZJ(enumC21577619cU5);
            return;
        }
        if (enumC21577619cU4 == EnumC21577619cU.ReleaseToLoad) {
            this.LLLLLLJ.LIZJ(enumC21577619cU3);
            return;
        }
        if (enumC21577619cU4 == EnumC21577619cU.ReleaseToTwoLevel) {
            this.LLLLLLJ.LIZJ(EnumC21577619cU.TwoLevelReleased);
            return;
        }
        if (enumC21577619cU4 == EnumC21577619cU.RefreshReleased) {
            if (this.LLLLZI == null) {
                this.LLLLLLJ.LIZ(this.LLLLIIIILLL);
            }
        } else if (enumC21577619cU4 == EnumC21577619cU.LoadReleased) {
            if (this.LLLLZI == null) {
                this.LLLLLLJ.LIZ(-this.LLLLIILL);
            }
        } else if (this.LLILLJJLI != 0) {
            this.LLLLLLJ.LIZ(0);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        EnumC21577619cU enumC21577619cU;
        this.LLJJJJ.getCurrY();
        if (this.LLJJJJ.computeScrollOffset()) {
            int finalY = this.LLJJJJ.getFinalY();
            if (finalY >= 0 ? finalY <= 0 || !((this.LLJL || this.LLL) && this.LLLLLJLJLL.LJJJJI()) : !((this.LLJJLIIIJLLLLLLLZ || this.LLL) && this.LLLLLJLJLL.LIZ())) {
                this.LLLLLZIL = true;
                invalidate();
                return;
            }
            if (this.LLLLLZIL) {
                final float currVelocity = finalY > 0 ? -this.LLJJJJ.getCurrVelocity() : this.LLJJJJ.getCurrVelocity();
                if (this.LLLLZI == null) {
                    if (currVelocity > 0.0f && ((enumC21577619cU = this.LLLLLLL) == EnumC21577619cU.Refreshing || enumC21577619cU == EnumC21577619cU.TwoLevel)) {
                        final int i = this.LLLLIIIILLL;
                        this.LLLLZ = new Runnable(currVelocity, i) { // from class: X.19cR
                            public int LL;
                            public final int LLILLJJLI;
                            public long LLILLL = AnimationUtils.currentAnimationTimeMillis();
                            public float LLILZ;
                            public float LLILZIL;

                            public final void LIZ() {
                                C21576919cN c21576919cN = this.LLILZLL;
                                if (c21576919cN.LLLLZ != this || c21576919cN.LLLLLLL.isFinishing) {
                                    return;
                                }
                                if (Math.abs(c21576919cN.LLILLJJLI) < Math.abs(this.LLILLJJLI)) {
                                    double d = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d * Math.pow(0.949999988079071d, r0 * 2));
                                } else if (this.LLILLJJLI != 0) {
                                    double d2 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d2 * Math.pow(0.44999998807907104d, r0 * 2));
                                } else {
                                    double d3 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d3 * Math.pow(0.8500000238418579d, r0 * 2));
                                }
                                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                float f = this.LLILZIL * (((jCurrentAnimationTimeMillis - this.LLILLL) * 1.0f) / 1000.0f);
                                if (Math.abs(f) >= 1.0f) {
                                    this.LLILLL = jCurrentAnimationTimeMillis;
                                    float f2 = this.LLILZ + f;
                                    this.LLILZ = f2;
                                    this.LLILZLL.LJIIL(f2);
                                    C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                    return;
                                }
                                C21576919cN c21576919cN2 = this.LLILZLL;
                                EnumC21577619cU enumC21577619cU2 = c21576919cN2.LLLLLLLLL;
                                if (enumC21577619cU2.isDragging) {
                                    if (enumC21577619cU2.isHeader) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownCanceled);
                                    } else if (enumC21577619cU2.isFooter) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpCanceled);
                                    }
                                }
                                C21576919cN c21576919cN3 = this.LLILZLL;
                                c21576919cN3.LLLLZ = null;
                                if (Math.abs(c21576919cN3.LLILLJJLI) >= Math.abs(this.LLILLJJLI)) {
                                    int iMin = Math.min(Math.max((int) (Math.abs(this.LLILZLL.LLILLJJLI - this.LLILLJJLI) / C19ZZ.LIZIZ), 30), 100) * 10;
                                    C21576919cN c21576919cN4 = this.LLILZLL;
                                    c21576919cN4.LJI(this.LLILLJJLI, 0, c21576919cN4.LLJJJJLIIL, iMin);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                            }

                            {
                                this.LLILZIL = currVelocity;
                                this.LLILLJJLI = i;
                                C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                if (currVelocity > 0.0f) {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownToRefresh);
                                } else {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpToLoad);
                                }
                            }
                        };
                    } else if (currVelocity < 0.0f && (this.LLLLLLL == EnumC21577619cU.Loading || ((this.LLJLLL && this.LLLIIIL && this.LLLIIL && LJIIJ(this.LLJL)) || (this.LLLF && !this.LLLIIIL && LJIIJ(this.LLJL) && this.LLLLLLL != EnumC21577619cU.Refreshing)))) {
                        final int i2 = -this.LLLLIILL;
                        this.LLLLZ = new Runnable(currVelocity, i2) { // from class: X.19cR
                            public int LL;
                            public final int LLILLJJLI;
                            public long LLILLL = AnimationUtils.currentAnimationTimeMillis();
                            public float LLILZ;
                            public float LLILZIL;

                            public final void LIZ() {
                                C21576919cN c21576919cN = this.LLILZLL;
                                if (c21576919cN.LLLLZ != this || c21576919cN.LLLLLLL.isFinishing) {
                                    return;
                                }
                                if (Math.abs(c21576919cN.LLILLJJLI) < Math.abs(this.LLILLJJLI)) {
                                    double d = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d * Math.pow(0.949999988079071d, r0 * 2));
                                } else if (this.LLILLJJLI != 0) {
                                    double d2 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d2 * Math.pow(0.44999998807907104d, r0 * 2));
                                } else {
                                    double d3 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d3 * Math.pow(0.8500000238418579d, r0 * 2));
                                }
                                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                float f = this.LLILZIL * (((jCurrentAnimationTimeMillis - this.LLILLL) * 1.0f) / 1000.0f);
                                if (Math.abs(f) >= 1.0f) {
                                    this.LLILLL = jCurrentAnimationTimeMillis;
                                    float f2 = this.LLILZ + f;
                                    this.LLILZ = f2;
                                    this.LLILZLL.LJIIL(f2);
                                    C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                    return;
                                }
                                C21576919cN c21576919cN2 = this.LLILZLL;
                                EnumC21577619cU enumC21577619cU2 = c21576919cN2.LLLLLLLLL;
                                if (enumC21577619cU2.isDragging) {
                                    if (enumC21577619cU2.isHeader) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownCanceled);
                                    } else if (enumC21577619cU2.isFooter) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpCanceled);
                                    }
                                }
                                C21576919cN c21576919cN3 = this.LLILZLL;
                                c21576919cN3.LLLLZ = null;
                                if (Math.abs(c21576919cN3.LLILLJJLI) >= Math.abs(this.LLILLJJLI)) {
                                    int iMin = Math.min(Math.max((int) (Math.abs(this.LLILZLL.LLILLJJLI - this.LLILLJJLI) / C19ZZ.LIZIZ), 30), 100) * 10;
                                    C21576919cN c21576919cN4 = this.LLILZLL;
                                    c21576919cN4.LJI(this.LLILLJJLI, 0, c21576919cN4.LLJJJJLIIL, iMin);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                            }

                            {
                                this.LLILZIL = currVelocity;
                                this.LLILLJJLI = i2;
                                C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                if (currVelocity > 0.0f) {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownToRefresh);
                                } else {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpToLoad);
                                }
                            }
                        };
                    } else if (this.LLILLJJLI == 0 && this.LLJZIJLIL) {
                        final int i3 = 0;
                        this.LLLLZ = new Runnable(currVelocity, i3) { // from class: X.19cR
                            public int LL;
                            public final int LLILLJJLI;
                            public long LLILLL = AnimationUtils.currentAnimationTimeMillis();
                            public float LLILZ;
                            public float LLILZIL;

                            public final void LIZ() {
                                C21576919cN c21576919cN = this.LLILZLL;
                                if (c21576919cN.LLLLZ != this || c21576919cN.LLLLLLL.isFinishing) {
                                    return;
                                }
                                if (Math.abs(c21576919cN.LLILLJJLI) < Math.abs(this.LLILLJJLI)) {
                                    double d = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d * Math.pow(0.949999988079071d, r0 * 2));
                                } else if (this.LLILLJJLI != 0) {
                                    double d2 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d2 * Math.pow(0.44999998807907104d, r0 * 2));
                                } else {
                                    double d3 = this.LLILZIL;
                                    this.LL = this.LL + 1;
                                    this.LLILZIL = (float) (d3 * Math.pow(0.8500000238418579d, r0 * 2));
                                }
                                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                                float f = this.LLILZIL * (((jCurrentAnimationTimeMillis - this.LLILLL) * 1.0f) / 1000.0f);
                                if (Math.abs(f) >= 1.0f) {
                                    this.LLILLL = jCurrentAnimationTimeMillis;
                                    float f2 = this.LLILZ + f;
                                    this.LLILZ = f2;
                                    this.LLILZLL.LJIIL(f2);
                                    C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                    return;
                                }
                                C21576919cN c21576919cN2 = this.LLILZLL;
                                EnumC21577619cU enumC21577619cU2 = c21576919cN2.LLLLLLLLL;
                                if (enumC21577619cU2.isDragging) {
                                    if (enumC21577619cU2.isHeader) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownCanceled);
                                    } else if (enumC21577619cU2.isFooter) {
                                        c21576919cN2.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpCanceled);
                                    }
                                }
                                C21576919cN c21576919cN3 = this.LLILZLL;
                                c21576919cN3.LLLLZ = null;
                                if (Math.abs(c21576919cN3.LLILLJJLI) >= Math.abs(this.LLILLJJLI)) {
                                    int iMin = Math.min(Math.max((int) (Math.abs(this.LLILZLL.LLILLJJLI - this.LLILLJJLI) / C19ZZ.LIZIZ), 30), 100) * 10;
                                    C21576919cN c21576919cN4 = this.LLILZLL;
                                    c21576919cN4.LJI(this.LLILLJJLI, 0, c21576919cN4.LLJJJJLIIL, iMin);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SmartRefreshLayout$BounceRunnable@b31c.run");
                            }

                            {
                                this.LLILZIL = currVelocity;
                                this.LLILLJJLI = i3;
                                C786410Ut5.LJLIIL(10, this.LLILZLL.LLLLLLIL, this);
                                if (currVelocity > 0.0f) {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownToRefresh);
                                } else {
                                    this.LLILZLL.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpToLoad);
                                }
                            }
                        };
                    }
                }
            }
            this.LLJJJJ.forceFinished(true);
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLLLII;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    public InterfaceC21576819cM getRefreshFooter() {
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (interfaceC21576819cM instanceof InterfaceC21576819cM) {
            return interfaceC21576819cM;
        }
        return null;
    }

    public InterfaceC21576219cG getRefreshHeader() {
        InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
        if (interfaceC21576219cG instanceof InterfaceC21576219cG) {
            return interfaceC21576219cG;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        if (this.LLLII) {
            return this.LLL || this.LLJJLIIIJLLLLLLLZ || this.LLJL;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC21576819cM interfaceC21576819cM;
        super.onAttachedToWindow();
        boolean z = true;
        this.LLLLLLZZ = true;
        if (!isInEditMode()) {
            if (this.LLLLLILLIL == null) {
                LJIJ(new C19PV(getContext()));
            }
            if (this.LLLLLJIL == null) {
                boolean z2 = this.LLJL;
                LJIIZILJ(new C19PT(getContext()));
                this.LLJL = z2;
            } else {
                if (!this.LLJL && this.LLLIILIL) {
                    z = false;
                }
                this.LLJL = z;
            }
            if (this.LLLLLJLJLL == null) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
                    if ((interfaceC21576219cG == null || childAt != interfaceC21576219cG.getView()) && ((interfaceC21576819cM = this.LLLLLJIL) == null || childAt != interfaceC21576819cM.getView())) {
                        this.LLLLLJLJLL = new C21560319Zh(childAt);
                    }
                }
            }
            if (this.LLLLLJLJLL == null) {
                int iLIZJ = C19ZZ.LIZJ(20.0f);
                TextView textView = new TextView(getContext());
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText(2131848716);
                super.addView(textView, 0, new C19PS(-1));
                C21560319Zh c21560319Zh = new C21560319Zh(textView);
                this.LLLLLJLJLL = c21560319Zh;
                c21560319Zh.LL.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
            }
            View viewFindViewById = findViewById(this.LLJJI);
            View viewFindViewById2 = findViewById(this.LLJJIII);
            this.LLLLLJLJLL.LJI();
            C21560319Zh c21560319Zh2 = this.LLLLLJLJLL;
            c21560319Zh2.LLJ.LIZJ = this.LLLI;
            c21560319Zh2.LJII(this.LLLLLLJ, viewFindViewById, viewFindViewById2);
            if (this.LLILLJJLI != 0) {
                LJIILIIL(EnumC21577619cU.None);
                C21560319Zh c21560319Zh3 = this.LLLLLJLJLL;
                this.LLILLJJLI = 0;
                c21560319Zh3.LIZLLL(0, this.LLJJIJI, this.LLJJIJIIJIL);
            }
        }
        int[] iArr = this.LLJJL;
        if (iArr != null) {
            InterfaceC21576219cG interfaceC21576219cG2 = this.LLLLLILLIL;
            if (interfaceC21576219cG2 != null) {
                interfaceC21576219cG2.setPrimaryColors(iArr);
            }
            InterfaceC21576819cM interfaceC21576819cM2 = this.LLLLLJIL;
            if (interfaceC21576819cM2 != null) {
                interfaceC21576819cM2.setPrimaryColors(this.LLJJL);
            }
        }
        C21560319Zh c21560319Zh4 = this.LLLLLJLJLL;
        if (c21560319Zh4 != null) {
            super.bringChildToFront(c21560319Zh4.LL);
        }
        InterfaceC21576219cG interfaceC21576219cG3 = this.LLLLLILLIL;
        if (interfaceC21576219cG3 != null && interfaceC21576219cG3.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLLLLILLIL.getView());
        }
        InterfaceC21576819cM interfaceC21576819cM3 = this.LLLLLJIL;
        if (interfaceC21576819cM3 == null || !interfaceC21576819cM3.getSpinnerStyle().LIZ) {
            return;
        }
        super.bringChildToFront(this.LLLLLJIL.getView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLLLLZZ = false;
        this.LLLLLLJ.LIZIZ(0, true);
        LJIILIIL(EnumC21577619cU.None);
        BPEAHandler bPEAHandler = this.LLLLLLIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLLIILIL = true;
        this.LLLLZ = null;
        ValueAnimator valueAnimator = this.LLLLZI;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.LLLLZI.removeAllUpdateListeners();
            this.LLLLZI.cancel();
            this.LLLLZI = null;
        }
        this.LLLLLZ = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() {
        /*
            r10 = this;
            super.onFinishInflate()
            int r6 = super.getChildCount()
            r9 = 3
            if (r6 > r9) goto L9a
            r5 = -1
            r8 = -1
            r7 = 0
            r3 = 0
        Le:
            r2 = 1
            r4 = 2
            if (r7 >= r6) goto L32
            android.view.View r1 = super.getChildAt(r7)
            boolean r0 = X.C19ZZ.LIZLLL(r1)
            if (r0 == 0) goto L25
            if (r3 < r4) goto L20
            if (r7 != r2) goto L25
        L20:
            r8 = r7
            r3 = 2
        L22:
            int r7 = r7 + 1
            goto Le
        L25:
            boolean r0 = r1 instanceof X.InterfaceC21576419cI
            if (r0 != 0) goto L22
            if (r3 >= r2) goto L22
            if (r7 <= 0) goto L30
            r3 = 1
        L2e:
            r8 = r7
            goto L22
        L30:
            r3 = 0
            goto L2e
        L32:
            if (r8 < 0) goto L96
            X.19Zh r1 = new X.19Zh
            android.view.View r0 = super.getChildAt(r8)
            r1.<init>(r0)
            r10.LLLLLJLJLL = r1
            if (r8 != r2) goto L91
            if (r6 == r9) goto L44
            r4 = -1
        L44:
            r3 = 0
        L45:
            r2 = 0
        L46:
            if (r2 >= r6) goto L99
            android.view.View r1 = super.getChildAt(r2)
            if (r2 == r3) goto L5a
            if (r2 == r4) goto L6c
            if (r3 != r5) goto L6c
            X.19cG r0 = r10.LLLLLILLIL
            if (r0 != 0) goto L6c
            boolean r0 = r1 instanceof X.InterfaceC21576219cG
            if (r0 == 0) goto L6c
        L5a:
            boolean r0 = r1 instanceof X.InterfaceC21576219cG
            if (r0 == 0) goto L65
            X.19cG r1 = (X.InterfaceC21576219cG) r1
        L60:
            r10.LLLLLILLIL = r1
        L62:
            int r2 = r2 + 1
            goto L46
        L65:
            X.19cL r0 = new X.19cL
            r0.<init>(r1)
            r1 = r0
            goto L60
        L6c:
            if (r2 == r4) goto L74
            if (r4 != r5) goto L62
            boolean r0 = r1 instanceof X.InterfaceC21576819cM
            if (r0 == 0) goto L62
        L74:
            boolean r0 = r10.LLJL
            if (r0 != 0) goto L8f
            boolean r0 = r10.LLLIILIL
            if (r0 == 0) goto L8f
            r0 = 0
        L7d:
            r10.LLJL = r0
            boolean r0 = r1 instanceof X.InterfaceC21576819cM
            if (r0 == 0) goto L88
            X.19cM r1 = (X.InterfaceC21576819cM) r1
        L85:
            r10.LLLLLJIL = r1
            goto L62
        L88:
            X.19cK r0 = new X.19cK
            r0.<init>(r1)
            r1 = r0
            goto L85
        L8f:
            r0 = 1
            goto L7d
        L91:
            if (r6 != r4) goto L96
            r3 = -1
            r4 = 1
            goto L45
        L96:
            r3 = -1
            r4 = -1
            goto L45
        L99:
            return
        L9a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Most only support three sub view"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21576919cN.onFinishInflate():void");
    }

    public EnumC21577619cU getState() {
        return this.LLLLLLL;
    }

    public C21576919cN(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        C21577919cX c21577919cX;
        C21577919cX c21577919cX2;
        super(context, null);
        this.LLILZIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLILZLL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLJILJIL = 0.5f;
        this.LLJILJILJ = 'n';
        this.LLJJI = -1;
        this.LLJJIII = -1;
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = -1;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJLIL = true;
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
        this.LLJLLIL = true;
        this.LLJZ = true;
        this.LLJZIJLIL = true;
        this.LLLF = true;
        this.LLLFFI = true;
        this.LLLFZ = true;
        this.LLLI = true;
        this.LLLII = true;
        this.LLLJL = new int[2];
        C1318260kPQ c1318260kPQ = new C1318260kPQ(this);
        this.LLLL = c1318260kPQ;
        this.LLLLII = new C1317550kOH();
        C21577919cX c21577919cX3 = C21577919cX.LIZJ;
        this.LLLLIIL = c21577919cX3;
        this.LLLLIILLL = c21577919cX3;
        this.LLLLJ = 2.5f;
        this.LLLLJI = 2.5f;
        this.LLLLL = 1.0f;
        this.LLLLLIL = 1.0f;
        this.LLLLLLJ = new C21577019cO(this);
        EnumC21577619cU enumC21577619cU = EnumC21577619cU.None;
        this.LLLLLLL = enumC21577619cU;
        this.LLLLLLLLL = enumC21577619cU;
        this.LLLLLLLLLL = 0L;
        this.LLLLLLLZIL = 0;
        this.LLLLLLZ = 0;
        this.LLLLLZ = false;
        this.LLLLLZIL = false;
        this.LLLLLZL = null;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LLLLLLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJJJ = new Scroller(context);
        this.LLJJJJJIL = VelocityTracker.obtain();
        this.LLIZ = context.getResources().getDisplayMetrics().heightPixels;
        this.LLJJJJLIIL = new C19ZZ(0);
        this.LL = viewConfiguration.getScaledTouchSlop();
        this.LLJJIJIL = viewConfiguration.getScaledMinimumFlingVelocity();
        this.LLJJJ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLLLIILL = C19ZZ.LIZJ(60.0f);
        this.LLLLIIIILLL = C19ZZ.LIZJ(100.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.SmartRefreshLayout);
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipToPadding)) {
            super.setClipToPadding(false);
        }
        if (!typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_android_clipChildren)) {
            super.setClipChildren(false);
        }
        this.LLJILJIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlDragRate, 0.5f);
        this.LLLLJ = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderMaxDragRate, 2.5f);
        this.LLLLJI = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterMaxDragRate, 2.5f);
        this.LLLLL = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlHeaderTriggerRate, 1.0f);
        this.LLLLLIL = typedArrayObtainStyledAttributes.getFloat(R$styleable.SmartRefreshLayout_srlFooterTriggerRate, 1.0f);
        this.LLJJLIIIJLLLLLLLZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableRefresh, this.LLJJLIIIJLLLLLLLZ);
        this.LLILZLL = typedArrayObtainStyledAttributes.getInt(R$styleable.SmartRefreshLayout_srlReboundDuration, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        this.LLJL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableLoadMore, this.LLJL);
        this.LLLLIIIILLL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlHeaderHeight, this.LLLLIIIILLL);
        this.LLLLIILL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlFooterHeight, this.LLLLIILL);
        this.LLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlHeaderInsetStart, this.LLLLIL);
        this.LLLLILI = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.SmartRefreshLayout_srlFooterInsetStart, this.LLLLILI);
        this.LLLIIII = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenRefresh, this.LLLIIII);
        this.LLLIIIIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlDisableContentWhenLoading, this.LLLIIIIL);
        this.LLJLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent, true);
        this.LLJLLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterTranslationContent, true);
        this.LLJZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePreviewInEditMode, true);
        this.LLLF = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableAutoLoadMore, this.LLLF);
        this.LLJZIJLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollBounce, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnablePureScrollMode, this.LLLFF);
        this.LLLFF = z4;
        this.LLLFFI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenLoaded, true);
        this.LLLFZ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableScrollContentWhenRefreshed, true);
        this.LLLI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableLoadMoreWhenContentNotFull, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenLoadFinished, this.LLJLLL);
        this.LLJLLL = z5;
        this.LLJLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableFooterFollowWhenNoMoreData, z5);
        this.LLJLIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipHeaderWhenFixedBehind, true);
        this.LLJLILLLLZIIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableClipFooterWhenFixedBehind, true);
        this.LLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableOverScrollDrag, this.LLL);
        this.LLJJI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedHeaderViewId, -1);
        this.LLJJIII = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFixedFooterViewId, -1);
        this.LLJJIJI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlHeaderTranslationViewId, -1);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.SmartRefreshLayout_srlFooterTranslationViewId, -1);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SmartRefreshLayout_srlEnableNestedScrolling, this.LLLII);
        this.LLLII = z6;
        c1318260kPQ.LJIIIZ(z6);
        if (!this.LLLIILIL && !typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_srlEnableLoadMore)) {
            z = false;
        } else {
            z = true;
        }
        this.LLLIILIL = z;
        if (!this.LLLIL && !typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_srlEnableHeaderTranslationContent)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.LLLIL = z2;
        if (!this.LLLILZ && !typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_srlEnableFooterTranslationContent)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.LLLILZ = z3;
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_srlHeaderHeight)) {
            c21577919cX = C21577919cX.LJFF;
        } else {
            c21577919cX = this.LLLLIIL;
        }
        this.LLLLIIL = c21577919cX;
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.SmartRefreshLayout_srlFooterHeight)) {
            c21577919cX2 = C21577919cX.LJFF;
        } else {
            c21577919cX2 = this.LLLLIILLL;
        }
        this.LLLLIILLL = c21577919cX2;
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlAccentColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.SmartRefreshLayout_srlPrimaryColor, 0);
        if (color2 != 0) {
            if (color != 0) {
                this.LLJJL = new int[]{color2, color};
            } else {
                this.LLJJL = new int[]{color2};
            }
        } else if (color != 0) {
            this.LLJJL = new int[]{0, color};
        }
        if (z4 && !this.LLLIILIL && !this.LLJL) {
            this.LLJL = true;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean LJIIIZ(int i) {
        if (i == 0) {
            if (this.LLLLZI != null) {
                EnumC21577619cU enumC21577619cU = this.LLLLLLL;
                if (enumC21577619cU.isFinishing || enumC21577619cU == EnumC21577619cU.TwoLevelReleased) {
                    return true;
                }
                if (enumC21577619cU == EnumC21577619cU.PullDownCanceled) {
                    this.LLLLLLJ.LIZJ(EnumC21577619cU.PullDownToRefresh);
                } else if (enumC21577619cU == EnumC21577619cU.PullUpCanceled) {
                    this.LLLLLLJ.LIZJ(EnumC21577619cU.PullUpToLoad);
                }
                this.LLLLZI.cancel();
                this.LLLLZI = null;
            }
            this.LLLLZ = null;
        }
        if (this.LLLLZI != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(boolean z) {
        if (z && !this.LLLFF) {
            return true;
        }
        return false;
    }

    public final void LJIIL(float f) {
        EnumC21577619cU enumC21577619cU;
        if (this.LLLJIL && !this.LLLI && f < 0.0f && !this.LLLLLJLJLL.LJJJJI()) {
            f = 0.0f;
        }
        EnumC21577619cU enumC21577619cU2 = this.LLLLLLL;
        if (enumC21577619cU2 == EnumC21577619cU.TwoLevel && f > 0.0f) {
            this.LLLLLLJ.LIZIZ(Math.min((int) f, getMeasuredHeight()), true);
        } else if (enumC21577619cU2 == EnumC21577619cU.Refreshing && f >= 0.0f) {
            float f2 = this.LLLLIIIILLL;
            if (f < f2) {
                this.LLLLLLJ.LIZIZ((int) f, true);
            } else {
                double d = (this.LLLLJ - 1.0f) * f2;
                int iMax = Math.max((this.LLIZ * 4) / 3, getHeight());
                int i = this.LLLLIIIILLL;
                double d2 = iMax - i;
                double dMax = Math.max(0.0f, (f - i) * this.LLJILJIL);
                double d3 = -dMax;
                if (d2 == 0.0d) {
                    d2 = 1.0d;
                }
                this.LLLLLLJ.LIZIZ(((int) Math.min(d * (1.0d - Math.pow(100.0d, d3 / d2)), dMax)) + this.LLLLIIIILLL, true);
            }
        } else if (f < 0.0f && (enumC21577619cU2 == EnumC21577619cU.Loading || ((this.LLJLLL && this.LLLIIIL && this.LLLIIL && LJIIJ(this.LLJL)) || (this.LLLF && !this.LLLIIIL && LJIIJ(this.LLJL))))) {
            int i2 = this.LLLLIILL;
            if (f > (-i2)) {
                this.LLLLLLJ.LIZIZ((int) f, true);
            } else {
                double d4 = (this.LLLLJI - 1.0f) * i2;
                int iMax2 = Math.max((this.LLIZ * 4) / 3, getHeight());
                int i3 = this.LLLLIILL;
                double d5 = iMax2 - i3;
                double d6 = -Math.min(0.0f, (i3 + f) * this.LLJILJIL);
                double d7 = -d6;
                if (d5 == 0.0d) {
                    d5 = 1.0d;
                }
                this.LLLLLLJ.LIZIZ(((int) (-Math.min(d4 * (1.0d - Math.pow(100.0d, d7 / d5)), d6))) - this.LLLLIILL, true);
            }
        } else if (f >= 0.0f) {
            double d8 = this.LLLLJ * this.LLLLIIIILLL;
            double dMax2 = Math.max(this.LLIZ / 2, getHeight());
            double dMax3 = Math.max(0.0f, this.LLJILJIL * f);
            double d9 = -dMax3;
            if (dMax2 == 0.0d) {
                dMax2 = 1.0d;
            }
            this.LLLLLLJ.LIZIZ((int) Math.min(d8 * (1.0d - Math.pow(100.0d, d9 / dMax2)), dMax3), true);
        } else {
            double d10 = this.LLLLJI * this.LLLLIILL;
            double dMax4 = Math.max(this.LLIZ / 2, getHeight());
            double d11 = -Math.min(0.0f, this.LLJILJIL * f);
            double d12 = -d11;
            if (dMax4 == 0.0d) {
                dMax4 = 1.0d;
            }
            this.LLLLLLJ.LIZIZ((int) (-Math.min(d10 * (1.0d - Math.pow(100.0d, d12 / dMax4)), d11)), true);
        }
        if (this.LLLF && !this.LLLIIIL && LJIIJ(this.LLJL) && f < 0.0f && (enumC21577619cU = this.LLLLLLL) != EnumC21577619cU.Refreshing && enumC21577619cU != EnumC21577619cU.Loading && enumC21577619cU != EnumC21577619cU.LoadFinish) {
            if (this.LLLIIIIL) {
                this.LLLLZ = null;
                this.LLLLLLJ.LIZ(-this.LLLLIILL);
            }
            setStateDirectLoading(false);
            C786410Ut5.LJLIIL(this.LLILZLL, this.LLLLLLIL, new ARunnableS133S0100000_33(this, 122));
        }
    }

    public final void LJIILIIL(EnumC21577619cU enumC21577619cU) {
        EnumC21577619cU enumC21577619cU2 = this.LLLLLLL;
        if (enumC21577619cU2 != enumC21577619cU) {
            this.LLLLLLL = enumC21577619cU;
            this.LLLLLLLLL = enumC21577619cU;
            InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
            InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
            InterfaceC21577819cW interfaceC21577819cW = this.LLLIZZ;
            if (interfaceC21576219cG != null) {
                interfaceC21576219cG.LJIIJ(this, enumC21577619cU2, enumC21577619cU);
            }
            if (interfaceC21576819cM != null) {
                interfaceC21576819cM.LJIIJ(this, enumC21577619cU2, enumC21577619cU);
            }
            if (interfaceC21577819cW != null) {
                interfaceC21577819cW.LJIIJ(this, enumC21577619cU2, enumC21577619cU);
            }
            if (enumC21577619cU == EnumC21577619cU.LoadFinish) {
                this.LLLLLZ = false;
                return;
            }
            return;
        }
        if (this.LLLLLLLLL == enumC21577619cU2) {
            return;
        }
        this.LLLLLLLLL = enumC21577619cU2;
    }

    public final void LJIILL(boolean z) {
        EnumC21577619cU enumC21577619cU = this.LLLLLLL;
        if (enumC21577619cU == EnumC21577619cU.Refreshing && z) {
            LJIIIIZZ(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.LLLLLLLLLL))), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) << 16, Boolean.TRUE, true);
            return;
        }
        if (enumC21577619cU == EnumC21577619cU.Loading && z) {
            LJII(Math.min(Math.max(0, 300 - ((int) (System.currentTimeMillis() - this.LLLLLLLLLL))), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL) << 16, true);
            return;
        }
        if (this.LLLIIIL == z) {
            return;
        }
        this.LLLIIIL = z;
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (!(interfaceC21576819cM instanceof InterfaceC21576819cM)) {
            return;
        }
        if (interfaceC21576819cM.LJIILJJIL(z)) {
            this.LLLIIL = true;
            if (!this.LLLIIIL || !this.LLJLLL || this.LLILLJJLI <= 0 || this.LLLLLJIL.getSpinnerStyle() != C19PY.LIZJ || !LJIIJ(this.LLJL) || !LJIIJJI(this.LLJJLIIIJLLLLLLLZ, this.LLLLLILLIL)) {
                return;
            }
            C786410Ut5.ed(this.LLLLLJIL.getView(), this.LLILLJJLI);
            return;
        }
        this.LLLIIL = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Footer:");
        sbLIZ.append(this.LLLLLJIL);
        sbLIZ.append(" NoMoreData is not supported");
        new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19PU LJIILLIIL(View view) {
        C21560319Zh c21560319Zh = this.LLLLLJLJLL;
        if (c21560319Zh != null) {
            super.removeView(c21560319Zh.LL);
        }
        this.LLLLLJLJLL = new C21560319Zh(view);
        super.addView(view, getChildCount(), new C19PS(-1));
        if (this.LLLLLLZZ) {
            View viewFindViewById = findViewById(this.LLJJI);
            View viewFindViewById2 = findViewById(this.LLJJIII);
            this.LLLLLJLJLL.LJI();
            C21560319Zh c21560319Zh2 = this.LLLLLJLJLL;
            c21560319Zh2.LLJ.LIZJ = this.LLLI;
            c21560319Zh2.LJII(this.LLLLLLJ, viewFindViewById, viewFindViewById2);
        }
        InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
        if (interfaceC21576219cG != null && interfaceC21576219cG.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLLLLILLIL.getView());
        }
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (interfaceC21576819cM != null && interfaceC21576819cM.getSpinnerStyle().LIZ) {
            super.bringChildToFront(this.LLLLLJIL.getView());
        }
        return this;
    }

    public final void LJIIZILJ(InterfaceC21576819cM interfaceC21576819cM) {
        boolean z;
        InterfaceC21576819cM interfaceC21576819cM2;
        InterfaceC21576819cM interfaceC21576819cM3 = this.LLLLLJIL;
        if (interfaceC21576819cM3 != null) {
            super.removeView(interfaceC21576819cM3.getView());
        }
        this.LLLLLJIL = interfaceC21576819cM;
        this.LLLLLZ = false;
        this.LLLLLLZ = 0;
        this.LLLIIL = false;
        C21577919cX c21577919cX = this.LLLLIILLL;
        if (c21577919cX.LIZIZ) {
            c21577919cX = C21577919cX.LJII[c21577919cX.LIZ - 1];
            if (c21577919cX.LIZIZ) {
                c21577919cX = C21577919cX.LIZJ;
            }
        }
        this.LLLLIILLL = c21577919cX;
        if (this.LLLIILIL && !this.LLJL) {
            z = false;
        } else {
            z = true;
        }
        this.LLJL = z;
        if (interfaceC21576819cM.getSpinnerStyle().LIZ) {
            super.addView(this.LLLLLJIL.getView(), getChildCount(), new C19PS(-2));
        } else {
            super.addView(this.LLLLLJIL.getView(), 0, new C19PS(-2));
        }
        int[] iArr = this.LLJJL;
        if (iArr != null && (interfaceC21576819cM2 = this.LLLLLJIL) != null) {
            interfaceC21576819cM2.setPrimaryColors(iArr);
        }
    }

    public final void LJIJ(InterfaceC21576219cG interfaceC21576219cG) {
        InterfaceC21576219cG interfaceC21576219cG2;
        InterfaceC21576219cG interfaceC21576219cG3 = this.LLLLLILLIL;
        if (interfaceC21576219cG3 != null) {
            super.removeView(interfaceC21576219cG3.getView());
        }
        this.LLLLLILLIL = interfaceC21576219cG;
        this.LLLLLLLZIL = 0;
        C21577919cX c21577919cX = this.LLLLIIL;
        if (c21577919cX.LIZIZ) {
            c21577919cX = C21577919cX.LJII[c21577919cX.LIZ - 1];
            if (c21577919cX.LIZIZ) {
                c21577919cX = C21577919cX.LIZJ;
            }
        }
        this.LLLLIIL = c21577919cX;
        if (interfaceC21576219cG.getSpinnerStyle().LIZ) {
            super.addView(this.LLLLLILLIL.getView(), getChildCount(), new C19PS(-2));
        } else {
            super.addView(this.LLLLLILLIL.getView(), 0, new C19PS(-2));
        }
        int[] iArr = this.LLJJL;
        if (iArr != null && (interfaceC21576219cG2 = this.LLLLLILLIL) != null) {
            interfaceC21576219cG2.setPrimaryColors(iArr);
        }
    }

    public boolean LJIJI(float f) {
        EnumC21577619cU enumC21577619cU;
        float f2 = f;
        if (f2 == 0.0f) {
            f2 = this.LLJJJIL;
        }
        if (Build.VERSION.SDK_INT > 27 && this.LLLLLJLJLL != null) {
            getScaleY();
            View view = this.LLLLLJLJLL.LL;
            if (getScaleY() == -1.0f && view.getScaleY() == -1.0f) {
                f2 = -f2;
            }
        }
        int i = 0;
        if (Math.abs(f2) > this.LLJJIJIL) {
            int i2 = this.LLILLJJLI;
            if (i2 * f2 < 0.0f) {
                EnumC21577619cU enumC21577619cU2 = this.LLLLLLL;
                EnumC21577619cU enumC21577619cU3 = EnumC21577619cU.Refreshing;
                if (enumC21577619cU2 == enumC21577619cU3 || enumC21577619cU2 == EnumC21577619cU.Loading || (i2 < 0 && this.LLLIIIL)) {
                    RunnableC21577419cS runnableC21577419cS = new RunnableC21577419cS(this, f2);
                    EnumC21577619cU enumC21577619cU4 = this.LLLLLLL;
                    if (!enumC21577619cU4.isFinishing) {
                        if (this.LLILLJJLI != 0 && ((!enumC21577619cU4.isOpening && (!this.LLLIIIL || !this.LLJLLL || !this.LLLIIL || !LJIIJ(this.LLJL))) || (((this.LLLLLLL == EnumC21577619cU.Loading || (this.LLLIIIL && this.LLJLLL && this.LLLIIL && LJIIJ(this.LLJL))) && this.LLILLJJLI < (-this.LLLLIILL)) || (this.LLLLLLL == enumC21577619cU3 && this.LLILLJJLI > this.LLLLIIIILLL)))) {
                            int i3 = this.LLILLJJLI;
                            float fPow = runnableC21577419cS.LLILLJJLI;
                            int i4 = i3;
                            while (true) {
                                if (i3 * i4 <= 0) {
                                    break;
                                }
                                i++;
                                fPow = (float) (((double) fPow) * Math.pow(0.98f, (i * 10) / 10.0f));
                                float f3 = ((10 * 1.0f) / 1000.0f) * fPow;
                                if (Math.abs(f3) < 1.0f) {
                                    C21576919cN c21576919cN = runnableC21577419cS.LLILZIL;
                                    EnumC21577619cU enumC21577619cU5 = c21576919cN.LLLLLLL;
                                    if (!enumC21577619cU5.isOpening || ((enumC21577619cU5 == (enumC21577619cU = EnumC21577619cU.Refreshing) && i4 > c21576919cN.LLLLIIIILLL) || (enumC21577619cU5 != enumC21577619cU && i4 < (-c21576919cN.LLLLIILL)))) {
                                    }
                                } else {
                                    i4 = (int) (i4 + f3);
                                }
                            }
                            runnableC21577419cS = null;
                        }
                        runnableC21577419cS.LLILLL = AnimationUtils.currentAnimationTimeMillis();
                        C786410Ut5.LJLIIL(10, runnableC21577419cS.LLILZIL.LLLLLLIL, runnableC21577419cS);
                    } else {
                        runnableC21577419cS = null;
                    }
                    this.LLLLZ = runnableC21577419cS;
                    return true;
                }
                if (enumC21577619cU2.isReleaseToOpening) {
                    return true;
                }
            }
            if ((f2 < 0.0f && ((this.LLJZIJLIL && (this.LLJL || this.LLL)) || ((this.LLLLLLL == EnumC21577619cU.Loading && i2 >= 0) || (this.LLLF && LJIIJ(this.LLJL))))) || (f2 > 0.0f && ((this.LLJZIJLIL && this.LLJJLIIIJLLLLLLLZ) || this.LLL || (this.LLLLLLL == EnumC21577619cU.Refreshing && this.LLILLJJLI <= 0)))) {
                this.LLLLLZIL = false;
                this.LLJJJJ.fling(0, 0, 0, (int) (-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
                this.LLJJJJ.computeScrollOffset();
                invalidate();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02d9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21576919cN.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19PS(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.LLLLII.LIZIZ(0);
        this.LLLJIL = false;
        this.LLLJ = 0;
        LJIILJJIL();
        this.LLLL.LJIIJJI(0);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLLII = z;
        this.LLLL.LJIIIZ(z);
    }

    public void setStateDirectLoading(boolean z) {
        EnumC21577619cU enumC21577619cU = this.LLLLLLL;
        EnumC21577619cU enumC21577619cU2 = EnumC21577619cU.Loading;
        if (enumC21577619cU != enumC21577619cU2) {
            this.LLLLLLLLLL = System.currentTimeMillis();
            this.LLLLLZ = true;
            LJIILIIL(enumC21577619cU2);
            InterfaceC21578119cZ interfaceC21578119cZ = this.LLLILZLLLI;
            if (interfaceC21578119cZ != null) {
                if (z) {
                    interfaceC21578119cZ.LJJIIJ();
                }
            } else if (this.LLLIZZ == null) {
                LJII(2000, false);
            }
            InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
            if (interfaceC21576819cM != null) {
                int i = this.LLLLIILL;
                interfaceC21576819cM.LIZ(this, i, (int) (this.LLLLJI * i));
            }
            InterfaceC21577819cW interfaceC21577819cW = this.LLLIZZ;
            if (interfaceC21577819cW != null && (this.LLLLLJIL instanceof InterfaceC21576819cM)) {
                if (z) {
                    interfaceC21577819cW.LJJIIJ();
                }
                this.LLLIZZ.LJIIIIZZ();
            }
        }
    }

    public void setStateLoading(boolean z) {
        ALAdapterS14S0110000_33 aLAdapterS14S0110000_33 = new ALAdapterS14S0110000_33(this, z, 4);
        LJIILIIL(EnumC21577619cU.LoadReleased);
        ValueAnimator valueAnimatorLIZ = this.LLLLLLJ.LIZ(-this.LLLLIILL);
        if (valueAnimatorLIZ != null) {
            valueAnimatorLIZ.addListener(aLAdapterS14S0110000_33);
        }
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (interfaceC21576819cM != null) {
            int i = this.LLLLIILL;
            interfaceC21576819cM.LIZJ(this, i, (int) (this.LLLLJI * i));
        }
        InterfaceC21577819cW interfaceC21577819cW = this.LLLIZZ;
        if (interfaceC21577819cW != null && (this.LLLLLJIL instanceof InterfaceC21576819cM)) {
            interfaceC21577819cW.LJIIIZ();
        }
        if (valueAnimatorLIZ == null) {
            aLAdapterS14S0110000_33.onAnimationEnd(null);
        }
    }

    public void setStateRefreshing(boolean z) {
        ALAdapterS14S0110000_33 aLAdapterS14S0110000_33 = new ALAdapterS14S0110000_33(this, z, 5);
        LJIILIIL(EnumC21577619cU.RefreshReleased);
        ValueAnimator valueAnimatorLIZ = this.LLLLLLJ.LIZ(this.LLLLIIIILLL);
        if (valueAnimatorLIZ != null) {
            valueAnimatorLIZ.addListener(aLAdapterS14S0110000_33);
        }
        InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
        if (interfaceC21576219cG != null) {
            int i = this.LLLLIIIILLL;
            interfaceC21576219cG.LIZJ(this, i, (int) (this.LLLLJ * i));
        }
        InterfaceC21577819cW interfaceC21577819cW = this.LLLIZZ;
        if (interfaceC21577819cW != null && (this.LLLLLILLIL instanceof InterfaceC21576219cG)) {
            interfaceC21577819cW.LJI();
        }
        if (valueAnimatorLIZ == null) {
            aLAdapterS14S0110000_33.onAnimationEnd(null);
        }
    }

    public void setViceState(EnumC21577619cU enumC21577619cU) {
        EnumC21577619cU enumC21577619cU2 = this.LLLLLLL;
        if (enumC21577619cU2.isDragging && enumC21577619cU2.isHeader != enumC21577619cU.isHeader) {
            LJIILIIL(EnumC21577619cU.None);
        }
        if (this.LLLLLLLLL != enumC21577619cU) {
            this.LLLLLLLLL = enumC21577619cU;
        }
    }

    public final void LJII(int i, boolean z) {
        int i2 = (i << 16) >> 16;
        RunnableC21577219cQ runnableC21577219cQ = new RunnableC21577219cQ(this, i >> 16, z);
        if (i2 > 0) {
            C786410Ut5.LJLIIL(i2, this.LLLLLLIL, runnableC21577219cQ);
        } else {
            runnableC21577219cQ.run();
        }
    }

    public final boolean LJIIJJI(boolean z, InterfaceC21576419cI interfaceC21576419cI) {
        if (!z && !this.LLLFF && interfaceC21576419cI != null && interfaceC21576419cI.getSpinnerStyle() != C19PY.LIZLLL) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LJIILLIIL(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21576919cN.onMeasure(int, int):void");
    }

    public final void LJIIIIZZ(int i, final Boolean bool, final boolean z) {
        final int i2 = i >> 16;
        int i3 = (i << 16) >> 16;
        Runnable runnable = new Runnable() { // from class: X.19cP
            public int LL;

            public final void LIZ() {
                if (this.LL == 0) {
                    C21576919cN c21576919cN = this.LLILZIL;
                    EnumC21577619cU enumC21577619cU = c21576919cN.LLLLLLL;
                    EnumC21577619cU enumC21577619cU2 = EnumC21577619cU.None;
                    if (enumC21577619cU == enumC21577619cU2 && c21576919cN.LLLLLLLLL == EnumC21577619cU.Refreshing) {
                        c21576919cN.LLLLLLLLL = enumC21577619cU2;
                    } else {
                        ValueAnimator valueAnimator = c21576919cN.LLLLZI;
                        if (valueAnimator != null && enumC21577619cU.isHeader && (enumC21577619cU.isDragging || enumC21577619cU == EnumC21577619cU.RefreshReleased)) {
                            c21576919cN.LLLLZI = null;
                            valueAnimator.cancel();
                            this.LLILZIL.LLLLLLJ.LIZJ(enumC21577619cU2);
                        } else if (enumC21577619cU == EnumC21577619cU.Refreshing && c21576919cN.LLLLLILLIL != null && c21576919cN.LLLLLJLJLL != null) {
                            this.LL = 1;
                            C786410Ut5.LJLIIL(i2, c21576919cN.LLLLLLIL, this);
                            this.LLILZIL.LJIILIIL(EnumC21577619cU.RefreshFinish);
                            if (bool == Boolean.FALSE) {
                                this.LLILZIL.LJIILL(false);
                            }
                        }
                    }
                    if (bool == Boolean.TRUE) {
                        this.LLILZIL.LJIILL(true);
                        return;
                    }
                    return;
                }
                C21576919cN c21576919cN2 = this.LLILZIL;
                int iLJIILL = c21576919cN2.LLLLLILLIL.LJIILL(c21576919cN2, z);
                C21576919cN c21576919cN3 = this.LLILZIL;
                InterfaceC21577819cW interfaceC21577819cW = c21576919cN3.LLLIZZ;
                if (interfaceC21577819cW != null && (c21576919cN3.LLLLLILLIL instanceof InterfaceC21576219cG)) {
                    interfaceC21577819cW.LIZIZ();
                }
                if (iLJIILL < Integer.MAX_VALUE) {
                    C21576919cN c21576919cN4 = this.LLILZIL;
                    if (c21576919cN4.LLJILLL || c21576919cN4.LLLJIL) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C21576919cN c21576919cN5 = this.LLILZIL;
                        if (c21576919cN5.LLJILLL) {
                            float f = c21576919cN5.LLJIJIL;
                            c21576919cN5.LLJ = f;
                            c21576919cN5.LLILZ = 0;
                            c21576919cN5.LLJILLL = false;
                            super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 0, c21576919cN5.LLJI, (f + c21576919cN5.LLILLJJLI) - (c21576919cN5.LL * 2), 0));
                            C21576919cN c21576919cN6 = this.LLILZIL;
                            super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 2, c21576919cN6.LLJI, c21576919cN6.LLJIJIL + c21576919cN6.LLILLJJLI, 0));
                        }
                        C21576919cN c21576919cN7 = this.LLILZIL;
                        if (c21576919cN7.LLLJIL) {
                            c21576919cN7.LLLJ = 0;
                            super/*android.view.ViewGroup*/.dispatchTouchEvent(MotionEvent.obtain(jCurrentTimeMillis, jCurrentTimeMillis, 1, c21576919cN7.LLJI, c21576919cN7.LLJIJIL, 0));
                            C21576919cN c21576919cN8 = this.LLILZIL;
                            c21576919cN8.LLLJIL = false;
                            c21576919cN8.LLILZ = 0;
                        }
                    }
                    C21576919cN c21576919cN9 = this.LLILZIL;
                    int i4 = c21576919cN9.LLILLJJLI;
                    if (i4 <= 0) {
                        if (i4 < 0) {
                            c21576919cN9.LJI(0, iLJIILL, c21576919cN9.LLJJJJLIIL, c21576919cN9.LLILZLL);
                            return;
                        } else {
                            c21576919cN9.LLLLLLJ.LIZIZ(0, false);
                            this.LLILZIL.LLLLLLJ.LIZJ(EnumC21577619cU.None);
                            return;
                        }
                    }
                    ValueAnimator valueAnimatorLJI = c21576919cN9.LJI(0, iLJIILL, c21576919cN9.LLJJJJLIIL, c21576919cN9.LLILZLL);
                    C21576919cN c21576919cN10 = this.LLILZIL;
                    C21560319Zh c21560319ZhLJFF = c21576919cN10.LLLFZ ? c21576919cN10.LLLLLJLJLL.LJFF(c21576919cN10.LLILLJJLI) : null;
                    if (valueAnimatorLJI == null || c21560319ZhLJFF == null) {
                        return;
                    }
                    valueAnimatorLJI.addUpdateListener(c21560319ZhLJFF);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SmartRefreshLayout@e706.finishRefresh$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SmartRefreshLayout@e706.finishRefresh$1");
            }
        };
        if (i3 > 0) {
            C786410Ut5.LJLIIL(i3, this.LLLLLLIL, runnable);
        } else {
            runnable.run();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        View view2;
        Paint paint;
        Paint paint2;
        C21560319Zh c21560319Zh = this.LLLLLJLJLL;
        if (c21560319Zh != null) {
            view2 = c21560319Zh.LL;
        } else {
            view2 = null;
        }
        InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
        if (interfaceC21576219cG != null && interfaceC21576219cG.getView() == view) {
            if (!LJIIJ(this.LLJJLIIIJLLLLLLLZ) || (!this.LLJZ && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMax = Math.max(view2.getTop() + view2.getPaddingTop() + this.LLILLJJLI, view.getTop());
                int i = this.LLLLLLLZIL;
                if (i != 0 && (paint2 = this.LLLLLL) != null) {
                    paint2.setColor(i);
                    if (this.LLLLLILLIL.getSpinnerStyle().LIZIZ) {
                        iMax = view.getBottom();
                    } else if (this.LLLLLILLIL.getSpinnerStyle() == C19PY.LIZJ) {
                        iMax = view.getBottom() + this.LLILLJJLI;
                    }
                    canvas.drawRect(0.0f, view.getTop(), getWidth(), iMax, this.LLLLLL);
                }
                if (this.LLJLIL && this.LLLLLILLIL.getSpinnerStyle() == C19PY.LIZLLL) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), iMax);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
        }
        InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
        if (interfaceC21576819cM != null && interfaceC21576819cM.getView() == view) {
            if (!LJIIJ(this.LLJL) || (!this.LLJZ && isInEditMode())) {
                return true;
            }
            if (view2 != null) {
                int iMin = Math.min((view2.getBottom() - view2.getPaddingBottom()) + this.LLILLJJLI, view.getBottom());
                int i2 = this.LLLLLLZ;
                if (i2 != 0 && (paint = this.LLLLLL) != null) {
                    paint.setColor(i2);
                    if (this.LLLLLJIL.getSpinnerStyle().LIZIZ) {
                        iMin = view.getTop();
                    } else if (this.LLLLLJIL.getSpinnerStyle() == C19PY.LIZJ) {
                        iMin = view.getTop() + this.LLILLJJLI;
                    }
                    canvas.drawRect(0.0f, iMin, getWidth(), view.getBottom(), this.LLLLLL);
                }
                if (this.LLJLILLLLZIIL && this.LLLLLJIL.getSpinnerStyle() == C19PY.LIZLLL) {
                    canvas.save();
                    canvas.clipRect(view.getLeft(), iMin, view.getRight(), view.getBottom());
                    boolean zDrawChild2 = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild2;
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if ((!this.LLLLLZ || f2 <= 0.0f) && !LJIJI(-f2) && !this.LLLL.LIZIZ(f, f2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.LLLLII.LIZ(i, 0);
        this.LLLL.LJIIJ(i & 2, 0);
        this.LLLJ = this.LLILLJJLI;
        this.LLLJIL = true;
        LJIIIZ(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if (isEnabled() && isNestedScrollingEnabled() && (i & 2) != 0) {
            if (this.LLL || this.LLJJLIIIJLLLLLLLZ || this.LLJL) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ValueAnimator LJI(int i, int i2, Interpolator interpolator, int i3) {
        if (this.LLILLJJLI == i) {
            return null;
        }
        ValueAnimator valueAnimator = this.LLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLLLZ = null;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LLILLJJLI, i);
        this.LLLLZI = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(i3);
        this.LLLLZI.setInterpolator(interpolator);
        this.LLLLZI.addListener(new ALAdapterS27S0100000_33(this, 25));
        this.LLLLZI.addUpdateListener(new AUListenerS280S0100000_33(this, 55));
        this.LLLLZI.setStartDelay(i2);
        this.LLLLZI.start();
        return this.LLLLZI;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.LLLL.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3 = this.LLLJ;
        int i4 = 0;
        if (i2 * i3 > 0) {
            if (Math.abs(i2) > Math.abs(this.LLLJ)) {
                int i5 = this.LLLJ;
                this.LLLJ = 0;
                i4 = i5;
            } else {
                this.LLLJ -= i2;
                i4 = i2;
            }
            LJIIL(this.LLLJ);
        } else if (i2 > 0 && this.LLLLLZ) {
            int i6 = i3 - i2;
            this.LLLJ = i6;
            LJIIL(i6);
            i4 = i2;
        }
        this.LLLL.LIZJ(i, i2 - i4, iArr, null);
        iArr[1] = iArr[1] + i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iMax;
        int i5;
        int i6;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = super.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = super.getChildAt(i7);
            if (childAt.getVisibility() != 8 && childAt.getTag(2131848715) != childAt) {
                C21560319Zh c21560319Zh = this.LLLLLJLJLL;
                boolean z4 = true;
                if (c21560319Zh != null && c21560319Zh.LL == childAt) {
                    if (isInEditMode() && this.LLJZ && LJIIJ(this.LLJJLIIIJLLLLLLLZ) && this.LLLLLILLIL != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    View view = this.LLLLLJLJLL.LL;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                    } else {
                        marginLayoutParams3 = LLLLZIL;
                    }
                    int i8 = marginLayoutParams3.leftMargin + paddingLeft;
                    int i9 = marginLayoutParams3.topMargin + paddingTop;
                    int measuredWidth = view.getMeasuredWidth() + i8;
                    int measuredHeight = view.getMeasuredHeight() + i9;
                    if (z3 && LJIIJJI(this.LLJLL, this.LLLLLILLIL)) {
                        int i10 = this.LLLLIIIILLL;
                        i9 += i10;
                        measuredHeight += i10;
                    }
                    view.layout(i8, i9, measuredWidth, measuredHeight);
                }
                InterfaceC21576219cG interfaceC21576219cG = this.LLLLLILLIL;
                if (interfaceC21576219cG != null && interfaceC21576219cG.getView() == childAt) {
                    if (isInEditMode() && this.LLJZ && LJIIJ(this.LLJJLIIIJLLLLLLLZ)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    View view2 = this.LLLLLILLIL.getView();
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    } else {
                        marginLayoutParams2 = LLLLZIL;
                    }
                    int i11 = marginLayoutParams2.leftMargin;
                    int i12 = marginLayoutParams2.topMargin + this.LLLLIL;
                    int measuredWidth2 = view2.getMeasuredWidth() + i11;
                    int measuredHeight2 = view2.getMeasuredHeight() + i12;
                    if (!z2 && this.LLLLLILLIL.getSpinnerStyle() == C19PY.LIZJ) {
                        int i13 = this.LLLLIIIILLL;
                        i12 -= i13;
                        measuredHeight2 -= i13;
                    }
                    view2.layout(i11, i12, measuredWidth2, measuredHeight2);
                }
                InterfaceC21576819cM interfaceC21576819cM = this.LLLLLJIL;
                if (interfaceC21576819cM != null && interfaceC21576819cM.getView() == childAt) {
                    if (!isInEditMode() || !this.LLJZ || !LJIIJ(this.LLJL)) {
                        z4 = false;
                    }
                    View view3 = this.LLLLLJIL.getView();
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    } else {
                        marginLayoutParams = LLLLZIL;
                    }
                    C19PY spinnerStyle = this.LLLLLJIL.getSpinnerStyle();
                    int i14 = marginLayoutParams.leftMargin;
                    int measuredHeight3 = (marginLayoutParams.topMargin + getMeasuredHeight()) - this.LLLLILI;
                    if (this.LLLIIIL && this.LLLIIL && this.LLJLLL && this.LLLLLJLJLL != null && this.LLLLLJIL.getSpinnerStyle() == C19PY.LIZJ && LJIIJ(this.LLJL)) {
                        View view4 = this.LLLLLJLJLL.LL;
                        ViewGroup.LayoutParams layoutParams4 = view4.getLayoutParams();
                        if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                            i6 = ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin;
                        } else {
                            i6 = 0;
                        }
                        measuredHeight3 = view4.getMeasuredHeight() + paddingTop + paddingTop + i6;
                    }
                    if (spinnerStyle == C19PY.LJFF) {
                        measuredHeight3 = marginLayoutParams.topMargin - this.LLLLILI;
                    } else {
                        if (!z4 && spinnerStyle != C19PY.LJ && spinnerStyle != C19PY.LIZLLL) {
                            if (spinnerStyle.LIZIZ && this.LLILLJJLI < 0) {
                                if (LJIIJ(this.LLJL)) {
                                    i5 = -this.LLILLJJLI;
                                } else {
                                    i5 = 0;
                                }
                                iMax = Math.max(i5, 0);
                            }
                        } else {
                            iMax = this.LLLLIILL;
                        }
                        measuredHeight3 -= iMax;
                    }
                    view3.layout(i14, measuredHeight3, view3.getMeasuredWidth() + i14, view3.getMeasuredHeight() + measuredHeight3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        EnumC21577619cU enumC21577619cU;
        boolean zLJ = this.LLLL.LJ(i, i2, i3, i4, this.LLLJL);
        int i5 = i4 + this.LLLJL[1];
        if (i5 >= 0 ? !(i5 <= 0 || (!this.LLJL && !this.LLL)) : !(!this.LLJJLIIIJLLLLLLLZ && !this.LLL)) {
            EnumC21577619cU enumC21577619cU2 = this.LLLLLLLLL;
            if (enumC21577619cU2 == EnumC21577619cU.None || enumC21577619cU2.isOpening) {
                C21577019cO c21577019cO = this.LLLLLLJ;
                if (i5 > 0) {
                    enumC21577619cU = EnumC21577619cU.PullUpToLoad;
                } else {
                    enumC21577619cU = EnumC21577619cU.PullDownToRefresh;
                }
                c21577019cO.LIZJ(enumC21577619cU);
                if (!zLJ) {
                    ViewParent parent = getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            int i6 = this.LLLJ - i5;
            this.LLLJ = i6;
            LJIIL(i6);
        }
        if (this.LLLLLZ && i2 < 0) {
            this.LLLLLZ = false;
        }
    }
}
