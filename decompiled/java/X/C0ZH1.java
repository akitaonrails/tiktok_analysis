package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZH1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZH1 {
    public static final C0ZH1 EDIT;
    public static final /* synthetic */ C0ZH1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZH1 NONE;
    public static final C0ZH1 POST;
    public static final C0ZH1 REPOST;
    public static final C0ZH1 STORY;
    public static final C0ZH1 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0ZH1> getEntries() {
        return LLILLL;
    }

    static {
        C0ZH1 c0zh1 = new C0ZH1("POST", 0, "post");
        POST = c0zh1;
        C0ZH1 c0zh12 = new C0ZH1("STORY", 1, "story");
        STORY = c0zh12;
        C0ZH1 c0zh13 = new C0ZH1("REPOST", 2, "repost");
        REPOST = c0zh13;
        C0ZH1 c0zh14 = new C0ZH1("EDIT", 3, "edit");
        EDIT = c0zh14;
        C0ZH1 c0zh15 = new C0ZH1("NONE", 4, "none");
        NONE = c0zh15;
        C0ZH1 c0zh16 = new C0ZH1("UNKNOWN", 5, "unknown");
        UNKNOWN = c0zh16;
        C0ZH1[] c0zh1Arr = {c0zh1, c0zh12, c0zh13, c0zh14, c0zh15, c0zh16};
        LLILLJJLI = c0zh1Arr;
        LLILLL = new C2254308sP(c0zh1Arr);
    }

    public static C0ZH1[] values() {
        return (C0ZH1[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static C0ZH1 valueOf(String str) {
        return (C0ZH1) C08FF.LIZ(C0ZH1.class, str);
    }

    public C0ZH1(String str, int i, String str2) {
        this.LL = str2;
    }
}
