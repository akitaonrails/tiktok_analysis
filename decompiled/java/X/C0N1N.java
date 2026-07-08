package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N1N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1N {
    public static final C0N1N LEVEL1;
    public static final C0N1N LEVEL2;
    public static final C0N1N LEVEL3;
    public static final /* synthetic */ C0N1N[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public int LL;

    public static InterfaceC2044707zh<C0N1N> getEntries() {
        return LLILLL;
    }

    static {
        C0N1N c0n1n = new C0N1N("LEVEL1", 0, 1);
        LEVEL1 = c0n1n;
        C0N1N c0n1n2 = new C0N1N("LEVEL2", 1, 2);
        LEVEL2 = c0n1n2;
        C0N1N c0n1n3 = new C0N1N("LEVEL3", 2, 3);
        LEVEL3 = c0n1n3;
        C0N1N[] c0n1nArr = {c0n1n, c0n1n2, c0n1n3};
        LLILLJJLI = c0n1nArr;
        LLILLL = new C2254308sP(c0n1nArr);
    }

    public static C0N1N[] values() {
        return (C0N1N[]) LLILLJJLI.clone();
    }

    public final int getLevel() {
        return this.LL;
    }

    public static C0N1N valueOf(String str) {
        return (C0N1N) C08FF.LIZ(C0N1N.class, str);
    }

    public final void setLevel(int i) {
        this.LL = i;
    }

    public C0N1N(String str, int i, int i2) {
        this.LL = i2;
    }
}
