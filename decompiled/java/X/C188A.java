package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.188A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C188A {
    public static final /* synthetic */ C188A[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C188A PRODUCT_AVAILABLE;
    public static final C188A PRODUCT_NOT_AVAILABLE;
    public final String LL;

    public static InterfaceC2044707zh<C188A> getEntries() {
        return LLILLL;
    }

    static {
        C188A c188a = new C188A("PRODUCT_AVAILABLE", 0, "product_available");
        PRODUCT_AVAILABLE = c188a;
        C188A c188a2 = new C188A("PRODUCT_NOT_AVAILABLE", 1, "product_not_available");
        PRODUCT_NOT_AVAILABLE = c188a2;
        C188A[] c188aArr = {c188a, c188a2};
        LLILLJJLI = c188aArr;
        LLILLL = new C2254308sP(c188aArr);
    }

    public static C188A[] values() {
        return (C188A[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C188A valueOf(String str) {
        return (C188A) C08FF.LIZ(C188A.class, str);
    }

    public C188A(String str, int i, String str2) {
        this.LL = str2;
    }
}
