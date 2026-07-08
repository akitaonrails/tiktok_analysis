package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Sa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC845403Sa {
    public static final EnumC845403Sa BANK_PROMOTION_HIT;
    public static final EnumC845403Sa BANK_PROMOTION_MISSING;
    public static final EnumC845403Sa CARD_BIN_PROMOTION_HIT;
    public static final EnumC845403Sa CARD_BIN_PROMOTION_MISSING;
    public static final /* synthetic */ EnumC845403Sa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC845403Sa NO_PROMOTION;

    public static InterfaceC2044707zh<EnumC845403Sa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC845403Sa enumC845403Sa = new EnumC845403Sa("NO_PROMOTION", 0);
        NO_PROMOTION = enumC845403Sa;
        EnumC845403Sa enumC845403Sa2 = new EnumC845403Sa("BANK_PROMOTION_HIT", 1);
        BANK_PROMOTION_HIT = enumC845403Sa2;
        EnumC845403Sa enumC845403Sa3 = new EnumC845403Sa("BANK_PROMOTION_MISSING", 2);
        BANK_PROMOTION_MISSING = enumC845403Sa3;
        EnumC845403Sa enumC845403Sa4 = new EnumC845403Sa("CARD_BIN_PROMOTION_HIT", 3);
        CARD_BIN_PROMOTION_HIT = enumC845403Sa4;
        EnumC845403Sa enumC845403Sa5 = new EnumC845403Sa("CARD_BIN_PROMOTION_MISSING", 4);
        CARD_BIN_PROMOTION_MISSING = enumC845403Sa5;
        EnumC845403Sa[] enumC845403SaArr = {enumC845403Sa, enumC845403Sa2, enumC845403Sa3, enumC845403Sa4, enumC845403Sa5};
        LL = enumC845403SaArr;
        LLILLJJLI = new C2254308sP(enumC845403SaArr);
    }

    public static EnumC845403Sa[] values() {
        return (EnumC845403Sa[]) LL.clone();
    }

    public static EnumC845403Sa valueOf(String str) {
        return (EnumC845403Sa) C08FF.LIZ(EnumC845403Sa.class, str);
    }

    public EnumC845403Sa(String str, int i) {
    }
}
