package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC545980LbA {
    public static final EnumC545980LbA CANCELED;
    public static final EnumC545980LbA COMPLETED;
    public static final EnumC545980LbA CREATED;
    public static final EnumC545980LbA FAILED;
    public static final /* synthetic */ EnumC545980LbA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC545980LbA PARTIAL;
    public static final EnumC545980LbA PROCESSING;

    public static InterfaceC2044707zh<EnumC545980LbA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC545980LbA enumC545980LbA = new EnumC545980LbA("CREATED", 0);
        CREATED = enumC545980LbA;
        EnumC545980LbA enumC545980LbA2 = new EnumC545980LbA("PROCESSING", 1);
        PROCESSING = enumC545980LbA2;
        EnumC545980LbA enumC545980LbA3 = new EnumC545980LbA("COMPLETED", 2);
        COMPLETED = enumC545980LbA3;
        EnumC545980LbA enumC545980LbA4 = new EnumC545980LbA("FAILED", 3);
        FAILED = enumC545980LbA4;
        EnumC545980LbA enumC545980LbA5 = new EnumC545980LbA("CANCELED", 4);
        CANCELED = enumC545980LbA5;
        EnumC545980LbA enumC545980LbA6 = new EnumC545980LbA("PARTIAL", 5);
        PARTIAL = enumC545980LbA6;
        EnumC545980LbA[] enumC545980LbAArr = {enumC545980LbA, enumC545980LbA2, enumC545980LbA3, enumC545980LbA4, enumC545980LbA5, enumC545980LbA6};
        LL = enumC545980LbAArr;
        LLILLJJLI = new C2254308sP(enumC545980LbAArr);
    }

    public static EnumC545980LbA[] values() {
        return (EnumC545980LbA[]) LL.clone();
    }

    public static EnumC545980LbA valueOf(String str) {
        return (EnumC545980LbA) C08FF.LIZ(EnumC545980LbA.class, str);
    }

    public EnumC545980LbA(String str, int i) {
    }
}
