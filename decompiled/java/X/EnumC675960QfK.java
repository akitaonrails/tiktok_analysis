package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675960QfK {
    public static final EnumC675960QfK JSB;
    public static final /* synthetic */ EnumC675960QfK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC675960QfK SWITCH_ENTITY;
    public static final EnumC675960QfK SWITCH_TAB;
    public static final EnumC675960QfK USER_DRAW;
    public static final EnumC675960QfK VISUAL_NON_SHOPPABLE_VIDEOS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC675960QfK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC675960QfK enumC675960QfK = new EnumC675960QfK("SWITCH_ENTITY", 0, "switch_entity");
        SWITCH_ENTITY = enumC675960QfK;
        EnumC675960QfK enumC675960QfK2 = new EnumC675960QfK("SWITCH_TAB", 1, "visual_switch_tab");
        SWITCH_TAB = enumC675960QfK2;
        EnumC675960QfK enumC675960QfK3 = new EnumC675960QfK("USER_DRAW", 2, "user_draw");
        USER_DRAW = enumC675960QfK3;
        EnumC675960QfK enumC675960QfK4 = new EnumC675960QfK("JSB", 3, "visual_switch_tab");
        JSB = enumC675960QfK4;
        EnumC675960QfK enumC675960QfK5 = new EnumC675960QfK("VISUAL_NON_SHOPPABLE_VIDEOS", 4, "visual_non_shoppable_videos");
        VISUAL_NON_SHOPPABLE_VIDEOS = enumC675960QfK5;
        EnumC675960QfK[] enumC675960QfKArr = {enumC675960QfK, enumC675960QfK2, enumC675960QfK3, enumC675960QfK4, enumC675960QfK5};
        LLILLJJLI = enumC675960QfKArr;
        LLILLL = new C2254308sP(enumC675960QfKArr);
    }

    public static EnumC675960QfK[] values() {
        return (EnumC675960QfK[]) LLILLJJLI.clone();
    }

    public final String getSearchSource() {
        return this.LL;
    }

    public static EnumC675960QfK valueOf(String str) {
        return (EnumC675960QfK) C08FF.LIZ(EnumC675960QfK.class, str);
    }

    public EnumC675960QfK(String str, int i, String str2) {
        this.LL = str2;
    }
}
