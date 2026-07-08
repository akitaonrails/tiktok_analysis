package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC688390QzN {
    public static final EnumC688390QzN ENHANCEMENT;
    public static final /* synthetic */ EnumC688390QzN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC688390QzN NONE;
    public static final EnumC688390QzN POPULAR_WORDS;
    public static final EnumC688390QzN PROMOTION;
    public static final EnumC688390QzN RECOMMEND_REASON;
    public static final EnumC688390QzN TEXT_END_ICON;

    public static InterfaceC2044707zh<EnumC688390QzN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC688390QzN enumC688390QzN = new EnumC688390QzN("NONE", 0);
        NONE = enumC688390QzN;
        EnumC688390QzN enumC688390QzN2 = new EnumC688390QzN("POPULAR_WORDS", 1);
        POPULAR_WORDS = enumC688390QzN2;
        EnumC688390QzN enumC688390QzN3 = new EnumC688390QzN("RECOMMEND_REASON", 2);
        RECOMMEND_REASON = enumC688390QzN3;
        EnumC688390QzN enumC688390QzN4 = new EnumC688390QzN("TEXT_END_ICON", 3);
        TEXT_END_ICON = enumC688390QzN4;
        EnumC688390QzN enumC688390QzN5 = new EnumC688390QzN("PROMOTION", 4);
        PROMOTION = enumC688390QzN5;
        EnumC688390QzN enumC688390QzN6 = new EnumC688390QzN("ENHANCEMENT", 5);
        ENHANCEMENT = enumC688390QzN6;
        EnumC688390QzN[] enumC688390QzNArr = {enumC688390QzN, enumC688390QzN2, enumC688390QzN3, enumC688390QzN4, enumC688390QzN5, enumC688390QzN6};
        LL = enumC688390QzNArr;
        LLILLJJLI = new C2254308sP(enumC688390QzNArr);
    }

    public static EnumC688390QzN[] values() {
        return (EnumC688390QzN[]) LL.clone();
    }

    public static EnumC688390QzN valueOf(String str) {
        return (EnumC688390QzN) C08FF.LIZ(EnumC688390QzN.class, str);
    }

    public EnumC688390QzN(String str, int i) {
    }
}
