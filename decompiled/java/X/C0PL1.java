package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PL1, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL1 {
    public static final C0PL1 CLICK_SEARCH_CARD;
    public static final C0PL1 FEEDBACK_CARD;
    public static final C0PL1 HIDE_DOC;
    public static final C0PL1 INNER_SOURCE_REPLACE;
    public static final /* synthetic */ C0PL1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PL1 NO_SOURCE;
    public static final C0PL1 OUT_SOURCE_REPLACE;
    public static final C0PL1 UNDEFINED;
    public final String LL;

    public static InterfaceC2044707zh<C0PL1> getEntries() {
        return LLILLL;
    }

    static {
        C0PL1 c0pl1 = new C0PL1("UNDEFINED", 0, "undefined");
        UNDEFINED = c0pl1;
        C0PL1 c0pl12 = new C0PL1("HIDE_DOC", 1, "hide_doc");
        HIDE_DOC = c0pl12;
        C0PL1 c0pl13 = new C0PL1("OUT_SOURCE_REPLACE", 2, "out_source_replace");
        OUT_SOURCE_REPLACE = c0pl13;
        C0PL1 c0pl14 = new C0PL1("INNER_SOURCE_REPLACE", 3, "inner_source_replace");
        INNER_SOURCE_REPLACE = c0pl14;
        C0PL1 c0pl15 = new C0PL1("NO_SOURCE", 4, "no_source");
        NO_SOURCE = c0pl15;
        C0PL1 c0pl16 = new C0PL1("CLICK_SEARCH_CARD", 5, "click_search_card");
        CLICK_SEARCH_CARD = c0pl16;
        C0PL1 c0pl17 = new C0PL1("FEEDBACK_CARD", 6, "feedback_card");
        FEEDBACK_CARD = c0pl17;
        C0PL1[] c0pl1Arr = {c0pl1, c0pl12, c0pl13, c0pl14, c0pl15, c0pl16, c0pl17};
        LLILLJJLI = c0pl1Arr;
        LLILLL = new C2254308sP(c0pl1Arr);
    }

    public static C0PL1[] values() {
        return (C0PL1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0PL1 valueOf(String str) {
        return (C0PL1) C08FF.LIZ(C0PL1.class, str);
    }

    public C0PL1(String str, int i, String str2) {
        this.LL = str2;
    }
}
