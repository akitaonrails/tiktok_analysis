package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WTP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WTP {
    public static final C0WTP BACKGROUND;
    public static final C0WTP HIGH;
    public static final /* synthetic */ C0WTP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0WTP LOW;
    public static final C0WTP NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<C0WTP> getEntries() {
        return LLILLL;
    }

    static {
        C0WTP c0wtp = new C0WTP("HIGH", 0, 0);
        HIGH = c0wtp;
        C0WTP c0wtp2 = new C0WTP("NORMAL", 1, 1);
        NORMAL = c0wtp2;
        C0WTP c0wtp3 = new C0WTP("LOW", 2, 2);
        LOW = c0wtp3;
        C0WTP c0wtp4 = new C0WTP("BACKGROUND", 3, 3);
        BACKGROUND = c0wtp4;
        C0WTP[] c0wtpArr = {c0wtp, c0wtp2, c0wtp3, c0wtp4};
        LLILLJJLI = c0wtpArr;
        LLILLL = new C2254308sP(c0wtpArr);
    }

    public static C0WTP[] values() {
        return (C0WTP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0WTP valueOf(String str) {
        return (C0WTP) C08FF.LIZ(C0WTP.class, str);
    }

    public C0WTP(String str, int i, int i2) {
        this.LL = i2;
    }
}
