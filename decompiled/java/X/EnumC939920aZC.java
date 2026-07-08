package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939920aZC {
    public static final EnumC939920aZC BOTTOM_END;
    public static final EnumC939920aZC BOTTOM_START;
    public static final EnumC939920aZC BOTTOM_START_SECOND;
    public static final EnumC939920aZC FULL_CONTAINER;
    public static final EnumC939920aZC FULL_OVERLAY;
    public static final /* synthetic */ EnumC939920aZC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC939920aZC TOP_END;
    public static final EnumC939920aZC TOP_START;
    public static final EnumC939920aZC TOP_START_SECOND;
    public static final EnumC939920aZC TOP_START_THIRD;
    public static final EnumC939920aZC TOP_UNDER_BANNER;
    public static final EnumC939920aZC TOP_UNDER_BANNER_SECOND;
    public final String LL;

    public static InterfaceC2044707zh<EnumC939920aZC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC939920aZC enumC939920aZC = new EnumC939920aZC("TOP_START", 0, "topStart");
        TOP_START = enumC939920aZC;
        EnumC939920aZC enumC939920aZC2 = new EnumC939920aZC("TOP_START_SECOND", 1, "topStartSecond");
        TOP_START_SECOND = enumC939920aZC2;
        EnumC939920aZC enumC939920aZC3 = new EnumC939920aZC("TOP_START_THIRD", 2, "topStartThird");
        TOP_START_THIRD = enumC939920aZC3;
        EnumC939920aZC enumC939920aZC4 = new EnumC939920aZC("TOP_UNDER_BANNER", 3, "topUnderBanner");
        TOP_UNDER_BANNER = enumC939920aZC4;
        EnumC939920aZC enumC939920aZC5 = new EnumC939920aZC("TOP_UNDER_BANNER_SECOND", 4, "topUnderBannerSecond");
        TOP_UNDER_BANNER_SECOND = enumC939920aZC5;
        EnumC939920aZC enumC939920aZC6 = new EnumC939920aZC("TOP_END", 5, "topEnd");
        TOP_END = enumC939920aZC6;
        EnumC939920aZC enumC939920aZC7 = new EnumC939920aZC("FULL_CONTAINER", 6, "fullContainer");
        FULL_CONTAINER = enumC939920aZC7;
        EnumC939920aZC enumC939920aZC8 = new EnumC939920aZC("FULL_OVERLAY", 7, "fullOverlay");
        FULL_OVERLAY = enumC939920aZC8;
        EnumC939920aZC enumC939920aZC9 = new EnumC939920aZC("BOTTOM_START", 8, "bottomStart");
        BOTTOM_START = enumC939920aZC9;
        EnumC939920aZC enumC939920aZC10 = new EnumC939920aZC("BOTTOM_START_SECOND", 9, "bottomStartSecond");
        BOTTOM_START_SECOND = enumC939920aZC10;
        EnumC939920aZC enumC939920aZC11 = new EnumC939920aZC("BOTTOM_END", 10, "bottomEnd");
        BOTTOM_END = enumC939920aZC11;
        EnumC939920aZC[] enumC939920aZCArr = {enumC939920aZC, enumC939920aZC2, enumC939920aZC3, enumC939920aZC4, enumC939920aZC5, enumC939920aZC6, enumC939920aZC7, enumC939920aZC8, enumC939920aZC9, enumC939920aZC10, enumC939920aZC11};
        LLILLJJLI = enumC939920aZCArr;
        LLILLL = new C2254308sP(enumC939920aZCArr);
    }

    public static EnumC939920aZC[] values() {
        return (EnumC939920aZC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC939920aZC valueOf(String str) {
        return (EnumC939920aZC) C08FF.LIZ(EnumC939920aZC.class, str);
    }

    public EnumC939920aZC(String str, int i, String str2) {
        this.LL = str2;
    }
}
