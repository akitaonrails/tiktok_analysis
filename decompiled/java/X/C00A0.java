package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00A0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A0 {
    public static final C00A0 AVERAGE_DIVIDE;
    public static final /* synthetic */ C00A0[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00A0 SELF_WIDTH;

    public static InterfaceC2044707zh<C00A0> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00A0 c00a0 = new C00A0("AVERAGE_DIVIDE", 0);
        AVERAGE_DIVIDE = c00a0;
        C00A0 c00a02 = new C00A0("SELF_WIDTH", 1);
        SELF_WIDTH = c00a02;
        C00A0[] c00a0Arr = {c00a0, c00a02};
        LL = c00a0Arr;
        LLILLJJLI = new C2254308sP(c00a0Arr);
    }

    public static C00A0[] values() {
        return (C00A0[]) LL.clone();
    }

    public static C00A0 valueOf(String str) {
        return (C00A0) C08FF.LIZ(C00A0.class, str);
    }

    public C00A0(String str, int i) {
    }
}
