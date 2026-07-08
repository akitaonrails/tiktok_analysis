package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k23, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1303770k23 {
    public static final EnumC1303770k23 HOME_TAB;
    public static final /* synthetic */ EnumC1303770k23[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1303770k23 SHOP_TAB;

    public static InterfaceC2044707zh<EnumC1303770k23> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1303770k23 enumC1303770k23 = new EnumC1303770k23("SHOP_TAB", 0);
        SHOP_TAB = enumC1303770k23;
        EnumC1303770k23 enumC1303770k232 = new EnumC1303770k23("HOME_TAB", 1);
        HOME_TAB = enumC1303770k232;
        EnumC1303770k23[] enumC1303770k23Arr = {enumC1303770k23, enumC1303770k232};
        LL = enumC1303770k23Arr;
        LLILLJJLI = new C2254308sP(enumC1303770k23Arr);
    }

    public static EnumC1303770k23[] values() {
        return (EnumC1303770k23[]) LL.clone();
    }

    public static EnumC1303770k23 valueOf(String str) {
        return (EnumC1303770k23) C08FF.LIZ(EnumC1303770k23.class, str);
    }

    public EnumC1303770k23(String str, int i) {
    }
}
