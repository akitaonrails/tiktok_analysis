package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LXV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LXV {
    public static final C0LXV CLICK_TO_RECORD;
    public static final /* synthetic */ C0LXV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LXV LONG_PRESS_TO_RECORD;
    public static final C0LXV TAP_SCREEN;
    public static final C0LXV UPLOAD_PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<C0LXV> getEntries() {
        return LLILLL;
    }

    static {
        C0LXV c0lxv = new C0LXV("CLICK_TO_RECORD", 0, "click_to_record");
        CLICK_TO_RECORD = c0lxv;
        C0LXV c0lxv2 = new C0LXV("LONG_PRESS_TO_RECORD", 1, "long_press_to_record");
        LONG_PRESS_TO_RECORD = c0lxv2;
        C0LXV c0lxv3 = new C0LXV("TAP_SCREEN", 2, "tap_screen");
        TAP_SCREEN = c0lxv3;
        C0LXV c0lxv4 = new C0LXV("UPLOAD_PHOTO", 3, "upload_photo");
        UPLOAD_PHOTO = c0lxv4;
        C0LXV[] c0lxvArr = {c0lxv, c0lxv2, c0lxv3, c0lxv4};
        LLILLJJLI = c0lxvArr;
        LLILLL = new C2254308sP(c0lxvArr);
    }

    public static C0LXV[] values() {
        return (C0LXV[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0LXV valueOf(String str) {
        return (C0LXV) C08FF.LIZ(C0LXV.class, str);
    }

    public C0LXV(String str, int i, String str2) {
        this.LL = str2;
    }
}
