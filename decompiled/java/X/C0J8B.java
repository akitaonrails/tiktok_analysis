package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J8B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J8B {
    public static final C0J8B EMPTY;
    public static final C0J8B FAIL;
    public static final C0J8B IDLE;
    public static final /* synthetic */ C0J8B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0J8B REQUESTING;
    public static final C0J8B SUCCESS;

    public static InterfaceC2044707zh<C0J8B> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0J8B c0j8b = new C0J8B("IDLE", 0);
        IDLE = c0j8b;
        C0J8B c0j8b2 = new C0J8B("REQUESTING", 1);
        REQUESTING = c0j8b2;
        C0J8B c0j8b3 = new C0J8B("SUCCESS", 2);
        SUCCESS = c0j8b3;
        C0J8B c0j8b4 = new C0J8B("EMPTY", 3);
        EMPTY = c0j8b4;
        C0J8B c0j8b5 = new C0J8B("FAIL", 4);
        FAIL = c0j8b5;
        C0J8B[] c0j8bArr = {c0j8b, c0j8b2, c0j8b3, c0j8b4, c0j8b5};
        LL = c0j8bArr;
        LLILLJJLI = new C2254308sP(c0j8bArr);
    }

    public static C0J8B[] values() {
        return (C0J8B[]) LL.clone();
    }

    public static C0J8B valueOf(String str) {
        return (C0J8B) C08FF.LIZ(C0J8B.class, str);
    }

    public C0J8B(String str, int i) {
    }
}
