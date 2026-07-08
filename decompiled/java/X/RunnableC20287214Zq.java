package X;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.14Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC20287214Zq implements Runnable {
    public final /* synthetic */ View LL;
    public final /* synthetic */ FrameLayout LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = true;
    public final /* synthetic */ C20286814Zm LLILZ;

    public RunnableC20287214Zq(View view, C0J0X c0j0x, C20286814Zm c20286814Zm) {
        this.LL = view;
        this.LLILLJJLI = c0j0x;
        this.LLILZ = c20286814Zm;
    }

    public final void LIZ() {
        View view;
        float top = ((this.LL.getTop() + this.LL.getBottom()) / 2.0f) - ((this.LLILLJJLI.getTop() + this.LLILLJJLI.getBottom()) / 2.0f);
        boolean z = this.LLILLL || this.LLILZ.LJIIJ != top;
        C20286814Zm c20286814Zm = this.LLILZ;
        c20286814Zm.LJIIJ = top;
        if (c20286814Zm.LJJLIIIIJ) {
            c20286814Zm.LJIIJ = 0.0f;
        }
        if (!z || (view = c20286814Zm.LJJIJIIJI) == null) {
            return;
        }
        if (c20286814Zm.LJIILIIL < 0.0f || c20286814Zm.LJIILJJIL < 0.0f) {
            c20286814Zm.LJIIJJI = view.getMeasuredHeight();
            c20286814Zm.LJIIL = c20286814Zm.LJJIJIIJI != null ? r0.getMeasuredWidth() : 0.0f;
            c20286814Zm.LJIILIIL = c20286814Zm.LJIILJJIL();
            c20286814Zm.LJIILJJIL = c20286814Zm.LJIILL();
        }
        if (c20286814Zm.LJIJJ) {
            c20286814Zm.LJI.LJIIIZ("[recoverScalingStates] video scaled");
            c20286814Zm.LJJIIJ(c20286814Zm.LJJIJIIJI, 1.0f);
            InterfaceC1049140dPM interfaceC1049140dPM = c20286814Zm.LJJLIIIJLLLLLLLZ;
            c20286814Zm.LJJIIJ(interfaceC1049140dPM != null ? interfaceC1049140dPM.LIZ() : null, 1.0f);
            c20286814Zm.LJJIFFI(1.0f, true);
            c20286814Zm.LJJII(1.0f);
            c20286814Zm.LJIIJJI(true, false);
            C0J0X c0j0x = c20286814Zm.LJJIIJ;
            if (c0j0x != null) {
                C786410Ut5.U4(c0j0x, 1.0f);
            }
            View view2 = c20286814Zm.LJJJJ;
            if (view2 != null) {
                view2.setClickable(true);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VideoTouchScalingController@4c1e.updatePlayerViewOffset$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoTouchScalingController@4c1e.updatePlayerViewOffset$1");
    }
}
