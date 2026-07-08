package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: X.08To, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123408To {
    public final C0WQX LIZ;
    public String LIZIZ;
    public int LIZJ = 1;
    public BlockingQueue<Runnable> LIZLLL = new LinkedBlockingQueue();
    public final RejectedExecutionHandler LJ = new ThreadPoolExecutor.AbortPolicy();
    public long LJFF = -1;
    public ThreadFactory LJI;

    public final C2123508Tp LIZ() {
        return new C2123508Tp(this);
    }

    public C2123408To(C0WQX c0wqx) {
        this.LIZ = c0wqx;
    }
}
