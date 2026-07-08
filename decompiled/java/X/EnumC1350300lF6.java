package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1350300lF6 {
    public static final EnumC1350300lF6 HIDE_END;
    public static final EnumC1350300lF6 HIDE_START;
    public static final /* synthetic */ EnumC1350300lF6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1350300lF6 SHOW_END;
    public static final EnumC1350300lF6 SHOW_START;

    public static InterfaceC2044707zh<EnumC1350300lF6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1350300lF6 enumC1350300lF6 = new EnumC1350300lF6("SHOW_START", 0);
        SHOW_START = enumC1350300lF6;
        EnumC1350300lF6 enumC1350300lF62 = new EnumC1350300lF6("SHOW_END", 1);
        SHOW_END = enumC1350300lF62;
        EnumC1350300lF6 enumC1350300lF63 = new EnumC1350300lF6("HIDE_START", 2);
        HIDE_START = enumC1350300lF63;
        EnumC1350300lF6 enumC1350300lF64 = new EnumC1350300lF6("HIDE_END", 3);
        HIDE_END = enumC1350300lF64;
        EnumC1350300lF6[] enumC1350300lF6Arr = {enumC1350300lF6, enumC1350300lF62, enumC1350300lF63, enumC1350300lF64};
        LL = enumC1350300lF6Arr;
        LLILLJJLI = new C2254308sP(enumC1350300lF6Arr);
    }

    public static EnumC1350300lF6[] values() {
        return (EnumC1350300lF6[]) LL.clone();
    }

    public static EnumC1350300lF6 valueOf(String str) {
        return (EnumC1350300lF6) C08FF.LIZ(EnumC1350300lF6.class, str);
    }

    public EnumC1350300lF6(String str, int i) {
    }
}
