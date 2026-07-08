package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PL5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PL5 {
    public static final C0PL5 INFLOW;
    public static final /* synthetic */ C0PL5[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PL5 OUTFLOW;

    public static InterfaceC2044707zh<C0PL5> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PL5 c0pl5 = new C0PL5("INFLOW", 0);
        INFLOW = c0pl5;
        C0PL5 c0pl52 = new C0PL5("OUTFLOW", 1);
        OUTFLOW = c0pl52;
        C0PL5[] c0pl5Arr = {c0pl5, c0pl52};
        LL = c0pl5Arr;
        LLILLJJLI = new C2254308sP(c0pl5Arr);
    }

    public static C0PL5[] values() {
        return (C0PL5[]) LL.clone();
    }

    public static C0PL5 valueOf(String str) {
        return (C0PL5) C08FF.LIZ(C0PL5.class, str);
    }

    public C0PL5(String str, int i) {
    }
}
