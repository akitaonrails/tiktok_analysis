package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PzZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC663030PzZ {
    public static final EnumC663030PzZ CLICK_HELP_POST_POST_BUTTON;
    public static final EnumC663030PzZ CLICK_HELP_POST_QUESTION;
    public static final EnumC663030PzZ CLICK_HELP_POST_TITLE;
    public static final EnumC663030PzZ DEFAULT;
    public static final /* synthetic */ EnumC663030PzZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC663030PzZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC663030PzZ enumC663030PzZ = new EnumC663030PzZ("CLICK_HELP_POST_POST_BUTTON", 0, "click_help_post_post_button");
        CLICK_HELP_POST_POST_BUTTON = enumC663030PzZ;
        EnumC663030PzZ enumC663030PzZ2 = new EnumC663030PzZ("CLICK_HELP_POST_TITLE", 1, "click_help_post_title");
        CLICK_HELP_POST_TITLE = enumC663030PzZ2;
        EnumC663030PzZ enumC663030PzZ3 = new EnumC663030PzZ("CLICK_HELP_POST_QUESTION", 2, "click_help_post_question");
        CLICK_HELP_POST_QUESTION = enumC663030PzZ3;
        EnumC663030PzZ enumC663030PzZ4 = new EnumC663030PzZ(LivePreviewCTASmartDisplayManager.DEFAULT, 3, "click_help_post_others");
        DEFAULT = enumC663030PzZ4;
        EnumC663030PzZ[] enumC663030PzZArr = {enumC663030PzZ, enumC663030PzZ2, enumC663030PzZ3, enumC663030PzZ4};
        LLILLJJLI = enumC663030PzZArr;
        LLILLL = new C2254308sP(enumC663030PzZArr);
    }

    public static EnumC663030PzZ[] values() {
        return (EnumC663030PzZ[]) LLILLJJLI.clone();
    }

    public final String getClickType() {
        return this.LL;
    }

    public static EnumC663030PzZ valueOf(String str) {
        return (EnumC663030PzZ) C08FF.LIZ(EnumC663030PzZ.class, str);
    }

    public EnumC663030PzZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
