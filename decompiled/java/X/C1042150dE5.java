package X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dE5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042150dE5 extends AbstractRunnableC1042190dE9 {
    public final CountDownLatch LLILLJJLI = new CountDownLatch(1);

    public final void LIZ() {
        this.LLILLJJLI.countDown();
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        this.LL = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("FetchRuleTask@cc71.run");
        try {
            this.LLILLJJLI.await(30L, TimeUnit.SECONDS);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchRuleTask@cc71.run");
    }
}
