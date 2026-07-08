package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900680ZVa {
    public static final /* synthetic */ EnumC900680ZVa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC900680ZVa LOADING;
    public static final EnumC900680ZVa MODERATION;
    public static final EnumC900680ZVa NONE;

    public static InterfaceC2044707zh<EnumC900680ZVa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC900680ZVa enumC900680ZVa = new EnumC900680ZVa("LOADING", 0);
        LOADING = enumC900680ZVa;
        EnumC900680ZVa enumC900680ZVa2 = new EnumC900680ZVa("MODERATION", 1);
        MODERATION = enumC900680ZVa2;
        EnumC900680ZVa enumC900680ZVa3 = new EnumC900680ZVa("NONE", 2);
        NONE = enumC900680ZVa3;
        EnumC900680ZVa[] enumC900680ZVaArr = {enumC900680ZVa, enumC900680ZVa2, enumC900680ZVa3};
        LL = enumC900680ZVaArr;
        LLILLJJLI = new C2254308sP(enumC900680ZVaArr);
    }

    public static EnumC900680ZVa[] values() {
        return (EnumC900680ZVa[]) LL.clone();
    }

    public static EnumC900680ZVa valueOf(String str) {
        return (EnumC900680ZVa) C08FF.LIZ(EnumC900680ZVa.class, str);
    }

    public EnumC900680ZVa(String str, int i) {
    }
}
