package X;

import android.view.View;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.pause.PausePanelComponent;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;

/* JADX INFO: renamed from: X.0rb1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class RunnableC1594530rb1 implements Runnable {
    public boolean LL;
    public final /* synthetic */ PausePanelComponent LLILLJJLI;

    public final void LIZ() {
        IPlayButtonAbility iPlayButtonAbility = (IPlayButtonAbility) this.LLILLJJLI.LLILZIL.getValue();
        if (iPlayButtonAbility != null && iPlayButtonAbility.Ol0()) {
            if (this.LL) {
                this.LLILLJJLI.vo();
            } else {
                View viewLo = this.LLILLJJLI.lo();
                if (viewLo != null) {
                    C786410Ut5.LJLLLLLL(0, viewLo);
                }
                View viewLo2 = this.LLILLJJLI.lo();
                if (viewLo2 != null) {
                    C786410Ut5.T4(viewLo2, 1.0f);
                }
                IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) this.LLILLJJLI.LLILZLL.getValue();
                if (iAutoAScrollAbility != null) {
                    iAutoAScrollAbility.AU0();
                }
                this.LLILLJJLI.getClass();
            }
        }
        this.LL = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PausePanelComponent$ResumeRunnable@7627.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PausePanelComponent$ResumeRunnable@7627.run");
    }

    public RunnableC1594530rb1(PausePanelComponent pausePanelComponent) {
        this.LLILLJJLI = pausePanelComponent;
    }
}
