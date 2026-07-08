package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770450wAl {
    public static final EnumC1770450wAl AUTOSCROLL;
    public static final EnumC1770450wAl BUBBLE_SHOWING;
    public static final EnumC1770450wAl CATEGORY_MEDIUM;
    public static final EnumC1770450wAl DATA_INVALID;
    public static final EnumC1770450wAl DATA_NOT_FOUND;
    public static final EnumC1770450wAl DISABLE_RETRY_REQUEST;
    public static final EnumC1770450wAl EXCEED_MAX_REQUEST_TIMES;
    public static final EnumC1770450wAl HIT_FREQUENCY;
    public static final EnumC1770450wAl INTEREST_WHEN_REQUEST;
    public static final /* synthetic */ EnumC1770450wAl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770450wAl MALL_BUBBLE_SHOWING;
    public static final EnumC1770450wAl PHOTO_SEARCH_BAN;
    public static final EnumC1770450wAl REQUESTING;
    public static final EnumC1770450wAl REQUEST_ERROR;
    public static final EnumC1770450wAl REQUEST_FAIL;
    public static final EnumC1770450wAl RESPONSE_EMPTY;
    public static final EnumC1770450wAl VIDEO_NOT_MATCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1770450wAl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770450wAl enumC1770450wAl = new EnumC1770450wAl("BUBBLE_SHOWING", 0, 2);
        BUBBLE_SHOWING = enumC1770450wAl;
        EnumC1770450wAl enumC1770450wAl2 = new EnumC1770450wAl("CATEGORY_MEDIUM", 1, 3);
        CATEGORY_MEDIUM = enumC1770450wAl2;
        EnumC1770450wAl enumC1770450wAl3 = new EnumC1770450wAl("AUTOSCROLL", 2, 4);
        AUTOSCROLL = enumC1770450wAl3;
        EnumC1770450wAl enumC1770450wAl4 = new EnumC1770450wAl("REQUEST_ERROR", 3, 5);
        REQUEST_ERROR = enumC1770450wAl4;
        EnumC1770450wAl enumC1770450wAl5 = new EnumC1770450wAl("RESPONSE_EMPTY", 4, 6);
        RESPONSE_EMPTY = enumC1770450wAl5;
        EnumC1770450wAl enumC1770450wAl6 = new EnumC1770450wAl("VIDEO_NOT_MATCH", 5, 11);
        VIDEO_NOT_MATCH = enumC1770450wAl6;
        EnumC1770450wAl enumC1770450wAl7 = new EnumC1770450wAl("INTEREST_WHEN_REQUEST", 6, 12);
        INTEREST_WHEN_REQUEST = enumC1770450wAl7;
        EnumC1770450wAl enumC1770450wAl8 = new EnumC1770450wAl("EXCEED_MAX_REQUEST_TIMES", 7, 13);
        EXCEED_MAX_REQUEST_TIMES = enumC1770450wAl8;
        EnumC1770450wAl enumC1770450wAl9 = new EnumC1770450wAl("DISABLE_RETRY_REQUEST", 8, 14);
        DISABLE_RETRY_REQUEST = enumC1770450wAl9;
        EnumC1770450wAl enumC1770450wAl10 = new EnumC1770450wAl("HIT_FREQUENCY", 9, 101);
        HIT_FREQUENCY = enumC1770450wAl10;
        EnumC1770450wAl enumC1770450wAl11 = new EnumC1770450wAl("REQUESTING", 10, 102);
        REQUESTING = enumC1770450wAl11;
        EnumC1770450wAl enumC1770450wAl12 = new EnumC1770450wAl("REQUEST_FAIL", 11, 103);
        REQUEST_FAIL = enumC1770450wAl12;
        EnumC1770450wAl enumC1770450wAl13 = new EnumC1770450wAl("DATA_NOT_FOUND", 12, 104);
        DATA_NOT_FOUND = enumC1770450wAl13;
        EnumC1770450wAl enumC1770450wAl14 = new EnumC1770450wAl("DATA_INVALID", 13, 105);
        DATA_INVALID = enumC1770450wAl14;
        EnumC1770450wAl enumC1770450wAl15 = new EnumC1770450wAl("MALL_BUBBLE_SHOWING", 14, 106);
        MALL_BUBBLE_SHOWING = enumC1770450wAl15;
        EnumC1770450wAl enumC1770450wAl16 = new EnumC1770450wAl("PHOTO_SEARCH_BAN", 15, 107);
        PHOTO_SEARCH_BAN = enumC1770450wAl16;
        EnumC1770450wAl[] enumC1770450wAlArr = {enumC1770450wAl, enumC1770450wAl2, enumC1770450wAl3, enumC1770450wAl4, enumC1770450wAl5, enumC1770450wAl6, enumC1770450wAl7, enumC1770450wAl8, enumC1770450wAl9, enumC1770450wAl10, enumC1770450wAl11, enumC1770450wAl12, enumC1770450wAl13, enumC1770450wAl14, enumC1770450wAl15, enumC1770450wAl16};
        LLILLJJLI = enumC1770450wAlArr;
        LLILLL = new C2254308sP(enumC1770450wAlArr);
    }

    public static EnumC1770450wAl[] values() {
        return (EnumC1770450wAl[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1770450wAl valueOf(String str) {
        return (EnumC1770450wAl) C08FF.LIZ(EnumC1770450wAl.class, str);
    }

    public EnumC1770450wAl(String str, int i, int i2) {
        this.LL = i2;
    }
}
