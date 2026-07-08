package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M1D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M1D {
    public static final C0M1D DRAFT_LIST_DELETE;
    public static final /* synthetic */ C0M1D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0M1D MANAGE_SHEET_DELETE;
    public static final C0M1D MANAGE_SHEET_POST;

    public static InterfaceC2044707zh<C0M1D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0M1D c0m1d = new C0M1D("MANAGE_SHEET_DELETE", 0);
        MANAGE_SHEET_DELETE = c0m1d;
        C0M1D c0m1d2 = new C0M1D("MANAGE_SHEET_POST", 1);
        MANAGE_SHEET_POST = c0m1d2;
        C0M1D c0m1d3 = new C0M1D("DRAFT_LIST_DELETE", 2);
        DRAFT_LIST_DELETE = c0m1d3;
        C0M1D[] c0m1dArr = {c0m1d, c0m1d2, c0m1d3};
        LL = c0m1dArr;
        LLILLJJLI = new C2254308sP(c0m1dArr);
    }

    public static C0M1D[] values() {
        return (C0M1D[]) LL.clone();
    }

    public static C0M1D valueOf(String str) {
        return (C0M1D) C08FF.LIZ(C0M1D.class, str);
    }

    public C0M1D(String str, int i) {
    }
}
