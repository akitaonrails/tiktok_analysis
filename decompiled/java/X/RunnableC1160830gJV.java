package X;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;

/* JADX INFO: renamed from: X.0gJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class RunnableC1160830gJV implements Runnable {
    public final Handler LL;
    public final InterfaceC1162920gMs LLILLJJLI;
    public boolean LLILLL = true;

    public final void LIZ() {
        if (this.LLILLL) {
            InterfaceC1162920gMs interfaceC1162920gMs = this.LLILLJJLI;
            if (interfaceC1162920gMs != null) {
                interfaceC1162920gMs.start();
            }
            this.LLILLL = false;
            C786410Ut5.LJLIIL(LiveFluencyPeriodDurationSetting.INSTANCE.getValue(), this.LL, this);
            return;
        }
        InterfaceC1162920gMs interfaceC1162920gMs2 = this.LLILLJJLI;
        if (interfaceC1162920gMs2 != null) {
            interfaceC1162920gMs2.stop();
        }
        this.LLILLL = true;
        C786410Ut5.LJLIIL(LiveFluencyPeriodIntervalSetting.INSTANCE.getValue(), this.LL, this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PeriodRunnable@1f37.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PeriodRunnable@1f37.run");
    }

    public RunnableC1160830gJV(Handler handler, C1300480jwk c1300480jwk) {
        this.LL = handler;
        this.LLILLJJLI = c1300480jwk;
    }
}
