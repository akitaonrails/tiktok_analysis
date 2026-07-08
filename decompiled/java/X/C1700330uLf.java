package X;

import Y.ARunnableS24S0100100_26;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0uLf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700330uLf implements Printer {
    public boolean LL;
    public boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Choreographer.FrameCallback LLILZ;
    public final /* synthetic */ Printer LLILZIL;
    public final /* synthetic */ ChoreographerFrameCallbackC1700340uLg LLILZLL;

    @Override // android.util.Printer
    public final void println(String str) {
        if (!this.LL) {
            this.LL = true;
            long jNanoTime = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(this.LLILZLL.LLILZ);
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                declaredField.setAccessible(true);
                declaredField.set(this.LLILZLL.LLILLJJLI, Long.valueOf(jNanoTime));
                int i = this.LLILLL;
                ChoreographerFrameCallbackC1700340uLg choreographerFrameCallbackC1700340uLg = this.LLILZLL;
                if (i < choreographerFrameCallbackC1700340uLg.LLILLL) {
                    choreographerFrameCallbackC1700340uLg.LLILLJJLI.postFrameCallback(this.LLILZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C786410Ut5.LJIIZILJ(Looper.getMainLooper(), this.LLILZIL);
            Printer printer = this.LLILZIL;
            if (printer != null) {
                printer.println(str);
            }
            BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            Message messageObtain = Message.obtain(bPEAHandler, new ARunnableS24S0100100_26(this, jNanoTime, 2));
            messageObtain.setAsynchronous(true);
            long j = this.LLILZLL.LLILZIL;
            if (j == 0) {
                C786410Ut5.LJLJJL(bPEAHandler, messageObtain);
                return;
            } else {
                C786410Ut5.LJLJLJ(bPEAHandler, messageObtain, j);
                return;
            }
        }
        if (!this.LLILLJJLI) {
            this.LLILLJJLI = true;
            Printer printer2 = this.LLILZIL;
            if (printer2 != null) {
                printer2.println(str);
            }
        }
    }

    public C1700330uLf(ChoreographerFrameCallbackC1700340uLg choreographerFrameCallbackC1700340uLg, int i, Choreographer.FrameCallback frameCallback, Printer printer) {
        this.LLILZLL = choreographerFrameCallbackC1700340uLg;
        this.LLILLL = i;
        this.LLILZ = frameCallback;
        this.LLILZIL = printer;
    }
}
