package X;

import Y.ARunnableS126S0100000_26;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0uLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ChoreographerFrameCallbackC1700350uLh implements Choreographer.FrameCallback, Handler.Callback {
    public static final ChoreographerFrameCallbackC1700350uLh LLJIJIL = new ChoreographerFrameCallbackC1700350uLh();
    public volatile long LL = -9223372036854775807L;
    public volatile long LLILLJJLI = -9223372036854775807L;
    public volatile int LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final BPEAHandler LLIZ;
    public final Bundle LLIZLLLIL;
    public Choreographer LLJ;
    public int LLJI;

    public ChoreographerFrameCallbackC1700350uLh() {
        HandlerThread handlerThread = new HandlerThread("Vsync:Handler");
        handlerThread.start();
        this.LLIZ = new BPEAHandler(C786410Ut5.W2(handlerThread), this);
        this.LLIZLLLIL = new Bundle();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 61));
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Message messageObtainMessage = this.LLIZ.obtainMessage(2);
        this.LLIZLLLIL.putLong("time", j);
        messageObtainMessage.setData(this.LLIZLLLIL);
        messageObtainMessage.sendToTarget();
        this.LLJ.postFrameCallback(this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Choreographer choreographer;
        Choreographer choreographer2;
        int i = message.what;
        if (i != 0) {
            int iRound = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return false;
                    }
                    this.LLILZ = message.getData().getLong("vsync");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("refresh rate = ");
                    sbLIZ.append(this.LLILZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return true;
                }
                long j = message.getData().getLong("time");
                if (this.LLILZ != 0) {
                    this.LL = j;
                    if (this.LLILLJJLI == -9223372036854775807L) {
                        this.LLILLJJLI = this.LL;
                    } else {
                        long j2 = this.LL - this.LLILLJJLI;
                        if (j2 <= 0) {
                            this.LLILLJJLI = -9223372036854775807L;
                            return true;
                        }
                        long j3 = this.LLILZ;
                        long j4 = j2 - j3;
                        if (j4 > 0) {
                            iRound = Math.round(j4 / j3);
                        }
                        this.LLILLL += iRound;
                        int iMin = (int) (1000000000 / j2);
                        this.LLILZIL = iMin;
                        int i2 = this.LLILZLL;
                        if (i2 != 0) {
                            iMin = Math.min(i2, iMin);
                        }
                        this.LLILZLL = iMin;
                        this.LLILLJJLI = this.LL;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("vsync diff = ");
                        sbLIZ2.append(j2 * 1.0E-6f);
                        sbLIZ2.append(", skipped frame = ");
                        sbLIZ2.append(iRound);
                        sbLIZ2.append(", total = ");
                        sbLIZ2.append(this.LLILLL);
                        sbLIZ2.append(", fps = ");
                        sbLIZ2.append(this.LLILZIL);
                        sbLIZ2.append(", lowest fps = ");
                        sbLIZ2.append(this.LLILZLL);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return true;
                    }
                }
                return true;
            }
            this.LLJI--;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("remove observer cnt = ");
            sbLIZ3.append(this.LLJI);
            C2188811AlT.LIZIZ(sbLIZ3);
            if (this.LLJI == 0 && (choreographer2 = this.LLJ) != null) {
                choreographer2.removeFrameCallback(this);
                this.LL = -9223372036854775807L;
                this.LLILLJJLI = -9223372036854775807L;
                this.LLILLL = 0;
                this.LLILZIL = 0;
                this.LLILZLL = 0;
            }
            return true;
        }
        this.LLJI++;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("add observer cnt = ");
        sbLIZ4.append(this.LLJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        if (this.LLJI == 1 && (choreographer = this.LLJ) != null) {
            choreographer.postFrameCallback(this);
        }
        return true;
    }
}
