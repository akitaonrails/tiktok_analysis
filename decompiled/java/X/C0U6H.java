package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U6H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U6H {
    public static final /* synthetic */ C0U6H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U6H RECOMMEND;
    public static final C0U6H SEARCH;
    public final String LL;

    public static InterfaceC2044707zh<C0U6H> getEntries() {
        return LLILLL;
    }

    static {
        C0U6H c0u6h = new C0U6H("RECOMMEND", 0, "recommend");
        RECOMMEND = c0u6h;
        C0U6H c0u6h2 = new C0U6H("SEARCH", 1, "search");
        SEARCH = c0u6h2;
        C0U6H[] c0u6hArr = {c0u6h, c0u6h2};
        LLILLJJLI = c0u6hArr;
        LLILLL = new C2254308sP(c0u6hArr);
    }

    public static C0U6H[] values() {
        return (C0U6H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0U6H valueOf(String str) {
        return (C0U6H) C08FF.LIZ(C0U6H.class, str);
    }

    public C0U6H(String str, int i, String str2) {
        this.LL = str2;
    }
}
