package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994450bz9 {
    public static final EnumC994450bz9 HIDE;
    public static final /* synthetic */ EnumC994450bz9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994450bz9 SHOW;

    public static InterfaceC2044707zh<EnumC994450bz9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994450bz9 enumC994450bz9 = new EnumC994450bz9("HIDE", 0);
        HIDE = enumC994450bz9;
        EnumC994450bz9 enumC994450bz92 = new EnumC994450bz9("SHOW", 1);
        SHOW = enumC994450bz92;
        EnumC994450bz9[] enumC994450bz9Arr = {enumC994450bz9, enumC994450bz92};
        LL = enumC994450bz9Arr;
        LLILLJJLI = new C2254308sP(enumC994450bz9Arr);
    }

    public static EnumC994450bz9[] values() {
        return (EnumC994450bz9[]) LL.clone();
    }

    public static EnumC994450bz9 valueOf(String str) {
        return (EnumC994450bz9) C08FF.LIZ(EnumC994450bz9.class, str);
    }

    public EnumC994450bz9(String str, int i) {
    }
}
