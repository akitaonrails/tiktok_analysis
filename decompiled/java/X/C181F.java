package X;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: renamed from: X.181F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C181F implements View.OnClickListener {
    public static long LLILLJJLI;
    public final long LL = 400;

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
