package X;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08w3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2276908w3 implements Callable<Set<Object>> {
    public static final EnumC2276908w3 LL;
    public static final /* synthetic */ EnumC2276908w3[] LLILLJJLI;

    static {
        EnumC2276908w3 enumC2276908w3 = new EnumC2276908w3();
        LL = enumC2276908w3;
        LLILLJJLI = new EnumC2276908w3[]{enumC2276908w3};
    }

    public static EnumC2276908w3[] values() {
        return (EnumC2276908w3[]) LLILLJJLI.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Set<Object> call() {
        return new HashSet();
    }

    public static EnumC2276908w3 valueOf(String str) {
        return (EnumC2276908w3) C08FF.LIZ(EnumC2276908w3.class, str);
    }
}
