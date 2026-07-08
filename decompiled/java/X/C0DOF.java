package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOF, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOF {
    public static final C0DOF CLICK_BACK;
    public static final C0DOF CLICK_REMOVE;
    public static final C0DOF CLICK_YEAR;
    public static final /* synthetic */ C0DOF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DOF SHOW;
    public final String LL;

    public static InterfaceC2044707zh<C0DOF> getEntries() {
        return LLILLL;
    }

    static {
        C0DOF c0dof = new C0DOF("SHOW", 0, "show");
        SHOW = c0dof;
        C0DOF c0dof2 = new C0DOF("CLICK_BACK", 1, "click_back");
        CLICK_BACK = c0dof2;
        C0DOF c0dof3 = new C0DOF("CLICK_REMOVE", 2, "click_remove_all");
        CLICK_REMOVE = c0dof3;
        C0DOF c0dof4 = new C0DOF("CLICK_YEAR", 3, "click_year");
        CLICK_YEAR = c0dof4;
        C0DOF[] c0dofArr = {c0dof, c0dof2, c0dof3, c0dof4};
        LLILLJJLI = c0dofArr;
        LLILLL = new C2254308sP(c0dofArr);
    }

    public static C0DOF[] values() {
        return (C0DOF[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DOF valueOf(String str) {
        return (C0DOF) C08FF.LIZ(C0DOF.class, str);
    }

    public C0DOF(String str, int i, String str2) {
        this.LL = str2;
    }
}
