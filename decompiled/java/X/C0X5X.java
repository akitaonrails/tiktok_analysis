package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X5X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X5X {
    public static final /* synthetic */ C0X5X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X5X SCENE_LOAD_URL;
    public static final C0X5X SCENE_OVER_LOAD;
    public static final C0X5X SCENE_PAGE_START;
    public final String LL;

    public static InterfaceC2044707zh<C0X5X> getEntries() {
        return LLILLL;
    }

    static {
        C0X5X c0x5x = new C0X5X("SCENE_LOAD_URL", 0, "load_url");
        SCENE_LOAD_URL = c0x5x;
        C0X5X c0x5x2 = new C0X5X("SCENE_PAGE_START", 1, "page_start");
        SCENE_PAGE_START = c0x5x2;
        C0X5X c0x5x3 = new C0X5X("SCENE_OVER_LOAD", 2, "over_load");
        SCENE_OVER_LOAD = c0x5x3;
        C0X5X[] c0x5xArr = {c0x5x, c0x5x2, c0x5x3};
        LLILLJJLI = c0x5xArr;
        LLILLL = new C2254308sP(c0x5xArr);
    }

    public static C0X5X[] values() {
        return (C0X5X[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0X5X valueOf(String str) {
        return (C0X5X) C08FF.LIZ(C0X5X.class, str);
    }

    public C0X5X(String str, int i, String str2) {
        this.LL = str2;
    }
}
