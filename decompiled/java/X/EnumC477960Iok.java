package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC477960Iok {
    public static final EnumC477960Iok BOTTOM;
    public static final EnumC477960Iok FULL;
    public static final /* synthetic */ EnumC477960Iok[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC477960Iok TOP;

    public static InterfaceC2044707zh<EnumC477960Iok> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC477960Iok enumC477960Iok = new EnumC477960Iok("TOP", 0);
        TOP = enumC477960Iok;
        EnumC477960Iok enumC477960Iok2 = new EnumC477960Iok("BOTTOM", 1);
        BOTTOM = enumC477960Iok2;
        EnumC477960Iok enumC477960Iok3 = new EnumC477960Iok("FULL", 2);
        FULL = enumC477960Iok3;
        EnumC477960Iok[] enumC477960IokArr = {enumC477960Iok, enumC477960Iok2, enumC477960Iok3};
        LL = enumC477960IokArr;
        LLILLJJLI = new C2254308sP(enumC477960IokArr);
    }

    public static EnumC477960Iok[] values() {
        return (EnumC477960Iok[]) LL.clone();
    }

    public static EnumC477960Iok valueOf(String str) {
        return (EnumC477960Iok) C08FF.LIZ(EnumC477960Iok.class, str);
    }

    public EnumC477960Iok(String str, int i) {
    }
}
