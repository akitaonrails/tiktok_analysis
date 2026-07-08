package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1239210iLv {
    public static final C1239240iLy Companion;
    public static final EnumC1239210iLv FACEBOOK;
    public static final EnumC1239210iLv GOOGLE;
    public static final EnumC1239210iLv INSTAGRAM;
    public static final EnumC1239210iLv KAKAOTALK;
    public static final EnumC1239210iLv LINE;
    public static final /* synthetic */ EnumC1239210iLv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1239210iLv TWITTER;
    public static final EnumC1239210iLv VK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1239210iLv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1239210iLv enumC1239210iLv = new EnumC1239210iLv("FACEBOOK", 0, "facebook");
        FACEBOOK = enumC1239210iLv;
        EnumC1239210iLv enumC1239210iLv2 = new EnumC1239210iLv("TWITTER", 1, "twitter");
        TWITTER = enumC1239210iLv2;
        EnumC1239210iLv enumC1239210iLv3 = new EnumC1239210iLv("GOOGLE", 2, "google");
        GOOGLE = enumC1239210iLv3;
        EnumC1239210iLv enumC1239210iLv4 = new EnumC1239210iLv("LINE", 3, "line");
        LINE = enumC1239210iLv4;
        EnumC1239210iLv enumC1239210iLv5 = new EnumC1239210iLv("KAKAOTALK", 4, "kakaotalk");
        KAKAOTALK = enumC1239210iLv5;
        EnumC1239210iLv enumC1239210iLv6 = new EnumC1239210iLv("INSTAGRAM", 5, "instagram");
        INSTAGRAM = enumC1239210iLv6;
        EnumC1239210iLv enumC1239210iLv7 = new EnumC1239210iLv("VK", 6, "vk");
        VK = enumC1239210iLv7;
        EnumC1239210iLv[] enumC1239210iLvArr = {enumC1239210iLv, enumC1239210iLv2, enumC1239210iLv3, enumC1239210iLv4, enumC1239210iLv5, enumC1239210iLv6, enumC1239210iLv7};
        LLILLJJLI = enumC1239210iLvArr;
        LLILLL = new C2254308sP(enumC1239210iLvArr);
        Companion = new C1239240iLy();
    }

    public static EnumC1239210iLv[] values() {
        return (EnumC1239210iLv[]) LLILLJJLI.clone();
    }

    public final String getPassportName() {
        return this.LL;
    }

    public static EnumC1239210iLv valueOf(String str) {
        return (EnumC1239210iLv) C08FF.LIZ(EnumC1239210iLv.class, str);
    }

    public EnumC1239210iLv(String str, int i, String str2) {
        this.LL = str2;
    }
}
