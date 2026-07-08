package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MEC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MEC {
    public static final C0MEC FAIL_CHANGE_IMAGE;
    public static final C0MEC FAIL_CHANGE_PROMPT;
    public static final C0MEC FAIL_QUOTA;
    public static final /* synthetic */ C0MEC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0MEC> getEntries() {
        return LLILLL;
    }

    static {
        C0MEC c0mec = new C0MEC("FAIL_QUOTA", 0, "fail_quota");
        FAIL_QUOTA = c0mec;
        C0MEC c0mec2 = new C0MEC("FAIL_CHANGE_PROMPT", 1, "fail_change_prompt");
        FAIL_CHANGE_PROMPT = c0mec2;
        C0MEC c0mec3 = new C0MEC("FAIL_CHANGE_IMAGE", 2, "fail_change_image");
        FAIL_CHANGE_IMAGE = c0mec3;
        C0MEC[] c0mecArr = {c0mec, c0mec2, c0mec3};
        LLILLJJLI = c0mecArr;
        LLILLL = new C2254308sP(c0mecArr);
    }

    public static C0MEC[] values() {
        return (C0MEC[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0MEC valueOf(String str) {
        return (C0MEC) C08FF.LIZ(C0MEC.class, str);
    }

    public C0MEC(String str, int i, String str2) {
        this.LL = str2;
    }
}
