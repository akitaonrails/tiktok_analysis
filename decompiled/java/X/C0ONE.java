package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ONE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ONE {
    public static final C0ONE CANCEL;
    public static final C0ONE CLICK;
    public static final /* synthetic */ C0ONE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ONE SHOW;
    public static final C0ONE UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0ONE> getEntries() {
        return LLILLL;
    }

    static {
        C0ONE c0one = new C0ONE("UNKNOWN", 0, 0);
        UNKNOWN = c0one;
        C0ONE c0one2 = new C0ONE("SHOW", 1, 1);
        SHOW = c0one2;
        C0ONE c0one3 = new C0ONE("CLICK", 2, 2);
        CLICK = c0one3;
        C0ONE c0one4 = new C0ONE("CANCEL", 3, 3);
        CANCEL = c0one4;
        C0ONE[] c0oneArr = {c0one, c0one2, c0one3, c0one4};
        LLILLJJLI = c0oneArr;
        LLILLL = new C2254308sP(c0oneArr);
    }

    public static C0ONE[] values() {
        return (C0ONE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0ONE valueOf(String str) {
        return (C0ONE) C08FF.LIZ(C0ONE.class, str);
    }

    public C0ONE(String str, int i, int i2) {
        this.LL = i2;
    }
}
