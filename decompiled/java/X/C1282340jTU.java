package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: renamed from: X.0jTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282340jTU extends C1282390jTZ {
    public Handler LLLIIII;

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        AVLog.logKibana(5, "ByteVC1HWVideoEncoder", this.LLLII.toString(), null);
        Handler handler = this.LLLIIII;
        if (handler == null) {
            return;
        }
        C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 246));
        this.LLLIIII = null;
    }

    public final void LLJJIII() {
        super.release();
    }

    public C1282340jTU(Handler handler) {
        this.LLLIIII = handler;
        this.LLILLJJLI = C1282600jTu.LIZ;
        this.LLLII.LJI("ByteVC1HWVideoEncoder");
    }

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final int Encode(VideoFrame videoFrame) {
        videoFrame.retain();
        if (!C786410Ut5.LJJZZIII(this.LLLIIII, new ARunnableS89S0200000_20(this, videoFrame, 158))) {
            videoFrame.release();
            if (this.LLJ) {
                AVLog.iow("ByteVC1HWVideoEncoder", "drop frame!");
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        AVLog.iow("ByteVC1HWVideoEncoder", "InitEncoder");
        this.LLLII.LJFF(21);
        if (this.LLLIIII == null) {
            this.LLLII.LJ(21, null);
            return false;
        }
        this.LLLII.LJFF(22);
        boolean[] zArr = {false};
        try {
            C1283100jUi.LIZIZ(this.LLLIIII, new ARunnableS53S0300000_20(zArr, tEBundle, this, 50));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLII.LJ(22, th);
        }
        return zArr[0];
    }

    public final void LLJJ(VideoFrame videoFrame) {
        super.Encode(videoFrame);
    }

    public final boolean LLJJI(TEBundle tEBundle) {
        return super.InitEncoder(tEBundle);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void setNativeObj(long j) {
        if (j == 0) {
            release();
        }
        super.setNativeObj(j);
    }
}
