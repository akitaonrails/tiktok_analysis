package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1412010mqd {
    public static final EnumC1412010mqd CLICK_NEXT;
    public static final /* synthetic */ EnumC1412010mqd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1412010mqd NORMAL_POST;
    public static final EnumC1412010mqd NO_OPERATION;
    public static final EnumC1412010mqd STORY_POST;
    public static final EnumC1412010mqd TAB_CLOSE_BUTTON;
    public static final EnumC1412010mqd TAP_SCREEN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1412010mqd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1412010mqd enumC1412010mqd = new EnumC1412010mqd("TAP_SCREEN", 0, "tap_screen");
        TAP_SCREEN = enumC1412010mqd;
        EnumC1412010mqd enumC1412010mqd2 = new EnumC1412010mqd("NO_OPERATION", 1, "no_operation");
        NO_OPERATION = enumC1412010mqd2;
        EnumC1412010mqd enumC1412010mqd3 = new EnumC1412010mqd("CLICK_NEXT", 2, "click_next");
        CLICK_NEXT = enumC1412010mqd3;
        EnumC1412010mqd enumC1412010mqd4 = new EnumC1412010mqd("STORY_POST", 3, "story_post");
        STORY_POST = enumC1412010mqd4;
        EnumC1412010mqd enumC1412010mqd5 = new EnumC1412010mqd("NORMAL_POST", 4, "normal_post");
        NORMAL_POST = enumC1412010mqd5;
        EnumC1412010mqd enumC1412010mqd6 = new EnumC1412010mqd("TAB_CLOSE_BUTTON", 5, "tab_close_button");
        TAB_CLOSE_BUTTON = enumC1412010mqd6;
        EnumC1412010mqd[] enumC1412010mqdArr = {enumC1412010mqd, enumC1412010mqd2, enumC1412010mqd3, enumC1412010mqd4, enumC1412010mqd5, enumC1412010mqd6};
        LLILLJJLI = enumC1412010mqdArr;
        LLILLL = new C2254308sP(enumC1412010mqdArr);
    }

    public static EnumC1412010mqd[] values() {
        return (EnumC1412010mqd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1412010mqd valueOf(String str) {
        return (EnumC1412010mqd) C08FF.LIZ(EnumC1412010mqd.class, str);
    }

    public EnumC1412010mqd(String str, int i, String str2) {
        this.LL = str2;
    }
}
