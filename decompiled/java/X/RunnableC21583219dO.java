package X;

import android.view.View;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;

/* JADX INFO: renamed from: X.19dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21583219dO implements Runnable {
    public final View LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ CreativeBottomSheetBehavior LLILZ;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r9 = this;
            com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior r0 = r9.LLILZ
            X.19dN r4 = r0.LJJIFFI
            r2 = 0
            if (r4 == 0) goto L73
            int r0 = r4.LIZ
            r3 = 2
            if (r0 != r3) goto L67
            android.widget.OverScroller r0 = r4.LJIILLIIL
            boolean r8 = r0.computeScrollOffset()
            android.widget.OverScroller r0 = r4.LJIILLIIL
            int r7 = r0.getCurrX()
            android.widget.OverScroller r0 = r4.LJIILLIIL
            int r5 = r0.getCurrY()
            android.view.View r0 = r4.LJIJ
            int r0 = r0.getLeft()
            int r6 = r7 - r0
            android.view.View r0 = r4.LJIJ
            int r0 = r0.getTop()
            int r1 = r5 - r0
            if (r6 == 0) goto L35
            android.view.View r0 = r4.LJIJ
            r0.offsetLeftAndRight(r6)
        L35:
            if (r1 == 0) goto L3c
            android.view.View r0 = r4.LJIJ
            r0.offsetTopAndBottom(r1)
        L3c:
            if (r6 != 0) goto L40
            if (r1 == 0) goto L49
        L40:
            X.19da r0 = r4.LJIIZILJ
            X.19dZ r0 = (X.C21584319dZ) r0
            com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior r0 = r0.LIZ
            r0.dispatchOnSlide(r5)
        L49:
            if (r8 == 0) goto L60
            android.widget.OverScroller r0 = r4.LJIILLIIL
            int r0 = r0.getFinalX()
            if (r7 != r0) goto L67
            android.widget.OverScroller r0 = r4.LJIILLIIL
            int r0 = r0.getFinalY()
            if (r5 != r0) goto L67
            android.widget.OverScroller r0 = r4.LJIILLIIL
            r0.abortAnimation()
        L60:
            android.view.ViewGroup r1 = r4.LJIJJ
            Y.ARunnableS128S0100000_28 r0 = r4.LJIJJLI
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r1, r0)
        L67:
            int r0 = r4.LIZ
            if (r0 != r3) goto L73
            android.view.View r0 = r9.LL
            r0.postOnAnimation(r9)
        L70:
            r9.LLILLJJLI = r2
            return
        L73:
            com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior r1 = r9.LLILZ
            int r0 = r9.LLILLL
            r1.setStateInternal(r0)
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC21583219dO.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CreativeBottomSheetBehavior$SettleRunnable@e110.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeBottomSheetBehavior$SettleRunnable@e110.run");
    }

    public RunnableC21583219dO(CreativeBottomSheetBehavior creativeBottomSheetBehavior, View view, int i) {
        this.LLILZ = creativeBottomSheetBehavior;
        this.LL = view;
        this.LLILLL = i;
    }
}
