package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0z8B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1884170z8B {
    public static final EnumC1884170z8B AWAEME_LIST_IS_NOT_COMPLETED;
    public static final EnumC1884170z8B FAILED_TO_FIND_NEXT_PAGE;
    public static final EnumC1884170z8B FAILED_TO_OPEN_DETAIL;
    public static final /* synthetic */ EnumC1884170z8B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1884170z8B LOAD_MORE_FAIL;
    public static final EnumC1884170z8B REQUEST_FAIL;
    public static final EnumC1884170z8B VIDEO_PLAY_INCORRECT;
    public static final EnumC1884170z8B WH_AWEME_NOT_FOUND;
    public static final EnumC1884170z8B WH_FEED_NOT_MATCH;
    public static final EnumC1884170z8B WH_REQUEST_FAIL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1884170z8B> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1884170z8B enumC1884170z8B = new EnumC1884170z8B("REQUEST_FAIL", 0, 1);
        REQUEST_FAIL = enumC1884170z8B;
        EnumC1884170z8B enumC1884170z8B2 = new EnumC1884170z8B("LOAD_MORE_FAIL", 1, 2);
        LOAD_MORE_FAIL = enumC1884170z8B2;
        EnumC1884170z8B enumC1884170z8B3 = new EnumC1884170z8B("VIDEO_PLAY_INCORRECT", 2, 3);
        VIDEO_PLAY_INCORRECT = enumC1884170z8B3;
        EnumC1884170z8B enumC1884170z8B4 = new EnumC1884170z8B("FAILED_TO_FIND_NEXT_PAGE", 3, 4);
        FAILED_TO_FIND_NEXT_PAGE = enumC1884170z8B4;
        EnumC1884170z8B enumC1884170z8B5 = new EnumC1884170z8B("FAILED_TO_OPEN_DETAIL", 4, 5);
        FAILED_TO_OPEN_DETAIL = enumC1884170z8B5;
        EnumC1884170z8B enumC1884170z8B6 = new EnumC1884170z8B("AWAEME_LIST_IS_NOT_COMPLETED", 5, 6);
        AWAEME_LIST_IS_NOT_COMPLETED = enumC1884170z8B6;
        EnumC1884170z8B enumC1884170z8B7 = new EnumC1884170z8B("WH_REQUEST_FAIL", 6, 101);
        WH_REQUEST_FAIL = enumC1884170z8B7;
        EnumC1884170z8B enumC1884170z8B8 = new EnumC1884170z8B("WH_FEED_NOT_MATCH", 7, 102);
        WH_FEED_NOT_MATCH = enumC1884170z8B8;
        EnumC1884170z8B enumC1884170z8B9 = new EnumC1884170z8B("WH_AWEME_NOT_FOUND", 8, 103);
        WH_AWEME_NOT_FOUND = enumC1884170z8B9;
        EnumC1884170z8B[] enumC1884170z8BArr = {enumC1884170z8B, enumC1884170z8B2, enumC1884170z8B3, enumC1884170z8B4, enumC1884170z8B5, enumC1884170z8B6, enumC1884170z8B7, enumC1884170z8B8, enumC1884170z8B9};
        LLILLJJLI = enumC1884170z8BArr;
        LLILLL = new C2254308sP(enumC1884170z8BArr);
    }

    public static EnumC1884170z8B[] values() {
        return (EnumC1884170z8B[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1884170z8B valueOf(String str) {
        return (EnumC1884170z8B) C08FF.LIZ(EnumC1884170z8B.class, str);
    }

    public EnumC1884170z8B(String str, int i, int i2) {
        this.LL = i2;
    }
}
