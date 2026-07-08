package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2177131AIl {
    public static final EnumC2177131AIl AVATAR_NUMBER_TAIL;
    public static final /* synthetic */ EnumC2177131AIl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2177131AIl NO_TAIL;
    public static final EnumC2177131AIl NUMBER_TAIL;
    public static final EnumC2177131AIl NUMBER_TAIL_SEPARATE;

    public static InterfaceC2044707zh<EnumC2177131AIl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2177131AIl enumC2177131AIl = new EnumC2177131AIl("NO_TAIL", 0);
        NO_TAIL = enumC2177131AIl;
        EnumC2177131AIl enumC2177131AIl2 = new EnumC2177131AIl("NUMBER_TAIL", 1);
        NUMBER_TAIL = enumC2177131AIl2;
        EnumC2177131AIl enumC2177131AIl3 = new EnumC2177131AIl("AVATAR_NUMBER_TAIL", 2);
        AVATAR_NUMBER_TAIL = enumC2177131AIl3;
        EnumC2177131AIl enumC2177131AIl4 = new EnumC2177131AIl("NUMBER_TAIL_SEPARATE", 3);
        NUMBER_TAIL_SEPARATE = enumC2177131AIl4;
        EnumC2177131AIl[] enumC2177131AIlArr = {enumC2177131AIl, enumC2177131AIl2, enumC2177131AIl3, enumC2177131AIl4};
        LL = enumC2177131AIlArr;
        LLILLJJLI = new C2254308sP(enumC2177131AIlArr);
    }

    public static EnumC2177131AIl[] values() {
        return (EnumC2177131AIl[]) LL.clone();
    }

    public static EnumC2177131AIl valueOf(String str) {
        return (EnumC2177131AIl) C08FF.LIZ(EnumC2177131AIl.class, str);
    }

    public EnumC2177131AIl(String str, int i) {
    }
}
