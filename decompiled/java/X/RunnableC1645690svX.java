package X;

import Y.ARunnableS125S0100000_25;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0svX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class RunnableC1645690svX implements Runnable {
    public final CharSequence LL;
    public final CharSequence LLILLJJLI;
    public final boolean LLILLL;
    public final /* synthetic */ C1645700svY LLILZ;

    public final void LIZ() {
        TextView textView;
        TextView textView2;
        C1645700svY c1645700svY = this.LLILZ;
        if (c1645700svY.LL == null || c1645700svY.LLILLJJLI == null) {
            return;
        }
        c1645700svY.animate().cancel();
        this.LLILZ.LL.animate().cancel();
        this.LLILZ.LLILLJJLI.animate().cancel();
        C1645700svY c1645700svY2 = this.LLILZ;
        HandlerHook.viewRemoveCallbacks(c1645700svY2, c1645700svY2.LLILLL);
        C1645700svY c1645700svY3 = this.LLILZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1645700svY3);
        c1645700svY3.setAlpha(1.0f);
        C1645700svY c1645700svY4 = this.LLILZ;
        int visibility = c1645700svY4.getVisibility();
        c1645700svY4.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1645700svY4);
        boolean z = this.LLILLL;
        C1645700svY c1645700svY5 = this.LLILZ;
        if (z) {
            textView = c1645700svY5.LL;
            textView2 = c1645700svY5.LLILLJJLI;
        } else {
            textView = c1645700svY5.LLILLJJLI;
            textView2 = c1645700svY5.LL;
        }
        C786410Ut5.Hc(0.0f, textView);
        C786410Ut5.Hc(this.LLILLL ? C1645700svY.LLILZ : C1645700svY.LLILZ * (-1.0f), textView2);
        C786410Ut5.S4(1.0f, textView);
        C786410Ut5.S4(0.0f, textView2);
        textView.setText(this.LL);
        textView2.setText(this.LLILLJJLI);
        textView.animate().translationX(this.LLILLL ? C1645700svY.LLILZ * (-1.0f) : C1645700svY.LLILZ).alpha(0.0f).withEndAction(new ARunnableS125S0100000_25(this, 78)).setDuration(300L).start();
        textView2.animate().translationX(0.0f).alpha(1.0f).setDuration(300L).start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FilterIndicator$PendingAction@7b2e.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FilterIndicator$PendingAction@7b2e.run");
    }

    public RunnableC1645690svX(C1645700svY c1645700svY, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.LLILZ = c1645700svY;
        this.LL = charSequence;
        this.LLILLJJLI = charSequence2;
        this.LLILLL = z;
    }
}
