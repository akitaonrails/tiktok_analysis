package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7N {
    public static final C0N7N DEFAULTMODE;
    public static final C0N7N DISABLEMODE;
    public static final C0N7N KEYWORDMODE;
    public static final /* synthetic */ C0N7N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0N7N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N7N c0n7n = new C0N7N("DEFAULTMODE", 0);
        DEFAULTMODE = c0n7n;
        C0N7N c0n7n2 = new C0N7N("KEYWORDMODE", 1);
        KEYWORDMODE = c0n7n2;
        C0N7N c0n7n3 = new C0N7N("DISABLEMODE", 2);
        DISABLEMODE = c0n7n3;
        C0N7N[] c0n7nArr = {c0n7n, c0n7n2, c0n7n3};
        LL = c0n7nArr;
        LLILLJJLI = new C2254308sP(c0n7nArr);
    }

    public static C0N7N[] values() {
        return (C0N7N[]) LL.clone();
    }

    public static C0N7N valueOf(String str) {
        return (C0N7N) C08FF.LIZ(C0N7N.class, str);
    }

    public C0N7N(String str, int i) {
    }
}
