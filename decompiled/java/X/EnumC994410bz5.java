package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994410bz5 {
    public static final EnumC994410bz5 HIDE;
    public static final /* synthetic */ EnumC994410bz5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994410bz5 USE;

    public static InterfaceC2044707zh<EnumC994410bz5> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994410bz5 enumC994410bz5 = new EnumC994410bz5("USE", 0);
        USE = enumC994410bz5;
        EnumC994410bz5 enumC994410bz52 = new EnumC994410bz5("HIDE", 1);
        HIDE = enumC994410bz52;
        EnumC994410bz5[] enumC994410bz5Arr = {enumC994410bz5, enumC994410bz52};
        LL = enumC994410bz5Arr;
        LLILLJJLI = new C2254308sP(enumC994410bz5Arr);
    }

    public static EnumC994410bz5[] values() {
        return (EnumC994410bz5[]) LL.clone();
    }

    public static EnumC994410bz5 valueOf(String str) {
        return (EnumC994410bz5) C08FF.LIZ(EnumC994410bz5.class, str);
    }

    public EnumC994410bz5(String str, int i) {
    }
}
