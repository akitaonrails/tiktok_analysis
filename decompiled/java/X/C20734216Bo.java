package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS42S0101000_31;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.16Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20734216Bo extends HorizontalScrollView {
    public static final int LLJJIJIL;
    public static final int LLJJJ;
    public static final int LLJJJIL;
    public static final int LLJJJJ;
    public boolean LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final List<C1254960ilK> LLILZLL;
    public VelocityTracker LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public Runnable LLJJIJI;
    public InterfaceC1591430rW1 LLJJIJIIJIL;

    @Override // android.widget.HorizontalScrollView
    public final void fling(int i) {
    }

    public void setOnFeedScrollListener(InterfaceC20734416Bq interfaceC20734416Bq) {
    }

    public void setOnFlingToIndexListener(InterfaceC20734516Br interfaceC20734516Br) {
    }

    public void setOnPageChangeListener(InterfaceC20734316Bp interfaceC20734316Bp) {
    }

    static {
        C844470XAv.LIZ.getClass();
        LLJJIJIL = C14KQ.LIZIZ(C844470XAv.LIZ());
        LLJJJ = ViewConfiguration.getMaximumFlingVelocity();
        LLJJJIL = (int) C12ES.LIZJ(500.0f, C844470XAv.LIZ());
        LLJJJJ = (int) C12ES.LIZJ(8.0f, C844470XAv.LIZ());
    }

    public String getCurrentItemName() {
        return ((ArrayList) this.LLILZLL).isEmpty() ? "" : ((C1254960ilK) ListProtector.get(this.LLILZLL, this.LLJJ)).LIZ;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLIZ = VelocityTracker.obtain();
    }

    public int getCurrentItem() {
        return this.LLJJ;
    }

    private void setCurrentItem(int i) {
        LIZJ(i, true);
    }

    public final boolean LIZ(int i) {
        if (!((ArrayList) this.LLILZLL).isEmpty() && i < ((ArrayList) this.LLILZLL).size()) {
            return ((C1254960ilK) ListProtector.get(this.LLILZLL, i)).LIZIZ;
        }
        return false;
    }

    public final boolean LIZIZ(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        Runnable runnable;
        int iFindPointerIndex = motionEvent.findPointerIndex(this.LLIZLLLIL);
        if (iFindPointerIndex != -1) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int iAbs = Math.abs(x - this.LLILLJJLI);
            int i2 = LLJJIJIL;
            if (iAbs <= i2) {
                z = true;
            } else {
                z = false;
            }
            int i3 = x - this.LLILLJJLI;
            if (i3 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                int i4 = this.LLILZ - i3;
                int i5 = this.LLJJ;
                if (i5 <= 0) {
                    i = i5;
                } else {
                    i = i5 - 1;
                }
                int i6 = this.LLILLL;
                if (i5 < i6) {
                    i6 = i5 + 1;
                }
                if (i4 >= 0 && LIZ(i)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i4 <= this.LLILLL * i2 && LIZ(i6)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z2) {
                    z4 = z3;
                }
                if (!z3 && !this.LLJJI && (runnable = this.LLJJIJI) != null) {
                    this.LLJJI = true;
                    runnable.run();
                }
                if (z4) {
                    try {
                        if (super.onTouchEvent(motionEvent)) {
                            return true;
                        }
                        return false;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344809Gs.LJI(e);
                        return false;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public final int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (this.LL) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        }
        return 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LLJIJIL) {
            return false;
        }
        if (this.LLJILLL) {
            return true;
        }
        if (this.LLJILJILJ != 0 && System.currentTimeMillis() - this.LLJILJILJ < 150) {
            return this.LLJJIII;
        }
        if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
            return false;
        }
        this.LLJJIII = false;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    this.LLJJIII = true;
                } else {
                    float fAbs = Math.abs(this.LLJ - motionEvent.getX());
                    float fAbs2 = Math.abs(this.LLJI - motionEvent.getY());
                    float f = LLJJJJ;
                    if ((fAbs > f || fAbs2 > f) && this.LLJILJIL) {
                        if (fAbs - fAbs2 >= 0.0f) {
                            this.LLJJIII = true;
                        } else {
                            this.LLJJIII = false;
                        }
                        this.LLJILJIL = false;
                    }
                }
            } else {
                this.LLJJIII = false;
            }
        } else {
            this.LLJ = (int) motionEvent.getX();
            this.LLJI = (int) motionEvent.getY();
            this.LLIZLLLIL = motionEvent.getPointerId(0);
            this.LLILLJJLI = (int) motionEvent.getX();
            this.LLILZ = getScrollX();
            super.onTouchEvent(motionEvent);
            this.LLJILJIL = true;
        }
        return this.LLJJIII;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.LLJIJIL) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.LLIZ == null) {
            this.LLIZ = VelocityTracker.obtain();
        }
        this.LLIZ.addMovement(motionEvent);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    return LIZIZ(motionEvent);
                }
            }
            int x = (int) motionEvent.getX();
            VelocityTracker velocityTracker = this.LLIZ;
            if (x <= this.LLJ) {
                z = true;
            } else {
                z = false;
            }
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, LLJJJ);
            float xVelocity = velocityTracker.getXVelocity(this.LLIZLLLIL);
            int scrollX = getScrollX();
            int i2 = LLJJIJIL;
            int i3 = scrollX % i2;
            if (i3 == 0) {
                InterfaceC1591430rW1 interfaceC1591430rW1 = this.LLJJIJIIJIL;
                if (interfaceC1591430rW1 != null && z) {
                    interfaceC1591430rW1.LIZ();
                }
            } else {
                int scrollX2 = getScrollX() / i2;
                if (Math.abs(xVelocity) >= LLJJJIL ? xVelocity < 0.0f : i3 > i2 / 2) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZJ(C419990GdR.LIZIZ(scrollX2 + i, 0, this.LLILLL), true);
                VelocityTracker velocityTracker2 = this.LLIZ;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                    this.LLIZ.recycle();
                    this.LLIZ = null;
                }
            }
            boolean zLIZIZ = LIZIZ(motionEvent);
            this.LLJJI = false;
            return zLIZIZ;
        }
        this.LLIZLLLIL = motionEvent.getPointerId(0);
        this.LLILLJJLI = (int) motionEvent.getX();
        this.LLILZ = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            setScrollX(this.LLJJ * LLJJIJIL);
        }
    }

    public void setCanScroll(boolean z) {
        this.LLJIJIL = z;
    }

    public void setCanScrollToProfile(boolean z) {
        for (int i = 0; i < ((ArrayList) this.LLILZLL).size(); i++) {
            C1254960ilK c1254960ilK = (C1254960ilK) ListProtector.get(this.LLILZLL, i);
            if (TextUtils.equals(c1254960ilK.LIZ, "page_profile")) {
                c1254960ilK.LIZIZ = z;
                return;
            }
        }
    }

    public void setOnFlingEndListener(InterfaceC1591430rW1 interfaceC1591430rW1) {
        this.LLJJIJIIJIL = interfaceC1591430rW1;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.LLJJIJI = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z) {
        this.LL = z;
    }

    public void setCurrentItem(String str) {
        LIZLLL(str, true);
    }

    public C20734216Bo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        this.LLILZLL = new ArrayList(5);
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILLL = false;
        this.LLJJ = 0;
        this.LLJJIII = false;
        C786410Ut5.y3(getViewTreeObserver(), new C16HL(this, 3));
    }

    public final void LIZJ(int i, boolean z) {
        if (z) {
            if (i != this.LLJJ || getScrollX() != LLJJIJIL * i) {
                HandlerHook.viewPost(this, new ARunnableS42S0101000_31(i, this, 21));
                this.LLJILLL = true;
                HandlerHook.viewPostDelay(this, new ARunnableS116S0100000_16(this, 276), 150L);
                return;
            }
            return;
        }
        if (i == this.LLJJ) {
            return;
        }
        this.LLJJ = i;
        if (!this.LLILZIL) {
            return;
        }
        setScrollX(i * LLJJIJIL);
    }

    public final void LIZLLL(String str, boolean z) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= ((ArrayList) this.LLILZLL).size()) {
                break;
            }
            if (TextUtils.equals(str, ((C1254960ilK) ListProtector.get(this.LLILZLL, i2)).LIZ)) {
                i = i2;
                break;
            }
            i2++;
        }
        LIZJ(i, z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (view2 != null && view2.getTag() != null) {
            Object tag = view2.getTag();
            if ((tag instanceof String) && TextUtils.equals((String) tag, "relation_search_tag")) {
                super.requestChildFocus(view, view2);
                return;
            }
        }
        if (!TextUtils.equals(getCurrentItemName(), "page_feed")) {
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        if ((-i) != LLJJIJIL) {
            super.scrollBy(i, i2);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }
}
