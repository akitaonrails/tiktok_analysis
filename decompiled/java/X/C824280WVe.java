package X;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824280WVe extends C09AY implements Function0<ThreadPoolExecutor> {
    public C824280WVe() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        C1520380pfQ.LIZ.getClass();
        return new C822650WOx(C1520380pfQ.LJIIL, C1520380pfQ.LJIILIIL, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
