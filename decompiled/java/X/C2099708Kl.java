package X;

import com.ss.android.ugc.bytex.pthread.base.convergence.monitor.IThreadStartMonitor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.08Kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2099708Kl implements IThreadStartMonitor {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static int LIZIZ = 1;

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.monitor.IThreadStartMonitor
    public final void onNewThreadCountMonitor() {
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.convergence.monitor.IThreadStartMonitor
    public final void onNewThreadMonitor(long j, String str) {
        str.length();
    }
}
