package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GJ {
    public static final C00GJ ABOVE_NORMAL;
    public static final C00GJ HIGH;
    public static final /* synthetic */ C00GJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00GJ LOW;
    public static final C00GJ NORMAL;
    public final Integer LL;

    public static InterfaceC2044707zh<C00GJ> getEntries() {
        return LLILLL;
    }

    static {
        C00GJ c00gj = new C00GJ("LOW", 0, 10);
        LOW = c00gj;
        C00GJ c00gj2 = new C00GJ("NORMAL", 1, null);
        NORMAL = c00gj2;
        C00GJ c00gj3 = new C00GJ("ABOVE_NORMAL", 2, -1);
        ABOVE_NORMAL = c00gj3;
        C00GJ c00gj4 = new C00GJ("HIGH", 3, -4);
        HIGH = c00gj4;
        C00GJ[] c00gjArr = {c00gj, c00gj2, c00gj3, c00gj4};
        LLILLJJLI = c00gjArr;
        LLILLL = new C2254308sP(c00gjArr);
    }

    public static C00GJ[] values() {
        return (C00GJ[]) LLILLJJLI.clone();
    }

    public final Integer getLinuxPriority() {
        return this.LL;
    }

    public static C00GJ valueOf(String str) {
        return (C00GJ) C08FF.LIZ(C00GJ.class, str);
    }

    public C00GJ(String str, int i, Integer num) {
        this.LL = num;
    }
}
