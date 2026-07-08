package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0086, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0086 {
    public static final /* synthetic */ AnonymousClass0086[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final AnonymousClass0086 SEARCH_HIGHLIGHTS;
    public static final AnonymousClass0086 TOP1_TAKO_REGION;
    public final String LL;

    public static InterfaceC2044707zh<AnonymousClass0086> getEntries() {
        return LLILLL;
    }

    static {
        AnonymousClass0086 anonymousClass0086 = new AnonymousClass0086("SEARCH_HIGHLIGHTS", 0, "searchHighlights");
        SEARCH_HIGHLIGHTS = anonymousClass0086;
        AnonymousClass0086 anonymousClass00862 = new AnonymousClass0086("TOP1_TAKO_REGION", 1, "top1_tako_region");
        TOP1_TAKO_REGION = anonymousClass00862;
        AnonymousClass0086[] anonymousClass0086Arr = {anonymousClass0086, anonymousClass00862};
        LLILLJJLI = anonymousClass0086Arr;
        LLILLL = new C2254308sP(anonymousClass0086Arr);
    }

    public static AnonymousClass0086[] values() {
        return (AnonymousClass0086[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static AnonymousClass0086 valueOf(String str) {
        return (AnonymousClass0086) C08FF.LIZ(AnonymousClass0086.class, str);
    }

    public AnonymousClass0086(String str, int i, String str2) {
        this.LL = str2;
    }
}
