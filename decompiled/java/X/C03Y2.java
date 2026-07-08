package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Y2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03Y2 {
    public static final /* synthetic */ C03Y2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03Y2 PARAM_ERROR;
    public static final C03Y2 PAY_ERROR;
    public static final C03Y2 REQUIRES_USER_INPUT;
    public static final C03Y2 SUCCESS;
    public static final C03Y2 USER_CANCEL;

    public static InterfaceC2044707zh<C03Y2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03Y2 c03y2 = new C03Y2("SUCCESS", 0);
        SUCCESS = c03y2;
        C03Y2 c03y22 = new C03Y2("USER_CANCEL", 1);
        USER_CANCEL = c03y22;
        C03Y2 c03y23 = new C03Y2("PARAM_ERROR", 2);
        PARAM_ERROR = c03y23;
        C03Y2 c03y24 = new C03Y2("PAY_ERROR", 3);
        PAY_ERROR = c03y24;
        C03Y2 c03y25 = new C03Y2("REQUIRES_USER_INPUT", 4);
        REQUIRES_USER_INPUT = c03y25;
        C03Y2[] c03y2Arr = {c03y2, c03y22, c03y23, c03y24, c03y25};
        LL = c03y2Arr;
        LLILLJJLI = new C2254308sP(c03y2Arr);
    }

    public static C03Y2[] values() {
        return (C03Y2[]) LL.clone();
    }

    public static C03Y2 valueOf(String str) {
        return (C03Y2) C08FF.LIZ(C03Y2.class, str);
    }

    public C03Y2(String str, int i) {
    }
}
