package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC903130Zbr {
    public static final EnumC903130Zbr BIG_EMOJI_FAIL;
    public static final EnumC903130Zbr BIG_EMOJI_SUCCESS;
    public static final /* synthetic */ EnumC903130Zbr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC903130Zbr SEARCH_GIF_FAIL;
    public static final EnumC903130Zbr SEARCH_GIF_SUCCESS;
    public static final EnumC903130Zbr SELF_EMOJI_FAIL;
    public static final EnumC903130Zbr SELF_EMOJI_SUCCESS;
    public static final EnumC903130Zbr SEND_FAIL;
    public static final EnumC903130Zbr SEND_SUCCESS;
    public static final EnumC903130Zbr SEND_UNEXPECTED_FAIL;
    public static final EnumC903130Zbr TEXT_FAIL;
    public static final EnumC903130Zbr TEXT_SUCCESS;
    public static final EnumC903130Zbr VIDEO_FAIL;
    public static final EnumC903130Zbr VIDEO_SUCCESS;

    public static InterfaceC2044707zh<EnumC903130Zbr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC903130Zbr enumC903130Zbr = new EnumC903130Zbr("SEND_SUCCESS", 0);
        SEND_SUCCESS = enumC903130Zbr;
        EnumC903130Zbr enumC903130Zbr2 = new EnumC903130Zbr("SEND_FAIL", 1);
        SEND_FAIL = enumC903130Zbr2;
        EnumC903130Zbr enumC903130Zbr3 = new EnumC903130Zbr("SEND_UNEXPECTED_FAIL", 2);
        SEND_UNEXPECTED_FAIL = enumC903130Zbr3;
        EnumC903130Zbr enumC903130Zbr4 = new EnumC903130Zbr("BIG_EMOJI_SUCCESS", 3);
        BIG_EMOJI_SUCCESS = enumC903130Zbr4;
        EnumC903130Zbr enumC903130Zbr5 = new EnumC903130Zbr("BIG_EMOJI_FAIL", 4);
        BIG_EMOJI_FAIL = enumC903130Zbr5;
        EnumC903130Zbr enumC903130Zbr6 = new EnumC903130Zbr("SELF_EMOJI_SUCCESS", 5);
        SELF_EMOJI_SUCCESS = enumC903130Zbr6;
        EnumC903130Zbr enumC903130Zbr7 = new EnumC903130Zbr("SELF_EMOJI_FAIL", 6);
        SELF_EMOJI_FAIL = enumC903130Zbr7;
        EnumC903130Zbr enumC903130Zbr8 = new EnumC903130Zbr("SEARCH_GIF_SUCCESS", 7);
        SEARCH_GIF_SUCCESS = enumC903130Zbr8;
        EnumC903130Zbr enumC903130Zbr9 = new EnumC903130Zbr("SEARCH_GIF_FAIL", 8);
        SEARCH_GIF_FAIL = enumC903130Zbr9;
        EnumC903130Zbr enumC903130Zbr10 = new EnumC903130Zbr("TEXT_SUCCESS", 9);
        TEXT_SUCCESS = enumC903130Zbr10;
        EnumC903130Zbr enumC903130Zbr11 = new EnumC903130Zbr("TEXT_FAIL", 10);
        TEXT_FAIL = enumC903130Zbr11;
        EnumC903130Zbr enumC903130Zbr12 = new EnumC903130Zbr("VIDEO_SUCCESS", 11);
        VIDEO_SUCCESS = enumC903130Zbr12;
        EnumC903130Zbr enumC903130Zbr13 = new EnumC903130Zbr("VIDEO_FAIL", 12);
        VIDEO_FAIL = enumC903130Zbr13;
        EnumC903130Zbr[] enumC903130ZbrArr = {enumC903130Zbr, enumC903130Zbr2, enumC903130Zbr3, enumC903130Zbr4, enumC903130Zbr5, enumC903130Zbr6, enumC903130Zbr7, enumC903130Zbr8, enumC903130Zbr9, enumC903130Zbr10, enumC903130Zbr11, enumC903130Zbr12, enumC903130Zbr13};
        LL = enumC903130ZbrArr;
        LLILLJJLI = new C2254308sP(enumC903130ZbrArr);
    }

    public static EnumC903130Zbr[] values() {
        return (EnumC903130Zbr[]) LL.clone();
    }

    public static EnumC903130Zbr valueOf(String str) {
        return (EnumC903130Zbr) C08FF.LIZ(EnumC903130Zbr.class, str);
    }

    public EnumC903130Zbr(String str, int i) {
    }
}
