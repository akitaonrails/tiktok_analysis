package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC717440SCg {
    public static final EnumC717440SCg AUTO_CLICK_NOT_POST;
    public static final EnumC717440SCg AUTO_FIRST_POST;
    public static final EnumC717440SCg AUTO_PHASE_OUT;
    public static final /* synthetic */ EnumC717440SCg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC717440SCg STORY_REVEAL_ICON;
    public static final EnumC717440SCg TOP_RIGHT_DOTS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC717440SCg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC717440SCg enumC717440SCg = new EnumC717440SCg("STORY_REVEAL_ICON", 0, "story_reveal_icon");
        STORY_REVEAL_ICON = enumC717440SCg;
        EnumC717440SCg enumC717440SCg2 = new EnumC717440SCg("TOP_RIGHT_DOTS", 1, "top_right_dots");
        TOP_RIGHT_DOTS = enumC717440SCg2;
        EnumC717440SCg enumC717440SCg3 = new EnumC717440SCg("AUTO_FIRST_POST", 2, "auto_first_post");
        AUTO_FIRST_POST = enumC717440SCg3;
        EnumC717440SCg enumC717440SCg4 = new EnumC717440SCg("AUTO_PHASE_OUT", 3, "auto_phase_out");
        AUTO_PHASE_OUT = enumC717440SCg4;
        EnumC717440SCg enumC717440SCg5 = new EnumC717440SCg("AUTO_CLICK_NOT_POST", 4, "auto_click_not_post");
        AUTO_CLICK_NOT_POST = enumC717440SCg5;
        EnumC717440SCg[] enumC717440SCgArr = {enumC717440SCg, enumC717440SCg2, enumC717440SCg3, enumC717440SCg4, enumC717440SCg5};
        LLILLJJLI = enumC717440SCgArr;
        LLILLL = new C2254308sP(enumC717440SCgArr);
    }

    public static EnumC717440SCg[] values() {
        return (EnumC717440SCg[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC717440SCg valueOf(String str) {
        return (EnumC717440SCg) C08FF.LIZ(EnumC717440SCg.class, str);
    }

    public EnumC717440SCg(String str, int i, String str2) {
        this.LL = str2;
    }
}
