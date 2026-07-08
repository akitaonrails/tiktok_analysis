package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1356100lOS {
    public static final EnumC1356100lOS BOTTOM_BUTTON;
    public static final EnumC1356100lOS CLICK_COMMENT_HEAD;
    public static final EnumC1356100lOS CLICK_COMMENT_NAME;
    public static final EnumC1356100lOS CLICK_HEAD;
    public static final EnumC1356100lOS CLICK_LIKE;
    public static final EnumC1356100lOS CLICK_NAME;
    public static final EnumC1356100lOS COMMENT;
    public static final EnumC1356100lOS COMMENT_BUTTON;
    public static final EnumC1356100lOS COMMENT_REPLY_MODAL;
    public static final EnumC1356100lOS COMMENT_REPLY_SEE_MORE;
    public static final EnumC1356100lOS FAVORITE;
    public static final /* synthetic */ EnumC1356100lOS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1356100lOS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1356100lOS enumC1356100lOS = new EnumC1356100lOS("BOTTOM_BUTTON", 0, "bottom_button");
        BOTTOM_BUTTON = enumC1356100lOS;
        EnumC1356100lOS enumC1356100lOS2 = new EnumC1356100lOS("COMMENT_REPLY_MODAL", 1, "comment_reply_modal");
        COMMENT_REPLY_MODAL = enumC1356100lOS2;
        EnumC1356100lOS enumC1356100lOS3 = new EnumC1356100lOS("COMMENT_REPLY_SEE_MORE", 2, "comment_reply_see_more");
        COMMENT_REPLY_SEE_MORE = enumC1356100lOS3;
        EnumC1356100lOS enumC1356100lOS4 = new EnumC1356100lOS("CLICK_HEAD", 3, "click_head");
        CLICK_HEAD = enumC1356100lOS4;
        EnumC1356100lOS enumC1356100lOS5 = new EnumC1356100lOS("CLICK_NAME", 4, "click_name");
        CLICK_NAME = enumC1356100lOS5;
        EnumC1356100lOS enumC1356100lOS6 = new EnumC1356100lOS("CLICK_COMMENT_HEAD", 5, "click_comment_head");
        CLICK_COMMENT_HEAD = enumC1356100lOS6;
        EnumC1356100lOS enumC1356100lOS7 = new EnumC1356100lOS("CLICK_COMMENT_NAME", 6, "click_comment_name");
        CLICK_COMMENT_NAME = enumC1356100lOS7;
        EnumC1356100lOS enumC1356100lOS8 = new EnumC1356100lOS("COMMENT_BUTTON", 7, "comment_button");
        COMMENT_BUTTON = enumC1356100lOS8;
        EnumC1356100lOS enumC1356100lOS9 = new EnumC1356100lOS("CLICK_LIKE", 8, "click_like");
        CLICK_LIKE = enumC1356100lOS9;
        EnumC1356100lOS enumC1356100lOS10 = new EnumC1356100lOS("FAVORITE", 9, "favorite");
        FAVORITE = enumC1356100lOS10;
        EnumC1356100lOS enumC1356100lOS11 = new EnumC1356100lOS("COMMENT", 10, "comment");
        COMMENT = enumC1356100lOS11;
        EnumC1356100lOS[] enumC1356100lOSArr = {enumC1356100lOS, enumC1356100lOS2, enumC1356100lOS3, enumC1356100lOS4, enumC1356100lOS5, enumC1356100lOS6, enumC1356100lOS7, enumC1356100lOS8, enumC1356100lOS9, enumC1356100lOS10, enumC1356100lOS11};
        LLILLJJLI = enumC1356100lOSArr;
        LLILLL = new C2254308sP(enumC1356100lOSArr);
    }

    public static EnumC1356100lOS[] values() {
        return (EnumC1356100lOS[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1356100lOS valueOf(String str) {
        return (EnumC1356100lOS) C08FF.LIZ(EnumC1356100lOS.class, str);
    }

    public EnumC1356100lOS(String str, int i, String str2) {
        this.LL = str2;
    }
}
