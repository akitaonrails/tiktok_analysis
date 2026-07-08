package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03GL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03GL {
    public static final C03GL INSERT_BANNER;
    public static final /* synthetic */ C03GL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03GL PRODUCT_WRAPPER;
    public static final C03GL TOP_BANNER;
    public final int LL;

    public static InterfaceC2044707zh<C03GL> getEntries() {
        return LLILLL;
    }

    static {
        C03GL c03gl = new C03GL("INSERT_BANNER", 0, 1);
        INSERT_BANNER = c03gl;
        C03GL c03gl2 = new C03GL("TOP_BANNER", 1, 2);
        TOP_BANNER = c03gl2;
        C03GL c03gl3 = new C03GL("PRODUCT_WRAPPER", 2, 3);
        PRODUCT_WRAPPER = c03gl3;
        C03GL[] c03glArr = {c03gl, c03gl2, c03gl3};
        LLILLJJLI = c03glArr;
        LLILLL = new C2254308sP(c03glArr);
    }

    public static C03GL[] values() {
        return (C03GL[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03GL valueOf(String str) {
        return (C03GL) C08FF.LIZ(C03GL.class, str);
    }

    public C03GL(String str, int i, int i2) {
        this.LL = i2;
    }
}
