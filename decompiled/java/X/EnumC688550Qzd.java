package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC688550Qzd {
    public static final EnumC688550Qzd AFTER_AWEME_CHECK;
    public static final EnumC688550Qzd AFTER_KEYWORD_CHECK;
    public static final /* synthetic */ EnumC688550Qzd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC688550Qzd SAME_AS_FCP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC688550Qzd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC688550Qzd enumC688550Qzd = new EnumC688550Qzd("SAME_AS_FCP", 0, "same_as_fcp");
        SAME_AS_FCP = enumC688550Qzd;
        EnumC688550Qzd enumC688550Qzd2 = new EnumC688550Qzd("AFTER_AWEME_CHECK", 1, "after_aweme_check");
        AFTER_AWEME_CHECK = enumC688550Qzd2;
        EnumC688550Qzd enumC688550Qzd3 = new EnumC688550Qzd("AFTER_KEYWORD_CHECK", 2, "after_keyword_check");
        AFTER_KEYWORD_CHECK = enumC688550Qzd3;
        EnumC688550Qzd[] enumC688550QzdArr = {enumC688550Qzd, enumC688550Qzd2, enumC688550Qzd3};
        LLILLJJLI = enumC688550QzdArr;
        LLILLL = new C2254308sP(enumC688550QzdArr);
    }

    public static EnumC688550Qzd[] values() {
        return (EnumC688550Qzd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC688550Qzd valueOf(String str) {
        return (EnumC688550Qzd) C08FF.LIZ(EnumC688550Qzd.class, str);
    }

    public EnumC688550Qzd(String str, int i, String str2) {
        this.LL = str2;
    }
}
