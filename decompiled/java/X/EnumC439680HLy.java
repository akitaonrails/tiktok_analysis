package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439680HLy {
    public static final EnumC439680HLy GO_TO_NOTIFICATION;
    public static final /* synthetic */ EnumC439680HLy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC439680HLy RETURN_TO_CHAT;
    public static final EnumC439680HLy RETURN_TO_POST;
    public static final EnumC439680HLy RETURN_TO_PROFILE_EDIT_PAGE;
    public static final EnumC439680HLy RETURN_TO_PROFILE_PAGE;
    public static final EnumC439680HLy RETURN_TO_STORY;
    public static final EnumC439680HLy RETURN_TO_UNIFIED_INPUT;
    public static final EnumC439680HLy SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC439680HLy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC439680HLy enumC439680HLy = new EnumC439680HLy("SHOW", 0, "show");
        SHOW = enumC439680HLy;
        EnumC439680HLy enumC439680HLy2 = new EnumC439680HLy("RETURN_TO_CHAT", 1, "return_to_chat");
        RETURN_TO_CHAT = enumC439680HLy2;
        EnumC439680HLy enumC439680HLy3 = new EnumC439680HLy("RETURN_TO_STORY", 2, "return_to_story");
        RETURN_TO_STORY = enumC439680HLy3;
        EnumC439680HLy enumC439680HLy4 = new EnumC439680HLy("RETURN_TO_POST", 3, "return_to_post");
        RETURN_TO_POST = enumC439680HLy4;
        EnumC439680HLy enumC439680HLy5 = new EnumC439680HLy("RETURN_TO_PROFILE_PAGE", 4, "return_to_profile_page");
        RETURN_TO_PROFILE_PAGE = enumC439680HLy5;
        EnumC439680HLy enumC439680HLy6 = new EnumC439680HLy("RETURN_TO_PROFILE_EDIT_PAGE", 5, "return_to_edit_profile_page");
        RETURN_TO_PROFILE_EDIT_PAGE = enumC439680HLy6;
        EnumC439680HLy enumC439680HLy7 = new EnumC439680HLy("GO_TO_NOTIFICATION", 6, "go_to_notification");
        GO_TO_NOTIFICATION = enumC439680HLy7;
        EnumC439680HLy enumC439680HLy8 = new EnumC439680HLy("RETURN_TO_UNIFIED_INPUT", 7, "return_to_unified_input");
        RETURN_TO_UNIFIED_INPUT = enumC439680HLy8;
        EnumC439680HLy[] enumC439680HLyArr = {enumC439680HLy, enumC439680HLy2, enumC439680HLy3, enumC439680HLy4, enumC439680HLy5, enumC439680HLy6, enumC439680HLy7, enumC439680HLy8};
        LLILLJJLI = enumC439680HLyArr;
        LLILLL = new C2254308sP(enumC439680HLyArr);
    }

    public static EnumC439680HLy[] values() {
        return (EnumC439680HLy[]) LLILLJJLI.clone();
    }

    public final String getReportValue() {
        return this.LL;
    }

    public static EnumC439680HLy valueOf(String str) {
        return (EnumC439680HLy) C08FF.LIZ(EnumC439680HLy.class, str);
    }

    public EnumC439680HLy(String str, int i, String str2) {
        this.LL = str2;
    }
}
