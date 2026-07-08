package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03DB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DB {
    public static final C03DB FROM_DOUBLE_PAYMENT;
    public static final C03DB FROM_OSP;
    public static final /* synthetic */ C03DB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C03DB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03DB c03db = new C03DB("FROM_OSP", 0);
        FROM_OSP = c03db;
        C03DB c03db2 = new C03DB("FROM_DOUBLE_PAYMENT", 1);
        FROM_DOUBLE_PAYMENT = c03db2;
        C03DB[] c03dbArr = {c03db, c03db2};
        LL = c03dbArr;
        LLILLJJLI = new C2254308sP(c03dbArr);
    }

    public static C03DB[] values() {
        return (C03DB[]) LL.clone();
    }

    public static C03DB valueOf(String str) {
        return (C03DB) C08FF.LIZ(C03DB.class, str);
    }

    public C03DB(String str, int i) {
    }
}
