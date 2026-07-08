package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC688310QzF {
    public static final EnumC688310QzF AVOID_BY_CLIENT_FEATURE;
    public static final EnumC688310QzF AVOID_BY_COMMERCE_INFO;
    public static final EnumC688310QzF CLICK_EXCEEDED;
    public static final /* synthetic */ EnumC688310QzF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC688310QzF SHOW_EXCEEDED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC688310QzF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC688310QzF enumC688310QzF = new EnumC688310QzF("CLICK_EXCEEDED", 0, "200");
        CLICK_EXCEEDED = enumC688310QzF;
        EnumC688310QzF enumC688310QzF2 = new EnumC688310QzF("AVOID_BY_CLIENT_FEATURE", 1, "201");
        AVOID_BY_CLIENT_FEATURE = enumC688310QzF2;
        EnumC688310QzF enumC688310QzF3 = new EnumC688310QzF("AVOID_BY_COMMERCE_INFO", 2, "202");
        AVOID_BY_COMMERCE_INFO = enumC688310QzF3;
        EnumC688310QzF enumC688310QzF4 = new EnumC688310QzF("SHOW_EXCEEDED", 3, "203");
        SHOW_EXCEEDED = enumC688310QzF4;
        EnumC688310QzF[] enumC688310QzFArr = {enumC688310QzF, enumC688310QzF2, enumC688310QzF3, enumC688310QzF4};
        LLILLJJLI = enumC688310QzFArr;
        LLILLL = new C2254308sP(enumC688310QzFArr);
    }

    public static EnumC688310QzF[] values() {
        return (EnumC688310QzF[]) LLILLJJLI.clone();
    }

    public final String getCode() {
        return this.LL;
    }

    public static EnumC688310QzF valueOf(String str) {
        return (EnumC688310QzF) C08FF.LIZ(EnumC688310QzF.class, str);
    }

    public EnumC688310QzF(String str, int i, String str2) {
        this.LL = str2;
    }
}
