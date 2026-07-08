package X;

import Y.ARunnableS134S0100000_34;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.1BrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217891BrH implements WeakHandler.IHandler {
    public static final C2217891BrH LLJI = new C2217891BrH();
    public static final AtomicLong LLJIJIL = new AtomicLong();
    public long LL;
    public WeakReference<C1336580ksy> LLILZIL;
    public final Object LLILLJJLI = new Object();
    public int LLILLL = 0;
    public int LLILZ = 0;
    public final AtomicLong LLILZLL = new AtomicLong(0);
    public final WeakHandler LLIZ = new WeakHandler(Looper.getMainLooper(), this);
    public final C1519760peQ<InterfaceC2217901BrI> LLIZLLLIL = new C1519760peQ<>();
    public final ARunnableS134S0100000_34 LLJ = new ARunnableS134S0100000_34(this, 51);

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public final void LIZ(C1336580ksy c1336580ksy) {
        boolean z;
        if (c1336580ksy == null) {
            return;
        }
        synchronized (this.LLILLJJLI) {
            try {
                int i = this.LLILLL;
                if (i > this.LLILZ) {
                    z = true;
                } else {
                    z = false;
                }
                this.LLILLL = i + 1;
                this.LLILZIL = new WeakReference<>(c1336580ksy);
                if (!z) {
                    this.LLILZ = this.LLILLL;
                    new C2217881BrG(this, c1336580ksy).start();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
