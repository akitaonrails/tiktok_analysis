package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZPD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPD {
    public static final C0ZPD DOUBLE_TAP;
    public static final /* synthetic */ C0ZPD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZPD LONG_PRESS;
    public static final C0ZPD SINGLE_TAP;
    public static final C0ZPD SWIPE;

    public static InterfaceC2044707zh<C0ZPD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZPD c0zpd = new C0ZPD("SINGLE_TAP", 0);
        SINGLE_TAP = c0zpd;
        C0ZPD c0zpd2 = new C0ZPD("DOUBLE_TAP", 1);
        DOUBLE_TAP = c0zpd2;
        C0ZPD c0zpd3 = new C0ZPD("LONG_PRESS", 2);
        LONG_PRESS = c0zpd3;
        C0ZPD c0zpd4 = new C0ZPD("SWIPE", 3);
        SWIPE = c0zpd4;
        C0ZPD[] c0zpdArr = {c0zpd, c0zpd2, c0zpd3, c0zpd4};
        LL = c0zpdArr;
        LLILLJJLI = new C2254308sP(c0zpdArr);
    }

    public static C0ZPD[] values() {
        return (C0ZPD[]) LL.clone();
    }

    public static C0ZPD valueOf(String str) {
        return (C0ZPD) C08FF.LIZ(C0ZPD.class, str);
    }

    public C0ZPD(String str, int i) {
    }
}
