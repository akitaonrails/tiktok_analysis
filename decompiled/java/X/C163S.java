package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.163S, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163S {
    public static final C164D Companion;
    public static final C163S LANGUAGE_SAME;
    public static final C163S LANGUAGE_UNSUPPORTED;
    public static final /* synthetic */ C163S[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C163S SRC_LANG_NOT_DETECTED;
    public static final C163S TRANSLATION_FAILED;
    public static final C163S TRANSLATION_NOT_REQUIRED;
    public final int LL;

    public static InterfaceC2044707zh<C163S> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.164D] */
    static {
        C163S c163s = new C163S("SRC_LANG_NOT_DETECTED", 0, 10000);
        SRC_LANG_NOT_DETECTED = c163s;
        C163S c163s2 = new C163S("LANGUAGE_UNSUPPORTED", 1, 10001);
        LANGUAGE_UNSUPPORTED = c163s2;
        C163S c163s3 = new C163S("LANGUAGE_SAME", 2, 10002);
        LANGUAGE_SAME = c163s3;
        C163S c163s4 = new C163S("TRANSLATION_NOT_REQUIRED", 3, 10003);
        TRANSLATION_NOT_REQUIRED = c163s4;
        C163S c163s5 = new C163S("TRANSLATION_FAILED", 4, 10004);
        TRANSLATION_FAILED = c163s5;
        C163S[] c163sArr = {c163s, c163s2, c163s3, c163s4, c163s5};
        LLILLJJLI = c163sArr;
        LLILLL = new C2254308sP(c163sArr);
        Companion = new Object() { // from class: X.164D
        };
    }

    public static C163S[] values() {
        return (C163S[]) LLILLJJLI.clone();
    }

    public final int getStatusCode() {
        return this.LL;
    }

    public static C163S valueOf(String str) {
        return (C163S) C08FF.LIZ(C163S.class, str);
    }

    public C163S(String str, int i, int i2) {
        this.LL = i2;
    }
}
