package X;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: X.0824, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0824 {
    public static final Method LIZ;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        LIZ = method;
    }
}
