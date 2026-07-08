package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538190L8v {
    public static final EnumC538190L8v ADD_PHOTO;
    public static final EnumC538190L8v AIPICK_ADD_PHOTO;
    public static final EnumC538190L8v CHANGE_COVER;
    public static final EnumC538190L8v CREATE_TAB;
    public static final EnumC538190L8v CREATE_VIDEO;
    public static final EnumC538190L8v EDIT_BACK;
    public static final EnumC538190L8v EDIT_PAGE;
    public static final EnumC538190L8v EP_UPLOAD;
    public static final EnumC538190L8v LAYOUT_CELL;
    public static final /* synthetic */ EnumC538190L8v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538190L8v POST_PAGE;
    public static final EnumC538190L8v PROP_UPLOAD;
    public static final EnumC538190L8v REPLACE_PHOTO;
    public static final EnumC538190L8v SHOOT_PAGE;
    public static final EnumC538190L8v STICKER_UPLOAD;
    public static final EnumC538190L8v STORY_SHOOT;
    public static final EnumC538190L8v TEMPLATE_ANCHOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC538190L8v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC538190L8v enumC538190L8v = new EnumC538190L8v("SHOOT_PAGE", 0, "shoot_page");
        SHOOT_PAGE = enumC538190L8v;
        EnumC538190L8v enumC538190L8v2 = new EnumC538190L8v("CREATE_TAB", 1, "create_tab");
        CREATE_TAB = enumC538190L8v2;
        EnumC538190L8v enumC538190L8v3 = new EnumC538190L8v("PROP_UPLOAD", 2, "prop_upload");
        PROP_UPLOAD = enumC538190L8v3;
        EnumC538190L8v enumC538190L8v4 = new EnumC538190L8v("LAYOUT_CELL", 3, "layout_cell");
        LAYOUT_CELL = enumC538190L8v4;
        EnumC538190L8v enumC538190L8v5 = new EnumC538190L8v("EDIT_PAGE", 4, "edit_page");
        EDIT_PAGE = enumC538190L8v5;
        EnumC538190L8v enumC538190L8v6 = new EnumC538190L8v("EP_UPLOAD", 5, "ep_upload");
        EP_UPLOAD = enumC538190L8v6;
        EnumC538190L8v enumC538190L8v7 = new EnumC538190L8v("STICKER_UPLOAD", 6, "sticker_upload");
        STICKER_UPLOAD = enumC538190L8v7;
        EnumC538190L8v enumC538190L8v8 = new EnumC538190L8v("POST_PAGE", 7, "post_page");
        POST_PAGE = enumC538190L8v8;
        EnumC538190L8v enumC538190L8v9 = new EnumC538190L8v("STORY_SHOOT", 8, "story_shoot");
        STORY_SHOOT = enumC538190L8v9;
        EnumC538190L8v enumC538190L8v10 = new EnumC538190L8v("TEMPLATE_ANCHOR", 9, "template_anchor");
        TEMPLATE_ANCHOR = enumC538190L8v10;
        EnumC538190L8v enumC538190L8v11 = new EnumC538190L8v("ADD_PHOTO", 10, "add_photo");
        ADD_PHOTO = enumC538190L8v11;
        EnumC538190L8v enumC538190L8v12 = new EnumC538190L8v("REPLACE_PHOTO", 11, "replace_photo");
        REPLACE_PHOTO = enumC538190L8v12;
        EnumC538190L8v enumC538190L8v13 = new EnumC538190L8v("CHANGE_COVER", 12, "change_cover");
        CHANGE_COVER = enumC538190L8v13;
        EnumC538190L8v enumC538190L8v14 = new EnumC538190L8v("EDIT_BACK", 13, "return_from_edit");
        EDIT_BACK = enumC538190L8v14;
        EnumC538190L8v enumC538190L8v15 = new EnumC538190L8v("CREATE_VIDEO", 14, "create_video");
        CREATE_VIDEO = enumC538190L8v15;
        EnumC538190L8v enumC538190L8v16 = new EnumC538190L8v("AIPICK_ADD_PHOTO", 15, "aipick_add_photo");
        AIPICK_ADD_PHOTO = enumC538190L8v16;
        EnumC538190L8v[] enumC538190L8vArr = {enumC538190L8v, enumC538190L8v2, enumC538190L8v3, enumC538190L8v4, enumC538190L8v5, enumC538190L8v6, enumC538190L8v7, enumC538190L8v8, enumC538190L8v9, enumC538190L8v10, enumC538190L8v11, enumC538190L8v12, enumC538190L8v13, enumC538190L8v14, enumC538190L8v15, enumC538190L8v16};
        LLILLJJLI = enumC538190L8vArr;
        LLILLL = new C2254308sP(enumC538190L8vArr);
    }

    public static EnumC538190L8v[] values() {
        return (EnumC538190L8v[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC538190L8v valueOf(String str) {
        return (EnumC538190L8v) C08FF.LIZ(EnumC538190L8v.class, str);
    }

    public EnumC538190L8v(String str, int i, String str2) {
        this.LL = str2;
    }
}
