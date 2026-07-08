package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC559630LxB {
    public static final EnumC559630LxB CANCELED;
    public static final EnumC559630LxB COMPLETED;
    public static final EnumC559630LxB CREATED;
    public static final EnumC559630LxB FAILED;
    public static final /* synthetic */ EnumC559630LxB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC559630LxB PARTIAL;
    public static final EnumC559630LxB PROCESSING;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC559630LxB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC559630LxB enumC559630LxB = new EnumC559630LxB("CREATED", 0, 0);
        CREATED = enumC559630LxB;
        EnumC559630LxB enumC559630LxB2 = new EnumC559630LxB("PROCESSING", 1, 1);
        PROCESSING = enumC559630LxB2;
        EnumC559630LxB enumC559630LxB3 = new EnumC559630LxB("COMPLETED", 2, 2);
        COMPLETED = enumC559630LxB3;
        EnumC559630LxB enumC559630LxB4 = new EnumC559630LxB("FAILED", 3, 3);
        FAILED = enumC559630LxB4;
        EnumC559630LxB enumC559630LxB5 = new EnumC559630LxB("CANCELED", 4, 4);
        CANCELED = enumC559630LxB5;
        EnumC559630LxB enumC559630LxB6 = new EnumC559630LxB("PARTIAL", 5, 5);
        PARTIAL = enumC559630LxB6;
        EnumC559630LxB[] enumC559630LxBArr = {enumC559630LxB, enumC559630LxB2, enumC559630LxB3, enumC559630LxB4, enumC559630LxB5, enumC559630LxB6};
        LLILLJJLI = enumC559630LxBArr;
        LLILLL = new C2254308sP(enumC559630LxBArr);
    }

    public static EnumC559630LxB[] values() {
        return (EnumC559630LxB[]) LLILLJJLI.clone();
    }

    public final Integer getType() {
        return this.LL;
    }

    public static EnumC559630LxB valueOf(String str) {
        return (EnumC559630LxB) C08FF.LIZ(EnumC559630LxB.class, str);
    }

    public EnumC559630LxB(String str, int i, Integer num) {
        this.LL = num;
    }
}
