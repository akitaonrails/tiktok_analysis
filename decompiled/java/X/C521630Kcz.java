package X;

import android.app.Activity;
import android.os.Looper;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.0Kcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521630Kcz extends C0W9W {
    public final int $t;
    public Object l0;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            default:
                super.run();
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if (validTopActivity != null) {
            SmartRouter.buildRoute(validTopActivity, ((C0XI4) this.l0).LJFF()).open();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("entry_point", "snp_enter_wellbeing");
        C20684815ws.LJIILLIIL("stm_enter_settings", c2344009Gk.LIZ);
    }

    public static final void run$0(C521630Kcz c521630Kcz) {
        C1C7U.LIZ("ScreenTimeCalcAndTimer@a85d.onJsBroadCastEvent$3");
        boolean zLJ = C0W9U.LJ(c521630Kcz.bpeaTraceContext);
        try {
            c521630Kcz.LIZ$0();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("ScreenTimeCalcAndTimer@a85d.onJsBroadCastEvent$3");
    }

    public static final void run$1(C521630Kcz c521630Kcz) {
        C1C7U.LIZ("IdleTask@1e4b.nextStep$1");
        boolean zLJ = C0W9U.LJ(c521630Kcz.bpeaTraceContext);
        try {
            C786410Ut5.f3((RunnableC1528190ps1) c521630Kcz.l0, Looper.getMainLooper().getQueue());
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("IdleTask@1e4b.nextStep$1");
    }

    public C521630Kcz(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
