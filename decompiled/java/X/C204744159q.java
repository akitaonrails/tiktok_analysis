package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import defpackage.r1;
import defpackage.s1;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.159q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204744159q extends FrameLayout {
    public Function1<? super Map<String, ? extends Object>, Unit> LL;
    public Function2<? super EnumC452820HpI, ? super Float, Unit> LLILLJJLI;
    public Function1<? super Map<String, ? extends Object>, Unit> LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public Rect LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public Point LLJI;
    public Point LLJIJIL;
    public Point LLJILJIL;
    public long LLJILJILJ;
    public String LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public String LLJJIJIIJIL;
    public EnumC452820HpI LLJJIJIL;
    public VelocityTracker LLJJJ;
    public ViewPropertyAnimator LLJJJIL;

    public final void LJFF() {
        this.LLJI = null;
        this.LLJILJIL = null;
        this.LLJIJIL = null;
        this.LLJILJILJ = 0L;
        this.LLJJI = 0.0f;
        this.LLJJ = 0.0f;
        this.LLJILLL = null;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    public final void LIZIZ() {
        VelocityTracker velocityTracker = this.LLJJJ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJJJ = null;
        ViewPropertyAnimator viewPropertyAnimator = this.LLJJJIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.LLJJJIL = null;
        this.LL = AFwS276S0000000_31.get$arr$(75);
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    private final EnumC452820HpI getNearestEdge() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return EnumC452820HpI.NONE;
        }
        int width = view.getWidth();
        int width2 = getWidth();
        float x = getX();
        return x <= (((float) width) - x) - ((float) width2) ? EnumC452820HpI.LEFT : EnumC452820HpI.RIGHT;
    }

    private final float getPiPVisibilityRatio() {
        Object parent = getParent();
        View view = parent instanceof ViewGroup ? (View) parent : null;
        if (view == null) {
            return 0.0f;
        }
        int width = view.getWidth();
        float x = getX();
        if (x < 0.0f) {
            x = 0.0f;
        }
        float x2 = getX() + getWidth();
        float f = width;
        if (x2 > f) {
            x2 = f;
        }
        float f2 = x2 - x;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float width2 = getWidth();
        if (width2 > 0.0f) {
            return f2 / width2;
        }
        return 0.0f;
    }

    public final Map<String, Object> LIZJ() {
        int iSqrt;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LLJILJILJ;
        long j2 = j > 0 ? jCurrentTimeMillis - j : 0L;
        Point point = this.LLJI;
        Point point2 = this.LLJILJIL;
        if (point == null || point2 == null) {
            iSqrt = 0;
        } else {
            double d = point2.x - point.x;
            double d2 = point2.y - point.y;
            iSqrt = (int) Math.sqrt((d * d) + (d2 * d2));
        }
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("start_quadrant", LIZLLL(this.LLIZ, this.LLJI));
        pairArr[1] = new Pair("end_quadrant", LIZLLL(this.LLIZ, this.LLJILJIL));
        pairArr[2] = new Pair("distance_in_pixels", Integer.valueOf(iSqrt));
        pairArr[3] = new Pair("duration_in_ms", Long.valueOf(j2));
        Pair[] pairArr2 = new Pair[2];
        Point point3 = this.LLJI;
        pairArr2[0] = new Pair("x", Integer.valueOf(point3 != null ? point3.x : 0));
        Point point4 = this.LLJI;
        pairArr2[1] = new Pair("y", Integer.valueOf(point4 != null ? point4.y : 0));
        pairArr[4] = new Pair("start_coordinates", C2097608Jq.LJIIIIZZ(pairArr2));
        Pair[] pairArr3 = new Pair[2];
        Point point5 = this.LLJILJIL;
        pairArr3[0] = new Pair("x", Integer.valueOf(point5 != null ? point5.x : 0));
        Point point6 = this.LLJILJIL;
        pairArr3[1] = new Pair("y", Integer.valueOf(point6 != null ? point6.y : 0));
        pairArr[5] = new Pair("end_coordinates", C2097608Jq.LJIIIIZZ(pairArr3));
        Pair[] pairArr4 = new Pair[2];
        Point point7 = this.LLJIJIL;
        pairArr4[0] = new Pair("x", Integer.valueOf(point7 != null ? point7.x : 0));
        Point point8 = this.LLJIJIL;
        pairArr4[1] = new Pair("y", Integer.valueOf(point8 != null ? point8.y : 0));
        pairArr[6] = new Pair("released_coordinates", C2097608Jq.LJIIIIZZ(pairArr4));
        Pair[] pairArr5 = new Pair[2];
        Rect rect = this.LLIZ;
        pairArr5[0] = new Pair("width", rect != null ? Integer.valueOf(rect.width()) : null);
        Rect rect2 = this.LLIZ;
        pairArr5[1] = new Pair("height", rect2 != null ? Integer.valueOf(rect2.height()) : null);
        pairArr[7] = new Pair("safe_bounds", C2097608Jq.LJIIIIZZ(pairArr5));
        String str = this.LLJILLL;
        if (str == null) {
            str = "none";
        }
        pairArr[8] = new Pair("snapped_to_edge", str);
        pairArr[9] = new Pair("snap_to_edge_animation_distance", Float.valueOf(this.LLJJ));
        pairArr[10] = new Pair("snap_to_edge_animation_duration", Float.valueOf(this.LLJJI));
        String str2 = this.LLJJIJIIJIL;
        pairArr[11] = new Pair("hide_method", str2 != null ? str2 : "none");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZIZ();
    }

    public final Function2<EnumC452820HpI, Float, Unit> getOnHiddenCallback() {
        return this.LLILLJJLI;
    }

    public final Function1<Map<String, ? extends Object>, Unit> getOnMoveCallback() {
        return this.LL;
    }

    public final Function1<Map<String, ? extends Object>, Unit> getOnUnhideCallback() {
        return this.LLILLL;
    }

    public final Rect getSafeArea() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[Catch: Exception -> 0x0090, TryCatch #0 {Exception -> 0x0090, blocks: (B:2:0x0000, B:4:0x0004, B:5:0x0007, B:7:0x000f, B:9:0x0013, B:11:0x001f, B:12:0x0029, B:20:0x003d, B:27:0x0054, B:30:0x006c, B:32:0x008b, B:21:0x0042, B:22:0x0047, B:26:0x0050, B:23:0x0048, B:25:0x004e, B:24:0x004c), top: B:38:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.EnumC452820HpI r8) {
        /*
            r7 = this;
            android.view.ViewPropertyAnimator r0 = r7.LLJJJIL     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L7
            r0.cancel()     // Catch: java.lang.Exception -> L90
        L7:
            android.view.ViewParent r1 = r7.getParent()     // Catch: java.lang.Exception -> L90
            boolean r0 = r1 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L8f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1     // Catch: java.lang.Exception -> L90
            if (r1 == 0) goto L8f
            int r4 = r1.getWidth()     // Catch: java.lang.Exception -> L90
            int r3 = r7.getWidth()     // Catch: java.lang.Exception -> L90
            android.graphics.Rect r2 = r7.LLIZ     // Catch: java.lang.Exception -> L90
            if (r2 != 0) goto L29
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch: java.lang.Exception -> L90
            int r1 = r1.getHeight()     // Catch: java.lang.Exception -> L90
            r0 = 0
            r2.<init>(r0, r0, r4, r1)     // Catch: java.lang.Exception -> L90
        L29:
            int[] r1 = X.C452830HpJ.LIZ     // Catch: java.lang.Exception -> L90
            int r0 = r8.ordinal()     // Catch: java.lang.Exception -> L90
            r1 = r1[r0]     // Catch: java.lang.Exception -> L90
            r0 = 1
            if (r1 == r0) goto L4c
            r0 = 2
            if (r1 == r0) goto L48
            r0 = 3
            if (r1 == r0) goto L50
            r0 = 4
            if (r1 != r0) goto L42
            float r6 = r7.getX()     // Catch: java.lang.Exception -> L90
            goto L54
        L42:
            X.07lC r0 = new X.07lC     // Catch: java.lang.Exception -> L90
            r0.<init>()     // Catch: java.lang.Exception -> L90
            throw r0     // Catch: java.lang.Exception -> L90
        L48:
            int r0 = r2.right     // Catch: java.lang.Exception -> L90
            int r0 = r0 - r3
            goto L4e
        L4c:
            int r0 = r2.left     // Catch: java.lang.Exception -> L90
        L4e:
            float r6 = (float) r0     // Catch: java.lang.Exception -> L90
            goto L54
        L50:
            float r6 = r7.getX()     // Catch: java.lang.Exception -> L90
        L54:
            float r0 = r7.getX()     // Catch: java.lang.Exception -> L90
            float r0 = r6 - r0
            float r5 = java.lang.Math.abs(r0)     // Catch: java.lang.Exception -> L90
            EcSvPipConfigVarsModel r0 = defpackage.r1.LIZ()     // Catch: java.lang.Exception -> L90
            long r1 = r0.snapToEdgeAnimationDurationMs     // Catch: java.lang.Exception -> L90
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L6c
            r1 = 0
        L6c:
            r7.LLJJ = r5     // Catch: java.lang.Exception -> L90
            float r0 = (float) r1     // Catch: java.lang.Exception -> L90
            r7.LLJJI = r0     // Catch: java.lang.Exception -> L90
            android.view.ViewPropertyAnimator r0 = r7.animate()     // Catch: java.lang.Exception -> L90
            android.view.ViewPropertyAnimator r0 = r0.x(r6)     // Catch: java.lang.Exception -> L90
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)     // Catch: java.lang.Exception -> L90
            Y.ALAdapterS25S0200000_31 r1 = new Y.ALAdapterS25S0200000_31     // Catch: java.lang.Exception -> L90
            r0 = 6
            r1.<init>(r8, r7, r0)     // Catch: java.lang.Exception -> L90
            android.view.ViewPropertyAnimator r0 = r2.setListener(r1)     // Catch: java.lang.Exception -> L90
            r7.LLJJJIL = r0     // Catch: java.lang.Exception -> L90
            if (r0 == 0) goto L9a
            r0.start()     // Catch: java.lang.Exception -> L90
            return
        L8f:
            return
        L90:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r7.LJFF()
            r7.LIZIZ()
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204744159q.LIZ(X.0HpI):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.LLILZ);
                float fAbs2 = Math.abs(motionEvent.getY() - this.LLILZIL);
                if (fAbs > 10.0f || fAbs2 > 10.0f) {
                    this.LLILZLL = true;
                    return true;
                }
            }
        } else {
            if (s1.LIZIZ().enableSnapToEdge && this.LLJJIII) {
                animate().cancel();
            }
            this.LLILZ = motionEvent.getX();
            this.LLILZIL = motionEvent.getY();
            this.LLIZLLLIL = motionEvent.getRawX() - getX();
            this.LLJ = motionEvent.getRawY() - getY();
            this.LLILZLL = false;
            this.LLJI = new Point((int) getX(), (int) getY());
            this.LLJILJILJ = System.currentTimeMillis();
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        float xVelocity;
        boolean z;
        String str;
        ViewGroup viewGroup;
        float x;
        int width;
        int height;
        Object parent = getParent();
        if (parent instanceof ViewGroup) {
            view = (View) parent;
        } else {
            view = null;
        }
        Rect rect = this.LLIZ;
        if (rect == null) {
            if (view != null) {
                width = view.getWidth();
                height = view.getHeight();
            } else {
                width = getWidth();
                height = getHeight();
            }
            rect = new Rect(0, 0, width, height);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    LJFF();
                }
                return true;
            }
            int width2 = getWidth();
            int height2 = getHeight();
            float rawX = motionEvent.getRawX() - this.LLIZLLLIL;
            float rawY = motionEvent.getRawY() - this.LLJ;
            float f = rect.left;
            float f2 = rect.right - width2;
            if (s1.LIZ()) {
                f = -width2;
                if (view != null) {
                    width2 = view.getWidth();
                }
                f2 = width2;
            }
            float fLIZLLL = C13LZ.LIZLLL(rawX, f, f2);
            float fLIZLLL2 = C13LZ.LIZLLL(rawY, rect.top, rect.bottom - height2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(fLIZLLL);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setY(fLIZLLL2);
            VelocityTracker velocityTrackerObtain = this.LLJJJ;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = VelocityTracker.obtain();
            }
            velocityTrackerObtain.clear();
            velocityTrackerObtain.addMovement(motionEvent);
            this.LLJJJ = velocityTrackerObtain;
            return true;
        }
        if (this.LLILZLL) {
            if (!s1.LIZIZ().enableSnapToEdge && !s1.LIZ()) {
                this.LLJILJIL = new Point((int) getX(), (int) getY());
                this.LL.invoke(LIZJ());
                LJFF();
            } else {
                this.LLJIJIL = new Point((int) getX(), (int) getY());
                EnumC452820HpI nearestEdge = getNearestEdge();
                if (!s1.LIZ()) {
                    LIZ(nearestEdge);
                } else {
                    VelocityTracker velocityTracker = this.LLJJJ;
                    if (velocityTracker != null) {
                        velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                        xVelocity = velocityTracker.getXVelocity();
                    } else {
                        xVelocity = 0.0f;
                    }
                    float fAbs = Math.abs(xVelocity);
                    long j = r1.LIZ().swipeToDismissVelocityThresholdAndroid;
                    long j2 = 0;
                    if (j < 0) {
                        j = 0;
                    }
                    if (fAbs >= j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    float piPVisibilityRatio = getPiPVisibilityRatio();
                    if (!z) {
                        if (piPVisibilityRatio <= 0.5f) {
                            str = "drag_to_edge";
                        } else if (s1.LIZIZ().enableSnapToEdge) {
                            LIZ(nearestEdge);
                        } else {
                            LJ(EnumC452820HpI.NONE, false);
                        }
                    } else {
                        str = "fast_swipe";
                    }
                    this.LLJJIJIIJIL = str;
                    try {
                        ViewPropertyAnimator viewPropertyAnimator = this.LLJJJIL;
                        if (viewPropertyAnimator != null) {
                            viewPropertyAnimator.cancel();
                        }
                        ViewParent parent2 = getParent();
                        if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                            int width3 = viewGroup.getWidth();
                            int width4 = getWidth();
                            int i = C452830HpJ.LIZ[nearestEdge.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new C1954807lC();
                                        }
                                        x = getX();
                                    } else {
                                        x = getX();
                                    }
                                } else {
                                    x = width3;
                                }
                            } else {
                                x = -width4;
                            }
                            long j3 = r1.LIZ().pipAnimationDurationMs;
                            if (j3 >= 0) {
                                j2 = j3;
                            }
                            ViewPropertyAnimator viewPropertyAnimatorWithEndAction = animate().x(x).setDuration(j2).withEndAction(new ARunnableS100S0200000_31(this, nearestEdge, 12));
                            this.LLJJJIL = viewPropertyAnimatorWithEndAction;
                            if (viewPropertyAnimatorWithEndAction != null) {
                                viewPropertyAnimatorWithEndAction.start();
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJFF();
                        LIZIZ();
                    }
                }
            }
        }
        performClick();
        return true;
    }

    public final void setOnHiddenCallback(Function2<? super EnumC452820HpI, ? super Float, Unit> function2) {
        this.LLILLJJLI = function2;
    }

    public final void setOnMoveCallback(Function1<? super Map<String, ? extends Object>, Unit> function1) {
        this.LL = function1;
    }

    public final void setOnUnhideCallback(Function1<? super Map<String, ? extends Object>, Unit> function1) {
        this.LLILLL = function1;
    }

    public final void setSafeArea(Rect rect) {
        this.LLIZ = rect;
    }

    public C204744159q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = AFwS276S0000000_31.get$arr$(76);
        setClipToOutline(true);
        setOutlineProvider(ViewOutlineProvider.BACKGROUND);
    }

    public static String LIZLLL(Rect rect, Point point) {
        if (point != null && rect != null) {
            int iWidth = rect.left + (rect.width() / 2);
            int iHeight = rect.top + (rect.height() / 2);
            int i = point.x;
            if (i < iWidth && point.y < iHeight) {
                return "top-left";
            }
            if (i >= iWidth && point.y < iHeight) {
                return "top-right";
            }
            if (i < iWidth && point.y >= iHeight) {
                return "bottom-left";
            }
            return "bottom-right";
        }
        return "unknown";
    }

    public final void LJ(EnumC452820HpI enumC452820HpI, boolean z) {
        String strLowerName;
        this.LLJILJIL = new Point((int) getX(), (int) getY());
        if (z) {
            int i = C452830HpJ.LIZ[enumC452820HpI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    strLowerName = enumC452820HpI.lowerName();
                } else {
                    strLowerName = "right_hidden";
                }
            } else {
                strLowerName = "left_hidden";
            }
        } else {
            strLowerName = enumC452820HpI.lowerName();
        }
        this.LLJILLL = strLowerName;
        this.LL.invoke(LIZJ());
        this.LLJJJIL = null;
        LJFF();
    }
}
