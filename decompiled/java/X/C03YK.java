package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03YK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YK {
    public static final C03YK CREDIT;
    public static final /* synthetic */ C03YK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03YK PAYMENT_METHODS;
    public static final C03YK STORED_METHODS;

    public static InterfaceC2044707zh<C03YK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03YK c03yk = new C03YK("CREDIT", 0);
        CREDIT = c03yk;
        C03YK c03yk2 = new C03YK("STORED_METHODS", 1);
        STORED_METHODS = c03yk2;
        C03YK c03yk3 = new C03YK("PAYMENT_METHODS", 2);
        PAYMENT_METHODS = c03yk3;
        C03YK[] c03ykArr = {c03yk, c03yk2, c03yk3};
        LL = c03ykArr;
        LLILLJJLI = new C2254308sP(c03ykArr);
    }

    public static C03YK[] values() {
        return (C03YK[]) LL.clone();
    }

    public static C03YK valueOf(String str) {
        return (C03YK) C08FF.LIZ(C03YK.class, str);
    }

    public C03YK(String str, int i) {
    }
}
