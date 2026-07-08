package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PL2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL2 {
    public static final C0PL2 CLICK_SEARCH_CARD;
    public static final C0PL2 FEEDBACK_CARD;
    public static final C0PL2 INNER_SOURCE_REPLACE;
    public static final /* synthetic */ C0PL2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PL2 OUT_SOURCE_REPLACE;
    public static final C0PL2 UNDEFINED;
    public final String LL;

    public static InterfaceC2044707zh<C0PL2> getEntries() {
        return LLILLL;
    }

    static {
        C0PL2 c0pl2 = new C0PL2("UNDEFINED", 0, "undefined");
        UNDEFINED = c0pl2;
        C0PL2 c0pl22 = new C0PL2("OUT_SOURCE_REPLACE", 1, "out_source_replace");
        OUT_SOURCE_REPLACE = c0pl22;
        C0PL2 c0pl23 = new C0PL2("INNER_SOURCE_REPLACE", 2, "inner_source_replace");
        INNER_SOURCE_REPLACE = c0pl23;
        C0PL2 c0pl24 = new C0PL2("CLICK_SEARCH_CARD", 3, "click_search_card");
        CLICK_SEARCH_CARD = c0pl24;
        C0PL2 c0pl25 = new C0PL2("FEEDBACK_CARD", 4, "feedback_card");
        FEEDBACK_CARD = c0pl25;
        C0PL2[] c0pl2Arr = {c0pl2, c0pl22, c0pl23, c0pl24, c0pl25};
        LLILLJJLI = c0pl2Arr;
        LLILLL = new C2254308sP(c0pl2Arr);
    }

    public static C0PL2[] values() {
        return (C0PL2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0PL2 valueOf(String str) {
        return (C0PL2) C08FF.LIZ(C0PL2.class, str);
    }

    public C0PL2(String str, int i, String str2) {
        this.LL = str2;
    }
}
