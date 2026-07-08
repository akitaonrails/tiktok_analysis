package X;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0vGH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1735430vGH implements WeakHandler.IHandler {
    public final long LL;
    public final long LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final WeakHandler LLJ = new WeakHandler(this);
    public InterfaceC1735440vGI LLJI;

    public final synchronized void LIZ() {
        this.LLILZIL = true;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ.removeMessages(1);
    }

    public final synchronized boolean LIZIZ() {
        return this.LLILZIL;
    }

    public final synchronized boolean LIZJ() {
        return this.LLIZ;
    }

    public final synchronized void LIZLLL() {
        if (this.LLIZ) {
            this.LLIZLLLIL = true;
            this.LLJ.removeMessages(1);
            this.LLILZ = this.LLILLL - SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void LJ() {
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.LLILZ;
            this.LLILLL = jElapsedRealtime + j;
            long j2 = this.LL - j;
            long j3 = this.LLILLJJLI;
            WeakHandler weakHandler = this.LLJ;
            C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1), j3 - (j2 % j3));
        }
    }

    public final synchronized void LJFF() {
        this.LLIZLLLIL = false;
        this.LLILZIL = false;
        this.LLILZLL = false;
        this.LLIZ = true;
        if (this.LL <= 0) {
            this.LLILZLL = true;
            this.LLIZ = false;
            InterfaceC1735440vGI interfaceC1735440vGI = this.LLJI;
            if (interfaceC1735440vGI != null) {
                interfaceC1735440vGI.LIZLLL();
            }
            return;
        }
        InterfaceC1735440vGI interfaceC1735440vGI2 = this.LLJI;
        if (interfaceC1735440vGI2 != null) {
            interfaceC1735440vGI2.onStart();
        }
        this.LLILLL = SystemClock.elapsedRealtime() + this.LL;
        WeakHandler weakHandler = this.LLJ;
        C786410Ut5.LJLJJL(weakHandler, weakHandler.obtainMessage(1));
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        synchronized (this) {
            try {
                if (!this.LLILZIL && !this.LLIZLLLIL) {
                    long jElapsedRealtime = this.LLILLL - SystemClock.elapsedRealtime();
                    long j = 0;
                    if (jElapsedRealtime <= 0) {
                        this.LLILZLL = true;
                        this.LLIZ = false;
                        InterfaceC1735440vGI interfaceC1735440vGI = this.LLJI;
                        if (interfaceC1735440vGI != null) {
                            interfaceC1735440vGI.LIZLLL();
                        }
                    } else {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        InterfaceC1735440vGI interfaceC1735440vGI2 = this.LLJI;
                        if (interfaceC1735440vGI2 != null) {
                            interfaceC1735440vGI2.LJJI(jElapsedRealtime);
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
                        WeakHandler weakHandler = this.LLJ;
                        C786410Ut5.LJLJLJ(weakHandler, weakHandler.obtainMessage(1), j);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1735430vGH(long j, long j2, InterfaceC1735440vGI interfaceC1735440vGI) {
        this.LL = j;
        this.LLILLJJLI = j2;
        this.LLJI = interfaceC1735440vGI;
    }
}
