package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M5C, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M5C {
    public static final C0M5C DIRECT_JUMP;
    public static final C0M5C DOWNLOAD;
    public static final /* synthetic */ C0M5C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0M5C LOST_DRAFT;
    public static final C0M5C OTHER_DEVICE_PAGE;
    public static final C0M5C TO_POSTED_LIVE_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<C0M5C> getEntries() {
        return LLILLL;
    }

    static {
        C0M5C c0m5c = new C0M5C("LOST_DRAFT", 0, "lost_draft");
        LOST_DRAFT = c0m5c;
        C0M5C c0m5c2 = new C0M5C("DIRECT_JUMP", 1, "direct_jump");
        DIRECT_JUMP = c0m5c2;
        C0M5C c0m5c3 = new C0M5C("DOWNLOAD", 2, "download");
        DOWNLOAD = c0m5c3;
        C0M5C c0m5c4 = new C0M5C("OTHER_DEVICE_PAGE", 3, "other_device_page");
        OTHER_DEVICE_PAGE = c0m5c4;
        C0M5C c0m5c5 = new C0M5C("TO_POSTED_LIVE_PHOTO", 4, "direct_jump_feed");
        TO_POSTED_LIVE_PHOTO = c0m5c5;
        C0M5C[] c0m5cArr = {c0m5c, c0m5c2, c0m5c3, c0m5c4, c0m5c5};
        LLILLJJLI = c0m5cArr;
        LLILLL = new C2254308sP(c0m5cArr);
    }

    public static C0M5C[] values() {
        return (C0M5C[]) LLILLJJLI.clone();
    }

    public final String getMob() {
        return this.LL;
    }

    public static C0M5C valueOf(String str) {
        return (C0M5C) C08FF.LIZ(C0M5C.class, str);
    }

    public C0M5C(String str, int i, String str2) {
        this.LL = str2;
    }
}
