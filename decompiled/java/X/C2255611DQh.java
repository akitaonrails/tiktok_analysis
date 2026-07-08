package X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePromoteCardGestureOptimize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2255611DQh {
    public final ViewGroup LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public long LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public float LJIIJ;
    public Function1<? super Float, Unit> LJIIJJI;
    public InterfaceC1631620sYq<? super Float, ? super Float, ? super Float, Unit> LJIIL;
    public boolean LJIILIIL;
    public float LJIILJJIL;
    public float LJIILL;
    public boolean LJIILLIIL;
    public Function0<Boolean> LJIIZILJ;
    public Function0<Boolean> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public final C01GW LJII = C452501pT.LIZIZ(new AwS579S0100000_35(this, 262));
    public boolean LJIJJLI = true;

    public final boolean LIZ() {
        Function0<Boolean> function0 = this.LJIJ;
        if (function0 == null || function0.invoke().booleanValue()) {
            return LIZJ() ? this.LJIJI || this.LJIILIIL || this.LJIILJJIL > 0.0f : this.LJIJI;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (!LivePromoteCardGestureOptimize.INSTANCE.enable() || !this.LJIILLIIL || this.LJIIZILJ == null) {
            return false;
        }
        float height = this.LJIIJ;
        if (height <= 0.0f) {
            height = this.LIZ.getHeight();
        }
        return height > 0.0f;
    }

    public C2255611DQh(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (r0 != 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(android.view.MotionEvent r9, kotlin.jvm.functions.Function0<java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2255611DQh.LIZIZ(android.view.MotionEvent, kotlin.jvm.functions.Function0):boolean");
    }

    public final boolean LIZLLL(MotionEvent motionEvent, Function0<Boolean> function0) {
        boolean z;
        boolean zBooleanValue = function0.invoke().booleanValue();
        if (!LIZ()) {
            return zBooleanValue;
        }
        if (!LIZJ()) {
            if ((!LivePromoteCardGestureOptimize.INSTANCE.enable() || !this.LJIILLIIL) && motionEvent.getAction() == 2) {
                float rawX = motionEvent.getRawX() - this.LIZIZ;
                float rawY = motionEvent.getRawY() - this.LIZJ;
                if (Math.abs(rawY) > Math.abs(rawX) && this.LJIILJJIL <= 0.0f && rawY < 0.0f) {
                    return true;
                }
            }
            return zBooleanValue;
        }
        if (motionEvent.getAction() == 2) {
            float rawX2 = motionEvent.getRawX() - this.LIZIZ;
            float rawY2 = motionEvent.getRawY() - this.LIZJ;
            if (Math.abs(rawY2) > Math.abs(rawX2)) {
                Function0<Boolean> function02 = this.LJIIZILJ;
                if (function02 != null && !function02.invoke().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                float f = this.LJIILJJIL;
                if ((0.0f <= f && f <= 1.0f && f != 0.0f && f != 1.0f) || ((f >= 1.0f && rawY2 > 0.0f) || (f <= 0.0f && rawY2 < 0.0f && z2))) {
                    return true;
                }
            } else {
                return zBooleanValue;
            }
        }
        return zBooleanValue;
    }

    public final void LJFF(Function0 function0, boolean z) {
        if (!this.LJIJI) {
            function0.invoke();
            return;
        }
        if (LIZJ() && z) {
            C20441214yg.LIZIZ("LivePromoteViewGroupProxy", "requestDisallowInterceptTouchEvent: ignore child disallow in follow-drag");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestDisallowInterceptTouchEvent: disallowIntercept=");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("LivePromoteViewGroupProxy", C2188811AlT.LIZIZ(sbLIZ));
        function0.invoke();
        if (this.LJFF && !z) {
            this.LIZ.getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.view.MotionEvent r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.jvm.functions.Function0<java.lang.Boolean> r12) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2255611DQh.LJ(android.view.MotionEvent, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):boolean");
    }
}
