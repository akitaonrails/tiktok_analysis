package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1244100iTo {
    public static final EnumC1244100iTo CLICK_COMMENT_PANEL_GROUP_ICON;
    public static final EnumC1244100iTo CLICK_COMMENT_PANEL_MENTION_AND_SELECT_GROUP;
    public static final EnumC1244100iTo COMMENT_PANEL_PARSE_GROUP_LINK;
    public static final C1244110iTp Companion;
    public static final /* synthetic */ EnumC1244100iTo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1244100iTo UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1244100iTo> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0iTp] */
    static {
        EnumC1244100iTo enumC1244100iTo = new EnumC1244100iTo("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1244100iTo;
        EnumC1244100iTo enumC1244100iTo2 = new EnumC1244100iTo("CLICK_COMMENT_PANEL_GROUP_ICON", 1, "comment_panel_group_icon");
        CLICK_COMMENT_PANEL_GROUP_ICON = enumC1244100iTo2;
        EnumC1244100iTo enumC1244100iTo3 = new EnumC1244100iTo("CLICK_COMMENT_PANEL_MENTION_AND_SELECT_GROUP", 2, "comment_panel_mention");
        CLICK_COMMENT_PANEL_MENTION_AND_SELECT_GROUP = enumC1244100iTo3;
        EnumC1244100iTo enumC1244100iTo4 = new EnumC1244100iTo("COMMENT_PANEL_PARSE_GROUP_LINK", 3, "comment_panel_parse_group_link");
        COMMENT_PANEL_PARSE_GROUP_LINK = enumC1244100iTo4;
        EnumC1244100iTo[] enumC1244100iToArr = {enumC1244100iTo, enumC1244100iTo2, enumC1244100iTo3, enumC1244100iTo4};
        LLILLJJLI = enumC1244100iToArr;
        LLILLL = new C2254308sP(enumC1244100iToArr);
        Companion = new Object() { // from class: X.0iTp
        };
    }

    public static EnumC1244100iTo[] values() {
        return (EnumC1244100iTo[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC1244100iTo valueOf(String str) {
        return (EnumC1244100iTo) C08FF.LIZ(EnumC1244100iTo.class, str);
    }

    public EnumC1244100iTo(String str, int i, String str2) {
        this.LL = str2;
    }
}
