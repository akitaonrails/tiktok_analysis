package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I8A {
    public static final C0I8A CIRCLE;
    public static final /* synthetic */ C0I8A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I8A ROUNDED_CORNER;

    public static InterfaceC2044707zh<C0I8A> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I8A c0i8a = new C0I8A("ROUNDED_CORNER", 0);
        ROUNDED_CORNER = c0i8a;
        C0I8A c0i8a2 = new C0I8A("CIRCLE", 1);
        CIRCLE = c0i8a2;
        C0I8A[] c0i8aArr = {c0i8a, c0i8a2};
        LL = c0i8aArr;
        LLILLJJLI = new C2254308sP(c0i8aArr);
    }

    public static C0I8A[] values() {
        return (C0I8A[]) LL.clone();
    }

    public static C0I8A valueOf(String str) {
        return (C0I8A) C08FF.LIZ(C0I8A.class, str);
    }

    public C0I8A(String str, int i) {
    }
}
