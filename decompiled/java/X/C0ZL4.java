package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZL4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZL4 {
    public static final C0ZL4 DISABLED;
    public static final C0ZL4 FULL;
    public static final C0ZL4 LIMITED;
    public static final /* synthetic */ C0ZL4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ZL4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZL4 c0zl4 = new C0ZL4("FULL", 0);
        FULL = c0zl4;
        C0ZL4 c0zl42 = new C0ZL4("LIMITED", 1);
        LIMITED = c0zl42;
        C0ZL4 c0zl43 = new C0ZL4("DISABLED", 2);
        DISABLED = c0zl43;
        C0ZL4[] c0zl4Arr = {c0zl4, c0zl42, c0zl43};
        LL = c0zl4Arr;
        LLILLJJLI = new C2254308sP(c0zl4Arr);
    }

    public static C0ZL4[] values() {
        return (C0ZL4[]) LL.clone();
    }

    public static C0ZL4 valueOf(String str) {
        return (C0ZL4) C08FF.LIZ(C0ZL4.class, str);
    }

    public C0ZL4(String str, int i) {
    }
}
