package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N18, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N18 {
    public static final C0N18 BACKGROUND;
    public static final C0N18 EXHAUSTED;
    public static final C0N18 FOREGROUND;
    public static final /* synthetic */ C0N18[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0N18> getEntries() {
        return LLILLL;
    }

    static {
        C0N18 c0n18 = new C0N18("BACKGROUND", 0, 1);
        BACKGROUND = c0n18;
        C0N18 c0n182 = new C0N18("FOREGROUND", 1, 2);
        FOREGROUND = c0n182;
        C0N18 c0n183 = new C0N18("EXHAUSTED", 2, 4);
        EXHAUSTED = c0n183;
        C0N18[] c0n18Arr = {c0n18, c0n182, c0n183};
        LLILLJJLI = c0n18Arr;
        LLILLL = new C2254308sP(c0n18Arr);
    }

    public static C0N18[] values() {
        return (C0N18[]) LLILLJJLI.clone();
    }

    public int getType() {
        return this.LL;
    }

    public static C0N18 valueOf(String str) {
        return (C0N18) C08FF.LIZ(C0N18.class, str);
    }

    public C0N18(String str, int i, int i2) {
        this.LL = i2;
    }
}
