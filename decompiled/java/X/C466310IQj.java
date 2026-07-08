package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466310IQj implements WeakHandler.IHandler {
    public final long LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final WeakHandler LLIZLLLIL = new WeakHandler(this);
    public final InterfaceC466320IQk LLJ;

    public final synchronized void LIZ() {
        this.LLILZIL = true;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL.removeMessages(1);
    }

    public final synchronized boolean LIZIZ() {
        return this.LLILZLL;
    }

    public final synchronized void LIZJ() {
        if (this.LLILZLL) {
            this.LLIZ = true;
            this.LLIZLLLIL.removeMessages(1);
            this.LLILZ = this.LLILLL - SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void LIZLLL() {
        if (this.LLIZ) {
            this.LLIZ = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LLILZ;
            this.LLILLL = jElapsedRealtime + j;
            long j2 = this.LL - j;
            long j3 = this.LLILLJJLI;
            WeakHandler weakHandler = this.LLIZLLLIL;
            C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1), j3 - (j2 % j3));
        }
    }

    public final synchronized C466310IQj LJ() {
        this.LLIZ = false;
        this.LLILZIL = false;
        this.LLILZLL = true;
        if (this.LL <= 0) {
            this.LLILZLL = false;
            InterfaceC466320IQk interfaceC466320IQk = this.LLJ;
            if (interfaceC466320IQk != null) {
                interfaceC466320IQk.LIZLLL();
            }
            return this;
        }
        InterfaceC466320IQk interfaceC466320IQk2 = this.LLJ;
        if (interfaceC466320IQk2 != null) {
            interfaceC466320IQk2.onStart();
        }
        this.LLILLL = SystemClock.elapsedRealtime() + this.LL;
        WeakHandler weakHandler = this.LLIZLLLIL;
        C786410Ut5.LJLJJL(weakHandler, weakHandler.obtainMessage(1));
        return this;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        synchronized (this) {
            try {
                if (!this.LLILZIL && !this.LLIZ) {
                    long jElapsedRealtime = this.LLILLL - SystemClock.elapsedRealtime();
                    long j = 0;
                    if (jElapsedRealtime <= 0) {
                        this.LLILZLL = false;
                        InterfaceC466320IQk interfaceC466320IQk = this.LLJ;
                        if (interfaceC466320IQk != null) {
                            interfaceC466320IQk.LIZLLL();
                        }
                    } else {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        InterfaceC466320IQk interfaceC466320IQk2 = this.LLJ;
                        if (interfaceC466320IQk2 != null) {
                            interfaceC466320IQk2.LJJI(jElapsedRealtime);
                        }
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime2;
                        long j2 = this.LLILLJJLI;
                        if (jElapsedRealtime < j2) {
                            long j3 = jElapsedRealtime - jElapsedRealtime3;
                            if (j3 >= 0) {
                                j = j3;
                            }
                        } else {
                            long j4 = j2 - jElapsedRealtime3;
                            while (j4 < 0) {
                                j4 += this.LLILLJJLI;
                            }
                            j = j4;
                        }
                        WeakHandler weakHandler = this.LLIZLLLIL;
                        C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1), j);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C466310IQj(long j, long j2, InterfaceC466320IQk interfaceC466320IQk) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLJ = interfaceC466320IQk;
    }
}
