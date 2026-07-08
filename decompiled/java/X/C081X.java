package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C081X {
    public static final C081X FALSE;
    public static final /* synthetic */ C081X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C081X TRUE;
    public final String LL;

    public static InterfaceC2044707zh<C081X> getEntries() {
        return LLILLL;
    }

    static {
        C081X c081x = new C081X("FALSE", 0, "false");
        FALSE = c081x;
        C081X c081x2 = new C081X("TRUE", 1, "true");
        TRUE = c081x2;
        C081X[] c081xArr = {c081x, c081x2};
        LLILLJJLI = c081xArr;
        LLILLL = new C2254308sP(c081xArr);
    }

    public static C081X[] values() {
        return (C081X[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C081X valueOf(String str) {
        return (C081X) C08FF.LIZ(C081X.class, str);
    }

    public C081X(String str, int i, String str2) {
        this.LL = str2;
    }
}
