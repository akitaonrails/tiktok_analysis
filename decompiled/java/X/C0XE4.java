package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XE4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XE4 {
    public static final C0XE5 Companion;
    public static final C0XE4 L0;
    public static final C0XE4 L1;
    public static final C0XE4 L2;
    public static final C0XE4 L3;
    public static final /* synthetic */ C0XE4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0XE4> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0XE5] */
    static {
        C0XE4 c0xe4 = new C0XE4("L0", 0, "L0");
        L0 = c0xe4;
        C0XE4 c0xe42 = new C0XE4("L1", 1, "L1");
        L1 = c0xe42;
        C0XE4 c0xe43 = new C0XE4("L2", 2, "L2");
        L2 = c0xe43;
        C0XE4 c0xe44 = new C0XE4("L3", 3, "L3");
        L3 = c0xe44;
        C0XE4[] c0xe4Arr = {c0xe4, c0xe42, c0xe43, c0xe44};
        LLILLJJLI = c0xe4Arr;
        LLILLL = new C2254308sP(c0xe4Arr);
        Companion = new Object() { // from class: X.0XE5
        };
    }

    public static C0XE4[] values() {
        return (C0XE4[]) LLILLJJLI.clone();
    }

    public final String getLevel() {
        return this.LL;
    }

    public static C0XE4 valueOf(String str) {
        return (C0XE4) C08FF.LIZ(C0XE4.class, str);
    }

    public C0XE4(String str, int i, String str2) {
        this.LL = str2;
    }
}
