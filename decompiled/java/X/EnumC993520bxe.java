package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993520bxe {
    public static final EnumC993520bxe KEYBOARD;
    public static final /* synthetic */ EnumC993520bxe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993520bxe PANEL_AND_LIST;

    public static InterfaceC2044707zh<EnumC993520bxe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993520bxe enumC993520bxe = new EnumC993520bxe("PANEL_AND_LIST", 0);
        PANEL_AND_LIST = enumC993520bxe;
        EnumC993520bxe enumC993520bxe2 = new EnumC993520bxe("KEYBOARD", 1);
        KEYBOARD = enumC993520bxe2;
        EnumC993520bxe[] enumC993520bxeArr = {enumC993520bxe, enumC993520bxe2};
        LL = enumC993520bxeArr;
        LLILLJJLI = new C2254308sP(enumC993520bxeArr);
    }

    public static EnumC993520bxe[] values() {
        return (EnumC993520bxe[]) LL.clone();
    }

    public static EnumC993520bxe valueOf(String str) {
        return (EnumC993520bxe) C08FF.LIZ(EnumC993520bxe.class, str);
    }

    public EnumC993520bxe(String str, int i) {
    }
}
