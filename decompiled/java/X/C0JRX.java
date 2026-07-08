package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JRX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRX {
    public static final /* synthetic */ C0JRX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0JRX LOAD_MORE;
    public static final C0JRX OPTION_START;
    public static final C0JRX OPTION_VOTE;
    public final int LL;

    public static InterfaceC2044707zh<C0JRX> getEntries() {
        return LLILLL;
    }

    static {
        C0JRX c0jrx = new C0JRX("OPTION_START", 0, 1);
        OPTION_START = c0jrx;
        C0JRX c0jrx2 = new C0JRX("OPTION_VOTE", 1, 2);
        OPTION_VOTE = c0jrx2;
        C0JRX c0jrx3 = new C0JRX("LOAD_MORE", 2, 3);
        LOAD_MORE = c0jrx3;
        C0JRX[] c0jrxArr = {c0jrx, c0jrx2, c0jrx3};
        LLILLJJLI = c0jrxArr;
        LLILLL = new C2254308sP(c0jrxArr);
    }

    public static C0JRX[] values() {
        return (C0JRX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0JRX valueOf(String str) {
        return (C0JRX) C08FF.LIZ(C0JRX.class, str);
    }

    public C0JRX(String str, int i, int i2) {
        this.LL = i2;
    }
}
