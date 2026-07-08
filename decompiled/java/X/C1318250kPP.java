package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0kPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1318250kPP extends C1318220kPM implements InterfaceC1318320kPW {
    public final C1318300kPU LLJIJIL;
    public final C1318420kPg LLJILJIL;

    public int[] LJIIJ(int i, int i2, int i3, int[] iArr) {
        return new int[2];
    }

    public View getView() {
        return this;
    }

    public boolean startNestedScroll(int i, int i2) {
        return false;
    }

    public void stopNestedScroll(int i) {
    }

    private void LJIIJJI() {
        VelocityTracker velocityTracker = this.LLJIJIL.LJFF;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    public int getNestedScrollAxis() {
        return this.LLILLL ? 2 : 1;
    }

    public C1318250kPP(Context context) {
        super(context);
        this.LLJIJIL = new C1318300kPU();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.LLJILJIL = new C1318420kPg(viewConfiguration.getScaledWindowTouchSlop(), viewConfiguration.getScaledMinimumFlingVelocity(), viewConfiguration.getScaledMaximumFlingVelocity());
    }

    @Override // X.InterfaceC1318320kPW
    public final int[] LIZIZ(boolean z) {
        int scrollOffsetHorizontally;
        int[] scrollRangeHorizontally;
        int i;
        int i2;
        if (z) {
            scrollOffsetHorizontally = getScrollOffsetVertically();
            scrollRangeHorizontally = getScrollRangeVertically();
        } else {
            scrollOffsetHorizontally = getScrollOffsetHorizontally();
            scrollRangeHorizontally = getScrollRangeHorizontally();
        }
        boolean z2 = this.LLILLJJLI;
        if (z2) {
            int i3 = scrollRangeHorizontally[0];
            if (scrollOffsetHorizontally < i3) {
                i = scrollOffsetHorizontally - 50;
            } else {
                i = i3 - 300;
            }
        } else {
            i = scrollRangeHorizontally[0];
        }
        if (z2) {
            int i4 = scrollRangeHorizontally[1];
            if (scrollOffsetHorizontally > i4) {
                i2 = scrollOffsetHorizontally + 50;
            } else {
                i2 = i4 + DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            }
        } else {
            i2 = scrollRangeHorizontally[1];
        }
        return new int[]{i, i2};
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        C1318300kPU c1318300kPU = this.LLJIJIL;
        if (c1318300kPU.LJFF == null) {
            c1318300kPU.LJFF = VelocityTracker.obtain();
        }
        this.LLJIJIL.LJFF.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C1318300kPU c1318300kPU2 = this.LLJIJIL;
                                if (pointerId == c1318300kPU2.LJ) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    } else {
                                        i = 0;
                                    }
                                    c1318300kPU2.LJ = motionEvent.getPointerId(i);
                                    C1318300kPU c1318300kPU3 = this.LLJIJIL;
                                    int x = (int) (motionEvent.getX(i) + 0.5f);
                                    c1318300kPU3.LIZJ = x;
                                    c1318300kPU3.LIZ = x;
                                    C1318300kPU c1318300kPU4 = this.LLJIJIL;
                                    int y = (int) (motionEvent.getY(i) + 0.5f);
                                    c1318300kPU4.LIZLLL = y;
                                    c1318300kPU4.LIZIZ = y;
                                }
                            }
                        } else {
                            this.LLJIJIL.LJ = motionEvent.getPointerId(0);
                            C1318300kPU c1318300kPU5 = this.LLJIJIL;
                            int x2 = (int) (motionEvent.getX() + 0.5f);
                            c1318300kPU5.LIZJ = x2;
                            c1318300kPU5.LIZ = x2;
                            C1318300kPU c1318300kPU6 = this.LLJIJIL;
                            int y2 = (int) (motionEvent.getY() + 0.5f);
                            c1318300kPU6.LIZLLL = y2;
                            c1318300kPU6.LIZIZ = y2;
                        }
                    } else {
                        LJIIJJI();
                        LJIIIIZZ(0);
                    }
                } else {
                    int i2 = this.LLJIJIL.LJ;
                    if (i2 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                        if (iFindPointerIndex < 0) {
                            return false;
                        }
                        int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.LLIZLLLIL != 1) {
                            C1318300kPU c1318300kPU7 = this.LLJIJIL;
                            int i3 = x3 - c1318300kPU7.LIZ;
                            int i4 = y3 - c1318300kPU7.LIZIZ;
                            if (this.LLILLL && Math.abs(i4) > this.LLJILJIL.LIZ && (getNestedScrollAxes() & 2) == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!this.LLILLL && Math.abs(i3) > this.LLJILJIL.LIZ && (getNestedScrollAxes() & 1) == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z || z2) {
                                C1318300kPU c1318300kPU8 = this.LLJIJIL;
                                c1318300kPU8.LIZJ = x3;
                                c1318300kPU8.LIZLLL = y3;
                                LJIIIIZZ(1);
                            }
                        }
                    }
                }
            } else {
                this.LLJIJIL.LJFF.clear();
                stopNestedScroll(0);
            }
        } else {
            this.LLJIJIL.LJ = motionEvent.getPointerId(0);
            C1318300kPU c1318300kPU9 = this.LLJIJIL;
            int x4 = (int) (motionEvent.getX() + 0.5f);
            c1318300kPU9.LIZJ = x4;
            c1318300kPU9.LIZ = x4;
            C1318300kPU c1318300kPU10 = this.LLJIJIL;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            c1318300kPU10.LIZLLL = y4;
            c1318300kPU10.LIZIZ = y4;
            int i5 = this.LLIZLLLIL;
            if (i5 == 3 || i5 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                LJIIIIZZ(1);
            }
            startNestedScroll(getNestedScrollAxis(), 0);
        }
        if (this.LLIZLLLIL != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0139  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1318250kPP.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.InterfaceC1318320kPW
    public final boolean LIZ(int i, int[] iArr) {
        if (i > iArr[1]) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1318320kPW
    public final boolean LIZJ(int i, int[] iArr) {
        if (i >= iArr[0]) {
            return false;
        }
        return true;
    }
}
