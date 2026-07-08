package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XXB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XXB {
    public static final C0XXB ALL_ACCOUNTS_FILTERED;
    public static final C0XXB ERRORS;
    public static final C0XXB FOUND_ACCOUNTS;
    public static final /* synthetic */ C0XXB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XXB NO_ACCOUNTS;
    public final int LL;

    public static InterfaceC2044707zh<C0XXB> getEntries() {
        return LLILLL;
    }

    static {
        C0XXB c0xxb = new C0XXB("FOUND_ACCOUNTS", 0, 0);
        FOUND_ACCOUNTS = c0xxb;
        C0XXB c0xxb2 = new C0XXB("NO_ACCOUNTS", 1, 1);
        NO_ACCOUNTS = c0xxb2;
        C0XXB c0xxb3 = new C0XXB("ERRORS", 2, 2);
        ERRORS = c0xxb3;
        C0XXB c0xxb4 = new C0XXB("ALL_ACCOUNTS_FILTERED", 3, 3);
        ALL_ACCOUNTS_FILTERED = c0xxb4;
        C0XXB[] c0xxbArr = {c0xxb, c0xxb2, c0xxb3, c0xxb4};
        LLILLJJLI = c0xxbArr;
        LLILLL = new C2254308sP(c0xxbArr);
    }

    public static C0XXB[] values() {
        return (C0XXB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0XXB valueOf(String str) {
        return (C0XXB) C08FF.LIZ(C0XXB.class, str);
    }

    public C0XXB(String str, int i, int i2) {
        this.LL = i2;
    }
}
