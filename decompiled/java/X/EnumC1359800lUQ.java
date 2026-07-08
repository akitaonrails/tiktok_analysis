package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1359800lUQ {
    public static final EnumC1359800lUQ AUTO_OPEN_BY_FOLLOW_BTN;
    public static final EnumC1359800lUQ AUTO_OPEN_BY_NOTE_GUIDE;
    public static final EnumC1359800lUQ AUTO_OPEN_BY_TAG;
    public static final EnumC1359800lUQ BUTTON;
    public static final EnumC1359800lUQ EMOJI;
    public static final EnumC1359800lUQ FOLLOW_TEXT_BUTTON;
    public static final EnumC1359800lUQ INPUT_BOX;
    public static final /* synthetic */ EnumC1359800lUQ[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1359800lUQ MENTION;
    public static final EnumC1359800lUQ TIMELINE_TAB;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1359800lUQ> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1359800lUQ enumC1359800lUQ = new EnumC1359800lUQ("AUTO_OPEN_BY_TAG", 0, "auto_enter_keyboard", "avatar_directly_lift_keyboard");
        AUTO_OPEN_BY_TAG = enumC1359800lUQ;
        EnumC1359800lUQ enumC1359800lUQ2 = new EnumC1359800lUQ("AUTO_OPEN_BY_FOLLOW_BTN", 1, "bubble", null);
        AUTO_OPEN_BY_FOLLOW_BTN = enumC1359800lUQ2;
        EnumC1359800lUQ enumC1359800lUQ3 = new EnumC1359800lUQ("BUTTON", 2, "recommend_button", "bottom_button");
        BUTTON = enumC1359800lUQ3;
        EnumC1359800lUQ enumC1359800lUQ4 = new EnumC1359800lUQ("INPUT_BOX", 3, "input_box_text", "bottom_button");
        INPUT_BOX = enumC1359800lUQ4;
        EnumC1359800lUQ enumC1359800lUQ5 = new EnumC1359800lUQ("EMOJI", 4, "emoji", "bottom_button");
        EMOJI = enumC1359800lUQ5;
        EnumC1359800lUQ enumC1359800lUQ6 = new EnumC1359800lUQ("MENTION", 5, "at", "bottom_button");
        MENTION = enumC1359800lUQ6;
        EnumC1359800lUQ enumC1359800lUQ7 = new EnumC1359800lUQ("TIMELINE_TAB", 6, "", null);
        TIMELINE_TAB = enumC1359800lUQ7;
        EnumC1359800lUQ enumC1359800lUQ8 = new EnumC1359800lUQ("FOLLOW_TEXT_BUTTON", 7, "", null);
        FOLLOW_TEXT_BUTTON = enumC1359800lUQ8;
        EnumC1359800lUQ enumC1359800lUQ9 = new EnumC1359800lUQ("AUTO_OPEN_BY_NOTE_GUIDE", 8, "auto_enter_keyboard", null);
        AUTO_OPEN_BY_NOTE_GUIDE = enumC1359800lUQ9;
        EnumC1359800lUQ[] enumC1359800lUQArr = {enumC1359800lUQ, enumC1359800lUQ2, enumC1359800lUQ3, enumC1359800lUQ4, enumC1359800lUQ5, enumC1359800lUQ6, enumC1359800lUQ7, enumC1359800lUQ8, enumC1359800lUQ9};
        LLILLL = enumC1359800lUQArr;
        LLILZ = new C2254308sP(enumC1359800lUQArr);
    }

    public static EnumC1359800lUQ[] values() {
        return (EnumC1359800lUQ[]) LLILLL.clone();
    }

    public final String getClickTypeMob() {
        return this.LL;
    }

    public final String getPanelDetailMob() {
        return this.LLILLJJLI;
    }

    public static EnumC1359800lUQ valueOf(String str) {
        return (EnumC1359800lUQ) C08FF.LIZ(EnumC1359800lUQ.class, str);
    }

    public EnumC1359800lUQ(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
