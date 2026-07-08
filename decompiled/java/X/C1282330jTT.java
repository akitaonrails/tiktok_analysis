package X;

import Y.ARunnableS120S0100000_20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: renamed from: X.0jTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282330jTT extends C1282390jTZ {
    public Handler LLLIIII;

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        AVLog.logKibana(5, "OesTextureHWEncoder", this.LLLII.toString(), null);
        Handler handler = this.LLLIIII;
        if (handler != null) {
            C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(this, 249));
        } else {
            super.release();
        }
    }

    @Override // X.C1282390jTZ
    public final boolean LLJILJILJ() {
        AVLog.iod("OesTextureHWEncoder", "using OesTextureHWEncoder!");
        return super.LLJILJILJ();
    }

    public final void LLJJ() {
        super.release();
    }

    public C1282330jTT(boolean z) {
        String str;
        if (z) {
            str = C1282600jTu.LIZ;
        } else {
            str = "video/avc";
        }
        this.LLILLJJLI = str;
        this.LLLII.LJI("OesTextureHWEncoder");
    }

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final int Encode(VideoFrame videoFrame) {
        return super.Encode(videoFrame);
    }

    @Override // X.C1282390jTZ, com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final boolean InitEncoder(TEBundle tEBundle) {
        AVLog.iow("OesTextureHWEncoder", "InitEncoder");
        this.LLLII.LJFF(21);
        Thread threadU3 = C786410Ut5.u3();
        if (threadU3 instanceof SafeHandlerThread) {
            this.LLLIIII = ((SafeHandlerThread) threadU3).getHandler();
            C1267520j5a.LIZ();
        } else {
            this.LLLII.LJ(21, null);
            C1274080jGA.LIZ.LIZ("OesTextureHWEncoder.InitEncoder", new AndroidRuntimeException("BUG! not handlerthread"));
        }
        this.LLLII.LJFF(22);
        try {
            return super.InitEncoder(tEBundle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLLII.LJ(22, th);
            return false;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public final void setNativeObj(long j) {
        if (j == 0) {
            try {
                release();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        super.setNativeObj(j);
    }
}
