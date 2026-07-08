package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJD {
    public static final C0IJD EMPTY;
    public static final /* synthetic */ C0IJD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0IJD SEARCH_MULTI_LIVE_CARD;
    public final String LL;

    public static InterfaceC2044707zh<C0IJD> getEntries() {
        return LLILLL;
    }

    static {
        C0IJD c0ijd = new C0IJD("SEARCH_MULTI_LIVE_CARD", 0, "search_multi_live_card");
        SEARCH_MULTI_LIVE_CARD = c0ijd;
        C0IJD c0ijd2 = new C0IJD("EMPTY", 1, "");
        EMPTY = c0ijd2;
        C0IJD[] c0ijdArr = {c0ijd, c0ijd2};
        LLILLJJLI = c0ijdArr;
        LLILLL = new C2254308sP(c0ijdArr);
    }

    public static C0IJD[] values() {
        return (C0IJD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0IJD valueOf(String str) {
        return (C0IJD) C08FF.LIZ(C0IJD.class, str);
    }

    public C0IJD(String str, int i, String str2) {
        this.LL = str2;
    }
}
