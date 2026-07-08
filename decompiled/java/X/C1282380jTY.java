package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: renamed from: X.0jTY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282380jTY extends C1282400jTa {
    public Handler LLLI;

    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        AVLog.logKibana(5, "H264HWVideoEncoder", this.LLLFZ.toString(), null);
        Handler handler = this.LLLI;
        if (handler == null) {
            return;
        }
        C1283060jUe.LIZIZ(handler, new ARunnableS120S0100000_20(this, 405));
        this.LLLI = null;
    }

    public final void LLJJIJIL() {
        super.release();
    }

    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder
    public final int Encode(VideoFrame videoFrame) {
        videoFrame.retain();
        if (!C786410Ut5.LJJZZIII(this.LLLI, new ARunnableS89S0200000_20(this, videoFrame, 228))) {
            videoFrame.release();
            if (this.LLJ) {
                AVLog.iow("H264HWVideoEncoder", "drop frame!");
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.C1282400jTa, com.ss.pusher.core.engine.VideoEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        AVLog.iow("H264HWVideoEncoder", "InitEncoder");
        this.LLLFZ.LJ(21);
        if (this.LLLI == null) {
            this.LLLFZ.LIZLLL(21, null);
            return false;
        }
        this.LLLFZ.LJ(22);
        boolean[] zArr = {false};
        try {
            C1283060jUe.LIZIZ(this.LLLI, new ARunnableS53S0300000_20(zArr, tEBundle, this, 68));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLFZ.LIZLLL(22, th);
        }
        return zArr[0];
    }

    public final void LLJJIJI(VideoFrame videoFrame) {
        super.Encode(videoFrame);
    }

    public final boolean LLJJIJIIJIL(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }

    public C1282380jTY(C1277590jLp c1277590jLp, Handler handler) {
        super(c1277590jLp);
        this.LLLI = handler;
        this.LLILLJJLI = "video/avc";
        this.LLLFZ.LJFF("H264HWVideoEncoder");
    }
}
