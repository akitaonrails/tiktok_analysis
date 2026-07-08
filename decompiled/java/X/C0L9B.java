package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9B, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9B {
    public static final C0L9B CC;
    public static final /* synthetic */ C0L9B[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9B TT;
    public static final C0L9B UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0L9B> getEntries() {
        return LLILLL;
    }

    static {
        C0L9B c0l9b = new C0L9B("TT", 0, 1);
        TT = c0l9b;
        C0L9B c0l9b2 = new C0L9B("CC", 1, 2);
        CC = c0l9b2;
        C0L9B c0l9b3 = new C0L9B("UNKNOWN", 2, -1);
        UNKNOWN = c0l9b3;
        C0L9B[] c0l9bArr = {c0l9b, c0l9b2, c0l9b3};
        LLILLJJLI = c0l9bArr;
        LLILLL = new C2254308sP(c0l9bArr);
    }

    public static C0L9B[] values() {
        return (C0L9B[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0L9B valueOf(String str) {
        return (C0L9B) C08FF.LIZ(C0L9B.class, str);
    }

    public C0L9B(String str, int i, int i2) {
        this.LL = i2;
    }
}
