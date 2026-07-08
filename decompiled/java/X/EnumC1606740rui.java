package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1606740rui {
    public static final EnumC1606740rui CREATE_ICON;
    public static final /* synthetic */ EnumC1606740rui[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1606740rui NONE;
    public static final EnumC1606740rui SUB_ICON;

    public static InterfaceC2044707zh<EnumC1606740rui> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1606740rui enumC1606740rui = new EnumC1606740rui("CREATE_ICON", 0);
        CREATE_ICON = enumC1606740rui;
        EnumC1606740rui enumC1606740rui2 = new EnumC1606740rui("SUB_ICON", 1);
        SUB_ICON = enumC1606740rui2;
        EnumC1606740rui enumC1606740rui3 = new EnumC1606740rui("NONE", 2);
        NONE = enumC1606740rui3;
        EnumC1606740rui[] enumC1606740ruiArr = {enumC1606740rui, enumC1606740rui2, enumC1606740rui3};
        LL = enumC1606740ruiArr;
        LLILLJJLI = new C2254308sP(enumC1606740ruiArr);
    }

    public static EnumC1606740rui[] values() {
        return (EnumC1606740rui[]) LL.clone();
    }

    public static EnumC1606740rui valueOf(String str) {
        return (EnumC1606740rui) C08FF.LIZ(EnumC1606740rui.class, str);
    }

    public EnumC1606740rui(String str, int i) {
    }
}
