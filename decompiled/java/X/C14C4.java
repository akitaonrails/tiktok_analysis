package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* JADX INFO: renamed from: X.14C4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14C4 {
    public final C14C3 LIZ;
    public PthreadTimer LIZIZ;
    public long LIZJ;
    public long LIZLLL = -1;

    public final void LIZ() {
        PthreadTimer pthreadTimer = this.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            this.LIZIZ = null;
        }
        this.LIZLLL = -1L;
        this.LIZJ = 0L;
    }

    public C14C4(C1BLI c1bli) {
        this.LIZ = c1bli;
    }
}
