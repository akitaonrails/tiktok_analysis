package X;

import android.os.Looper;
import android.util.Printer;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0uLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class ChoreographerFrameCallbackC1700340uLg implements Choreographer.FrameCallback {
    public final /* synthetic */ AtomicInteger LL;
    public final /* synthetic */ Choreographer LLILLJJLI;
    public final /* synthetic */ int LLILLL = 1;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int andIncrement = this.LL.getAndIncrement();
        if (andIncrement <= 0) {
            C788320UwA.LIZ = true;
            this.LLILLJJLI.postFrameCallback(this);
        } else {
            if (andIncrement <= this.LLILLL) {
                try {
                    Field declaredField = Looper.class.getDeclaredField("mLogging");
                    declaredField.setAccessible(true);
                    C786410Ut5.LJIIZILJ(Looper.getMainLooper(), new C1700330uLf(this, andIncrement, this, (Printer) declaredField.get(Looper.getMainLooper())));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                this.LLILLJJLI.postFrameCallback(this);
                return;
            }
            C788320UwA.LIZ = false;
        }
    }

    public ChoreographerFrameCallbackC1700340uLg(AtomicInteger atomicInteger, Choreographer choreographer, long j, long j2) {
        this.LL = atomicInteger;
        this.LLILLJJLI = choreographer;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }
}
