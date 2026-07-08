package X;

import Y.ARunnableS80S0200000_11;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0SSD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSD extends C16GX implements InterfaceC1324370kZH {
    public Runnable LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C0SSE LLJJJ;
    public int LLJJJIL;

    private final AdvancedStopAtOffsetAppBarBehavior getAppBarBehavior() {
        return (AdvancedStopAtOffsetAppBarBehavior) this.LLJJIJIL.getValue();
    }

    @Override // X.C16GX, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ARunnableS80S0200000_11 aRunnableS80S0200000_11;
        super.onDetachedFromWindow();
        LIZLLL(this);
        AdvancedStopAtOffsetAppBarBehavior appBarBehavior = getAppBarBehavior();
        if (appBarBehavior == null || (aRunnableS80S0200000_11 = appBarBehavior.LJ) == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this, aRunnableS80S0200000_11);
    }

    public final boolean getEnableCatchFling() {
        return this.LLJJIJIIJIL;
    }

    public final int getOffset() {
        return this.LLJJIJI;
    }

    public final C0SSE getTouchControl() {
        return this.LLJJJ;
    }

    @Override // android.view.View
    public final void postOnAnimation(Runnable runnable) {
        if (this.LLJJIJIIJIL && this.LLJJJIL >= this.LLJJIJI) {
            return;
        }
        super.postOnAnimation(runnable);
        if (this.LLJJIJIIJIL) {
            this.LLJJIII = runnable;
        }
    }

    public final void setEnableCatchFling(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setOffset(int i) {
        this.LLJJIJI = i;
    }

    public final void setTouchControl(C0SSE c0sse) {
        this.LLJJJ = c0sse;
        AdvancedStopAtOffsetAppBarBehavior appBarBehavior = getAppBarBehavior();
        if (appBarBehavior != null) {
            appBarBehavior.LIZJ = c0sse;
        }
    }

    public C0SSD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJI = Integer.MAX_VALUE;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1577));
        LIZ(this);
    }

    @Override // X.InterfaceC1324380kZI
    public final void LLZZJLIL(C16GX c16gx, int i) {
        if (this.LLJJJIL == i) {
            return;
        }
        this.LLJJJIL = i;
        C0SSE c0sse = this.LLJJJ;
        if (c0sse != null && !c0sse.LIZ()) {
            int i2 = this.LLJJJIL;
            int i3 = this.LLJJIJI;
            if (i2 >= i3 && i3 < 0) {
                Runnable runnable = this.LLJJIII;
                if (runnable != null) {
                    HandlerHook.viewRemoveCallbacks(this, runnable);
                }
                this.LLJJIII = null;
            }
        }
    }
}
