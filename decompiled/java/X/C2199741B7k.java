package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.InputStream;

/* JADX INFO: renamed from: X.1B7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199741B7k {
    public final DownloadInfo LIZ;
    public final String LIZIZ;
    public final C1B8V LIZJ;
    public final InterfaceC2199141B5c LIZLLL;
    public final C1B5Y LJ;
    public C20130813pi LJFF;
    public BaseException LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public final InterfaceC2200111B8v LJIIIZ;
    public long LJIIJ;
    public final long LJIIJJI;
    public volatile long LJIIL;
    public volatile long LJIILIIL;
    public final C2199751B7l LJIILJJIL;
    public final C1490910ott LJIILL;
    public boolean LJIILLIIL = true;
    public final boolean LJIIZILJ;
    public final long LJIJ;
    public final long LJIJI;
    public final long LJIJJ;
    public final boolean LJIJJLI;
    public boolean LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public final C1490870otp LJJIII;
    public boolean LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public volatile boolean LJJIIZ;
    public volatile long LJJIIZI;
    public volatile long LJJIJ;

    public final boolean LIZIZ() {
        return this.LJII || this.LJIIIIZZ;
    }

    public final void LIZJ(boolean z) {
        long jNanoTime;
        if (!z && !this.LJIILLIIL) {
            return;
        }
        if (this.LJIJJLI) {
            jNanoTime = System.nanoTime();
        } else {
            jNanoTime = 0;
        }
        try {
            if (this.LJIILLIIL) {
                this.LJFF.LL.LIZJ();
            } else {
                this.LJFF.LL.flush();
            }
            this.LIZ.updateRealDownloadTime(true);
            InterfaceC2199641B7a interfaceC2199641B7aLIZ = C1B7E.LIZ(C2199661B7c.LJIJ());
            if (interfaceC2199641B7aLIZ != null) {
                interfaceC2199641B7aLIZ.updateDownloadInfo(this.LIZ);
            } else {
                this.LJ.LJJZZI(this.LIZ.getId(), this.LJIIJ);
            }
            this.LJJIIZI = this.LJIIJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LJIJJLI) {
            this.LJJIFFI += System.nanoTime() - jNanoTime;
        }
    }

    public final C2200141B8y LIZLLL(final InputStream inputStream) {
        C2200141B8y c2200141B8y;
        if (inputStream instanceof C2200141B8y) {
            c2200141B8y = (C2200141B8y) inputStream;
        } else {
            final float fLJII = (float) this.LJIILJJIL.LJII("throttle_factor_min", 0.10000000149011612d);
            final float fLJII2 = (float) this.LJIILJJIL.LJII("throttle_factor_max", 0.699999988079071d);
            c2200141B8y = new C2200141B8y(inputStream, fLJII, fLJII2) { // from class: X.1B8x
                public final float LLJ;
                public final float LLJI;
                public final float LLJIJIL;
                public long LLJJIJI;
                public long LLJJIJIIJIL;
                public long LLJJIJIL;
                public long LLJJJ;
                public long LLJJJIL;
                public double LLJJJJ;
                public long LLJJJJJIL;
                public double LLJJL;
                public float LLJILJIL = 0.1f;
                public final float LLJILJILJ = 0.1f;
                public final long LLJILLL = 1000;
                public final long LLJJ = 2000;
                public final C1B99 LLJJI = new C1B99(0.1d);
                public final C1B99 LLJJIII = new C1B99(0.1d);
                public final int LLJJJJLIIL = 60;

                public final void LIZIZ(float f) {
                    float fMax;
                    if (f > 0.0f) {
                        if (this.LLJILJIL >= this.LLJI) {
                            f = -this.LLJILJILJ;
                        }
                    } else if (f < 0.0f && this.LLJILJIL <= this.LLJ) {
                        f = this.LLJILJILJ;
                    }
                    float f2 = this.LLJILJIL + f;
                    this.LLJILJIL = f2;
                    if (f > 0.0f) {
                        fMax = Math.min(f2, this.LLJI);
                    } else {
                        fMax = Math.max(this.LLJ, f2);
                    }
                    this.LLJILJIL = fMax;
                }

                {
                    this.LLJ = 0.1f;
                    this.LLJI = 0.7f;
                    if (fLJII < fLJII2) {
                        if (fLJII >= 0.0f && fLJII < 1.0f) {
                            this.LLJ = fLJII;
                        }
                        if (fLJII2 > 0.0f && fLJII2 <= 1.0f) {
                            this.LLJI = fLJII2;
                        }
                    }
                    this.LLJIJIL = (this.LLJ + this.LLJI) / 2.0f;
                }

                /* JADX WARN: Removed duplicated region for block: B:50:0x010e  */
                @Override // X.C2200141B8y, java.io.InputStream
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int read(byte[] r20, int r21, int r22) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 326
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C2200131B8x.read(byte[], int, int):int");
                }
            };
        }
        long throttleNetSpeed = this.LIZ.getThrottleNetSpeed();
        int throttleSmoothness = this.LIZ.getThrottleSmoothness();
        c2200141B8y.LLILLJJLI = throttleNetSpeed;
        if (throttleSmoothness >= 1 && throttleSmoothness <= 100) {
            c2200141B8y.LLILLL = throttleSmoothness;
        }
        c2200141B8y.LLILZ = LSPassThroughRecordSizeConfig.DEFAULT / c2200141B8y.LLILLL;
        c2200141B8y.LLILZIL = throttleNetSpeed / ((long) c2200141B8y.LLILLL);
        return c2200141B8y;
    }

    public final void LIZ(long j, boolean z) {
        long j2;
        long j3 = j - this.LJJIJ;
        if (this.LJIIZILJ) {
            if (this.LJIILL.LIZJ()) {
                j2 = this.LJIJ;
            } else {
                j2 = this.LJIJI;
            }
            if (j3 > j2) {
                LIZJ(false);
                this.LJJIJ = j;
                return;
            }
            return;
        }
        long j4 = this.LJIIJ - this.LJJIIZI;
        if (!z && (j4 <= 65536 || j3 <= 500)) {
            return;
        }
        LIZJ(false);
        this.LJJIJ = j;
    }

    public C2199741B7k(DownloadInfo downloadInfo, String str, C1B8V c1b8v, long j, long j2, C1490870otp c1490870otp, InterfaceC2200111B8v interfaceC2200111B8v) {
        boolean z;
        this.LIZ = downloadInfo;
        this.LIZIZ = str;
        InterfaceC2199141B5c interfaceC2199141B5cLJIIJJI = C2199681B7e.LJIIJJI();
        this.LIZLLL = interfaceC2199141B5cLJIIJJI;
        if (interfaceC2199141B5cLJIIJJI instanceof C1B5Z) {
            this.LJ = ((C1B5Z) interfaceC2199141B5cLJIIJJI).LLILLJJLI;
        }
        this.LIZJ = c1b8v;
        this.LJIIIZ = interfaceC2200111B8v;
        this.LJIIJ = j;
        this.LJIIJJI = j;
        this.LJIILIIL = j2;
        this.LJIIL = downloadInfo.getEndOffset();
        this.LJIILL = C1490860oto.LIZ;
        C2199751B7l c2199751B7lLJFF = C2199751B7l.LJFF(downloadInfo.getId(), null);
        this.LJIILJJIL = c2199751B7lLJFF;
        if (c2199751B7lLJFF.LJIIIIZZ("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIZILJ = z;
        if (z) {
            long jLJIIIIZZ = c2199751B7lLJFF.LJIIIIZZ("sync_interval_ms_fg", 5000);
            long jLJIIIIZZ2 = c2199751B7lLJFF.LJIIIIZZ("sync_interval_ms_bg", LSPassThroughRecordSizeConfig.DEFAULT);
            this.LJIJ = Math.max(jLJIIIIZZ, 500L);
            this.LJIJI = Math.max(jLJIIIIZZ2, 500L);
            this.LJIJJ = c2199751B7lLJFF.LJIIJ("sync_min_length", 10485760L);
        } else {
            this.LJIJ = 0L;
            this.LJIJI = 0L;
            this.LJIJJ = 0L;
        }
        this.LJIJJLI = c2199751B7lLJFF.LJIIIIZZ("monitor_rw", 0) == 1;
        this.LJJIII = c1490870otp;
        this.LJJIIJ = true;
    }
}
