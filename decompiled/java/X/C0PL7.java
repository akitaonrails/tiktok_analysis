package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PL7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL7 {
    public static final C0PL7 INFLOW;
    public static final /* synthetic */ C0PL7[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PL7 OUTFLOW;

    public static InterfaceC2044707zh<C0PL7> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PL7 c0pl7 = new C0PL7("INFLOW", 0);
        INFLOW = c0pl7;
        C0PL7 c0pl72 = new C0PL7("OUTFLOW", 1);
        OUTFLOW = c0pl72;
        C0PL7[] c0pl7Arr = {c0pl7, c0pl72};
        LL = c0pl7Arr;
        LLILLJJLI = new C2254308sP(c0pl7Arr);
    }

    public static C0PL7[] values() {
        return (C0PL7[]) LL.clone();
    }

    public static C0PL7 valueOf(String str) {
        return (C0PL7) C08FF.LIZ(C0PL7.class, str);
    }

    public C0PL7(String str, int i) {
    }
}
