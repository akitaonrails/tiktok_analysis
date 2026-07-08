package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1054550dY5 {
    public static final EnumC1054550dY5 INTERNAL;
    public static final /* synthetic */ EnumC1054550dY5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1054550dY5 PRIVATE;
    public static final EnumC1054550dY5 PROTECTED;
    public static final EnumC1054550dY5 PUBLIC;

    public static InterfaceC2044707zh<EnumC1054550dY5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1054550dY5 enumC1054550dY5 = new EnumC1054550dY5("PUBLIC", 0);
        PUBLIC = enumC1054550dY5;
        EnumC1054550dY5 enumC1054550dY52 = new EnumC1054550dY5("PROTECTED", 1);
        PROTECTED = enumC1054550dY52;
        EnumC1054550dY5 enumC1054550dY53 = new EnumC1054550dY5("INTERNAL", 2);
        INTERNAL = enumC1054550dY53;
        EnumC1054550dY5 enumC1054550dY54 = new EnumC1054550dY5("PRIVATE", 3);
        PRIVATE = enumC1054550dY54;
        EnumC1054550dY5[] enumC1054550dY5Arr = {enumC1054550dY5, enumC1054550dY52, enumC1054550dY53, enumC1054550dY54};
        LL = enumC1054550dY5Arr;
        LLILLJJLI = new C2254308sP(enumC1054550dY5Arr);
    }

    public static EnumC1054550dY5[] values() {
        return (EnumC1054550dY5[]) LL.clone();
    }

    public static EnumC1054550dY5 valueOf(String str) {
        return (EnumC1054550dY5) C08FF.LIZ(EnumC1054550dY5.class, str);
    }

    public EnumC1054550dY5(String str, int i) {
    }
}
