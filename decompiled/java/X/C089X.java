package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.089X, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C089X {
    public static final C089X IMAGE;
    public static final C089X INFO;
    public static final /* synthetic */ C089X[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C089X> getEntries() {
        return LLILLJJLI;
    }

    static {
        C089X c089x = new C089X("INFO", 0);
        INFO = c089x;
        C089X c089x2 = new C089X("IMAGE", 1);
        IMAGE = c089x2;
        C089X[] c089xArr = {c089x, c089x2};
        LL = c089xArr;
        LLILLJJLI = new C2254308sP(c089xArr);
    }

    public static C089X[] values() {
        return (C089X[]) LL.clone();
    }

    public static C089X valueOf(String str) {
        return (C089X) C08FF.LIZ(C089X.class, str);
    }

    public C089X(String str, int i) {
    }
}
