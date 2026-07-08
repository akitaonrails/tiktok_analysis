package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC902550Zav {
    public static final /* synthetic */ EnumC902550Zav[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC902550Zav ORIGINAL;
    public static final EnumC902550Zav REFACTOR;

    public static InterfaceC2044707zh<EnumC902550Zav> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC902550Zav enumC902550Zav = new EnumC902550Zav("ORIGINAL", 0);
        ORIGINAL = enumC902550Zav;
        EnumC902550Zav enumC902550Zav2 = new EnumC902550Zav("REFACTOR", 1);
        REFACTOR = enumC902550Zav2;
        EnumC902550Zav[] enumC902550ZavArr = {enumC902550Zav, enumC902550Zav2};
        LL = enumC902550ZavArr;
        LLILLJJLI = new C2254308sP(enumC902550ZavArr);
    }

    public static EnumC902550Zav[] values() {
        return (EnumC902550Zav[]) LL.clone();
    }

    public static EnumC902550Zav valueOf(String str) {
        return (EnumC902550Zav) C08FF.LIZ(EnumC902550Zav.class, str);
    }

    public EnumC902550Zav(String str, int i) {
    }
}
