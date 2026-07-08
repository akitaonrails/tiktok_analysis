package X;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0Wpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835350Wpp {
    public static final long LIZ = TimeUnit.MINUTES.toMillis(10);
    public static final long LIZIZ = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int LIZJ = 0;

    public static void LIZ(Activity activity, AbstractC835450Wpz abstractC835450Wpz) {
        RunnableC835360Wpq runnableC835360Wpq = new RunnableC835360Wpq();
        int iIncrementAndGet = RunnableC835360Wpq.LLILZLL.incrementAndGet();
        runnableC835360Wpq.LL = iIncrementAndGet;
        RunnableC835360Wpq.LLILZIL.put(iIncrementAndGet, runnableC835360Wpq);
        C786410Ut5.LJLIIL(LIZ, RunnableC835360Wpq.LLILZ, runnableC835360Wpq);
        abstractC835450Wpz.LIZIZ(runnableC835360Wpq);
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        int i = runnableC835360Wpq.LL;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 1001);
        bundle.putLong("initializationElapsedRealtime", LIZIZ);
        FragmentC835340Wpo fragmentC835340Wpo = new FragmentC835340Wpo();
        fragmentC835340Wpo.setArguments(bundle);
        int i2 = runnableC835360Wpq.LL;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i2);
        fragmentTransactionBeginTransaction.add(fragmentC835340Wpo, sb.toString()).commit();
    }
}
