package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1203380hQ8 {
    public static final EnumC1203380hQ8 LARGE;
    public static final /* synthetic */ EnumC1203380hQ8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1203380hQ8 MEDIUM;
    public static final EnumC1203380hQ8 SMALL;

    public static InterfaceC2044707zh<EnumC1203380hQ8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1203380hQ8 enumC1203380hQ8 = new EnumC1203380hQ8("SMALL", 0);
        SMALL = enumC1203380hQ8;
        EnumC1203380hQ8 enumC1203380hQ82 = new EnumC1203380hQ8("MEDIUM", 1);
        MEDIUM = enumC1203380hQ82;
        EnumC1203380hQ8 enumC1203380hQ83 = new EnumC1203380hQ8("LARGE", 2);
        LARGE = enumC1203380hQ83;
        EnumC1203380hQ8[] enumC1203380hQ8Arr = {enumC1203380hQ8, enumC1203380hQ82, enumC1203380hQ83};
        LL = enumC1203380hQ8Arr;
        LLILLJJLI = new C2254308sP(enumC1203380hQ8Arr);
    }

    public static EnumC1203380hQ8[] values() {
        return (EnumC1203380hQ8[]) LL.clone();
    }

    public static EnumC1203380hQ8 valueOf(String str) {
        return (EnumC1203380hQ8) C08FF.LIZ(EnumC1203380hQ8.class, str);
    }

    public EnumC1203380hQ8(String str, int i) {
    }
}
