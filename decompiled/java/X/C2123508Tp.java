package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: X.08Tp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123508Tp {
    public final C0WQX LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final BlockingQueue<Runnable> LIZLLL;
    public final RejectedExecutionHandler LJ;
    public final long LJFF;
    public final ThreadFactory LJI;

    public C2123508Tp(C2123408To c2123408To) {
        this.LIZ = c2123408To.LIZ;
        this.LIZIZ = c2123408To.LIZIZ;
        this.LIZJ = c2123408To.LIZJ;
        this.LIZLLL = c2123408To.LIZLLL;
        this.LJ = c2123408To.LJ;
        this.LJFF = c2123408To.LJFF;
        this.LJI = c2123408To.LJI;
    }

    public static C2123408To LIZ(C0WQX c0wqx) {
        return new C2123408To(c0wqx);
    }
}
