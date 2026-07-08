package X;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0RXA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RXA implements Executor {
    public static final C0RXA LL = new C0RXA();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(new C0RXT());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII((Handler) LLILLJJLI.getValue(), runnable);
    }
}
