package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0XCL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCL {
    public final Object LIZ = new Object();
    public volatile boolean LIZIZ = false;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final ThreadLocal<Boolean> LIZLLL = new ThreadLocal<>();
    public volatile boolean LJ = false;
    public volatile boolean LJFF = false;

    public final void LIZ(boolean z) {
        if (z) {
            this.LIZLLL.set(Boolean.valueOf(z));
        } else {
            this.LIZLLL.remove();
        }
    }

    public final void LIZIZ(boolean z) {
        this.LJFF = z;
        if (z) {
            this.LIZLLL.set(Boolean.valueOf(z));
            return;
        }
        this.LIZLLL.remove();
        this.LJ = true;
        C844830XCf.LIZ("tryWaitingForInstallFinishWithOldWay finish because request finished");
    }

    public final void LIZJ(Integer num) {
        if (this.LIZJ.compareAndSet(false, true)) {
            C844830XCf.LIZ("start register install event");
            C0XCI c0xciLJII = C0XCI.LJII(String.valueOf(num));
            c0xciLJII.LIZIZ(false, new C0XD6() { // from class: X.0XCX
                @Override // X.C0XD6
                public final void LIZ(C0XBN c0xbn) {
                    C0XCL c0xcl = this.LIZ;
                    synchronized (c0xcl.LIZ) {
                        try {
                            c0xcl.LIZIZ = true;
                            c0xcl.LIZ.notifyAll();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
            C0XBN c0xbnLJI = c0xciLJII.LJI();
            if (c0xbnLJI != null && !TextUtils.isEmpty(c0xbnLJI.LL) && !TextUtils.isEmpty(c0xbnLJI.LLILLJJLI)) {
                synchronized (this.LIZ) {
                    try {
                        this.LIZIZ = true;
                        this.LIZ.notifyAll();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }
}
