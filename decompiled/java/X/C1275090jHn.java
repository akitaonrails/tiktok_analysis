package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS4S0101100_20;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.TTLHVideoContentReportConfig;

/* JADX INFO: renamed from: X.0jHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275090jHn implements C0UHF {
    public final ARunnableS120S0100000_20 LL = new ARunnableS120S0100000_20(this, 458);
    public final BPEAHandler LLILLJJLI = new BPEAHandler();
    public final Object LLILLL = new Object();
    public Boolean LLILZ = Boolean.FALSE;
    public final int LLILZIL;
    public final float LLILZLL;
    public final float LLIZ;
    public final InterfaceC1275670jIj LLIZLLLIL;
    public final InterfaceC1275670jIj LLJ;
    public final InterfaceC1275930jJ9 LLJI;

    public final void LIZ() {
        synchronized (this.LLILLL) {
            try {
                if (this.LLILZ.booleanValue()) {
                    return;
                }
                this.LLILZ = Boolean.TRUE;
                BPEAHandler bPEAHandler = this.LLILLJJLI;
                if (bPEAHandler != null) {
                    C786410Ut5.LJLIIL(this.LLILZIL, bPEAHandler, this.LL);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        synchronized (this.LLILLL) {
            try {
                if (this.LLILZ.booleanValue()) {
                    this.LLILZ = Boolean.FALSE;
                    BPEAHandler bPEAHandler = this.LLILLJJLI;
                    if (bPEAHandler != null) {
                        bPEAHandler.removeCallbacks(this.LL);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1272550jDh
    public final void onFaceDetectResultCallback(int i) {
        int iMin = Math.min(i, 1);
        if (iMin >= 0) {
            C786410Ut5.LJJZZIII(this.LLILLJJLI, new ARunnableS4S0101100_20(this, iMin, 3));
        }
    }

    public C1275090jHn(TTLHVideoContentReportConfig tTLHVideoContentReportConfig, InterfaceC1275930jJ9 interfaceC1275930jJ9) {
        this.LLILZIL = 45000;
        this.LLILZLL = 0.3f;
        this.LLIZ = 0.01f;
        int i = tTLHVideoContentReportConfig.reportIntervalMs;
        this.LLILZIL = i;
        int i2 = tTLHVideoContentReportConfig.faceCountStatsIntervalMs;
        int i3 = tTLHVideoContentReportConfig.vadStatsIntervalMs;
        this.LLJI = interfaceC1275930jJ9;
        this.LLILZLL = (float) tTLHVideoContentReportConfig.faceCountStatsThreshold;
        this.LLIZ = (float) tTLHVideoContentReportConfig.vadStatsThreshold;
        if (tTLHVideoContentReportConfig.isFaceCountEnable()) {
            this.LLIZLLLIL = C1275680jIk.LIZ(i, i2);
        }
        if (tTLHVideoContentReportConfig.isVadEnable()) {
            this.LLJ = C1275680jIk.LIZ(i, i3);
        }
        if (tTLHVideoContentReportConfig.enable) {
            LIZ();
        }
    }
}
