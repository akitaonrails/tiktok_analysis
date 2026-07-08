package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2R {
    public static final C0S2Q Companion;
    public static final C0S2R GROUP;
    public static final /* synthetic */ C0S2R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S2R PRIVATE;
    public static final C0S2R UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0S2R> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0S2Q] */
    static {
        C0S2R c0s2r = new C0S2R("PRIVATE", 0, "private");
        PRIVATE = c0s2r;
        C0S2R c0s2r2 = new C0S2R("GROUP", 1, "group");
        GROUP = c0s2r2;
        C0S2R c0s2r3 = new C0S2R("UNKNOWN", 2, "unknown");
        UNKNOWN = c0s2r3;
        C0S2R[] c0s2rArr = {c0s2r, c0s2r2, c0s2r3};
        LLILLJJLI = c0s2rArr;
        LLILLL = new C2254308sP(c0s2rArr);
        Companion = new Object() { // from class: X.0S2Q
        };
    }

    public static C0S2R[] values() {
        return (C0S2R[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static C0S2R valueOf(String str) {
        return (C0S2R) C08FF.LIZ(C0S2R.class, str);
    }

    public C0S2R(String str, int i, String str2) {
        this.LL = str2;
    }
}
