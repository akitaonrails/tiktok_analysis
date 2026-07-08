package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6E {
    public static final C0N6E LIVE;
    public static final /* synthetic */ C0N6E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N6E NO;
    public final int LL;

    public static InterfaceC2044707zh<C0N6E> getEntries() {
        return LLILLL;
    }

    static {
        C0N6E c0n6e = new C0N6E("NO", 0, 0);
        NO = c0n6e;
        C0N6E c0n6e2 = new C0N6E("LIVE", 1, 1);
        LIVE = c0n6e2;
        C0N6E[] c0n6eArr = {c0n6e, c0n6e2};
        LLILLJJLI = c0n6eArr;
        LLILLL = new C2254308sP(c0n6eArr);
    }

    public static C0N6E[] values() {
        return (C0N6E[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N6E valueOf(String str) {
        return (C0N6E) C08FF.LIZ(C0N6E.class, str);
    }

    public C0N6E(String str, int i, int i2) {
        this.LL = i2;
    }
}
