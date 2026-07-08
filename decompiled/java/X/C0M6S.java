package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M6S, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M6S {
    public static final C0M6S CANCELED;
    public static final C0M6S FAILED;
    public static final C0M6S GENERATING;
    public static final /* synthetic */ C0M6S[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M6S NONE;
    public static final C0M6S SUCCESS;

    public static InterfaceC2044707zh<C0M6S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M6S c0m6s = new C0M6S("NONE", 0);
        NONE = c0m6s;
        C0M6S c0m6s2 = new C0M6S("SUCCESS", 1);
        SUCCESS = c0m6s2;
        C0M6S c0m6s3 = new C0M6S("FAILED", 2);
        FAILED = c0m6s3;
        C0M6S c0m6s4 = new C0M6S("GENERATING", 3);
        GENERATING = c0m6s4;
        C0M6S c0m6s5 = new C0M6S("CANCELED", 4);
        CANCELED = c0m6s5;
        C0M6S[] c0m6sArr = {c0m6s, c0m6s2, c0m6s3, c0m6s4, c0m6s5};
        LL = c0m6sArr;
        LLILLJJLI = new C2254308sP(c0m6sArr);
    }

    public static C0M6S[] values() {
        return (C0M6S[]) LL.clone();
    }

    public static C0M6S valueOf(String str) {
        return (C0M6S) C08FF.LIZ(C0M6S.class, str);
    }

    public C0M6S(String str, int i) {
    }
}
