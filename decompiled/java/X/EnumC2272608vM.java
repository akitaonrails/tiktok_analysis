package X;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08vM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2272608vM implements Executor {
    public static final EnumC2272608vM LL;
    public static final /* synthetic */ EnumC2272608vM[] LLILLJJLI;

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }

    static {
        EnumC2272608vM enumC2272608vM = new EnumC2272608vM();
        LL = enumC2272608vM;
        LLILLJJLI = new EnumC2272608vM[]{enumC2272608vM};
    }

    public static EnumC2272608vM[] values() {
        return (EnumC2272608vM[]) LLILLJJLI.clone();
    }

    public static EnumC2272608vM valueOf(String str) {
        return (EnumC2272608vM) C08FF.LIZ(EnumC2272608vM.class, str);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
