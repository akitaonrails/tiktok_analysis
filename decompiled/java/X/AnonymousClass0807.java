package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0807, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0807 implements Executor {
    public static final AnonymousClass0807 LL;
    public static final /* synthetic */ AnonymousClass0807[] LLILLJJLI;

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }

    static {
        AnonymousClass0807 anonymousClass0807 = new AnonymousClass0807();
        LL = anonymousClass0807;
        LLILLJJLI = new AnonymousClass0807[]{anonymousClass0807};
    }

    public static AnonymousClass0807[] values() {
        return (AnonymousClass0807[]) LLILLJJLI.clone();
    }

    public static AnonymousClass0807 valueOf(String str) {
        return (AnonymousClass0807) C08FF.LIZ(AnonymousClass0807.class, str);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
