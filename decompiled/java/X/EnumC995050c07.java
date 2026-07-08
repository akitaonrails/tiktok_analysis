package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c07, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995050c07 {
    public static final /* synthetic */ EnumC995050c07[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995050c07 RED;
    public static final EnumC995050c07 WHITE;

    public static InterfaceC2044707zh<EnumC995050c07> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995050c07 enumC995050c07 = new EnumC995050c07("RED", 0);
        RED = enumC995050c07;
        EnumC995050c07 enumC995050c072 = new EnumC995050c07("WHITE", 1);
        WHITE = enumC995050c072;
        EnumC995050c07[] enumC995050c07Arr = {enumC995050c07, enumC995050c072};
        LL = enumC995050c07Arr;
        LLILLJJLI = new C2254308sP(enumC995050c07Arr);
    }

    public static EnumC995050c07[] values() {
        return (EnumC995050c07[]) LL.clone();
    }

    public static EnumC995050c07 valueOf(String str) {
        return (EnumC995050c07) C08FF.LIZ(EnumC995050c07.class, str);
    }

    public EnumC995050c07(String str, int i) {
    }
}
