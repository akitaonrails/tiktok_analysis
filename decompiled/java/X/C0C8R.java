package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8R, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8R {
    public static final /* synthetic */ C0C8R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0C8R VISUAL_DEFAULT_TAG;
    public static final C0C8R VISUAL_EC_PRODUCT;
    public static final C0C8R VISUAL_HISTORY;
    public static final C0C8R VISUAL_LONG_PRESS_PANEL;
    public static final C0C8R VISUAL_SCREENSHOT;
    public static final C0C8R VISUAL_SMART_SEARCH;
    public static final C0C8R VISUAL_TAG;
    public static final C0C8R VISUAL_TAKE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<C0C8R> getEntries() {
        return LLILLL;
    }

    static {
        C0C8R c0c8r = new C0C8R("VISUAL_TAG", 0, "tag_scene");
        VISUAL_TAG = c0c8r;
        C0C8R c0c8r2 = new C0C8R("VISUAL_DEFAULT_TAG", 1, "default_tag_scene");
        VISUAL_DEFAULT_TAG = c0c8r2;
        C0C8R c0c8r3 = new C0C8R("VISUAL_TAKE_PHOTO", 2, "photo_scene");
        VISUAL_TAKE_PHOTO = c0c8r3;
        C0C8R c0c8r4 = new C0C8R("VISUAL_HISTORY", 3, "history_scene");
        VISUAL_HISTORY = c0c8r4;
        C0C8R c0c8r5 = new C0C8R("VISUAL_SMART_SEARCH", 4, "smart_search_scene");
        VISUAL_SMART_SEARCH = c0c8r5;
        C0C8R c0c8r6 = new C0C8R("VISUAL_SCREENSHOT", 5, "screenshot_scene");
        VISUAL_SCREENSHOT = c0c8r6;
        C0C8R c0c8r7 = new C0C8R("VISUAL_LONG_PRESS_PANEL", 6, "long_press_scene");
        VISUAL_LONG_PRESS_PANEL = c0c8r7;
        C0C8R c0c8r8 = new C0C8R("VISUAL_EC_PRODUCT", 7, "ecom_shopcart_scene");
        VISUAL_EC_PRODUCT = c0c8r8;
        C0C8R[] c0c8rArr = {c0c8r, c0c8r2, c0c8r3, c0c8r4, c0c8r5, c0c8r6, c0c8r7, c0c8r8};
        LLILLJJLI = c0c8rArr;
        LLILLL = new C2254308sP(c0c8rArr);
    }

    public static C0C8R[] values() {
        return (C0C8R[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0C8R valueOf(String str) {
        return (C0C8R) C08FF.LIZ(C0C8R.class, str);
    }

    public C0C8R(String str, int i, String str2) {
        this.LL = str2;
    }
}
