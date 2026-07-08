package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I4N, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I4N {
    public static final C0I4N BLUR;
    public static final /* synthetic */ C0I4N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I4N MOSAIC;
    public static final C0I4N NONE;

    public static InterfaceC2044707zh<C0I4N> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I4N c0i4n = new C0I4N("NONE", 0);
        NONE = c0i4n;
        C0I4N c0i4n2 = new C0I4N("MOSAIC", 1);
        MOSAIC = c0i4n2;
        C0I4N c0i4n3 = new C0I4N("BLUR", 2);
        BLUR = c0i4n3;
        C0I4N[] c0i4nArr = {c0i4n, c0i4n2, c0i4n3};
        LL = c0i4nArr;
        LLILLJJLI = new C2254308sP(c0i4nArr);
    }

    public static C0I4N[] values() {
        return (C0I4N[]) LL.clone();
    }

    public static C0I4N valueOf(String str) {
        return (C0I4N) C08FF.LIZ(C0I4N.class, str);
    }

    public C0I4N(String str, int i) {
    }
}
