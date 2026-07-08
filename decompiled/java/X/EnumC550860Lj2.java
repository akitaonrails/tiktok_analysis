package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC550860Lj2 {
    public static final /* synthetic */ EnumC550860Lj2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC550860Lj2 RECOMMEND;
    public static final EnumC550860Lj2 SEARCH;
    public static final EnumC550860Lj2 UNDEFINED;

    public static InterfaceC2044707zh<EnumC550860Lj2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC550860Lj2 enumC550860Lj2 = new EnumC550860Lj2("RECOMMEND", 0);
        RECOMMEND = enumC550860Lj2;
        EnumC550860Lj2 enumC550860Lj22 = new EnumC550860Lj2("SEARCH", 1);
        SEARCH = enumC550860Lj22;
        EnumC550860Lj2 enumC550860Lj23 = new EnumC550860Lj2("UNDEFINED", 2);
        UNDEFINED = enumC550860Lj23;
        EnumC550860Lj2[] enumC550860Lj2Arr = {enumC550860Lj2, enumC550860Lj22, enumC550860Lj23};
        LL = enumC550860Lj2Arr;
        LLILLJJLI = new C2254308sP(enumC550860Lj2Arr);
    }

    public static EnumC550860Lj2[] values() {
        return (EnumC550860Lj2[]) LL.clone();
    }

    public static EnumC550860Lj2 valueOf(String str) {
        return (EnumC550860Lj2) C08FF.LIZ(EnumC550860Lj2.class, str);
    }

    public EnumC550860Lj2(String str, int i) {
    }
}
