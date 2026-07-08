package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ELK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ELK {
    public static final C0ELK FROM_ADD_MUSIC;
    public static final C0ELK FROM_ALBUM;
    public static final C0ELK FROM_ANCHOR;
    public static final C0ELK FROM_CREATE_TEMPLATE;
    public static final C0ELK FROM_DRAFT;
    public static final C0ELK FROM_EDITOR_NOW;
    public static final C0ELK FROM_EDITOR_ROOT;
    public static final C0ELK FROM_EDITOR_TAB;
    public static final C0ELK FROM_FEED_RESTORE;
    public static final C0ELK FROM_RESTORE;
    public static final C0ELK FROM_STRIP_MUSIC_PREVIEW;
    public static final C0ELK FROM_UNKNOWN;
    public static final /* synthetic */ C0ELK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0ELK> getEntries() {
        return LLILLL;
    }

    static {
        C0ELK c0elk = new C0ELK("FROM_EDITOR_ROOT", 0, "from_edit_root");
        FROM_EDITOR_ROOT = c0elk;
        C0ELK c0elk2 = new C0ELK("FROM_EDITOR_NOW", 1, "from_edit_now");
        FROM_EDITOR_NOW = c0elk2;
        C0ELK c0elk3 = new C0ELK("FROM_ANCHOR", 2, "from_anchor");
        FROM_ANCHOR = c0elk3;
        C0ELK c0elk4 = new C0ELK("FROM_CREATE_TEMPLATE", 3, "from_template_creation");
        FROM_CREATE_TEMPLATE = c0elk4;
        C0ELK c0elk5 = new C0ELK("FROM_RESTORE", 4, "from_restore");
        FROM_RESTORE = c0elk5;
        C0ELK c0elk6 = new C0ELK("FROM_DRAFT", 5, "from_draft");
        FROM_DRAFT = c0elk6;
        C0ELK c0elk7 = new C0ELK("FROM_FEED_RESTORE", 6, "from_feed_restore");
        FROM_FEED_RESTORE = c0elk7;
        C0ELK c0elk8 = new C0ELK("FROM_EDITOR_TAB", 7, "from_editor_tab");
        FROM_EDITOR_TAB = c0elk8;
        C0ELK c0elk9 = new C0ELK("FROM_ALBUM", 8, "from_new_album");
        FROM_ALBUM = c0elk9;
        C0ELK c0elk10 = new C0ELK("FROM_STRIP_MUSIC_PREVIEW", 9, "from_strip_music_preview");
        FROM_STRIP_MUSIC_PREVIEW = c0elk10;
        C0ELK c0elk11 = new C0ELK("FROM_ADD_MUSIC", 10, "from_add_music");
        FROM_ADD_MUSIC = c0elk11;
        C0ELK c0elk12 = new C0ELK("FROM_UNKNOWN", 11, "from_unknown");
        FROM_UNKNOWN = c0elk12;
        C0ELK[] c0elkArr = {c0elk, c0elk2, c0elk3, c0elk4, c0elk5, c0elk6, c0elk7, c0elk8, c0elk9, c0elk10, c0elk11, c0elk12};
        LLILLJJLI = c0elkArr;
        LLILLL = new C2254308sP(c0elkArr);
    }

    public static C0ELK[] values() {
        return (C0ELK[]) LLILLJJLI.clone();
    }

    public final String getMobName() {
        return this.LL;
    }

    public static C0ELK valueOf(String str) {
        return (C0ELK) C08FF.LIZ(C0ELK.class, str);
    }

    public C0ELK(String str, int i, String str2) {
        this.LL = str2;
    }
}
