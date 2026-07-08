package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC847160XLe {
    public static final EnumC847160XLe COLD_BOOT;
    public static final /* synthetic */ EnumC847160XLe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC847160XLe LOGIN;
    public static final EnumC847160XLe LOGOUT;
    public static final EnumC847160XLe SWITCH_ACCOUNT;

    public static InterfaceC2044707zh<EnumC847160XLe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC847160XLe enumC847160XLe = new EnumC847160XLe("COLD_BOOT", 0);
        COLD_BOOT = enumC847160XLe;
        EnumC847160XLe enumC847160XLe2 = new EnumC847160XLe("LOGIN", 1);
        LOGIN = enumC847160XLe2;
        EnumC847160XLe enumC847160XLe3 = new EnumC847160XLe("LOGOUT", 2);
        LOGOUT = enumC847160XLe3;
        EnumC847160XLe enumC847160XLe4 = new EnumC847160XLe("SWITCH_ACCOUNT", 3);
        SWITCH_ACCOUNT = enumC847160XLe4;
        EnumC847160XLe[] enumC847160XLeArr = {enumC847160XLe, enumC847160XLe2, enumC847160XLe3, enumC847160XLe4};
        LL = enumC847160XLeArr;
        LLILLJJLI = new C2254308sP(enumC847160XLeArr);
    }

    public static EnumC847160XLe[] values() {
        return (EnumC847160XLe[]) LL.clone();
    }

    public static EnumC847160XLe valueOf(String str) {
        return (EnumC847160XLe) C08FF.LIZ(EnumC847160XLe.class, str);
    }

    public EnumC847160XLe(String str, int i) {
    }
}
