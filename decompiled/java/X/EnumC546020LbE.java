package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC546020LbE {
    public static final EnumC546020LbE FAILED;
    public static final /* synthetic */ EnumC546020LbE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC546020LbE MISSING;
    public static final EnumC546020LbE PROCESSING;
    public static final EnumC546020LbE READY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC546020LbE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC546020LbE enumC546020LbE = new EnumC546020LbE("READY", 0, "ready");
        READY = enumC546020LbE;
        EnumC546020LbE enumC546020LbE2 = new EnumC546020LbE("FAILED", 1, "failed");
        FAILED = enumC546020LbE2;
        EnumC546020LbE enumC546020LbE3 = new EnumC546020LbE("PROCESSING", 2, "processing");
        PROCESSING = enumC546020LbE3;
        EnumC546020LbE enumC546020LbE4 = new EnumC546020LbE("MISSING", 3, "missing");
        MISSING = enumC546020LbE4;
        EnumC546020LbE[] enumC546020LbEArr = {enumC546020LbE, enumC546020LbE2, enumC546020LbE3, enumC546020LbE4};
        LLILLJJLI = enumC546020LbEArr;
        LLILLL = new C2254308sP(enumC546020LbEArr);
    }

    public static EnumC546020LbE[] values() {
        return (EnumC546020LbE[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC546020LbE valueOf(String str) {
        return (EnumC546020LbE) C08FF.LIZ(EnumC546020LbE.class, str);
    }

    public EnumC546020LbE(String str, int i, String str2) {
        this.LL = str2;
    }
}
