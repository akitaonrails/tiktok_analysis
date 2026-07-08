package X;

import android.content.Context;
import android.os.Vibrator;

/* JADX INFO: renamed from: X.110j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class RunnableC194311110j implements Runnable {
    public boolean LL;
    public boolean LLILLJJLI;
    public final Context LLILLL;
    public boolean LLILZ = true;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        Vibrator vibrator;
        C1C7U.LIZ("LongPressHandler$LongPressThread@6f78.run");
        try {
            this.LL = true;
            if (this.LLILZ && (vibrator = (Vibrator) C786410Ut5.H2(this.LLILLL, "vibrator")) != null && vibrator.hasVibrator()) {
                vibrator.vibrate(10L);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LongPressHandler$LongPressThread@6f78.run");
    }

    public RunnableC194311110j(Context context) {
        this.LLILLL = context;
    }
}
