package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0som, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641500som {
    public static final EnumC1641500som AVAILABLE;
    public static final EnumC1641500som FAKE;
    public static final /* synthetic */ EnumC1641500som[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641500som NOT_AVAILABLE;
    public static final EnumC1641500som UNKNOWN;

    public static InterfaceC2044707zh<EnumC1641500som> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641500som enumC1641500som = new EnumC1641500som("UNKNOWN", 0);
        UNKNOWN = enumC1641500som;
        EnumC1641500som enumC1641500som2 = new EnumC1641500som("AVAILABLE", 1);
        AVAILABLE = enumC1641500som2;
        EnumC1641500som enumC1641500som3 = new EnumC1641500som("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = enumC1641500som3;
        EnumC1641500som enumC1641500som4 = new EnumC1641500som("FAKE", 3);
        FAKE = enumC1641500som4;
        EnumC1641500som[] enumC1641500somArr = {enumC1641500som, enumC1641500som2, enumC1641500som3, enumC1641500som4};
        LL = enumC1641500somArr;
        LLILLJJLI = new C2254308sP(enumC1641500somArr);
    }

    public static EnumC1641500som[] values() {
        return (EnumC1641500som[]) LL.clone();
    }

    public static EnumC1641500som valueOf(String str) {
        return (EnumC1641500som) C08FF.LIZ(EnumC1641500som.class, str);
    }

    public EnumC1641500som(String str, int i) {
    }
}
