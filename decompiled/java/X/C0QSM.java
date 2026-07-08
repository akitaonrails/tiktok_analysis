package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QSM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QSM {
    public static final C0QSM FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION;
    public static final C0QSM GO_TO_GENERAL_SEARCH;
    public static final C0QSM GO_TO_MALL_SEARCH;
    public static final /* synthetic */ C0QSM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QSM NOT_FROM_MALL_UG_OR_REVERT;

    public static InterfaceC2044707zh<C0QSM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QSM c0qsm = new C0QSM("NOT_FROM_MALL_UG_OR_REVERT", 0);
        NOT_FROM_MALL_UG_OR_REVERT = c0qsm;
        C0QSM c0qsm2 = new C0QSM("FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION", 1);
        FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION = c0qsm2;
        C0QSM c0qsm3 = new C0QSM("GO_TO_GENERAL_SEARCH", 2);
        GO_TO_GENERAL_SEARCH = c0qsm3;
        C0QSM c0qsm4 = new C0QSM("GO_TO_MALL_SEARCH", 3);
        GO_TO_MALL_SEARCH = c0qsm4;
        C0QSM[] c0qsmArr = {c0qsm, c0qsm2, c0qsm3, c0qsm4};
        LL = c0qsmArr;
        LLILLJJLI = new C2254308sP(c0qsmArr);
    }

    public static C0QSM[] values() {
        return (C0QSM[]) LL.clone();
    }

    public static C0QSM valueOf(String str) {
        return (C0QSM) C08FF.LIZ(C0QSM.class, str);
    }

    public C0QSM(String str, int i) {
    }
}
