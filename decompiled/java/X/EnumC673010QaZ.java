package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC673010QaZ {
    public static final EnumC673010QaZ BACK;
    public static final /* synthetic */ EnumC673010QaZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC673010QaZ OTHER;
    public static final EnumC673010QaZ START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC673010QaZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC673010QaZ enumC673010QaZ = new EnumC673010QaZ("START", 0, 1);
        START = enumC673010QaZ;
        EnumC673010QaZ enumC673010QaZ2 = new EnumC673010QaZ("BACK", 1, 2);
        BACK = enumC673010QaZ2;
        EnumC673010QaZ enumC673010QaZ3 = new EnumC673010QaZ("OTHER", 2, 9);
        OTHER = enumC673010QaZ3;
        EnumC673010QaZ[] enumC673010QaZArr = {enumC673010QaZ, enumC673010QaZ2, enumC673010QaZ3};
        LLILLJJLI = enumC673010QaZArr;
        LLILLL = new C2254308sP(enumC673010QaZArr);
    }

    public static EnumC673010QaZ[] values() {
        return (EnumC673010QaZ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC673010QaZ valueOf(String str) {
        return (EnumC673010QaZ) C08FF.LIZ(EnumC673010QaZ.class, str);
    }

    public EnumC673010QaZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
