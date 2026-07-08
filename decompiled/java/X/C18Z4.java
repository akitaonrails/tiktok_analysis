package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18Z4 extends C16GX implements InterfaceC20097013kG {
    public final C1318260kPQ LLJJIII;
    public final C18Z5 LLJJIJI;
    public Function0<Boolean> LLJJIJIIJIL;

    public final boolean LJIIIIZZ() {
        try {
            if (getTotalScrollRange() != 0) {
                if (Math.abs(getY() / getTotalScrollRange()) != 0.0f) {
                    return false;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.LLJJIII.LIZLLL;
    }

    @Override // X.C16GX, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C18Z5 c18z5 = this.LLJJIJI;
        VelocityTracker velocityTracker = c18z5.LIZ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        c18z5.LIZ = null;
    }

    public final void setNeedInterceptScroll(Function0<Boolean> function0) {
        this.LLJJIJIIJIL = function0;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.LLJJIII.LJIIIZ(z);
    }

    @Override // X.InterfaceC20097013kG
    public final void stopNestedScroll(int i) {
        this.LLJJIII.LJIIJJI(i);
    }

    public C18Z4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJIII = new C1318260kPQ(this);
        this.LLJJIJI = new C18Z5(this);
        setNestedScrollingEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(android.view.MotionEvent r18, kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18Z4.LJIIIZ(android.view.MotionEvent, kotlin.jvm.functions.Function2):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.LLJJIII.LIZIZ(f, f2);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean startNestedScroll(int i, int i2) {
        return this.LLJJIII.LJIIJ(2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.LLJJIII.LIZ(f, f2, z);
    }

    @Override // X.InterfaceC20097013kG
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.LLJJIII.LIZLLL(i, i2, iArr, null, 0);
    }
}
