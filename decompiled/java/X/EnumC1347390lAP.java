package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1347390lAP {
    public static final EnumC1347390lAP COMMENT_FOLLOW_ANCHOR;
    public static final EnumC1347390lAP COMMENT_PANEL_CREATE;
    public static final EnumC1347390lAP COMMENT_PANEL_OUTER;
    public static final EnumC1347390lAP COMMENT_PANEL_UPLOAD;
    public static final /* synthetic */ EnumC1347390lAP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1347390lAP PHOTO_COMMENT_EDIT_PAGE;
    public static final EnumC1347390lAP PHOTO_COMMENT_INNER_FEED_FOLLOW_ANCHOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1347390lAP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1347390lAP enumC1347390lAP = new EnumC1347390lAP("COMMENT_PANEL_OUTER", 0, "comment_panel_outer");
        COMMENT_PANEL_OUTER = enumC1347390lAP;
        EnumC1347390lAP enumC1347390lAP2 = new EnumC1347390lAP("COMMENT_PANEL_UPLOAD", 1, "comment_panel_upload");
        COMMENT_PANEL_UPLOAD = enumC1347390lAP2;
        EnumC1347390lAP enumC1347390lAP3 = new EnumC1347390lAP("COMMENT_PANEL_CREATE", 2, "comment_panel_create");
        COMMENT_PANEL_CREATE = enumC1347390lAP3;
        EnumC1347390lAP enumC1347390lAP4 = new EnumC1347390lAP("PHOTO_COMMENT_EDIT_PAGE", 3, "photo_comment_edit_page");
        PHOTO_COMMENT_EDIT_PAGE = enumC1347390lAP4;
        EnumC1347390lAP enumC1347390lAP5 = new EnumC1347390lAP("COMMENT_FOLLOW_ANCHOR", 4, "comment_follow_anchor");
        COMMENT_FOLLOW_ANCHOR = enumC1347390lAP5;
        EnumC1347390lAP enumC1347390lAP6 = new EnumC1347390lAP("PHOTO_COMMENT_INNER_FEED_FOLLOW_ANCHOR", 5, "photo_comment_innerfeed_follow_anchor");
        PHOTO_COMMENT_INNER_FEED_FOLLOW_ANCHOR = enumC1347390lAP6;
        EnumC1347390lAP[] enumC1347390lAPArr = {enumC1347390lAP, enumC1347390lAP2, enumC1347390lAP3, enumC1347390lAP4, enumC1347390lAP5, enumC1347390lAP6};
        LLILLJJLI = enumC1347390lAPArr;
        LLILLL = new C2254308sP(enumC1347390lAPArr);
    }

    public static EnumC1347390lAP[] values() {
        return (EnumC1347390lAP[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1347390lAP valueOf(String str) {
        return (EnumC1347390lAP) C08FF.LIZ(EnumC1347390lAP.class, str);
    }

    public EnumC1347390lAP(String str, int i, String str2) {
        this.LL = str2;
    }
}
