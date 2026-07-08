package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0ScQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ExecutorC725120ScQ implements Executor {
    public final C01GW LL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(4));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 3));

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C786410Ut5.LJJZZIII((Handler) this.LLILLJJLI.getValue(), runnable);
    }
}
