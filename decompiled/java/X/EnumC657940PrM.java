package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657940PrM {
    public static final EnumC657940PrM GENERAL_SEARCH_STORE_CARD;
    public static final EnumC657940PrM LIVE_AGGREGATED_CARD;
    public static final EnumC657940PrM LIVE_CHILD_CARD;
    public static final /* synthetic */ EnumC657940PrM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC657940PrM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC657940PrM enumC657940PrM = new EnumC657940PrM("LIVE_CHILD_CARD", 0);
        LIVE_CHILD_CARD = enumC657940PrM;
        EnumC657940PrM enumC657940PrM2 = new EnumC657940PrM("LIVE_AGGREGATED_CARD", 1);
        LIVE_AGGREGATED_CARD = enumC657940PrM2;
        EnumC657940PrM enumC657940PrM3 = new EnumC657940PrM("GENERAL_SEARCH_STORE_CARD", 2);
        GENERAL_SEARCH_STORE_CARD = enumC657940PrM3;
        EnumC657940PrM[] enumC657940PrMArr = {enumC657940PrM, enumC657940PrM2, enumC657940PrM3};
        LL = enumC657940PrMArr;
        LLILLJJLI = new C2254308sP(enumC657940PrMArr);
    }

    public static EnumC657940PrM[] values() {
        return (EnumC657940PrM[]) LL.clone();
    }

    public static EnumC657940PrM valueOf(String str) {
        return (EnumC657940PrM) C08FF.LIZ(EnumC657940PrM.class, str);
    }

    public EnumC657940PrM(String str, int i) {
    }
}
