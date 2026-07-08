package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1161660gKq {
    public static final EnumC1161660gKq FULL_PRELOAD;
    public static final /* synthetic */ EnumC1161660gKq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1161660gKq NONE;
    public static final EnumC1161660gKq PREDECODE_ONLY;

    public static InterfaceC2044707zh<EnumC1161660gKq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1161660gKq enumC1161660gKq = new EnumC1161660gKq("NONE", 0);
        NONE = enumC1161660gKq;
        EnumC1161660gKq enumC1161660gKq2 = new EnumC1161660gKq("PREDECODE_ONLY", 1);
        PREDECODE_ONLY = enumC1161660gKq2;
        EnumC1161660gKq enumC1161660gKq3 = new EnumC1161660gKq("FULL_PRELOAD", 2);
        FULL_PRELOAD = enumC1161660gKq3;
        EnumC1161660gKq[] enumC1161660gKqArr = {enumC1161660gKq, enumC1161660gKq2, enumC1161660gKq3};
        LL = enumC1161660gKqArr;
        LLILLJJLI = new C2254308sP(enumC1161660gKqArr);
    }

    public static EnumC1161660gKq[] values() {
        return (EnumC1161660gKq[]) LL.clone();
    }

    public static EnumC1161660gKq valueOf(String str) {
        return (EnumC1161660gKq) C08FF.LIZ(EnumC1161660gKq.class, str);
    }

    public EnumC1161660gKq(String str, int i) {
    }
}
