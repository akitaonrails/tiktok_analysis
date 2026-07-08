package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0300008k {
    public static final EnumC0300008k BATTLE_INFO_RESPONSE;
    public static final EnumC0300008k BATTLE_ITEM_CARD_MESSAGE;
    public static final /* synthetic */ EnumC0300008k[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0300008k> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0300008k enumC0300008k = new EnumC0300008k("BATTLE_INFO_RESPONSE", 0);
        BATTLE_INFO_RESPONSE = enumC0300008k;
        EnumC0300008k enumC0300008k2 = new EnumC0300008k("BATTLE_ITEM_CARD_MESSAGE", 1);
        BATTLE_ITEM_CARD_MESSAGE = enumC0300008k2;
        EnumC0300008k[] enumC0300008kArr = {enumC0300008k, enumC0300008k2};
        LL = enumC0300008kArr;
        LLILLJJLI = new C2254308sP(enumC0300008kArr);
    }

    public static EnumC0300008k[] values() {
        return (EnumC0300008k[]) LL.clone();
    }

    public static EnumC0300008k valueOf(String str) {
        return (EnumC0300008k) C08FF.LIZ(EnumC0300008k.class, str);
    }

    public EnumC0300008k(String str, int i) {
    }
}
