package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D4M, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4M {
    public static final /* synthetic */ C0D4M[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D4M PREFIX;
    public static final C0D4M SUFFIX;

    public static InterfaceC2044707zh<C0D4M> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D4M c0d4m = new C0D4M("PREFIX", 0);
        PREFIX = c0d4m;
        C0D4M c0d4m2 = new C0D4M("SUFFIX", 1);
        SUFFIX = c0d4m2;
        C0D4M[] c0d4mArr = {c0d4m, c0d4m2};
        LL = c0d4mArr;
        LLILLJJLI = new C2254308sP(c0d4mArr);
    }

    public static C0D4M[] values() {
        return (C0D4M[]) LL.clone();
    }

    public static C0D4M valueOf(String str) {
        return (C0D4M) C08FF.LIZ(C0D4M.class, str);
    }

    public C0D4M(String str, int i) {
    }
}
