package X;

import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.utils.WeakHandler;

/* JADX INFO: renamed from: X.1Cwq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2246821Cwq implements InterfaceC789190UxZ {
    public static final C2247091CxH LJFF = new IProgressListener() { // from class: X.1CxH
        @Override // com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener
        public final void onProgress(long j) {
        }
    };
    public IMediaPlayer<AbsPlayer<AbsPlayer>> LIZ;
    public IProgressListener LIZIZ = LJFF;
    public long LIZJ = 500;
    public WeakHandler LIZLLL;
    public HandlerThread LJ;

    public final void LIZ() {
        synchronized (C2246821Cwq.class) {
            try {
                WeakHandler weakHandler = this.LIZLLL;
                if (weakHandler != null) {
                    weakHandler.removeCallbacksAndMessages(null);
                    this.LIZLLL = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ() {
        if (this.LIZ == null || this.LIZIZ == LJFF) {
            return;
        }
        LIZ();
        if (this.LJ == null) {
            HandlerThread handlerThread = new HandlerThread("progress - thread");
            this.LJ = handlerThread;
            handlerThread.start();
        }
        synchronized (C2246821Cwq.class) {
            try {
                this.LIZLLL = new WeakHandler(this, C786410Ut5.W2(this.LJ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZIZ(this.LIZJ - (((long) this.LIZ.getCurrentPosition()) % this.LIZJ));
    }

    public final void LIZLLL() {
        if (this.LIZ == null || this.LIZIZ == LJFF) {
            return;
        }
        LIZ();
    }

    public final void LIZIZ(long j) {
        synchronized (C2246821Cwq.class) {
            try {
                if (this.LIZLLL != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 0;
                    this.LIZLLL.sendMessageDelayed(messageObtain, j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC789190UxZ
    public final void handleMsg(Message message) {
        if (message.what == 0) {
            if (this.LIZ != null && this.LIZIZ != null) {
                try {
                    this.LIZIZ.onProgress(r1.getCurrentPosition());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            LIZIZ(this.LIZJ);
        }
    }
}
