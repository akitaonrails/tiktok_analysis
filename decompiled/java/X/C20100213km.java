package X;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.13km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20100213km {
    public static C822650WOx LIZ;
    public static C822650WOx LIZIZ;
    public static ScheduledExecutorService LIZJ;

    public static synchronized Executor LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C822650WOx(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20100313kn("MemRelief_Callback"));
        }
        return LIZIZ;
    }
}
