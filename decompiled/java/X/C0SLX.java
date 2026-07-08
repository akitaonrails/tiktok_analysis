package X;

import Y.ARunnableS0S0103000_11;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SLX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SLX extends C21599719g3 implements C0SLZ {
    public boolean LLLLZI;
    public boolean LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public String LLLZ;
    public final C01GW LLLZI;
    public boolean LLLZIIL;
    public boolean LLLZIL;
    public boolean LLLZL;
    public long LLLZLL;
    public boolean LLLZLZ;
    public Function1<? super C0SSK, Unit> LLLZZ;
    public boolean LLLZZIL;
    public View.OnTouchListener LLZ;

    public C0SLX() {
        throw null;
    }

    private final float getSpringDragValue() {
        return ((Number) this.LLLZI.getValue()).floatValue();
    }

    public final void LJJJIL() {
        PagerAdapter adapter = getAdapter();
        int count = adapter != null ? adapter.getCount() : 2;
        if (!this.LLLLZLLIL || count < 2 || getCurrentItem() != count - 2) {
            setFlingEnabled(true);
        } else if (getLayoutDirection() == 1) {
            setRightFlingEnabled(false);
        } else {
            setLeftFlingEnabled(false);
        }
    }

    public final String getEnterFrom() {
        return this.LLLZ;
    }

    public final View.OnTouchListener getOnDispatchTouchEventListener() {
        return this.LLZ;
    }

    public final boolean getOnFYP() {
        return this.LLLLZLLIL;
    }

    public final boolean getOnLastPage() {
        return this.LLLZLZ;
    }

    public final boolean LJJJJ(int i) {
        boolean z;
        if (getCurrentItem() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (getLayoutDirection() == 1) {
            if (!z || i <= 0) {
            }
            return true;
        }
        if (z && i < 0) {
            return true;
        }
        if (LJJJJI(i)) {
            return true;
        }
        return false;
    }

    public final boolean LJJJJI(int i) {
        if (getLayoutDirection() == 1) {
            if (!this.LLLZLZ || i >= 0) {
                return false;
            }
        } else if (!this.LLLZLZ || i <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C21600219g8, android.view.View
    public final boolean canScrollHorizontally(int i) {
        Function1<? super C0SSK, Unit> function1;
        PagerAdapter adapter;
        PagerAdapter adapter2;
        boolean z;
        boolean z2 = this.LLLLZI;
        if (!z2) {
            Function1<? super C0SSK, Unit> function12 = this.LLLZZ;
            if (function12 != null) {
                function12.invoke(new C0SSK(i, "slide_not_supported", this.LLLZZIL, z2, this.LLLLZIL));
            }
            return false;
        }
        if (((Boolean) C18172079u.LIZ.getValue()).booleanValue() && !(z = this.LLLLZIL) && !this.LLLLZLL) {
            Function1<? super C0SSK, Unit> function13 = this.LLLZZ;
            if (function13 != null) {
                function13.invoke(new C0SSK(i, "slide_not_on_image", this.LLLZZIL, this.LLLLZI, z));
            }
            return false;
        }
        if (this.LLLLZLL && LJJJJ(i)) {
            Function1<? super C0SSK, Unit> function14 = this.LLLZZ;
            if (function14 != null) {
                function14.invoke(new C0SSK(i, "right_swipe_at_edge", this.LLLZZIL, this.LLLLZI, this.LLLLZIL));
            }
            return false;
        }
        if (this.LLLLZLLIL && !this.LLLLZLLLI && this.LLLLZIL && LJJJJI(i) && ((C0RHE.LIZJ() && (adapter2 = getAdapter()) != null && adapter2.getCount() > 1) || (C0RHE.LIZIZ() && ((adapter = getAdapter()) == null || adapter.getCount() > 0)))) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLZLL;
            C01GW c01gw = C0ABM.LIZ;
            if (jCurrentTimeMillis < ((Number) c01gw.getValue()).intValue()) {
                if (!this.LLLZL) {
                    C721190SQr c721190SQr = C721190SQr.LIZ;
                    String str = this.LLLZ;
                    c721190SQr.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("gesture", "swipe");
                    C20684815ws.LJIILLIIL("swipe_at_last_image_blocked", c2344009Gk.LIZ);
                    this.LLLZL = true;
                }
                this.LLLZLL -= (long) ((Number) c01gw.getValue()).intValue();
                return true;
            }
        }
        boolean zCanScrollHorizontally = super.canScrollHorizontally(i);
        if (!zCanScrollHorizontally && (function1 = this.LLLZZ) != null) {
            function1.invoke(new C0SSK(i, "DmtViewPager", this.LLLZZIL, this.LLLLZI, this.LLLLZIL));
        }
        return zCanScrollHorizontally;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    @Override // X.C21600219g8, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L1d
            int r0 = r5.getAction()
            if (r0 != 0) goto Le
            r4.LLLZZIL = r3
            if (r5 == 0) goto L1d
        Le:
            int r0 = r5.getAction()
            if (r0 == r3) goto L1b
            int r1 = r5.getAction()
            r0 = 3
            if (r1 != r0) goto L1d
        L1b:
            r4.LLLZZIL = r2
        L1d:
            android.view.View$OnTouchListener r0 = r4.LLZ
            if (r0 == 0) goto L28
            boolean r0 = r0.onTouch(r4, r5)
            if (r0 != r3) goto L28
            return r3
        L28:
            boolean r0 = super.dispatchTouchEvent(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SLX.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.LLLZL = false;
        }
        if (!this.LLLLZI) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // X.C21599719g3, X.C21600219g8, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LLLLZI) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAd(boolean z) {
        this.LLLLZLLLI = z;
    }

    public final void setEnterFrom(String str) {
        this.LLLZ = str;
    }

    public final void setOnCannotScrollHorizontallyListener$post_mode_release(Function1<? super C0SSK, Unit> function1) {
        this.LLLZZ = function1;
    }

    public final void setOnDispatchTouchEventListener(View.OnTouchListener onTouchListener) {
        this.LLZ = onTouchListener;
    }

    public final void setOnFYP(boolean z) {
        this.LLLLZLLIL = z;
    }

    public final void setOnLastPage(boolean z) {
        this.LLLZLL = System.currentTimeMillis();
        this.LLLZLZ = z;
    }

    public final void setSlideSupported(boolean z) {
        this.LLLLZI = z;
    }

    public final void setSmoothScrollDelay(boolean z) {
        this.LLLZIL = z;
    }

    public final void setSpringDragEnabled(boolean z) {
        this.LLLZIIL = z;
    }

    public final void setSwipingOnImage(boolean z) {
        this.LLLLZIL = z;
    }

    public final void setSwipingOnRight(boolean z) {
        this.LLLLZLL = z;
    }

    public C0SLX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLZ = "";
        this.LLLZI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(224));
        this.LLLZLL = System.currentTimeMillis();
    }

    @Override // X.C21600219g8
    public final float LJIILL(float f, float f2) {
        if (!this.LLLZIIL || ((getLayoutDirection() == 1 && f >= f2) || (getLayoutDirection() != 1 && f <= f2))) {
            return f - f2;
        }
        float f3 = 1;
        return getWidth() * (f3 - (f3 / (((getSpringDragValue() * (f - f2)) / getWidth()) + f3)));
    }

    @Override // X.C21599719g3, X.C21600219g8
    public final void LLFFF(int i, boolean z) {
        try {
            super.LLFFF(i, z);
            this.LLLLZIL = false;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2344809Gs.LJI(e2);
        }
    }

    @Override // X.C21600219g8
    public final void LJJIJL(int i, int i2, int i3) {
        if (this.LLLZIL) {
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            SettingsManager.LIZLLL().getClass();
            C786410Ut5.LJLIIL(SettingsManager.LJFF("photo_mode_last_image_swipe_icon_animation_duration", 150L), bPEAHandler, new ARunnableS0S0103000_11(this, i, i3, 0));
            return;
        }
        super.LJJIJL(i, 0, i3);
    }
}
