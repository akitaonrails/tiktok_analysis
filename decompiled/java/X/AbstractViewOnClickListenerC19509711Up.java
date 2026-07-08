package X;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: renamed from: X.11Up, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractViewOnClickListenerC19509711Up implements View.OnClickListener {
    public static long LLILLJJLI;
    public final long LL = 300;

    public abstract void LIZ(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - LLILLJJLI > this.LL) {
            LLILLJJLI = jUptimeMillis;
            LIZ(view);
        }
    }
}
