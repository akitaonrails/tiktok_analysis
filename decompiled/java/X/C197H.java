package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.197H, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C197H {
    public static final C197O Companion;
    public static final C197H ENHANCE;
    public static final /* synthetic */ C197H[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C197H RANGE_REWRITE;
    public static final C197H SIMPLIFY;
    public static final C197H STRUCTURE;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C197H> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.197O] */
    static {
        C197H c197h = new C197H("ENHANCE", 0, 5, "enhance");
        ENHANCE = c197h;
        C197H c197h2 = new C197H("STRUCTURE", 1, 6, "structure");
        STRUCTURE = c197h2;
        C197H c197h3 = new C197H("SIMPLIFY", 2, 7, "simplify");
        SIMPLIFY = c197h3;
        C197H c197h4 = new C197H("RANGE_REWRITE", 3, 8, "range");
        RANGE_REWRITE = c197h4;
        C197H[] c197hArr = {c197h, c197h2, c197h3, c197h4};
        LLILLL = c197hArr;
        LLILZ = new C2254308sP(c197hArr);
        Companion = new Object() { // from class: X.197O
        };
    }

    public static C197H[] values() {
        return (C197H[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getStyle() {
        return this.LLILLJJLI;
    }

    public static C197H valueOf(String str) {
        return (C197H) C08FF.LIZ(C197H.class, str);
    }

    public C197H(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
