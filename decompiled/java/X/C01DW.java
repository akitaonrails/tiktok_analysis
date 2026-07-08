package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.01DW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class C01DW implements View.OnClickListener {
    public final long LL;
    public long LLILLJJLI;

    public abstract void LIZ(View view);

    public void LIZIZ(View view) {
    }

    public C01DW() {
        this(300L);
    }

    public C01DW(long j) {
        this.LL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zLJI = MethodIDManager.LJI(196782);
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LLILLJJLI >= this.LL) {
            this.LLILLJJLI = jUptimeMillis;
            LIZ(view);
        } else {
            LIZIZ(view);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
