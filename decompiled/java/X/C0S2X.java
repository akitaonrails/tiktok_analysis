package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0S2X, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S2X {
    public static final C0S2X GROUP;
    public static final /* synthetic */ C0S2X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0S2X PRIVATE;
    public final String LL;

    public static InterfaceC2044707zh<C0S2X> getEntries() {
        return LLILLL;
    }

    static {
        C0S2X c0s2x = new C0S2X("GROUP", 0, "group");
        GROUP = c0s2x;
        C0S2X c0s2x2 = new C0S2X("PRIVATE", 1, "private");
        PRIVATE = c0s2x2;
        C0S2X[] c0s2xArr = {c0s2x, c0s2x2};
        LLILLJJLI = c0s2xArr;
        LLILLL = new C2254308sP(c0s2xArr);
    }

    public static C0S2X[] values() {
        return (C0S2X[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0S2X valueOf(String str) {
        return (C0S2X) C08FF.LIZ(C0S2X.class, str);
    }

    public C0S2X(String str, int i, String str2) {
        this.LL = str2;
    }
}
