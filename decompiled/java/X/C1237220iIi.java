package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0iIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237220iIi implements WeakHandler.IHandler {
    public final long LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final WeakHandler LLIZ = new WeakHandler(this);
    public InterfaceC1237230iIj LLIZLLLIL;

    public final synchronized long LIZ() {
        return this.LLILLL;
    }

    public final synchronized boolean LIZIZ() {
        return this.LLILZLL;
    }

    public final synchronized void LIZJ() {
        this.LLILZIL = false;
        this.LLILZLL = true;
        if (this.LL <= 0) {
            this.LLILZIL = true;
            this.LLILZLL = false;
            InterfaceC1237230iIj interfaceC1237230iIj = this.LLIZLLLIL;
            if (interfaceC1237230iIj != null) {
                interfaceC1237230iIj.LIZLLL();
            }
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LL;
        this.LLILZ = jElapsedRealtime + j;
        this.LLILLL = j;
        InterfaceC1237230iIj interfaceC1237230iIj2 = this.LLIZLLLIL;
        if (interfaceC1237230iIj2 != null) {
            interfaceC1237230iIj2.onStart();
        }
        WeakHandler weakHandler = this.LLIZ;
        C786410Ut5.LJLJJL(weakHandler, weakHandler.obtainMessage(1));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        synchronized (this) {
            try {
                long jElapsedRealtime = this.LLILZ - SystemClock.elapsedRealtime();
                this.LLILLL = jElapsedRealtime;
                long j = 0;
                if (jElapsedRealtime <= 0) {
                    this.LLILZIL = true;
                    this.LLILZLL = false;
                    InterfaceC1237230iIj interfaceC1237230iIj = this.LLIZLLLIL;
                    if (interfaceC1237230iIj != null) {
                        interfaceC1237230iIj.LIZLLL();
                    }
                } else {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    InterfaceC1237230iIj interfaceC1237230iIj2 = this.LLIZLLLIL;
                    if (interfaceC1237230iIj2 != null) {
                        interfaceC1237230iIj2.LJJI(this.LLILLL);
                    }
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                    long j2 = this.LLILLL;
                    long j3 = this.LLILLJJLI;
                    if (j2 < j3) {
                        long j4 = j2 - jElapsedRealtime3;
                        if (j4 >= 0) {
                            j = j4;
                        }
                    } else {
                        long j5 = j3 - jElapsedRealtime3;
                        while (j5 < 0) {
                            j5 += this.LLILLJJLI;
                        }
                        j = j5;
                    }
                    WeakHandler weakHandler = this.LLIZ;
                    C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1), j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1237220iIi(long j, long j2, InterfaceC1237230iIj interfaceC1237230iIj) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLIZLLLIL = interfaceC1237230iIj;
    }
}
