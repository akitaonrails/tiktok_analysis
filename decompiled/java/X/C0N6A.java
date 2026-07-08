package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6A, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6A {
    public static final /* synthetic */ C0N6A[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6A NO;
    public static final C0N6A YES;
    public final int LL;

    public static InterfaceC2044707zh<C0N6A> getEntries() {
        return LLILLL;
    }

    static {
        C0N6A c0n6a = new C0N6A("NO", 0, 0);
        NO = c0n6a;
        C0N6A c0n6a2 = new C0N6A("YES", 1, 1);
        YES = c0n6a2;
        C0N6A[] c0n6aArr = {c0n6a, c0n6a2};
        LLILLJJLI = c0n6aArr;
        LLILLL = new C2254308sP(c0n6aArr);
    }

    public static C0N6A[] values() {
        return (C0N6A[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N6A valueOf(String str) {
        return (C0N6A) C08FF.LIZ(C0N6A.class, str);
    }

    public C0N6A(String str, int i, int i2) {
        this.LL = i2;
    }
}
