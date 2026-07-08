package X;

import Y.ARunnableS106S0100000_6;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0H22, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H22 implements C1FZ5 {
    public int LIZ;
    public final int LIZIZ;
    public C0H23 LIZJ;
    public final C0H21 LIZLLL;
    public final ViewTreeObserverOnGlobalLayoutListenerC462870IDd LJ;

    @Override // X.C1FZ5
    public final void releaseListener() {
        C0H21 c0h21 = this.LIZLLL;
        C786410Ut5.C3(c0h21.getContentView().getViewTreeObserver(), this.LJ);
        Activity activityLIZ = C1388190mED.LIZ(c0h21.LL);
        if (activityLIZ == null || activityLIZ.isFinishing()) {
            return;
        }
        c0h21.dismiss();
    }

    public final void LIZ(C0H23 c0h23) {
        this.LIZJ = c0h23;
        C0H21 c0h21 = this.LIZLLL;
        C786410Ut5.x3(c0h21.getContentView().getViewTreeObserver(), this.LJ);
        HandlerHook.viewPost(c0h21.LLILLJJLI, new ARunnableS106S0100000_6(c0h21, 166));
    }

    public C0H22(C19EG c19eg, View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        this.LIZ = rect.bottom;
        this.LIZIZ = 200;
        this.LIZLLL = new C0H21(c19eg, view);
        this.LJ = new ViewTreeObserverOnGlobalLayoutListenerC462870IDd(this, 3);
    }
}
