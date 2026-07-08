package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D7D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7D {
    public static final C0D7D COMPLETE_CHECKOUT;
    public static final C0D7D CREATE_CHECKOUT;
    public static final C0D7D DOWNGRADE_CHECKOUT;
    public static final /* synthetic */ C0D7D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D7D UPDATE_CHECKOUT;

    public static InterfaceC2044707zh<C0D7D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D7D c0d7d = new C0D7D("CREATE_CHECKOUT", 0);
        CREATE_CHECKOUT = c0d7d;
        C0D7D c0d7d2 = new C0D7D("UPDATE_CHECKOUT", 1);
        UPDATE_CHECKOUT = c0d7d2;
        C0D7D c0d7d3 = new C0D7D("COMPLETE_CHECKOUT", 2);
        COMPLETE_CHECKOUT = c0d7d3;
        C0D7D c0d7d4 = new C0D7D("DOWNGRADE_CHECKOUT", 3);
        DOWNGRADE_CHECKOUT = c0d7d4;
        C0D7D[] c0d7dArr = {c0d7d, c0d7d2, c0d7d3, c0d7d4};
        LL = c0d7dArr;
        LLILLJJLI = new C2254308sP(c0d7dArr);
    }

    public static C0D7D[] values() {
        return (C0D7D[]) LL.clone();
    }

    public static C0D7D valueOf(String str) {
        return (C0D7D) C08FF.LIZ(C0D7D.class, str);
    }

    public C0D7D(String str, int i) {
    }
}
