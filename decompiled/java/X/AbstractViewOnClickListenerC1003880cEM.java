package X;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: renamed from: X.0cEM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractViewOnClickListenerC1003880cEM implements View.OnClickListener {
    public static final C1003890cEN LLILLL = new Object() { // from class: X.0cEN
    };
    public static final long LLILZ = 300;
    public final long LL;
    public volatile long LLILLJJLI;

    public abstract void LIZ(View view);

    public AbstractViewOnClickListenerC1003880cEM() {
        this(LLILZ);
    }

    public AbstractViewOnClickListenerC1003880cEM(long j) {
        this.LL = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && SystemClock.uptimeMillis() - this.LLILLJJLI > this.LL) {
            this.LLILLJJLI = SystemClock.uptimeMillis();
            LIZ(view);
        }
    }
}
