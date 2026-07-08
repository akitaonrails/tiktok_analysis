package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.017U, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017U {
    public static final C017U HORIZONTAL;
    public static final /* synthetic */ C017U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C017U VERTICAL;
    public static final C017U Z;
    public final String LL;

    public static InterfaceC2044707zh<C017U> getEntries() {
        return LLILLL;
    }

    static {
        C017U c017u = new C017U("VERTICAL", 0, "v");
        VERTICAL = c017u;
        C017U c017u2 = new C017U("HORIZONTAL", 1, "h");
        HORIZONTAL = c017u2;
        C017U c017u3 = new C017U("Z", 2, "z");
        Z = c017u3;
        C017U[] c017uArr = {c017u, c017u2, c017u3};
        LLILLJJLI = c017uArr;
        LLILLL = new C2254308sP(c017uArr);
    }

    public static C017U[] values() {
        return (C017U[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C017U valueOf(String str) {
        return (C017U) C08FF.LIZ(C017U.class, str);
    }

    public C017U(String str, int i, String str2) {
        this.LL = str2;
    }
}
