package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: renamed from: X.0XA9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XA9 extends AbstractC791320V2k {
    public final Handler LLILLJJLI = C083Z.LIZIZ.LIZ();
    public final long LLILLL;
    public final C0XAM LLILZ;
    public final int LLILZIL;
    public final C0XAE LLILZLL;
    public long LLIZ;

    public C0XA9(C0XAE c0xae) {
        this.LLILZLL = c0xae;
        Looper.getMainLooper().getThread();
        long j = c0xae.LIZIZ;
        this.LLILLL = j;
        this.LLILZIL = (int) ((c0xae.LIZ / j) - 1);
        this.LLILZ = new C0XAM(this);
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILJJIL(String str) {
        this.LL = true;
        if (SystemClock.uptimeMillis() - this.LLIZ >= this.LLILZLL.LIZJ) {
            C0XAM c0xam = this.LLILZ;
            c0xam.LL = true;
            SystemClock.uptimeMillis();
            c0xam.LLILZIL = Long.valueOf(System.currentTimeMillis());
            C786410Ut5.LJLIIL(this.LLILLL, this.LLILLJJLI, this.LLILZ);
        }
    }

    @Override // X.AbstractC791320V2k
    public final void LJIILL(long j, long j2, long j3, long j4, boolean z) {
        this.LLILLJJLI.removeCallbacks(this.LLILZ);
        this.LL = false;
    }
}
