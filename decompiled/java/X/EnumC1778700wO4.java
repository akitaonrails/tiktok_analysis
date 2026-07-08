package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778700wO4 {
    public static final EnumC1778700wO4 ANY;
    public static final /* synthetic */ EnumC1778700wO4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778700wO4 RECOMMEND;
    public static final EnumC1778700wO4 SEARCH;

    public static InterfaceC2044707zh<EnumC1778700wO4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778700wO4 enumC1778700wO4 = new EnumC1778700wO4("RECOMMEND", 0);
        RECOMMEND = enumC1778700wO4;
        EnumC1778700wO4 enumC1778700wO42 = new EnumC1778700wO4("SEARCH", 1);
        SEARCH = enumC1778700wO42;
        EnumC1778700wO4 enumC1778700wO43 = new EnumC1778700wO4("ANY", 2);
        ANY = enumC1778700wO43;
        EnumC1778700wO4[] enumC1778700wO4Arr = {enumC1778700wO4, enumC1778700wO42, enumC1778700wO43};
        LL = enumC1778700wO4Arr;
        LLILLJJLI = new C2254308sP(enumC1778700wO4Arr);
    }

    public static EnumC1778700wO4[] values() {
        return (EnumC1778700wO4[]) LL.clone();
    }

    public static EnumC1778700wO4 valueOf(String str) {
        return (EnumC1778700wO4) C08FF.LIZ(EnumC1778700wO4.class, str);
    }

    public EnumC1778700wO4(String str, int i) {
    }
}
