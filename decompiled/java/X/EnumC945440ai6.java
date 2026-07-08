package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ai6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC945440ai6 {
    public static final EnumC945440ai6 BOTTOM_BUTTON;
    public static final /* synthetic */ EnumC945440ai6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC945440ai6 NORMAL;

    public static InterfaceC2044707zh<EnumC945440ai6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC945440ai6 enumC945440ai6 = new EnumC945440ai6("NORMAL", 0);
        NORMAL = enumC945440ai6;
        EnumC945440ai6 enumC945440ai62 = new EnumC945440ai6("BOTTOM_BUTTON", 1);
        BOTTOM_BUTTON = enumC945440ai62;
        EnumC945440ai6[] enumC945440ai6Arr = {enumC945440ai6, enumC945440ai62};
        LL = enumC945440ai6Arr;
        LLILLJJLI = new C2254308sP(enumC945440ai6Arr);
    }

    public static EnumC945440ai6[] values() {
        return (EnumC945440ai6[]) LL.clone();
    }

    public static EnumC945440ai6 valueOf(String str) {
        return (EnumC945440ai6) C08FF.LIZ(EnumC945440ai6.class, str);
    }

    public EnumC945440ai6(String str, int i) {
    }
}
