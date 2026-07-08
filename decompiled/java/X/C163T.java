package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.163T, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163T {
    public static final C207143163x Companion;
    public static final C163T LANGUAGE_SAME;
    public static final C163T LANGUAGE_UNSUPPORTED;
    public static final /* synthetic */ C163T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C163T SRC_LANG_NOT_DETECTED;
    public static final C163T TRANSLATION_FAILED;
    public static final C163T TRANSLATION_NOT_REQUIRED;
    public final int LL;

    public static InterfaceC2044707zh<C163T> getEntries() {
        return LLILLL;
    }

    static {
        C163T c163t = new C163T("SRC_LANG_NOT_DETECTED", 0, 10000);
        SRC_LANG_NOT_DETECTED = c163t;
        C163T c163t2 = new C163T("LANGUAGE_UNSUPPORTED", 1, 10001);
        LANGUAGE_UNSUPPORTED = c163t2;
        C163T c163t3 = new C163T("LANGUAGE_SAME", 2, 10002);
        LANGUAGE_SAME = c163t3;
        C163T c163t4 = new C163T("TRANSLATION_NOT_REQUIRED", 3, 10003);
        TRANSLATION_NOT_REQUIRED = c163t4;
        C163T c163t5 = new C163T("TRANSLATION_FAILED", 4, 10004);
        TRANSLATION_FAILED = c163t5;
        C163T[] c163tArr = {c163t, c163t2, c163t3, c163t4, c163t5};
        LLILLJJLI = c163tArr;
        LLILLL = new C2254308sP(c163tArr);
        Companion = new C207143163x();
    }

    public static C163T[] values() {
        return (C163T[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C163T valueOf(String str) {
        return (C163T) C08FF.LIZ(C163T.class, str);
    }

    public C163T(String str, int i, int i2) {
        this.LL = i2;
    }
}
