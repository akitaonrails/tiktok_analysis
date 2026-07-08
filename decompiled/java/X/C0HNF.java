package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HNF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HNF {
    public static final C0HNF BACK;
    public static final C0HNF CLICK_TEXT_PROMPT;
    public static final C0HNF CLOSE;
    public static final C0HNF GENERATE;
    public static final /* synthetic */ C0HNF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0HNF> getEntries() {
        return LLILLL;
    }

    static {
        C0HNF c0hnf = new C0HNF("BACK", 0, "back");
        BACK = c0hnf;
        C0HNF c0hnf2 = new C0HNF("CLOSE", 1, "close");
        CLOSE = c0hnf2;
        C0HNF c0hnf3 = new C0HNF("CLICK_TEXT_PROMPT", 2, "click_text_prompt");
        CLICK_TEXT_PROMPT = c0hnf3;
        C0HNF c0hnf4 = new C0HNF("GENERATE", 3, "generate");
        GENERATE = c0hnf4;
        C0HNF[] c0hnfArr = {c0hnf, c0hnf2, c0hnf3, c0hnf4};
        LLILLJJLI = c0hnfArr;
        LLILLL = new C2254308sP(c0hnfArr);
    }

    public static C0HNF[] values() {
        return (C0HNF[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static C0HNF valueOf(String str) {
        return (C0HNF) C08FF.LIZ(C0HNF.class, str);
    }

    public C0HNF(String str, int i, String str2) {
        this.LL = str2;
    }
}
