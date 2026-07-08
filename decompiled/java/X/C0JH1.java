package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JH1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JH1 {
    public static final /* synthetic */ C0JH1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0JH1 UNKNOWN;
    public static final C0JH1 UPLOAD_FAILED;
    public static final C0JH1 UPLOAD_IN_PROGRESS;
    public static final C0JH1 UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE;
    public static final C0JH1 UPLOAD_SUCCESS_PUBLISHED_TO_COURSE;

    public static InterfaceC2044707zh<C0JH1> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0JH1 c0jh1 = new C0JH1("UPLOAD_IN_PROGRESS", 0);
        UPLOAD_IN_PROGRESS = c0jh1;
        C0JH1 c0jh12 = new C0JH1("UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE", 1);
        UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE = c0jh12;
        C0JH1 c0jh13 = new C0JH1("UPLOAD_FAILED", 2);
        UPLOAD_FAILED = c0jh13;
        C0JH1 c0jh14 = new C0JH1("UPLOAD_SUCCESS_PUBLISHED_TO_COURSE", 3);
        UPLOAD_SUCCESS_PUBLISHED_TO_COURSE = c0jh14;
        C0JH1 c0jh15 = new C0JH1("UNKNOWN", 4);
        UNKNOWN = c0jh15;
        C0JH1[] c0jh1Arr = {c0jh1, c0jh12, c0jh13, c0jh14, c0jh15};
        LL = c0jh1Arr;
        LLILLJJLI = new C2254308sP(c0jh1Arr);
    }

    public static C0JH1[] values() {
        return (C0JH1[]) LL.clone();
    }

    public final boolean isUploaded() {
        return this == UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE || this == UPLOAD_SUCCESS_PUBLISHED_TO_COURSE;
    }

    public static C0JH1 valueOf(String str) {
        return (C0JH1) C08FF.LIZ(C0JH1.class, str);
    }

    public C0JH1(String str, int i) {
    }
}
