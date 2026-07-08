package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N9E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N9E {
    public static final /* synthetic */ C0N9E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N9E TO_ALL;
    public static final C0N9E TO_B;
    public static final C0N9E TO_C;
    public final String LL;

    public static InterfaceC2044707zh<C0N9E> getEntries() {
        return LLILLL;
    }

    static {
        C0N9E c0n9e = new C0N9E("TO_C", 0, "-c");
        TO_C = c0n9e;
        C0N9E c0n9e2 = new C0N9E("TO_B", 1, "-b");
        TO_B = c0n9e2;
        C0N9E c0n9e3 = new C0N9E("TO_ALL", 2, "-all");
        TO_ALL = c0n9e3;
        C0N9E[] c0n9eArr = {c0n9e, c0n9e2, c0n9e3};
        LLILLJJLI = c0n9eArr;
        LLILLL = new C2254308sP(c0n9eArr);
    }

    public static C0N9E[] values() {
        return (C0N9E[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N9E valueOf(String str) {
        return (C0N9E) C08FF.LIZ(C0N9E.class, str);
    }

    public C0N9E(String str, int i, String str2) {
        this.LL = str2;
    }
}
