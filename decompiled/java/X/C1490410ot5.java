package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0ot5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490410ot5 {
    public final Semaphore LIZ;
    public final ExecutorService LIZIZ;

    public C1490410ot5(int i) {
        this.LIZ = new Semaphore(i, true);
        new AtomicInteger(i);
        this.LIZIZ = C786410Ut5.h4();
        new AtomicInteger(0);
        new AtomicBoolean(false);
    }
}
