package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H6N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H6N {
    public static final C0H6N LL;
    public static final C0H6N LLILLJJLI;
    public static final C0H6N LLILLL;
    public static final /* synthetic */ C0H6N[] LLILZ;

    static {
        C0H6N c0h6n = new C0H6N("WAITING", 0);
        LL = c0h6n;
        C0H6N c0h6n2 = new C0H6N("IN_PROGRESS", 1);
        LLILLJJLI = c0h6n2;
        C0H6N c0h6n3 = new C0H6N("DONE", 2);
        LLILLL = c0h6n3;
        C0H6N[] c0h6nArr = {c0h6n, c0h6n2, c0h6n3};
        LLILZ = c0h6nArr;
        new C2254308sP(c0h6nArr);
    }

    public static C0H6N[] values() {
        return (C0H6N[]) LLILZ.clone();
    }

    public static C0H6N valueOf(String str) {
        return (C0H6N) C08FF.LIZ(C0H6N.class, str);
    }

    public C0H6N(String str, int i) {
    }
}
