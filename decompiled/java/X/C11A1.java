package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11A1, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11A1 {
    public static final C11A1 Indeterminate;
    public static final /* synthetic */ C11A1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C11A1 Off;
    public static final C11A1 On;

    public static InterfaceC2044707zh<C11A1> getEntries() {
        return LLILLJJLI;
    }

    public static C11A1 valueOf(String str) {
        return (C11A1) C08FF.LIZ(C11A1.class, str);
    }

    public static C11A1[] values() {
        return (C11A1[]) LL.clone();
    }

    static {
        C11A1 c11a1 = new C11A1("On", 0);
        On = c11a1;
        C11A1 c11a12 = new C11A1("Off", 1);
        Off = c11a12;
        C11A1 c11a13 = new C11A1("Indeterminate", 2);
        Indeterminate = c11a13;
        C11A1[] c11a1Arr = {c11a1, c11a12, c11a13};
        LL = c11a1Arr;
        LLILLJJLI = new C2254308sP(c11a1Arr);
    }

    public C11A1(String str, int i) {
    }
}
