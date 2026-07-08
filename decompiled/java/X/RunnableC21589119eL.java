package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;

/* JADX INFO: renamed from: X.19eL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21589119eL implements Runnable {
    public final View LL;
    public final int LLILLJJLI;
    public final /* synthetic */ AdPopUpWebBottomSheetBehavior LLILLL;

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r0 = r8.LLILLL
            X.19eK r3 = r0.LJIIIZ
            if (r3 == 0) goto L74
            int r0 = r3.LIZ
            r2 = 2
            if (r0 != r2) goto L6a
            android.view.View r0 = r3.LJIIZILJ
            if (r0 == 0) goto L74
            android.widget.OverScroller r0 = r3.LJIILL
            boolean r7 = r0.computeScrollOffset()
            android.widget.OverScroller r0 = r3.LJIILL
            int r6 = r0.getCurrX()
            android.widget.OverScroller r0 = r3.LJIILL
            int r5 = r0.getCurrY()
            android.view.View r0 = r3.LJIIZILJ
            int r0 = r0.getLeft()
            int r4 = r6 - r0
            android.view.View r0 = r3.LJIIZILJ
            int r0 = r0.getTop()
            int r1 = r5 - r0
            if (r4 == 0) goto L38
            android.view.View r0 = r3.LJIIZILJ
            r0.offsetLeftAndRight(r4)
        L38:
            if (r1 == 0) goto L3f
            android.view.View r0 = r3.LJIIZILJ
            r0.offsetTopAndBottom(r1)
        L3f:
            if (r4 != 0) goto L43
            if (r1 == 0) goto L4c
        L43:
            X.19eO r0 = r3.LJIILLIIL
            X.19eN r0 = (X.C21589319eN) r0
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r0 = r0.LIZ
            r0.dispatchOnSlide(r5)
        L4c:
            if (r7 == 0) goto L63
            android.widget.OverScroller r0 = r3.LJIILL
            int r0 = r0.getFinalX()
            if (r6 != r0) goto L6a
            android.widget.OverScroller r0 = r3.LJIILL
            int r0 = r0.getFinalY()
            if (r5 != r0) goto L6a
            android.widget.OverScroller r0 = r3.LJIILL
            r0.abortAnimation()
        L63:
            android.view.ViewGroup r1 = r3.LJIJI
            Y.ARunnableS126S0100000_26 r0 = r3.LJIJJ
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r1, r0)
        L6a:
            int r0 = r3.LIZ
            if (r0 != r2) goto L74
            android.view.View r0 = r8.LL
            r0.postOnAnimation(r8)
            return
        L74:
            com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior r1 = r8.LLILLL
            int r0 = r8.LLILLJJLI
            r1.setStateInternal(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC21589119eL.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AdPopUpWebBottomSheetBehavior$SettleRunnable@5be8.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdPopUpWebBottomSheetBehavior$SettleRunnable@5be8.run");
    }

    public RunnableC21589119eL(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, View view, int i) {
        this.LLILLL = adPopUpWebBottomSheetBehavior;
        this.LL = view;
        this.LLILLJJLI = i;
    }
}
