package X;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WPN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPN extends C09AY implements Function0<ThreadPoolExecutor> {
    public C0WPN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        C822650WOx c822650WOx = new C822650WOx(0, Math.max(Runtime.getRuntime().availableProcessors() - 1, 1), 10L, TimeUnit.SECONDS, new SynchronousQueue());
        c822650WOx.allowCoreThreadTimeOut(true);
        return c822650WOx;
    }
}
