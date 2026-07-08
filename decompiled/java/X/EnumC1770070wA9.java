package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1770070wA9 {
    public static final EnumC1770070wA9 ANCHOR_PANEL_HIDE;
    public static final EnumC1770070wA9 ANCHOR_PANEL_SHOW;
    public static final /* synthetic */ EnumC1770070wA9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1770070wA9 REQUEST_REACH_CFG;
    public static final EnumC1770070wA9 VIDEO_GUIDE_DISMISS;
    public static final EnumC1770070wA9 VIDEO_GUIDE_SHOW_FAIL;
    public static final EnumC1770070wA9 VIDEO_GUIDE_SHOW_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1770070wA9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1770070wA9 enumC1770070wA9 = new EnumC1770070wA9("ANCHOR_PANEL_SHOW", 0, "anchor_panel_show");
        ANCHOR_PANEL_SHOW = enumC1770070wA9;
        EnumC1770070wA9 enumC1770070wA92 = new EnumC1770070wA9("REQUEST_REACH_CFG", 1, "request_reach_cfg");
        REQUEST_REACH_CFG = enumC1770070wA92;
        EnumC1770070wA9 enumC1770070wA93 = new EnumC1770070wA9("ANCHOR_PANEL_HIDE", 2, "anchor_panel_hide");
        ANCHOR_PANEL_HIDE = enumC1770070wA93;
        EnumC1770070wA9 enumC1770070wA94 = new EnumC1770070wA9("VIDEO_GUIDE_SHOW_SUCCESS", 3, "video_guide_show_success");
        VIDEO_GUIDE_SHOW_SUCCESS = enumC1770070wA94;
        EnumC1770070wA9 enumC1770070wA95 = new EnumC1770070wA9("VIDEO_GUIDE_SHOW_FAIL", 4, "video_guide_show_fail");
        VIDEO_GUIDE_SHOW_FAIL = enumC1770070wA95;
        EnumC1770070wA9 enumC1770070wA96 = new EnumC1770070wA9("VIDEO_GUIDE_DISMISS", 5, "video_guide_dismiss");
        VIDEO_GUIDE_DISMISS = enumC1770070wA96;
        EnumC1770070wA9[] enumC1770070wA9Arr = {enumC1770070wA9, enumC1770070wA92, enumC1770070wA93, enumC1770070wA94, enumC1770070wA95, enumC1770070wA96};
        LLILLJJLI = enumC1770070wA9Arr;
        LLILLL = new C2254308sP(enumC1770070wA9Arr);
    }

    public static EnumC1770070wA9[] values() {
        return (EnumC1770070wA9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1770070wA9 valueOf(String str) {
        return (EnumC1770070wA9) C08FF.LIZ(EnumC1770070wA9.class, str);
    }

    public EnumC1770070wA9(String str, int i, String str2) {
        this.LL = str2;
    }
}
