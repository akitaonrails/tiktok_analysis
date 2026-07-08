package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MJK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MJK {
    public static final C0MJK ACTION_TYPE;
    public static final C0MJK AIGC_TYPE;
    public static final C0MJK FAIL_REASON;
    public static final /* synthetic */ C0MJK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MJK PHOTO_SELECT;
    public static final C0MJK UPLOAD_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0MJK> getEntries() {
        return LLILLL;
    }

    static {
        C0MJK c0mjk = new C0MJK("ACTION_TYPE", 0, "action_type");
        ACTION_TYPE = c0mjk;
        C0MJK c0mjk2 = new C0MJK("AIGC_TYPE", 1, "aigc_type");
        AIGC_TYPE = c0mjk2;
        C0MJK c0mjk3 = new C0MJK("PHOTO_SELECT", 2, "photo_select");
        PHOTO_SELECT = c0mjk3;
        C0MJK c0mjk4 = new C0MJK("UPLOAD_SUCCESS", 3, "upload_success");
        UPLOAD_SUCCESS = c0mjk4;
        C0MJK c0mjk5 = new C0MJK("FAIL_REASON", 4, "fail_reason");
        FAIL_REASON = c0mjk5;
        C0MJK[] c0mjkArr = {c0mjk, c0mjk2, c0mjk3, c0mjk4, c0mjk5};
        LLILLJJLI = c0mjkArr;
        LLILLL = new C2254308sP(c0mjkArr);
    }

    public static C0MJK[] values() {
        return (C0MJK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0MJK valueOf(String str) {
        return (C0MJK) C08FF.LIZ(C0MJK.class, str);
    }

    public C0MJK(String str, int i, String str2) {
        this.LL = str2;
    }
}
