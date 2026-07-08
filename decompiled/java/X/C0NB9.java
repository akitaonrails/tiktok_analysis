package X;

import Y.ARunnableS109S0100000_9;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS158S1100000_9;

/* JADX INFO: renamed from: X.0NB9, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NB9 {
    public static final AtomicLong LIZ = new AtomicLong(0);
    public static final ConcurrentHashMap<Long, Function0<Unit>> LIZIZ = new ConcurrentHashMap<>();
    public static final ScheduledExecutorService LIZJ = C823050WQl.LJ();
    public static final ExecutorService LIZLLL = C823050WQl.LIZIZ();

    public static final void LIZ(C0NBA c0nba, String str) {
        LIZLLL.execute(new ARunnableS109S0100000_9(new AwS158S1100000_9(c0nba, str, 19), 114));
    }
}
