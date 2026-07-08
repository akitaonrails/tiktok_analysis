package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0FRA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FRA {
    public final C1464240oCs LIZ;
    public HandlerThread LIZIZ;
    public BPEAHandler LIZJ;
    public final Object LIZLLL = new Object();

    public final Handler LIZ() {
        BPEAHandler bPEAHandler;
        synchronized (this.LIZLLL) {
            try {
                bPEAHandler = this.LIZJ;
                if (bPEAHandler == null) {
                    HandlerThread handlerThread = this.LIZIZ;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("nle-ve-async");
                        handlerThread2.start();
                        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread2));
                        this.LIZIZ = handlerThread2;
                    } else {
                        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
                    }
                    bPEAHandler = this.LIZJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return bPEAHandler;
    }

    public final void LIZIZ() {
        synchronized (this.LIZLLL) {
            try {
                this.LIZJ = null;
                try {
                    HandlerThread handlerThread = this.LIZIZ;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    this.LIZIZ = null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    NLELoggerListener logger = NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NLEVEPublic2: asyncHandlerThread quit failed ");
                        sbLIZ.append(e.getMessage());
                        logger.onLog(logLevel, C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0FRA(C1464240oCs c1464240oCs) {
        this.LIZ = c1464240oCs;
    }
}
