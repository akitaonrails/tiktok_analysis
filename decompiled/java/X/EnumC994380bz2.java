package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994380bz2 {
    public static final EnumC994380bz2 CLICK;
    public static final /* synthetic */ EnumC994380bz2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994380bz2 SHOW;

    public static InterfaceC2044707zh<EnumC994380bz2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994380bz2 enumC994380bz2 = new EnumC994380bz2("SHOW", 0);
        SHOW = enumC994380bz2;
        EnumC994380bz2 enumC994380bz22 = new EnumC994380bz2("CLICK", 1);
        CLICK = enumC994380bz22;
        EnumC994380bz2[] enumC994380bz2Arr = {enumC994380bz2, enumC994380bz22};
        LL = enumC994380bz2Arr;
        LLILLJJLI = new C2254308sP(enumC994380bz2Arr);
    }

    public static EnumC994380bz2[] values() {
        return (EnumC994380bz2[]) LL.clone();
    }

    public static EnumC994380bz2 valueOf(String str) {
        return (EnumC994380bz2) C08FF.LIZ(EnumC994380bz2.class, str);
    }

    public EnumC994380bz2(String str, int i) {
    }
}
