package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03K4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03K4 {
    public static final C03K4 BONUS;
    public static final C03K4 DISCOUNT;
    public static final /* synthetic */ C03K4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C03K4> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03K4 c03k4 = new C03K4("DISCOUNT", 0);
        DISCOUNT = c03k4;
        C03K4 c03k42 = new C03K4("BONUS", 1);
        BONUS = c03k42;
        C03K4[] c03k4Arr = {c03k4, c03k42};
        LL = c03k4Arr;
        LLILLJJLI = new C2254308sP(c03k4Arr);
    }

    public static C03K4[] values() {
        return (C03K4[]) LL.clone();
    }

    public static C03K4 valueOf(String str) {
        return (C03K4) C08FF.LIZ(C03K4.class, str);
    }

    public C03K4(String str, int i) {
    }
}
