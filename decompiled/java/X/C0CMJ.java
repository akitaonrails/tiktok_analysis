package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CMJ {
    public static final C0CMJ HIGH_PRIORITY;
    public static final /* synthetic */ C0CMJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0CMJ NORMAL_PRIORITY;
    public static final C0CMJ TOP_PRIORITY;
    public final int LL;

    public static InterfaceC2044707zh<C0CMJ> getEntries() {
        return LLILLL;
    }

    static {
        C0CMJ c0cmj = new C0CMJ("TOP_PRIORITY", 0, 3);
        TOP_PRIORITY = c0cmj;
        C0CMJ c0cmj2 = new C0CMJ("HIGH_PRIORITY", 1, 2);
        HIGH_PRIORITY = c0cmj2;
        C0CMJ c0cmj3 = new C0CMJ("NORMAL_PRIORITY", 2, 1);
        NORMAL_PRIORITY = c0cmj3;
        C0CMJ[] c0cmjArr = {c0cmj, c0cmj2, c0cmj3};
        LLILLJJLI = c0cmjArr;
        LLILLL = new C2254308sP(c0cmjArr);
    }

    public static C0CMJ[] values() {
        return (C0CMJ[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0CMJ valueOf(String str) {
        return (C0CMJ) C08FF.LIZ(C0CMJ.class, str);
    }

    public C0CMJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
