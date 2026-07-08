package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC664420Q4i implements C0Q0Q {
    public static final EnumC664420Q4i AUTOPLAY;
    public static final EnumC664420Q4i CONTAINERIZATION;
    public static final EnumC664420Q4i DYNAMIC_LYNX_TAB_CONTAINER;
    public static final EnumC664420Q4i DYNAMIC_TAB;
    public static final EnumC664420Q4i EVENT_TRACKING_EXTERNAL_STATE;
    public static final EnumC664420Q4i FEED;
    public static final EnumC664420Q4i HISTORY_WORDS;
    public static final EnumC664420Q4i IMAGE;
    public static final /* synthetic */ EnumC664420Q4i[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC664420Q4i MARKDOWN;
    public static final EnumC664420Q4i MULTIPLE_CHUNK;
    public static final EnumC664420Q4i PLAYER;
    public static final EnumC664420Q4i SEARCH_CONTEXT;
    public static final EnumC664420Q4i STREAM_ROOT;
    public static final EnumC664420Q4i TAB_MANAGE;
    public static final EnumC664420Q4i VIEW_PAGER;
    public final String LL;
    public final String LLILLJJLI;

    public EnumC664420Q4i() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC664420Q4i> getEntries() {
        return LLILZ;
    }

    static {
        EnumC664420Q4i enumC664420Q4i = new EnumC664420Q4i("DYNAMIC_LYNX_TAB_CONTAINER", 0, "dynamic_lynx_tab_container");
        DYNAMIC_LYNX_TAB_CONTAINER = enumC664420Q4i;
        EnumC664420Q4i enumC664420Q4i2 = new EnumC664420Q4i("AUTOPLAY", 1, "autoplay");
        AUTOPLAY = enumC664420Q4i2;
        EnumC664420Q4i enumC664420Q4i3 = new EnumC664420Q4i("FEED", 2, "feed");
        FEED = enumC664420Q4i3;
        EnumC664420Q4i enumC664420Q4i4 = new EnumC664420Q4i("SEARCH_CONTEXT", 3, "search_context");
        SEARCH_CONTEXT = enumC664420Q4i4;
        EnumC664420Q4i enumC664420Q4i5 = new EnumC664420Q4i("STREAM_ROOT", 4, "stream_root");
        STREAM_ROOT = enumC664420Q4i5;
        EnumC664420Q4i enumC664420Q4i6 = new EnumC664420Q4i("MARKDOWN", 5, "markdown");
        MARKDOWN = enumC664420Q4i6;
        EnumC664420Q4i enumC664420Q4i7 = new EnumC664420Q4i("MULTIPLE_CHUNK", 6, "multiple_chunk");
        MULTIPLE_CHUNK = enumC664420Q4i7;
        EnumC664420Q4i enumC664420Q4i8 = new EnumC664420Q4i("CONTAINERIZATION", 7, "containerization");
        CONTAINERIZATION = enumC664420Q4i8;
        EnumC664420Q4i enumC664420Q4i9 = new EnumC664420Q4i("HISTORY_WORDS", 8, "history_words");
        HISTORY_WORDS = enumC664420Q4i9;
        EnumC664420Q4i enumC664420Q4i10 = new EnumC664420Q4i("EVENT_TRACKING_EXTERNAL_STATE", 9, "event_tracking_external_state");
        EVENT_TRACKING_EXTERNAL_STATE = enumC664420Q4i10;
        EnumC664420Q4i enumC664420Q4i11 = new EnumC664420Q4i("TAB_MANAGE", 10, "tab_manage");
        TAB_MANAGE = enumC664420Q4i11;
        EnumC664420Q4i enumC664420Q4i12 = new EnumC664420Q4i("VIEW_PAGER", 11, "view_pager");
        VIEW_PAGER = enumC664420Q4i12;
        EnumC664420Q4i enumC664420Q4i13 = new EnumC664420Q4i("DYNAMIC_TAB", 12, "dynamic_tab");
        DYNAMIC_TAB = enumC664420Q4i13;
        EnumC664420Q4i enumC664420Q4i14 = new EnumC664420Q4i("IMAGE", 13, "common_image");
        IMAGE = enumC664420Q4i14;
        EnumC664420Q4i enumC664420Q4i15 = new EnumC664420Q4i("PLAYER", 14, "player");
        PLAYER = enumC664420Q4i15;
        EnumC664420Q4i[] enumC664420Q4iArr = {enumC664420Q4i, enumC664420Q4i2, enumC664420Q4i3, enumC664420Q4i4, enumC664420Q4i5, enumC664420Q4i6, enumC664420Q4i7, enumC664420Q4i8, enumC664420Q4i9, enumC664420Q4i10, enumC664420Q4i11, enumC664420Q4i12, enumC664420Q4i13, enumC664420Q4i14, enumC664420Q4i15};
        LLILLL = enumC664420Q4iArr;
        LLILZ = new C2254308sP(enumC664420Q4iArr);
    }

    public static EnumC664420Q4i[] values() {
        return (EnumC664420Q4i[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static EnumC664420Q4i valueOf(String str) {
        return (EnumC664420Q4i) C08FF.LIZ(EnumC664420Q4i.class, str);
    }

    public EnumC664420Q4i(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = "frameworks";
    }
}
