package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.player.VideoAsset;
import com.lynx.animax.util.AnimaXLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0jYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285630jYn extends AbstractC1285650jYp implements SurfaceTexture.OnFrameAvailableListener, InterfaceC1285660jYq {
    public boolean LLJI;
    public final Lock LLJIJIL;
    public final Condition LLJILJIL;
    public C1285620jYm LLJILJILJ;
    public BPEAHandler LLJILLL;
    public volatile boolean LLJJ;

    @Override // X.AbstractC1285650jYp, com.lynx.animax.player.IVideoPlayer
    public final void destroy() {
        if (this.LLJJ) {
            return;
        }
        this.LLJJ = true;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C20719089t c20719089tLIZ = C20719089t.LIZ();
        ARunnableS89S0200000_20 aRunnableS89S0200000_20 = new ARunnableS89S0200000_20(this, countDownLatch, 204);
        BPEAHandler bPEAHandler = c20719089tLIZ.LIZIZ;
        if (bPEAHandler == null) {
            AnimaXLog.LIZ("CodecThreadManager", "Attempted to post to codec thread after it was released or not alive.");
        } else {
            bPEAHandler.removeCallbacksAndMessages(null);
            C786410Ut5.LJL(c20719089tLIZ.LIZIZ, aRunnableS89S0200000_20);
        }
        try {
            long j = this.LLJ.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy: wait for codec thread to complete destroy tasks with ");
            sbLIZ.append(j);
            sbLIZ.append("ms");
            AnimaXLog.LIZIZ("VideoPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
            if (!countDownLatch.await(j, TimeUnit.MILLISECONDS)) {
                AnimaXLog.LIZJ("VideoPlayerImpl", "Timeout waiting for codec thread to complete destroy tasks");
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            AnimaXLog.LIZJ("VideoPlayerImpl", "Interrupted while waiting for codec thread to complete destroy tasks");
            C786410Ut5.u3().interrupt();
        }
        super.destroy();
    }

    public final void LJFF(Runnable runnable) {
        if (this.LLJJ) {
            return;
        }
        C20719089t c20719089tLIZ = C20719089t.LIZ();
        if (c20719089tLIZ.LIZIZ == null) {
            AnimaXLog.LIZ("CodecThreadManager", "Attempted to post to codec thread after it was released or not alive.");
        } else if (Looper.myLooper() == c20719089tLIZ.LIZIZ.getLooper()) {
            runnable.run();
        } else {
            C786410Ut5.LJJZZIII(c20719089tLIZ.LIZIZ, runnable);
        }
    }

    public final void LJI(Runnable runnable) {
        if (this.LLJILLL != null) {
            if (Looper.myLooper() == this.LLJILLL.getLooper()) {
                runnable.run();
                return;
            } else {
                C786410Ut5.LJJZZIII(this.LLJILLL, runnable);
                return;
            }
        }
        AnimaXLog.LIZ("VideoPlayerImpl", "Attempted to post to GL thread after it was released or not alive.");
    }

    @Override // X.AbstractC1285650jYp, com.lynx.animax.player.IVideoPlayer
    public final void attachAsset(VideoAsset videoAsset) {
        super.attachAsset(videoAsset);
        LJFF(new ARunnableS89S0200000_20(this, new ARunnableS89S0200000_20(this, videoAsset, 203), 205));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        ((ReentrantLock) this.LLJIJIL).lock();
        this.LLJI = true;
        try {
            this.LLJILJIL.signalAll();
            ((ReentrantLock) this.LLJIJIL).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LLJIJIL).unlock();
            throw th;
        }
    }

    @Override // X.AbstractC1285650jYp, com.lynx.animax.player.IVideoPlayer
    public final void setSurface(int i) {
        super.setSurface(i);
        this.LLJI = false;
        this.LLILLJJLI.setOnFrameAvailableListener(this, C787470Uun.LIZ());
        if (this.LL == null) {
            AnimaXLog.LIZ("VideoPlayerImpl", "setSurface error: mAsset is null");
        } else {
            LJFF(new ARunnableS89S0200000_20(this, new ARunnableS120S0100000_20(this, 334), 205));
        }
    }

    @Override // com.lynx.animax.player.IVideoPlayer
    public final boolean updateSurface(int i) {
        if (this.LLJJ) {
            return false;
        }
        LJFF(new ARunnableS89S0200000_20(this, new ARunnableS31S0101000_20(i, this, 28), 205));
        if (this.LLJILLL != null && Looper.myLooper() == this.LLJILLL.getLooper()) {
            ((ReentrantLock) this.LLJIJIL).lock();
            if (!this.LLJI) {
                try {
                    try {
                        this.LLJILJIL.await(this.LLJ.LIZJ, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("await onFrameAvailable error: ");
                        sbLIZ.append(e);
                        AnimaXLog.LIZ("VideoPlayerImpl", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    boolean z = this.LLJI;
                    this.LLJI = false;
                    ((ReentrantLock) this.LLJIJIL).unlock();
                    if (!z) {
                        AnimaXLog.LIZ("VideoPlayerImpl", "await onFrameAvailable time out");
                        return false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LLJI = false;
                    ((ReentrantLock) this.LLJIJIL).unlock();
                    throw th;
                }
            } else {
                this.LLJI = false;
                ((ReentrantLock) this.LLJIJIL).unlock();
            }
            this.LLILLJJLI.updateTexImage();
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Must be called on GL thread, current: ");
        sbLIZ2.append(C786410Ut5.u3().getName());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C1285630jYn(long j, C1285670jYr c1285670jYr) {
        super(c1285670jYr);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LLJIJIL = reentrantLock;
        this.LLJILJIL = reentrantLock.newCondition();
        this.LLJJ = false;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.LLJILLL = new BPEAHandler(looperMyLooper);
        }
        LJFF(new ARunnableS120S0100000_20(this, 333));
        C1285670jYr c1285670jYr2 = this.LLJ;
        if (c1285670jYr2.LIZJ <= 0) {
            c1285670jYr2.LIZJ = 20L;
        }
        if (c1285670jYr2.LIZLLL <= 0) {
            c1285670jYr2.LIZLLL = 1000L;
        }
    }
}
