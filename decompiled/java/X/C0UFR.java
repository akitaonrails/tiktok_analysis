package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UFR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFR {
    public static final C0UFR FULL_SCREEN;
    public static final C0UFR HORIZONTAL;
    public static final /* synthetic */ C0UFR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UFR NONE;
    public static final C0UFR VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<C0UFR> getEntries() {
        return LLILLL;
    }

    static {
        C0UFR c0ufr = new C0UFR("NONE", 0, 0);
        NONE = c0ufr;
        C0UFR c0ufr2 = new C0UFR("FULL_SCREEN", 1, 1);
        FULL_SCREEN = c0ufr2;
        C0UFR c0ufr3 = new C0UFR("HORIZONTAL", 2, 2);
        HORIZONTAL = c0ufr3;
        C0UFR c0ufr4 = new C0UFR("VERTICAL", 3, 3);
        VERTICAL = c0ufr4;
        C0UFR[] c0ufrArr = {c0ufr, c0ufr2, c0ufr3, c0ufr4};
        LLILLJJLI = c0ufrArr;
        LLILLL = new C2254308sP(c0ufrArr);
    }

    public static C0UFR[] values() {
        return (C0UFR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0UFR valueOf(String str) {
        return (C0UFR) C08FF.LIZ(C0UFR.class, str);
    }

    public C0UFR(String str, int i, int i2) {
        this.LL = i2;
    }
}
