package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2272708vN implements Executor {
    public static final EnumC2272708vN LL;
    public static final /* synthetic */ EnumC2272708vN[] LLILLJJLI;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    static {
        EnumC2272708vN enumC2272708vN = new EnumC2272708vN();
        LL = enumC2272708vN;
        LLILLJJLI = new EnumC2272708vN[]{enumC2272708vN};
    }

    public static EnumC2272708vN[] values() {
        return (EnumC2272708vN[]) LLILLJJLI.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
