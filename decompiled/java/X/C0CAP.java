package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CAP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAP {
    public static final C0CAP FLAG_SCROLL_DOWN;
    public static final C0CAP FLAG_SCROLL_UP;
    public static final C0CAP FLAG_UNKNOWN;
    public static final /* synthetic */ C0CAP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0CAP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0CAP c0cap = new C0CAP("FLAG_UNKNOWN", 0);
        FLAG_UNKNOWN = c0cap;
        C0CAP c0cap2 = new C0CAP("FLAG_SCROLL_DOWN", 1);
        FLAG_SCROLL_DOWN = c0cap2;
        C0CAP c0cap3 = new C0CAP("FLAG_SCROLL_UP", 2);
        FLAG_SCROLL_UP = c0cap3;
        C0CAP[] c0capArr = {c0cap, c0cap2, c0cap3};
        LL = c0capArr;
        LLILLJJLI = new C2254308sP(c0capArr);
    }

    public static C0CAP[] values() {
        return (C0CAP[]) LL.clone();
    }

    public static C0CAP valueOf(String str) {
        return (C0CAP) C08FF.LIZ(C0CAP.class, str);
    }

    public C0CAP(String str, int i) {
    }
}
