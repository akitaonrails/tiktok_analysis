package X;

import Y.ACallableS150S0000000_13;
import Y.ACallableS257S0200000_34;
import com.facebook.FacebookSdk;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: X.1BJG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJG<T> {
    public T LIZ;
    public final CountDownLatch LIZIZ = new CountDownLatch(1);

    public C1BJG(ACallableS150S0000000_13 aCallableS150S0000000_13) {
        FacebookSdk.LJ().execute(new FutureTask(new ACallableS257S0200000_34(this, aCallableS150S0000000_13, 9)));
    }
}
