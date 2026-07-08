package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1004003wE {
    public static final EnumC1004003wE FOUR_STAR_RATING;
    public static final /* synthetic */ EnumC1004003wE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1004003wE RESPONDS_WITHIN_24_HOURS;
    public static final EnumC1004003wE SHIPS_WITHIN_2_DAYS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1004003wE> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1004003wE enumC1004003wE = new EnumC1004003wE("FOUR_STAR_RATING", 0, 1);
        FOUR_STAR_RATING = enumC1004003wE;
        EnumC1004003wE enumC1004003wE2 = new EnumC1004003wE("SHIPS_WITHIN_2_DAYS", 1, 2);
        SHIPS_WITHIN_2_DAYS = enumC1004003wE2;
        EnumC1004003wE enumC1004003wE3 = new EnumC1004003wE("RESPONDS_WITHIN_24_HOURS", 2, 3);
        RESPONDS_WITHIN_24_HOURS = enumC1004003wE3;
        EnumC1004003wE[] enumC1004003wEArr = {enumC1004003wE, enumC1004003wE2, enumC1004003wE3};
        LLILLJJLI = enumC1004003wEArr;
        LLILLL = new C2254308sP(enumC1004003wEArr);
    }

    public static EnumC1004003wE[] values() {
        return (EnumC1004003wE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1004003wE valueOf(String str) {
        return (EnumC1004003wE) C08FF.LIZ(EnumC1004003wE.class, str);
    }

    public EnumC1004003wE(String str, int i, int i2) {
        this.LL = i2;
    }
}
