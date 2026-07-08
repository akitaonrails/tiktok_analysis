package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1574, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1574 implements Executor {
    public static final AnonymousClass1574 LL = new AnonymousClass1574();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
